package p978i9;

import com.google.android.gms.common.server.response.FastJsonResponse;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: i9.f */
public final class C87681f {
    /* renamed from: a */
    public static String m109075a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static void m109076b(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            if (obj instanceof C108421e) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(m109075a(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if ((modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray()) {
                            m109076b(name, obj2, stringBuffer, stringBuffer2);
                        } else if (type.getComponentType() == Byte.TYPE) {
                            m109076b(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (int i = 0; i < length2; i++) {
                                m109076b(name, Array.get(obj2, i), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        try {
                            if (((Boolean) cls.getMethod("has" + substring, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                m109076b(substring, cls.getMethod("get" + substring, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                    return;
                }
                return;
            }
            String a = m109075a(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(a);
            stringBuffer2.append(": ");
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str2.startsWith("http") && str2.length() > 200) {
                    str2 = str2.substring(0, 200) + "[...]";
                }
                int length3 = str2.length();
                StringBuilder sb = new StringBuilder(length3);
                for (int i2 = 0; i2 < length3; i2++) {
                    char charAt = str2.charAt(i2);
                    if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                        sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    } else {
                        sb.append(charAt);
                    }
                }
                String sb4 = sb.toString();
                stringBuffer2.append(FastJsonResponse.QUOTE);
                stringBuffer2.append(sb4);
                stringBuffer2.append(FastJsonResponse.QUOTE);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                stringBuffer2.append('\"');
                for (byte b : bArr) {
                    if (b == 92 || b == 34) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append((char) b);
                    } else if (b < 32 || b >= Byte.MAX_VALUE) {
                        stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(b)}));
                    } else {
                        stringBuffer2.append((char) b);
                    }
                }
                stringBuffer2.append('\"');
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }
}
