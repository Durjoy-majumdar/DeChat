package ay0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import fy3.C32226l;
import g93.C32355a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import xx0.C53458b;
import z04.C112550d0;

/* renamed from: ay0.a */
public final class C39647a extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MpWebViewController f106403d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39647a(MpWebViewController mpWebViewController) {
        super(1);
        this.f106403d = mpWebViewController;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "value");
        String A1 = this.f106403d.mo63662A1();
        Log.m105924i(A1, "load pageFrame : " + str);
        this.f106403d.f117543Q.mo73829a("onTmplLoadEnd", MMSlotKt.now());
        boolean u = C112550d0.m153801u(str, "ok", false);
        MpWebViewController mpWebViewController = this.f106403d;
        if (!mpWebViewController.f109593R1) {
            mpWebViewController.f109593R1 = true;
            C53458b.f150358a.mo74093l(mpWebViewController.f109581F1, u);
        }
        if (u) {
            this.f106403d.mo67685N(-102);
            C32355a.m39690b(this.f106403d.f109581F1.f130544o, 114, 1, true);
        } else {
            this.f106403d.mo67685N(-103);
            C32355a.m39690b(this.f106403d.f109581F1.f130544o, 115, 1, true);
        }
        this.f106403d.getClass();
        return C13598b0.f38549a;
    }
}
