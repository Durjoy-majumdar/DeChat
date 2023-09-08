package i13;

import android.support.design.widget.MMBottomSheetBehavior;
import android.view.View;
import gy3.C87412m;

/* renamed from: i13.c */
public final class C8844c extends MMBottomSheetBehavior.C0109c {

    /* renamed from: a */
    public final /* synthetic */ C8840a f28071a;

    public C8844c(C8840a aVar) {
        this.f28071a = aVar;
    }

    /* renamed from: a */
    public void mo87a(View view, float f) {
        C87412m.m108594g(view, "bottomSheet");
        this.f28071a.f28066p = 0.7f >= f;
    }

    /* renamed from: b */
    public void mo88b(View view, int i) {
        C87412m.m108594g(view, "bottomSheet");
        if (2 == i) {
            C8840a aVar = this.f28071a;
            if (aVar.f28066p) {
                aVar.dismiss();
                return;
            }
            MMBottomSheetBehavior<View> mMBottomSheetBehavior = aVar.f28065o;
            if (mMBottomSheetBehavior != null) {
                mMBottomSheetBehavior.mo143309A(3);
            }
        }
    }
}
