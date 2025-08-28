class Main {
    public static void main(String[] args) {
         int[][] timer = {{2}, {30}};
    
        countdownTimer(timer);
    }

    public static void countdownTimer(int[][] timer) {
        int minutes = timer[0][0];
        int seconds = timer[1][0];
        
        while (minutes >= 0) {
            while (seconds >= 0) {
                system.out.println("", minutes, seconds);
                  Thread.sleep(1000); 
                seconds--;
            }
            minutes--;
            seconds = 59;
        }
         System.out.println("Timer finished!");
    }
  
}
