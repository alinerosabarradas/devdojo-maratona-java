package br.com.aline.java.javaviradojiraya;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] arrayInt = new int[3][3];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for (int[] arrayBase : arrayInt) {
            System.out.println("--------------");
            for (int num : arrayBase) {
                System.out.println(num + " ");


            }


            arrayInt[0] = new int[2];
            arrayInt[1] = new int[]{1, 2, 3};
            arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

            for (int[] arrayBaseDois : arrayInt) {
                System.out.println("--------------");
                for (int num : arrayBaseDois) {
                    System.out.println(num + " ");
                }
            }

            arrayInt[0] = new int[2];
            arrayInt[1] = array;
            arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

            for (int[] arrayBaseDois : arrayInt) {
                System.out.println("--------------");
                for (int num : arrayBaseDois) {
                    System.out.println(num + " ");
                }
            }
            int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

            for (int[] arrayBaseDois : arrayInt) {
                System.out.println("--------------");
                for (int num : arrayBaseDois) {
                    System.out.println(num + " ");
                }
            }
        }
    }
}