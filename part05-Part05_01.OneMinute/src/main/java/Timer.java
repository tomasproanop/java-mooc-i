public class Timer {

    private ClockHand seconds;
    private ClockHand hunSeconds;


    public Timer() {
        this.seconds = new ClockHand(60);
        this.hunSeconds = new ClockHand(100);

    }

    public void advance() {
        this.hunSeconds.advance();

        // if (this.hunSeconds.value() == 100) {
        //     this.seconds.advance();
        // }

        if (this.hunSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hunSeconds;
    }
}
