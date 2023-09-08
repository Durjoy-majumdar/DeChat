package f60;

import android.view.View;
import com.tencent.p014mm.live.p016ui.LiveUID;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f60.h */
public final class C7990h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveUID f26674d;

    public C7990h(LiveUID liveUID) {
        this.f26674d = liveUID;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/LiveUID$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f26674d.finish();
        C117292a.m165361g(this, "com/tencent/mm/live/ui/LiveUID$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
