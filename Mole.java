import processing.core.PApplet;

public class Mole {
    PApplet app;
    private int x;
    private int y;
    private int diameter;
    private boolean isBomb;
    private boolean visible;

    // Constructor
    Mole(PApplet app, int diameter) {
        this.app = app;
        this.diameter = diameter;
        this.visible = false;
        randomizeType();
        randomizePosition();
    }

    // Getters
    public int getx() { return x; }
    public int gety() { return y; }
    public int getDiameter() { return diameter; }
    public boolean isBomb() { return isBomb; }
    public boolean isVisible() { return visible; }

    // Appear / disappear
    public void appear() {
        visible = true;
        randomizeType();
        randomizePosition();
    }

    public void disappear() {
        visible = false;
    }

    // Randomize position
    public void randomizePosition() {
        x = (int)(Math.random() * (550 - 50 + 1) + 50);
        y = (int)(Math.random() * (550 - 50 + 1) + 50);
    }

    // Randomize type (5% bomb)
    public void randomizeType() {
        isBomb = Math.random() < 0.05;
    }

    // Display
    public void display() {
        if(!visible) return;

        if(isBomb) {
            app.fill(255, 0, 0);
        } else {
            app.fill(245, 245, 245);
        }
        app.ellipse(x, y, diameter, diameter);

        if(!isBomb) {
            app.fill(0);
            app.ellipse(x, y, (int)(diameter * 0.8), (int)(diameter * 0.8));
            app.fill(245, 245, 245);
            app.ellipse(x, y, (int)(diameter * 0.5), (int)(diameter * 0.5));
            app.fill(255, 0, 0);
            app.ellipse(x, y, (int)(diameter * 0.25), (int)(diameter * 0.25));
        }
    }
}
