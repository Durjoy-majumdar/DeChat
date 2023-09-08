package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.f8 */
public class C95785f8 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SnsWsFoldDetailUI f279446d;

    public C95785f8(SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f279446d = snsWsFoldDetailUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$2");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            SnsWsFoldDetailUI snsWsFoldDetailUI = this.f279446d;
            int i = SnsWsFoldDetailUI.f279030C;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            BaseTimeLine baseTimeLine = snsWsFoldDetailUI.f279037h;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            baseTimeLine.mo132087i();
            SnsWsFoldDetailUI snsWsFoldDetailUI2 = this.f279446d;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            BaseTimeLine baseTimeLine2 = snsWsFoldDetailUI2.f279037h;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            baseTimeLine2.f276710t.mo133679d();
        } else if (actionMasked == 1) {
            this.f279446d.mo132950a1();
        }
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$2");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
