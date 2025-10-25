package main;

import java.util.Objects;

public class Npc {
    private String name;
    private int health;
    private int level;
    private String role;
    private boolean isHostile;

    public Npc(String name, int health, int level, String role, boolean isHostile) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.role = role;
        this.isHostile = isHostile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isHostile() {
        return isHostile;
    }

    public void setHostile(boolean hostile) {
        isHostile = hostile;
    }

    @Override
    public String toString() {
        return "Npc{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", level=" + level +
                ", role='" + role + '\'' +
                ", isHostile=" + isHostile +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Npc npc = (Npc) o;
        return health == npc.health &&
                level == npc.level &&
                isHostile == npc.isHostile &&
                Objects.equals(name, npc.name) &&
                Objects.equals(role, npc.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, level, role, isHostile);
    }
}