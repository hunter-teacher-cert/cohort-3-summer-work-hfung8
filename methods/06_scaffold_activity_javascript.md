// Follow along with Yenmin as she demonstrates how to make a Smiley function and a Flag Function.  Then try the exercises on your own.  At the end, you'll define your own function.

function setup() {
  createCanvas(500, 500);
  background(255);
}

function draw() {
  
}

// Demo Part 1: Define a function, call it in the draw function, and create a color parameter
// Define a Smiley Function
function smiley(){
  stroke("black")
  // Face
  fill("yellow")
  ellipse(100, 100, 100)
  // Eyes
  fill("black")
  ellipse(85, 95, 15)
  ellipse(115, 95, 15)
  // Mouth
  fill("pink")
  arc(100, 115, 40, 40, 0, PI, CHORD)
}



// Demo Part 2: Create multiple parameters
// Define a Flag Function
function threeColorFlag(){
  noStroke()
  fill("red")
  rect(50, 200, 100, 200)
  fill("white")
  rect(150, 200, 100, 200)
  fill("green")
  rect(250, 200, 100, 200)
}

// PART I: Follow the directions for each question.  Modify the funtions to include color parameters.  Then make your own function. --------------------------------

// BASIC
// 1. Change the targetLogo function to include 1 (or 2) color parameter(s).  Don't forget to call it in the draw function.
function targetLogo(){
  noStroke()
  fill("red")
  ellipse(200, 200, 200)
  fill("white")
  ellipse(200, 200, 150)
  fill("red")
  ellipse(200, 200, 100)
  fill("white")
  ellipse(200, 200, 50)
}


// BASIC
// 2. Change the microsoft function to include 4 color parameters.
function microsoft(){
  fill("red")
  rect(100, 100, 100, 100)
  fill("green")
  rect(220, 100, 100, 100)
  fill("blue")
  rect(100, 220, 100, 100)
  fill("yellow")
  rect(220, 220, 100, 100)
}

// BASIC
// 3. Change the merpEmoji function to include 3 color parameters (for the face, eyes, and mouth).
function merpEmoji(){
  noStroke()
  fill("yellow")
  ellipse(100, 100, 100)
  fill("black")
  ellipse(115, 90, 15, 20)
  ellipse(85, 90, 15, 20)
  strokeWeight(5)
  stroke("black")
  line(105, 80, 125, 80)
  line(95, 80, 75, 80)
  line(80, 120, 120, 120)
}

// INTERMEDIATE
// 4. Change the nametag function to include a color parameter AND a parameter for the name.
function nametag(){
  noStroke()
  fill("red")
  rect(50, 50, 150, 100)
  fill("white")
  rect(60, 60, 130, 80)
  fill("black")
  stroke("black")
  textSize(16)
  text("Hello, my name is ", 60, 80)
  textSize(24)
  text("Mark", 80, 120)
}


// CHALLENGE
// 5. Define your own function!  It can be any simple drawing.  Include at least 3 parameters.











// PART II: Follow the directions for each question.  Modify the funtions to include color parameters.  Then make your own function. --------------------------------

// 6. Go back to the targetLogo function and include x and y parameters, to control its position.


// 7. Go back ot the microsoft function and include x and y parameters.


// 8. Go back to the merpEmoji function and include x and y parameters.


// 9. Go back to the nametag function and include x and y parameters.


// 10. Go back to your own function and include x and y parameters.