/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//RobotMap sets names and values of constants. Refer to RobotMap when using these constants in the code
public class RobotMap {
  //USB port number on laptop that the controller is plugged into
  public static final int USB_CONTROLLER = 2;

  //PWM port # on roboRIO of the motor controller for the motor we want to spin
  public static final int PWM_TOP_RIGHT = 2;
  public static final int PWM_TOP_LEFT = 3;
	public static final int PWM_BOTTOM_RIGHT = 4;
	public static final int PWM_BOTTOM_LEFT = 5;

  //set speed of motor between -1 (full speed reverse) to 1 (full speed forward)
  public static final double LAUNCH_SPEED = 0.5;

  //button # on controller for spinning up, button 1 is A (green)
  public static final int SPIN_UP_BUTTON = 1;

  
}
