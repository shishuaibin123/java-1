package shi;

public class Test {
  public static void main(String args[]){
	CPU cpu=new CPU();
	HardDisk HD=new HardDisk();
	cpu.setspeed(2200);
	HD.setAmount(200);
	PC pc=new PC();
	pc.setCPU(cpu);
	pc.setHardDisk(HD);
	pc.show();
  }
}
