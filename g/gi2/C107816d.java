package gi2;

import android.view.View;
import fy3.C32226l;
import gi2.C107811c;
import gy3.C87412m;
import nh2.C109741a;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: gi2.d */
public final class C107816d implements C107811c.C107815c {

    /* renamed from: a */
    public final /* synthetic */ C107811c f322640a;

    public C107816d(C107811c cVar) {
        this.f322640a = cVar;
    }

    /* renamed from: a */
    public void mo158222a(int i) {
        C107811c cVar = this.f322640a;
        int i2 = 0;
        for (T next : cVar.f322631c) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C107811c.C107814b bVar = (C107811c.C107814b) next;
                if (i2 == i) {
                    View childAt = cVar.f322629a.getChildAt(i2);
                    C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    if (!((C109741a) childAt).f328462h) {
                        cVar.f322630b = i;
                        C32226l<? super Integer, C13598b0> lVar = cVar.f322634f;
                        if (lVar != null) {
                            lVar.invoke(Integer.valueOf(i));
                        }
                        View childAt2 = cVar.f322629a.getChildAt(i2);
                        C87412m.m108592e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((C109741a) childAt2).setHasSelected(true);
                    }
                } else {
                    View childAt3 = cVar.f322629a.getChildAt(i2);
                    C87412m.m108592e(childAt3, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    if (((C109741a) childAt3).f328462h) {
                        View childAt4 = cVar.f322629a.getChildAt(i2);
                        C87412m.m108592e(childAt4, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((C109741a) childAt4).setHasSelected(false);
                    }
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
