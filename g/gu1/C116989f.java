package gu1;

import a10.C112713c;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import o40.C61926c;
import p172io.flutter.embedding.engine.FlutterEngine;
import rx3.C13598b0;

/* renamed from: gu1.f */
public final class C116989f {

    /* renamed from: a */
    public final C112713c f350556a;

    /* renamed from: b */
    public final long f350557b;

    /* renamed from: c */
    public final boolean f350558c;

    /* renamed from: d */
    public final C32224a<C13598b0> f350559d;

    /* renamed from: e */
    public final String f350560e;

    /* renamed from: f */
    public final LinkedList<FlutterEngine> f350561f;

    /* renamed from: g */
    public final Runnable f350562g;

    /* renamed from: h */
    public final C116986c f350563h;

    public C116989f(C112713c cVar, long j, boolean z, C32224a aVar, int i, C8480h hVar) {
        j = (i & 2) != 0 ? 0 : j;
        z = (i & 4) != 0 ? true : z;
        C87412m.m108594g(cVar, "engineGroup");
        C87412m.m108594g(aVar, "callback");
        this.f350556a = cVar;
        this.f350557b = j;
        this.f350558c = z;
        this.f350559d = aVar;
        this.f350560e = "MicroMsg.AutoReleaseEngineGroupHelper";
        this.f350561f = new LinkedList<>();
        this.f350562g = new C116988e(this);
        C116986c cVar2 = new C116986c(this);
        this.f350563h = cVar2;
        cVar.f337476j = new C116985b(this);
        ProcessDeepBackgroundOwner.INSTANCE.addLifecycleCallback((C80401d) cVar2);
        mo180957a();
        Log.m105924i("MicroMsg.AutoReleaseEngineGroupHelper", "init releaseEngineGroup:" + z);
    }

    /* renamed from: a */
    public final void mo180957a() {
        if (this.f350557b > 0 && this.f350558c) {
            C61926c.m72698w(this.f350562g);
            if (this.f350561f.size() == 0) {
                C61926c.m72667L(this.f350557b, this.f350562g);
            }
        }
    }
}
