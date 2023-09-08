package cw2;

import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.Comparator;
import java.util.List;
import o40.C61925b;
import p206nj.C76861g;
import rx3.C13604l;
import sx3.C64197v;
import sx3.C77813z;
import ux3.C65486b;

/* renamed from: cw2.o */
public final class C97391o {

    /* renamed from: a */
    public static final C97391o f285892a = new C97391o();

    /* renamed from: b */
    public static String f285893b = "";

    /* renamed from: cw2.o$a */
    public static final class C97392a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C86001b0) t).f250475e), Long.valueOf(((C86001b0) t2).f250475e));
        }
    }

    /* renamed from: a */
    public final String mo136648a() {
        return StoryCore.f281736t.mo134184b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (gy3.C87412m.m108589b(f285893b, r4) != false) goto L_0x0042;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo136649b(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x000d
            int r2 = r4.length()
            if (r2 != 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            if (r2 == 0) goto L_0x0011
            goto L_0x0041
        L_0x0011:
            java.lang.String r2 = f285893b
            if (r2 == 0) goto L_0x001e
            int r2 = r2.length()
            if (r2 != 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r2 = 0
            goto L_0x001f
        L_0x001e:
            r2 = 1
        L_0x001f:
            if (r2 == 0) goto L_0x0038
            java.lang.String r4 = f285893b
            if (r4 == 0) goto L_0x002d
            int r4 = r4.length()
            if (r4 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 == 0) goto L_0x0041
            com.tencent.mm.plugin.story.model.StoryCore$h r4 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            java.lang.String r4 = r4.mo134187e()
            f285893b = r4
            goto L_0x0041
        L_0x0038:
            java.lang.String r2 = f285893b
            boolean r4 = gy3.C87412m.m108589b(r2, r4)
            if (r4 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x0049
            java.lang.String r4 = r3.mo136648a()
            return r4
        L_0x0049:
            com.tencent.mm.plugin.story.model.StoryCore$h r4 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            java.lang.String r4 = r4.mo134183a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.C97391o.mo136649b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public final void mo136650c(String str, boolean z) {
        C87412m.m108594g(str, "newVideoPath");
        if (!(str.length() == 0)) {
            String s = C86013q1.m106458s(str);
            C86013q1.m106461v(s);
            if (z) {
                C86013q1.m106460u(s);
            }
        }
    }

    /* renamed from: d */
    public final String mo136651d() {
        new C76861g.C47263a().mo72289b();
        C13604l<String, Long> e = mo136652e("pic/");
        C13604l<String, Long> e2 = mo136652e("video/");
        return ((String) e.f38555d) + "  " + ((String) e2.f38555d) + " total: " + Util.getSizeMB(((Number) e.f38556e).longValue() + ((Number) e2.f38556e).longValue());
    }

    /* renamed from: e */
    public final C13604l<String, Long> mo136652e(String str) {
        C61925b bVar = new C61925b("dumpCacheDir");
        String str2 = StoryCore.f281736t.mo134183a() + str;
        Log.m105924i("MicroMsg.StoryFileNameUtil", "dumpCacheDir cache " + str2);
        Iterable<C86001b0> t = C86013q1.m106459t(str2, true);
        Integer num = null;
        List<C86001b0> j = t != null ? C116299g2.m163854j(t) : null;
        if (j != null && j.size() > 1) {
            C77813z.m93909o(j, new C97392a());
        }
        long j2 = 0;
        if (j != null) {
            int i = 0;
            for (T next : j) {
                int i2 = i + 1;
                if (i >= 0) {
                    C86001b0 b0Var = (C86001b0) next;
                    if (b0Var != null) {
                        Log.m105924i("MicroMsg.StoryFileNameUtil", "dumpCacheDir " + i + " filePath: " + b0Var.f250472b + " time: " + b0Var.f250475e + " size: " + Util.getSizeKB(b0Var.f250473c) + ' ' + b0Var.f250471a);
                        C97391o oVar = f285892a;
                        String str3 = b0Var.f250472b;
                        C87412m.m108593f(str3, "fileEntry.name");
                        if (!oVar.mo136653f(str3)) {
                            j2 += b0Var.f250473c;
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("dumpCacheDir ");
        sb.append(str);
        sb.append(" totalSize ");
        sb.append(Util.getSizeKB(j2));
        sb.append(" fileCounts ");
        if (j != null) {
            num = Integer.valueOf(j.size());
        }
        sb.append(num);
        sb.append(" cost:");
        sb.append(bVar);
        sb.append(" \n");
        String sb4 = sb.toString();
        Log.m105924i("MicroMsg.StoryFileNameUtil", sb4);
        return new C13604l<>(sb4, Long.valueOf(j2));
    }

    /* renamed from: f */
    public final boolean mo136653f(String str) {
        C87412m.m108594g(str, "name");
        return C87412m.m108589b(FilePathGenerator.NO_MEDIA_FILENAME, str);
    }

    /* renamed from: g */
    public final String mo136654g(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        String i = C86013q1.m106448i(str + str2 + ".p", true);
        C87412m.m108591d(i);
        return i;
    }

    /* renamed from: h */
    public final String mo136655h(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        String i = C86013q1.m106448i(str + str2 + ".v", true);
        C87412m.m108591d(i);
        return i;
    }
}
