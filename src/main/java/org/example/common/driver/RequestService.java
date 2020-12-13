package org.example.common.driver;

public interface RequestService {
    /**
     * Выполняет GET запрос на адрес ref
     * @param ref адрес запроса
     * @return строка тела запроса
     * @throws org.example.exception.ApiErrorException при ошибке запроса
     */
    String getGetRequest(String ref);
}
