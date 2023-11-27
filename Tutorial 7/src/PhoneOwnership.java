
public class PhoneOwnership {
    private Person person;
    private MobilePhone mobilePhone;

    // constructor

    public PhoneOwnership(Person person, MobilePhone mobilePhone) {
        this.person = person;
        this.mobilePhone = mobilePhone;
    }

    // getters

    public Person getPerson() {
        return person;
    }

    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    // setter

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
