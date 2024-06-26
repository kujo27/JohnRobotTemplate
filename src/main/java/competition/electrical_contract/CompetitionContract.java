package competition.electrical_contract;

import javax.inject.Inject;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import competition.subsystems.pose.PoseSubsystem;
import xbot.common.injection.electrical_contract.CANTalonInfo;
import xbot.common.injection.electrical_contract.DeviceInfo;

public class CompetitionContract extends ElectricalContract {

    protected final double simulationScalingValue = 256.0 * PoseSubsystem.INCHES_IN_A_METER;

    @Inject
    public CompetitionContract() {}

    @Override
    public DeviceInfo getLeftLeader() {
        return new DeviceInfo("LeftLeader", 1, true, simulationScalingValue);
    }

    @Override
    public DeviceInfo getRightLeader() {
        return new DeviceInfo("RightLeader", 2, false, simulationScalingValue);
    }

    public DeviceInfo getCollectorMotor() {
        return new DeviceInfo("CollectorMotor", 37, false);
    }
}
