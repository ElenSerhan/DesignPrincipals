//Alan Serhan - Design Principals
//G00349187@gmit.ie
//25/03/2020
//https://github.com/ElenSerhan/DesignPrincipals

package ie.gmit.open;

    //base class - closed for modification
    public abstract class Subscriber {

        protected Long subscriberId;

        protected String address;

        protected Long phoneNumber;

        public Long getSubscriberId() {
            return subscriberId;
        }

        public void setSubscriberId(Long subscriberId) {
            this.subscriberId = subscriberId;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public abstract  double calculateBill(); //extension

}
