import java.awt.event.*;
import java.lang.System.Logger.Level;
import java.util.Timer;
import java.awt.*;
import javax.swing.*;

class picpuzzle2 extends JFrame implements ActionListener{
 
// declaring variables
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b14,b18,b19,b22,b23,b24,b25,b26,b51,b52,b53,b54,b55,b56,b57,b58,b59,sample,starB,bEasy,bMedium,bHard,bSolve;
Icon star;

// *CHANGE IMAGE PATH BEFORE RUNNING!*

// icon image (top)
//3x3
Icon ic0=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle1 3x3 icon.jpg");
Icon ic10=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle2 3x3 icon.jpg");
Icon ic20=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle3 3x3 icon.jpg");
Icon ic30= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle4 3x3 icon.jpg");
//4x4
Icon ic40 = new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle1 4x4 icon.jpg");
Icon ic50 = new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle 2 4x4 icon.jpg");
Icon ic60 = new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle3 4x4 icon.jpg");
Icon ic70 = new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle 4 4x4 icon.jpg");
//5x5
Icon ic80 = new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle 1 5x5 icon.jpg");
Icon ic90 = new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle2 5x5 icon.jpg");
Icon ic100 = new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle 3 5x5 icon.jpg");
Icon ic110 = new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\icon\\puzzle 4 5x5 icon.jpg");


// sample image (right)
Icon samicon1=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\sample\\puzzle1 sample.jpg");
Icon samicon2=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\sample\\puzzle2 sample.jpg");
Icon samicon3=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\sample\\puzzle3 sample.jpg");
Icon samicon4=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\sample\\puzzle4 sample.jpg");

// puzzle 1 image (3x3)
Icon ic1=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 3x3\\1.jpg");//1
Icon ic2=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 3x3\\5.jpg");//5
Icon ic3=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 3x3\\2.jpg");//2
Icon ic4=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 3x3\\7.jpg");//7
Icon ic5=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 3x3\\4.jpg");//4
Icon ic6=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 3x3\\6.jpg");//6
Icon ic7=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 3x3\\8.jpg");//8
Icon ic8=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 3x3\\9.jpg");//9
Icon ic9=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 3x3\\3.jpg");//3

// puzzle 2 image 3x3
Icon ic11=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 3x3\\1.jpg");
Icon ic12=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 3x3\\5.jpg");
Icon ic13=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 3x3\\2.jpg");
Icon ic14=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 3x3\\7.jpg");
Icon ic15=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 3x3\\4.jpg");
Icon ic16=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 3x3\\6.jpg");
Icon ic17=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 3x3\\8.jpg");
Icon ic18=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 3x3\\9.jpg");
Icon ic19=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 3x3\\3.jpg");

// puzzle 3 image 3x3
Icon ic21=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 3x3\\1.jpg");
Icon ic22=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 3x3\\5.jpg");
Icon ic23=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 3x3\\2.jpg");
Icon ic24=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 3x3\\7.jpg");
Icon ic25=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 3x3\\4.jpg");
Icon ic26=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 3x3\\6.jpg");
Icon ic27=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 3x3\\8.jpg");
Icon ic28=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 3x3\\9.jpg");
Icon ic29=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 3x3\\3.jpg");

// puzzle 4 image 3x3
Icon ic31= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 3x3\\1.jpg");
Icon ic32= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 3x3\\5.jpg");
Icon ic33= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 3x3\\2.jpg");
Icon ic34= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 3x3\\7.jpg");
Icon ic35= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 3x3\\4.jpg");
Icon ic36= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 3x3\\6.jpg");
Icon ic37= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 3x3\\8.jpg");
Icon ic38= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 3x3\\9.jpg");
Icon ic39= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 3x3\\3.jpg");

//puzzle 1 image 4x4
Icon ic41= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\10.jpg");//10
Icon ic42= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\15.jpg");//15
Icon ic43= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\13.jpg");//13
Icon ic44= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\16.jpg");//16
Icon ic45= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\12.jpg");//12
Icon ic46= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\14.jpg");//14
Icon ic47= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\11.jpg");//11
Icon ic48= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\1.jpg");//1
Icon ic49= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\3.jpg");//3
Icon ic51= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\2.jpg");//2
Icon ic52= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\5.jpg");//5
Icon ic53= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\4.jpg");//14
Icon ic54= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\8.jpg");//8
Icon ic55= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\6.jpg");//6
Icon ic56= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\7.jpg");//7
Icon ic57= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 4x4\\9.jpg");//9

//puzzle 2 image 4x4
Icon ic61= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\10.jpg");//1
Icon ic62= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\15.jpg");//5
Icon ic63= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\13.jpg");//8
Icon ic64= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\16.jpg");//10
Icon ic65= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\12.jpg");//2
Icon ic66= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\14.jpg");//7
Icon ic67= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\11.jpg");//3
Icon ic68= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\1.jpg");//6
Icon ic69= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\3.jpg");//4
Icon ic71= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\2.jpg");//9
Icon ic72= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\5.jpg");//15
Icon ic73= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\4.jpg");//13
Icon ic74= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\8.jpg");//11
Icon ic75= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\6.jpg");//14
Icon ic76= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\7.jpg");//12
Icon ic77= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 4x4\\9.jpg");//16

//puzzle 3 image 4x4
Icon ic81= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\10.jpg");//1
Icon ic82= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\15.jpg");//5
Icon ic83= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\13.jpg");//8
Icon ic84= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\16.jpg");//10
Icon ic85= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\12.jpg");//2
Icon ic86= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\14.jpg");//7
Icon ic87= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\11.jpg");//3
Icon ic88= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\1.jpg");//6
Icon ic89= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\3.jpg");//4
Icon ic91= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\2.jpg");//9
Icon ic92= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\5.jpg");//15
Icon ic93= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\4.jpg");//13
Icon ic94= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\8.jpg");//11
Icon ic95= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\6.jpg");//14
Icon ic96= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\7.jpg");//12
Icon ic97= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 4x4\\9.jpg");//16

//puzzle 4 image 4x4
Icon ic101= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\10.jpg");//1
Icon ic102= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\15.jpg");//5
Icon ic103= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\13.jpg");//8
Icon ic104= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\16.jpg");//10
Icon ic105= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\12.jpg");//2
Icon ic106= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\14.jpg");//7
Icon ic107= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\11.jpg");//3
Icon ic108= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\1.jpg");//6
Icon ic109= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\3.jpg");//4
Icon ic111= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\2.jpg");//9
Icon ic112= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\5.jpg");//15
Icon ic113= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\4.jpg");//13
Icon ic114= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\8.jpg");//11
Icon ic115= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\6.jpg");//14
Icon ic116= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\7.jpg");//12
Icon ic117= new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 4x4\\9.jpg");//16
 
// puzzle 1 image (5x5)
Icon id01=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\1.jpg");//1
Icon id02=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\3.jpg");//3
Icon id03=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\2.jpg");//2
Icon id04=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\5.jpg");//5
Icon id05=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\4.jpg");//4
Icon id06=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\7.jpg");//7
Icon id07=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\6.jpg");//6
Icon id08=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\9.jpg");//9
Icon id09=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\8.jpg");//8
Icon id11=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\11.jpg");//11
Icon id12=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\10.jpg");//10
Icon id13=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\13.jpg");//13
Icon id14=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\12.jpg");//12
Icon id15=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\15.jpg");//15
Icon id16=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\14.jpg");//14
Icon id17=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\17.jpg");//17
Icon id18=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\16.jpg");//16
Icon id19=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\19.jpg");//19
Icon id21=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\18.jpg");//18
Icon id22=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\21.jpg");//21
Icon id23=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\20.jpg");//20
Icon id24=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\23.jpg");//23
Icon id25=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\22.jpg");//22
Icon id26=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\25.jpg");//25
Icon id27=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle1\\puzzle1 5x5\\24.jpg"); //24

// puzzle 2 image (5x5)
Icon id31=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\1.jpg");//1
Icon id32=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\3.jpg");//3
Icon id33=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\2.jpg");//2
Icon id34=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\5.jpg");//5
Icon id35=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\4.jpg");//4
Icon id36=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\7.jpg");//7
Icon id37=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\6.jpg");//6
Icon id38=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\9.jpg");//9
Icon id39=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\8.jpg");//8
Icon id41=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\11.jpg");//11
Icon id42=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\10.jpg");//10
Icon id43=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\13.jpg");//13
Icon id44=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\12.jpg");//12
Icon id45=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\15.jpg");//15
Icon id46=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\14.jpg");//14
Icon id47=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\17.jpg");//17
Icon id48=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\16.jpg");//16
Icon id49=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\19.jpg");//19
Icon id51=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\18.jpg");//18
Icon id52=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\21.jpg");//21
Icon id53=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\20.jpg");//20
Icon id54=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\23.jpg");//23
Icon id55=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\22.jpg");//22
Icon id56=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\25.jpg");//25
Icon id57=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle2\\puzzle2 5x5\\24.jpg");//24


// puzzle 3 image (5x5)
Icon id61=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\1.jpg");//1
Icon id62=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\3.jpg");//3
Icon id63=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\2.jpg");//2
Icon id64=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\5.jpg");//5
Icon id65=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\4.jpg");//4
Icon id66=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\7.jpg");//7
Icon id67=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\6.jpg");//6
Icon id68=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\9.jpg");//9
Icon id69=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\8.jpg");//8
Icon id71=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\11.jpg");//11
Icon id72=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\10.jpg");//10
Icon id73=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\13.jpg");//13
Icon id74=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\12.jpg");//12
Icon id75=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\15.jpg");//15
Icon id76=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\14.jpg");//14
Icon id77=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\17.jpg");//17
Icon id78=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\16.jpg");//16
Icon id79=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\19.jpg");//19
Icon id81=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\18.jpg");//18
Icon id82=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\21.jpg");//21
Icon id83=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\20.jpg");//20
Icon id84=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\23.jpg");//23
Icon id85=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\22.jpg");//22
Icon id86=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\25.jpg");//25
Icon id87=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle3\\puzzle3 5x5\\24.jpg");//24


// puzzle 4 image (5x5)
Icon ie01=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\1.jpg");//1
Icon ie02=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\3.jpg");//3
Icon ie03=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\2.jpg");//2
Icon ie04=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\5.jpg");//5
Icon ie05=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\4.jpg");//4
Icon ie06=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\7.jpg");//7
Icon ie07=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\6.jpg");//6
Icon ie08=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\9.jpg");//9
Icon ie09=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\8.jpg");//8
Icon ie11=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\11.jpg");//11
Icon ie12=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\10.jpg");//10
Icon ie13=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\13.jpg");//13
Icon ie14=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\12.jpg");//12
Icon ie15=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\15.jpg");//15
Icon ie16=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\14.jpg");//14
Icon ie17=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\17.jpg");//17
Icon ie18=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\16.jpg");//16
Icon ie19=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\19.jpg");//19
Icon ie21=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\18.jpg");//18
Icon ie22=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\21.jpg");//21
Icon ie23=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\20.jpg");//20
Icon ie24=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\23.jpg");//23
Icon ie25=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\22.jpg");//22
Icon ie26=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\25.jpg");//25
Icon ie27=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\puzzle images\\puzzle4\\puzzle4 5x5\\24.jpg");//24


Icon black=new ImageIcon("D:\\upm\\sem2\\oop\\PicPuzzle\\picpuzzle\\Black.png");

picpuzzle2(){

// form title
super("Pic Puzzle");

// creating each grid (3x3)
b1=new JButton(ic1);
b1.setBounds(10,80,100,100);
b2=new JButton(ic2);
b2.setBounds(110,80,100,100);
b3=new JButton(ic3);
b3.setBounds(210,80,100,100);
b4=new JButton(ic4);
b4.setBounds(10,180,100,100);
b5=new JButton(ic5);
b5.setBounds(110,180,100,100);
b6=new JButton(ic6);
b6.setBounds(210,180,100,100);
b7=new JButton(ic7);
b7.setBounds(10,280,100,100);
b8=new JButton(ic8);
b8.setBounds(110,280,100,100);
b9=new JButton(ic9);
b9.setBounds(210,280,100,100);

// creating each grid (4x4)
b14=new JButton(black);
b14.setBounds(310,80,100,100);
b14.setVisible(false);
b18=new JButton(black);
b18.setBounds(310,180,100,100);
b18.setVisible(false);
b22=new JButton(black);
b22.setBounds(310,280,100,100);
b22.setVisible(false);
b23=new JButton(black);
b23.setBounds(10,380,100,100);
b23.setVisible(false);
b24=new JButton(black);
b24.setBounds(110,380,100,100);
b24.setVisible(false);
b25=new JButton(black);
b25.setBounds(210,380,100,100);
b25.setVisible(false);
b26=new JButton(black);
b26.setBounds(310,380,100,100);
b26.setVisible(false);

// creating grid (5x5)
b51=new JButton(black);
b51.setBounds(410,80,100,100);
b51.setVisible(false);
b52=new JButton(black);
b52.setBounds(410,180,100,100);
b52.setVisible(false);
b53=new JButton(black);
b53.setBounds(410,280,100,100);
b53.setVisible(false);
b54=new JButton(black);
b54.setBounds(410,380,100,100);
b54.setVisible(false);
b55=new JButton(black);
b55.setBounds(10,480,100,100);
b55.setVisible(false);
b56=new JButton(black);
b56.setBounds(110,480,100,100);
b56.setVisible(false);
b57=new JButton(black);
b57.setBounds(210,480,100,100);
b57.setVisible(false);
b58=new JButton(black);
b58.setBounds(310,480,100,100);
b58.setVisible(false);
b59=new JButton(black);
b59.setBounds(410,480,100,100);
b59.setVisible(false);

// sample button (right big image)
sample=new JButton(samicon1);
sample.setBounds(620,100,200,200);

// difficulty button
bEasy = new JButton("Easy");
bEasy.setBounds(650, 370, 100, 40);
bMedium = new JButton("Medium");
bMedium.setBounds(650, 420, 100, 40);
bHard = new JButton("Hard");
bHard.setBounds(650, 470, 100, 40);

// solve button
bSolve = new JButton("Solve");
bSolve.setBounds(650,560,100,40);

// labels
JLabel l1=new JLabel("Solution :");
l1.setBounds(550,200,70,20);
JLabel l2=new JLabel("NOTE:: Only this image can be moved => ");
l2.setBounds(80,15,500,20);
JLabel l3=new JLabel("click the solution image to move to the next puzzle");
l3.setBounds(550,320,300,20);
l3.setForeground(Color.red);


// button for icon
starB=new JButton(ic0);
starB.setBounds(330,5,50,50);
star=b9.getIcon();

// adding button / grid and action listener
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(sample);add(l1);add(l2);add(starB);add(l3);
add(b14);add(b18);add(b22);add(b23);add(b24);add(b25);add(b26);
add(b51);add(b52);add(b53);add(b54);add(b55);add(b56);add(b57);add(b58);add(b59);
add(bEasy);add(bMedium);add(bHard);add(bSolve);
b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this);
b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this); 
b14.addActionListener(this); b18.addActionListener(this);b22.addActionListener(this); 
b23.addActionListener(this); b24.addActionListener(this); b25.addActionListener(this); b26.addActionListener(this);
b51.addActionListener(this); b52.addActionListener(this); b53.addActionListener(this); b54.addActionListener(this); b55.addActionListener(this); 
b56.addActionListener(this);b57.addActionListener(this); b58.addActionListener(this); b59.addActionListener(this); 
//b14.setEnabled(false);b18.setEnabbled(false);b22.setEnabled(false);b23.setEnabled(false);b24.setEnabled(false);b25.setEnabled(false);b26.setEnabled(false);
bEasy.addActionListener(this);bMedium.addActionListener(this);bHard.addActionListener(this);bSolve.addActionListener(this);

