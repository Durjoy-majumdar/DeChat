package il1;

import android.app.Activity;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61937h;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49887ir1;
import te3.C50027jr1;
import te3.C50169kr1;
import te3.C51006qs1;

/* renamed from: il1.l */
public final class C46264l {

    /* renamed from: a */
    public final Activity f124710a;

    /* renamed from: b */
    public final FinderLiveTaskBannerView f124711b;

    public C46264l(Activity activity, FinderLiveTaskBannerView finderLiveTaskBannerView) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderLiveTaskBannerView, "bannerView");
        this.f124710a = activity;
        this.f124711b = finderLiveTaskBannerView;
    }

    /* renamed from: a */
    public final void mo71673a(C51006qs1 qs12) {
        C87412m.m108594g(qs12, "gameInfo");
        C49887ir1 ir12 = qs12.f140526h;
        String str = null;
        LinkedList<C50027jr1> linkedList = ir12 != null ? ir12.f135626d : null;
        StringBuilder sb = new StringBuilder();
        sb.append("update ");
        Object obj = qs12.f140526h;
        if (obj == null) {
            obj = "";
        }
        sb.append(C61937h.m72709h(obj));
        Log.m105924i("MicroMsg.FinderGameLivePostTaskWidget", sb.toString());
        if (linkedList == null || linkedList.isEmpty()) {
            this.f124711b.setVisibility(4);
            return;
        }
        this.f124711b.setVisibility(0);
        FinderLiveTaskBannerView finderLiveTaskBannerView = this.f124711b;
        C50169kr1 kr12 = qs12.f140523e;
        if (kr12 != null) {
            str = kr12.f137001d;
        }
        finderLiveTaskBannerView.setGameAppId(str);
        FinderLiveTaskBannerView finderLiveTaskBannerView2 = this.f124711b;
        List<T> J = C110818d0.m150912J(linkedList);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(J, 10));
        Iterator it = ((ArrayList) J).iterator();
        while (it.hasNext()) {
            C50027jr1 jr12 = (C50027jr1) it.next();
            C49887ir1 ir13 = qs12.f140526h;
            arrayList.add(new FinderLiveTaskBannerView.C41480b(jr12, ir13 != null ? (long) ir13.f135627e : 0));
        }
        finderLiveTaskBannerView2.setTaskInfoList(arrayList);
        FinderLiveTaskBannerView finderLiveTaskBannerView3 = this.f124711b;
        finderLiveTaskBannerView3.f160097p = true;
        finderLiveTaskBannerView3.mo78259d();
    }
}
