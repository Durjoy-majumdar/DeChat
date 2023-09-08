package dp1;

import android.app.Activity;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;

/* renamed from: dp1.p */
public final class C7448p extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public boolean f25639a;

    /* renamed from: b */
    public final /* synthetic */ Activity f25640b;

    public C7448p(Activity activity) {
        this.f25640b = activity;
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        if (i == 1) {
            this.f25639a = true;
            return;
        }
        this.f25639a = false;
        C58391n.f167292a.mo83230f(this.f25640b.hashCode());
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (cVar.f24946a != 2) {
            if (!this.f25639a) {
                C58391n.f167292a.mo83229e(this.f25640b.hashCode());
            }
            this.f25639a = false;
        }
    }
}
