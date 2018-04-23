package org.xvol.chapter2.util;

import com.mysql.jdbc.StringUtils;

public final class StringUtil {
    public static boolean isNullOrEmpty(String string) {
        if (string != null) {
            string.trim();
        }
        return StringUtils.isNullOrEmpty(string);
    }
}
