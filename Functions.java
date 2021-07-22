/* library Math for to solve numerical */
import java.lang.Math;

public class Functions {
    
    // plus function (1)
    public double plus (double varA, double varB){
        return varA + varB;
    }

    // subtract function (2)
    public double subtract (double varA, double varB){
        return varA - varB;
    }

    // multiply function (3)
    public double multiply (double varA, double varB){
        return varA * varB;
    }

    // division function (4)
    public double division (double varA, double varB){
        return varA / varB;
    }

    // exponecial function (5)
    public double exponecial (double varA, int varB){
        return Math.pow(varA, varB);
    }

    // square root function (6)
    public double squareRoot (double varA, int varB){
      double radical = 1 / varB;
      return Math.pow(varA, radical);
    } 

    // sin function (7)
    public double sin (double angle){
      return Math.sin(Math.toRadians(angle)); // the Math.sin function parameter must be in radians
    }
    
    // cos function (8)
    public double cos (double angle){
        return Math.cos(Math.toRadians(angle)); // the Math.cos function parameter must be in radians
    }

    // tan function (9)
    public double tan (double angle){
        return Math.tan(Math.toRadians(angle)); // the Math.tan function parameter must be in radians
    }
}
