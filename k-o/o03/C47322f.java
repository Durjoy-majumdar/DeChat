package o03;

import a70.C112760b;
import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WebView;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import p03.C21912d;
import p03.C21914h;
import p03.C47419f;
import p167hz.C21032k;
import r03.C47918a;
import te3.uh4;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: o03.f */
public class C47322f extends C86301e implements C21912d {

    /* renamed from: d */
    public C21724i f127002d;

    /* renamed from: e */
    public C21723h f127003e;

    /* renamed from: o03.f$b */
    public class C35075b implements Runnable {
        public C35075b(C47322f fVar, C35074a aVar) {
        }

        public void run() {
            Log.m105925i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard ftsrecommendVideo folder %b", Boolean.valueOf(C86013q1.m106446g(C112760b.m154195C() + "ftsrecommendVideo/", true)));
            Log.m105925i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard topstory folder %b", Boolean.valueOf(C86013q1.m106446g(C112760b.m154195C() + "topstory/", true)));
            Log.m105925i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard cache topstory folder %b", Boolean.valueOf(C86013q1.m106446g(MMApplicationContext.getContext().getCacheDir() + "topstory/", true)));
            C86009m1 m1Var = new C86009m1(C21914h.m25160h());
            if (m1Var.mo119967g()) {
                C86009m1[] u = m1Var.mo119984u();
                if (u != null) {
                    for (C86009m1 m1Var2 : u) {
                        Log.m105925i("MicroMsg.TopStory.PluginTopStory", "Delete Cache File %s %b", m1Var2.mo119971i(), Boolean.valueOf(C86013q1.m106446g(m1Var2.mo119971i(), true)));
                    }
                }
                C86013q1.m106461v(C21914h.m25160h() + ".nomedia/");
                return;
            }
            C86013q1.m106461v(C21914h.m25160h());
            C86013q1.m106461v(C21914h.m25160h() + ".nomedia/");
            Log.m105924i("MicroMsg.TopStory.PluginTopStory", "Create TopStoryCacheFolder");
        }
    }

    public void Ne0() {
    }

    /* renamed from: U6 */
    public void mo34962U6() {
    }

    public void Ue0(uh4 uh4) {
        vx0().getClass();
    }

    public C47419f av0() {
        return vx0();
    }

    /* renamed from: kw */
    public WebView.WebViewKind mo34965kw() {
        return WebView.sDefaultWebViewKind;
    }

    public void onAccountInitialized(Context context) {
        ThreadPool.post(new C35075b(this, (C35074a) null), "TopStory.InitTopStoryCacheFolderTask");
    }

    public void onAccountReleased(Context context) {
        C21724i iVar = this.f127002d;
        if (iVar != null) {
            iVar.f61502a.removeCallbacksAndMessages((Object) null);
            iVar.f61502a.quit();
            this.f127002d = null;
        }
        C21723h hVar = this.f127003e;
        if (hVar != null) {
            hVar.getClass();
            this.f127003e = null;
        }
        C47918a aVar = C47918a.f128578q;
        if (aVar != null) {
            if (aVar.f128583h != null) {
                C86709a0.m107524d().mo123458d(C47918a.f128578q.f128583h);
                C47918a.f128578q.f128583h = null;
            }
            if (C47918a.f128578q.f128584i != null) {
                C86709a0.m107524d().mo123458d(C47918a.f128578q.f128584i);
                C47918a.f128578q.f128584i = null;
            }
            C86709a0.m107524d().mo123470p(2748, C47918a.f128578q);
            C47918a.f128578q = null;
        }
    }

    /* renamed from: t4 */
    public C21032k mo34966t4() {
        C21723h hVar = this.f127003e;
        if (hVar == null) {
            synchronized (this) {
                hVar = this.f127003e;
                if (hVar == null) {
                    hVar = new C21723h();
                    this.f127003e = hVar;
                }
            }
        }
        return hVar;
    }

    public final C21724i vx0() {
        C21724i iVar = this.f127002d;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            C21724i iVar2 = this.f127002d;
            if (iVar2 != null) {
                return iVar2;
            }
            C21724i iVar3 = new C21724i();
            this.f127002d = iVar3;
            return iVar3;
        }
    }
}
