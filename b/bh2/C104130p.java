package bh2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import l80.C109277d;
import rx3.C13598b0;

/* renamed from: bh2.p */
public final class C104130p extends C87413o implements C32227p<C104114f, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104119h f308110d;

    /* renamed from: e */
    public final /* synthetic */ C109277d f308111e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104130p(C104119h hVar, C109277d dVar) {
        super(2);
        this.f308110d = hVar;
        this.f308111e = dVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C104114f fVar = (C104114f) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C87412m.m108594g(fVar, "$this$$receiver");
        if (!booleanValue) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxGLInitFailed");
            C115669n.INSTANCE.mo175913w(986, 18, 1);
        }
        C104128n nVar = new C104128n(this.f308110d);
        C104129o oVar = new C104129o(this.f308110d);
        fVar.f327874h = nVar;
        fVar.f327875i = oVar;
        fVar.f327885s = true;
        C104119h hVar = this.f308110d;
        fVar.f308042H = hVar.f308056D;
        fVar.f308043I = new C104127m(hVar, this.f308111e);
        C104119h hVar2 = this.f308110d;
        hVar2.f308054B = true;
        if (hVar2.f308055C) {
            hVar2.mo124208b();
        }
        return C13598b0.f38549a;
    }
}
