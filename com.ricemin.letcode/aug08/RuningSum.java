package aug08;

/**
 * @ProjectName: jvm-test
 * https://leetcode-cn.com/problems/running-sum-of-1d-array/submissions/
 * @Package: aug08
 * @ClassName: RuningSum
 * @Description: java类作用描述
 * @Author: ricemin
 * @CreateDate: 2020-08-08 14:32
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-08-08 14:32
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class RuningSum {

    public int[] test(int[] array){
        int temp=0;
        int[] result=new int[array.length];
        for(int i=0;i<array.length;i++){
            temp+=array[i];
            result[i]=temp;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4};
        int[] result=new RuningSum().test(array);


    }
}
