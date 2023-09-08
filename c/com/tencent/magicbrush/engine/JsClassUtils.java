package com.tencent.magicbrush.engine;

import android.webkit.JavascriptInterface;
import com.tencent.xweb.file.XVFSFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p416qd.C89598h;

public class JsClassUtils {
    private static final int BOOLEAN = 1;
    private static final int BYTE = 3;
    private static final int CHAR = 2;
    private static final int DOUBLE = 8;
    private static final int FLOAT = 6;
    private static final int INT = 5;
    private static final int LONG = 7;
    private static final int SHORT = 4;
    private static final String TAG = "MicroMsg.JsClassUtils";
    private static final int VOID = 0;
    public static final int log_type_d = 0;
    public static final int log_type_e = 2;
    public static final int log_type_i = 1;
    private static final int string = 9;
    private static final int unknown = 10;

    private static void getDescriptor(StringBuilder sb, Class<?> cls) {
        while (!cls.isPrimitive()) {
            if (cls.isArray()) {
                sb.append('[');
                cls = cls.getComponentType();
            } else {
                sb.append('L');
                String name = cls.getName();
                int length = name.length();
                for (int i = 0; i < length; i++) {
                    char charAt = name.charAt(i);
                    if (charAt == '.') {
                        charAt = XVFSFile.SEPARATOR_CHAR;
                    }
                    sb.append(charAt);
                }
                sb.append(';');
                return;
            }
        }
        sb.append(cls == Integer.TYPE ? 'I' : cls == Void.TYPE ? 'V' : cls == Boolean.TYPE ? 'Z' : cls == Byte.TYPE ? 'B' : cls == Character.TYPE ? 'C' : cls == Short.TYPE ? 'S' : cls == Double.TYPE ? 'D' : cls == Float.TYPE ? 'F' : 'J');
    }

    private static int getJavaType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 5;
        }
        if (cls == Void.TYPE) {
            return 0;
        }
        if (cls == Boolean.TYPE) {
            return 1;
        }
        if (cls == Byte.TYPE) {
            return 3;
        }
        if (cls == Character.TYPE) {
            return 2;
        }
        if (cls == Short.TYPE) {
            return 4;
        }
        if (cls == Double.TYPE) {
            return 8;
        }
        if (cls == Float.TYPE) {
            return 6;
        }
        return cls.getCanonicalName().equals("java.lang.String") ? 9 : 10;
    }

    public static Method[] getJavascriptInterfaceMethod(Object obj) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Method method : obj.getClass().getMethods()) {
                if (method.isAnnotationPresent(JavascriptInterface.class)) {
                    arrayList.add(method);
                }
            }
        } catch (Exception unused) {
        }
        return (Method[]) arrayList.toArray(new Method[arrayList.size()]);
    }

    public static String getMethodName(Method method) {
        return method.getName();
    }

    public static String getMethodSignature(Method method) {
        Class[] parameterTypes = method.getParameterTypes();
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class descriptor : parameterTypes) {
            getDescriptor(sb, descriptor);
        }
        sb.append(')');
        getDescriptor(sb, method.getReturnType());
        return sb.toString();
    }

    public static int[] getMethodType(Method method) {
        Class[] parameterTypes = method.getParameterTypes();
        int[] iArr = new int[(parameterTypes.length + 2)];
        iArr[0] = parameterTypes.length;
        iArr[1] = getJavaType(method.getReturnType());
        for (int i = 0; i < parameterTypes.length; i++) {
            iArr[i + 2] = getJavaType(parameterTypes[i]);
        }
        return iArr;
    }

    public static byte[] getStringUtf8(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static boolean hasJavascriptInterface(Object obj) {
        try {
            for (Method isAnnotationPresent : obj.getClass().getMethods()) {
                if (isAnnotationPresent.isAnnotationPresent(JavascriptInterface.class)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void jsLog(int i, String str) {
        if (i == 1) {
            C89598h.m112045b(TAG, str, new Object[0]);
        } else if (i != 2) {
            C89598h.f257791a.mo109481d(TAG, str, new Object[0]);
        } else {
            C89598h.m112044a(TAG, str, new Object[0]);
        }
    }
}
