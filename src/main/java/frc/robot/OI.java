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
    //creates controller and button to "launch" (right now just turn on 1 motor)
    public Joystick controller;
    public JoystickButton launch;

  public OI() {
      //specify the port and button to use
      controller = new Joystick(RobotMap.USB_CONTROLLER);
      launch = new JoystickButton(controller, RobotMap.SPIN_UP_BUTTON);
      
      //runs SpinUp command while the above specified button is held down
      launch.whileHeld(new SpinUp());
  }
}
