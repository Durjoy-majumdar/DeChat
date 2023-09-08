package nq3;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import gy3.C87412m;
import oq3.C21805g;
import p849e3.C107199k;
import p849e3.C107206t;
import sq3.C110811c;

/* renamed from: nq3.a */
public final class C109756a extends C110811c {
    /* renamed from: c */
    private final boolean m149080c(View view, PointF pointF, boolean z) {
        View view2 = view;
        PointF pointF2 = pointF;
        boolean z2 = z;
        if (view2 == null) {
            return false;
        }
        if (view2.canScrollHorizontally(1) && view.getVisibility() == 0) {
            return false;
        }
        if (view2 instanceof ViewGroup) {
            if (!(!(view2 instanceof C21805g) && ((view2 instanceof AbsListView) || (view2 instanceof ScrollView) || (view2 instanceof C107206t) || (view2 instanceof WebView) || (view2 instanceof C107199k))) && pointF2 != null) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                PointF pointF3 = new PointF();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C87412m.m108593f(childAt, "child");
                    if (mo162397e(view, childAt, pointF2.x, pointF2.y, pointF3)) {
                        pointF2.offset(pointF3.x, pointF3.y);
                        boolean c = m149080c(childAt, pointF2, z2);
                        pointF2.offset(-pointF3.x, -pointF3.y);
                        return c;
                    }
                }
            }
        }
        return z2 || view2.canScrollHorizontally(-1);
    }

    /* renamed from: d */
    private final boolean m149081d(View view, PointF pointF) {
        if (view == null) {
            return false;
        }
        if (view.canScrollHorizontally(-1) && view.getVisibility() == 0) {
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
                pointF.offset(pointF2.x, pointF2.y);
                boolean d = m149081d(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return d;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo160996a(View view) {
        return m149080c(view, this.f331530a, this.f331532c);
    }

    /* renamed from: b */
    public boolean mo160997b(View view) {
        return m149081d(view, this.f331530a);
    }
}
