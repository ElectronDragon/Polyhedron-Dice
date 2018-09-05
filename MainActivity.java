package com.electricdragon.polyhedrondice;

import android.app.*;
import android.os.*;
import java.util.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

/* This app is a work in progress.

The idea is to create a menu of buttons that, when pressed, return a random number within a given range.
These ranges correlate to the polyhedron dice used in Dungeons & Dragons.

To do:

Implement all dice
Implement ability to roll multiple dice at once
Add default background
Add menu with other backgrounds and exit function

*/

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		//Button ID's for the interface
		Button twentySidedDice = (Button) findViewById(R.id.twentySidedDice);
		Button fourSidedDice = (Button) findViewById(R.id.fourSidedDice);
		Button sixSidedDice = (Button) findViewById(R.id.sixSidedDice);
		Button eightSidedDice = (Button) findViewById(R.id.eightSidedDice);
		Button tenSidedDice = (Button) findViewById(R.id.tenSidedDice);
		Button twelveSidedDice = (Button) findViewById(R.id.twelveSidedDice);
		Button hundredSidedDice = (Button) findViewById(R.id.hundredSidedDice);
		
		//Button ID's for the number of dice
		final Button twentySidedDiceNumber = (Button) findViewById(R.id.twentySidedDiceNumber);
		final Button fourSidedDiceNumber = (Button) findViewById(R.id.fourSidedDiceNumber);
		final Button sixSidedDiceNumber = (Button) findViewById(R.id.sixSidedDiceNumber);
		final Button eightSidedDiceNumber = (Button) findViewById(R.id.eightSidedDiceNumber);
		final Button tenSidedDiceNumber = (Button) findViewById(R.id.tenSidedDiceNumber);
		final Button twelveSidedDiceNumber = (Button) findViewById(R.id.twelveSidedDiceNumber);
		final Button hundredSidedDiceNumber = (Button) findViewById(R.id.hundredSidedDiceNumber);
		
		//TextField ID's for the interface
		final TextView twentySidedDiceRoll = (TextView) findViewById(R.id.twentySidedDiceRoll);
		final TextView fourSidedDiceRoll = (TextView) findViewById(R.id.fourSidedDiceRoll);
		final TextView sixSidedDiceRoll = (TextView) findViewById(R.id.sixSidedDiceRoll);
		final TextView eightSidedDiceRoll = (TextView) findViewById(R.id.eightSidedDiceRoll);
		final TextView tenSidedDiceRoll = (TextView) findViewById(R.id.tenSidedDiceRoll);
		final TextView twelveSidedDiceRoll = (TextView) findViewById(R.id.twelveSidedDiceRoll);
		final TextView hundredSidedDiceRoll = (TextView) findViewById(R.id.hundredSidedDiceRoll);
		
		//Settings for the different dice; note coding in java rather than xml to accomodate lower API platforms
		
		//D20 settings - TODO: change to array and add reset fuctionality
		
		twentySidedDice.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View v)
			{
				String result = String.valueOf(rollDice(20));
				twentySidedDiceRoll.setText(result);
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
		
	}
		
	public static int rollDice(int sides) 
	{
		Random dice = new Random();
		int diceRoll = dice.nextInt(sides) + 1;
		return diceRoll;
	}
	
	int numberTwentySidedDice = 1;
    
		
}
