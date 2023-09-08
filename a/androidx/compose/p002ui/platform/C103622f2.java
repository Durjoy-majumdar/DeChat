package androidx.compose.p002ui.platform;

import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.Iterator;
import p175j0.C108509q;
import p849e3.C86422y;
import y04.C112349m;

/* renamed from: androidx.compose.ui.platform.f2 */
public final class C103622f2 implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ AbstractComposeView f306077d;

    public C103622f2(AbstractComposeView abstractComposeView) {
        this.f306077d = abstractComposeView;
    }

    public void onViewAttachedToWindow(View view) {
        C87412m.m108594g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        boolean z;
        C87412m.m108594g(view, "v");
        AbstractComposeView abstractComposeView = this.f306077d;
        C87412m.m108594g(abstractComposeView, "<this>");
        Iterator it = C112349m.m153281d(abstractComposeView.getParent(), C86422y.f251213d).iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            ViewParent viewParent = (ViewParent) it.next();
            if (viewParent instanceof View) {
                View view2 = (View) viewParent;
                C87412m.m108594g(view2, "<this>");
                Object tag = view2.getTag(C0966R.C0970id.n1k);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                if (z) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            AbstractComposeView abstractComposeView2 = this.f306077d;
            C108509q qVar = abstractComposeView2.f305948f;
            if (qVar != null) {
                ((WrappedComposition) qVar).dispose();
            }
            abstractComposeView2.f305948f = null;
            abstractComposeView2.requestLayout();
        }
    }
}
