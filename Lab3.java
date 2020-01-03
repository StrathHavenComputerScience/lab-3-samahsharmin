public class Lab3
{
    public static void testLightCandles1()
    {
        Robot.load("candles1.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testLightCandles2()
    {
        Robot.load("candles2.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void lightCandles()
    //before: facing east behind 10 unlit candles
    //after: facing east in front of 10 lit candles
    {
        //insert instructions below
        lightIfCandle();
        lightIfCandle();
        lightIfCandle();
        lightIfCandle();
        lightIfCandle();
        lightIfCandle();
        lightIfCandle();
        lightIfCandle();
        lightIfCandle();
        lightIfCandle();
    }

    public static void lightIfCandle()
    //before: standing behind an unlit candle
    //after: standing in front of a lit candle
    {if (isSingleCandleAhead())
        {
            lightSingleCandle();
        }
        else
        {
            lightDoubleCandle();
        }
    }

    public static void lightSingleCandle()
    //before: robot faces east, facing an unlit single block candle
    //after: robot stands next to a lit double candle, facing east
    {
        Robot.turnLeft();
        Robot.move();
        turnRight();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        turnRight();
        Robot.move();
        Robot.turnLeft();
    }

    public static void lightDoubleCandle()
    //before: robot faces east, facing an unlit double block candle
    //after: robot stands next to a lit double candle, facing east
    {
        Robot.turnLeft();
        Robot.move();
        Robot.move();
        turnRight();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        turnRight();
        Robot.move();
        Robot.move();
        Robot.turnLeft();
    }

    public static boolean isSingleCandleAhead()
    //before: Robot faces east in front of a candle
    //after: Robot faces east with knowledge if the candle is a double or a single
    {
        Robot.turnLeft();
        Robot.move();
        turnRight();
        if(Robot.frontIsClear())
        //this tests if it's a single candle
        { turnRight();
            Robot.move();
            Robot.turnLeft();
            return true;
        }
        else
        //this means it's a double candle
        { turnRight();
            Robot.move();
            Robot.turnLeft();
            return false;
        }
    }

    public static void turnRight()
    {
        //before: Robot facing any direction
        //after: Robot turned 90 degrees right
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();
    }   
    //Run this method to test completeRoom on map room1.txt
    public static void testCompleteRoom1()
    {
        Robot.load("room1.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    //Run this method to test completeRoom on map room2.txt
    public static void testCompleteRoom2()
    {
        Robot.load("room2.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    //Complete this method.  You will need to write additional helper methods.
    public static void completeRoom()
    //before: 
    //after:
    {
        //insert instructions below
        checkAndCompleteRow();
        checkAndCompleteRow();
        checkAndCompleteRow();
        checkAndCompleteRow();
        
    }
    public static void checkAndCompleteRoom()
    //before: robot standing parallel next to potential room 
    //after: robot standing parallel next to room, now complete
    {
         Robot.turnLeft();
        if(Robot.frontIsClear())
        {Robot.move();
            if(!Robot.onDark())
            {
                Robot.makeDark();
                turnAround();
                Robot.move();
                Robot.turnLeft();
    
            }
            else 
            {turnAround();
                Robot.move();
                Robot.turnLeft();
         
            }
        }
        else
        {
            turnRight();
            
        }
    }
    public static void checkAndCompleteRow()
    //before: robot standing at start of row of 5 rooms, parallel to the rooms
    //after: robot standing at the end of the row, having completed all the rooms, now parallel to the next row of rooms
    {
        checkAndCompleteRoom();
        Robot.move();
        checkAndCompleteRoom();
        Robot.move();
        checkAndCompleteRoom();
        Robot.move();
        checkAndCompleteRoom();
        Robot.move();
        checkAndCompleteRoom();
        turnRight();
    }
    //Run this method to test swapAll on map swap1.txt
    public static void testSwapAll1()
    {
        Robot.load("swap1.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll2()
    {
        Robot.load("swap2.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Complete this method.  You will need to write additional helper methods.
    public static void swapAll()
    {
        //insert instructions below
        checkAndSwap();
        checkAndSwap();
        checkAndSwap();
        checkAndSwap();
        checkAndSwap();
        checkAndSwap();
        checkAndSwap();
        checkAndSwap();
        checkAndSwap();
        checkAndSwap();
    }

    public static void checkAndSwap()
    //before: robot at the start of the center column facing north
    //after: robot stands at end of the center column, the columns have been swapped
    {
        turnRight();
        Robot.move();
        if(checkDark())
        {
            Robot.makeLight();
        }
        else
        {
            Robot.makeDark();
        }
        turnAround();
        Robot.move();
        Robot.move();
        if(checkDark())
        {
            Robot.makeLight();
        }
        else
        {
            Robot.makeDark();
        }
        turnAround();
        Robot.move();
        Robot.turnLeft();
        if(Robot.frontIsClear())
        {Robot.move();}
    }

    public static void turnAround() 
    //before: Robot is standing, facing any direction
    //after: Robot has turned around 180 degrees
    {   
        Robot.turnLeft();
        Robot.turnLeft();
    }

    public static boolean checkDark()
    //before: Robot is facing a square without knowing if it's light or dark
    //after: robot is facing a square and knows whether it's light or dark
    { 
        if(Robot.onDark())
        {
            return true;
        }
        else
        { 
            return false;
        }
    }
    //Don't run these. I will!
    public static void testLightCandles3()
    {
        Robot.load("candles3.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testLightCandles4()
    {
        Robot.load("candles4.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testCompleteRoom3()
    {
        Robot.load("room3.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void testCompleteRoom4()
    {
        Robot.load("room4.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void testSwapAll3()
    {
        Robot.load("swap3.txt");
        Robot.setDelay(0.05);
        swapAll();
    }
    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll4()
    {
        Robot.load("swap4.txt");
        Robot.setDelay(0.05);
        swapAll();
    }
}
