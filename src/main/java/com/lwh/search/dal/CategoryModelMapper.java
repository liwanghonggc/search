package com.lwh.search.dal;


import com.lwh.search.model.CategoryModel;

import java.util.List;

public interface CategoryModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Jul 21 10:59:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    List<CategoryModel> selectAll();
    Integer countAllCategory();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Jul 21 10:59:54 CST 2019
     */
    int insert(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Jul 21 10:59:54 CST 2019
     */
    int insertSelective(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Jul 21 10:59:54 CST 2019
     */
    CategoryModel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Jul 21 10:59:54 CST 2019
     */
    int updateByPrimaryKeySelective(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Jul 21 10:59:54 CST 2019
     */
    int updateByPrimaryKey(CategoryModel record);
}