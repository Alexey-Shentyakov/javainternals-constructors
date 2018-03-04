package alexey.shentyakov;

public class JavaInternals_Constructors {

    public static void main(String[] args) {
        System.out.println("main begin");
        
        C object_c = new C();
        
        System.out.println("main end");
    }
    
}

/*

public class alexey/shentyakov/JavaInternals_Constructors {

     public JavaInternals_Constructors() { // <init> //()V
         <localVar:index=0 , name=this , desc=Lalexey/shentyakov/JavaInternals_Constructors;, sig=null, start=L1, end=L2>

         L1 {
             aload0 // reference to self
             invokespecial java/lang/Object <init>(()V);
             return
         }
         L2 {
         }
     }

     public static main(java.lang.String[] arg0) { //([Ljava/lang/String;)V
         <localVar:index=0 , name=args , desc=[Ljava/lang/String;, sig=null, start=L1, end=L2>
         <localVar:index=1 , name=object_c , desc=Lalexey/shentyakov/C;, sig=null, start=L3, end=L2>

         L1 {
             getstatic java/lang/System.out:java.io.PrintStream
             ldc "main begin" (java.lang.String)
             invokevirtual java/io/PrintStream println((Ljava/lang/String;)V);
         }
         L4 {
             new alexey/shentyakov/C
             dup
             invokespecial alexey/shentyakov/C <init>(()V);
             astore1
         }
         L3 {
             getstatic java/lang/System.out:java.io.PrintStream
             ldc "main end" (java.lang.String)
             invokevirtual java/io/PrintStream println((Ljava/lang/String;)V);
         }
         L5 {
             return
         }
         L2 {
         }
     }
}

------------------------------

Classfile /home/alex/NetBeansProjects/JavaInternals_Constructors/build/classes/alexey/shentyakov/JavaInternals_Constructors.class
  Last modified Mar 4, 2018; size 729 bytes
  MD5 checksum ceee70a7f9b78b5c272d81aaa6d37272
  Compiled from "JavaInternals_Constructors.java"
public class alexey.shentyakov.JavaInternals_Constructors
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #9.#25         // java/lang/Object."<init>":()V
   #2 = Fieldref           #26.#27        // java/lang/System.out:Ljava/io/PrintStream;
   #3 = String             #28            // main begin
   #4 = Methodref          #29.#30        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #5 = Class              #31            // alexey/shentyakov/C
   #6 = Methodref          #5.#25         // alexey/shentyakov/C."<init>":()V
   #7 = String             #32            // main end
   #8 = Class              #33            // alexey/shentyakov/JavaInternals_Constructors
   #9 = Class              #34            // java/lang/Object
  #10 = Utf8               <init>
  #11 = Utf8               ()V
  #12 = Utf8               Code
  #13 = Utf8               LineNumberTable
  #14 = Utf8               LocalVariableTable
  #15 = Utf8               this
  #16 = Utf8               Lalexey/shentyakov/JavaInternals_Constructors;
  #17 = Utf8               main
  #18 = Utf8               ([Ljava/lang/String;)V
  #19 = Utf8               args
  #20 = Utf8               [Ljava/lang/String;
  #21 = Utf8               object_c
  #22 = Utf8               Lalexey/shentyakov/C;
  #23 = Utf8               SourceFile
  #24 = Utf8               JavaInternals_Constructors.java
  #25 = NameAndType        #10:#11        // "<init>":()V
  #26 = Class              #35            // java/lang/System
  #27 = NameAndType        #36:#37        // out:Ljava/io/PrintStream;
  #28 = Utf8               main begin
  #29 = Class              #38            // java/io/PrintStream
  #30 = NameAndType        #39:#40        // println:(Ljava/lang/String;)V
  #31 = Utf8               alexey/shentyakov/C
  #32 = Utf8               main end
  #33 = Utf8               alexey/shentyakov/JavaInternals_Constructors
  #34 = Utf8               java/lang/Object
  #35 = Utf8               java/lang/System
  #36 = Utf8               out
  #37 = Utf8               Ljava/io/PrintStream;
  #38 = Utf8               java/io/PrintStream
  #39 = Utf8               println
  #40 = Utf8               (Ljava/lang/String;)V
{
  public alexey.shentyakov.JavaInternals_Constructors();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lalexey/shentyakov/JavaInternals_Constructors;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #3                  // String main begin
         5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: new           #5                  // class alexey/shentyakov/C
        11: dup
        12: invokespecial #6                  // Method alexey/shentyakov/C."<init>":()V
        15: astore_1
        16: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        19: ldc           #7                  // String main end
        21: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        24: return
      LineNumberTable:
        line 6: 0
        line 8: 8
        line 10: 16
        line 11: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  args   [Ljava/lang/String;
           16       9     1 object_c   Lalexey/shentyakov/C;
}

*/