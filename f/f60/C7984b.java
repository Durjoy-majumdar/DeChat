package f60;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.live.p016ui.LiveUID;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f60.b */
public final class C7984b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveUID f26668d;

    public C7984b(LiveUID liveUID) {
        this.f26668d = liveUID;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/LiveUID$initRangePanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LiveUID liveUID = this.f26668d;
        if (liveUID.f10338D) {
            int i = liveUID.f10336B;
            liveUID.getClass();
            if (i != 0) {
                Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markAnchorChangeReplayOnlySelf");
                C115669n.INSTANCE.mo175913w(1385, 4, 1);
            }
        } else {
            Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markAnchorSetReplayOnlySelf");
            C115669n.INSTANCE.mo175913w(1385, 0, 1);
        }
        LiveUID liveUID2 = this.f26668d;
        liveUID2.getClass();
        liveUID2.f10336B = 0;
        ImageView imageView = this.f26668d.f10354v;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f26668d.f10356x;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        C117292a.m165361g(this, "com/tencent/mm/live/ui/LiveUID$initRangePanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
