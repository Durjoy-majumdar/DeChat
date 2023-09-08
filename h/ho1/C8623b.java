package ho1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.finder.profile.FinderProfilePoiDrawer;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import gy3.C87412m;

/* renamed from: ho1.b */
public final class C8623b implements RecyclerViewDrawerSquares.C45117c {

    /* renamed from: d */
    public Context f27733d;

    /* renamed from: e */
    public FinderProfilePoiDrawer f27734e;

    /* renamed from: f */
    public View f27735f;

    /* renamed from: g */
    public RefreshLoadMoreLayout f27736g;

    /* renamed from: a */
    public final FinderProfilePoiDrawer mo9496a() {
        FinderProfilePoiDrawer finderProfilePoiDrawer = this.f27734e;
        if (finderProfilePoiDrawer != null) {
            return finderProfilePoiDrawer;
        }
        C87412m.m108603p("drawer");
        throw null;
    }

    /* renamed from: e */
    public void mo9497e(float f) {
    }

    /* renamed from: f */
    public void mo9498f() {
        mo9496a().mo82543k(this);
    }

    /* renamed from: g */
    public void mo3766g(boolean z, boolean z2, int i) {
    }
}
