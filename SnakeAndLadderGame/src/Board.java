package src;

import java.util.Map;
import java.util.HashMap;

public class Board {

    private static final int DEFAULT_DIMENSION = 10;

    int dimensions;
    Map<Integer, SpecialEntity> specialEntities;

    public Board() {
        this.dimensions = DEFAULT_DIMENSION;
        specialEntities = new HashMap<Integer, SpecialEntity>();
    }

    public Board(int dimensions) {
        
        this.dimensions = dimensions;
        specialEntities = new HashMap<Integer, SpecialEntity>();
    }

    public void printBoard() {

        int totalCells = getTotalCells();

        for (int position = totalCells; position > 0; position--) {
            System.out.print(" | " + position + " ");

            if (hasSpecialEntity(position)) {
                System.out.print(specialEntities.get(position).getID());
            }

            System.out.println(" |");

            if (position % dimensions == 1) {
                System.out.println();
            }
        }
    }

    public int getTotalCells() {
        
        return dimensions * dimensions;
    }

    public void addSpecialEntity(SpecialEntity specialEntity) {
       
       specialEntities.put(specialEntity.getStartPosition(), specialEntity);
    }

    public boolean hasSpecialEntity(int position) {
        return specialEntities.containsKey(position);
    }

    public SpecialEntity getspecialEntityPosition(int position) {
        if(hasSpecialEntity(position)) {
            return specialEntities.get(position);
        } 
        return null;
    }

}