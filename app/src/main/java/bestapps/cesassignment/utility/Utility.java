package bestapps.cesassignment.utility;

import android.util.Log;

/**
 * Created by Anil on 2/16/2018.
 */

public class Utility {

    public static int mCalculateGCD(int number_One, int number_Two){
        int gcd_Recur = gcd_Recur(number_One, number_Two);
        Log.d("G.C.D", "of "+number_One +" and "+number_Two +" is "+gcd_Recur);
        return gcd_Recur;
    }

    public static int gcd_Recur(int numOneVal, int numTwoVal)
    {
        if (numTwoVal != 0)
            return gcd_Recur(numTwoVal, numOneVal % numTwoVal);
        else
            return numOneVal;
    }
}
