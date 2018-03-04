package alexey.shentyakov;

public class C extends B {

    public C() {
        System.out.println("class C constructor");
    }
    
}

/*

public class alexey/shentyakov/C extends alexey/shentyakov/B {

     public C() { // <init> //()V
         <localVar:index=0 , name=this , desc=Lalexey/shentyakov/C;, sig=null, start=L1, end=L2>

         L1 {
             aload0 // reference to self
             invokespecial alexey/shentyakov/B <init>(()V);
         }
         L3 {
             getstatic java/lang/System.out:java.io.PrintStream
             ldc "class C constructor" (java.lang.String)
             invokevirtual java/io/PrintStream println((Ljava/lang/String;)V);
         }
         L4 {
             return
         }
         L2 {
         }
     }
}

----------------------------

Classfile /home/alex/NetBeansProjects/JavaInternals_Constructors/build/classes/alexey/shentyakov/C.class
  Last modified Mar 4, 2018; size 439 bytes
  MD5 checksum f036f1d655840e642b9dbcd70bde6700
  Compiled from "C.java"
public class alexey.shentyakov.C extends alexey.shentyakov.B
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #6.#16         // alexey/shentyakov/B."<init>":()V
   #2 = Fieldref           #17.#18        // java/lang/System.out:Ljava/io/PrintStream;
   #3 = String             #19            // class C constructor
   #4 = Methodref          #20.#21        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #5 = Class              #22            // alexey/shentyakov/C
   #6 = Class              #23            // alexey/shentyakov/B
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lalexey/shentyakov/C;
  #14 = Utf8               SourceFile
  #15 = Utf8               C.java
  #16 = NameAndType        #7:#8          // "<init>":()V
  #17 = Class              #24            // java/lang/System
  #18 = NameAndType        #25:#26        // out:Ljava/io/PrintStream;
  #19 = Utf8               class C constructor
  #20 = Class              #27            // java/io/PrintStream
  #21 = NameAndType        #28:#29        // println:(Ljava/lang/String;)V
  #22 = Utf8               alexey/shentyakov/C
  #23 = Utf8               alexey/shentyakov/B
  #24 = Utf8               java/lang/System
  #25 = Utf8               out
  #26 = Utf8               Ljava/io/PrintStream;
  #27 = Utf8               java/io/PrintStream
  #28 = Utf8               println
  #29 = Utf8               (Ljava/lang/String;)V
{
  public alexey.shentyakov.C();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method alexey/shentyakov/B."<init>":()V
         4: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         7: ldc           #3                  // String class C constructor
         9: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        12: return
      
LineNumberTable:
        line 5: 0
        line 6: 4
        line 7: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lalexey/shentyakov/C;
}

*/