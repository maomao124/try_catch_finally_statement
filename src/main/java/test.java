import java.util.Scanner;

/**
 * Project name(项目名称)：try catch finally语句
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/8
 * Time(创建时间)： 18:06
 * Version(版本): 1.0
 * Description(描述)：
 * 异常处理语法结构中只有 try 块是必需的，也就是说，如果没有 try 块，则不能有后面的 catch 块和 finally 块；
 * catch 块和 finally 块都是可选的，但 catch 块和 finally 块至少出现其中之一，也可以同时出现；
 * 可以有多个 catch 块，捕获父类异常的 catch 块必须位于捕获子类异常的后面；
 * 不能只有 try 块，既没有 catch 块，也没有 finally 块；
 * 多个 catch 块必须位于 try 块之后，finally 块必须位于所有的 catch 块之后。
 * finally 与 try 语句块匹配的语法格式，此种情况会导致异常丢失，所以不常见。
 * 一般情况下，无论是否有异常拋出，都会执行 finally 语句块中的语句
 * try catch finally 语句块的执行情况可以细分为以下 3 种情况：
 * 如果 try 代码块中没有拋出异常，则执行完 try 代码块之后直接执行 finally 代码块，然后执行 try catch finally 语句块之后的语句。
 * 如果 try 代码块中拋出异常，并被 catch 子句捕捉，那么在拋出异常的地方终止 try 代码块的执行，转而执行相匹配的 catch 代码块，
 * 之后执行 finally 代码块。如果 finally 代码块中没有拋出异常，则继续执行 try catch finally 语句块之后的语句；
 * 如果 finally 代码块中拋出异常，则把该异常传递给该方法的调用者。
 * 如果 try 代码块中拋出的异常没有被任何 catch 子句捕捉到，那么将直接执行 finally 代码块中的语句，并把该异常传递给该方法的调用者。
 * 除非在 try 块、catch 块中调用了退出虚拟机的方法System.exit(int status)，
 * 否则不管在 try 块或者 catch 块中执行怎样的代码，出现怎样的情况，异常处理的 finally 块总会执行。
 * 通常情况下不在 finally 代码块中使用 return 或 throw 等导致方法终止的语句，
 * 否则将会导致 try 和 catch 代码块中的 return 和 throw 语句失效
 */

public class test
{
    public static void main(String[] args)
    {
        test2.main(null);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Windows 系统已启动！");
        String[] pros = {"记事本", "计算器", "浏览器"};
        try
        {
            // 循环输出pros数组中的元素
            for (int i = 0; i < pros.length; i++)
            {
                System.out.println(i + 1 + "：" + pros[i]);
            }
            System.out.println("是否运行程序：");
            String answer = input.next();
            if (answer.equals("y"))
            {
                System.out.println("请输入程序编号：");
                int no = input.nextInt();
                System.out.println("正在运行程序[" + pros[no - 1] + "]");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("谢谢使用!");
        }
    }
}
