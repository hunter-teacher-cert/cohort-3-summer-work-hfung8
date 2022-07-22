// Follow along with Yenmin as she demonstrates how to make a Smiley function and a Flag Function.  Then try the exercises on your own.  At the end, you'll define your own function.

function setup() {
  createCanvas(700, 700);
  background(255);
}

function draw() {
  smiley(240, 100, "orange", "blue");
  threeColorFlag("green", "Navy", "violet");
  targetLogo(400, 400, "gold", "white")
  microsoft("pink", "lavender", "lime", "blue")
  merpEmoji("brown", "black", "red")
  nametag(300, 50, "red", "pink", "white", "Harry")
}

// Demo Part 1: Define a function, call it in the draw function, and create a color parameter
// Define a Smiley Function
function smiley(x, y, faceColor, mouthColor){
  stroke("black")
  // Face
  fill(faceColor)
  ellipse(x, y, 100)
  // Eyes
  fill("black")
  ellipse(x-15, y-5, 15)
  ellipse(x+15, y-5, 15)
  // Mouth
  fill(mouthColor);
  arc(x, y+15, 40, 40, 0, PI, CHORD)
}



// Demo Part 2: Create multiple parameters
// Define a Flag Function
function threeColorFlag(c1, c2, c3){
  noStroke()
  fill(c1)
  rect(50, 200, 50, 100)
  fill(c2)
  rect(100, 200, 50, 100)
  fill(c3)
  rect(150, 200, 50, 100)
}

// PART I: Follow the directions for each question.  Modify the funtions to include color parameters.  Then make your own function. --------------------------------

// BASIC
// 1. Change the targetLogo function to include 1 (or 2) color parameter(s).  Don't forget to call it in the draw function.
function targetLogo(x, y, c1, c2){
  noStroke()
  fill(c1)
  ellipse(x, y, 200)
  fill(c2)
  ellipse(x, y, 150)
  fill(c1)
  ellipse(x, y, 100)
  fill(c2)
  ellipse(x, y, 50)
}


// BASIC
// 2. Change the microsoft function to include 4 color parameters.
function microsoft(c1, c2, c3, c4){
  fill(c1)
  rect(50, 350, 100, 100)
  fill(c2)
  rect(170, 350, 100, 100)
  fill(c3)
  rect(50, 470, 100, 100)
  fill(c4)
  rect(170, 470, 100, 100)
}

// BASIC
// 3. Change the merpEmoji function to include 3 color parameters (for the face, eyes, and mouth).
function merpEmoji(faceColor, eyeColor, mouthColor){
  noStroke()
  fill(faceColor)
  ellipse(100, 100, 100)
  fill(eyeColor)
  ellipse(115, 90, 15, 20)
  ellipse(85, 90, 15, 20)
  strokeWeight(5)
  stroke(mouthColor)
  line(105, 80, 125, 80)
  line(95, 80, 75, 80)
  line(80, 120, 120, 120)
}

// INTERMEDIATE
// 4. Change the nametag function to include a color parameter AND a parameter for the name.
function nametag(x, y, borderColor, backgroundColor, textColor, name){
  noStroke()
  fill(borderColor)
  rect(x, y, 150, 100)
  fill(backgroundColor)
  rect(x+10, y+10, 130, 80)
  fill(textColor)
  stroke("black")
  textSize(16)
  text("Hello, my name is ", x+10, y+30)
  textSize(24)
  text(name, x+30, y+70)
}


// CHALLENGE
// 5. Define your own function!  It can be any simple drawing.  Include at least 3 parameters.











// PART II: Follow the directions for each question.  Modify the funtions to include color parameters.  Then make your own function. --------------------------------

// 6. Go back to the targetLogo function and include x and y parameters, to control its position.


// 7. Go back ot the microsoft function and include x and y parameters.


// 8. Go back to the merpEmoji function and include x and y parameters.


// 9. Go back to the nametag function and include x and y parameters.


// 10. Go back to your own function and include x and y parameters.