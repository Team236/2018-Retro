/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.SpinUp;

public class OI {
    //Creates controller and button to "launch" (right now just turn on 1 motor)
    //Joysticks and controllers are included in the WPIlib Joystick class
    public Joystick controller; //allows us to create a Joystick called controller
    public JoystickButton launch; //allows us to create a Joystick Button called launch

    public Joystick leftStick, rightStick;

  public OI() {
      //Creates an instance of the Joystick class called controller and JoystickButton called launch
      //Specifies the port # for the controller and button # which are constants stored in RobotMap
      controller = new Joystick(RobotMap.USB_CONTROLLER);
      launch = new JoystickButton(controller, RobotMap.SPIN_UP_BUTTON);
      
      //runs SpinUp command while the above specified launch button on the controller is held down
      launch.whileHeld(new SpinUp());

      leftStick = new Joystick(RobotMap.USB_JOYSTICK_LEFT);
      rightStick = new Joystick(RobotMap.USB_JOYSTICK_RIGHT);
  }
}
