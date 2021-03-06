package com.example.layering.model.api.client;

import java.math.BigDecimal;

public interface Amount {
	BigDecimal getValue();
	Currency getCurrency();
	void setValue(BigDecimal value);
}