sample.addActionListener(this);
setLayout(null);
setSize(1000,660);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

// moving the images / puzzle
public void actionPerformed(ActionEvent e){


// move image/puzzle 


if(e.getSource()==b1){
    Icon s1=b1.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b1.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b1.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b2){
    Icon s1=b2.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b2.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b2.setIcon(star);
                   }
         else if(b3.getIcon()==star){
                    b3.setIcon(s1);
                    b2.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b3){
    Icon s1=b3.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b3.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b3.setIcon(star);
                   }
        else if(b14.getIcon()==star){
                    b14.setIcon(s1);
                    b3.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b4){
    Icon s1=b4.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b4.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b4.setIcon(star);
                   }
         else if(b7.getIcon()==star){
                    b7.setIcon(s1);
                    b4.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b5){
    Icon s1=b5.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b5.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b5.setIcon(star);
                   }
         else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b5.setIcon(star);
                   }
          else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b5.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b6){
    Icon s1=b6.getIcon();
      if(b3.getIcon()==star){
        b3.setIcon(s1);
        b6.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b6.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b6.setIcon(star);
                   }
         else if(b18.getIcon()==star){
                    b18.setIcon(s1);
                    b6.setIcon(star);
                   }
}//end of if

if(e.getSource()==b7){
    Icon s1=b7.getIcon();
      if(b4.getIcon()==star){
        b4.setIcon(s1);
        b7.setIcon(star);
      } else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b7.setIcon(star);
                   }
        else if(b23.getIcon()==star){
                    b23.setIcon(s1);
                    b7.setIcon(star);
                   }
 }//end of if

   if(e.getSource()==b8){
    Icon s1=b8.getIcon();
      if(b7.getIcon()==star){
        b7.setIcon(s1);
        b8.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b8.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b8.setIcon(star);
                   }
         else if(b24.getIcon()==star){
                    b24.setIcon(s1);
                    b8.setIcon(star);
                   }

  }//end of if


 if(e.getSource()==b9){
    Icon s1=b9.getIcon();
      if(b8.getIcon()==star){
        b8.setIcon(s1);
        b9.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b9.setIcon(star);
                   }
        else if(b22.getIcon()==star){
                    b22.setIcon(s1);
                    b9.setIcon(star);
                   }
        else if(b25.getIcon()==star){
                    b25.setIcon(s1);
                    b9.setIcon(star);
                   }
  }//end of if

  if(e.getSource()==b14){
    Icon s1 = b14.getIcon();
      if(b3.getIcon()==star){
        b3.setIcon(s1);
        b14.setIcon(star);
      } else if(b18.getIcon()==star){
                     b18.setIcon(s1);
                     b14.setIcon(star);
      }
        else if(b51.getIcon()==star){
                      b51.setIcon(s1);
                      b14.setIcon(star);
      }             
      

  }//end of if

  if(e.getSource()==b18){
    Icon s1=b18.getIcon();
      if(b6.getIcon()==star){
        b6.setIcon(s1);
        b18.setIcon(star);
      } else if(b14.getIcon()==star){
                    b14.setIcon(s1);
                    b18.setIcon(star);
                   }
         else if(b22.getIcon()==star){
                    b22.setIcon(s1);
                    b18.setIcon(star);
                   }
         else if(b52.getIcon()==star){
                    b52.setIcon(s1);
                    b18.setIcon(star);
                   }
  }         
  //end of if

  if(e.getSource()==b22){
    Icon s1=b22.getIcon();
      if(b18.getIcon()==star){
        b18.setIcon(s1);
        b22.setIcon(star);
      } else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b22.setIcon(star);
                   }
        else if(b26.getIcon()==star){
                    b26.setIcon(s1);
                    b22.setIcon(star);
                   }
        else if(b53.getIcon()==star){
                    b53.setIcon(s1);
                    b22.setIcon(star);
                   }
  }//end of if

  if(e.getSource()==b23){
    Icon s1=b23.getIcon();
      if(b7.getIcon()==star){
        b7.setIcon(s1);
        b23.setIcon(star);
      } else if(b24.getIcon()==star){
                    b24.setIcon(s1);
                    b23.setIcon(star);
                   }
        else if(b55.getIcon()==star){
                    b55.setIcon(s1);
                    b23.setIcon(star);
                   }
  }//end of if

  if(e.getSource()==b24){
    Icon s1=b24.getIcon();
      if(b8.getIcon()==star){
        b8.setIcon(s1);
        b24.setIcon(star);
      } else if(b23.getIcon()==star){
                    b23.setIcon(s1);
                    b24.setIcon(star);
                   }
        else if(b25.getIcon()==star){
                    b25.setIcon(s1);
                    b24.setIcon(star);
                   }
        else if(b56.getIcon()==star){
                    b56.setIcon(s1);
                    b24.setIcon(star);
                   }
  }//end of if

  if(e.getSource()==b25){
    Icon s1=b25.getIcon();
      if(b9.getIcon()==star){
        b9.setIcon(s1);
        b25.setIcon(star);
      } else if(b24.getIcon()==star){
                    b24.setIcon(s1);
                    b25.setIcon(star);
                   }
        else if(b26.getIcon()==star){
                    b26.setIcon(s1);
                    b25.setIcon(star);
                   }
        else if(b57.getIcon()==star){
                    b57.setIcon(s1);
                    b25.setIcon(star);
                   }
  }//end of if

  if(e.getSource()==b26){
    Icon s1=b26.getIcon();
      if(b22.getIcon()==star){
        b22.setIcon(s1);
        b26.setIcon(star);
      } else if(b25.getIcon()==star){
                    b25.setIcon(s1);
                    b26.setIcon(star);
                   }
        else if(b54.getIcon()==star){
                    b54.setIcon(s1);
                    b26.setIcon(star);
                   }
        else if(b58.getIcon()==star){
                    b58.setIcon(s1);
                    b26.setIcon(star);
                   }
  }//end of if

  if(e.getSource()==b51){
    Icon s1=b51.getIcon();
      if(b14.getIcon()==star){
        b14.setIcon(s1);
        b51.setIcon(star);
      } else if(b52.getIcon()==star){
                    b52.setIcon(s1);
                    b51.setIcon(star);
                   }
  }//end of if

  if(e.getSource()==b52){
    Icon s1=b52.getIcon();
      if(b51.getIcon()==star){
        b51.setIcon(s1);
        b52.setIcon(star);
      } else if(b53.getIcon()==star){
                    b53.setIcon(s1);
                    b52.setIcon(star);
                   }
        else if(b18.getIcon()==star){
                    b18.setIcon(s1);
                    b52.setIcon(star);
                   }
  }

  if(e.getSource()==b53){
    Icon s1=b53.getIcon();
      if(b52.getIcon()==star){
        b52.setIcon(s1);
        b53.setIcon(star);
      } else if(b22.getIcon()==star){
                    b22.setIcon(s1);
                    b53.setIcon(star);
                   }
        else if(b54.getIcon()==star){
                    b54.setIcon(s1);
                    b53.setIcon(star);
                   }
  }

  if(e.getSource()==b54){
    Icon s1=b54.getIcon();
      if(b53.getIcon()==star){
        b53.setIcon(s1);
        b54.setIcon(star);
      } else if(b26.getIcon()==star){
                    b26.setIcon(s1);
                    b54.setIcon(star);
                   }
        else if(b59.getIcon()==star){
                    b59.setIcon(s1);
                    b54.setIcon(star);
                   }
  }

  if(e.getSource()==b55){
    Icon s1=b55.getIcon();
      if(b23.getIcon()==star){
        b23.setIcon(s1);
        b55.setIcon(star);
      } else if(b56.getIcon()==star){
                    b56.setIcon(s1);
                    b55.setIcon(star);
                   }
  }

  if(e.getSource()==b56){
    Icon s1=b56.getIcon();
      if(b55.getIcon()==star){
        b55.setIcon(s1);
        b56.setIcon(star);
      } else if(b24.getIcon()==star){
                    b24.setIcon(s1);
                    b56.setIcon(star);
                   }
        else if(b57.getIcon()==star){
                    b57.setIcon(s1);
                    b56.setIcon(star);
                   }
  }
  
  if(e.getSource()==b57){
    Icon s1=b57.getIcon();
      if(b56.getIcon()==star){
        b56.setIcon(s1);
        b57.setIcon(star);
      } else if(b25.getIcon()==star){
                    b25.setIcon(s1);
                    b57.setIcon(star);
                   }
        else if(b58.getIcon()==star){
                    b58.setIcon(s1);
                    b57.setIcon(star);
                   }
  }

  if(e.getSource()==b58){
    Icon s1=b58.getIcon();
      if(b57.getIcon()==star){
        b57.setIcon(s1);
        b58.setIcon(star);
      } else if(b26.getIcon()==star){
                    b26.setIcon(s1);
                    b58.setIcon(star);
                   }
        else if(b59.getIcon()==star){
                    b59.setIcon(s1);
                    b58.setIcon(star);
                   }
  }

  if(e.getSource()==b59){
    Icon s1=b59.getIcon();
      if(b54.getIcon()==star){
        b54.setIcon(s1);
        b59.setIcon(star);
      } else if(b58.getIcon()==star){
                    b58.setIcon(s1);
                    b59.setIcon(star);
                   }
  }
  
