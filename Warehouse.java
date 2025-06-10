package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Warehouse {
    private static final Logger logger = LogManager.getLogger(Warehouse.class);

    public void addProduct(String name) {
        logger.info("Бараа нэмэгдсэн: {}", name);
    }

    public void removeProduct(String name) {
        try {
            throw new IllegalArgumentException("Бараа олдсонгүй: " + name);
        } catch (IllegalArgumentException e) {
            logger.error("Алдаа гарлаа: {}", name, e);
        }
    }
}
