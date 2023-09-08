package com.tencent.p014mm.p136ui.anim.content;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import cj3.C67387c;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13604l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/content/AnimSizeFrameLayout;", "Landroid/widget/FrameLayout;", "Lcj3/c;", "d", "Lcj3/c;", "getSizeAnimController", "()Lcj3/c;", "sizeAnimController", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.anim.content.AnimSizeFrameLayout */
public final class AnimSizeFrameLayout extends FrameLayout {

    /* renamed from: d */
    public final C67387c f214691d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C67387c cVar = new C67387c(this);
        cVar.f193264c = true;
        this.f214691d = cVar;
    }

    public final C67387c getSizeAnimController() {
        return this.f214691d;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f214691d.mo91532d(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        C13604l<Integer, Integer> f = this.f214691d.mo91534f(i, i2);
        if (f != null) {
            setMeasuredDimension(((Number) f.f38555d).intValue(), ((Number) f.f38556e).intValue());
            return;
        }
        super.onMeasure(i, i2);
        C13604l<Integer, Integer> e = this.f214691d.mo91533e(i, i2);
        if (e != null) {
            setMeasuredDimension(((Number) e.f38555d).intValue(), ((Number) e.f38556e).intValue());
        }
    }
}
