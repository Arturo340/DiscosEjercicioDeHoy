/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_08_01;

/**
 *
 * @author Arturo González
 */
public class Codigo_08_03 {
    private static short pop(short[] stack, int[] top, int idx) {
        top[idx]--;
        return stack[top[idx]];
    }
    private static void push(short[] stack, int[] top, int idx, short val) {
        stack[top[idx]] = val;
        top[idx]++;
    }
    public static void move(short[][] pegs, int[] top, int from, int to) {
        short disk = pop(pegs[from], top, from);
        push(pegs[to], top, to, disk);
    }
}
