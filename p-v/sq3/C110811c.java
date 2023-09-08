package sq3;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import oq3.C110059h;
import oq3.C21805g;
import p849e3.C107199k;
import p849e3.C107206t;

/* renamed from: sq3.c */
public class C110811c implements C110059h {

    /* renamed from: a */
    public PointF f331530a;

    /* renamed from: b */
    public C110059h f331531b;

    /* renamed from: c */
    public boolean f331532c = true;

    /* renamed from: a */
    public boolean mo160996a(View view) {
        C110059h hVar = this.f331531b;
        return hVar != null ? hVar.mo160996a(view) : mo162395c(view, this.f331530a, this.f331532c);
    }

    /* renamed from: b */
    public boolean mo160997b(View view) {
        C110059h hVar = this.f331531b;
        return hVar != null ? hVar.mo160997b(view) : mo162396d(view, this.f331530a);
    }

    /* renamed from: c */
    public final boolean mo162395c(View view, PointF pointF, boolean z) {
        if (view == null) {
            return false;
        }
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null) {
            if (!(!(view instanceof C21805g) && ((view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof C107206t) || (view instanceof WebView) || (view instanceof C107199k)))) {
                ViewGroup viewGroup = (ViewGroup) view;
                PointF pointF2 = new PointF();
                for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount - 1);
                    C87412m.m108593f(childAt, "child");
                    if (mo162397e(view, childAt, pointF.x, pointF.y, pointF2)) {
                        Object tag = childAt.getTag(C0966R.C0970id.lu8);
                        if (C87412m.m108589b("fixed", tag) || C87412m.m108589b("fixed-top", tag)) {
                            return false;
                        }
                        pointF.offset(pointF2.x, pointF2.y);
                        boolean c = mo162395c(childAt, pointF, z);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return c;
                    }
                }
            }
        }
        return z || view.canScrollVertically(-1);
    }

    /* renamed from: d */
    public final boolean mo162396d(View view, PointF pointF) {
        if (view == null) {
            return false;
        }
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            C87412m.m108593f(childAt, "child");
            if (mo162397e(view, childAt, pointF.x, pointF.y, pointF2)) {
                Object tag = childAt.getTag(C0966R.C0970id.lu8);
                if (C87412m.m108589b("fixed", tag) || C87412m.m108589b("fixed-bottom", tag)) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean d = mo162396d(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return d;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo162397e(View view, View view2, float f, float f2, PointF pointF) {
        C87412m.m108594g(view, "group");
        C87412m.m108594g(view2, "child");
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = (((float) view.getScrollX()) + f) - ((float) view2.getLeft());
        float scrollY = (fArr[1] + ((float) view.getScrollY())) - ((float) view2.getTop());
        fArr[1] = scrollY;
        float f3 = fArr[0];
        boolean z = f3 >= 0.0f && scrollY >= 0.0f && f3 < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z && pointF != null) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return z;
    }
}
