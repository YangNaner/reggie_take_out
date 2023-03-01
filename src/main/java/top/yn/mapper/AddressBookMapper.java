package top.yn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.yn.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/1  21:05
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
