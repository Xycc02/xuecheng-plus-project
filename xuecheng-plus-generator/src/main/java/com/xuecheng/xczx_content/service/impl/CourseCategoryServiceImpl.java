package com.xuecheng.xczx_content.service.impl;

import com.xuecheng.xczx_content.model.po.CourseCategory;
import com.xuecheng.xczx_content.mapper.CourseCategoryMapper;
import com.xuecheng.xczx_content.service.CourseCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程分类 服务实现类
 * </p>
 *
 * @author xuyuchao
 */
@Slf4j
@Service
public class CourseCategoryServiceImpl extends ServiceImpl<CourseCategoryMapper, CourseCategory> implements CourseCategoryService {

}
