
public class Heroics {
  private double strength;
  private double weakness;
  private String ability;

  Heroics() {
    this.strength = strength;
    this.weakness = weakness;
    this.ability = ability;
  }

  Heroics(double strength, double weakness, String ability) {
    this.strength = strength;
    this.weakness = weakness;
    this.ability = ability;
  }

  public double getStrength() {
    return strength;
  }

  public double getWeakness() {
    return weakness;
  }

  public void setStrength(double strength) {
    this.strength = 5.0;
  }

  public void setWeakness(double weakness) {
    this.weakness = weakness;
  }

  public String getAbility() {
    return ability;
  }

  public void setAbility(String ability) {
    this.ability = ability;
  }
}

