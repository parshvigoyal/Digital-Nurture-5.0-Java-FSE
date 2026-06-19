public class BuilderPattern {

    static class Computer {

        private String cpu;
        private int ram;
        private int storage;

        private Computer(Builder builder) {
            this.cpu = builder.cpu;
            this.ram = builder.ram;
            this.storage = builder.storage;
        }

        public void display() {
            System.out.println("CPU: " + cpu);
            System.out.println("RAM: " + ram + " GB");
            System.out.println("Storage: " + storage + " GB");
        }

        static class Builder {
            private String cpu;
            private int ram;
            private int storage;

            Builder setCPU(String cpu) {
                this.cpu = cpu;
                return this;
            }

            Builder setRAM(int ram) {
                this.ram = ram;
                return this;
            }

            Builder setStorage(int storage) {
                this.storage = storage;
                return this;
            }

            Computer build() {
                return new Computer(this);
            }
        }
    }

    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM(16)
                .setStorage(512)
                .build();

        computer.display();
    }
}