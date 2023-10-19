import static java.lang.Math.*;
public class lab1prg {
    public static boolean ifIn(int c) {
        int[] elem = {2,5,7,10,11,12,13,17};
        for (int i: elem) {
            if (i==c) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        short[] c = new short[]{17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        float[] x = new float[16];
        //Random rand = new Random();
        for (int i=0; i<16; i++) {
            x[i] = (float) (Math.random()*22-8);
        }
        //System.out.println(Arrays.toString(x));


        double[][] r = new double[16][16];

        for (int qi = 0; qi<c.length; qi++) {
            for (int qj =0; qj<x.length; qj++) {
                if (c[qi] == 4) {
                    //final float tret = (float) 1 /3;
                    r[qi][qj] = Math.pow((1/3 + Math.pow(abs(4/x[qj]), 2*Math.atan((x[qj]+3)/22)*(Math.exp(x[qj])+3))), 2);
                } else if (ifIn(c[qi])) {
                    r[qi][qj] = Math.pow((1/(4*Math.exp(Math.log(abs(x[qj]))))), 3);
                } else {
                    r[qi][qj] = 1/(4*(Math.pow(Math.pow(cbrt(x[qj]), 2*2*x[qj])*(log(abs(x[qj])) +2/3) ,2)));
                }
            }
        }

        for (double[] ri: r) {
            for (double rij: ri) {
                if (Double.isNaN(rij)) {
                    System.out.printf("%1$11s"," NaN");
                } else {
                    System.out.printf("  %1$9.5f", rij);

                }
            }
            System.out.println();
        }


    }
}
