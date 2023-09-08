package pf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import gy3.C87412m;
import jq3.C60905o;
import o40.C61926c;
import zc1.C66785b;

/* renamed from: pf1.u */
public final class C11926u extends C11903i {
    /* renamed from: r */
    public void mo11775r(C60905o oVar, View view, C11920q qVar) {
        String str;
        FinderItem o;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        BaseFinderFeed baseFinderFeed = qVar.f34830d;
        long j = 0;
        String p = C61926c.m72691p(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0);
        BaseFinderFeed baseFinderFeed2 = qVar.f34830d;
        if (baseFinderFeed2 == null || (o = baseFinderFeed2.mo3513o()) == null || (str = o.getUserName()) == null) {
            str = "";
        }
        C62262d0 d0Var = C62262d0.f176978a;
        boolean z = this.f34770g;
        d0Var.getClass();
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
        if (finderVideoLayout != null) {
            j = finderVideoLayout.getCurrentPosMs();
        }
        int i = (int) (j / ((long) 1000));
        int videoDurationSec = finderVideoLayout != null ? finderVideoLayout.getVideoDurationSec() : 0;
        if (z) {
            i = videoDurationSec;
        }
        Integer valueOf = Integer.valueOf(videoDurationSec);
        Integer valueOf2 = Integer.valueOf((int) (((((float) i) * 1.0f) / ((float) videoDurationSec)) * ((float) 100)));
        String O5 = C66785b.f191882e.mo90662O5();
        qVar.f34839m = "shortvideoid=" + p + "&cpid=" + str + "&duration=" + valueOf.intValue() + "&playPercent=" + valueOf2.intValue() + "&visitorUsername=" + O5;
        super.mo11775r(oVar, view, qVar);
    }
}
