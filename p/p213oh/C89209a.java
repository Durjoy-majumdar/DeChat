package p213oh;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: oh.a */
public class C89209a {
    /* renamed from: a */
    public static String m111499a(String str) {
        Uri.Builder builder;
        C86009m1 d = m111502d();
        StringBuilder sb = new StringBuilder();
        sb.append(C89210c.m111505a("" + str.hashCode()));
        sb.append("_convert.pcm");
        String sb4 = sb.toString();
        Uri uri = d.f250486d;
        if (uri == null) {
            builder = new Uri.Builder().path(sb4);
        } else {
            Uri.Builder buildUpon = uri.buildUpon();
            if (!sb4.isEmpty()) {
                buildUpon.appendPath(sb4);
            }
            builder = buildUpon;
        }
        Uri build = builder.build();
        String path = build.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        return C116299g2.m163865u(build);
    }

    /* renamed from: b */
    public static C86009m1 m111500b(String str) {
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g()) {
            try {
                m1Var.mo119964e();
            } catch (Exception e) {
                int i = C11412b.f33577a;
                Log.printErrStackTrace("MicroMsg.Mix.FileUtil", e, "createNewFile", new Object[0]);
            }
        }
        return m1Var;
    }

    /* renamed from: c */
    public static String m111501c(String str, String str2) {
        Uri.Builder builder;
        C86009m1 d = m111502d();
        C86009m1 m1Var = new C86009m1(d.mo119976n() + "/" + str);
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        Object[] objArr = {m1Var.mo119976n(), str};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.FileUtil", "path:%s, appId:%s", objArr);
        Uri uri = m1Var.f250486d;
        if (uri == null) {
            builder = new Uri.Builder().path(str2);
        } else {
            builder = uri.buildUpon();
            if (!str2.isEmpty()) {
                builder.appendPath(str2);
            }
        }
        Uri build = builder.build();
        String path = build.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        return C116299g2.m163865u(build);
    }

    /* renamed from: d */
    public static C86009m1 m111502d() {
        C86009m1 c = C86009m1.m106378c(MMApplicationContext.getContext().getExternalCacheDir());
        if (c == null) {
            c = C86009m1.m106378c(MMApplicationContext.getContext().getCacheDir());
        }
        C86009m1 m1Var = new C86009m1(c, "MixAudio");
        m1Var.mo119987x();
        return m1Var;
    }

    /* renamed from: e */
    public static long m111503e(String str) {
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g()) {
            return m1Var.mo119980r();
        }
        return 0;
    }

    /* renamed from: f */
    public static String m111504f(String str, String str2) {
        Uri.Builder builder;
        C86009m1 d = m111502d();
        StringBuilder sb = new StringBuilder();
        sb.append(C89210c.m111505a("" + str2.hashCode()));
        sb.append("_cache.pcm");
        String sb4 = sb.toString();
        C86009m1 m1Var = new C86009m1(d.mo119976n() + "/" + str);
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        Object[] objArr = {m1Var.mo119976n(), str};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.FileUtil", "path:%s, appId:%s", objArr);
        Uri uri = m1Var.f250486d;
        if (uri == null) {
            builder = new Uri.Builder().path(sb4);
        } else {
            builder = uri.buildUpon();
            if (!sb4.isEmpty()) {
                builder.appendPath(sb4);
            }
        }
        Uri build = builder.build();
        String path = build.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        return C116299g2.m163865u(build);
    }
}
