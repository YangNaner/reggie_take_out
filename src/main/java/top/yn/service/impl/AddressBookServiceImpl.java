package top.yn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.yn.entity.AddressBook;
import top.yn.mapper.AddressBookMapper;
import top.yn.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/1  21:08
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
