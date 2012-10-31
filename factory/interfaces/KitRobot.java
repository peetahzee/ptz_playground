package factory.interfaces;

import factory.data.Kit;

public interface KitRobot {

	/**
	 * Conveyor sends this when a kit is ready to be picked up.
	 * @param k kit being picked up.
	 */
	public abstract void msgHereIsKit(Kit k);

	/**
	 * Stand sends this when it needs a kit placed onto an empty location.
	 * @param standLocation location to place the kit
	 */
	public abstract void msgNeedKit(int standLocation);

	/**
	 * Stand sends this when a kit needs to be moved to the inspection area of
	 * the stand.
	 * @param k kit that needs to be moved
	 */
	public abstract void msgMoveKitToInspectionArea(Kit k);

	/**
	 * Camera sends this when a kit has passed inspection
	 */
	public abstract void msgKitPassedInspection();

	/**
	 * GUI KitRobot sends this after the Kit to Conveyor animation has been
	 * completed.
	 */
	public abstract void msgPlaceKitOnConveyorDone();

	/**
	 * GUI KitRobot sends this after the Kit to Inspection Area animation has
	 * been completed.
	 */
	public abstract void msgPlaceKitInInspectionAreaDone();

	/**
	 * GUI KitRobot sends this after Kit to Stand animation has been completed.
	 */
	public abstract void msgPlaceKitOnStandDone();

	public abstract boolean pickAndExecuteAnAction();

}
