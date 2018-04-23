package org.xvol.framework.util;

import com.mysql.jdbc.StringUtils;

public final class CastUtil {
    public static String castString(Object object) {
        return castString(object, "");
    }

    public static String castString(Object object, String defaultValue) {
        return object != null ? object.toString() : defaultValue;
    }

    public static double castDouble(Object object) {
        return castDouble(object, 0);
    }

    public static double castDouble(Object object, double defualtValue) {
        double value = defualtValue;
        String strObject = castString(object);
        if (!StringUtil.isNullOrEmpty(strObject)) {
            try {
                value = Double.parseDouble(strObject);
            } catch (NumberFormatException e) {
                value = defualtValue;
            }
        }
        return value;
    }

    public static long castLong(Object object) {
        return castLong(object, 0);
    }

    public static long castLong(Object object, long defualtValue) {
        long value = defualtValue;
        String strObject = castString(object);
        if (!StringUtil.isNullOrEmpty(strObject)) {
            try {
                value = Long.parseLong(strObject);
            } catch (NumberFormatException e) {
                value = defualtValue;
            }
        }
        return value;
    }

    public static int castInt(Object object) {
        return castInt(object, 0);
    }

    public static int castInt(Object object, int defualtValue) {
        int value = defualtValue;
        String strObject = castString(object);
        if (!StringUtil.isNullOrEmpty(strObject)) {
            try {
                value = Integer.parseInt(strObject);
            } catch (NumberFormatException e) {
                value = defualtValue;
            }
        }
        return value;
    }

    public static boolean castBoolean(Object object) {
        return castBoolean(object, false);
    }

    public static boolean castBoolean(Object object, boolean defualtValue) {
        if (object != null) {
            return Boolean.parseBoolean(castString(object));
        } else {
            return defualtValue;
        }
    }
}
