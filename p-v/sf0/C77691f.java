package sf0;

import com.tencent.p014mm.platformtools.SpellMap;

/* renamed from: sf0.f */
public class C77691f {
    /* renamed from: a */
    public static String m93686a(String str) {
        if (str == null || "".equals(str.trim())) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (char a : charArray) {
            String a2 = SpellMap.m80581a(a);
            if (a2 != null) {
                stringBuffer.append(a2);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m93687b(String str) {
        String a;
        if (str == null || "".equals(str.trim())) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            if (!Character.isSpace(charArray[i]) && (a = SpellMap.m80581a(charArray[i])) != null && a.length() >= 1) {
                stringBuffer.append(a.charAt(0));
            }
        }
        return stringBuffer.toString().toUpperCase();
    }
}
