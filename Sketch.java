import processing.core.PApplet;

public class Sketch extends PApplet {

    Mole[] moles = new Mole[5]; // Array of moles
    int score = 0;
    int frameCounter = 0;

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        // Initialize moles
        for(int i = 0; i < moles.length; i++){
            moles[i] = new Mole(this, 40);
        }
        frameRate(30);
    }

    public void draw() {
        background(220);

        // Increase frame counter
        frameCounter++;

        // Every 60 frames (~2 seconds), make a random mole appear
        if(frameCounter % 60 == 0){
            int index = (int)(Math.random() * moles.length);
            moles[index].appear();
        }

        // Display all moles
        for(int i = 0; i < moles.length; i++){
            moles[i].display();
        }

        // Display score
        fill(0);
        textSize(24);
        text("Score: " + score, 20, 30);
    }

    public void mousePressed() {
        // Check all moles
        for(int i = 0; i < moles.length; i++){
            if(moles[i].isVisible()){
                float distance = dist(mouseX, mouseY, moles[i].getx(), moles[i].gety());
                if(distance < moles[i].getDiameter() / 2){
                    if(moles[i].isBomb()){
                        score -= 5; 
                        System.out.println("Hit BOMB!");
                    } else {
                        score += 10; 
                        System.out.println("Hit Mole!");
                    }
                    moles[i].disappear(); 
                }
            }
        }
    }
}

