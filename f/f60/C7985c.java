package f60;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.live.p016ui.LiveUID;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f60.c */
public final class C7985c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveUID f26669d;

    public C7985c(LiveUID liveUID) {
        this.f26669d = liveUID;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/LiveUID$initRangePanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LiveUID liveUID = this.f26669d;
        if (!liveUID.f10338D) {
            Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markAnchorSetReplayEveryOne");
            C115669n.INSTANCE.mo175913w(1385, 1, 1);
        } else if (liveUID.f10336B != liveUID.f10358z) {
            Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markAnchorChangeReplayEveryOne");
            C115669n.INSTANCE.mo175913w(1385, 5, 1);
        }
        LiveUID liveUID2 = this.f26669d;
        liveUID2.f10336B = liveUID2.f10358z;
        ImageView imageView = liveUID2.f10354v;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.f26669d.f10356x;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        C117292a.m165361g(this, "com/tencent/mm/live/ui/LiveUID$initRangePanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
