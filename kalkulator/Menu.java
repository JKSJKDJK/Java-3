/*     */ package kalkulator;
/*     */ 
/*     */ import java.io.FileNotFoundException;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */  /** Shows and handles the menu
* @throws Exception throws when user input is invalid (from WcztyanieZ class)
* @throws FileNotFoundException throws when file path is not found (from WcztyanieZ class)
*/
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Menu
/*     */   extends WczytanieZ
/*     */ {
	/**
	 * Tells the state of menu and calls methods
	 */
/*     */   private int opcja;
/*     */ 
      /**
      * Constructor, which creates the class and initialize the variable
      */
/*     */   public Menu()
/*     */   {
/*  21 */     this.opcja = 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/**
 * Initialize the menu
 */
/*     */   public void Init()
/*     */     throws Exception, FileNotFoundException
/*     */   {
/*  34 */     otwMenu();
/*  35 */     zarzMenu();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/**
 * Shows visual aspect of menu
 */
/*     */   public void otwMenu()
/*     */   {
/*  46 */     System.out.print("1. Wczytaj z klawiatury");
/*  47 */     if (this.opcja == 0)
/*     */     {
/*  49 */       System.out.println(" <-");
/*     */     }
/*     */     else
/*     */     {
/*  53 */       System.out.println("");
/*     */     }
/*  55 */     System.out.print("2. Wczytaj z pliku");
/*  56 */     if (this.opcja == 1)
/*     */     {
/*  58 */       System.out.println(" <-");
/*     */     }
/*     */     else
/*     */     {
/*  62 */       System.out.println("");
/*     */     }
/*  64 */     System.out.print("3. Zakoncz");
/*  65 */     if (this.opcja == 2)
/*     */     {
/*  67 */       System.out.println(" <-");
/*     */     }
/*     */     else
/*     */     {
/*  71 */       System.out.println("");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/**
 * Handles menu
 * @throws Exception throws when user input is invalid (from WcztyanieZ class)
 * @throws FileNotFoundException throws when file path is not found (from WcztyanieZ class)
 */
/*     */ 
/*     */   public void zarzMenu()
/*     */     throws Exception, FileNotFoundException
/*     */   {
/*  86 */     Scanner input = new Scanner(System.in);
/*     */     
/*     */     for (;;)
/*     */     {
/*  90 */       String parametr = input.next();
/*  91 */       if ((parametr.matches("d")) || (parametr.matches("D")))
/*     */       {
/*  93 */         if (this.opcja == 2)
/*     */         {
/*  95 */           this.opcja = 0;
/*     */         }
/*     */         else
/*     */         {
/*  99 */           this.opcja += 1;
/*     */         }
/* 101 */         otwMenu();
/*     */       }
/* 103 */       else if ((parametr.matches("w")) || (parametr.matches("W")))
/*     */       {
/* 105 */         if (this.opcja == 0)
/*     */         {
/* 107 */           this.opcja = 2;
/*     */         }
/*     */         else
/*     */         {
/* 111 */           this.opcja -= 1;
/*     */         }
/* 113 */         otwMenu();
/*     */       }
/* 115 */       else if ((parametr.matches("e")) || (parametr.matches("E")))
/*     */       {
/* 117 */         switch (this.opcja)
/*     */         {
/*     */ 
/*     */         case 0: 
/* 121 */           klawiatury();
/* 122 */           otwMenu();
/* 123 */           break;
/*     */         
/*     */ 
/*     */         case 1: 
/* 127 */           pliku();
/* 128 */           otwMenu();
/* 129 */           break;
/*     */         
/*     */ 
/*     */         case 2: 
/* 133 */           input.close();
/* 134 */           return;
/*     */         }
/*     */         
/*     */       }
/*     */     }
/*     */   }
/*     */ }