package tm1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: tm1.c */
public final class C14047c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyLiveSquareUIC f39397d;

    public C14047c(NearbyLiveSquareUIC nearbyLiveSquareUIC) {
        this.f39397d = nearbyLiveSquareUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC$initSearchItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        NearbyLiveSquareUIC.m3321c3(this.f39397d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC$initSearchItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
