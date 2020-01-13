package Main;

class Recursive {
     static double recursivePower(double base, int exponent){
        if (exponent < 0){
            return 1.0 / recursivePower(base, -exponent);
        }else if (exponent == 0){
            return 1.0;
        }else {
            return base * recursivePower(base, exponent - 1);
        }
    }
}
