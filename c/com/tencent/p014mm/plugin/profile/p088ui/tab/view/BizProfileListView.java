package com.tencent.p014mm.plugin.profile.p088ui.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import kotlin.Metadata;
import p849e3.C107198j;
import p849e3.C107200l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileListView;", "Landroid/widget/ListView;", "Le3/j;", "", "enabled", "Lrx3/b0;", "setNestedScrollingEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileListView */
public final class BizProfileListView extends ListView implements C107198j {

    /* renamed from: d */
    public final C107200l f315277d = new C107200l(this);

    public BizProfileListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setNestedScrollingEnabled(true);
    }

    /* renamed from: L */
    public void mo17026L(int i) {
        this.f315277d.mo157674k(i);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f315277d.mo157664a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f315277d.mo157665b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f315277d.mo157666c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f315277d.mo157668e(i, i2, i3, i4, iArr);
    }

    public boolean hasNestedScrollingParent() {
        return this.f315277d.mo157671h(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f315277d.f320803d;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f315277d.mo157672i(z);
    }

    public boolean startNestedScroll(int i) {
        return this.f315277d.mo157673j(i, 0);
    }

    public void stopNestedScroll() {
        this.f315277d.mo157674k(0);
    }

    public BizProfileListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setNestedScrollingEnabled(true);
    }
}
