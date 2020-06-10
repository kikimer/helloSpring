package fc.render;

import fc.MessageRenderer;
import fc.MessageSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("renderer")
public class StdOutMessageRenderer implements MessageRenderer {
    private MessageSupplier supplier;

    @Override
    public void printMessage() {
        System.out.println(supplier.getMessage());
    }

    @Autowired
    public StdOutMessageRenderer(@Qualifier("good_supplier") MessageSupplier supplier) {
        this.supplier = supplier;
    }
}
