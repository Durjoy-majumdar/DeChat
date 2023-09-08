package zk1;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di3.C86312j;
import gg1.C32444a;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76630x0;
import te3.C50019jp1;
import wi0.C91003z;

/* renamed from: zk1.p */
public final class C16273p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43564d;

    /* renamed from: e */
    public final /* synthetic */ C50019jp1 f43565e;

    public C16273p(C16229h hVar, C50019jp1 jp12) {
        this.f43564d = hVar;
        this.f43565e = jp12;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$10$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C16229h hVar = this.f43564d;
        Activity context = hVar.getContext();
        C50019jp1 jp12 = this.f43565e;
        String str = jp12.f136237d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = jp12.f136238e;
        if (str3 != null) {
            str2 = str3;
        }
        String str4 = hVar.f43483d;
        Log.m105924i(str4, "#goMiniApp appId=" + str + " path=" + str2);
        C16270m mVar = new C16270m(hVar);
        C86299o oVar = new C86299o();
        oVar.f250930b = str;
        oVar.f250934f = str2;
        if (C32444a.f86211w1.mo60266n().intValue() == 1) {
            oVar.f250931c = 2;
        }
        oVar.f250939k = 1205;
        C91003z zVar = C91003z.DISABLED;
        oVar.f250923L = zVar;
        oVar.f250924M = zVar;
        oVar.f250915D = true;
        oVar.f250943o = new C16267l(mVar);
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$10$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
