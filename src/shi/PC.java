package shi;

public class PC {
  CPU cpu;
  HardDisk HD;
  void setCPU(CPU cpu){
	  this.cpu=cpu;
  }
  void setHardDisk(HardDisk HD){
	  this.HD=HD;
  }
  void show(){
	  System.out.println("CPU:"+cpu.getSpeed());
	    System.out.println("硬盘容量:"+HD.getAmount());
	     System.out.println("硬盘价格："+HD.getPrice());
	  System.out.println("CPU的名称："+cpu.getBrand());
	
	  
  }
}
