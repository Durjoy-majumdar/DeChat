package com.tencent.p014mm.p136ui.tools;

import android.text.InputFilter;
import android.text.Spanned;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.ui.tools.p0 */
public class C45078p0 implements InputFilter {

    /* renamed from: d */
    public int f122277d;

    /* renamed from: e */
    public C45079a f122278e;

    /* renamed from: com.tencent.mm.ui.tools.p0$a */
    public enum C45079a {
        MODE_CHINESE_AS_1,
        MODE_CHINESE_AS_2,
        MODE_CHINESE_AS_3
    }

    public C45078p0(int i, C45079a aVar) {
        this.f122277d = i;
        this.f122278e = aVar;
    }

    /* renamed from: a */
    public static int m49922a(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        Matcher matcher = Pattern.compile("[\\u4e00-\\u9fa5]").matcher(str);
        int i = 0;
        while (matcher.find()) {
            for (int i2 = 0; i2 <= matcher.groupCount(); i2++) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m49923b(int i, String str) {
        return i - (LocaleUtil.isChineseAppLang() ? m49927f(str) : m49927f(str));
    }

    /* renamed from: c */
    public static int m49924c(int i, String str) {
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        Pattern compile = Pattern.compile("[\\u4e00-\\u9fa5]");
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(str.charAt(i3));
            i2 = compile.matcher(sb.toString()).find() ? i2 + 2 : i2 + 1;
            if (i2 >= i) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static int m49925d(int i, String str) {
        return LocaleUtil.isChineseAppLang() ? Math.round(((float) (Math.round((float) m49927f(str)) - i)) / 2.0f) : m49927f(str) - i;
    }

    /* renamed from: e */
    public static int m49926e(String str, C45079a aVar) {
        if (aVar == C45079a.MODE_CHINESE_AS_1) {
            if (Util.isNullOrNil(str)) {
                return 0;
            }
            return str.length();
        } else if (aVar == C45079a.MODE_CHINESE_AS_2) {
            return m49927f(str);
        } else {
            if (aVar == C45079a.MODE_CHINESE_AS_3) {
                return m49928g(str);
            }
            return 0;
        }
    }

    /* renamed from: f */
    public static int m49927f(String str) {
        int i = 0;
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        int length = str.length() + m49922a(str);
        if (!Util.isNullOrNil(str)) {
            int i2 = 0;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt >= 0 && charAt <= 127) {
                    i2++;
                }
                i++;
            }
            i = str.length() - (m49922a(str) + i2);
        }
        return length + i;
    }

    /* renamed from: g */
    public static int m49928g(String str) {
        int i = 0;
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= length) {
                break;
            }
            if (str.charAt(i) > 127) {
                i3 = 2;
            }
            i2 += i3;
            i++;
        }
        return i2 % 2 != 0 ? (i2 + 1) / 2 : i2 / 2;
    }

    /* renamed from: h */
    public static String m49929h(String str, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            i2 += str.charAt(i3) > 127 ? 2 : 1;
            if (i2 > i) {
                return str.substring(0, i3);
            }
        }
        return str;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int e = m49926e(spanned.toString(), this.f122278e);
        int e2 = m49926e(charSequence.toString(), this.f122278e) + e;
        int i5 = this.f122277d;
        if (e2 <= i5) {
            return charSequence;
        }
        for (int min = Math.min(i5 - e, charSequence.length()); min > 0; min--) {
            if (m49926e(charSequence.subSequence(0, min).toString(), this.f122278e) + e <= this.f122277d) {
                return charSequence.subSequence(0, min);
            }
        }
        return "";
    }
}
