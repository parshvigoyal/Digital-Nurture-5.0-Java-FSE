public class ProxyPattern {

    interface Image {
        void display();
    }

    static class RealImage implements Image {

        private String fileName;

        RealImage(String fileName) {
            this.fileName = fileName;
            loadFromServer();
        }

        private void loadFromServer() {
            System.out.println("Loading " + fileName + " from remote server...");
        }

        public void display() {
            System.out.println("Displaying " + fileName);
        }
    }

    static class ProxyImage implements Image {

        private String fileName;
        private RealImage realImage;

        ProxyImage(String fileName) {
            this.fileName = fileName;
        }

        public void display() {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
    }

    public static void main(String[] args) {

        Image image = new ProxyImage("profile.jpg");

        System.out.println("First Display:");
        image.display();

        System.out.println();

        System.out.println("Second Display:");
        image.display();
    }
}