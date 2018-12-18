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
  //joystick USB port #s
  public static final int USB_JOYSTICK_LEFT = 0;
  public static final int USB_JOYSTICK_RIGHT = 1;

  //LAUNCH MOTOR CONTROLLERS
  //PWM port # on roboRIO of the motor controller for the motor we want to spin
  public static final int PWM_TOP_RIGHT = 2;
  public static final int PWM_TOP_LEFT = 3;
	public static final int PWM_BOTTOM_RIGHT = 4;
	public static final int PWM_BOTTOM_LEFT = 5;

  //set speed of motor between -1 (full speed reverse) to 1 (full speed forward)
  public static final double LAUNCH_SPEED = 0.5;

  //button # on controller for spinning up, button 1 is A (green)
  public static final int SPIN_UP_BUTTON = 1;

  //DRIVE MOTOR CONTROLLERS
  //Talon SRX (motor controller) ID's (talon ID's are set in the web page roborio-236-frc.local this is necessary
  //to set a unique ID for each controller because they use a CAN bus to connect to the roborio rather than each one 
  //being indiviually attached to the roborio by PWM)
  public static final int ID_LEFT_FRONT = 2;
  public static final int ID_LEFT_MIDDLE = 4;
  public static final int ID_LEFT_REAR = 10;

  public static final int ID_RIGHT_FRONT = 14;
  public static final int ID_RIGHT_MIDDLE = 3;
  public static final int ID_RIGHT_REAR = 9;

  
}
