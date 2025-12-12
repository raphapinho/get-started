package allClocks;
public final class BRLClock extends Clock {

    @Override
    Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock ->
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() + 12 : usClock.getHour();
            case BRLClock brlClock -> this.hour = brlClock.getHour();
        }
        return this;

    }

    @Override
    public String getTime() {
        // TODO Auto-generated method stub
        return super.getTime();
    }
}
