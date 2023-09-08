package qk1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import yh1.C16011a;

/* renamed from: qk1.n1 */
public final class C12821n1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8916d f36703d;

    /* renamed from: e */
    public final /* synthetic */ C12814m1 f36704e;

    public C12821n1(C8916d dVar, C12814m1 m1Var) {
        this.f36703d = dVar;
        this.f36704e = m1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f36703d.field_rewardProductId;
        Log.m105924i("GiftItemPreview", "start onClick");
        C16011a aVar = this.f36704e.f36680h;
        if (aVar != null) {
            C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            C87412m.m108593f(str, "giftId");
            aVar.mo12007c((ViewGroup) view, str);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
