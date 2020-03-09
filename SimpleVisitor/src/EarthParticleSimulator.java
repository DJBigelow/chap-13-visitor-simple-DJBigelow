public class EarthParticleSimulator implements ParticleSimulator {
    public final static int GRAVITY_ACC = -10;
    public final static int WIND_ACC = 5;

    @Override
    public void visit(Particle p) {
        p.setDy(p.getDy() + GRAVITY_ACC / p.getMass());
        p.setY(p.getY() + p.getDy());

        p.setDx(p.getDx() + WIND_ACC / p.getMass());
        p.setX(p.getX() + p.getDx());
    }
}
