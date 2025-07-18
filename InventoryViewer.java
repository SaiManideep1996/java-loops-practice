public class InventoryViewer{
    public static void main(String[] args) {
        String[] inventory={"Mouse", "Keyboard", "Monitor","CPU","USB Cable"};
        System.out.println("Available Inventory");
        for (String item:inventory){
            System.out.println("- "+ item);
            
        }
    }
}
