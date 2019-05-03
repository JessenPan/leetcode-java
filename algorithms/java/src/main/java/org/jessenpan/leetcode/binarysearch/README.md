## 二分查找

### 使用场景
1. 有序序列(数组、列表等形式)
2. 查找或者称之为等于某个元素

### 实现方式
1. 需要三个坐标，左、右、中三个坐标
2. 需要有个结束条件

### 同其他实现相比较
1. 与顺序查找的时间复杂度,它为`O(logN)`.而顺序查找为`O(n)`

### 注意事项
1. 二分法的边界取值与`java`进位之间的关系，导致最终结束条件的差异