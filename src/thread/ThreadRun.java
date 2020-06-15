package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadRun {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1-startTime1);


        ExecutorService service = Executors.newCachedThreadPool();  //创建线程池
        long startTime2 = System.currentTimeMillis();
        for(int i=1;i<=5;i++){
            service.execute(() -> {
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            });
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2-startTime2);
    }
}
