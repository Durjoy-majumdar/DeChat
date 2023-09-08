package com.tencent.p014mm.plugin.finder.gallery;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import te3.C49712hj1;
import te3.C50418ml0;
import zf1.C66801n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$1", "Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryLoader;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$initOnCreate$1 */
public final class FinderGalleryFragment$initOnCreate$1 extends FinderGalleryLoader {

    /* renamed from: g */
    public final /* synthetic */ FinderGalleryFragment f159156g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderGalleryFragment$initOnCreate$1(C50418ml0 ml02, FinderGalleryFragment finderGalleryFragment, C49712hj1 hj12) {
        super(ml02, hj12, false);
        this.f159156g = finderGalleryFragment;
    }

    public void onPostStart(long j) {
        C66801n nVar = this.f159156g.f159147u;
        if (nVar != null) {
            View m0 = nVar.mo9299m0();
            if (m0 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(m0, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$1", "onPostStart", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(m0, "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$1", "onPostStart", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C66801n nVar2 = this.f159156g.f159147u;
            if (nVar2 != null) {
                nVar2.f30220j.setVisibility(0);
                super.onPostStart(j);
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }
}
