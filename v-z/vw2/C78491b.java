package vw2;

import com.tencent.p014mm.app.C114661d0;
import eb0.C31519v2;
import f40.C86709a0;
import f40.C86718e;
import p787ai.C79547b;
import uw2.C78291e;

/* renamed from: vw2.b */
public class C78491b extends C114661d0.C28676a {

    /* renamed from: vw2.b$a */
    public class C78492a implements Runnable {
        public C78492a(C78491b bVar) {
        }

        public void run() {
            if (C31519v2.m39437b() != null) {
                ((C78291e) C31519v2.m39437b()).getClass();
                C78291e.wx0().mo108316c();
            }
        }
    }

    public void onAppBackground(String str) {
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            C86718e.m107551r();
        }
    }

    public void onAppForeground(String str) {
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                C79547b.f233255g.mo109607a(new C78492a(this));
            }
        }
    }
}
