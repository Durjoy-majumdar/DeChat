package eo0;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import java.lang.ref.WeakReference;
import vk0.C90809a;
import vk0.C90815g;

/* renamed from: eo0.b */
public class C86623b extends C83231l.C83234d {

    /* renamed from: d */
    public final /* synthetic */ WeakReference f251588d;

    /* renamed from: e */
    public final /* synthetic */ C82520h f251589e;

    public C86623b(C86625d dVar, WeakReference weakReference, C82520h hVar) {
        this.f251588d = weakReference;
        this.f251589e = hVar;
    }

    /* renamed from: c */
    public void mo109497c() {
        C90815g gVar;
        WeakReference weakReference = this.f251588d;
        if (!(weakReference == null || (gVar = (C90815g) weakReference.get()) == null)) {
            this.f251589e.mo114866q(gVar);
            this.f251589e.mo114863i(gVar);
            this.f251589e.mo114867r(gVar);
            C90809a.C90811b.f260763a.mo124932b(gVar.getCameraId(), true);
        }
        C83231l.m102144e(this.f251589e.getAppId(), this);
    }
}
