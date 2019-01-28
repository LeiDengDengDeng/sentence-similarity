/**
 * @author deng
 * @date 2019/01/28
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "子类可以覆盖父类的成员方法，也可以覆盖父类的成员变量";
        String s2 = "子类不可以覆盖父类的成员方法，也不可以覆盖父类的成员变量";
        System.out.println("\"" + s1 + "\"" + "与" + "\"" + s2 + "的相似度是：" + SimilarityUtil.getSimilarity(s1, s2));

        s1 = "世界你好";
        s2 = "你好世界";
        System.out.println("\"" + s1 + "\"" + "与" + "\"" + s2 + "的相似度是：" + SimilarityUtil.getSimilarity(s1, s2));
    }
}
