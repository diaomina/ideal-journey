/**
 * 消息抽象工厂
 * @author ljy
 * @date 2021/1/28 16:53
 **/
public interface MessageAbstractFactory {

    /**
     * 生产产品
     * @return src.MessageProduct
     * @author ljy
     * @date 2021/1/28 16:58
     **/
    public MessageProduct newProduct();

}
