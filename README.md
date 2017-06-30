# Everest
Android 手机拍照测距

村花测距: Android 手机拍照测距


知识背景

利用器具测距的方式方法较多， 手机拍照测距从类别来分应该是属于单目测距， 这是需要使用到具体的参数物作为参考的来作比对的， 

目前一些手机测距应用是使用到内置的感应器， 使用具体的方向、旋转角度来作为参考指标推算的， 

有些应用则是简单地使用到成像图片与已知实物大小的比例来作推算。

在 村花测距 应用中， 仍然是利用成像大小与实物的比例关系来估算， 不过在具体计算上引入了手机硬件的光学感应器的参数， 尽量做到成像大小精确。



计算的模型

1. 公式

一般光学公式是使用高斯成像公式， 不过对手机摄像头来说由于焦距较小， 所以直接使用小孔成像公式：

实际距离/焦距 = 实际长（宽）/成像长（宽）

2. 成像体系指标

我们可以使用 “面” 来理解一个成像过程， 涉及到的各个环节

a. 实物面， 也就是实物的真实平面

b. 感应面， 光线透过手机镜头落在光学感应器上形成的像平面， 光学感应器的尺寸和单个像素点的面积大小是手机硬件的一个指标

c. 屏幕面， 生成图片文件之后， 是需要显示在手机屏幕上的， 由于图片像素大小与屏幕大小是不同的， 所以这里仍然有一个转换的过程



减少误差和校正调整的方法

a. 在应用中的 “图片比对测量” 窗口， 会出现一个十字标尺， 尽量细心地比对长宽， 

需要注意的是黄色（测实物高度）和蓝色（测实物宽度）两条坐标轴的标度是不一致的， 

因为在大多数环境下， 我们图片长宽是 4：3 比例的（真正的原因是手机摄像头也正好是这个比例）， 

还有谁见过正方形的手机吗？

b. 在不设置校正参数条件下， 实际距离与计算出的距离是有差异的， 应该说是上述 “成像体系指标” 还有些因素没有考虑到并引入，

所以在这里我们可以使用线性拟合的方法， 更进在实际应用中的算法


结束语

编写这个手机应用主要是为了学习， 对于成像专业上的了解并不精通， 有错误之处就多交流。 谢谢


