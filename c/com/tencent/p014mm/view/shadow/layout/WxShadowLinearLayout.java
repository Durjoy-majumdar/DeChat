package com.tencent.p014mm.view.shadow.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uq3.C78273a;
import vq3.C78466b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/view/shadow/layout/WxShadowLinearLayout;", "Landroid/widget/LinearLayout;", "Luq3/a;", "d", "Lrx3/g;", "getShadowHelper", "()Luq3/a;", "shadowHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.shadow.layout.WxShadowLinearLayout */
public final class WxShadowLinearLayout extends LinearLayout {

    /* renamed from: d */
    public final C13601g f220890d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WxShadowLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final C78273a getShadowHelper() {
        return (C78273a) ((C36570n) this.f220890d).getValue();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getShadowHelper().mo108296a(canvas);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxShadowLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f220890d = C36568h.m40985a(new C78466b(this));
        setWillNotDraw(false);
        getShadowHelper().mo108297b(context, attributeSet, i);
    }
}
