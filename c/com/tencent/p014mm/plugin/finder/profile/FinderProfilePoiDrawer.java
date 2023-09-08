package com.tencent.p014mm.plugin.finder.profile;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawer;
import gy3.C87412m;
import ho1.C8637m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0016J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfilePoiDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "", "size", "Lrx3/b0;", "setTopPadding", "Lho1/m;", "z", "Lho1/m;", "getPoiListView", "()Lho1/m;", "setPoiListView", "(Lho1/m;)V", "poiListView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer */
public final class FinderProfilePoiDrawer extends RecyclerViewDrawer {

    /* renamed from: A */
    public static final /* synthetic */ int f16116A = 0;

    /* renamed from: z */
    public C8637m f16117z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfilePoiDrawer(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: g */
    public void mo3766g(boolean z, boolean z2, int i) {
        C8637m mVar;
        FTSSearchView fTSSearchView;
        FTSEditTextView ftsEditText;
        EditText editText;
        Editable text;
        super.mo3766g(z, z2, i);
        if (!z && (mVar = this.f16117z) != null && (fTSSearchView = mVar.f27780p) != null && (ftsEditText = fTSSearchView.getFtsEditText()) != null && (editText = ftsEditText.getEditText()) != null && (text = editText.getText()) != null) {
            text.clear();
        }
    }

    public final C8637m getPoiListView() {
        return this.f16117z;
    }

    public final void setPoiListView(C8637m mVar) {
        this.f16117z = mVar;
    }

    public final void setTopPadding(int i) {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        int dimensionPixelSize = (i >= 20 ? context.getResources().getDimensionPixelSize(C0966R.dimen.f3713c6) : context.getResources().getDimensionPixelSize(C0966R.dimen.f3761db)) + (context.getResources().getDimensionPixelSize(C0966R.dimen.f3705bx) * i);
        int i2 = C74783i3.m89537a(context).f24705b;
        int i3 = (int) (((float) i2) * 0.75f);
        if (dimensionPixelSize >= i3) {
            dimensionPixelSize = i3;
        }
        setTopOffset(i2 - dimensionPixelSize);
        setPadding(0, getTopOffset(), 0, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfilePoiDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfilePoiDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
