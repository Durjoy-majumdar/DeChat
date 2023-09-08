package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\"B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderTouchLayout;", "Landroid/widget/FrameLayout;", "", "d", "F", "getLastX", "()F", "setLastX", "(F)V", "lastX", "", "e", "Z", "isInterceptDown", "()Z", "setInterceptDown", "(Z)V", "Lcom/tencent/mm/plugin/finder/view/FinderTouchLayout$a;", "f", "Lcom/tencent/mm/plugin/finder/view/FinderTouchLayout$a;", "getTouchListener", "()Lcom/tencent/mm/plugin/finder/view/FinderTouchLayout$a;", "setTouchListener", "(Lcom/tencent/mm/plugin/finder/view/FinderTouchLayout$a;)V", "touchListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderTouchLayout */
public final class FinderTouchLayout extends FrameLayout {

    /* renamed from: d */
    public float f162134d;

    /* renamed from: e */
    public boolean f162135e;

    /* renamed from: f */
    public C56569a f162136f;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderTouchLayout$a */
    public interface C56569a {
        /* renamed from: a */
        void mo77405a(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo77406b(MotionEvent motionEvent);

        /* renamed from: c */
        void mo77407c(float f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTouchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f162134d = motionEvent.getRawX();
            boolean b = getTouchListener().mo77406b(motionEvent);
            this.f162135e = b;
            if (b) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            if (this.f162135e) {
                getTouchListener().mo77405a(motionEvent);
                this.f162135e = false;
                return true;
            }
        } else if (this.f162135e) {
            getTouchListener().mo77407c(motionEvent.getRawX() - this.f162134d);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final float getLastX() {
        return this.f162134d;
    }

    public final C56569a getTouchListener() {
        C56569a aVar = this.f162136f;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("touchListener");
        throw null;
    }

    public final void setInterceptDown(boolean z) {
        this.f162135e = z;
    }

    public final void setLastX(float f) {
        this.f162134d = f;
    }

    public final void setTouchListener(C56569a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f162136f = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTouchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
