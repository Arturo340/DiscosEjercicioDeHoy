/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigo_08_01;
import java.util.Scanner;
/**
 *
 * @author Arturo González
 */
public class Codigo_08_01 {
    public static void show(short[][] pegs, int[] top) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        for (int i = top[0] - 1; i >= 0; i--) a.append(pegs[0][i]).append(" ");
        for (int i = top[1] - 1; i >= 0; i--) b.append(pegs[1][i]).append(" ");
        for (int i = top[2] - 1; i >= 0; i--) c.append(pegs[2][i]).append(" ");
        System.out.println("A[" + a.toString().trim() + "] B[" + b.toString().trim() + "] C[" + c.toString().trim() + "]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n;
        try {
            System.out.print("Numero de discos (short): ");
            n = sc.nextShort();
        } catch (Exception e) {
            n = 4;
        }
        if (n < 1) n = 1;
        short[][] pegs = new short[3][n];
        int[] top = new int[]{0, 0, 0};
        for (short d = n; d >= 1; d--) {
            pegs[0][top[0]] = d;
            top[0]++;
        }
        show(pegs, top);
        Codigo_08_02.hanoi(n, pegs, top, 0, 1, 2);
    }
}
