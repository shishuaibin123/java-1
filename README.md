计G202  2020322098 石帅斌
# java-1
java课程作业仓库
## 1. 实验内容
1. 基本要求是完成教材P110页的第四题关于PC、HardDisk、CPU类的使用。
2. 每个类定义不少于两个属性，且属性的类型应该多样化;
3. 根据课堂中关于访问权限的内容，尝试定义属性的修饰多样化，类中定义方法操作属性，避免直接通过“类对象属性的形式访问属性值;且定义的方法内应该又符合常理的逻辑判断.
4. 尝试把本次实验的多个类放置在不同的包中.
## 2. 实验设计
1.设置硬盘对象，给HardDisk对象设置amount,prise方法。设置amount,prise方法在硬盘对象
```
   public class HardDisk {
  int amount;
  int prise;
  int getAmount(){
  }
  ```
 ## 3. 核心方法
 
    1
           public int getSpeed() {
		return Speed;
	   }

	   public void setSpeed(int speed) {
		 this.Speed = speed;
	   }

	   public String getName() {
		 return name;
	   }


	   public void setName(String name) {
		 this.name = name;
	   }
  
    2.
   
          CPU cpu=new CPU();
	     HardDisk HD= new HardDisk();
   
   
   ## 4. 实验结果
   
    CPU:2200
    硬盘容量:200
    CPU名称:007
    cpu价格：1200
  ## 5.实验感想

  + 1.通过这个实验学习到了，在一个包里不同文件中如何建立联系，每个类中所代表的含义。发现自己要学的东西好友很多。
  + 2.学会了如何使用构造方法来获取值。
   
