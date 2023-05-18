public class Video {
    public enum CheckoutStatus {
        AVAILABLE, CHECKED_OUT;
    }

    private String name;
    private CheckoutStatus status;
    private int rating;

    public Video(String name) {
        this.name = name;
        this.status = CheckoutStatus.AVAILABLE;
        this.rating = 0;
    }

    public boolean doCheckout() {
        if (status == CheckoutStatus.AVAILABLE) {
            status = CheckoutStatus.CHECKED_OUT;
        }
        return false;
    }

    public void doReturn() {
        if (status == CheckoutStatus.CHECKED_OUT) {
            status = CheckoutStatus.AVAILABLE;
        }
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public CheckoutStatus getStatus() {
        return status;
    }

    public int getRating() {
        return rating;
    }
}