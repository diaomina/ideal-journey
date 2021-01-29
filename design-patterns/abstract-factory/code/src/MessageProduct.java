
/**
 * 抽象产品 消息发送产品
 * @author ljy
 * @date 2021/1/28 16:56
 **/
public interface MessageProduct {

    /**
     * 发送消息
     * @param context 消息体
     * @return boolean
     * @author ljy
     * @date 2021/1/28 17:03
     **/
    void send(String context);
}
