package kf1;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.ShowPhoneMenuEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.m74;

/* renamed from: kf1.r6 */
public final class C9954r6 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9840l6 f30600d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9954r6(C9840l6 l6Var) {
        super(1);
        this.f30600d = l6Var;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "phone");
        Bundle bundle = new Bundle();
        ShowPhoneMenuEvent showPhoneMenuEvent = new ShowPhoneMenuEvent();
        ShowPhoneMenuEvent.C1136a aVar = showPhoneMenuEvent.f9506d;
        aVar.f9507a = this.f30600d.f30214d;
        aVar.f9508b = str;
        aVar.f9510d = bundle;
        showPhoneMenuEvent.publish();
        MMActivity mMActivity = this.f30600d.f30214d;
        String str2 = null;
        FinderPoiFeedUI finderPoiFeedUI = mMActivity instanceof FinderPoiFeedUI ? (FinderPoiFeedUI) mMActivity : null;
        if (finderPoiFeedUI != null) {
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var = (C58417y0) c;
            FinderPoiFeedUI.C3005a aVar2 = FinderPoiFeedUI.C3005a.ACTION_CLICK_PHONE;
            long j = finderPoiFeedUI.mo3078Q7().f30413y;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(finderPoiFeedUI);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            m74 m74 = finderPoiFeedUI.mo3075N7().f13766e;
            if (m74 != null) {
                str2 = m74.f184224i;
            }
            C58417y0.Dy0(y0Var, aVar2, j, q3, str2, finderPoiFeedUI.mo3078Q7().f30414z, finderPoiFeedUI.mo3077P7(), 0, 64, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
