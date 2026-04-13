// Arrays to keep track of each task's state
const taskTitles = [];
const taskComplete = [];

// Create a new task by adding to the arrays
// A new task will be created as incomplete
function newTask(title) {
  taskTitles.push(title);
  taskComplete.push(false);
}

// Mark a task as complete by setting the task's status in the `taskComplete` array to `true`
function completeTask(taskIndex) {
  taskComplete[taskIndex] = true;
}

// Print the state of a task to the console in a nice readable way
function logTaskState(taskIndex) {
  const title = taskTitles[taskIndex];
  const complete = taskComplete[taskIndex];
  console.log(`${title} has${complete ? " " : " not "}been completed`);
}

// DRIVER CODE BELOW

newTask("Clean Cat Litter"); // task 0
newTask("Do Laundry"); // task 1

logTaskState(0); // Clean Cat Litter has not been completed
completeTask(0);
logTaskState(0); // Clean Cat Litter has been completed


// Código añadido para generar problemas de calidad

function funcionMala() {
  var a = 1;
  var b = 2;
  var c = 3;
  var d = 4;
  var e = 5;
  var f = 6;
  var g = 7;
  var h = 8;
  var i = 9;
  var j = 10;
  var k = 11;
  var l = 12;
  return a;
}

// Variable insegura
var password = "1234";

// Código duplicado (malo para mantenibilidad)
function duplicado1() {
  console.log("Hola");
}

function duplicado2() {
  console.log("Hola");
}
