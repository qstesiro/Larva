package com.runbox.dex.entry.bytecode;

public class Bytecode {        

    public Bytecode(int offset, String name) {
		this.offset = offset;
        this.name = name.trim().toLowerCase();
    }	
	
    public Bytecode(int offset, String name, byte opcode) {
		this.offset = offset;
		this.name = name.trim().toLowerCase();
		this.opcode = opcode; 		
    }       

	private int offset = 0;

	public Bytecode offset(int offset) {
		this.offset = offset; return this;
	}

	public int offset() {
		return offset;
	}

	private String name = null;

	public Bytecode name(String name) {
		this.name = name; return this;
	}

	public String name() {
		return name;
	}

	private byte opcode = 0;
	
    public Bytecode opcode(byte opcode) {
        this.opcode = opcode; return this;
    }

    public byte opcode() {
        return opcode;
    }

	public static class NOP extends Bytecode {

		public NOP(int offset) {
			super(offset, "NOP");
		}
	}

	public static class MOVE extends Bytecode {

		public MOVE(int offset, byte vA, byte vB) {
			super(offset, "MOVE", MOVE);
			this.vA = vA;
			this.vB = vB;
		}

		private byte vA = 0;		
		
		public byte vA() {
			return vA;
		}

		private byte vB = 0;
		
		public byte vB() {
			return vB;
		}
	}

	public static class MOVE_FROM16 extends Bytecode {

		public MOVE_FROM16(int offset, short vAA, int vBBBB) {
			super(offset, "MOVE_FROM16", MOVE_FROM16);
			this.vAA = vAA;
			this.vBBBB = vBBBB;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private int vBBBB = 0;

		public int vBBBB() {
			return vBBBB;
		}
	}

	public static class MOVE16 extends Bytecode {

		public MOVE16(int offset, int vAAAA, int vBBBB) {
			super(offset, "MOVE16", MOVE16);
			this.vAAAA = vAAAA;
			this.vBBBB = vBBBB;			
		}

		private int vAAAA = 0;

		public int vAAAA() {
			return vAAAA;
		}

		private int vBBBB = 0;

		public int vBBBB() {
			return vBBBB;
		}
	}

	public static class MOVE_WIDE extends Bytecode {

		public MOVE_WIDE(int offset, byte vA, byte vB) {
			super(offset, "MOVE_WIDE", MOVE_WIDE);
			this.vA = vA;
			this.vB = vB;
		}

		private byte vA = 0;

		public byte vA() {
			return vA;
		}

		private int vB = 0;
		
		private int vB() {
			return vB;
		}
	}

	public static class MOVE_WIDE_FROM16 extends Bytecode {

		public MOVE_WIDE_FROM16(int offset, short vAA, int vBBBB) {
			super(offset, "MOVE_WIDE_FROM16", MOVE_WIDE_FROM16);
			this.vAA = vAA;
			this.vBBBB = vBBBB;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private int vBBBB = 0;

		public int vBBBB() {
			return vBBBB;
		}
	}

	public static class MOVE_WIDE16 extends Bytecode {

		public MOVE_WIDE16(int offset, short vAA, int vBBBB) {
			super(offset, "MOVE_WIDE16", MOVE_WIDE16);
			this.vAA = vAA;
			this.vBBBB = vBBBB;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private int vBBBB = 0;

		public int vBBBB() {
			return vBBBB;
		}
	}

	public static class MOVE_OBJECT extends Bytecode {

		public MOVE_OBJECT(int offset, byte vA, byte vB) {
			super(offset, "MOVE_OBJECT", MOVE_OBJECT);
			this.vA = vA;
			this.vB = vB;
		}

		private byte vA = 0;

		public byte vA() {
			return vA;
		}

		private byte vB = 0;
		
		private byte vB() {
			return vB;
		}
	}

	public static class MOVE_OBJECT_FROM16 extends Bytecode {

		public MOVE_OBJECT_FROM16(int offset, short vAA, int vBBBB) {
			super(offset, "MOVE_OBJECT_FROM16", MOVE_OBJECT_FROM16);
			this.vAA = vAA;
			this.vBBBB = vBBBB;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private int vBBBB = 0;

		public int vBBBB() {
			return vBBBB;
		}
	}

	public static class MOVE_OBJECT16 extends Bytecode {

		public MOVE_OBJECT16(int offset, int vAAAA, int vBBBB) {
			super(offset, "MOVE_OBJECT16", MOVE_OBJECT16);
			this.vAAAA = vAAAA;
			this.vBBBB = vBBBB;
		}

		private int vAAAA = 0;

		public int vAAAA() {
			return vAAAA;
		}

		private int vBBBB = 0;

		public int vBBBB() {
			return vBBBB;
		}
	}

	public static class MOVE_RESULT extends Bytecode {

		public MOVE_RESULT(int offset, short vAA) {
			super(offset, "MOVE_RESULT", MOVE_RESULT);
			this.vAA = vAA;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}
	}

	public static class MOVE_RESULT_WIDE extends Bytecode {

		public MOVE_RESULT_WIDE(int offset, short vAA) {
			super(offset, "MOVE_RESULT_WIDE", MOVE_RESULT_WIDE);
			this.vAA = vAA;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}
	}

	public static class MOVE_RESULT_OBJECT extends Bytecode {

		public MOVE_RESULT_OBJECT(int offset, short vAA) {
			super(offset, "MOVE_RESULT_OBJECT", MOVE_RESULT_OBJECT);
			this.vAA = vAA;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}
	}

	public static class MOVE_EXCEPTION extends Bytecode {

		public MOVE_EXCEPTION(int offset, short vAA) {
			super(offset, "MOVE_EXCEPTION", MOVE_EXCEPTION);
			this.vAA = vAA;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}
	}

	public static class RETURN_VOID extends Bytecode {

		public RETURN_VOID(int offset) {
			super(offset, "RETURN_VOID", RETURN_VOID);
		}
	}

	public static class RETURN extends Bytecode {

		public RETURN(int offset, short vAA) {
			super(offset, "RETURN", RETURN);
			this.vAA = vAA;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}
	}

	public static class RETURN_WIDE extends Bytecode {

		public RETURN_WIDE(int offset, short vAA) {
			super(offset, "RETURN_WIDE", RETURN_WIDE);
			this.vAA = vAA;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}
	}

	public static class RETURN_OBJECT extends Bytecode {

		public RETURN_OBJECT(int offset, short vAA) {
			super(offset, "RETURN_OBJECT", RETURN_OBJECT);
			this.vAA = vAA;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}
	}

	public static class CONST4 extends Bytecode {

		public CONST4(int offset, byte vA, int value) {
			super(offset, "CONST4", CONST4);
			this.vA = vA;
			this.value = value;
		}

		private byte vA = 0;

		public byte vA() {
			return vA;
		}

		private int value = 0;

		public int value() {
			return value;
		}
	}

	public static class CONST16 extends Bytecode {

		public CONST16(int offset, short vAA, int value) {
			super(offset, "CONST16", CONST16);
			this.vAA = vAA;
			this.value = value;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private int value = 0;

		public int value() {
			return value;
		}
	}

	public static class CONST extends Bytecode {

		public CONST(int offset, short vAA, int value) {
			super(offset, "CONST", CONST);
			this.vAA = vAA;
			this.value = value;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private int value = 0;

		public int value() {
			return value;
		}
	}

	public static class CONST_HIGH16 extends Bytecode {

		public CONST_HIGH16(int offset, short vAA, int value) {
			super(offset, "CONST_HIGH16", CONST_HIGH16);
			this.vAA = vAA;
			this.value = value;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private int value = 0;

		public int value() {
			return value;
		}
	}

	public static class CONST_WIDE16 extends Bytecode {

		public CONST_WIDE16(int offset, short vAA, long value) {
			super(offset, "CONST_WIDE16", CONST_WIDE16);
			this.vAA = vAA;
			this.value = value;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private long value = 0;

		public long value() {
			return value;
		}
	}

