package org.xvol.framework.util;

import com.mysql.jdbc.StringUtils;

public final class StringUtil {
    public static boolean isNullOrEmpty(String string) {
        if (string != null) {
            string.trim();
        }
        return StringUtils.isNullOrEmpty(string);
    }

    public static boolean isNotEmpty(String string) {
        return !isNullOrEmpty(string);
    }

    public static String[] splitString(String src, String sp) {
        return org.apache.commons.lang3.StringUtils.split(src, sp);
    }
}
