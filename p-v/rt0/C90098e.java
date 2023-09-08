package rt0;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: rt0.e */
public final class C90098e {
    /* renamed from: a */
    public static <T extends Enum> T m112719a(String str, Class<T> cls) {
        int i;
        if (!cls.isEnum()) {
            i = 0;
        } else {
            i = 0;
            for (Object obj : cls.getEnumConstants()) {
                i = Math.max(((Enum) obj).name().length(), i);
            }
        }
        if (!Util.isNullOrNil(str) && str.length() <= i) {
            String upperCase = str.toUpperCase();
            for (T t : (Enum[]) cls.getEnumConstants()) {
                if (upperCase.equals(t.name())) {
                    return t;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Integer m112720b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((int) Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
