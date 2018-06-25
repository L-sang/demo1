# 斗地主

斗地主流程图
![](https://github.com/L-sang/value/blob/master/%E6%96%97%E5%9C%B0%E4%B8%BB%E5%8A%9F%E8%83%BD.JPG)

 实现模拟斗地主的功能 
* 组合牌
  * 创建Map集合,键是编号,值是牌
  * 创建List集合,存储编号
  * 定义出13个点数的数组{"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
  * 定义4个花色数组{"♠","♥","♣","♦"};
  * 遍历数组,花色+点数的组合,存储到Map集合
```  for(String number : numbers){
			for(String color : colors){
				pooker.put(index, color+number);
				pookerNumber.add(index);
				index++;
			}
		}
```  
