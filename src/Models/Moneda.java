package Models;


import java.util.Map;

public record Moneda(Map<String, Double> conversion_rates,
                     String base_code) {
}
