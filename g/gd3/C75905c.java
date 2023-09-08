package gd3;

import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import f40.C86709a0;
import f40.C86718e;
import p787ai.C79547b;

/* renamed from: gd3.c */
public class C75905c extends C114661d0.C28676a {

    /* renamed from: gd3.c$a */
    public class C75906a implements Runnable {
        public C75906a(C75905c cVar) {
        }

        public void run() {
            C72709y1.zx0().mo100171d();
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
                C79547b.f233255g.mo109607a(new C75906a(this));
            }
        }
    }
}
