package factory.interfaces;

import factory.data.Kit;

public interface Stand {

	/**
	 * FCS sends this when a new batch of kits needs to be made
	 * @param numKits number of kits to be assembled for the current batch.
	 */
	public abstract void msgMakeKits(int numKits);

	/**
	 * PartsRobot sends this when it has finished assembling a kit.
	 * @param k kit that has been assembled.
	 */
	public abstract void msgKitAssembled(Kit k);

	/**
	 * KitRobot sends this when it has placed a kit on the stand.
	 * @param k kit placed on the stand.
	 * @param dest the list index where the kit should be placed
	 */
	public abstract void msgHereIsKit(Kit k, int dest);

	/**
	 * KitRobot sends this when it has shipped a kit.
	 */
	public abstract void msgShippedKit();

	public abstract boolean pickAndExecuteAnAction();

}