// changing to next puzzle using sample button
if(e.getSource()==sample){
Icon s1=sample.getIcon();
 if(s1==samicon4){
sample.setIcon(samicon1);
b1.setIcon(ic1);
b2.setIcon(ic2);
b3.setIcon(ic3);
b4.setIcon(ic4);
b5.setIcon(ic5);
b6.setIcon(ic6);
b7.setIcon(ic7);
b8.setIcon(ic8);
b9.setIcon(ic9);
b14.setIcon(black);
b18.setIcon(black);
b22.setIcon(black);
b23.setIcon(black);
b24.setIcon(black);
b25.setIcon(black);
b26.setIcon(black);
b14.setEnabled(false);b18.setEnabled(false);b22.setEnabled(false);b23.setEnabled(false);b24.setEnabled(false);b25.setEnabled(false);b26.setEnabled(false);
b14.setVisible(false);b18.setVisible(false);b22.setVisible(false);b23.setVisible(false);b24.setVisible(false);b25.setVisible(false);b26.setVisible(false);
b51.setVisible(false);b52.setVisible(false);b53.setVisible(false);b54.setVisible(false);b55.setVisible(false);b56.setVisible(false);b57.setVisible(false);
b58.setVisible(false);b59.setVisible(false);
star=b9.getIcon();
starB.setIcon(ic0);
}//eof if

else if(s1==samicon1){
sample.setIcon(samicon2);
b1.setIcon(ic11);
b2.setIcon(ic12);
b3.setIcon(ic13);
b4.setIcon(ic14);
b5.setIcon(ic15);
b6.setIcon(ic16);
b7.setIcon(ic17);
b8.setIcon(ic18);
b9.setIcon(ic19);
b14.setIcon(black);
b18.setIcon(black);
b22.setIcon(black);
b23.setIcon(black);
b24.setIcon(black);
b25.setIcon(black);
b26.setIcon(black);
b14.setEnabled(false);b18.setEnabled(false);b22.setEnabled(false);b23.setEnabled(false);b24.setEnabled(false);b25.setEnabled(false);b26.setEnabled(false);
b14.setVisible(false);b18.setVisible(false);b22.setVisible(false);b23.setVisible(false);b24.setVisible(false);b25.setVisible(false);b26.setVisible(false);
b51.setVisible(false);b52.setVisible(false);b53.setVisible(false);b54.setVisible(false);b55.setVisible(false);b56.setVisible(false);b57.setVisible(false);
b58.setVisible(false);b59.setVisible(false);
star=b6.getIcon();
starB.setIcon(ic10);
}//eof else

else if(s1==samicon2){
sample.setIcon(samicon3);
b1.setIcon(ic21);
b2.setIcon(ic22);
b3.setIcon(ic23);
b4.setIcon(ic24);
b5.setIcon(ic25);
b6.setIcon(ic26);
b7.setIcon(ic27);
b8.setIcon(ic28);
b9.setIcon(ic29);
b14.setIcon(black);
b18.setIcon(black);
b22.setIcon(black);
b23.setIcon(black);
b24.setIcon(black);
b25.setIcon(black);
b26.setIcon(black);
b14.setEnabled(false);b18.setEnabled(false);b22.setEnabled(false);b23.setEnabled(false);b24.setEnabled(false);b25.setEnabled(false);b26.setEnabled(false);
b14.setVisible(false);b18.setVisible(false);b22.setVisible(false);b23.setVisible(false);b24.setVisible(false);b25.setVisible(false);b26.setVisible(false);
b51.setVisible(false);b52.setVisible(false);b53.setVisible(false);b54.setVisible(false);b55.setVisible(false);b56.setVisible(false);b57.setVisible(false);
b58.setVisible(false);b59.setVisible(false);
star=b6.getIcon();
starB.setIcon(ic20);
}//eof else

else if(s1==samicon3){
  sample.setIcon(samicon4);
  b1.setIcon(ic31);
  b2.setIcon(ic32);
  b3.setIcon(ic33);
  b4.setIcon(ic34);
  b5.setIcon(ic35);
  b6.setIcon(ic36);
  b7.setIcon(ic37);
  b8.setIcon(ic38);
  b9.setIcon(ic39);
  b14.setEnabled(false);b18.setEnabled(false);b22.setEnabled(false);b23.setEnabled(false);b24.setEnabled(false);b25.setEnabled(false);b26.setEnabled(false);
  b14.setVisible(false);b18.setVisible(false);b22.setVisible(false);b23.setVisible(false);b24.setVisible(false);b25.setVisible(false);b26.setVisible(false);
  b51.setVisible(false);b52.setVisible(false);b53.setVisible(false);b54.setVisible(false);b55.setVisible(false);b56.setVisible(false);b57.setVisible(false);
  b58.setVisible(false);b59.setVisible(false);
  star=b6.getIcon();
  starB.setIcon(ic30);
  }//eof else



}

