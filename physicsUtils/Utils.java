package physicsUtils;

class Utils {
  
//Velocity Formula: 
//FORMULA --> v = dx / dt
//Calculates derivative of a specific position with respect to change in time given the variables:
// 1. change in position: deltaX
// 2. change in time: deltaT
public double calculateVelocity(double dx,double dt) {
  double velocity = dx / dt;

  return velocity;
}

//Acceleration Formula:
//FORMULA --> a = dv / dt
//Calculate derivative of specific acceleration with respect to change in time given the variables:
// 1. change in velocity: deltaV
// 2. change in time: deltaT
public double accelaration(double dv, double dt) {
  double accelaration = dv / dt;

  return accelaration;
}

//Arc Length Formula:
//FORMULA --> s = r0
//Calculates the length of the arc (s) by multiplying the radius (r)
//by the angular displacement (theta a.k.a 0), which is the angle (in radians)
//formed (subtended) by the arc from point A to point B around the origin
// 1.Radius: r
// 2.Theta: 0
public double calculateArcLength(double r, double theta) {
  double arcLength = r * theta;

  return arcLength;
}

//Tangential Velocity Formula:
//FORMULA --> 𝑣 = 𝑟𝜔
//Tangential velocity is the speed of a point on the rotating object tangential (Tangential
//velocity is perpendicular to the radius at all points.) to the circular path.
//Measured in (radians per second)
//Radius: r 
//Omega: rate of change in angle in radians
public double tangentialVelocityFormula(double r,double omega) {
  double velocity = r * omega;

  return  velocity;
}

//Tangential Acceleration Formula
//𝑎 = 𝛼r 
//Describes the rate of change of speed along the circular path, derived from the angular       
//acceleration.
//Measured in (meters per second^2)
//Angular acceleration: 𝛼 (alpha)
//Radius: r 
public double tangentialAccelerationFormula(double r, double a) {
  double accelaration = a * r;

  return accelaration;
}

}