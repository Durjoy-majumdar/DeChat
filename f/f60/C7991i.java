package f60;

import android.view.View;
import com.tencent.p014mm.live.p016ui.LiveUID;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f60.i */
public final class C7991i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveUID f26675d;

    public C7991i(LiveUID liveUID) {
        this.f26675d = liveUID;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/LiveUID$replayClosed$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f26675d.finish();
        C117292a.m165361g(this, "com/tencent/mm/live/ui/LiveUID$replayClosed$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
