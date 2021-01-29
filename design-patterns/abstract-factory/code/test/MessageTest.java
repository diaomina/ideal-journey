
/**
 * 发送消息测试
 * @author ljy
 * @date 2021/1/28 17:11
 **/
public class MessageTest {

    public static void main(String[] args) {
        EmailFactory emailFactory = new EmailFactory();
        WeChatFactory weChatFactory = new WeChatFactory();

        MessageProduct messageProduct = emailFactory.newProduct();
        messageProduct.send("你好呀！");

        messageProduct = weChatFactory.newProduct();

        messageProduct.send("哈喽！");
    }
}
