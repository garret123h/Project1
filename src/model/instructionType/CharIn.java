package model.instructionType;

/**
 * This class is the Character input  instruction
 */

public class CharIn implements Instruction {
    /** The destination register number. */
    private String myRd;

    /** The operandSpecifier value. */
    private String operand;

    /** The opcode of the instruction. */
    private String myOpcode;


    public CharIn(String myOpcode, String myRd, String operandSpecifier) {
        this.myRd = myRd;
        this.operand = operandSpecifier;
        this.myOpcode = myOpcode;
    }


    @Override
    public String getOpcode() {
        return myOpcode;
    }

    public String getOprand() {
        return myOpcode;
    }

    public String getRegister() {
        return myRd;
    }

}