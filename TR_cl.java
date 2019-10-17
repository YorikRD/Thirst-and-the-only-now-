public class TR_cl {
    public static void main(String[] args) {
//        int a = 129;
        int b = 3;
//        int res = a / b;
//        int ost = a % b;
//        System.out.println("Деление результат " + res + " Остаток результат " + ost);
        int arg = 156;
        int arg2 = arg;
        int arg3 = arg;
        int ost2;
        int Por = 1;
        while (arg >= b) {
            arg = arg / b;
            Por = Por + 1;
        }
        System.out.println(" Порядок " + Por);
        int[] aee = new int[Por];
              for (int i = 0; arg2 >= b; i++ ) {
            ost2 = arg2 % b;
            arg2 = arg2 / b;
            aee[i] = ost2;
            System.out.println("Аргументы " + arg);
            System.out.println("Остатки " + ost2);
            System.out.println("Шаг " + i);
        }
         int z = 0;
         while (z < (Por-1))    {
             arg3 = arg3 / b;
             z = z + 1;
         }
         aee[(Por-1)]= arg3;
        for (int i = 0; i < Por; i++) {
            System.out.println(aee[i]);
        }


        }
    }




