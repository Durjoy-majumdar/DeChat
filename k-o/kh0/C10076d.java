package kh0;

import android.net.Uri;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;

/* renamed from: kh0.d */
public class C10076d {
    /* renamed from: a */
    public static void m9921a(String str, String str2) {
        String[] split = str.split("/");
        if (split.length > 1) {
            for (int i = 0; i < split.length - 1; i++) {
                str2 = str2 + split[i] + "/";
                Uri n = C116299g2.m163858n(str2);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                    if (l2.mo177810a()) {
                        l2.f348991a.mo119937g(l2.f348992b);
                    }
                }
            }
        }
    }
}
