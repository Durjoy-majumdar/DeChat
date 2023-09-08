package x12;

import android.view.View;
import com.tencent.p014mm.plugin.kidswatch.p066ui.login.KidsWatchHeadComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: x12.a */
public final class C15616a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ KidsWatchHeadComponent f42240d;

    public C15616a(KidsWatchHeadComponent kidsWatchHeadComponent) {
        this.f42240d = kidsWatchHeadComponent;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent$prepareViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("KidsWatchHeadComponent", "close clicked");
        C32224a<C13598b0> closeBtnCallBack = this.f42240d.getCloseBtnCallBack();
        if (closeBtnCallBack != null) {
            closeBtnCallBack.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent$prepareViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
