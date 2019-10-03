package crosszero;
import java.awt.*;
import java.awt.event.*;

public class CROSSZERO extends Frame implements  ActionListener{
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
  Label l1;
  static int x=1;
  static int mat[][]=new int[3][3];
 
  
   static void update(){
       

       
      if(mat[0][0]==1&&mat[0][1]==1&&mat[0][2]==1){
          System.out.println("A is the winnner");
          System.exit(0);
      }
      else if(mat[0][0]==2&&mat[0][1]==2&&mat[0][2]==2){
          
      
          System.out.println("B is winner");
          System.exit(0);
      }
      
      else if(mat[1][0]==1&&mat[1][1]==1&&mat[1][2]==1){
          System.out.println("A is winner");
           System.exit(0);
      }
      
        else if(mat[1][0]==2&&mat[1][1]==2&&mat[1][2]==2){
          System.out.println("B is winner");
           System.exit(0);
      }
      
       else if(mat[2][0]==1&&mat[2][1]==1&&mat[2][2]==1){
          System.out.println("A is the winnner");
           System.exit(0);
      }
      else if(mat[2][0]==2&&mat[2][1]==2&&mat[2][2]==2){
          System.out.println("b is winner");
      }
      
             
      
      else if(mat[0][0]==1&&mat[1][0]==1&&mat[2][0]==1){
          System.out.println("A is the winnner");
           System.exit(0);
      }
      else if(mat[0][0]==2&&mat[1][0]==2&&mat[2][0]==2){
          System.out.println("B is winner");
           System.exit(0);
      }
      
      else if(mat[0][1]==1&&mat[1][1]==1&&  mat[2][1]==1){
          System.out.println("A is winner");
           System.exit(0);
      }
      
        else if(mat[0][1]==2&&mat[1][1]==2&&mat[2][1]==2){
          System.out.println("B is winner");
           System.exit(0);
      }
      
       else if(mat[0][2]==1&&mat[1][2]==1&&mat[2][2]==1){
          System.out.println("A is the winnner");
           System.exit(0);
      }
      else if(mat[0][2]==2&&mat[1][2]==2&&mat[2][2]==2){
          System.out.println("B is winner");
       System.exit(0);
      }
    
      else if(mat[0][0]==1&&mat[1][1]==1&&mat[2][2]==1){
          System.out.println("A is winner");
       System.exit(0);
      }
      else if(mat[0][0]==2&&mat[1][1]==2&&mat[2][2]==2){
          System.out.println("B is winner");
       System.exit(0);
      }
        else if(mat[0][2]==1&&mat[1][1]==1&&mat[2][0]==1){
          System.out.println("A is winner");
           System.exit(0);}
      else if(mat[0][2]==2&&mat[1][1]==2&&mat[2][0]==2){
          System.out.println("B is winner");
       System.exit(0);
      }
      

    
        
             
      
  }
  CROSSZERO(){
      
      this.setLayout(null);
    
       b1=new Button("");
       b2=new Button("");
       b3=new Button("");
       b4=new Button("");
       b5=new Button("");
       b6=new Button("");
       b7=new Button("");
       b8=new Button("");
       b9=new Button("");
       
       
       b1.setBounds(40,150,50,50);
       b2.setBounds(90,150,50,50);
       b3.setBounds(140,150,50,50);
       b4.setBounds(40,200,50,50);
       b5.setBounds(90,200,50,50);
       b6.setBounds(140,200,50,50);
       b7.setBounds(40,250,50,50);
       b8.setBounds(90,250,50,50);
       b9.setBounds(140,250,50,50);
       
       
       this.add(b1);
       this.add(b2);
       this.add(b3);
       this.add(b4);
       this.add(b5);
       this.add(b6);
       this.add(b7);
       this.add(b8);
       this.add(b9);
    
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       
            this.addWindowListener(new WindowAdapter(){
       @Override
       public void windowClosing(WindowEvent e){
           System.exit(0);
       }
 });
  }
  
  public void paint(Graphics g){
      this.setBackground(Color.black);
      
      g.setColor(Color.white);
      Font f =new Font("SansSerif",Font.BOLD,40);
        g.setFont(f);
      g.drawString("CROSS-ZERO",25,100);
  }
  
