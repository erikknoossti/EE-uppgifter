package lektion6;

import java.math.BigDecimal;

public record ProductValidatorDTO(
        String name,
        String description,
        BigDecimal price,
        boolean discontinued
) {
}
