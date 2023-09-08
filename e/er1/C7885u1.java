package er1;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di3.C86312j;
import gy3.C87412m;
import kr0.C76630x0;
import ql0.C89698a;

/* renamed from: er1.u1 */
public final class C7885u1 {

    /* renamed from: a */
    public static final C7885u1 f26507a = new C7885u1();

    /* renamed from: a */
    public static void m8051a(C7885u1 u1Var, Context context, String str, String str2, int i, ValueCallback<String> valueCallback, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = C89698a.CTRL_INDEX;
        }
        if ((i2 & 16) != 0) {
            valueCallback = null;
        }
        u1Var.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "path");
        if (!(str.length() == 0)) {
            C86299o oVar = new C86299o();
            oVar.f250930b = str;
            oVar.f250934f = str2;
            oVar.f250931c = 0;
            oVar.f250939k = i;
            oVar.f250943o = valueCallback;
            oVar.f250917F = true;
            Log.m105924i("FinderPostJumpUtils", "appId: " + str + ", enterPath: " + oVar.f250934f);
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        }
    }
}
