package so;
//execute, faz a chamada do sistema, cria o processo depois que cria o processo vem o write, ai vai pro memory manager e sai interando la no for, actual ++ ate chegar no ultimo elemento e entrar no tratamento especial 
public class Execute {
	public static void main(String[] args) {
		Process p1 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p1);
		
		Process p2 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p2);
		
		Process p3 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p3);
		
		SystemOperation.systemCall(SystemCallType.DELETE_PROCESS,p3);
}
}
