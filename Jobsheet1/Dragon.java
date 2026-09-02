package Jobsheet1;

class Dragon {
    int x, y;
    int direction = 1;

    void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        }
        else {
            System.out.println(" input salah");
            return;
        }
        if (newDirection == 1) {
            System.out.println("dragon berarah atas");
        } else if (newDirection == 2) {
            System.out.println("dragon berarah kanan");
        } else if (newDirection == 3) {
            System.out.println("dragon berarah bawah");
        } else if (newDirection == 4) {
            System.out.println("dragon berarah kiri");
        } 
    }

    void move(int distance) {
        switch (direction) {
            case 1: //atas
                y += distance;
                break;
            case 2: //kanan
                x += distance;
                break;
            case 3: //bawah
                y -= distance;
                break;
            case 4: //kiri
                x -= distance;
                break;
        }
    }
    void status() {
        System.out.println("Dragon berada di posisi (" + x + ", " + y + ") arah :"+ direction );
    }
}