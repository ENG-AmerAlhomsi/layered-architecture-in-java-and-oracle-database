public class Main {
    public static void main(String[] args) {
        // إعداد DataAccessLayer و BusinessLogicLayer و PresentationLayer
        DataAccessLayer dataAccess = new DataAccessLayer();
        BusinessLogicLayer businessLogic = new BusinessLogicLayer(dataAccess);
        PresentationLayer presentation = new PresentationLayer(businessLogic);

        presentation.addProductFromUserInput();
    }
}