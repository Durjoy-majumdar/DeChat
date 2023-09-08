package go3;

import android.view.ScaleGestureDetector;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import gy3.C87412m;
import nj3.C100123u0;

/* renamed from: go3.a0 */
public final class C98164a0 implements TouchMediaPreviewLayout.C97277c {

    /* renamed from: d */
    public final /* synthetic */ View f287795d;

    /* renamed from: e */
    public final /* synthetic */ TouchMediaPreviewLayout f287796e;

    public C98164a0(View view, TouchMediaPreviewLayout touchMediaPreviewLayout) {
        this.f287795d = view;
        this.f287796e = touchMediaPreviewLayout;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
        C100123u0 a = C98165b0.f287797a.mo137447a(this.f287795d);
        if (a != null) {
            a.setInterceptDetach(true);
        }
        this.f287796e.mo153908b(this.f287795d);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
        C100123u0 a = C98165b0.f287797a.mo137447a(this.f287795d);
        if (a != null) {
            a.setInterceptDetach(false);
        }
    }
}
