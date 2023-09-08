package vf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGallerySearchUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C33631s;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import o40.C61926c;
import rs1.C13442s8;
import sx3.C64197v;
import te3.C49712hj1;
import zf1.C66800f;

/* renamed from: vf1.z */
public final class C65742z implements C60907t {

    /* renamed from: a */
    public final /* synthetic */ FinderGallerySearchUI f189132a;

    public C65742z(FinderGallerySearchUI finderGallerySearchUI) {
        this.f189132a = finderGallerySearchUI;
    }

    /* renamed from: a */
    public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
        C60906r rVar2 = rVar;
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(rVar2, "wxRVData");
        int i = rVar2.f173505a;
        if (i == 0 || i == 8) {
            LinkedList<C33631s> linkedList = rVar2.f173510f;
            FinderGallerySearchUI finderGallerySearchUI = this.f189132a;
            int i2 = 0;
            for (T next : linkedList) {
                int i3 = i2 + 1;
                C49712hj1 hj12 = null;
                if (i2 >= 0) {
                    C33631s sVar = (C33631s) next;
                    C9493c cVar = sVar.f91020a;
                    if (cVar instanceof BaseFinderFeed) {
                        String p = C61926c.m72691p(cVar.getItemId());
                        int i4 = sVar.f91022c;
                        finderGallerySearchUI.getClass();
                        Class cls = C58417y0.class;
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                        C58417y0 y0Var = (C58417y0) c;
                        String str = finderGallerySearchUI.f158890w;
                        String str2 = finderGallerySearchUI.f158885r;
                        String str3 = ((C58417y0) C86312j.m106911c(cls)).f167351e;
                        int i5 = finderGallerySearchUI.f158891x;
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(finderGallerySearchUI);
                        if (f != null) {
                            hj12 = f.mo12861q3();
                        }
                        C58417y0.cy0(y0Var, str, str2, 2, 2, p, i4, 3, 1, str3, 1, i5, hj12, (String) null, 0, 12288, (Object) null);
                        C66800f.f191913a.mo90796d(cVar.getItemId(), finderGallerySearchUI.f158880H, i3, finderGallerySearchUI.f158885r);
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            return;
        }
    }
}
