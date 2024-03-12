package so;

import java.util.Objects;

import so.Schedule.Schedule;
import so.cpu.CpuManager;
import so.memory.MemoryManager;

public class SystemOperation {
	public static MemoryManager mm;
	public static CpuManager cm;
	public static Schedule schedule;

	public static Object systemCall(SystemCallType type, Process p) {
		if(type.equals(SystemCallType.CREATE_PROCESS)) {
			if (Objects.isNull(mm)) {
				mm = new MemoryManager();
				
			}
			if(Objects.isNull(cm)) {
				cm = new CpuManager();
			}
			return new Process();
		} else if (type.equals(SystemCallType.WRITE_PROCESS)) {
			//chama o gerenciador de memória
			mm.write(p);
		} else if (type.equals(SystemCallType.DELETE_PROCESS)) {
			//chama o gerenciador de memória
		} else if (type.equals(SystemCallType.READ_PROCESS)) {
		}
	    return null;	
	}


	}
