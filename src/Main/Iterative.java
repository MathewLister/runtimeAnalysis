package Main;

class Iterative {
    static double iterativePower(double base, int exponent){
        double retVal = 1.0;
        if (exponent < 0){
            return 1.0 / iterativePower(base, -exponent);
        }else{
            for (int i=0; i<exponent; i++)
                retVal *= base;
        }
        return retVal;
    }
}
