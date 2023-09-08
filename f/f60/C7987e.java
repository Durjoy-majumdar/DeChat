package f60;

import android.view.View;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.p016ui.LiveUID;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import z50.C16111r;

/* renamed from: f60.e */
public final class C7987e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveUID f26671d;

    public C7987e(LiveUID liveUID) {
        this.f26671d = liveUID;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/LiveUID$initRangePanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LiveUID liveUID = this.f26671d;
        int i = liveUID.f10336B;
        if (i == 0) {
            C86709a0.m107529k().f251779b.mo123460f(new C16111r(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, false));
        } else if (i == liveUID.f10358z) {
            C86709a0.m107529k().f251779b.mo123460f(new C16111r(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, true));
        }
        this.f26671d.mo1189J7();
        this.f26671d.mo1187H7();
        C117292a.m165361g(this, "com/tencent/mm/live/ui/LiveUID$initRangePanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
