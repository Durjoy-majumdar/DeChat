package f60;

import android.view.View;
import com.tencent.p014mm.live.p016ui.LiveUID;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f60.f */
public final class C7988f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveUID f26672d;

    public C7988f(LiveUID liveUID) {
        this.f26672d = liveUID;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/LiveUID$initRangePanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LiveUID liveUID = this.f26672d;
        int i = LiveUID.f10334E;
        liveUID.mo1187H7();
        C117292a.m165361g(this, "com/tencent/mm/live/ui/LiveUID$initRangePanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
