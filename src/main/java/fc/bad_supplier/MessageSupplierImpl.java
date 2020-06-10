package fc.bad_supplier;

import fc.MessageSupplier;
import org.springframework.stereotype.Component;

@Component
public class MessageSupplierImpl implements MessageSupplier {
    @Override
    public String getMessage() {
        return "bad_supplier";
    }
}
