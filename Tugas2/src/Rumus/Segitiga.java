package Rumus;

/**
 *
 * @author Ardi Purnabawa
 * TGL: 2024 - 04 - 01
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Segitiga {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    double alas, tinggi, luas;
    String nilai1, nilai2;

    System.out.println("Hitung luas segitiga");
    System.out.print("Masukkan nilai alas: ");
    try {
      nilai1 = reader.readLine();
      alas = Double.parseDouble(nilai1);
    } catch (IOException e) {
      System.out.println("Error!");
      return;
    }

    System.out.print("Masukkan nilai tinggi: ");
    try {
      nilai2 = reader.readLine();
      tinggi = Double.parseDouble(nilai2);
    } catch (IOException e) {
      System.out.println("Error!");
      return;
    }
    
    luas = 0.5 * alas * tinggi;

    System.out.println("Luas segitiga: " + luas);
  }
}
