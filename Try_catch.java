public class Try_catch {
    public static void main(String[] args) {
       
        try {
            int a[] = new int[5];
            a[5] = 30/5;
            
        } catch (ArithmeticException e)  {
            System.out.println("Arithmetic");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array");

        }catch(Exception e)
        {
            System.out.println("Parent Exception occured");
        }
        System.out.println("Rest of cod is running:");


    }
    
}
