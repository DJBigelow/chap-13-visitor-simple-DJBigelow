public class Main {
    public static void main(String[] args) {
        EarthParticleSimulator earthSim = new EarthParticleSimulator();
        MoonParticleSimulator moonSim = new MoonParticleSimulator();

        DustParticle earthDust = new DustParticle(50, 50, 0, 0);
        DustParticle moonDust = new DustParticle(50, 50, 0, 0);

        SandParticle earthSand = new SandParticle(50, 50, 0, 0 );
        SandParticle moonSand = new SandParticle(50, 50, 0, 0 );



        try {
            System.out.println("Running Earth Particle Simulator");

            for (int i = 0; i < 20; ++i) {
                earthDust.acceptSim(earthSim);

                System.out.println("Dust (x, y): (" + earthDust.getX() + ", " + earthDust.getY() + ")");

                Thread.sleep(250);
            }

            for (int i = 0; i < 20; ++i) {
                earthSand.acceptSim(earthSim);

                System.out.println("Sand (x, y): (" + earthSand.getX() + ", " + earthSand.getY() + ")");

                Thread.sleep(250);
            }


            System.out.println("\nRunning Moon Particle Simulator");
            Thread.sleep(1000);

            for (int i = 0; i < 20; ++i) {
                moonDust.acceptSim(moonSim);

                System.out.println("Dust (x, y): (" + moonDust.getX() + ", " + moonDust.getY() + ")");

                Thread.sleep(250);
            }

            for (int i = 0; i < 20; ++i) {
                moonSand.acceptSim(moonSim);

                System.out.println("Sand (x, y): (" + moonSand.getX() + ", " + moonSand.getY() + ")");

                Thread.sleep(250);
            }



        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
