/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DriveWithJoysticks;


public class Drive extends Subsystem {
  public TalonSRX leftFront, leftMiddle, leftRear;
  public TalonSRX rightFront, rightMiddle, rightRear;

  public Drive() {
    //create talon SRX motor controllers
    leftFront = new TalonSRX(RobotMap.ID_LEFT_FRONT);
    leftMiddle = new TalonSRX(RobotMap.ID_LEFT_MIDDLE);
    leftRear = new TalonSRX(RobotMap.ID_LEFT_REAR);

    rightFront = new TalonSRX(RobotMap.ID_RIGHT_FRONT);
    rightMiddle = new TalonSRX(RobotMap.ID_RIGHT_MIDDLE);
    rightRear = new TalonSRX(RobotMap.ID_RIGHT_REAR);

    //set middle and rear talons to follow front talons (all wheels on same side will go the same speed)
    leftMiddle.set(ControlMode.Follower, leftFront.getDeviceID());
    leftRear.set(ControlMode.Follower, leftFront.getDeviceID());
    rightMiddle.set(ControlMode.Follower, rightFront.getDeviceID());
    rightRear.set(ControlMode.Follower, rightFront.getDeviceID());
  }

  public void setLeftSpeed(double speed) {
    leftFront.set(ControlMode.PercentOutput, speed);
  }

  public void setRightSpeed(double speed) {
    rightFront.set(ControlMode.PercentOutput, speed);
  }

  public void stop() {
    setLeftSpeed(0);
    setRightSpeed(0);
  }

  @Override
  public void initDefaultCommand() {
     setDefaultCommand(new DriveWithJoysticks());
  
  }
}
