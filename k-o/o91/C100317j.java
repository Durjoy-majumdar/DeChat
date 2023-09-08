package o91;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C57547m0;
import gy3.C87412m;

/* renamed from: o91.j */
public final class C100317j {
    /* renamed from: a */
    public static final View m131143a(View view, int i) {
        C87412m.m108594g(view, "<this>");
        if (view instanceof AbsListView) {
            return ((AbsListView) view).getChildAt(i);
        }
        if (view instanceof RecyclerView) {
            return ((RecyclerView) view).getChildAt(i);
        }
        return null;
    }

    /* renamed from: b */
    public static final Object m131144b(View view, int i) {
        Object item;
        C87412m.m108594g(view, "<this>");
        if (view instanceof AbsListView) {
            ListAdapter listAdapter = (ListAdapter) ((AbsListView) view).getAdapter();
            if (listAdapter == null || (item = listAdapter.getItem(i)) == null) {
                return null;
            }
        } else if (!(view instanceof RecyclerView)) {
            return null;
        } else {
            RecyclerView.C16613e adapter = ((RecyclerView) view).getAdapter();
            C57547m0 m0Var = adapter instanceof C57547m0 ? (C57547m0) adapter : null;
            if (m0Var == null || (item = m0Var.getItem(i)) == null) {
                return null;
            }
        }
        return item;
    }

    /* renamed from: c */
    public static final int m131145c(View view) {
        RecyclerView.C16613e adapter;
        C87412m.m108594g(view, "<this>");
        if (view instanceof AbsListView) {
            ListAdapter listAdapter = (ListAdapter) ((AbsListView) view).getAdapter();
            if (listAdapter != null) {
                return listAdapter.getCount();
            }
            return 0;
        } else if (!(view instanceof RecyclerView) || (adapter = ((RecyclerView) view).getAdapter()) == null) {
            return 0;
        } else {
            return adapter.getItemCount();
        }
    }

    /* renamed from: d */
    public static final int m131146d(View view) {
        C87412m.m108594g(view, "<this>");
        if (view instanceof AbsListView) {
            return ((AbsListView) view).getLastVisiblePosition();
        }
        if (!(view instanceof RecyclerView)) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) view).getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.mo16959E();
        }
        return -1;
    }

    /* renamed from: e */
    public static final boolean m131147e(View view) {
        C87412m.m108594g(view, "<this>");
        if (!(view instanceof AbsListView)) {
            return (view instanceof RecyclerView) && ((RecyclerView) view).getAdapter() != null;
        }
        if (((AbsListView) view).getAdapter() != null) {
            return true;
        }
    }
}
