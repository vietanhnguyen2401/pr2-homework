package ex5;

/**
 * @overview
 *  An electronic device used for communication and entertainment
 */
public class MobilePhone {
    private String manuName;
    private String model;

    public static final int MAX_CONTACT = 200;
    private String[] contactList;

    /**
     * @param manuName
     * @param model
     * @effects     if manuName & model are valid initialize this as
     *                  <manuName, model> else throw new NotPossibleException
     */

    // constructor

    public MobilePhone(String manuName, String model, String[] contactList) {
        this.manuName = manuName;
        this.model = model;
        this.contactList = contactList;
    }

    // getters

    public String getManuName() {
        return manuName;
    }

    public String getModel() {
        return model;
    }

    public String[] getContactList() {
        return contactList;
    }

    // setters

    public void setManuName(String manuName) {
        this.manuName = manuName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setContactList(String[] contactList) {
        this.contactList = contactList;
    }
}
