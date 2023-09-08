package com.tencent.p014mm.splash;

import android.net.Uri;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: com.tencent.mm.splash.a */
public class C6706a {

    /* renamed from: a */
    public static String f24116a;

    /* renamed from: a */
    public static boolean m7007a() {
        Uri n = C116299g2.m163858n(f24116a);
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            z = l.f348991a.mo119948x(l.f348992b);
        }
        if (!z) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        C86009m1 m1Var = new C86009m1(f24116a + "/" + "main-process-blocking");
        if (m1Var.mo119967g()) {
            m1Var.mo119966f();
        }
        return m1Var.mo119964e();
    }
}
