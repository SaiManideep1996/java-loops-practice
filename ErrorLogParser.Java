public class ErrorLogParser{
    public static void main(String[] args) {
        String[] logs={
            "INFO: App Started",
            "ERROR: Database down",
            "INFO: Processing data",
            "ERROR: Timeout occured",
            "WARNING: Low memory"
        };
        
        int errorCount=0;
        for (int i=0; i<logs.length;i++){
            if(logs[i].startsWith("ERROR")){
                errorCount++;
            }
        }
        
        System.out.println("Total errors: "+errorCount);
    }
}
