//Alan Serhan - Design Principals
//G00349187@gmit.ie
//25/03/2020
//https://github.com/ElenSerhan/DesignPrincipals

package ie.gmit.open;

import java.util.List;

public class PhoneSubscriber extends Subscriber{

    private int baseRate;

    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

    /**
     * @return the baseRate
     */
    public int getBaseRate() {
        return baseRate;
    }

    /**
     * @param baseRate the baseRate to set
     */
    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

}