
    abstract class Animal {
        abstract void walk();
        Animal(){             //constructor
            System.out.println("You are created a animal");
        }
        public void eat(){
            System.out.println("Animal eats");
        }

    }

    class Horse extends Animal {
        Horse(){
            System.out.println("Horse is created");
        }
        public void walk() {
            System.out.println("walk on 4 legs");
        }
    }

    class Chicken extends Animal {
        public void walk() {
            System.out.println("walk on 2 legs");
        }
    }

    class Abstraction {
        public static void main(String[] args) {
            Horse horse = new Horse();
            // horse.walk();
            //horse.eat();


        }
    }


