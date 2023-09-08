package f60;

import android.view.View;
import com.tencent.p014mm.live.p016ui.LiveUID;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f60.d */
public final class C7986d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveUID f26670d;

    public C7986d(LiveUID liveUID) {
        this.f26670d = liveUID;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/LiveUID$initRangePanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LiveUID liveUID = this.f26670d;
        int i = LiveUID.f10334E;
        liveUID.mo1187H7();
        C117292a.m165361g(this, "com/tencent/mm/live/ui/LiveUID$initRangePanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
