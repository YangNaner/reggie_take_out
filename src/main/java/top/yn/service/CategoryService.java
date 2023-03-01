package top.yn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.yn.entity.Category;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/8  17:56
 */
public interface CategoryService extends IService<Category>  {

    public void remove(Long id);
}
