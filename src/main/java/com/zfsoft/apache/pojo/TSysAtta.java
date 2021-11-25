package com.zfsoft.apache.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Classname: TSysAtta
 * @Description: 系统附件表
 * @Date: 2021/11/22 10:53
 * @author: wwf
 */
@Data
@TableName(value = "t_sys_atta")
public class TSysAtta implements Serializable {

    private static final long serialVersionUID = -8798592051487331809L;

    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String oid;

    /**
     * 附件名称
     */
    private String name;

    /**
     * 附件原始名称
     */
    private String originName;

    /**
     * 附件路径
     */
    private String filePath;

    /**
     * 附件扩展名
     */
    private String extensionName;

    /**
     * 上传时间
     */
    private Date uploadDate;

    /**
     * 所属用户 : 上传用户的编号
     */
    private String userOid;

    /**
     * 删除状态
     */
    private String isDelete;

}