  public void actionPerformed(ActionEvent ae){   


     if(ae.getSource()==b1){
         if(x==1){
         b1.setLabel("x");
         b1.setBackground(Color.red);
         b1.setForeground(Color.white);
         x--;
         mat[0][0]=1;
     }
         else if(x==0){
             b1.setLabel("o");
              b1.setBackground(Color.blue);
         b1.setForeground(Color.white);
             x++;
             mat[0][0]=2;
         }
  }
     
       if(ae.getSource()==b2){
         if(x==1){
         b2.setLabel("x");
          b2.setBackground(Color.red);
         b2.setForeground(Color.white);
         x--;
         mat[0][1]=1;
     }
         else if(x==0){
             b2.setLabel("o");
              b2.setBackground(Color.blue);
         b2.setForeground(Color.white);
             x++;
             mat[0][1]=2;
         }
  }
       
         if(ae.getSource()==b3){
         if(x==1){
         b3.setLabel("x");
          b3.setBackground(Color.red);
         b3.setForeground(Color.white);
         x--;
         mat[0][2]=1;
     }
         else if(x==0){
             b3.setLabel("o");
              b3.setBackground(Color.blue);
         b3.setForeground(Color.white);
             x++;
             mat[0][2]=2;
         }
  }
         
           if(ae.getSource()==b4){
         if(x==1){
         b4.setLabel("x");
          b4.setBackground(Color.red);
         b4.setForeground(Color.white);
         x--;
         mat[1][0]=1;
     }
         else if(x==0){
             b4.setLabel("o");
              b4.setBackground(Color.blue);
         b4.setForeground(Color.white);
             x++;
             mat[1][0]=2;
         }
         
         
  }
           
             if(ae.getSource()==b5){
         if(x==1){
         b5.setLabel("x");
          b5.setBackground(Color.red);
         b5.setForeground(Color.white);
         x--;
         mat[1][1]=1;
     }
         else if(x==0){
             b5.setLabel("o");
              b5.setBackground(Color.blue);
         b5.setForeground(Color.white);
             x++;
             mat[1][1]=2;
         }
  }
               if(ae.getSource()==b6){
         if(x==1){
         b6.setLabel("x");
          b6.setBackground(Color.red);
         b6.setForeground(Color.white);
         x--;
         mat[1][2]=1;
     }
         else if(x==0){
             b6.setLabel("o");
             x++;
             mat[1][2]=2;
              b6.setBackground(Color.blue);
         b6.setForeground(Color.white);
         }
  }
               
         if(ae.getSource()==b7){
         if(x==1){
         b7.setLabel("x");
          b7.setBackground(Color.red);
         b7.setForeground(Color.white);
         x--;
         mat[2][0]=1;
     }
         else if(x==0){
             b7.setLabel("o");
              b7.setBackground(Color.blue);
         b7.setForeground(Color.white);
             x++;
             mat[2][0]=2;
         }
  }
         
           if(ae.getSource()==b8){
         if(x==1){
         b8.setLabel("x");
          b8.setBackground(Color.red);
         b8.setForeground(Color.white);
         x--;
         mat[2][1]=1;
     }
         else if(x==0){
             b8.setLabel("o");
              b8.setBackground(Color.blue);
         b8.setForeground(Color.white);
             x++;
             mat[2][1]=2;
         }
  }
           
        if(ae.getSource()==b9){
         if(x==1){
         b9.setLabel("x");
         x--;
          b9.setBackground(Color.red);
         b9.setForeground(Color.white);
         mat[2][2]=1;
     }
         else if(x==0){
             b9.setLabel("o");
             x++;
              b9.setBackground(Color.blue);
         b9.setForeground(Color.white);
             mat[2][2]=2;
         }
  }
       
         update();
        
       
  }
  
    public static void main(String[] args) {
        CROSSZERO obj =new CROSSZERO();
       
        obj.setSize(350,350);
        obj.setVisible(true);
        obj.setTitle("PLAY WHAT YOU DREAM");
              
    }
    
}
