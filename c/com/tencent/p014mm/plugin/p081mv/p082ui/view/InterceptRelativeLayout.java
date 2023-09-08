package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import fy3.C32226l;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R2\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/InterceptRelativeLayout;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "d", "Lfy3/l;", "getBeforeDispatchTouchEvent", "()Lfy3/l;", "setBeforeDispatchTouchEvent", "(Lfy3/l;)V", "beforeDispatchTouchEvent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.InterceptRelativeLayout */
public final class InterceptRelativeLayout extends RelativeLayout {

    /* renamed from: d */
    public C32226l<? super MotionEvent, Boolean> f20049d;

    public InterceptRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final C32226l<MotionEvent, Boolean> getBeforeDispatchTouchEvent() {
        return this.f20049d;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C32226l<? super MotionEvent, Boolean> lVar = this.f20049d;
        if (lVar != null) {
            return lVar.invoke(motionEvent).booleanValue();
        }
        return false;
    }

    public final void setBeforeDispatchTouchEvent(C32226l<? super MotionEvent, Boolean> lVar) {
        this.f20049d = lVar;
    }

    public InterceptRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
