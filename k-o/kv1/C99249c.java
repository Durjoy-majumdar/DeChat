package kv1;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: kv1.c */
public class C99249c {

    /* renamed from: a */
    public static final int[] f291003a = {65536};

    /* renamed from: b */
    public static final int[] f291004b = {196608};

    /* renamed from: c */
    public static final int[] f291005c = {262144};

    /* renamed from: d */
    public static final int[] f291006d = {393216};

    /* renamed from: e */
    public static final int[] f291007e = {524288};

    /* renamed from: f */
    public static final int[] f291008f = {589824};

    /* renamed from: g */
    public static final int[] f291009g = {StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON, 131074};

    /* renamed from: h */
    public static final int[] f291010h = {131072, 131075, StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON, 131081};

    /* renamed from: i */
    public static final int[] f291011i = {131072};

    /* renamed from: j */
    public static final int[] f291012j = {StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON, 131074};

    /* renamed from: k */
    public static final int[] f291013k = {5, 6, 7, 1, 2, 3};

    /* renamed from: l */
    public static final Map<Integer, Integer> f291014l;

    /* renamed from: m */
    public static final int[] f291015m = {29, 30, 31, 34, 35, 36, 33, 32, 37};

    /* renamed from: n */
    public static final int[] f291016n = new int[43];

    /* renamed from: o */
    public static final int[] f291017o = new int[27];

    /* renamed from: p */
    public static final String f291018p = (C112760b.m154195C() + "fts/");

    /* renamed from: kv1.c$a */
    public static final class C99250a {

        /* renamed from: a */
        public static final Pattern f291019a = Pattern.compile(";");

        /* renamed from: b */
        public static final Pattern f291020b = Pattern.compile(" ");

        /* renamed from: c */
        public static final Pattern f291021c = Pattern.compile("​");

        /* renamed from: d */
        public static final Pattern f291022d = Pattern.compile("‌");

        /* renamed from: e */
        public static final Pattern f291023e = Pattern.compile("‍");

        /* renamed from: f */
        public static final Pattern f291024f = Pattern.compile("\\s+");

        /* renamed from: g */
        public static final Pattern f291025g = Pattern.compile(",");

        static {
            Pattern.compile("[A-Za-z]+");
        }
    }

    static {
        int[] iArr = {131072, StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON, 131074, 131075, StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON, StartupILogsReport.TYPEID_FIRST_UI_SHOWN_INCLUDE_TINKER_LOAD_MISC_JSON, 131078, 131079, 131080};
        int[] iArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 17, 18, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 0};
        int[] iArr3 = {1, 2, 3, 4, 5, 6, 8, 19, 20, 21, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 7, 0};
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 9; i++) {
            hashMap.put(Integer.valueOf(iArr[i]), Integer.valueOf(i));
        }
        f291014l = Collections.unmodifiableMap(hashMap);
        for (int i2 = 0; i2 < 43; i2++) {
            f291016n[iArr2[i2]] = i2;
        }
        for (int i3 = 0; i3 < 27; i3++) {
            f291017o[iArr3[i3]] = i3;
        }
    }
}
