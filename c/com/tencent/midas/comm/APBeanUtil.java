package com.tencent.midas.comm;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class APBeanUtil {
    public static void copyProperties(Object obj, Object obj2) {
        try {
            copyPropertiesExclude(obj, obj2, (String[]) null, true);
        } catch (Exception unused) {
        }
    }

    public static void copyPropertiesExclude(Object obj, Object obj2, String[] strArr, boolean z) {
        Method[] methodArr;
        Method[] methodArr2;
        Object invoke;
        List asList = (strArr == null || strArr.length <= 0) ? null : Arrays.asList(strArr);
        if (z) {
            methodArr = obj.getClass().getMethods();
            methodArr2 = obj2.getClass().getMethods();
        } else {
            methodArr = obj.getClass().getDeclaredMethods();
            methodArr2 = obj2.getClass().getDeclaredMethods();
        }
        for (Method method : methodArr) {
            String name = method.getName();
            if (name.contains("get") && (asList == null || !asList.contains(name.substring(3).toLowerCase()))) {
                Method findMethodByName = findMethodByName(methodArr2, "set" + name.substring(3));
                if (!(findMethodByName == null || (invoke = method.invoke(obj, new Object[0])) == null || ((invoke instanceof Collection) && ((Collection) invoke).size() <= 0))) {
                    findMethodByName.invoke(obj2, new Object[]{invoke});
                }
            }
        }
    }

    public static void copyPropertiesInclude(Object obj, Object obj2, String[] strArr, boolean z) {
        Method[] methodArr;
        Method[] methodArr2;
        Object invoke;
        if (strArr != null && strArr.length > 0) {
            List asList = Arrays.asList(strArr);
            if (z) {
                methodArr = obj.getClass().getMethods();
                methodArr2 = obj2.getClass().getMethods();
            } else {
                methodArr = obj.getClass().getDeclaredMethods();
                methodArr2 = obj2.getClass().getDeclaredMethods();
            }
            for (Method method : methodArr) {
                String name = method.getName();
                if (name.contains("get")) {
                    String substring = name.substring(3);
                    if (asList.contains(substring.substring(0, 1).toLowerCase() + substring.substring(1))) {
                        Method findMethodByName = findMethodByName(methodArr2, "set" + name.substring(3));
                        if (!(findMethodByName == null || (invoke = method.invoke(obj, new Object[0])) == null || ((invoke instanceof Collection) && ((Collection) invoke).size() <= 0))) {
                            findMethodByName.invoke(obj2, new Object[]{invoke});
                        }
                    }
                }
            }
        }
    }

    public static Method findMethodByName(Method[] methodArr, String str) {
        for (int i = 0; i < methodArr.length; i++) {
            if (methodArr[i].getName().equals(str)) {
                return methodArr[i];
            }
        }
        return null;
    }
}
