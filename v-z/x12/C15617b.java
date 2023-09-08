package x12;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.kidswatch.p066ui.login.KidsWatchHeadComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fk0.C86910b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import z12.C16094a;

/* renamed from: x12.b */
public final class C15617b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ KidsWatchHeadComponent f42241d;

    public C15617b(KidsWatchHeadComponent kidsWatchHeadComponent) {
        this.f42241d = kidsWatchHeadComponent;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent$prepareViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("KidsWatchHeadComponent", "click help icon");
        C16094a aVar = C16094a.f43246a;
        Context context = this.f42241d.getContext();
        C87412m.m108593f(context, "context");
        aVar.mo14691b(context, "wxaaff6b96fc2cd3c6", "pages/help/help.html", C86910b.CTRL_INDEX, "1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent$prepareViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
