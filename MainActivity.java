package com.electricdragon.polyhedrondice;

import android.app.*;
import android.os.*;
import java.util.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.text.*;

/* The idea behind this app is to create a menu of buttons that, 
when pressed, return a random number within a given range.
These ranges correlate to the polyhedron dice used in Dungeons & Dragons. */

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		// Button IDs for the interface
		Button twentySidedDice = (Button) findViewById(R.id.twentySidedDice);
		Button fourSidedDice = (Button) findViewById(R.id.fourSidedDice);
		Button sixSidedDice = (Button) findViewById(R.id.sixSidedDice);
		Button eightSidedDice = (Button) findViewById(R.id.eightSidedDice);
		Button tenSidedDice = (Button) findViewById(R.id.tenSidedDice);
		Button twelveSidedDice = (Button) findViewById(R.id.twelveSidedDice);
		Button hundredSidedDice = (Button) findViewById(R.id.hundredSidedDice);
		Button resetExit = (Button) findViewById(R.id.resetExit);

		// Button IDs for the number of dice
		final Button twentySidedDiceNumber = (Button) findViewById(R.id.twentySidedDiceNumber);
		final Button fourSidedDiceNumber = (Button) findViewById(R.id.fourSidedDiceNumber);
		final Button sixSidedDiceNumber = (Button) findViewById(R.id.sixSidedDiceNumber);
		final Button eightSidedDiceNumber = (Button) findViewById(R.id.eightSidedDiceNumber);
		final Button tenSidedDiceNumber = (Button) findViewById(R.id.tenSidedDiceNumber);
		final Button twelveSidedDiceNumber = (Button) findViewById(R.id.twelveSidedDiceNumber);
		final Button hundredSidedDiceNumber = (Button) findViewById(R.id.hundredSidedDiceNumber);

		// TextView IDs for the interface
		final TextView twentySidedDiceRoll = (TextView) findViewById(R.id.twentySidedDiceRoll);
		final TextView fourSidedDiceRoll = (TextView) findViewById(R.id.fourSidedDiceRoll);
		final TextView sixSidedDiceRoll = (TextView) findViewById(R.id.sixSidedDiceRoll);
		final TextView eightSidedDiceRoll = (TextView) findViewById(R.id.eightSidedDiceRoll);
		final TextView tenSidedDiceRoll = (TextView) findViewById(R.id.tenSidedDiceRoll);
		final TextView twelveSidedDiceRoll = (TextView) findViewById(R.id.twelveSidedDiceRoll);
		final TextView hundredSidedDiceRoll = (TextView) findViewById(R.id.hundredSidedDiceRoll);

		// Settings for the different dice; note coding in java rather than xml to accomodate lower API platforms

		// D20 settings
		twentySidedDice.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View v)
				{
					String result = TextUtils.join(", " , rollMultiDice(20, numberTwentySidedDice));
					twentySidedDiceRoll.setText(result);					
				}
			});

		twentySidedDice.setOnLongClickListener(new OnLongClickListener() 
			{
				@Override
				public boolean onLongClick(View v)
				{
					twentySidedDiceRoll.setText("");
					numberTwentySidedDice = 1;
					twentySidedDiceNumber.setText("1");
					return true;
				}
			});

		twentySidedDiceNumber.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{				
					if (numberTwentySidedDice >= 4) 
					{
						numberTwentySidedDice = 1;			
					}
					else
					{
						numberTwentySidedDice++;
					}
					String result = String.valueOf(numberTwentySidedDice);
					twentySidedDiceNumber.setText(result);
				}
			});

		// D4 settings
		fourSidedDice.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View v)
				{
					String result = TextUtils.join(", " , rollMultiDice(4, numberFourSidedDice));
					fourSidedDiceRoll.setText(result);					
				}
			});
			
		fourSidedDice.setOnLongClickListener(new OnLongClickListener() 
			{
				@Override
				public boolean onLongClick(View v)
				{
					fourSidedDiceRoll.setText("");
					numberFourSidedDice = 1;
					fourSidedDiceNumber.setText("1");
					return true;
				}
			});

		fourSidedDiceNumber.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{				
					if (numberFourSidedDice >= 4) 
					{
						numberFourSidedDice = 1;			
					}
					else
					{
						numberFourSidedDice++;
					}
					String result = String.valueOf(numberFourSidedDice);
					fourSidedDiceNumber.setText(result);
				}
			});

		// D6 settings
		sixSidedDice.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View v)
				{
					String result = TextUtils.join(", " , rollMultiDice(6, numberSixSidedDice));
					sixSidedDiceRoll.setText(result);					
				}
			});
			
		sixSidedDice.setOnLongClickListener(new OnLongClickListener() 
			{
				@Override
				public boolean onLongClick(View v)
				{
					sixSidedDiceRoll.setText("");
					numberSixSidedDice = 1;
					sixSidedDiceNumber.setText("1");
					return true;
				}
			});

		sixSidedDiceNumber.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{				
					if (numberSixSidedDice >= 4) 
					{
						numberSixSidedDice = 1;			
					}
					else
					{
						numberSixSidedDice++;
					}
					String result = String.valueOf(numberSixSidedDice);
					sixSidedDiceNumber.setText(result);
				}
			});

		// D8 settings
		eightSidedDice.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View v)
				{
					String result = TextUtils.join(", " , rollMultiDice(8, numberEightSidedDice));
					eightSidedDiceRoll.setText(result);					
				}
			});
			
		eightSidedDice.setOnLongClickListener(new OnLongClickListener() 
			{
				@Override
				public boolean onLongClick(View v)
				{
					eightSidedDiceRoll.setText("");
					numberEightSidedDice = 1;
					eightSidedDiceNumber.setText("1");
					return true;
				}
			});

		eightSidedDiceNumber.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{				
					if (numberEightSidedDice >= 4) 
					{
						numberEightSidedDice = 1;			
					}
					else
					{
						numberEightSidedDice++;
					}
					String result = String.valueOf(numberEightSidedDice);
					eightSidedDiceNumber.setText(result);
				}
			});

		// D10 settings
		tenSidedDice.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View v)
				{
					String result = TextUtils.join(", " , rollMultiDice(10, numberTenSidedDice));
					tenSidedDiceRoll.setText(result);					
				}
			});
			
		tenSidedDice.setOnLongClickListener(new OnLongClickListener() 
			{
				@Override
				public boolean onLongClick(View v)
				{
					tenSidedDiceRoll.setText("");
					numberTenSidedDice = 1;
					tenSidedDiceNumber.setText("1");
					return true;
				}
			});

		tenSidedDiceNumber.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{				
					if (numberTenSidedDice >= 4) 
					{
						numberTenSidedDice = 1;			
					}
					else
					{
						numberTenSidedDice++;
					}
					String result = String.valueOf(numberTenSidedDice);
					tenSidedDiceNumber.setText(result);
				}
			});

		// D12 settings
		twelveSidedDice.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View v)
				{
					String result = TextUtils.join(", " , rollMultiDice(12, numberTwelveSidedDice));
					twelveSidedDiceRoll.setText(result);					
				}
			});
			
		twelveSidedDice.setOnLongClickListener(new OnLongClickListener() 
			{
				@Override
				public boolean onLongClick(View v)
				{
					twelveSidedDiceRoll.setText("");
					numberTwelveSidedDice = 1;
					twelveSidedDiceNumber.setText("1");
					return true;
				}
			});

		twelveSidedDiceNumber.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{				
					if (numberTwelveSidedDice >= 4) 
					{
						numberTwelveSidedDice = 1;			
					}
					else
					{
						numberTwelveSidedDice++;
					}
					String result = String.valueOf(numberTwelveSidedDice);
					twelveSidedDiceNumber.setText(result);
				}
			});

		// D100 settings
		hundredSidedDice.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View v)
				{
					String result = TextUtils.join(", " , rollMultiDice(100, numberHundredSidedDice));
					hundredSidedDiceRoll.setText(result);					
				}
			});
			
		hundredSidedDice.setOnLongClickListener(new OnLongClickListener() 
			{
				@Override
				public boolean onLongClick(View v)
				{
					hundredSidedDiceRoll.setText("");
					numberHundredSidedDice = 1;
					hundredSidedDiceNumber.setText("1");
					return true;
				}
			});

		hundredSidedDiceNumber.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{				
					if (numberHundredSidedDice >= 4) 
					{
						numberHundredSidedDice = 1;			
					}
					else
					{
						numberHundredSidedDice++;
					}
					String result = String.valueOf(numberHundredSidedDice);
					hundredSidedDiceNumber.setText(result);
				}
			});
			
		// Exit button settings
		resetExit.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View v)
				{
					twentySidedDiceRoll.setText("");
					fourSidedDiceRoll.setText("");
					sixSidedDiceRoll.setText("");
					eightSidedDiceRoll.setText("");
					tenSidedDiceRoll.setText("");
					twelveSidedDiceRoll.setText("");
					hundredSidedDiceRoll.setText("");
					numberTwentySidedDice = 1;
					numberFourSidedDice = 1;
					numberSixSidedDice = 1;
					numberEightSidedDice = 1;
					numberTenSidedDice = 1;
					numberTwelveSidedDice = 1;
					numberHundredSidedDice = 1;
					twentySidedDiceNumber.setText("1");
					fourSidedDiceNumber.setText("1");
					sixSidedDiceNumber.setText("1");
					eightSidedDiceNumber.setText("1");
					tenSidedDiceNumber.setText("1");
					twelveSidedDiceNumber.setText("1");
					hundredSidedDiceNumber.setText("1");					
				}
			});
		
		resetExit.setOnLongClickListener(new OnLongClickListener() 
			{
				@Override
				public boolean onLongClick(View v)
				{
					finish();
					return true;
				}
			});
	}

	/* Legacy code for rolling a single dice
	 public static int rollDice(int sides) 
	 {
	 Random dice = new Random();
	 int diceRoll = dice.nextInt(sides) + 1;
	 return diceRoll;
	 } */

	//Code for rolling multiple dice
	public static List rollMultiDice(int sides, int numberDice)
	{
		ArrayList diceRolls = new ArrayList();
		Random dice = new Random();
		for (int i = 1; i <= numberDice; i++) 
		{
			diceRolls.add(dice.nextInt(sides) + 1);
		}
		return diceRolls;
	}

	int numberTwentySidedDice = 1;
	int numberFourSidedDice = 1;
	int numberSixSidedDice = 1;
	int numberEightSidedDice = 1;
	int numberTenSidedDice = 1;
	int numberTwelveSidedDice = 1;
	int numberHundredSidedDice = 1;

}
