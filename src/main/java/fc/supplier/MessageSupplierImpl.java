package fc.supplier;

import fc.MessageSupplier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("some_name")
@Component
@Qualifier("good_supplier")
public class MessageSupplierImpl implements MessageSupplier {
    @Override
    public String getMessage() {
        return "good supplier";
    }
}
