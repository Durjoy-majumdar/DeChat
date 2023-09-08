package vo3;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: vo3.l */
public final class C111578l {
    /* renamed from: a */
    public static final boolean m152104a(View view) {
        C87412m.m108594g(view, "<this>");
        Object tag = view.getTag(C0966R.C0970id.lpi);
        if (tag instanceof C111563a) {
            return ((C111563a) tag).mo69090a();
        }
        if (view instanceof ScrollView) {
            return true ^ ((ScrollView) view).canScrollVertically(1);
        }
        if (!(view instanceof AbsListView)) {
            return true;
        }
        AbsListView absListView = (AbsListView) view;
        if (absListView.getChildCount() > 0) {
            int childCount = absListView.getChildCount();
            return absListView.getFirstVisiblePosition() + childCount >= absListView.getCount() && absListView.getChildAt(childCount - 1).getBottom() <= absListView.getHeight() - absListView.getListPaddingBottom();
        }
    }

    /* renamed from: b */
    public static final boolean m152105b(View view) {
        C87412m.m108594g(view, "<this>");
        Object tag = view.getTag(C0966R.C0970id.lpj);
        if (tag instanceof C111564b) {
            return ((C111564b) tag).mo69091b();
        }
        if (view instanceof ScrollView) {
            return true ^ ((ScrollView) view).canScrollVertically(-1);
        }
        if (!(view instanceof AbsListView)) {
            return true;
        }
        AbsListView absListView = (AbsListView) view;
        if (absListView.getChildCount() <= 0) {
            return true;
        }
        return absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getListPaddingTop();
    }
}
