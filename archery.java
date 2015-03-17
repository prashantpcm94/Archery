package javaapplication6;
import java.applet.Applet;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
public class NewApplet extends Applet implements Runnable, KeyListener
{
    Thread t=null;    
    public void init()
    {
       setBackground(Color.GREEN);
       addKeyListener(this);
    }
    public void keyReleased(KeyEvent ke)
    {
        
    }
    public void keyTyped(KeyEvent ke)
    {
        
    }
    int r=10,b=50;
    int o=-1;
   
    int[] a=new int[10],x=new int[10];
    boolean s=false,h=true;
    boolean v=false;
    public void keyPressed(KeyEvent ke)
    {
        int k=ke.getKeyCode();
        if(k==KeyEvent.VK_DOWN)
        {
         
            if(b<=600)
                b+=100;
            
        }
        if(k==KeyEvent.VK_UP)
        {
           
            if(b>=100)
            {
                b-=100;
            }
        }
        
      
            if(k==KeyEvent.VK_F)
             {
                   s=true;
                   if(o<=8)
                   {
                     o++;
                   a[o]=150;
                   x[o]=b;
                   }
                   repaint();
                   r--;
                  
             }
            if(k==KeyEvent.VK_G)
            {
               h=true;
               s=false;
               v=false;
               d=600;
               q=10;
               o=-1;
        e[0]=850;
        e[1]=900;
        e[2]=950;
        e[3]=1000;
        e[4]=1050;
        e[5]=1100;
        e[6]=1150;
        e[7]=1200;
        e[8]=1250;
        e[9]=1300;
        r=10;        
            }
        }
    
    public void start()
    {
        t=new Thread(this);
        t.start();
        e[0]=850;
        e[1]=900;
        e[2]=950;
        e[3]=1000;
        e[4]=1050;
        e[5]=1100;
        e[6]=1150;
        e[7]=1200;
        e[8]=1250;
        e[9]=1300;
         
    }
    int d=600;
    int[] e=new int[10];
    int q=10;
    public void run()
    {
        if(h)
        {
        try
        {
            for(;;)
            {
               d-=10;
               if(d==-120)
                   d=600;
               for(int i=0;i<=o;i++)
               a[i]+=10;
              
               if(a[9]==1350)
               {
                    if(r==0&&o==9)
                   {
                       h=false;
                   }
               }
               for(int i=0;i<10;i++)
               {
                  for(int j=0;j<=o;j++)
                   if(a[j]+80>=e[i]&&a[j]+80<=e[i]+50&&x[o]>=d&&x[o]<=d+60)
                   {
                       e[i]=2000;
                       q--;
                   }
               }
               Thread.sleep(50);
               repaint();
            }
        }
        catch(Exception e)
        {}
    }
    }
    public void paint(Graphics g)
    {
        setForeground(Color.RED);
        if(!h)
        {
             setForeground(Color.black);
            g.drawString("GAME OVER",100,100);
            g.drawString("PRESS G TO START",100,150);
            setForeground(Color.RED);
            try
        {
            Thread.sleep(1000);
        }
        catch(Exception e){}
           
        }
       else
       {
            for(int i=0;i<10;i++)
        {
            g.fillOval(e[i],d,50,60);                        
        }
            
            for(int i=0;i<r;i++)
            {
        g.drawLine(40, b+i*5-10, 120,b+i*5-10);
        int[] l={120,114,114};
        int[] m={b+i*5-10,b-14+i*5,b-6+i*5};
       g.setColor(Color.BLACK);
        g.fillPolygon(l,m, 3);
        g.setColor(Color.RED);
            }
        g.drawString("PRESS F TO SHOOT",500,100);
        g.drawString("PRESS G TO RESTART",500,150);
        if(s)
        {
            for(int i=0;i<=o;i++)
            {
            g.drawLine(a[i], x[o], a[i]+80, x[o]);
            int[] l={a[i]+80,a[i]+80-6,a[i]+80-6};
        int[] m={x[o],x[o]-4,x[o]+4};
       g.setColor(Color.BLACK);
        g.fillPolygon(l,m, 3);
        g.setColor(Color.RED);
            }
        }
       }
        
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
