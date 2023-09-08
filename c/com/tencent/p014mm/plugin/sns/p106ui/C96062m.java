package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.m */
public class C96062m implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ AsyncMaskImageView f280479d;

    public C96062m(AsyncMaskImageView asyncMaskImageView) {
        this.f280479d = asyncMaskImageView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/AsyncMaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$2");
        AsyncMaskImageView asyncMaskImageView = this.f280479d;
        int i = AsyncMaskImageView.f276665h;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        boolean z = asyncMaskImageView.f276669g;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        boolean z2 = false;
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$2");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/AsyncMaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        AsyncMaskImageView asyncMaskImageView2 = this.f280479d;
        asyncMaskImageView2.getClass();
        SnsMethodCalculate.markStartTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            asyncMaskImageView2.f276666d.removeCallbacks(asyncMaskImageView2.f276667e);
        } else if (action == 1 || action == 3) {
            asyncMaskImageView2.f276666d.post(asyncMaskImageView2.f276667e);
        }
        if (!asyncMaskImageView2.isClickable() && !asyncMaskImageView2.isLongClickable()) {
            z2 = true;
        }
        SnsMethodCalculate.markEndTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$2");
        C117292a.m165362h(z2, this, "com/tencent/mm/plugin/sns/ui/AsyncMaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z2;
    }
}
