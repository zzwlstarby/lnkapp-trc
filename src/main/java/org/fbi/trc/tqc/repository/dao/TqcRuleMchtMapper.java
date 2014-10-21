package org.fbi.trc.tqc.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.fbi.trc.tqc.repository.model.TqcRuleMcht;
import org.fbi.trc.tqc.repository.model.TqcRuleMchtExample;
import org.fbi.trc.tqc.repository.model.TqcRuleMchtKey;

public interface TqcRuleMchtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    int countByExample(TqcRuleMchtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    int deleteByExample(TqcRuleMchtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    int deleteByPrimaryKey(TqcRuleMchtKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    int insert(TqcRuleMcht record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    int insertSelective(TqcRuleMcht record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    List<TqcRuleMcht> selectByExample(TqcRuleMchtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    TqcRuleMcht selectByPrimaryKey(TqcRuleMchtKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    int updateByExampleSelective(@Param("record") TqcRuleMcht record, @Param("example") TqcRuleMchtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    int updateByExample(@Param("record") TqcRuleMcht record, @Param("example") TqcRuleMchtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    int updateByPrimaryKeySelective(TqcRuleMcht record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRC.TQC_RULE_MCHT
     *
     * @mbggenerated Tue Oct 21 10:59:00 CST 2014
     */
    int updateByPrimaryKey(TqcRuleMcht record);
}