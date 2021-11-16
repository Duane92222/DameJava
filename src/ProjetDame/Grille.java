package src.ProjetDame;

import src.Utils.utils;
import model.Pion;

public class Grille {

    int L = 12;
    int H = 12;
    char[][] map = new char[L][H];

    // Pion p1 = new Pion(2, 1, 'A');
    // Pion p2 = new Pion(9, 10, 'B');

    int nbPion = 20;

    public void grille() {
        initMap();
        remplirTab(map);
        remplirPlateau(map, nbPion);
        readMap(map);

        // do {
        //     readMap(map);

        //     System.out.println("Mouvement z:up, s:down, q:left, d:right");
        //     String choixMouvement = utils.saisieUtilString();
        //     switch (choixMouvement) {
        //     case "z":
        //         if (map[p1.getX()][p1.getY() - 1] == '.') {
        //             map[p1.getX()][p1.getY()] = '.';
        //             p1.setY(p1.getY() - 1);
        //             map[p1.getX()][p1.getY()] = 'A';
        //         }
        //         break;
        //     case "s":
        //         if (map[p1.getX()][p1.getY() + 1] == '.') {
        //             map[p1.getX()][p1.getY()] = '.';
        //             p1.setY(p1.getY() + 1);
        //             map[p1.getX()][p1.getY()] = 'A';
        //         }
        //         ;
        //         break;
        //     case "q":
        //         if (map[p1.getX() - 1][p1.getY()] == '.') {
        //             map[p1.getX()][p1.getY()] = '.';
        //             p1.setX(p1.getX() - 1);
        //             map[p1.getX()][p1.getY()] = 'A';
        //         }
        //         ;
        //         break;
        //     case "d":
        //         if (map[p1.getX() + 1][p1.getY()] == '.') {
        //             map[p1.getX()][p1.getY()] = '.';
        //             p1.setX(p1.getX() + 1);
        //             map[p1.getX()][p1.getY()] = 'A';
        //         }
        //         ;
        //         break;
        //     default:
        //         System.out.println("Erreur saisie!");
        //     }
        // } while (true);
    }

    public void initMap() {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < H; j++) {
                map[i][j] = '.';
            }
        }

        for (int i = 0; i < 12; i++) {
            map[i][0] = '_';
            map[0][i] = '|';
            map[L - 1][i] = '|';
            map[i][H - 1] = '_';
        }

        // map[p1.getX()][p1.getY()] = 'A';
        // map[p2.getX()][p2.getY()] = 'B';
    }

    public void readMap(char[][] map) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < H; j++) {
                System.out.print(map[j][i]);
            }
            System.out.println("");
        }
    }

    public void remplirTab(char[][] mapGame) {
        for (int i = 0; i <= mapGame.length - 1; i++) {
            for (int j = 0; j <= mapGame.length - 1; j++) {
                mapGame[i][j] = '.';
                mapGame[0][j] = '-';
                mapGame[mapGame.length - 1][j] = '-';
                mapGame[i][0] = '-';
                mapGame[i][mapGame.length - 1] = '-';
            }
        }
        // mapGame[p1.getX()][p1.getY()] = p1.getCouleur();
        // mapGame[p2.getX()][p2.getY()] = p2.getCouleur();

    }

    public static void remplirPlateau(char[][] map, int nbPion) {
        int tmpposX = 2;
        int tmpposY = 1;
        for (int e = 0; e <= nbPion; e++) {
                
            Pion p3 = new Pion(tmpposX, tmpposY, 'A');
            tmpposX = tmpposX + 2;
            if (tmpposX >= 11 & tmpposY != 2 & tmpposY != 3) {
                tmpposX = 1;
                tmpposY = 2;
            }
            if (tmpposX >= 11 & tmpposY == 2) {
                tmpposX = 2;
                tmpposY = 3;
            }
            if (tmpposX >= 11 & tmpposY == 3 & tmpposY != 2) {
                tmpposX = 1;
                tmpposY = 4;
            }
                // System.out.println(tmpposY);
                // System.out.println(tmpposY);
            map[p3.getX()][p3.getY()] = p3.getCouleur();
        }

        int tmpposX2 = 2;
        int tmpposY2 = 7;

        for (int f = 0; f <= nbPion; f++) {
                
            Pion p4 = new Pion(tmpposX2, tmpposY2, 'B');
            tmpposX2 = tmpposX2 + 2;
            if (tmpposX2 >= 11 & tmpposY2 == 7) {
                tmpposX2 = 1;
                tmpposY2 = 8;
            }
            if (tmpposX2 >= 11 & tmpposY2 == 8 & tmpposY2 != 7) {
                tmpposX2 = 2;
                tmpposY2 = 9;
            }
            if (tmpposX2 >= 11 & tmpposY2 == 9 & tmpposY2 != 7 & tmpposY2 != 8) {
                tmpposX2 = 1;
                tmpposY2 = 10;
            }
            if (tmpposX2 >= 11 && tmpposY2 == 10){
                tmpposX2 = 1;
            }
             System.out.println(tmpposY2);
            map[p4.getX()][p4.getY()] = p4.getCouleur();
        }

    }
}
