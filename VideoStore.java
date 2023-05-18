import java.util.ArrayList;
import java.util.List;

public class VideoStore {

    /**
     *
     */
    private List<Video> videos;

    public VideoStore(List<Video> videos) {
        this.videos = videos;
    }

    public VideoStore() {
        videos = new ArrayList<>();
    }

    public void addVideo(String name) {
        Video video = new Video(name);
        videos.add(video);
        System.out.println("Video \"" + video.getName() + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (Video video : videos) {
            if (video.getName().equals(name)) {
                video.doCheckout();
                System.out.println("Video \"" + video.getName() + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }

    public void doReturn(String name) {
        for (Video video : videos) {
            if (video.getName().equals(name)) {
                video.doReturn();
                System.out.println("Video \"" + video.getName() + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }

    public void receiveRating(String name, int rating) {
        for (Video video : videos) {
            if (video.getName().equals(name)) {
                video.receiveRating(rating);
                System.out.println("Rating " + rating + " has been mapped to the Video \"" + video.getName() + "\".");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }

    public void listInventory() {
        System.out.println("Video Name | Checkout Status | Rating");
        System.out.println("-------------------------------------");
        for (Video video : videos) {
            System.out.printf("%-10s| %-15s| %d\n", video.getName(), video.doCheckout() ? "Checked out" : "Available", video.getRating());
        }
        System.out.println("-------------------------------------");
    }
}