package com.tencent.p014mm.booter.notification;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.tencent.mm.booter.notification.b */
public class C80829b {
    /* renamed from: a */
    public static String m98678a(String str) {
        try {
            int length = str.length();
            StringBuilder sb = null;
            int i = 0;
            byte b = 0;
            int i2 = 9;
            while (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        if (i2 != 7) {
                            if (i2 == 9) {
                                sb = new StringBuilder();
                            } else if (i2 == 11) {
                                sb.append((char) b);
                            } else if (i2 == 13) {
                                b = (byte) (b ^ 60);
                                i2 += 4;
                            } else if (i2 == 15) {
                                b = (byte) (b ^ (i - length));
                            } else if (i2 == 17) {
                                b = (byte) (b & ExifInterface.MARKER);
                            } else {
                                throw new IllegalStateException();
                            }
                            i2 -= 6;
                        } else {
                            i++;
                        }
                        i2 -= 4;
                    } else {
                        b = (byte) str.charAt(i);
                        i2 += 10;
                    }
                } else if (i < length) {
                    i2 += 2;
                }
                i2 -= 2;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: b */
    public static Field m98679b(Class<?> cls, String str) {
        Class<Class> cls2 = Class.class;
        try {
            Method declaredMethod = cls2.getDeclaredMethod(m98678a("«¨º­ª¦ª¶ ¢©¤®§"), new Class[]{String.class});
            Class<?> cls3 = cls;
            do {
                try {
                    Field field = (Field) declaredMethod.invoke(cls3, new Object[]{str});
                    field.setAccessible(true);
                    return field;
                } catch (IllegalAccessException unused) {
                    throw new NoSuchFieldException("E2: " + cls.getName() + "," + str);
                } catch (InvocationTargetException e) {
                    if (e.getTargetException() instanceof NoSuchFieldException) {
                        cls3 = cls3.getSuperclass();
                        if (cls3 == Object.class) {
                            break;
                        } else if (cls3 == null) {
                        }
                        throw new NoSuchFieldException(m98678a("«å ®¥­¦ã") + str + m98678a("ê¢ªå¥«¡²±ã") + cls.getName() + m98678a("ö¸¢ñ»§¿í½º¸¬¸ë§©§´³¤±í"));
                    }
                    throw new NoSuchFieldException("E3: " + cls.getName() + "," + str);
                }
            } while (cls3 == null);
            throw new NoSuchFieldException(m98678a("«å ®¥­¦ã") + str + m98678a("ê¢ªå¥«¡²±ã") + cls.getName() + m98678a("ö¸¢ñ»§¿í½º¸¬¸ë§©§´³¤±í"));
        } catch (NoSuchMethodException unused2) {
            throw new NoSuchFieldException("E1: " + cls.getName() + "," + str);
        }
    }
}
