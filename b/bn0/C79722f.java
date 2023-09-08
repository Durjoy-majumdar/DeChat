package bn0;

import android.text.TextUtils;
import com.tencent.p014mm.vfs.C86009m1;
import dn0.C86358b;
import fn0.C86997b;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bn0.f */
public final class C79722f implements Comparable<C79722f> {

    /* renamed from: o */
    public static final Pattern f233657o = Pattern.compile("^([^.]+)\\.(\\d+)\\.(\\d+)\\.(\\w+)\\.(\\d+)(\\.v1\\.dat)$");

    /* renamed from: d */
    public final String f233658d;

    /* renamed from: e */
    public final long f233659e;

    /* renamed from: f */
    public final long f233660f;

    /* renamed from: g */
    public final long f233661g;

    /* renamed from: h */
    public final C86358b f233662h;

    /* renamed from: i */
    public final boolean f233663i;

    /* renamed from: j */
    public final C86009m1 f233664j;

    /* renamed from: n */
    public final long f233665n;

    public C79722f(String str, long j, long j2, long j3, C86358b bVar, boolean z, long j4, C86009m1 m1Var) {
        this.f233658d = str;
        this.f233659e = j;
        this.f233660f = j2;
        this.f233661g = j3;
        this.f233662h = bVar;
        this.f233663i = z;
        this.f233664j = m1Var;
        this.f233665n = j4;
    }

    /* renamed from: b */
    public static C79722f m96852b(C86009m1 m1Var) {
        C86358b bVar;
        String str;
        Matcher matcher = f233657o.matcher(m1Var.getName());
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        long parseLong = Long.parseLong(matcher.group(2));
        long parseLong2 = Long.parseLong(matcher.group(3));
        String group2 = matcher.group(4);
        if (C86358b.f251081g.containsKey(group2)) {
            bVar = C86358b.f251081g.get(group2);
        } else {
            try {
                str = new String(C86997b.m107999a(group2), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str = "unknown";
            }
            C86358b a = C86358b.m106987a(str);
            C86358b.f251081g.put(group2, a);
            bVar = a;
        }
        return new C79722f(group, parseLong, m1Var.mo119980r(), parseLong2, bVar, true, Long.parseLong(matcher.group(5)), m1Var);
    }

    /* renamed from: c */
    public static C86009m1 m96853c(C86009m1 m1Var, String str, long j, long j2, C86358b bVar, long j3) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        sb.append(j2);
        sb.append(".");
        if (TextUtils.isEmpty(bVar.f251083b)) {
            try {
                str2 = C86997b.m108000b(bVar.f251082a.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                str2 = C86997b.m108000b(C86358b.f251080f);
            }
            bVar.f251083b = str2;
        } else {
            str2 = bVar.f251083b;
        }
        sb.append(str2);
        sb.append(".");
        sb.append(j3);
        sb.append(".v1.dat");
        return new C86009m1(m1Var, sb.toString());
    }

    /* renamed from: a */
    public int compareTo(C79722f fVar) {
        if (!this.f233658d.equals(fVar.f233658d)) {
            return this.f233658d.compareTo(fVar.f233658d);
        }
        int i = ((this.f233659e - fVar.f233659e) > 0 ? 1 : ((this.f233659e - fVar.f233659e) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }
}
