/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_08_01;

/**
 *
 * @author Arturo González
 */
public class Codigo_08_02 {
    public static void hanoi(int n, short[][] pegs, int[] top, int from, int aux, int to) {
        if (n == 1) {
            Codigo_08_03.move(pegs, top, from, to);
            Codigo_08_01.show(pegs, top);
            return;
        }
        hanoi(n - 1, pegs, top, from, to, aux);
        Codigo_08_03.move(pegs, top, from, to);
        Codigo_08_01.show(pegs, top);
        hanoi(n - 1, pegs, top, aux, from, to);
    }
}
