package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.service.BaseService;
import com.pinyougou.vo.PageResult;

import java.util.List;

/**
 * Date:2020/6/15
 * Author:  james L
 * Desc:
 */

public interface BrandService  extends BaseService<TbBrand>{

    public List<TbBrand> findAll();

    List<TbBrand> testPage(Integer page, Integer rows);

    PageResult search(TbBrand brand, Integer page, Integer rows);
}
