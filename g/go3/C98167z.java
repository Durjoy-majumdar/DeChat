package go3;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import nj3.C100123u0;

/* renamed from: go3.z */
public final class C98167z implements TouchMediaPreviewLayout.C97275a {

    /* renamed from: a */
    public final /* synthetic */ TouchMediaPreviewLayout f287798a;

    /* renamed from: b */
    public final /* synthetic */ View f287799b;

    public C98167z(TouchMediaPreviewLayout touchMediaPreviewLayout, View view) {
        this.f287798a = touchMediaPreviewLayout;
        this.f287799b = view;
    }

    public void onDoubleTap(float f, float f2) {
        if (!this.f287798a.getAddTouchView()) {
            C100123u0 a = C98165b0.f287797a.mo137447a(this.f287799b);
            if (a != null) {
                a.setInterceptDetach(true);
            }
            this.f287798a.mo153908b(this.f287799b);
        }
        this.f287798a.mo153913e(f, f2);
    }
}
