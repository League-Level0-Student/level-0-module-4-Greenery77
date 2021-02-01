PImage face;

void setup() {
 
 face = loadImage("face.jpg");
 
 size(800,500);
 
 face.resize(width, height);
 
 background(face);
 
}

void draw() {
  
  if(mousePressed){
 println(mouseX, mouseY);
  }
 
 if(mouseX < 377){
 mouseX = 377;
 }
 
 if(mouseX > 395){
 mouseX = 395;
 }
 
 if(mouseY < 53){
 mouseY = 53;
 }

  if(mouseY > 76){
 mouseY = 76;
 }
 
 fill(#FFDF3B);
 ellipse(385, 64, 25, 50);
 ellipse(526, 80, 60, 60);
 
 fill(0, 0, 0);
 ellipse(mouseX, mouseY, 5, 25);
 ellipse(mouseX + 141, mouseY + 16, 10, 30);

}
