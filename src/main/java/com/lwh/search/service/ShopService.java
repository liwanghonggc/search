package com.lwh.search.service;


import com.lwh.search.common.BusinessException;
import com.lwh.search.model.ShopModel;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ShopService {
    ShopModel create(ShopModel shopModel) throws BusinessException;

    ShopModel get(Integer id);

    List<ShopModel> selectAll();

    List<ShopModel> recommend(BigDecimal longitude, BigDecimal latitude);

    List<Map<String, Object>> searchGroupByTags(String keyword, Integer categoryId, String tags);

    Integer countAllShop();

    List<ShopModel> search(BigDecimal longitude, BigDecimal latitude,
                           String keyword, Integer orderby, Integer categoryId, String tags);

    Map<String, Object> searchByES1(BigDecimal longitude, BigDecimal latitude,
                           String keyword, Integer orderby, Integer categoryId, String tags) throws IOException;

    Map<String, Object> searchByES2(BigDecimal longitude, BigDecimal latitude,
                                    String keyword, Integer orderby, Integer categoryId, String tags) throws IOException;

    Map<String, Object> searchByES3(BigDecimal longitude, BigDecimal latitude,
                                    String keyword, Integer orderby, Integer categoryId, String tags) throws IOException;
}