//easy button
if(e.getSource()==bEasy){
  Icon s1=sample.getIcon();
  if(s1==samicon1){
   b1.setVisible(true);
   b1.setEnabled(true);
   b1.setIcon(ic1);
   b2.setVisible(true);
   b2.setEnabled(true);
   b2.setIcon(ic2);
   b3.setVisible(true);
   b3.setEnabled(true);
   b3.setIcon(ic3);
   b4.setVisible(true);
   b4.setEnabled(true);
   b4.setIcon(ic4);
   b5.setVisible(true);
   b5.setEnabled(true);
   b5.setIcon(ic5);
   b6.setVisible(true);
   b6.setEnabled(true);
   b6.setIcon(ic6);
   b7.setVisible(true);
   b7.setEnabled(true);
   b7.setIcon(ic7);
   b8.setVisible(true);
   b8.setEnabled(true);
   b8.setIcon(ic8);
   b9.setVisible(true);
   b9.setEnabled(true);
   b9.setIcon(ic9);
   star=b9.getIcon();
   starB.setIcon(ic0);
  }

   if(s1==samicon2){
   b1.setVisible(true);
   b1.setEnabled(true);
   b1.setIcon(ic11);
   b2.setVisible(true);
   b2.setEnabled(true);
   b2.setIcon(ic12);
   b3.setVisible(true);
   b3.setEnabled(true);
   b3.setIcon(ic13);
   b4.setVisible(true);
   b4.setEnabled(true);
   b4.setIcon(ic14);
   b5.setVisible(true);
   b5.setEnabled(true);
   b5.setIcon(ic15);
   b6.setVisible(true);
   b6.setEnabled(true);
   b6.setIcon(ic16);
   b7.setVisible(true);
   b7.setEnabled(true);
   b7.setIcon(ic17);
   b8.setVisible(true);
   b8.setEnabled(true);
   b8.setIcon(ic18);
   b9.setVisible(true);
   b9.setEnabled(true);
   b9.setIcon(ic19);
   star=b6.getIcon();
   starB.setIcon(ic10);
   }

   if(s1==samicon3){
   b1.setVisible(true);
   b1.setEnabled(true);
   b1.setIcon(ic21);
   b2.setVisible(true);
   b2.setEnabled(true);
   b2.setIcon(ic22);
   b3.setVisible(true);
   b3.setEnabled(true);
   b3.setIcon(ic23);
   b4.setVisible(true);
   b4.setEnabled(true);
   b4.setIcon(ic24);
   b5.setVisible(true);
   b5.setEnabled(true);
   b5.setIcon(ic25);
   b6.setVisible(true);
   b6.setEnabled(true);
   b6.setIcon(ic26);
   b7.setVisible(true);
   b7.setEnabled(true);
   b7.setIcon(ic27);
   b8.setVisible(true);
   b8.setEnabled(true);
   b8.setIcon(ic28);
   b9.setVisible(true);
   b9.setEnabled(true);
   b9.setIcon(ic29);
   star=b6.getIcon();
   starB.setIcon(ic20);
  }

   if(s1==samicon4){
   b1.setVisible(true);
   b1.setEnabled(true);
   b1.setIcon(ic31);
   b2.setVisible(true);
   b2.setEnabled(true);
   b2.setIcon(ic32);
   b3.setVisible(true);
   b3.setEnabled(true);
   b3.setIcon(ic33);
   b4.setVisible(true);
   b4.setEnabled(true);
   b4.setIcon(ic34);
   b5.setVisible(true);
   b5.setEnabled(true);
   b5.setIcon(ic35);
   b6.setVisible(true);
   b6.setEnabled(true);
   b6.setIcon(ic36);
   b7.setVisible(true);
   b7.setEnabled(true);
   b7.setIcon(ic37);
   b8.setVisible(true);
   b8.setEnabled(true);
   b8.setIcon(ic38);
   b9.setVisible(true);
   b9.setEnabled(true);
   b9.setIcon(ic39);
   star=b6.getIcon();
   starB.setIcon(ic30);
   }

  //setMedium
  b14.setVisible(false);
  b14.setEnabled(false);
  b18.setVisible(false);
  b18.setEnabled(false);
  b22.setVisible(false);
  b22.setEnabled(false);
  b23.setVisible(false);
  b23.setEnabled(false);
  b24.setVisible(false);
  b24.setEnabled(false);
  b25.setVisible(false);
  b25.setEnabled(false);
  b26.setVisible(false);
  b26.setEnabled(false);

  //setHard
  b51.setVisible(false);
  b51.setEnabled(false);
  b52.setVisible(false);
  b52.setEnabled(false);
  b53.setVisible(false);
  b53.setEnabled(false);
  b54.setVisible(false);
  b54.setEnabled(false);
  b55.setVisible(false);
  b55.setEnabled(false);
  b56.setVisible(false);
  b56.setEnabled(false);
  b57.setVisible(false);
  b57.setEnabled(false);
  b58.setVisible(false);
  b58.setEnabled(false);
  b59.setVisible(false);
  b59.setEnabled(false);
}

