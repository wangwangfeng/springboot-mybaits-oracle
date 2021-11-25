package com.zfsoft.apache.util;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串工具类
 *
 * @author 86131
 */
@Slf4j
public class StringUtils extends StrUtil {

    /**
     * 字符串处理
     * 去空格、换行、引号、反斜杠\、引号等
     *
     * @param str
     * @return
     */
    public static String handleString(String str) {
        if (StrUtil.isNotEmpty(str)) {
            Pattern pattern = Pattern.compile("\\s*|\t|\r|\n");
            Matcher matcher = pattern.matcher(str);
            String dest = matcher.replaceAll("");
            return dest.replaceAll("\\\\", "/").replaceAll("\"", "");
        } else {
            return "";
        }
    }

    /**
     * 不动产字符串处理rn、ca等
     *
     * @param str
     * @return
     */
    public static String handleRnCaString(String str) {
        if (StrUtil.isNotEmpty(str)) {
            return str.replaceAll("[*rn*]", "")
                    .replaceAll("[*ca*]", "")
                    .replaceAll("[\\r\\n]", "")
                    .replaceAll("[\\n]", "");
        } else {
            return "";
        }
    }

    /**
     * 根据证件号返回调用省级接口证件类型
     *
     * @param ownerId
     * @return
     */
    public static String infoTypeCode(String ownerId) {
        if (StrUtil.isNotEmpty(ownerId)) {
            if (IdcardUtil.validateCard(ownerId)) {
                // 个人证照
                if (ownerId.length() == 18) {
                    return "111";
                } else {
                    return "999";
                }
            } else {
                // 法人证照
                if (ownerId.length() == 18) {
                    return "001";
                } else {
                    return "099";
                }
            }
        } else {
            return "111";
        }
    }

}
