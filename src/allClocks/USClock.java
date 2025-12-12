package allClocks;
public final class USClock extends Clock {

    private String periodIndicator;

    public void setHour(int hour) {
        setBeforeMidDay();
        if ((hour > 12) && (hour <= 23)) {
            setAfterMidDay();
            this.hour = hour - 12;
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }

    }

    public void setAfterMidDay() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidDay() {
        this.periodIndicator = "AM";
    }

    @Override
    Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();

            }
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        }
        return this;
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPeriodIndicator(String periodIndicator) {
        this.periodIndicator = periodIndicator;
    }

    @Override
    public String getTime() {
        // TODO Auto-generated method stub
        return super.getTime() + " " +this.periodIndicator;
    }

}
