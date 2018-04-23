package org.xvol.framework;

import org.xvol.framework.annotation.Controller;
import org.xvol.framework.helper.BeanHelper;
import org.xvol.framework.helper.ClassHelper;
import org.xvol.framework.helper.IocHelper;
import org.xvol.framework.util.ClassUtil;

public final class HelperLoader {
    public static void init() {
        Class<?>[] classes = { ClassHelper.class, BeanHelper.class, IocHelper.class, Controller.class };
        for (Class<?> cls : classes) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }
}
