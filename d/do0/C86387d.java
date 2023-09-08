package do0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import p830xc.C91165a;

/* renamed from: do0.d */
public class C86387d implements C91165a.C53318a {

    /* renamed from: a */
    public final /* synthetic */ C82520h f251174a;

    /* renamed from: b */
    public final /* synthetic */ C82381f f251175b;

    /* renamed from: c */
    public final /* synthetic */ C91165a f251176c;

    /* renamed from: d */
    public final /* synthetic */ C86384a f251177d;

    public C86387d(C86384a aVar, C82520h hVar, C82381f fVar, C91165a aVar2) {
        this.f251177d = aVar;
        this.f251174a = hVar;
        this.f251175b = fVar;
        this.f251176c = aVar2;
    }

    /* renamed from: a */
    public void mo18009a(int i) {
        C82520h hVar = (C82520h) this.f251175b;
        if (((C83873p2) hVar.getCustomViewContainer()).mo116437o(0, false, false).findViewById(this.f251177d.f251155h.getView().hashCode()) != null) {
            ((C83873p2) hVar.getCustomViewContainer()).mo116437o(0, false, false).removeView(this.f251177d.f251155h.getView());
        }
    }

    /* renamed from: c */
    public void mo18010c() {
        C86384a.m107039q(this.f251177d, this.f251174a);
    }

    public void onDestroy() {
        this.f251176c.mo62548i();
        this.f251177d.f251155h = null;
    }
}
