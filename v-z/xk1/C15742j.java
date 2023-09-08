package xk1;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import gy3.C87412m;

/* renamed from: xk1.j */
public final class C15742j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C15746k f42460d;

    /* renamed from: e */
    public final /* synthetic */ LinearLayout.LayoutParams f42461e;

    public C15742j(C15746k kVar, LinearLayout.LayoutParams layoutParams) {
        this.f42460d = kVar;
        this.f42461e = layoutParams;
    }

    public final void run() {
        int[] iArr = new int[2];
        View view = this.f42460d.f42466f;
        if (view != null) {
            view.getLocationInWindow(iArr);
            int i = iArr[1];
            View view2 = this.f42460d.f42466f;
            if (view2 != null) {
                int c = (C75044y4.m89990b(this.f42460d.getActivity()).y - C75044y4.m89991c(this.f42460d.getActivity())) - (i + view2.getHeight());
                LinearLayout linearLayout = this.f42460d.f42465e;
                if (linearLayout != null) {
                    int height = c - linearLayout.getHeight();
                    if (height >= 0) {
                        LinearLayout.LayoutParams layoutParams = this.f42461e;
                        layoutParams.topMargin = height;
                        LinearLayout linearLayout2 = this.f42460d.f42465e;
                        if (linearLayout2 != null) {
                            linearLayout2.setLayoutParams(layoutParams);
                        } else {
                            C87412m.m108603p("btnContainer");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("btnContainer");
                    throw null;
                }
            } else {
                C87412m.m108603p("optionRoot");
                throw null;
            }
        } else {
            C87412m.m108603p("optionRoot");
            throw null;
        }
    }
}
