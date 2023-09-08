package jk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import eb0.C86493v0;

/* renamed from: jk0.c */
public class C87977c implements C82531i.C82534c {

    /* renamed from: d */
    public final /* synthetic */ C82520h f254574d;

    /* renamed from: e */
    public final /* synthetic */ boolean f254575e;

    /* renamed from: f */
    public final /* synthetic */ int f254576f;

    /* renamed from: g */
    public final /* synthetic */ C86493v0.C86495c f254577g;

    public C87977c(C87978d dVar, C82520h hVar, boolean z, int i, C86493v0.C86495c cVar) {
        this.f254574d = hVar;
        this.f254575e = z;
        this.f254576f = i;
        this.f254577g = cVar;
    }

    public void onDestroy() {
        this.f254574d.mo109649c(this.f254575e).mo86861b(this.f254576f);
        this.f254577g.mo120961h();
        System.gc();
    }
}
