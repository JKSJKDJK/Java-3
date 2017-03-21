/*    */ package kalkulator;
/*    */ 
/*    */ import java.io.FileNotFoundException;
/*    */ 
/*    */ 
/*    */ /**
 * Starts program and initialize calculator menu
 * @author JSKJKDJK
 * @throws Exception throws when user input is invalid (from WcztyanieZ class)
 * @throws FileNotFoundException throws when file path is not found (from WcztyanieZ class)
 */
/*    */ 
/*    */ 
/*    */ public class Main
/*    */ {
/*    */   public static void main(String[] args)
/*    */     throws Exception, FileNotFoundException
/*    */   {
/* 14 */     Menu m = new Menu();
/* 15 */     m.Init();
/*    */   }
/*    */ }