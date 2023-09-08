package wg1;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di0.C86299o;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import hn3.C108252a;
import kr0.C76630x0;
import p823sg.C90193h;
import pe3.C89349b;
import rx3.C13598b0;
import su0.C13781a;
import wi0.C90973a0;
import wi0.C91003z;
import z04.C119027c;

/* renamed from: wg1.k4 */
public final class C53160k4 {

    /* renamed from: a */
    public static final C53160k4 f148337a = new C53160k4();

    /* renamed from: a */
    public final String mo73851a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C112760b.m154225d());
        sb.append("gamewelfaretaskminiapphelper/");
        String a = C13781a.m13082a();
        C87412m.m108593f(a, "username()");
        byte[] bytes = a.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(C90193h.m112878f(bytes));
        String sb4 = sb.toString();
        if (!C86013q1.m106450k(sb4)) {
            C86013q1.m106461v(sb4);
        }
        return sb4 + "/snapshot";
    }

    /* renamed from: b */
    public final void mo73852b(Context context, String str, String str2, int i, C89349b bVar, C32226l<? super Boolean, C13598b0> lVar) {
        String str3;
        Class cls = C76630x0.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "path");
        Log.m105924i("GameWelfareTaskMiniAppHelper", "#goMiniApp appId=" + str + " path=" + str2 + " version=" + i + " extraData=" + bVar);
        if (((C76630x0) C86312j.m106911c(cls)).fn0()) {
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            if (mMActivity != null) {
                try {
                    View decorView = mMActivity.getWindow().getDecorView();
                    C87412m.m108593f(decorView, "activity.window.decorView");
                    Bitmap d = C108252a.m146586d(decorView, decorView.getWidth(), decorView.getHeight(), false, Bitmap.Config.RGB_565);
                    if (d != null) {
                        str3 = mo73851a();
                        if (C86013q1.m106450k(str3)) {
                            C86013q1.m106447h(str3);
                        }
                        BitmapUtil.saveBitmapToImage(d, 100, Bitmap.CompressFormat.JPEG, str3, true);
                        C86299o oVar = new C86299o();
                        oVar.f250930b = str;
                        oVar.f250934f = str2;
                        oVar.f250931c = i;
                        oVar.f250937i = new C53159h4(bVar);
                        oVar.f250913B = C90973a0.TRANSPARENT;
                        C91003z zVar = C91003z.DISABLED;
                        oVar.f250923L = zVar;
                        oVar.f250924M = zVar;
                        oVar.f250925N = true;
                        oVar.f250935g = true;
                        oVar.f250939k = 1205;
                        oVar.f250914C = str3;
                        oVar.f250915D = true;
                        oVar.f250944p = new C15310i4(lVar);
                        ((C76630x0) C86312j.m106911c(cls)).mo106898tv(context, oVar);
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("GameWelfareTaskMiniAppHelper", th, "getSnapShot err", new Object[0]);
                }
            }
        }
        str3 = "";
        C86299o oVar2 = new C86299o();
        oVar2.f250930b = str;
        oVar2.f250934f = str2;
        oVar2.f250931c = i;
        oVar2.f250937i = new C53159h4(bVar);
        oVar2.f250913B = C90973a0.TRANSPARENT;
        C91003z zVar2 = C91003z.DISABLED;
        oVar2.f250923L = zVar2;
        oVar2.f250924M = zVar2;
        oVar2.f250925N = true;
        oVar2.f250935g = true;
        oVar2.f250939k = 1205;
        oVar2.f250914C = str3;
        oVar2.f250915D = true;
        oVar2.f250944p = new C15310i4(lVar);
        ((C76630x0) C86312j.m106911c(cls)).mo106898tv(context, oVar2);
    }
}
