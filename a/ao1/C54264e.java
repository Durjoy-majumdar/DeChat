package ao1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C60213x3;

/* renamed from: ao1.e */
public final class C54264e {

    /* renamed from: a */
    public static final C54264e f152303a = new C54264e();

    /* renamed from: b */
    public static C60213x3 f152304b;

    /* renamed from: a */
    public final void mo75058a(int i, String str) {
        C87412m.m108594g(str, "errMsg");
        Log.m105924i("Finder.PostCallbackMgr", "doCallback state:" + i + " errMsg:" + str);
        C60213x3 x3Var = f152304b;
        if (x3Var != null) {
            x3Var.mo5408a(i, str);
        }
        f152304b = null;
    }
}
