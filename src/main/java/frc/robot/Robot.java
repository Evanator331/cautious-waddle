/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

// This program uses a loop and timer to test the inputs of different motors for the robot so that we know which motor is which
package org.usfirst.frc.team6910.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends iterativeRobot {
  private Timer timer = new Timer();

  private SpeedController m_motor4;
  private SpeedController m_motor5;
  private SpeedController m_motor6;
  private SpeedController m_motor7;
  private SpeedController m_motor8;

  @Override
  public void robotInit() {
    m_motor4 = new WPI_TalonSRX(3);
    m_motor5 = new WPI_TalonSRX(4);
    m_motor6 = new WPI_TalonSRX(5);
    m_motor7 = new WPI_TalonSRX(6);
    m_motor8 = new WPI_TalonSRX(7);
  }

  @Override
  public void teleopPeriodic() {
  }

  @Override
public void teleopInit() {
for (int i = 0; i<5, i++) //Loops the motor tests
{
  
System.out.println("Motor 4"); //Prints which motor is running
m_motor4.set(.1); //Starts motor
timer.delay(1); //Length of motor time
m_motor4.stop(); //Stops motor

System.out.println("Motor 5");
m_motor5.set(.1);
timer.delay(1);
m_motor5.stop();

System.out.println("Motor 6");
m_motor6.set(.1);
timer.delay(1);
m_motor6.stop();

System.out.println("Motor 7");
m_motor7.set(.1);
timer.delay(1);
m_motor7.stop();

System.out.println("Motor 8");
m_motor8.set(.1);
timer.delay(1);
m_motor8.stop();
  }
 }
}
//5 CAN motors and 3 motors that idk what to do with

