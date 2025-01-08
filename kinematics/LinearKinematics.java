package kinematics;

class LinearKinematics implements Kinematics {
  private double x0 = 0; //initial position (meters)
  private double v0 = 0; //initial velocity (meters/second)
  private double t = 0; //time elapsed (seconds)
  private double a = 0; //initial accelaration (meters/second^2)

  public LinearKinematics(double x0, double v0, double t, double a) {
    this.x0 = x0;
    this.v0 = v0;
    this.t = t;
    this.a = a;
  }

  public double getInitialPositionX() {
    return x0;
  }

  public double getInitialVelocity() {
    return v0;
  }

  public double getElapsedTime() {
    return t;
  }

  public double getAcceleration() {
    return a;
  }

  // DISPLACEMENT EQUATION:
  // FORMULA --> x = x0 + v0 * t + 1/2 * a * t^2
  // calculate the position (x) at any given time "t" given the variables:
  // 1. initial position: (x0)
  // 2. initial velocity: (v0)
  // 3. acceleration: (a)
  // 4. time elapsed: (t)
  public double calculateAbsolutePosition(double x0, double v0, double t, double a) {
    double position = x0 + v0 * t + (1.0 / 2 * a * Math.pow(t, 2));

    return position;
  }

  // FIRST EQUATION OF MOTION:
  // FORMULA --> v = v0 + at
  // calculate final velocity of an object under constant acceleration given the variables:
  // 1. initial velocity: (v0)
  // 2. accelaration: (a)
  // 3 .time: (t)
  public double calculateFinalVelocityUsingTime(double v0, double a, double t) {
    double finalVelocityWithTime = v0 + a * t;
    
    return finalVelocityWithTime;
  }

  //THIRD EQUATION OF MOTION:
  //FORMULA --> v^2 = v0^2 + 2 * a * Δx
  //Calculate Final Velocity of an object without time given the variables:
  // 1. initial velocity: (v0)
  // 2. acceleration: (a)
  // 3. displacement: (Δx) --> the difference in position of an object
  public double calculateFinalVelocityUsingDisplacement(double v0, double a, double deltaX) {
    double finalVelocityWithDisplacement = Math.pow(v0, 2) + 2 * a * deltaX;

    return finalVelocityWithDisplacement;
  }

  //DISPLACEMENT EQUATION USING AVERAGE VELOCITY:
  //FORMULA --> x = x0 + 1/2(v0^x + vx)t
  //Calculate the position (x) of an object when its motion is governed by constant
  //accelaration given the variables:
  // 1. initial position: x0 (meters)
  // 2. initial velocity: v0x (m/s)
  // 3. final velocity: vx (m/s)
  // 4. time elapsed: t (seconds)
  public double calculateDisplacementUsingAverageVelocity(double x0, double v0x, double vx, double t) {
    double displacementUsingAverageVelocity = x0 + 1.0 / 2 * (v0x + vx) * t; 

    return displacementUsingAverageVelocity;
  }

}