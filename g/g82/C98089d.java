package g82;

import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f40.C86718e;
import p787ai.C79547b;
import v82.C111452h1;

/* renamed from: g82.d */
public class C98089d extends C114661d0.C28676a {

    /* renamed from: g82.d$a */
    public class C98090a implements Runnable {
        public C98090a(C98089d dVar) {
        }

        public void run() {
            boolean z;
            if (C105851w0.zx0().mo150624A()) {
                MultiTalkManager zx02 = C105851w0.zx0();
                if (zx02.f314476R.f329506b) {
                    Log.m105924i("MicroMsg.MT.MultiTalkManager", "no allow to show main ui");
                    zx02.mo150638O();
                    z = false;
                } else {
                    z = true;
                }
                if (z && C105851w0.zx0().f314505s == C111452h1.Inviting) {
                    Log.m105924i("MicroMsg.MultiTalkAppForegroundListener", "multitalk resume on app foreground");
                    MultiTalkManager zx03 = C105851w0.zx0();
                    if (zx03.f314502p0 != null) {
                        Log.m105924i("MicroMsg.MT.MultiTalkManager", "on multitalk resume");
                        MultiTalkManager.C105769o oVar = zx03.f314502p0;
                        zx03.mo150658e(oVar.f314538a, oVar.f314539b);
                        zx03.mo150638O();
                        return;
                    }
                    return;
                }
            }
            Log.m105924i("MicroMsg.MultiTalkAppForegroundListener", "do not need resume multitalk ");
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
                C79547b.f233255g.mo109607a(new C98090a(this));
            }
        }
    }
}
