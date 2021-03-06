/**
 * 我绝对不会告诉你我觉得这里的代码是一坨翔 ╯°□°）╯
 * 有时候都不敢相信这是我写的
 * 要知道回去看自己写得垃圾代码真的会脸红
 * 所以我懒得去重构了
 * 就是人懒，重构到一半做其他的去了
 * 回来后就不想弄了
 * <p>
 * 如果你是一个很棒的开发者
 * 强烈建议你来把他重构（逃
 * <p>
 * 你可以参考的我的重构思路
 * 亦或者自己来重构
 * 相信你！你是最棒（pang）的！
 * <p>
 * 思路：
 * 需要一个接口 Generate，里面只有一个方法 generate
 * 并且有一个实现此接口的抽象类 AbstractGenerateImpl
 * 实现 generate，方法中调用私有方法，用来抽取生成的公共部分
 * 然后对数据库中的表进行遍历
 * 预留几个抽象方法由所有的需要生成的类来实现
 * 这几个抽象方法就是这几个生成的类不同的地方
 * 将其子类装载到 spring 的 ioc 容器中
 * 通过配置文件读取哪些需要生成的
 * 然后动态取出需要生成的实现抽象类的 Component
 * 调用其 generate 方法即可
 * <p>
 * 有些问题是你需要解决的
 * 比如如何动态取出同一个接口的实现类？
 * 比如如何抽取公共部分？
 * 再比如如何尽可能让子类做更少的事情。
 * <p>
 * 加油～！
 *
 * @author echo
 * @version 1.0
 * @date 19-5-7 14:26
 */
package cn.edu.gzmu.generate;

