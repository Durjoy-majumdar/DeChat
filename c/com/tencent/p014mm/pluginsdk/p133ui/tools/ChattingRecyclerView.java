package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0016\u0010\u0016\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003H\u0016R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/tencent/mm/pluginsdk/ui/tools/n0;", "", "resID", "Lrx3/b0;", "setSelector", "color", "setCacheColorHint", "Landroid/graphics/drawable/Drawable;", "divider", "setDivider", "getLastVisiblePosition", "getHeaderViewsCount", "getFirstCompletelyVisiblePosition", "getFirstVisiblePosition", "getCount", "Landroid/widget/AbsListView$OnScrollListener;", "l", "setOnScrollListener", "Landroidx/recyclerview/widget/RecyclerView$e;", "adapter", "setAdapter", "getFooterViewsCount", "position", "setSelection", "mode", "setTranscriptMode", "visibility", "setVisibility", "Landroid/util/SparseArray;", "Landroid/view/View;", "y1", "Landroid/util/SparseArray;", "getHeaderViews", "()Landroid/util/SparseArray;", "headerViews", "z1", "getFooterViews", "footerViews", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.ChattingRecyclerView */
public class ChattingRecyclerView extends RecyclerView implements C72917n0 {

    /* renamed from: y1 */
    public final SparseArray<View> f164785y1 = new SparseArray<>();

    /* renamed from: z1 */
    public final SparseArray<View> f164786z1 = new SparseArray<>();

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.ChattingRecyclerView$a */
    public static final class C6683a extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView$setOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView$setOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView$setOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView$setOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChattingRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: B */
    public View mo81288B(int i) {
        Log.m105918d("ChattingRecyclerView", "getItemViewByIntervalPosition() called with: interval = " + i + " first:" + getFirstVisiblePosition() + " finalPos:" + i);
        RecyclerView.C16631z I0 = mo17023I0(i);
        if (I0 != null) {
            return I0.f44854d;
        }
        return null;
    }

    /* renamed from: D */
    public ViewGroup mo81289D() {
        return this;
    }

    /* renamed from: E */
    public void mo81290E(C57547m0 m0Var) {
        setAdapter(m0Var instanceof RecyclerView.C16613e ? (RecyclerView.C16613e) m0Var : null);
    }

    /* renamed from: N */
    public <T extends View> T mo81291N(int i) {
        SparseArray<View> sparseArray = this.f164785y1;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.keyAt(i2);
            T findViewById = sparseArray.valueAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        SparseArray<View> sparseArray2 = this.f164786z1;
        int size2 = sparseArray2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            sparseArray2.keyAt(i3);
            T findViewById2 = sparseArray2.valueAt(i3).findViewById(i);
            if (findViewById2 != null) {
                return findViewById2;
            }
        }
        return findViewById(i);
    }

    public void addFooterView(View view) {
        if (view != null) {
            SparseArray<View> sparseArray = this.f164786z1;
            sparseArray.put(sparseArray.size() + 200000, view);
        }
    }

    public void addHeaderView(View view) {
        if (view != null) {
            SparseArray<View> sparseArray = this.f164785y1;
            sparseArray.put(sparseArray.size() + 100000, view);
        }
        RecyclerView.C16613e adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public void mo17043c(RecyclerView.C0130p pVar) {
        C87412m.m108594g(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        mo17098m1(pVar);
        super.mo17043c(pVar);
    }

    public int getCount() {
        RecyclerView.C16613e adapter = getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int getFirstCompletelyVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        try {
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).mo17004z();
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public int getFirstVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        try {
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).mo16957C();
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final SparseArray<View> getFooterViews() {
        return this.f164786z1;
    }

    public int getFooterViewsCount() {
        RecyclerView.C16613e adapter = getAdapter();
        C57548r rVar = adapter instanceof C57548r ? (C57548r) adapter : null;
        if (rVar != null) {
            return rVar.f164790e.size();
        }
        return 0;
    }

    public final SparseArray<View> getHeaderViews() {
        return this.f164785y1;
    }

    public int getHeaderViewsCount() {
        RecyclerView.C16613e adapter = getAdapter();
        C57548r rVar = adapter instanceof C57548r ? (C57548r) adapter : null;
        if (rVar != null) {
            return rVar.mo81318G4();
        }
        return 0;
    }

    public int getLastVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        try {
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).mo16959E();
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public int getPositionForView(View view) {
        return -1;
    }

    /* renamed from: l */
    public C57547m0 mo81303l() {
        RecyclerView.C16613e adapter = super.getAdapter();
        if (adapter instanceof C57547m0) {
            return (C57547m0) adapter;
        }
        return null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105918d("ChattingRecyclerView", "onLayout() start");
        long currentTimeMillis = System.currentTimeMillis();
        super.onLayout(z, i, i2, i3, i4);
        Log.m105919d("ChattingRecyclerView", "onLayout() end cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public boolean removeHeaderView(View view) {
        SparseArray sparseArray = new SparseArray();
        SparseArray<View> sparseArray2 = this.f164785y1;
        int size = sparseArray2.size();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray2.keyAt(i2);
            View valueAt = sparseArray2.valueAt(i2);
            if (C87412m.m108589b(valueAt, view)) {
                z = true;
            } else {
                sparseArray.put(sparseArray.size() + 100000, valueAt);
            }
        }
        if (!z) {
            return false;
        }
        this.f164785y1.clear();
        SparseArray<View> sparseArray3 = this.f164785y1;
        C87412m.m108594g(sparseArray3, "<this>");
        int size2 = sparseArray.size();
        if (size2 > 0) {
            while (true) {
                int i3 = i + 1;
                sparseArray3.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
                if (i3 >= size2) {
                    break;
                }
                i = i3;
            }
        }
        RecyclerView.C16613e adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return true;
    }

    /* renamed from: s */
    public int mo81305s(int i, int i2) {
        return i2;
    }

    public void setAdapter(RecyclerView.C16613e<?> eVar) {
        SparseArray<View> sparseArray = this.f164785y1;
        SparseArray<View> sparseArray2 = this.f164786z1;
        if (!(eVar == null || sparseArray == null || sparseArray2 == null || (eVar instanceof C57548r) || !(eVar instanceof C57547m0))) {
            eVar = new C57548r(sparseArray, sparseArray2, eVar, (C57547m0) eVar);
        }
        super.setAdapter(eVar);
    }

    public void setCacheColorHint(int i) {
    }

    public void setDivider(Drawable drawable) {
    }

    public void setItemChecked(int i, boolean z) {
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        super.setOnScrollListener(new C6683a());
    }

    public void setSelection(int i) {
    }

    public void setSelectionFromTop(int i, int i2) {
        Log.m105918d("ChattingRecyclerView", "setSelectionFromTop() called with: position = " + i + ", y = " + i2 + ", stack=" + Util.getStack());
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            aVar.mo10233c(Integer.valueOf(i));
            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
            C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }

    public void setSelector(int i) {
    }

    public void setTranscriptMode(int i) {
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void smoothScrollToPositionFromTop(int i, int i2, int i3) {
        Log.m105918d("ChattingRecyclerView", "smoothScrollToPositionFromTop() called with: position = " + i + " stack = " + Util.getStack());
        mo17149t1(i);
    }

    /* renamed from: w */
    public View mo81316w(int i, int i2) {
        RecyclerView.C16631z I0 = mo17023I0(i);
        if (I0 != null) {
            return I0.f44854d;
        }
        return null;
    }
}