//medium button
if(e.getSource()==bMedium){
  Icon s1=sample.getIcon();
  if(s1==samicon1){
   b1.setIcon(ic48);
   b2.setIcon(ic47);
   b3.setIcon(ic49);
   b4.setIcon(ic51);
   b5.setIcon(ic52);
   b6.setIcon(ic53);
   b7.setIcon(ic54);
   b8.setIcon(ic55);
   b9.setIcon(ic56);
   b14.setVisible(true);
   b14.setEnabled(true);
   b14.setIcon(ic41);
   b18.setVisible(true);
   b18.setEnabled(true);
   b18.setIcon(ic42);
   b22.setVisible(true);
   b22.setEnabled(true);
   b22.setIcon(ic43);
   b23.setVisible(true);
   b23.setEnabled(true);
   b23.setIcon(ic44);
   b24.setVisible(true);
   b24.setEnabled(true);
   b24.setIcon(ic45);
   b25.setVisible(true);
   b25.setEnabled(true);
   b25.setIcon(ic46);
   b26.setVisible(true);
   b26.setEnabled(true);
   b26.setIcon(ic47);
   star=b6.getIcon();
   starB.setIcon(ic40);
  }

  if(s1==samicon2){
    b1.setIcon(ic61);
    b2.setIcon(ic62);
    b3.setIcon(ic63);
    b4.setIcon(ic64);
    b5.setIcon(ic65);
    b6.setIcon(ic66);
    b7.setIcon(ic67);
    b8.setIcon(ic68);
    b9.setIcon(ic69);
    b14.setVisible(true);
    b14.setEnabled(true);
    b14.setIcon(ic71);
    b18.setVisible(true);
    b18.setEnabled(true);
    b18.setIcon(ic72);
    b22.setVisible(true);
    b22.setEnabled(true);
    b22.setIcon(ic73);
    b23.setVisible(true);
    b23.setEnabled(true);
    b23.setIcon(ic74);
    b24.setVisible(true);
    b24.setEnabled(true);
    b24.setIcon(ic75);
    b25.setVisible(true);
    b25.setEnabled(true);
    b25.setIcon(ic76);
    b26.setVisible(true);
    b26.setEnabled(true);
    b26.setIcon(ic77);
    star=b6.getIcon();
    starB.setIcon(ic50);
   }

   if(s1==samicon3){
    b1.setIcon(ic81);
    b2.setIcon(ic82);
    b3.setIcon(ic83);
    b4.setIcon(ic84);
    b5.setIcon(ic85);
    b6.setIcon(ic86);
    b7.setIcon(ic87);
    b8.setIcon(ic88);
    b9.setIcon(ic89);
    b14.setVisible(true);
    b14.setEnabled(true);
    b14.setIcon(ic91);
    b18.setVisible(true);
    b18.setEnabled(true);
    b18.setIcon(ic92);
    b22.setVisible(true);
    b22.setEnabled(true);
    b22.setIcon(ic93);
    b23.setVisible(true);
    b23.setEnabled(true);
    b23.setIcon(ic94);
    b24.setVisible(true);
    b24.setEnabled(true);
    b24.setIcon(ic95);
    b25.setVisible(true);
    b25.setEnabled(true);
    b25.setIcon(ic96);
    b26.setVisible(true);
    b26.setEnabled(true);
    b26.setIcon(ic97);
    star=b6.getIcon();
    starB.setIcon(ic60);
   }

   if(s1==samicon4){
    b1.setIcon(ic101);
    b2.setIcon(ic102);
    b3.setIcon(ic103);
    b4.setIcon(ic104);
    b5.setIcon(ic105);
    b6.setIcon(ic106);
    b7.setIcon(ic107);
    b8.setIcon(ic108);
    b9.setIcon(ic109);
    b14.setVisible(true);
    b14.setEnabled(true);
    b14.setIcon(ic111);
    b18.setVisible(true);
    b18.setEnabled(true);
    b18.setIcon(ic112);
    b22.setVisible(true);
    b22.setEnabled(true);
    b22.setIcon(ic113);
    b23.setVisible(true);
    b23.setEnabled(true);
    b23.setIcon(ic114);
    b24.setVisible(true);
    b24.setEnabled(true);
    b24.setIcon(ic115);
    b25.setVisible(true);
    b25.setEnabled(true);
    b25.setIcon(ic116);
    b26.setVisible(true);
    b26.setEnabled(true);
    b26.setIcon(ic117);
    star=b6.getIcon();
    starB.setIcon(ic70);
   }
 
    //setHard
  b51.setVisible(false);
  b51.setEnabled(false);
  b52.setVisible(false);
  b52.setEnabled(false);
  b53.setVisible(false);
  b53.setEnabled(false);
  b54.setVisible(false);
  b54.setEnabled(false);
  b55.setVisible(false);
  b55.setEnabled(false);
  b56.setVisible(false);
  b56.setEnabled(false);
  b57.setVisible(false);
  b57.setEnabled(false);
  b58.setVisible(false);
  b58.setEnabled(false);
  b59.setVisible(false);
  b59.setEnabled(false);

}
// hard button 5x5
if(e.getSource()==bHard){
  Icon s1=sample.getIcon();
  if(s1==samicon1){
    b1.setIcon(id01);
    b2.setIcon(id02);
    b3.setIcon(id03);
    b4.setIcon(id04);
    b5.setIcon(id05);
    b6.setIcon(id06);
    b7.setIcon(id07);
    b8.setIcon(id08);
    b9.setIcon(id09);
    b14.setVisible(true);
    b14.setEnabled(true);
    b14.setIcon(id11);
    b18.setVisible(true);
    b18.setEnabled(true);
    b18.setIcon(id12);
    b22.setVisible(true);
    b22.setEnabled(true);
    b22.setIcon(id13);
    b23.setVisible(true);
    b23.setEnabled(true);
    b23.setIcon(id14);
    b24.setVisible(true);
    b24.setEnabled(true);
    b24.setIcon(id15);
    b25.setVisible(true);
    b25.setEnabled(true);
    b25.setIcon(id16);
    b26.setVisible(true);
    b26.setEnabled(true);
    b26.setIcon(id17);
    b51.setVisible(true);
    b51.setEnabled(true);
    b51.setIcon(id18);
    b52.setVisible(true);
    b52.setEnabled(true);
    b52.setIcon(id19);
    b53.setVisible(true);
    b53.setEnabled(true);
    b53.setIcon(id21);
    b54.setVisible(true);
    b54.setEnabled(true);
    b54.setIcon(id22);
    b55.setVisible(true);
    b55.setEnabled(true);
    b55.setIcon(id23);
    b56.setVisible(true);
    b56.setEnabled(true);
    b56.setIcon(id24);
    b57.setVisible(true);
    b57.setEnabled(true);
    b57.setIcon(id25);
    b58.setVisible(true);
    b58.setEnabled(true);
    b58.setIcon(id26);
    b59.setVisible(true);
    b59.setEnabled(true);
    b59.setIcon(id27);
    star=b6.getIcon();
    starB.setIcon(ic80);
   }

   if(s1==samicon2){
    b1.setIcon(id31);
    b2.setIcon(id32);
    b3.setIcon(id33);
    b4.setIcon(id34);
    b5.setIcon(id35);
    b6.setIcon(id36);
    b7.setIcon(id37);
    b8.setIcon(id38);
    b9.setIcon(id39);
    b14.setVisible(true);
    b14.setEnabled(true);
    b14.setIcon(id41);
    b18.setVisible(true);
    b18.setEnabled(true);
    b18.setIcon(id42);
    b22.setVisible(true);
    b22.setEnabled(true);
    b22.setIcon(id43);
    b23.setVisible(true);
    b23.setEnabled(true);
    b23.setIcon(id44);
    b24.setVisible(true);
    b24.setEnabled(true);
    b24.setIcon(id45);
    b25.setVisible(true);
    b25.setEnabled(true);
    b25.setIcon(id46);
    b26.setVisible(true);
    b26.setEnabled(true);
    b26.setIcon(id47);
    b51.setVisible(true);
    b51.setEnabled(true);
    b51.setIcon(id48);
    b52.setVisible(true);
    b52.setEnabled(true);
    b52.setIcon(id49);
    b53.setVisible(true);
    b53.setEnabled(true);
    b53.setIcon(id51);
    b54.setVisible(true);
    b54.setEnabled(true);
    b54.setIcon(id52);
    b55.setVisible(true);
    b55.setEnabled(true);
    b55.setIcon(id53);
    b56.setVisible(true);
    b56.setEnabled(true);
    b56.setIcon(id54);
    b57.setVisible(true);
    b57.setEnabled(true);
    b57.setIcon(id55);
    b58.setVisible(true);
    b58.setEnabled(true);
    b58.setIcon(id56);
    b59.setVisible(true);
    b59.setEnabled(true);
    b59.setIcon(id57);
    star=b6.getIcon();
    starB.setIcon(ic90);
   }

   if(s1==samicon3){
    b1.setIcon(id61);
    b2.setIcon(id62);
    b3.setIcon(id63);
    b4.setIcon(id64);
    b5.setIcon(id65);
    b6.setIcon(id66);
    b7.setIcon(id67);
    b8.setIcon(id68);
    b9.setIcon(id69);
    b14.setVisible(true);
    b14.setEnabled(true);
    b14.setIcon(id71);
    b18.setVisible(true);
    b18.setEnabled(true);
    b18.setIcon(id72);
    b22.setVisible(true);
    b22.setEnabled(true);
    b22.setIcon(id73);
    b23.setVisible(true);
    b23.setEnabled(true);
    b23.setIcon(id74);
    b24.setVisible(true);
    b24.setEnabled(true);
    b24.setIcon(id75);
    b25.setVisible(true);
    b25.setEnabled(true);
    b25.setIcon(id76);
    b26.setVisible(true);
    b26.setEnabled(true);
    b26.setIcon(id77);
    b51.setVisible(true);
    b51.setEnabled(true);
    b51.setIcon(id78);
    b52.setVisible(true);
    b52.setEnabled(true);
    b52.setIcon(id79);
    b53.setVisible(true);
    b53.setEnabled(true);
    b53.setIcon(id81);
    b54.setVisible(true);
    b54.setEnabled(true);
    b54.setIcon(id82);
    b55.setVisible(true);
    b55.setEnabled(true);
    b55.setIcon(id83);
    b56.setVisible(true);
    b56.setEnabled(true);
    b56.setIcon(id84);
    b57.setVisible(true);
    b57.setEnabled(true);
    b57.setIcon(id85);
    b58.setVisible(true);
    b58.setEnabled(true);
    b58.setIcon(id86);
    b59.setVisible(true);
    b59.setEnabled(true);
    b59.setIcon(id87);
    star=b6.getIcon();
    starB.setIcon(ic100);
   }

   if(s1==samicon4){
    b1.setIcon(ie01);
    b2.setIcon(ie02);
    b3.setIcon(ie03);
    b4.setIcon(ie04);
    b5.setIcon(ie05);
    b6.setIcon(ie06);
    b7.setIcon(ie07);
    b8.setIcon(ie08);
    b9.setIcon(ie09);
    b14.setVisible(true);
    b14.setEnabled(true);
    b14.setIcon(ie11);
    b18.setVisible(true);
    b18.setEnabled(true);
    b18.setIcon(ie12);
    b22.setVisible(true);
    b22.setEnabled(true);
    b22.setIcon(ie13);
    b23.setVisible(true);
    b23.setEnabled(true);
    b23.setIcon(ie14);
    b24.setVisible(true);
    b24.setEnabled(true);
    b24.setIcon(ie15);
    b25.setVisible(true);
    b25.setEnabled(true);
    b25.setIcon(ie16);
    b26.setVisible(true);
    b26.setEnabled(true);
    b26.setIcon(ie17);
    b51.setVisible(true);
    b51.setEnabled(true);
    b51.setIcon(ie18);
    b52.setVisible(true);
    b52.setEnabled(true);
    b52.setIcon(ie19);
    b53.setVisible(true);
    b53.setEnabled(true);
    b53.setIcon(ie21);
    b54.setVisible(true);
    b54.setEnabled(true);
    b54.setIcon(ie22);
    b55.setVisible(true);
    b55.setEnabled(true);
    b55.setIcon(ie23);
    b56.setVisible(true);
    b56.setEnabled(true);
    b56.setIcon(ie24);
    b57.setVisible(true);
    b57.setEnabled(true);
    b57.setIcon(ie25);
    b58.setVisible(true);
    b58.setEnabled(true);
    b58.setIcon(ie26);
    b59.setVisible(true);
    b59.setEnabled(true);
    b59.setIcon(ie27);
    star=b6.getIcon();
    starB.setIcon(ic110);
   }

 
   
 

}

