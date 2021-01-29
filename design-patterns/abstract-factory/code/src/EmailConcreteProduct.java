/**
 * 具体产品： 邮箱
 * @author ljy
 * @date 2021/1/28 16:59
 **/
public class EmailConcreteProduct implements MessageProduct {
    /**
     * 发送消息
     *
     * @param context 消息体
     * @return boolean
     * @author ljy
     * @date 2021/1/28 17:03
     **/
    @Override
    public void send(String context) {
        System.out.println("发送邮箱消息，消息为："+ context);
    }
}
