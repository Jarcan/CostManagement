package org.psd.budget_management.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.psd.budget_management.entity.BudgetItemGroup;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 针对表【budget_item_group(预算科目分组)】的数据库操作Mapper
 *
 * @author pengshidun
 * @since 2024-11-11
 */
@Mapper
public interface BudgetItemGroupMapper extends BaseMapper<BudgetItemGroup> {

}
