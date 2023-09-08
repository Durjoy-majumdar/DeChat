package p1130l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C103439b;
import androidx.appcompat.view.menu.C103447d;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.C103456i;

/* renamed from: l.f */
public abstract class C109066f implements C109068h, C103456i, AdapterView.OnItemClickListener {

    /* renamed from: d */
    public Rect f326632d;

    /* renamed from: l */
    public static int m148067l(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: t */
    public static boolean m148068t(C103448e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo143533e(C103448e eVar, C103452g gVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo143534g(C103448e eVar, C103452g gVar) {
        return false;
    }

    public int getId() {
        return 0;
    }

    /* renamed from: h */
    public void mo143564h(Context context, C103448e eVar) {
    }

    /* renamed from: k */
    public abstract void mo143546k(C103448e eVar);

    /* renamed from: m */
    public abstract void mo143547m(View view);

    /* renamed from: n */
    public abstract void mo143548n(boolean z);

    /* renamed from: o */
    public abstract void mo143549o(int i);

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C103447d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C103447d) listAdapter).f305224d.mo143614q((MenuItem) listAdapter.getItem(i), this, (this instanceof C103439b) ^ true ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo143552p(int i);

    /* renamed from: q */
    public abstract void mo143553q(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: r */
    public abstract void mo143554r(boolean z);

    /* renamed from: s */
    public abstract void mo143555s(int i);
}
