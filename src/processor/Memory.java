
package processor;

import java.util.HashMap;
import java.util.Map;

/**
 * This is a memory class with data memory max 500 and instruction memory max 200
 */
public final class Memory {
	/**
	 *  data mem size
	 */
	private final static int DATA_MEMORY = 500;

	/**
	 * instruction memory size
	 */
	private final static int INSTRUCTION_MEMORY = 200;

		
	/** Map of registers. */
	private Map<String, Long> myRegisters;
	
	/** Array of instruction memory. */
	private Instruction[] myInstructionMem;
	
	/** Data memory. */
	private long[] myDataMem;

	
	/** The current Program Counter value. */
	private int myPC;

	
	/**
	 * Constructor for memory class.
	 * Initializes all fields with necessary values.
	 */
	public Memory() {
		myInstructionMem = new Instruction[INSTRUCTION_MEMORY];
		myDataMem = new long[DATA_MEMORY];
		mapRegisters();					// Map register with correct 'key'
		for (int i = 0; i < DATA_MEMORY; i++) {
			myDataMem[i] = 0;
		}
		setPC(0);
	}


	/**
	 * Get the PC.
	 *
	 * @return myPC the current PC value.
	 */
	public int getPC() {
		return myPC;
	}

	/**
	 * Set the PC value to the new specified PC value.
	 * @param thePC is the PC value to be set to.
	 */
	public void setPC(final int thePC) {
			myPC = thePC;
	}

	
	/**
	 * Get the current state of the data memory.
	 * 
	 * @return myDataMem is current state of the data memory
	 */
	public long[] getMyDataMem() {
		return myDataMem;
	}


	
	/**
	 * Get the set of instructions to be executed.
	 * 
	 * @return myInstructionMem the current set of instructions to be executed.
	 */
	public Instruction[] getInstructionMem() {
		return myInstructionMem;
	}


	/**
	 * Create register map.
	 * Initializes all registers to zero.
	 * Set stack pointer register to last data memory address.
	 */
	private void mapRegisters() {
		myRegisters = new HashMap<>();
		
     //needs to be implemented
	}

	
}