	public static class CONST_WIDE32 extends Bytecode {

		public CONST_WIDE32(int offset, short vAA, long value) {
			super(offset, "CONST_WIDE32", CONST_WIDE32);
			this.vAA = vAA;
			this.value = value;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private long value = 0;

		public long value() {
			return value;
		}
	}

	public static class CONST_WIDE extends Bytecode {

		public CONST_WIDE(int offset, short vAA, long value) {
			super(offset, "CONST_WIDE", CONST_WIDE);
			this.vAA = vAA;
			this.value = value;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private long value = 0;

		public long value() {
			return value;
		}
	}

	public static class CONST_WIDE_HIGH16 extends Bytecode {

		public CONST_WIDE_HIGH16(int offset, short vAA, long value) {
			super(offset, "CONST_WIDE_HIGH16", CONST_WIDE_HIGH16);
			this.vAA = vAA;
			this.value = value;
		}

		private short vAA = 0;

		public short vAA() {
			return vAA;
		}

		private long value = 0;

		public long value() {
			return value;
		}
	}

	public static class CONST_STRING extends Bytecode {

		public CONST_STRING(int offset) {
			super(offset, "CONST_STRING", CONST_STRING);
		}
	}

	public static class CONST_STRING_JUMBO extends Bytecode {

		public CONST_STRING_JUMBO(int offset) {
			super(offset, "CONST_STRING_JUMBO", CONST_STRING_JUMBO);
		}
	}

	public static class CONST_CLASS extends Bytecode {

		public CONST_CLASS(int offset) {
			super(offset, "CONST_CLASS", CONST_CLASS);
		}
	}

	public static class MONITOR_ENTER extends Bytecode {

		public MONITOR_ENTER(int offset) {
			super(offset, "MONITOR_ENTER", MONITOR_ENTER);
		}
	}

	public static class MONITOR_EXIT extends Bytecode {

		public MONITOR_EXIT(int offset) {
			super(offset, "MONITOR_EXIT", MONITOR_EXIT);
		}
	}

	public static class CHECK_CAST extends Bytecode {

		public CHECK_CAST(int offset) {
			super(offset, "CHECK_CAST", CHECK_CAST);
		}
	}

	public static class INSTANCE_OF extends Bytecode {

		public INSTANCE_OF(int offset) {
			super(offset, "INSTANCE_OF", INSTANCE_OF);
		}
	}

	public static class ARRAY_LENGTH extends Bytecode {

		public ARRAY_LENGTH(int offset) {
			super(offset, "ARRAY_LENGTH", ARRAY_LENGTH);
		}
	}

	public static class NEW_INSTANCE extends Bytecode {

		public NEW_INSTANCE(int offset) {
			super(offset, "NEW_INSTANCE", NEW_INSTANCE);
		}
	}

	public static class NEW_ARRAY extends Bytecode {

		public NEW_ARRAY(int offset) {
			super(offset, "NEW_ARRAY", NEW_ARRAY);
		}
	}

	public static class FILLED_NEW_ARRAY extends Bytecode {

		public FILLED_NEW_ARRAY(int offset) {
			super(offset, "FILLED_NEW_ARRAY", FILLED_NEW_ARRAY);
		}
	}

	public static class FILLED_NEW_ARRAY_RANGE extends Bytecode {

		public FILLED_NEW_ARRAY_RANGE(int offset) {
			super(offset, "FILLED_NEW_ARRAY_RANGE", FILLED_NEW_ARRAY_RANGE);
		}
	}

	public static class FILL_ARRAY_DATA extends Bytecode {

		public FILL_ARRAY_DATA(int offset) {
			super(offset, "FILL_ARRAY_DATA", FILL_ARRAY_DATA);
		}
	}

	public static class THROW extends Bytecode {

		public THROW(int offset) {
			super(offset, "THROW", THROW);
		}
	}

	public static class GOTO extends Bytecode {

		public GOTO(int offset) {
			super(offset, "GOTO", GOTO);
		}
	}

	public static class GOTO16 extends Bytecode {

		public GOTO16(int offset) {
			super(offset, "GOTO16", GOTO16);
		}
	}

	public static class GOTO32 extends Bytecode {

		public GOTO32(int offset) {
			super(offset, "GOTO32", GOTO32);
		}
	}

	public static class PACKED_SWITCH extends Bytecode {

		public PACKED_SWITCH(int offset) {
			super(offset, "PACKED_SWITCH", PACKED_SWITCH);
		}
	}

	public static class SPARSE_SWITCH extends Bytecode {

		public SPARSE_SWITCH(int offset) {
			super(offset, "SPARSE_SWITCH", SPARSE_SWITCH);
		}
	}

	public static class CMP_KIND extends Bytecode {

