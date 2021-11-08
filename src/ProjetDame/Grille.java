package src.ProjetDame;

public class Grille {
    
    int L = 10;
    int H = 10;
    char[][] map = new char[L][H];

    public void grille() {
        initMap();
        readMap();
    }

    public void initMap() {
        for(int i = 0; i < L; i++) {
            for(int j = 0; j < H; j++) {
                map[i][j] = '.';
        }
    }
    
        for(int i = 0; i<10; i++) {
            map[i][0] = '-';
            map[0][i] = '|';
            map[L-1][i] = '|';
            map[i][H-1] = '-';
        }
    
        // map[p1.getX()][p1.getY()] = 'X';
        // map[m1.getX()][m1.getY()] = 'M';
    }

    
	public void readMap() {
		for(int i = 0; i < L; i++) {
			for(int j = 0; j < H; j++) {
				System.out.print(map[j][i]);
			}
			System.out.println("");
		}
	}
}
