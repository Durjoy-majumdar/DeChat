package qj1;

import a14.C53934p0;
import a14.C53973z1;
import c50.C54655b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import fh1.C8070p;
import fh1.C8078q;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import nk1.C11207i;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: qj1.r7 */
public final class C12642r7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12611q7 f36225d;

    /* renamed from: e */
    public final /* synthetic */ int f36226e;

    /* renamed from: f */
    public final /* synthetic */ String f36227f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12642r7(C12611q7 q7Var, int i, String str) {
        super(0);
        this.f36225d = q7Var;
        this.f36226e = i;
        this.f36227f = str;
    }

    public Object invoke() {
        C8070p pVar;
        C12611q7 q7Var = this.f36225d;
        int i = this.f36226e;
        String str = this.f36227f;
        q7Var.getClass();
        boolean z = false;
        if ((C54655b.f153178f1 != null) && i != 0) {
            if ((str.length() > 0) && (pVar = (C8070p) q7Var.mo87685B0(C8070p.class)) != null) {
                Log.m105924i("Finder.GestureEffectPagController", "#enterGiftMode " + i + ' ' + str + " totalShowTime=" + MAlarmHandler.NEXT_FIRE_INTERVAL);
                if (C32444a.f86066I1.mo60266n().intValue() != 0) {
                    if (C54655b.f153178f1 != null) {
                        z = true;
                    }
                    if (!z) {
                        Log.m105924i("Finder.GestureEffectPagController", "#enterGiftMode not anchor, return");
                    } else {
                        pVar.mo9156G3();
                        C53973z1 z1Var = pVar.f26841t;
                        if (z1Var != null) {
                            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                        }
                        pVar.f26841t = C11207i.m11066b(pVar, (C66212f) null, (C53934p0) null, new C8078q(pVar, str, MAlarmHandler.NEXT_FIRE_INTERVAL, i, (C15601d<? super C8078q>) null), 3, (Object) null);
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
