package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/ui/base/RequestDisallowScrollView;", "Landroid/widget/ScrollView;", "Lkotlin/Function0;", "", "d", "Lfy3/a;", "isNeedRequestDisallowInterceptTouchEvent", "()Lfy3/a;", "setNeedRequestDisallowInterceptTouchEvent", "(Lfy3/a;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.base.RequestDisallowScrollView */
public final class RequestDisallowScrollView extends ScrollView {

    /* renamed from: d */
    public C32224a<Boolean> f24208d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestDisallowScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C32224a<Boolean> aVar = this.f24208d;
            if (aVar != null && aVar.invoke().booleanValue()) {
                z = true;
            }
            if (z) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setNeedRequestDisallowInterceptTouchEvent(C32224a<Boolean> aVar) {
        this.f24208d = aVar;
    }
}
