package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u001d\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/ChattingListView;", "Landroid/widget/ListView;", "Lcom/tencent/mm/pluginsdk/ui/tools/n0;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layout", "Lrx3/b0;", "setLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$q;", "getRecycledViewPool", "", "visibility", "setVisibility", "getFirstCompletelyVisiblePosition", "Lcom/tencent/mm/pluginsdk/ui/tools/ChattingListView$b;", "d", "Lcom/tencent/mm/pluginsdk/ui/tools/ChattingListView$b;", "getMCompatAdapter", "()Lcom/tencent/mm/pluginsdk/ui/tools/ChattingListView$b;", "setMCompatAdapter", "(Lcom/tencent/mm/pluginsdk/ui/tools/ChattingListView$b;)V", "mCompatAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.ChattingListView */
public class ChattingListView extends ListView implements C72917n0 {

    /* renamed from: d */
    public C72898b f212471d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.ChattingListView$a */
    public static final class C72897a {
        public C72897a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.ChattingListView$b */
    public static final class C72898b implements C57547m0 {

        /* renamed from: d */
        public final Adapter f212472d;

        public C72898b(Adapter adapter) {
            C87412m.m108594g(adapter, "mAdapter");
            this.f212472d = adapter;
        }

        /* renamed from: c3 */
        public void mo81320c3(Object obj) {
            Adapter adapter = this.f212472d;
            if (adapter instanceof BaseAdapter) {
                ((BaseAdapter) adapter).notifyDataSetChanged();
            }
        }

        public int getCount() {
            return this.f212472d.getCount();
        }

        public Object getItem(int i) {
            return this.f212472d.getItem(i);
        }
    }

    static {
        new C72897a((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChattingListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: B */
    public View mo81288B(int i) {
        View childAt = getChildAt(i);
        if (childAt != null) {
            return childAt.getBottom() - childAt.getTop() <= 0 ? getChildAt(i + getHeaderViewsCount()) : childAt;
        }
        Log.m105921e("ChattingListView", "null == view index:%s", Integer.valueOf(i));
        return null;
    }

    /* renamed from: D */
    public ViewGroup mo81289D() {
        return this;
    }

    /* renamed from: E */
    public void mo81290E(C57547m0 m0Var) {
        super.setAdapter(m0Var instanceof ListAdapter ? (ListAdapter) m0Var : null);
    }

    /* renamed from: N */
    public <T extends View> T mo81291N(int i) {
        return findViewById(i);
    }

    public void addFooterView(View view) {
        super.addFooterView(view);
    }

    public void addHeaderView(View view) {
        super.addHeaderView(view);
    }

    /* renamed from: c */
    public void mo17043c(RecyclerView.C0130p pVar) {
        C87412m.m108594g(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public int getFirstCompletelyVisiblePosition() {
        return getFirstVisiblePosition();
    }

    public final C72898b getMCompatAdapter() {
        return this.f212471d;
    }

    public RecyclerView.C16623q getRecycledViewPool() {
        return null;
    }

    /* renamed from: l */
    public C57547m0 mo81303l() {
        ListAdapter adapter = getAdapter();
        boolean z = adapter instanceof C57547m0;
        Adapter adapter2 = null;
        if (!z && (adapter instanceof Adapter)) {
            C72898b bVar = this.f212471d;
            if (bVar != null) {
                adapter2 = bVar.f212472d;
            }
            if (C87412m.m108589b(adapter2, adapter)) {
                return this.f212471d;
            }
            C72898b bVar2 = new C72898b(adapter);
            this.f212471d = bVar2;
            return bVar2;
        } else if (z) {
            return (C57547m0) adapter;
        } else {
            return null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105918d("ChattingListView", "onLayout() start");
        long currentTimeMillis = System.currentTimeMillis();
        super.onLayout(z, i, i2, i3, i4);
        Log.m105919d("ChattingListView", "onLayout() end cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public boolean removeHeaderView(View view) {
        return super.removeHeaderView(view);
    }

    /* renamed from: s */
    public int mo81305s(int i, int i2) {
        return Math.max(i, i2 - getFirstVisiblePosition());
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
    }

    public final void setMCompatAdapter(C72898b bVar) {
        this.f212471d = bVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: w */
    public View mo81316w(int i, int i2) {
        return getChildAt(i - i2);
    }

    public void addFooterView(View view, Object obj, boolean z) {
        super.addFooterView(view, obj, z);
    }

    public void addHeaderView(View view, Object obj, boolean z) {
        super.addHeaderView(view, obj, z);
    }
}
