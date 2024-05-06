package pertemuan401;

/**
 *
 * @author Chornicles
 */
public class Pertemuan401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bukuteman BTeman = new bukuteman();
//        BTeman.Storedata();
//        BTeman.viewdata();
        String ul = "YA";
        do{
            System.out.println("A. View Data");
            System.out.println("B. Add Data");
            System.out.println("C. Edit Data");
            System.out.println("D. Delete Data");
            System.out.println("E. Exit");
            System.out.println("Choose Option (A/B/C/D/E): ");
            String mPIL = BTeman.dtIN.nextLine();
            switch (mPIL) {
            case"A":
                BTeman.viewdata();
                break;
            case"B":
                BTeman.Storedata();
                break;
            case"C":
                BTeman.Update(0);
                break;
            case"D":
                BTeman.Destroy(0);
                break;
            case"E":
                ul = "tidak";
                break;
            default:
                System.out.println("Sikee That's a Wrong Number ");
            }
        }while(ul.equals("YA"));
    }
    
}
