
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MatriksOperasi {
    public MatriksOperasi() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("masukan panjang baris/kolom : ");
        int var2 = var1.nextInt();
        ArrayList var3 = new ArrayList();

        int var5;
        for(int var4 = 0; var4 < var2; ++var4) {
            var3.add(new ArrayList());

            for(var5 = 0; var5 < var2; ++var5) {
                System.out.print("baris ke " + (var4 + 1) + " kolom ke " + (var5 + 1) + " : ");
                ((ArrayList)var3.get(var4)).add(var1.nextInt());
            }
        }

        System.out.println("\n");
        System.out.println("Hasil inputan Matriks");
        Iterator var10 = var3.iterator();

        Iterator var6;
        ArrayList var12;
        while(var10.hasNext()) {
            var12 = (ArrayList)var10.next();
            System.out.print("[");
            var6 = var12.iterator();

            while(var6.hasNext()) {
                Integer var7 = (Integer)var6.next();
                System.out.print(" " + var7 + " ");
            }

            System.out.print("]\n");
        }

        System.out.println("\n");
        ArrayList var11 = new ArrayList();

        int var13;
        for(var5 = 0; var5 < var2; ++var5) {
            var11.add(new ArrayList());

            for(var13 = 0; var13 < var2; ++var13) {
                ((ArrayList)var11.get(var5)).add((Integer)((ArrayList)var3.get(var13)).get(var5));
            }
        }

        System.out.println("Matriks transpose");
        Iterator var14 = var11.iterator();

        while(var14.hasNext()) {
            ArrayList var15 = (ArrayList)var14.next();
            System.out.print("[");
            Iterator var16 = var15.iterator();

            while(var16.hasNext()) {
                Integer var8 = (Integer)var16.next();
                System.out.print(" " + var8 + " ");
            }

            System.out.print("]\n");
        }

        System.out.println("\n");
        var12 = new ArrayList();

        for(var13 = 0; var13 < var2; ++var13) {
            var12.add(new ArrayList());

            for(int var17 = 0; var17 < var2; ++var17) {
                ((ArrayList)var12.get(var13)).add((Integer)((ArrayList)var3.get(var13)).get(var17) + (Integer)((ArrayList)var11.get(var13)).get(var17));
            }
        }

        System.out.println("\n");
        System.out.println("Hasil jumblah matriks1 dan matriksTranspose");
        var6 = var12.iterator();

        while(var6.hasNext()) {
            ArrayList var18 = (ArrayList)var6.next();
            System.out.print("[");
            Iterator var19 = var18.iterator();

            while(var19.hasNext()) {
                Integer var9 = (Integer)var19.next();
                System.out.print(" " + var9 + " ");
            }

            System.out.print("]\n");
        }

    }
}
