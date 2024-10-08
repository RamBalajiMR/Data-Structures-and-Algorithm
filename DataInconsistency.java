public class DataInconsistency{
    public static void main(String[] args){
    	MainObject mo = new MainObject();
        Thread t1 = new Thread(mo);
        t1.start();
        mo.incbyfifteen();
    }
}
class MainObject implements Runnable{
    int a = 45;
    public void run(){
        incbyten();
    }
    synchronized void incbyten(){
	for(int i=0;i<10;i++){
	    a+=10;
	    System.out.println(a);
	}
    }
    synchronized void incbyfifteen(){
	for(int i=0;i<10;i++){
	    a+=15;
	    System.out.println(a);
	}
    }
}
