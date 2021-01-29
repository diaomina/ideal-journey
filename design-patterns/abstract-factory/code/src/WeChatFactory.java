/**
 * 微信工厂
 * @author ljy
 * @date 2021/1/28 17:06
 **/
public class WeChatFactory implements MessageAbstractFactory {
    /**
     * 生产产品
     *
     * @return src.MessageProduct
     * @author ljy
     * @date 2021/1/28 16:58
     **/
    @Override
    public MessageProduct newProduct() {
        return new WeChatConcreteProduct();
    }
}
