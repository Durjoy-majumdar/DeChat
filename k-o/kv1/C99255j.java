package kv1;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import mv1.C100005b;

/* renamed from: kv1.j */
public class C99255j {

    /* renamed from: a */
    public static final C99256a f291038a = new C99256a(19968, 40869);

    /* renamed from: b */
    public static final C99256a f291039b = new C99256a(40870, 40907);

    /* renamed from: c */
    public static final C99256a f291040c = new C99256a(13312, 19893);

    /* renamed from: d */
    public static final C99256a f291041d = new C99256a(131072, 173782);

    /* renamed from: e */
    public static final C99256a f291042e = new C99256a(173824, 177972);

    /* renamed from: f */
    public static final C99256a f291043f = new C99256a(177984, 178205);

    /* renamed from: g */
    public static final C99256a f291044g = new C99256a(65, 90);

    /* renamed from: h */
    public static final C99256a f291045h = new C99256a(97, 122);

    /* renamed from: i */
    public static final C99256a f291046i = new C99256a(48, 57);

    /* renamed from: j */
    public static C100005b f291047j = new C100005b();

    /* renamed from: k */
    public static HashMap<String, String> f291048k = new HashMap<>();

    /* renamed from: l */
    public static HashMap<String, String[]> f291049l = new HashMap<>();

    /* renamed from: kv1.j$a */
    public static class C99256a {

        /* renamed from: a */
        public int f291050a;

        /* renamed from: b */
        public int f291051b;

        public C99256a(int i, int i2) {
            this.f291051b = i;
            this.f291050a = i2;
        }

        /* renamed from: a */
        public boolean mo138630a(char c) {
            return c >= this.f291051b && c <= this.f291050a;
        }
    }

    /* renamed from: a */
    public static boolean m129317a(char c) {
        return f291038a.mo138630a(c) || f291039b.mo138630a(c) || f291040c.mo138630a(c) || f291041d.mo138630a(c) || f291042e.mo138630a(c) || f291043f.mo138630a(c);
    }

    /* renamed from: b */
    public static boolean m129318b(char c) {
        return f291044g.mo138630a(c) || f291045h.mo138630a(c);
    }

    /* renamed from: c */
    public static final String m129319c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : str.toCharArray()) {
            if (m129317a(c)) {
                String str2 = f291048k.get(String.valueOf(c));
                if (!Util.isNullOrNil(str2)) {
                    stringBuffer.append(str2);
                }
            }
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }
}