		public CMP_KIND(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class CMPL_FLOAT extends CMP_KIND {

		public CMPL_FLOAT(int offset) {
			super(offset, "CMPL_FLOAT", CMPL_FLOAT);
		}
	}

	public static class CMPG_FLOAT extends CMP_KIND {

		public CMPG_FLOAT(int offset) {
			super(offset, "CMPG_FLOAT", CMPG_FLOAT);
		}
	}

	public static class CMPL_DOUBLE extends CMP_KIND {

		public CMPL_DOUBLE(int offset) {
			super(offset, "CMPL_DOUBLE", CMPL_DOUBLE);
		}
	}

	public static class CMPG_DOUBLE extends CMP_KIND {

		public CMPG_DOUBLE(int offset) {
			super(offset, "CMPG_DOUBLE", CMPG_DOUBLE);
		}
	}

	public static class CMP_LONG extends CMP_KIND {

		public CMP_LONG(int offset) {
			super(offset, "CMP_LONG", CMP_LONG);
		}
	}

	public static class IF_TEST extends Bytecode {

		public IF_TEST(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class IF_EQ extends IF_TEST {

		public IF_EQ(int offset) {
			super(offset, "IF_EQ", IF_EQ);
		}
	}
	
	public static class IF_NE extends IF_TEST {

		public IF_NE(int offset) {
			super(offset, "IF_NE", IF_NE);
		}
	}

	public static class IF_LT extends IF_TEST {

		public IF_LT(int offset) {
			super(offset, "IF_LT", IF_LT);
		}
	}

	public static class IF_GE extends IF_TEST {

		public IF_GE(int offset) {
			super(offset, "IF_GE", IF_GE);
		}
	}

	public static class IF_GT extends IF_TEST {

		public IF_GT(int offset) {
			super(offset, "IF_GT", IF_GT);
		}
	}

	public static class IF_LE extends IF_TEST {

		public IF_LE(int offset) {
			super(offset, "IF_LE", IF_LE);
		}
	}

	public static class IF_TESTZ extends Bytecode {

		public IF_TESTZ(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class IF_EQZ extends IF_TESTZ {

		public IF_EQZ(int offset) {
			super(offset, "IF_EQZ", IF_EQZ);
		}
	}
	
	public static class IF_NEZ extends IF_TESTZ {

		public IF_NEZ(int offset) {
			super(offset, "IF_NEZ", IF_NEZ);
		}
	}

	public static class IF_LTZ extends IF_TESTZ {

		public IF_LTZ(int offset) {
			super(offset, "IF_LTZ", IF_LTZ);
		}
	}

	public static class IF_GEZ extends IF_TESTZ {

		public IF_GEZ(int offset) {
			super(offset, "IF_GEZ", IF_GEZ);
		}
	}

	public static class IF_GTZ extends IF_TESTZ {

		public IF_GTZ(int offset) {
			super(offset, "IF_GTZ", IF_GTZ);
		}
	}

	public static class IF_LEZ extends IF_TESTZ {

		public IF_LEZ(int offset) {
			super(offset, "IF_LEZ", IF_LEZ);
		}
	}
	
	public static class ARRAY_OP extends Bytecode {
		public ARRAY_OP(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class AGET extends ARRAY_OP {

		public AGET(int offset) {
			super(offset, "AGET", AGET);
		}
	}

	public static class AGET_WIDE extends ARRAY_OP {

		public AGET_WIDE(int offset) {
			super(offset, "AGET_WIDE", AGET_WIDE);
		}
	}

	public static class AGET_OBJECT extends ARRAY_OP {

		public AGET_OBJECT(int offset) {
			super(offset, "AGET_OBJECT", AGET_OBJECT);
		}
	}

	public static class AGET_BOOLEAN extends ARRAY_OP {

		public AGET_BOOLEAN(int offset) {
			super(offset, "AGET_BOOLEAN", AGET_BOOLEAN);
		}
	}

	public static class AGET_BYTE extends ARRAY_OP {

		public AGET_BYTE(int offset) {
			super(offset, "AGET_BYTE", AGET_BYTE);
		}
	}

	public static class AGET_CHAR extends ARRAY_OP {

		public AGET_CHAR(int offset) {
			super(offset, "AGET_CHAR", AGET_CHAR);
		}
	}

	public static class AGET_SHORT extends ARRAY_OP {

		public AGET_SHORT(int offset) {
			super(offset, "AGET_SHORT", AGET_SHORT);
		}
	}
	
	public static class APUT extends ARRAY_OP {

		public APUT(int offset) {
			super(offset, "APUT", APUT);
		}
	}

	public static class APUT_WIDE extends ARRAY_OP {

		public APUT_WIDE(int offset) {
			super(offset, "APUT_WIDE", APUT_WIDE);
		}
	}

	public static class APUT_OBJECT extends ARRAY_OP {

		public APUT_OBJECT(int offset) {
			super(offset, "APUT_OBJECT", APUT_OBJECT);
		}
	}

	public static class APUT_BOOLEAN extends ARRAY_OP {

		public APUT_BOOLEAN(int offset) {
			super(offset, "APUT_BOOLEAN", APUT_BOOLEAN);
		}
	}

	public static class APUT_BYTE extends ARRAY_OP {

		public APUT_BYTE(int offset) {
			super(offset, "APUT_BYTE", APUT_BYTE);
		}
	}

	public static class APUT_CHAR extends ARRAY_OP {

		public APUT_CHAR(int offset) {
			super(offset, "APUT_CHAR", APUT_CHAR);
		}
	}

	public static class APUT_SHORT extends ARRAY_OP {

		public APUT_SHORT(int offset) {
			super(offset, "APUT_SHORT", APUT_SHORT);
		}
	}

	public static class IOP extends Bytecode {

		public IOP(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class IGET extends IOP {

		public IGET(int offset) {
			super(offset, "IGET", IGET);
		}
	}

	public static class IGET_WIDE extends IOP {

		public IGET_WIDE(int offset) {
			super(offset, "IGET_WIDE", IGET_WIDE);
		}
	}

	public static class IGET_OBJECT extends IOP {

		public IGET_OBJECT(int offset) {
			super(offset, "IGET_OBJECT", IGET_OBJECT);
		}
	}

	public static class IGET_BOOLEAN extends IOP {

		public IGET_BOOLEAN(int offset) {
			super(offset, "IGET_BOOLEAN", IGET_BOOLEAN);
		}
	}

	public static class IGET_BYTE extends IOP {

		public IGET_BYTE(int offset) {
			super(offset, "IGET_BYTE", IGET_BYTE);
		}
	}

	public static class IGET_CHAR extends IOP {

		public IGET_CHAR(int offset) {
			super(offset, "IGET_CHAR", IGET_CHAR);
		}
	}

	public static class IGET_SHORT extends IOP {

		public IGET_SHORT(int offset) {
			super(offset, "IGET_SHORT", IGET_SHORT);
		}
	}
	
	public static class IPUT extends IOP {

		public IPUT(int offset) {
			super(offset, "IPUT", IPUT);
		}
	}

	public static class IPUT_WIDE extends IOP {

		public IPUT_WIDE(int offset) {
			super(offset, "IPUT_WIDE", IPUT_WIDE);
		}
	}

	public static class IPUT_OBJECT extends IOP {

		public IPUT_OBJECT(int offset) {
			super(offset, "IPUT_OBJECT", IPUT_OBJECT);
		}
	}

	public static class IPUT_BOOLEAN extends IOP {

		public IPUT_BOOLEAN(int offset) {
			super(offset, "IPUT_BOOLEAN", IPUT_BOOLEAN);
		}
	}

	public static class IPUT_BYTE extends IOP {

		public IPUT_BYTE(int offset) {
			super(offset, "IPUT_BYTE", IPUT_BYTE);
		}
	}

	public static class IPUT_CHAR extends IOP {

		public IPUT_CHAR(int offset) {
			super(offset, "IPUT_CHAR", IPUT_CHAR);
		}
	}

	public static class IPUT_SHORT extends IOP {

		public IPUT_SHORT(int offset) {
			super(offset, "IPUT_SHORT", IPUT_SHORT);
		}
	}

	public static class SOP extends Bytecode {

		public SOP(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class SGET extends SOP {

		public SGET(int offset) {
			super(offset, "SGET", SGET);
		}
	}

	public static class SGET_WIDE extends SOP {

		public SGET_WIDE(int offset) {
			super(offset, "SGET_WIDE", SGET_WIDE);
		}
	}

	public static class SGET_OBJECT extends SOP {

		public SGET_OBJECT(int offset) {
			super(offset, "SGET_OBJECT", SGET_OBJECT);
		}
	}

	public static class SGET_BOOLEAN extends SOP {

		public SGET_BOOLEAN(int offset) {
			super(offset, "SGET_BOOLEAN", SGET_BOOLEAN);
		}
	}

	public static class SGET_BYTE extends SOP {

		public SGET_BYTE(int offset) {
			super(offset, "SGET_BYTE", SGET_BYTE);
		}
	}

	public static class SGET_CHAR extends SOP {

		public SGET_CHAR(int offset) {
			super(offset, "SGET_CHAR", SGET_CHAR);
		}
	}

	public static class SGET_SHORT extends SOP {

		public SGET_SHORT(int offset) {
			super(offset, "SGET_SHORT", SGET_SHORT);
		}
	}
	
	public static class SPUT extends SOP {

		public SPUT(int offset) {
			super(offset, "SPUT", SPUT);
		}
	}

	public static class SPUT_WIDE extends SOP {

		public SPUT_WIDE(int offset) {
			super(offset, "SPUT_WIDE", SPUT_WIDE);
		}
	}

	public static class SPUT_OBJECT extends SOP {

		public SPUT_OBJECT(int offset) {
			super(offset, "SPUT_OBJECT", SPUT_OBJECT);
		}
	}

	public static class SPUT_BOOLEAN extends SOP {

		public SPUT_BOOLEAN(int offset) {
			super(offset, "SPUT_BOOLEAN", SPUT_BOOLEAN);
		}
	}

	public static class SPUT_BYTE extends SOP {

		public SPUT_BYTE(int offset) {
			super(offset, "SPUT_BYTE", SPUT_BYTE);
		}
	}

	public static class SPUT_CHAR extends SOP {

		public SPUT_CHAR(int offset) {
			super(offset, "SPUT_CHAR", SPUT_CHAR);
		}
	}

	public static class SPUT_SHORT extends SOP {

		public SPUT_SHORT(int offset) {
			super(offset, "SPUT_SHORT", SPUT_SHORT);
		}
	}

	public static class INVOKE_KIND extends Bytecode {

		public INVOKE_KIND(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class INVOKE_VIRTUAL extends INVOKE_KIND {

		public INVOKE_VIRTUAL(int offset) {
			super(offset, "INVOKE_VIRTUAL", INVOKE_VIRTUAL);
		}
	}

	public static class INVOKE_SUPER extends INVOKE_KIND {

		public INVOKE_SUPER(int offset) {
			super(offset, "INVOKE_SUPER", INVOKE_SUPER);
		}
	}

	public static class INVOKE_DIRECT extends INVOKE_KIND {

		public INVOKE_DIRECT(int offset) {
			super(offset, "INVOKE_DIRECT", INVOKE_DIRECT);
		}
	}

	public static class INVOKE_STATIC extends INVOKE_KIND {

		public INVOKE_STATIC(int offset) {
			super(offset, "INVOKE_STATIC", INVOKE_STATIC);
		}
	}

	public static class INVOKE_INTERFACE extends INVOKE_KIND {

		public INVOKE_INTERFACE(int offset) {
			super(offset, "INVOKE_INTERFACE", INVOKE_INTERFACE);
		}
	}
	
	public static class INVOKE_KIND_RANGE extends Bytecode {

		public INVOKE_KIND_RANGE(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class INVOKE_VIRTUAL_RANGE extends INVOKE_KIND_RANGE {

		public INVOKE_VIRTUAL_RANGE(int offset) {
			super(offset, "INVOKE_VIRTUAL_RANGE", INVOKE_VIRTUAL_RANGE);
		}
	}

	public static class INVOKE_SUPER_RANGE extends INVOKE_KIND_RANGE {

		public INVOKE_SUPER_RANGE(int offset) {
			super(offset, "INVOKE_SUPER_RANGE", INVOKE_SUPER_RANGE);
		}
	}

	public static class INVOKE_DIRECT_RANGE extends INVOKE_KIND_RANGE {

		public INVOKE_DIRECT_RANGE(int offset) {
			super(offset, "INVOKE_DIRECT_RANGE", INVOKE_DIRECT_RANGE);
		}
	}

	public static class INVOKE_STATIC_RANGE extends INVOKE_KIND_RANGE {

		public INVOKE_STATIC_RANGE(int offset) {
			super(offset, "INVOKE_STATIC_RANGE", INVOKE_STATIC_RANGE);
		}
	}

	public static class INVOKE_INTERFACE_RANGE extends INVOKE_KIND_RANGE {

		public INVOKE_INTERFACE_RANGE(int offset) {
			super(offset, "INVOKE_INTERFACE_RANGE", INVOKE_INTERFACE_RANGE);
		}
	}

	public static class UNOP extends Bytecode {

		public UNOP(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class NEG_INT extends UNOP {

		public NEG_INT(int offset) {
			super(offset, "NEG_INT", NEG_INT);
		}
	}

	public static class NOT_INT extends UNOP {

		public NOT_INT(int offset) {
			super(offset, "NOT_INT", NOT_INT);
		}
	}	

	public static class NEG_LONG extends UNOP {

		public NEG_LONG(int offset) {
			super(offset, "NEG_LONG", NEG_LONG);
		}
	}	

	public static class NOT_LONG extends UNOP {

		public NOT_LONG(int offset) {
			super(offset, "NOT_LONG", NOT_LONG);
		}
	}	

	public static class NEG_FLOAT extends UNOP {

		public NEG_FLOAT(int offset) {
			super(offset, "NEG_FLOAT", NEG_FLOAT);
		}
	}	

	public static class NEG_DOUBLE extends UNOP {

		public NEG_DOUBLE(int offset) {
			super(offset, "NEG_DOUBLE", NEG_DOUBLE);
		}
	}	

	public static class INT_TO_LONG extends UNOP {

		public INT_TO_LONG(int offset) {
			super(offset, "INT_TO_LONG", INT_TO_LONG);
		}
	}	

	public static class INT_TO_FLOAT extends UNOP {

		public INT_TO_FLOAT(int offset) {
			super(offset, "INT_TO_FLOAT", INT_TO_FLOAT);
		}
	}	

	public static class INT_TO_DOUBLE extends UNOP {

		public INT_TO_DOUBLE(int offset) {
			super(offset, "INT_TO_DOUBLE", INT_TO_DOUBLE);
		}
	}	


	public static class LONG_TO_INT extends UNOP {

		public LONG_TO_INT(int offset) {
			super(offset, "LONG_TO_INT", LONG_TO_INT);
		}
	}	

	public static class LONG_TO_FLOAT extends UNOP {

		public LONG_TO_FLOAT(int offset) {
			super(offset, "LONG_TO_FLOAT", LONG_TO_FLOAT);
		}
	}	

	public static class LONG_TO_DOUBLE extends UNOP {

		public LONG_TO_DOUBLE(int offset) {
			super(offset, "LONG_TO_DOUBLE", LONG_TO_DOUBLE);
		}
	}	

	public static class FLOAT_TO_INT extends UNOP {

		public FLOAT_TO_INT(int offset) {
			super(offset, "FLOAT_TO_INT", FLOAT_TO_INT);
		}
	}	

	public static class FLOAT_TO_LONG extends UNOP {

		public FLOAT_TO_LONG(int offset) {
			super(offset, "FLOAT_TO_LONG", FLOAT_TO_LONG);
		}
	}	

	public static class FLOAT_TO_DOUBLE extends UNOP {

		public FLOAT_TO_DOUBLE(int offset) {
			super(offset, "FLOAT_TO_DOUBLE", FLOAT_TO_DOUBLE);
		}
	}

	public static class DOUBLE_TO_INT extends UNOP {

		public DOUBLE_TO_INT(int offset) {
			super(offset, "DOUBLE_TO_INT", DOUBLE_TO_INT);
		}
	}

	public static class DOUBLE_TO_LONG extends UNOP {

		public DOUBLE_TO_LONG(int offset) {
			super(offset, "DOUBLE_TO_LONG", DOUBLE_TO_LONG);
		}
	}

	public static class DOUBLE_TO_FLOAT extends UNOP {

		public DOUBLE_TO_FLOAT(int offset) {
			super(offset, "DOUBLE_TO_FLOAT", DOUBLE_TO_FLOAT);
		}
	}

	public static class INT_TO_BYTE extends UNOP {

		public INT_TO_BYTE(int offset) {
			super(offset, "INT_TO_BYTE", INT_TO_BYTE);
		}
	}

	public static class INT_TO_CHAR extends UNOP {

		public INT_TO_CHAR(int offset) {
			super(offset, "INT_TO_CHAR", INT_TO_CHAR);
		}
	}

	public static class INT_TO_SHORT extends UNOP {

		public INT_TO_SHORT(int offset) {
			super(offset, "INT_TO_SHORT", INT_TO_SHORT);
		}
	}

	public static class BINOP extends Bytecode {

		public BINOP(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class ADD_INT extends BINOP {

		public ADD_INT(int offset) {
			super(offset, "ADD_INT", ADD_INT);
		}
	}

	public static class SUB_INT extends BINOP {

		public SUB_INT(int offset) {
			super(offset, "SUB_INT", SUB_INT);
		}
	}

	public static class MUL_INT extends BINOP {

		public MUL_INT(int offset) {
			super(offset, "MUL_INT", SUB_INT);
		}
	}

	public static class DIV_INT extends BINOP {

		public DIV_INT(int offset) {
			super(offset, "DIV_INT", DIV_INT);
		}
	}

	public static class REM_INT extends BINOP {

		public REM_INT(int offset) {
			super(offset, "REM_INT", REM_INT);
		}
	}

	public static class AND_INT extends BINOP {

		public AND_INT(int offset) {
			super(offset, "AND_INT", AND_INT);
		}
	}

	public static class OR_INT extends BINOP {

		public OR_INT(int offset) {
			super(offset, "OR_INT", OR_INT);
		}
	}

	public static class XOR_INT extends BINOP {

		public XOR_INT(int offset) {
			super(offset, "XOR_INT", XOR_INT);
		}
	}

	public static class SHL_INT extends BINOP {

		public SHL_INT(int offset) {
			super(offset, "SHL_INT", SHL_INT);
		}
	}

	public static class SHR_INT extends BINOP {

		public SHR_INT(int offset) {
			super(offset, "SHR_INT", SHR_INT);
		}
	}

	public static class USHR_INT extends BINOP {

		public USHR_INT(int offset) {
			super(offset, "USHR_INT", USHR_INT);
		}
	}

	public static class ADD_LONG extends BINOP {

		public ADD_LONG(int offset) {
			super(offset, "ADD_LONG", ADD_LONG);
		}
	}

	public static class SUB_LONG extends BINOP {

		public SUB_LONG(int offset) {
			super(offset, "SUB_LONG", SUB_LONG);
		}
	}

	public static class MUL_LONG extends BINOP {

		public MUL_LONG(int offset) {
			super(offset, "MUL_LONG", MUL_LONG);
		}
	}

	public static class DIV_LONG extends BINOP {

		public DIV_LONG(int offset) {
			super(offset, "DIV_LONG", DIV_LONG);
		}
	}

	public static class REM_LONG extends BINOP {

		public REM_LONG(int offset) {
			super(offset, "REM_LONG", REM_LONG);
		}
	}

	public static class AND_LONG extends BINOP {

		public AND_LONG(int offset) {
			super(offset, "AND_LONG", AND_LONG);
		}
	}

	public static class OR_LONG extends BINOP {

		public OR_LONG(int offset) {
			super(offset, "OR_LONG", OR_LONG);
		}
	}

	public static class XOR_LONG extends BINOP {

		public XOR_LONG(int offset) {
			super(offset, "XOR_LONG", XOR_LONG);
		}
	}

	public static class SHL_LONG extends BINOP {

		public SHL_LONG(int offset) {
			super(offset, "SHL_LONG", SHL_LONG);
		}
	}

	public static class SHR_LONG extends BINOP {

		public SHR_LONG(int offset) {
			super(offset, "SHR_LONG", SHR_LONG);
		}
	}	

	public static class USHR_LONG extends BINOP {

		public USHR_LONG(int offset) {
			super(offset, "USHR_LONG", USHR_LONG);
		}
	}
	
	public static class ADD_FLOAT extends BINOP {

		public ADD_FLOAT(int offset) {
			super(offset, "ADD_FLOAT", ADD_FLOAT);
		}
	}

	public static class SUB_FLOAT extends BINOP {

		public SUB_FLOAT(int offset) {
			super(offset, "SUB_FLOAT", SUB_FLOAT);
		}
	}

	public static class MUL_FLOAT extends BINOP {

		public MUL_FLOAT(int offset) {
			super(offset, "MUL_FLOAT", MUL_FLOAT);
		}
	}

	public static class DIV_FLOAT extends BINOP {

		public DIV_FLOAT(int offset) {
			super(offset, "DIV_FLOAT", DIV_FLOAT);
		}
	}

	public static class REM_FLOAT extends BINOP {

		public REM_FLOAT(int offset) {
			super(offset, "REM_FLOAT", REM_FLOAT);
		}
	}

	public static class ADD_DOUBLE extends BINOP {

		public ADD_DOUBLE(int offset) {
			super(offset, "ADD_DOUBLE", ADD_DOUBLE);
		}
	}

	public static class SUB_DOUBLE extends BINOP {

		public SUB_DOUBLE(int offset) {
			super(offset, "SUB_DOUBLE", SUB_DOUBLE);
		}
	}

	public static class MUL_DOUBLE extends BINOP {

		public MUL_DOUBLE(int offset) {
			super(offset, "MUL_DOUBLE", MUL_DOUBLE);
		}
	}

	public static class DIV_DOUBLE extends BINOP {

		public DIV_DOUBLE(int offset) {
			super(offset, "DIV_DOUBLE", DIV_DOUBLE);
		}
	}

	public static class REM_DOUBLE extends BINOP {

		public REM_DOUBLE(int offset) {
			super(offset, "REM_DOUBLE", REM_DOUBLE);
		}
	}

	public static class BINOP_2ADDR extends Bytecode {

		public BINOP_2ADDR(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class ADD_INT_2ADDR extends BINOP_2ADDR {

		public ADD_INT_2ADDR(int offset) {
			super(offset, "ADD_INT_2ADDR", ADD_INT_2ADDR);
		}
	}

	public static class SUB_INT_2ADDR extends BINOP_2ADDR {

		public SUB_INT_2ADDR(int offset) {
			super(offset, "SUB_INT_2ADDR", SUB_INT_2ADDR);
		}
	}

	public static class MUL_INT_2ADDR extends BINOP_2ADDR {

		public MUL_INT_2ADDR(int offset) {
			super(offset, "MUL_INT_2ADDR", MUL_INT_2ADDR);
		}
	}

	public static class DIV_INT_2ADDR extends BINOP_2ADDR {

		public DIV_INT_2ADDR(int offset) {
			super(offset, "DIV_INT_2ADDR", DIV_INT_2ADDR);
		}
	}

	public static class REM_INT_2ADDR extends BINOP_2ADDR {

		public REM_INT_2ADDR(int offset) {
			super(offset, "REM_INT_2ADDR", REM_INT_2ADDR);
		}
	}

	public static class AND_INT_2ADDR extends BINOP_2ADDR {

		public AND_INT_2ADDR(int offset) {
			super(offset, "AND_INT_2ADDR", AND_INT_2ADDR);
		}
	}

	public static class OR_INT_2ADDR extends BINOP_2ADDR {

		public OR_INT_2ADDR(int offset) {
			super(offset, "OR_INT_2ADDR", OR_INT_2ADDR);
		}
	}

	public static class XOR_INT_2ADDR extends BINOP_2ADDR {

		public XOR_INT_2ADDR(int offset) {
			super(offset, "XOR_INT_2ADDR", XOR_INT_2ADDR);
		}
	}

	public static class SHL_INT_2ADDR extends BINOP_2ADDR {

		public SHL_INT_2ADDR(int offset) {
			super(offset, "SHL_INT_2ADDR", SHL_INT_2ADDR);
		}
	}

	public static class SHR_INT_2ADDR extends BINOP_2ADDR {

		public SHR_INT_2ADDR(int offset) {
			super(offset, "SHR_INT_2ADDR", SHR_INT_2ADDR);
		}
	}

	public static class USHR_INT_2ADDR extends BINOP_2ADDR {

		public USHR_INT_2ADDR(int offset) {
			super(offset, "USHR_INT_2ADDR", USHR_INT_2ADDR);
		}
	}

	public static class ADD_LONG_2ADDR extends BINOP_2ADDR {

		public ADD_LONG_2ADDR(int offset) {
			super(offset, "ADD_LONG_2ADDR", ADD_LONG_2ADDR);
		}
	}

	public static class SUB_LONG_2ADDR extends BINOP_2ADDR {

		public SUB_LONG_2ADDR(int offset) {
			super(offset, "SUB_LONG_2ADDR", SUB_LONG_2ADDR);
		}
	}

	public static class MUL_LONG_2ADDR extends BINOP_2ADDR {

		public MUL_LONG_2ADDR(int offset) {
			super(offset, "MUL_LONG_2ADDR", MUL_LONG_2ADDR);
		}
	}

	public static class DIV_LONG_2ADDR extends BINOP_2ADDR {

		public DIV_LONG_2ADDR(int offset) {
			super(offset, "DIV_LONG_2ADDR", DIV_LONG_2ADDR);
		}
	}

	public static class REM_LONG_2ADDR extends BINOP_2ADDR {

		public REM_LONG_2ADDR(int offset) {
			super(offset, "REM_LONG_2ADDR", REM_LONG_2ADDR);
		}
	}

	public static class AND_LONG_2ADDR extends BINOP_2ADDR {

		public AND_LONG_2ADDR(int offset) {
			super(offset, "AND_LONG_2ADDR", AND_LONG_2ADDR);
		}
	}

	public static class OR_LONG_2ADDR extends BINOP_2ADDR {

		public OR_LONG_2ADDR(int offset) {
			super(offset, "OR_LONG_2ADDR", OR_LONG_2ADDR);
		}
	}

	public static class XOR_LONG_2ADDR extends BINOP_2ADDR {

		public XOR_LONG_2ADDR(int offset) {
			super(offset, "XOR_LONG_2ADDR", XOR_LONG_2ADDR);
		}
	}

	public static class SHL_LONG_2ADDR extends BINOP_2ADDR {

		public SHL_LONG_2ADDR(int offset) {
			super(offset, "SHL_LONG_2ADDR", SHL_LONG_2ADDR);
		}
	}

	public static class SHR_LONG_2ADDR extends BINOP_2ADDR {

		public SHR_LONG_2ADDR(int offset) {
			super(offset, "SHR_LONG_2ADDR", SHR_LONG_2ADDR);
		}
	}	

	public static class USHR_LONG_2ADDR extends BINOP_2ADDR {

		public USHR_LONG_2ADDR(int offset) {
			super(offset, "USHR_LONG_2ADDR", USHR_LONG_2ADDR);
		}
	}
	
	public static class ADD_FLOAT_2ADDR extends BINOP_2ADDR {

		public ADD_FLOAT_2ADDR(int offset) {
			super(offset, "ADD_FLOAT_2ADDR", ADD_FLOAT_2ADDR);
		}
	}

	public static class SUB_FLOAT_2ADDR extends BINOP_2ADDR {

		public SUB_FLOAT_2ADDR(int offset) {
			super(offset, "SUB_FLOAT_2ADDR", SUB_FLOAT_2ADDR);
		}
	}

	public static class MUL_FLOAT_2ADDR extends BINOP_2ADDR {

		public MUL_FLOAT_2ADDR(int offset) {
			super(offset, "MUL_FLOAT_2ADDR", MUL_FLOAT_2ADDR);
		}
	}

	public static class DIV_FLOAT_2ADDR extends BINOP_2ADDR {

		public DIV_FLOAT_2ADDR(int offset) {
			super(offset, "DIV_FLOAT_2ADDR", DIV_FLOAT_2ADDR);
		}
	}

	public static class REM_FLOAT_2ADDR extends BINOP_2ADDR {

		public REM_FLOAT_2ADDR(int offset) {
			super(offset, "REM_FLOAT_2ADDR", REM_FLOAT_2ADDR);
		}
	}

	public static class ADD_DOUBLE_2ADDR extends BINOP_2ADDR {

		public ADD_DOUBLE_2ADDR(int offset) {
			super(offset, "ADD_DOUBLE_2ADDR", ADD_DOUBLE_2ADDR);
		}
	}

	public static class SUB_DOUBLE_2ADDR extends BINOP_2ADDR {

		public SUB_DOUBLE_2ADDR(int offset) {
			super(offset, "SUB_DOUBLE_2ADDR", SUB_DOUBLE_2ADDR);
		}
	}

	public static class MUL_DOUBLE_2ADDR extends BINOP_2ADDR {

		public MUL_DOUBLE_2ADDR(int offset) {
			super(offset, "MUL_DOUBLE_2ADDR", MUL_DOUBLE_2ADDR);
		}
	}

	public static class DIV_DOUBLE_2ADDR extends BINOP_2ADDR {

		public DIV_DOUBLE_2ADDR(int offset) {
			super(offset, "DIV_DOUBLE_2ADDR", DIV_DOUBLE_2ADDR);
		}
	}

	public static class REM_DOUBLE_2ADDR extends BINOP_2ADDR {

		public REM_DOUBLE_2ADDR(int offset) {
			super(offset, "REM_DOUBLE_2ADDR", REM_DOUBLE_2ADDR);
		}
	}

	public static class BINOP_LIT16 extends Bytecode {

		public BINOP_LIT16(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class ADD_INT_LIT16 extends BINOP_LIT16 {

		public ADD_INT_LIT16(int offset) {
			super(offset, "ADD_INT_LIT16", ADD_INT_LIT16);
		}
	}

	public static class RSUB_INT_LIT16 extends BINOP_LIT16 {

		public RSUB_INT_LIT16(int offset) {
			super(offset, "RSUB_INT_LIT16", RSUB_INT_LIT16);
		}
	}

	public static class MUL_INT_LIT16 extends BINOP_LIT16 {

		public MUL_INT_LIT16(int offset) {
			super(offset, "MUL_INT_LIT16", MUL_INT_LIT16);
		}
	}

	public static class DIV_INT_LIT16 extends BINOP_LIT16 {

		public DIV_INT_LIT16(int offset) {
			super(offset, "DIV_INT_LIT16", DIV_INT_LIT16);
		}
	}

	public static class REM_INT_LIT16 extends BINOP_LIT16 {

		public REM_INT_LIT16(int offset) {
			super(offset, "REM_INT_LIT16", REM_INT_LIT16);
		}
	}

	public static class AND_INT_LIT16 extends BINOP_LIT16 {

		public AND_INT_LIT16(int offset) {
			super(offset, "AND_INT_LIT16", AND_INT_LIT16);
		}
	}

	public static class OR_INT_LIT16 extends BINOP_LIT16 {

		public OR_INT_LIT16(int offset) {
			super(offset, "OR_INT_LIT16", OR_INT_LIT16);
		}
	}

	public static class XOR_INT_LIT16 extends BINOP_LIT16 {

		public XOR_INT_LIT16(int offset) {
			super(offset, "XOR_INT_LIT16", XOR_INT_LIT16);
		}
	}

	public static class BINOP_LIT8 extends Bytecode {

		public BINOP_LIT8(int offset, String name, byte opcode) {
			super(offset, name, opcode);
		}
	}

	public static class ADD_INT_LIT8 extends BINOP_LIT8 {

		public ADD_INT_LIT8(int offset) {
			super(offset, "ADD_INT_LIT8", ADD_INT_LIT8);
		}
	}

	public static class RSUB_INT_LIT8 extends BINOP_LIT8 {

		public RSUB_INT_LIT8(int offset) {
			super(offset, "RSUB_INT_LIT8", RSUB_INT_LIT8);
		}
	}

	public static class MUL_INT_LIT8 extends BINOP_LIT8 {

		public MUL_INT_LIT8(int offset) {
			super(offset, "MUL_INT_LIT8", MUL_INT_LIT8);
		}
	}

	public static class DIV_INT_LIT8 extends BINOP_LIT8 {

		public DIV_INT_LIT8(int offset) {
			super(offset, "DIV_INT_LIT8", DIV_INT_LIT8);
		}
	}

	public static class REM_INT_LIT8 extends BINOP_LIT8 {

		public REM_INT_LIT8(int offset) {
			super(offset, "REM_INT_LIT8", REM_INT_LIT8);
		}
	}

	public static class AND_INT_LIT8 extends BINOP_LIT8 {

		public AND_INT_LIT8(int offset) {
			super(offset, "AND_INT_LIT8", AND_INT_LIT8);
		}
	}

	public static class OR_INT_LIT8 extends BINOP_LIT8 {

		public OR_INT_LIT8(int offset) {
			super(offset, "OR_INT_LIT8", OR_INT_LIT8);
		}
	}

	public static class XOR_INT_LIT8 extends BINOP_LIT8 {

		public XOR_INT_LIT8(int offset) {
			super(offset, "XOR_INT_LIT8", XOR_INT_LIT8);
		}
	}

	public static class SHL_INT_LIT8 extends BINOP_LIT8 {

		public SHL_INT_LIT8(int offset) {
			super(offset, "SHL_INT_LIT8", SHL_INT_LIT8);
		}
	}

	public static class SHR_INT_LIT8 extends BINOP_LIT8 {

		public SHR_INT_LIT8(int offset) {
			super(offset, "SHR_INT_LIT8", SHR_INT_LIT8);
		}
	}

	public static class USHR_INT_LIT8 extends BINOP_LIT8 {

		public USHR_INT_LIT8(int offset) {
			super(offset, "USHR_INT_LIT8", USHR_INT_LIT8);
		}
	}

	public static class INVOKE_POLYMORPHIC extends Bytecode {

		public INVOKE_POLYMORPHIC(int offset) {
			super(offset, "INVOKE_POLYMORPHIC", INVOKE_POLYMORPHIC);
		}
	}

	public static class INVOKE_POLYMORPHIC_RANGE extends Bytecode {

		public INVOKE_POLYMORPHIC_RANGE(int offset) {
			super(offset, "INVOKE_POLYMORPHIC_RANGE", INVOKE_POLYMORPHIC_RANGE);
		}
	}

	public static class INVOKE_CUSTOM extends Bytecode {
		
		public INVOKE_CUSTOM(int offset) {
			super(offset, "INVOKE_CUSTOM", INVOKE_CUSTOM);
		}
	}

	public static class INVOKE_CUSTOM_RANGE extends Bytecode {

		public INVOKE_CUSTOM_RANGE(int offset) {
			super(offset, "INVOKE_CUSTOM_RANGE", INVOKE_CUSTOM_RANGE);
		}
	}

	public static final byte NOP = (byte) 0x00;
	public static final byte MOVE = (byte) 0x01;
	public static final byte MOVE_FROM16 = (byte) 0x02;
	public static final byte MOVE16 = (byte) 0x03;
	public static final byte MOVE_WIDE = (byte) 0x04;
	public static final byte MOVE_WIDE_FROM16 = (byte) 0x05;
	public static final byte MOVE_WIDE16 = (byte) 0x06;
	public static final byte MOVE_OBJECT = (byte) 0x07;
	public static final byte MOVE_OBJECT_FROM16 = (byte) 0x08;
	public static final byte MOVE_OBJECT16 = (byte) 0x09;
	public static final byte MOVE_RESULT = (byte) 0x0a;
	public static final byte MOVE_RESULT_WIDE = (byte) 0x0b;
	public static final byte MOVE_RESULT_OBJECT = (byte) 0x0c;
	public static final byte MOVE_EXCEPTION = (byte) 0x0d;
	public static final byte RETURN_VOID = (byte) 0x0e;
	public static final byte RETURN = (byte) 0x0f;
	public static final byte RETURN_WIDE = (byte) 0x10;
	public static final byte RETURN_OBJECT = (byte) 0x11;
	public static final byte CONST4 = (byte) 0x12;
	public static final byte CONST16 = (byte) 0x13;
	public static final byte CONST = (byte) 0x14;
	public static final byte CONST_HIGH16 = (byte) 0x15;
	public static final byte CONST_WIDE16 = (byte) 0x16;
	public static final byte CONST_WIDE32 = (byte) 0x17;
	public static final byte CONST_WIDE = (byte) 0x18;
	public static final byte CONST_WIDE_HIGH16 = (byte) 0x19;
	public static final byte CONST_STRING = (byte) 0x1a;
	public static final byte CONST_STRING_JUMBO = (byte) 0x1b;
	public static final byte CONST_CLASS = (byte) 0x1c;
	public static final byte MONITOR_ENTER = (byte) 0x1d;
	public static final byte MONITOR_EXIT = (byte) 0x1e;
	public static final byte CHECK_CAST = (byte) 0x1f;
	public static final byte INSTANCE_OF = (byte) 0x20;
	public static final byte ARRAY_LENGTH = (byte) 0x21;
	public static final byte NEW_INSTANCE = (byte) 0x22;
	public static final byte NEW_ARRAY = (byte) 0x23;
	public static final byte FILLED_NEW_ARRAY = (byte) 0x24;
	public static final byte FILLED_NEW_ARRAY_RANGE = (byte) 0x25;
	public static final byte FILL_ARRAY_DATA = (byte) 0x26;
	public static final byte THROW = (byte) 0x27;
	public static final byte GOTO = (byte) 0x28;
	public static final byte GOTO16 = (byte) 0x29;
	public static final byte GOTO32 = (byte) 0x2a;
	public static final byte PACKED_SWITCH = (byte) 0x2b;
	public static final byte SPARSE_SWITCH = (byte) 0x2c;
	public static final byte CMPL_FLOAT = (byte) 0x2d;
	public static final byte CMPG_FLOAT = (byte) 0x2e;
	public static final byte CMPL_DOUBLE = (byte) 0x2f;
	public static final byte CMPG_DOUBLE = (byte) 0x30;
	public static final byte CMP_LONG = (byte) 0x31;
	public static final byte IF_EQ = (byte) 0x32;
	public static final byte IF_NE = (byte) 0x33;
	public static final byte IF_LT = (byte) 0x34;
	public static final byte IF_GE = (byte) 0x35;
	public static final byte IF_GT = (byte) 0x36;
	public static final byte IF_LE = (byte) 0x37;
	public static final byte IF_EQZ = (byte) 0x38;
	public static final byte IF_NEZ = (byte) 0x39;
	public static final byte IF_LTZ = (byte) 0x3a;
	public static final byte IF_GEZ = (byte) 0x3b;
	public static final byte IF_GTZ = (byte) 0x3c;
	public static final byte IF_LEZ = (byte) 0x3d;
	public static final byte AGET = (byte) 0x44;
	public static final byte AGET_WIDE = (byte) 0x45;
	public static final byte AGET_OBJECT = (byte) 0x46;
	public static final byte AGET_BOOLEAN = (byte) 0x47;
	public static final byte AGET_BYTE = (byte) 0x48;
	public static final byte AGET_CHAR = (byte) 0x49;
	public static final byte AGET_SHORT = (byte) 0x4a;
	public static final byte APUT = (byte) 0x4b;
	public static final byte APUT_WIDE = (byte) 0x4c;
	public static final byte APUT_OBJECT = (byte) 0x4d;
	public static final byte APUT_BOOLEAN = (byte) 0x4e;
	public static final byte APUT_BYTE = (byte) 0x4f;
	public static final byte APUT_CHAR = (byte) 0x50;
	public static final byte APUT_SHORT = (byte) 0x51;
	public static final byte IGET = (byte) 0x52;
	public static final byte IGET_WIDE = (byte) 0x53;
	public static final byte IGET_OBJECT = (byte) 0x54;
	public static final byte IGET_BOOLEAN = (byte) 0x55;
	public static final byte IGET_BYTE = (byte) 0x56;
	public static final byte IGET_CHAR = (byte) 0x57;
	public static final byte IGET_SHORT = (byte) 0x58;
	public static final byte IPUT = (byte) 0x59;
	public static final byte IPUT_WIDE = (byte) 0x5a;
	public static final byte IPUT_OBJECT = (byte) 0x5b;
	public static final byte IPUT_BOOLEAN = (byte) 0x5c;
	public static final byte IPUT_BYTE = (byte) 0x5d;
	public static final byte IPUT_CHAR = (byte) 0x5e;
	public static final byte IPUT_SHORT = (byte) 0x5f;
	public static final byte SGET = (byte) 0x60;
	public static final byte SGET_WIDE = (byte) 0x61;
	public static final byte SGET_OBJECT = (byte) 0x62;
	public static final byte SGET_BOOLEAN = (byte) 0x63;
	public static final byte SGET_BYTE = (byte) 0x64;
	public static final byte SGET_CHAR = (byte) 0x65;
	public static final byte SGET_SHORT = (byte) 0x66;
	public static final byte SPUT = (byte) 0x67;
	public static final byte SPUT_WIDE = (byte) 0x68;
	public static final byte SPUT_OBJECT = (byte) 0x69;
	public static final byte SPUT_BOOLEAN = (byte) 0x6a;
	public static final byte SPUT_BYTE = (byte) 0x6b;
	public static final byte SPUT_CHAR = (byte) 0x6c;
	public static final byte SPUT_SHORT = (byte) 0x6d;
	public static final byte INVOKE_VIRTUAL = (byte) 0x6e;
	public static final byte INVOKE_SUPER = (byte) 0x6f;
	public static final byte INVOKE_DIRECT = (byte) 0x70;
	public static final byte INVOKE_STATIC = (byte) 0x71;
	public static final byte INVOKE_INTERFACE = (byte) 0x72;
	public static final byte INVOKE_VIRTUAL_RANGE = (byte) 0x74;
	public static final byte INVOKE_SUPER_RANGE = (byte) 0x75;
	public static final byte INVOKE_DIRECT_RANGE = (byte) 0x76;
	public static final byte INVOKE_STATIC_RANGE = (byte) 0x77;
	public static final byte INVOKE_INTERFACE_RANGE = (byte) 0x78;
	public static final byte NEG_INT = (byte) 0x7b;
	public static final byte NOT_INT = (byte) 0x7c;
	public static final byte NEG_LONG = (byte) 0x7d;
	public static final byte NOT_LONG = (byte) 0x7e;
	public static final byte NEG_FLOAT = (byte) 0x7f;
	public static final byte NEG_DOUBLE = (byte) 0x80;
	public static final byte INT_TO_LONG = (byte) 0x81;
	public static final byte INT_TO_FLOAT = (byte) 0x82;
	public static final byte INT_TO_DOUBLE = (byte) 0x83;
	public static final byte LONG_TO_INT = (byte) 0x84;
	public static final byte LONG_TO_FLOAT = (byte) 0x85;
	public static final byte LONG_TO_DOUBLE = (byte) 0x86;
	public static final byte FLOAT_TO_INT = (byte) 0x87;
	public static final byte FLOAT_TO_LONG = (byte) 0x88;
	public static final byte FLOAT_TO_DOUBLE = (byte) 0x89;
	public static final byte DOUBLE_TO_INT = (byte) 0x8a;
	public static final byte DOUBLE_TO_LONG = (byte) 0x8b;
	public static final byte DOUBLE_TO_FLOAT = (byte) 0x8c;
	public static final byte INT_TO_BYTE = (byte) 0x8d;
	public static final byte INT_TO_CHAR = (byte) 0x8e;
	public static final byte INT_TO_SHORT = (byte) 0x8f;
	public static final byte ADD_INT = (byte) 0x90;
	public static final byte SUB_INT = (byte) 0x91;
	public static final byte MUL_INT = (byte) 0x92;
	public static final byte DIV_INT = (byte) 0x93;
	public static final byte REM_INT = (byte) 0x94;
	public static final byte AND_INT = (byte) 0x95;
	public static final byte OR_INT = (byte) 0x96;
	public static final byte XOR_INT = (byte) 0x97;
	public static final byte SHL_INT = (byte) 0x98;
	public static final byte SHR_INT = (byte) 0x99;
	public static final byte USHR_INT = (byte) 0x9a;
	public static final byte ADD_LONG = (byte) 0x9b;
	public static final byte SUB_LONG = (byte) 0x9c;
	public static final byte MUL_LONG = (byte) 0x9d;
	public static final byte DIV_LONG = (byte) 0x9e;
	public static final byte REM_LONG = (byte) 0x9f;
	public static final byte AND_LONG = (byte) 0xa0;
	public static final byte OR_LONG = (byte) 0xa1;
	public static final byte XOR_LONG = (byte) 0xa2;
	public static final byte SHL_LONG = (byte) 0xa3;
	public static final byte SHR_LONG = (byte) 0xa4;
	public static final byte USHR_LONG = (byte) 0xa5;
	public static final byte ADD_FLOAT = (byte) 0xa6;
	public static final byte SUB_FLOAT = (byte) 0xa7;
	public static final byte MUL_FLOAT = (byte) 0xa8;
	public static final byte DIV_FLOAT = (byte) 0xa9;
	public static final byte REM_FLOAT = (byte) 0xaa;
	public static final byte ADD_DOUBLE = (byte) 0xab;
	public static final byte SUB_DOUBLE = (byte) 0xac;
	public static final byte MUL_DOUBLE = (byte) 0xae;
	public static final byte DIV_DOUBLE = (byte) 0xad;
	public static final byte REM_DOUBLE = (byte) 0xaf;
	public static final byte ADD_INT_2ADDR = (byte) 0xb0;
	public static final byte SUB_INT_2ADDR = (byte) 0xb1;
	public static final byte MUL_INT_2ADDR = (byte) 0xb2;
	public static final byte DIV_INT_2ADDR = (byte) 0xb3;
	public static final byte REM_INT_2ADDR = (byte) 0xb4;
	public static final byte AND_INT_2ADDR = (byte) 0xb5;
	public static final byte OR_INT_2ADDR = (byte) 0xb6;
	public static final byte XOR_INT_2ADDR = (byte) 0xb7;
	public static final byte SHL_INT_2ADDR = (byte) 0xb8;
	public static final byte SHR_INT_2ADDR = (byte) 0xb9;
	public static final byte USHR_INT_2ADDR = (byte) 0xba;
	public static final byte ADD_LONG_2ADDR = (byte) 0xbb;
	public static final byte SUB_LONG_2ADDR = (byte) 0xbc;
	public static final byte MUL_LONG_2ADDR = (byte) 0xbd;
	public static final byte DIV_LONG_2ADDR = (byte) 0xbe;
	public static final byte REM_LONG_2ADDR = (byte) 0xbf;
	public static final byte AND_LONG_2ADDR = (byte) 0xc0;
	public static final byte OR_LONG_2ADDR = (byte) 0xc1;
	public static final byte XOR_LONG_2ADDR = (byte) 0xc2;
	public static final byte SHL_LONG_2ADDR = (byte) 0xc3;
	public static final byte SHR_LONG_2ADDR = (byte) 0xc4;
	public static final byte USHR_LONG_2ADDR = (byte) 0xc5;
	public static final byte ADD_FLOAT_2ADDR = (byte) 0xc6;
	public static final byte SUB_FLOAT_2ADDR = (byte) 0xc7;
	public static final byte MUL_FLOAT_2ADDR = (byte) 0xc8;
	public static final byte DIV_FLOAT_2ADDR = (byte) 0xc9;
	public static final byte REM_FLOAT_2ADDR = (byte) 0xca;
	public static final byte ADD_DOUBLE_2ADDR = (byte) 0xcb;
	public static final byte SUB_DOUBLE_2ADDR = (byte) 0xcc;
	public static final byte MUL_DOUBLE_2ADDR = (byte) 0xcd;
	public static final byte DIV_DOUBLE_2ADDR = (byte) 0xce;
	public static final byte REM_DOUBLE_2ADDR = (byte) 0xcf;
	public static final byte ADD_INT_LIT16= (byte) 0xd0;
	public static final byte RSUB_INT_LIT16 = (byte) 0xd1;
	public static final byte MUL_INT_LIT16 = (byte) 0xd2;
	public static final byte DIV_INT_LIT16 = (byte) 0xd3;
	public static final byte REM_INT_LIT16 = (byte) 0xd4;
	public static final byte AND_INT_LIT16= (byte) 0xd5;
	public static final byte OR_INT_LIT16 = (byte) 0xd6;
	public static final byte XOR_INT_LIT16 = (byte) 0xd7;
	public static final byte ADD_INT_LIT8= (byte) 0xd8;
	public static final byte RSUB_INT_LIT8 = (byte) 0xd9;
	public static final byte MUL_INT_LIT8 = (byte) 0xda;
	public static final byte DIV_INT_LIT8 = (byte) 0xdb;
	public static final byte REM_INT_LIT8 = (byte) 0xdc;
	public static final byte AND_INT_LIT8= (byte) 0xdd;
	public static final byte OR_INT_LIT8 = (byte) 0xde;
	public static final byte XOR_INT_LIT8 = (byte) 0xdf;
	public static final byte SHL_INT_LIT8 = (byte) 0xe0;
	public static final byte SHR_INT_LIT8 = (byte) 0xe1;
	public static final byte USHR_INT_LIT8 = (byte) 0xe2;	
	public static final byte INVOKE_POLYMORPHIC = (byte)0xfa;
	public static final byte INVOKE_POLYMORPHIC_RANGE = (byte)0xfb;
	public static final byte INVOKE_CUSTOM = (byte)0xfc;
	public static final byte INVOKE_CUSTOM_RANGE = (byte)0xfd;
}
