package frc.robot;

import org.littletonrobotics.junction.Logger;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorTester extends SubsystemBase{
    private TalonFX motor;

    public MotorTester(TalonFX motor){
        this.motor = motor;
    }
    @Override
    public void periodic(){
        Logger.recordOutput("Motor/velocity",motor.getVelocity().getValueAsDouble());
        Logger.recordOutput("Motor/temperture",motor.getDeviceTemp().getValueAsDouble());
        Logger.recordOutput("Motor/angle",motor.getPosition().getValueAsDouble());
        Logger.recordOutput("Motor/voltage",motor.getMotorVoltage().getValueAsDouble());
        Logger.recordOutput("Motor/current",motor.getSupplyCurrent().getValueAsDouble());
        
        motor.setVoltage(SmartDashboard.getNumber("voltage", 1));
    }
}
