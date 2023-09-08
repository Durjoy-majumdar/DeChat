package ay0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40712g0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40752u;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import ea3.C45590f;
import fy3.C32228q;
import g93.C32355a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import rx3.C13598b0;
import te3.C48812b6;
import z04.C112551y;

/* renamed from: ay0.d */
public final class C39649d extends C87413o implements C32228q<WeakReference<Object>, C40789z.C40791c, C48812b6, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MpWebViewController f106405d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39649d(MpWebViewController mpWebViewController) {
        super(3);
        this.f106405d = mpWebViewController;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C40789z.C40791c cVar = (C40789z.C40791c) obj2;
        C48812b6 b6Var = (C48812b6) obj3;
        C87412m.m108594g((WeakReference) obj, "contextRef");
        C87412m.m108594g(cVar, "result");
        C87412m.m108594g(b6Var, "appMsgContext");
        MpWebViewController mpWebViewController = this.f106405d;
        String A1 = mpWebViewController.mo63662A1();
        Log.m105924i(A1, "processGetAppContext isCached " + cVar.f109652e + " isSuccess= " + cVar.f109648a);
        int i = mpWebViewController.f109581F1.f130544o;
        boolean z = cVar.f109652e;
        mpWebViewController.f109588M1 = z;
        C32355a.m39690b(i, z ? 121 : 122, 1, true);
        C40752u uVar = mpWebViewController.f109583H1;
        uVar.f109564r = cVar.f109649b;
        uVar.f109565s = cVar.f109650c;
        uVar.f109537d = b6Var.f130964f;
        if (cVar.f109652e) {
            long now = MMSlotKt.now();
            mpWebViewController.f109586K1 = now;
            mpWebViewController.f109583H1.f109563q = now;
            mpWebViewController.f117543Q.f123343j = System.currentTimeMillis();
            mpWebViewController.mo63669H1(C40714i.m43956e(b6Var), mpWebViewController.f109584I1, mpWebViewController.f109586K1);
        } else {
            if (cVar.f109648a) {
                String str = b6Var.f130965g;
                C32355a.m39690b(i, 123, 1, true);
                String A12 = mpWebViewController.mo63662A1();
                StringBuilder sb = new StringBuilder();
                sb.append("processGetAppContext forceUrl NotBlank = ");
                boolean z2 = false;
                sb.append(str != null && (C112551y.m153811k(str) ^ true));
                Log.m105924i(A12, sb.toString());
                if (str != null && (!C112551y.m153811k(str))) {
                    z2 = true;
                }
                if (z2) {
                    C32355a.m39690b(i, 120, 1, true);
                    C87412m.m108593f(str, "forceUrl");
                    mpWebViewController.mo63664C1(C45590f.m50641a(str, mpWebViewController.mo63663B1()));
                } else if (C40712g0.m43951a(b6Var)) {
                    C32355a.m39690b(i, 124, 1, true);
                    long now2 = MMSlotKt.now();
                    mpWebViewController.f109586K1 = now2;
                    mpWebViewController.f109583H1.f109563q = now2;
                    mpWebViewController.f117543Q.f123343j = System.currentTimeMillis();
                    mpWebViewController.mo63669H1(C40714i.m43956e(b6Var), mpWebViewController.f109584I1, mpWebViewController.f109586K1);
                    mpWebViewController.f109583H1.f109520P = cVar.f109651d;
                }
            }
            Log.m105924i(mpWebViewController.mo63662A1(), "processGetAppContext loadForceUrl with rawUrl");
            mpWebViewController.mo63664C1(mpWebViewController.mo63683n0());
            C32355a.m39690b(i, 125, 1, true);
            mpWebViewController.mo63670I1();
        }
        return C13598b0.f38549a;
    }
}