if(e.getSource()==bSolve){
  Icon s1=starB.getIcon();
  if(s1==ic0){
   b1.setIcon(ic8);
   b2.setIcon(ic7);
   b3.setIcon(ic4);
   b4.setIcon(ic6);
   b5.setIcon(ic2);
   b6.setIcon(ic5);
   b7.setIcon(ic9);
   b8.setIcon(ic3);
   b9.setIcon(ic1);
  }

  if(s1==ic10){
    b1.setIcon(ic18);
    b2.setIcon(ic17);
    b3.setIcon(ic14);
    b4.setIcon(ic16);
    b5.setIcon(ic12);
    b6.setIcon(ic15);
    b7.setIcon(ic19);
    b8.setIcon(ic13);
    b9.setIcon(ic11);
   }

   if(s1==ic20){
    b1.setIcon(ic28);
    b2.setIcon(ic27);
    b3.setIcon(ic24);
    b4.setIcon(ic26);
    b5.setIcon(ic22);
    b6.setIcon(ic25);
    b7.setIcon(ic29);
    b8.setIcon(ic23);
    b9.setIcon(ic21);
   }

   if(s1==ic30){
    b1.setIcon(ic38);
    b2.setIcon(ic37);
    b3.setIcon(ic34);
    b4.setIcon(ic36);
    b5.setIcon(ic32);
    b6.setIcon(ic35);
    b7.setIcon(ic39);
    b8.setIcon(ic33);
    b9.setIcon(ic31);
   }

   
   if(s1==ic40){
   b1.setIcon(ic44);
   b2.setIcon(ic42);
   b3.setIcon(ic46);
   b4.setIcon(ic45);
   b5.setIcon(ic47);
   b6.setIcon(ic41);
   b7.setIcon(ic54);
   b8.setIcon(ic56);
   b9.setIcon(ic55);
   b14.setIcon(ic43);
   b18.setIcon(ic57);
   b22.setIcon(ic52);
   b23.setIcon(ic53);
   b24.setIcon(ic49);
   b25.setIcon(ic51);
   b26.setIcon(ic48);
   }

   if(s1==ic50){
    b1.setIcon(ic64);
    b2.setIcon(ic62);
    b3.setIcon(ic66);
    b4.setIcon(ic65);
    b5.setIcon(ic67);
    b6.setIcon(ic61);
    b7.setIcon(ic74);
    b8.setIcon(ic76);
    b9.setIcon(ic75);
    b14.setIcon(ic63);
    b18.setIcon(ic77);
    b22.setIcon(ic72);
    b23.setIcon(ic73);
    b24.setIcon(ic69);
    b25.setIcon(ic71);
    b26.setIcon(ic68);
    }

    if(s1==ic60){
      b1.setIcon(ic84);
      b2.setIcon(ic82);
      b3.setIcon(ic86);
      b4.setIcon(ic85);
      b5.setIcon(ic87);
      b6.setIcon(ic81);
      b7.setIcon(ic94);
      b8.setIcon(ic96);
      b9.setIcon(ic95);
      b14.setIcon(ic83);
      b18.setIcon(ic97);
      b22.setIcon(ic92);
      b23.setIcon(ic93);
      b24.setIcon(ic89);
      b25.setIcon(ic91);
      b26.setIcon(ic88);
      }

      if(s1==ic70){
        b1.setIcon(ic104);
        b2.setIcon(ic102);
        b3.setIcon(ic106);
        b4.setIcon(ic105);
        b5.setIcon(ic107);
        b6.setIcon(ic101);
        b7.setIcon(ic114);
        b8.setIcon(ic116);
        b9.setIcon(ic115);
        b14.setIcon(ic103);
        b18.setIcon(ic117);
        b22.setIcon(ic112);
        b23.setIcon(ic113);
        b24.setIcon(ic109);
        b25.setIcon(ic111);
        b26.setIcon(ic108);
        }

        if(s1==ic80){
          b1.setIcon(id26);
          b2.setIcon(id27);
          b3.setIcon(id24);
          b4.setIcon(id19);
          b5.setIcon(id21);
          b6.setIcon(id23);
          b7.setIcon(id15);
          b8.setIcon(id16);
          b9.setIcon(id13);
          b14.setIcon(id25);
          b18.setIcon(id17);
          b22.setIcon(id14);
          b23.setIcon(id12);
          b24.setIcon(id08);
          b25.setIcon(id09);
          b26.setIcon(id06);
          b51.setIcon(id22);
          b52.setIcon(id18);
          b53.setIcon(id11);
          b54.setIcon(id07);
          b55.setIcon(id04);
          b56.setIcon(id05);
          b57.setIcon(id02);
          b58.setIcon(id03);
          b59.setIcon(id01); 
          }

          if(s1==ic90){
            b1.setIcon(id56);
            b2.setIcon(id57);
            b3.setIcon(id54);
            b4.setIcon(id53);
            b5.setIcon(id49);
            b6.setIcon(id51);
            b7.setIcon(id45);
            b8.setIcon(id46);
            b9.setIcon(id43);
            b14.setIcon(id55);
            b18.setIcon(id47);
            b22.setIcon(id44);
            b23.setIcon(id42);
            b24.setIcon(id38);
            b25.setIcon(id39);
            b26.setIcon(id36);
            b51.setIcon(id52);
            b52.setIcon(id48);
            b53.setIcon(id41);
            b54.setIcon(id37);
            b55.setIcon(id34);
            b56.setIcon(id35);
            b57.setIcon(id32);
            b58.setIcon(id33);
            b59.setIcon(id31); 
            }

            if(s1==ic100){
              b1.setIcon(id86);
              b2.setIcon(id87);
              b3.setIcon(id84);
              b4.setIcon(id83);
              b5.setIcon(id79);
              b6.setIcon(id81);
              b7.setIcon(id75);
              b8.setIcon(id76);
              b9.setIcon(id73);
              b14.setIcon(id85);
              b18.setIcon(id77);
              b22.setIcon(id74);
              b23.setIcon(id72);
              b24.setIcon(id68);
              b25.setIcon(id69);
              b26.setIcon(id66);
              b51.setIcon(id82);
              b52.setIcon(id78);
              b53.setIcon(id71);
              b54.setIcon(id67);
              b55.setIcon(id64);
              b56.setIcon(id65);
              b57.setIcon(id62);
              b58.setIcon(id63);
              b59.setIcon(id61); 
              }

              if(s1==ic110){
                b1.setIcon(ie26);
                b2.setIcon(ie27);
                b3.setIcon(ie24);
                b4.setIcon(ie23);
                b5.setIcon(ie19);
                b6.setIcon(ie21);
                b7.setIcon(ie15);
                b8.setIcon(ie16);
                b9.setIcon(ie13);
                b14.setIcon(ie25);
                b18.setIcon(ie17);
                b22.setIcon(ie14);
                b23.setIcon(ie12);
                b24.setIcon(ie08);
                b25.setIcon(ie09);
                b26.setIcon(ie06);
                b51.setIcon(ie22);
                b52.setIcon(ie18);
                b53.setIcon(ie11);
                b54.setIcon(ie07);
                b55.setIcon(ie04);
                b56.setIcon(ie05);
                b57.setIcon(ie02);
                b58.setIcon(ie03);
                b59.setIcon(ie01); 
                }
}

}//end of actionPerformed




// main method to start puzzle
public static void main(String args[]){
new picpuzzle2();
}//end of main
}//end of class