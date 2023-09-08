package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import kotlin.Metadata;
import nj3.C76872c1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB%\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/ui/base/MMHorizontalScrollView;", "Landroid/widget/HorizontalScrollView;", "Lnj3/c1;", "d", "Lnj3/c1;", "getOnScrollListener", "()Lnj3/c1;", "setOnScrollListener", "(Lnj3/c1;)V", "onScrollListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.base.MMHorizontalScrollView */
public final class MMHorizontalScrollView extends HorizontalScrollView {

    /* renamed from: d */
    public C76872c1 f214816d;

    public MMHorizontalScrollView(Context context) {
        super(context);
    }

    public final C76872c1 getOnScrollListener() {
        return this.f214816d;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C76872c1 c1Var = this.f214816d;
        if (c1Var != null) {
            c1Var.onScrollChange(this, i, i2, i3, i4);
        }
    }

    public final void setOnScrollListener(C76872c1 c1Var) {
        this.f214816d = c1Var;
    }

    public MMHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MMHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
