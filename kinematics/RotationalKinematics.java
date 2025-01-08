package kinematics;

public class RotationalKinematics implements Kinematics {
  private double theta0 = 0; //intial angular position (radians)
  private double theta = 0; //final angular position (radians)
  private double omega0 = 0; //initial angular velocity (radians per second)
  private double omega = 0; // final angular velocity (radians per second)
  private double alpha = 0; //angular acceleration (radians per second squared)
  private double time = 0; //time elapsed (seconds)
  private double deltaTheta = 0; //Change in angular position (radians)

  public RotationalKinematics(double theta0, double theta, double omega0, double omega, double alpha, double time, double deltaTheta) {
    this.theta0 = theta0;
    this.theta = theta;
    this.omega0 = omega0;
    this.omega = omega;
    this.alpha = alpha;
    this.time = time;
    this.deltaTheta = deltaTheta;
  }

  public double getTheta0() {
    return this.theta0;
  }

   public double getTheta() {
    return this.theta;
  }

   public double getOmega() {
    return this.omega;
  }

   public double getOmega0() {
    return this.omega0;
  }

   public double getAlpha() {
    return this.alpha;
  }
  
  public double getTime() {
    return this.time;
  }

  public double getDeltaTheta() {
    return deltaTheta;
  }

  //Angular Displacement Formula (Rotational Kinematics)
  //FORMULA: 0 = 𝜃0 + 𝜔0t + 1/2at^2
  //Calculates the angular position (theta) at a given time (t)
  // 1. theta0: initial angular position
  // 2. omega0: initial angular velocity 
  // 3. alpha: angular acceleration
  // 4. time: time elapsed
  public double calculateAngularDisplacement(double theta0, double omega0, double alpha, double time) {
    double currentAngularPositionGivenTime = theta0 + omega0 * time + 1.0 / 2 * alpha * Math.pow(time, 2);

    return currentAngularPositionGivenTime;
  }

  //Angular Velocity Formula
  //FORMULA: 𝜔 = omega0 + alpha * time
  //This formula calculates the angular velocity of a rotating object at a specific time t,
  //assuming a constant angular acceleration. It is the rotational analog of the linear kinematics
  // 1. omega0: initial velocity
  // 2. alpha: angular accelration 
  // 3. time: time elapsed
  public double calculateAngularVelocityFormula(double omega0,double alpha,double time) {
    double angularVelocity = omega0 + alpha * time;

    return angularVelocity;
  }

  //Angular Velocity-Displacement Relation
  //FORMULA: 𝜔2 = 𝜔0^2 + 2𝛼Δ𝜃
  //This equation is used to calculate the final angular velocity or angular displacement without 
  //involving time explicitly. 
  // 1. omega0: initial velocity
  // 2. alpha: angular acceleration
  // 3. delta theta (Δθ): Angular displacement (change in angular position, in radians).
  public double calculateAngularVelocityDisplacementWithoutTime(double omega0, double alpha, double deltaTheta) {
    double finalAngularVelocityDisplacement = Math.pow(omega0, 2) + 2 * alpha * deltaTheta;

    return finalAngularVelocityDisplacement;
  }

  //Angular Displacement via Average Angular Velocity
  //FORMULA: theta = theta0 + 1/2 * (omega0 + omega) * t
  //This equation calculates the angular position (𝜃θ) of a rotating object over a time interval 
  //(t) using the average angular velocity.
  // 1. theta0: initial angular position
  // 2. omega0: initial velocity
  // 3. omega: final velocity
  public double calculateAngularDisplacementVIAAverageAngularVelocity(double theta0, double omega0, double omega){
    double finalAngularPositionOverTime = theta0 + 1.0 / 2 * (omega0 + omega) * time;

    return finalAngularPositionOverTime;
  }



}