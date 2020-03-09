public class SandParticle extends Particle{

    public SandParticle(int x, int y, int dx, int dy) {
       super(x, y, dx, dy);
       mass = 10;
    }

    @Override
    public void acceptSim(ParticleSimulator particleSimulator) {
        particleSimulator.visit(this);
    }
}
