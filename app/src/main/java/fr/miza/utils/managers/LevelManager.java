package fr.miza.utils.managers;

import java.util.ArrayList;
import java.util.List;

import fr.miza.utils.Level;

public class LevelManager {

    private List<Level> levels;

    public LevelManager() {
        this.levels = new ArrayList<>();
    }

    public void addLevel(Level level) {
        this.levels.add(level);
    }

    public Level getLevel(int index) {
        return this.levels.get(index);
    }

    public List<Level> getLevels() {
        return levels;
    }
}
