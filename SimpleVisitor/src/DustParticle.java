public class DustParticle extends Particle {

    public DustParticle(int x, int y, int dx, int dy) {
        super(x, y, dx, dy);
        mass = 5;
    }

    @Override
    public void acceptSim(ParticleSimulator particleSimulator) {
        particleSimulator.visit(this);
    }
}
