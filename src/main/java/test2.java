import java.awt.*;
import java.util.Scanner;

/**
 * Project name(项目名称)：try catch finally语句
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/8
 * Time(创建时间)： 18:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = -1;
        //控制台输入变量:number
        int errCount = 0;
        while (true)
        {
            try
            {
                //min:0
                //max:50000000
                System.out.print("请输入一个数字：");
                number = input.nextInt();
                if (number >= 0 && number <= 50000000)
                {
                    break;
                }
                else
                {
                    errCount++;
                    Toolkit.getDefaultToolkit().beep();
                    if (errCount > 10)
                    {
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    System.out.println("输入的数据不在范围内! 范围：[0,50000000]");
                }
            }
            catch (Exception e)
            {
                errCount++;
                if (errCount > 5)
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.err.println("错误次数过多！！！退出");
                    System.exit(1);
                }
                else
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("输入错误！！！请重新输入！");
                    input.nextLine();
                }
            }
            finally
            {
                System.out.println("数字为：" + number);
            }
        }
    }
}
