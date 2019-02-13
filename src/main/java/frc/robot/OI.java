/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//Imported Joystick Class (Right Click -> Source Action.. -> Import)
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  public static Joystick stick = new Joystick(RobotMap.joystickPort);
  public static JoystickButton rightStickX = new JoystickButton(stick, RobotMap.rightStickX);
  public static JoystickButton leftStickY = new JoystickButton(stick, RobotMap.leftStickY);
  public static Button buttonA = new JoystickButton(stick, RobotMap.buttonAPort);
  public static Button buttonB = new JoystickButton(stick, RobotMap.buttonBPort);
  public static Button buttonX = new JoystickButton(stick, RobotMap.buttonXPort);
  public static Button buttonY = new JoystickButton(stick, RobotMap.buttonYPort);
  public static Button buttonLB = new JoystickButton(stick, RobotMap.buttonLBPort);
  public static Button buttonRB = new JoystickButton(stick, RobotMap.buttonRBPort);
  public static Button buttonBack = new JoystickButton(stick, RobotMap.buttonBackPort);
  public static Button buttonStart = new JoystickButton(stick, RobotMap.buttonStartPort);
  public static Button buttonLeftStickDown = new JoystickButton(stick, RobotMap.buttonLeftStickDownPort);
  public static Button buttonRightStickDown = new JoystickButton(stick, RobotMap.buttonRightStickDownPort);

  public static XboxController xboxController = new XboxController(RobotMap.joystickPort);
  


  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.
  public OI() {
    buttonLB.whenPressed(new speedMultiplyerDown());
    System.out.println(buttonLB);
    buttonRB.whenPressed(new speedMultiplyerUp());
    System.out.println(buttonRB);
  }
  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  //button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
