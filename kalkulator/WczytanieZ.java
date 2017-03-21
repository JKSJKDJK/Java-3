/*    */ package kalkulator;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileReader;
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ import javax.script.ScriptEngine;
/*    */ import javax.script.ScriptEngineManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/**
 * Calculates the expression input by user (method klawiatury) or from file (method pliku) 
 */
/*    */ 
/*    */ 
/*    */ public class WczytanieZ
/*    */ {
	/**
	 * Calculates the expression from user input
	 * @throws Exception throws when user input is invalid or not correct
	 */
/*    */   public static void klawiatury()
/*    */     throws Exception
/*    */   {
/* 22 */     ScriptEngineManager factory = new ScriptEngineManager();
/* 23 */     ScriptEngine engine = factory.getEngineByName("JavaScript");
/* 24 */     Scanner in = new Scanner(System.in);
/* 25 */     System.out.println("Wprowadz obliczenia: ");
/* 26 */     String userInput = in.next();
/* 27 */     while (!userInput.matches("koniec"))
/*    */     {
/*    */       try
/*    */       {
/* 31 */         Object calculation = engine.eval(userInput);
/* 32 */         System.out.println("The answer = " + calculation.toString());
/*    */       }
/*    */       catch (Exception e) {
/* 35 */         System.out.println("Zla operacja");
/*    */       }
/*    */       
/* 38 */       userInput = in.next();
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/**
 * Calculates the expression from file
 * @throws Exception throws when file path is invalid
 */
/*    */   public static void pliku()
/*    */     throws Exception, FileNotFoundException
/*    */   {
/* 49 */     Scanner sciezka = new Scanner(System.in);
/* 50 */     System.out.print("Wczytaj plik: ");
/* 51 */     String plik = sciezka.next();
/*    */     FileReader in;
/*    */     try
/*    */     {
/* 55 */       in = new FileReader(plik);
/*    */     }
/*    */     catch (FileNotFoundException f) {
/*    */
/* 59 */       System.out.println("Nie znaleziono pliku"); return;
/*    */     }/*    */
/* 62 */     BufferedReader bufferedReader = new BufferedReader(in);
/* 63 */     String textLine = bufferedReader.readLine();
/* 64 */     ScriptEngineManager factory = new ScriptEngineManager();
/* 65 */     ScriptEngine engine = factory.getEngineByName("JavaScript");
/*    */     do
/*    */     {
/*    */       try {
/* 69 */         Object calculation = engine.eval(textLine);
/* 70 */         System.out.println("The answer = " + calculation.toString());
/*    */       }
/*    */       catch (Exception e) {
/* 73 */         System.out.println("Zla operacja");
/*    */       }
/* 75 */       textLine = bufferedReader.readLine();
/* 76 */     } while (textLine != null);
/* 77 */     bufferedReader.close();
/*    */   }
/*    */ }