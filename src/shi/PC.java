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
	  System.out.println("CPUËÙ¶È:"+cpu.getSpeed());
	  System.out.println("CPU的品牌"+cpu.getBrand());
	  System.out.println("Ó²ÅÌÈÝÁ¿:"+HD.getAmount());
	  
  }
}
