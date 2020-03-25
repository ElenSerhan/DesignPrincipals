//Alan Serhan - Design Principles
//G00349187@gmit.ie
//25/03/2020

package ie.gmit.single;

public class UserPersistenceService {
    private Store store = new Store();

    public void saveUser(User user)
    {
        store.store(user);
    }
}
