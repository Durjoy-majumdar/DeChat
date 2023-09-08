package com.tencent.p014mm.p136ui.magicemoji.core;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/ui/magicemoji/core/MEHolderView;", "Landroid/widget/FrameLayout;", "Landroid/graphics/RectF;", "rect", "Lrx3/b0;", "setBoundingBox", "Lkotlin/Function0;", "e", "Lfy3/a;", "getClickHandler", "()Lfy3/a;", "setClickHandler", "(Lfy3/a;)V", "clickHandler", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.magicemoji.core.MEHolderView */
public final class MEHolderView extends FrameLayout {

    /* renamed from: f */
    public static final RectF f250187f = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: d */
    public RectF f250188d = f250187f;

    /* renamed from: e */
    public C32224a<C13598b0> f250189e = C30860a.f82888d;

    /* renamed from: com.tencent.mm.ui.magicemoji.core.MEHolderView$a */
    public static final class C30860a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C30860a f82888d = new C30860a();

        public C30860a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public final C32224a<C13598b0> getClickHandler() {
        return this.f250189e;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (C87412m.m108589b(this.f250188d, f250187f)) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
            } else if (!this.f250188d.contains(x, y)) {
                return false;
            } else {
                this.f250189e.invoke();
                return true;
            }
        }
        return this.f250188d.contains(x, y);
    }

    public final void setBoundingBox(RectF rectF) {
        C87412m.m108594g(rectF, "rect");
        this.f250188d = rectF;
    }

    public final void setClickHandler(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f250189e = aVar;
    }
}
