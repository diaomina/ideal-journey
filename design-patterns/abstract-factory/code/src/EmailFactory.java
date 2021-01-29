/**
 * @author ljy
 * @date 2021/1/28 17:09
 **/
public class EmailFactory implements MessageAbstractFactory {
    /**
     * 生产产品
     *
     * @return src.MessageProduct
     * @author ljy
     * @date 2021/1/28 16:58
     **/
    @Override
    public MessageProduct newProduct() {
        return new EmailConcreteProduct();
    }
}
