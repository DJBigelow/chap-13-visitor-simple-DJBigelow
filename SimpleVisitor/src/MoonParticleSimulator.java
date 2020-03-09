public class MoonParticleSimulator implements ParticleSimulator {
    public final static int GRAVITY_ACC = -4;

    @Override
    public void visit(Particle p) {
        p.setDy(p.getDy() + p.getMass() / GRAVITY_ACC );
        p.setY(p.getY() + p.getDy());
        p.setX(p.getX() + p.getDx());
    }
}
