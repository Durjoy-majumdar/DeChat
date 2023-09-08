package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.ui.o1 */
public class C96096o1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ MaskLinearLayout f280661d;

    public C96096o1(MaskLinearLayout maskLinearLayout) {
        this.f280661d = maskLinearLayout;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/MaskLinearLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$2");
        Log.m105920e(APMidasPayAPI.ENV_TEST, "touch: " + motionEvent.getAction());
        MaskLinearLayout maskLinearLayout = this.f280661d;
        int i = MaskLinearLayout.f276965h;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        boolean z = maskLinearLayout.f276968f;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$2");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/MaskLinearLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            MaskLinearLayout.m121556a(this.f280661d);
            view.invalidate();
            MaskLinearLayout maskLinearLayout2 = this.f280661d;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            MMHandler mMHandler = maskLinearLayout2.f276966d;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            MaskLinearLayout maskLinearLayout3 = this.f280661d;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            Runnable runnable = maskLinearLayout3.f276967e;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            mMHandler.removeCallbacks(runnable);
        } else if (action == 1 || action == 3) {
            MaskLinearLayout maskLinearLayout4 = this.f280661d;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            MMHandler mMHandler2 = maskLinearLayout4.f276966d;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            MaskLinearLayout maskLinearLayout5 = this.f280661d;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            Runnable runnable2 = maskLinearLayout5.f276967e;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            mMHandler2.post(runnable2);
        }
        MaskLinearLayout maskLinearLayout6 = this.f280661d;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        List<MaskImageView> list = maskLinearLayout6.f276969g;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        if (list != null) {
            MaskLinearLayout maskLinearLayout7 = this.f280661d;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            List<MaskImageView> list2 = maskLinearLayout7.f276969g;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            for (MaskImageView next : list2) {
                next.mo132229q(next, motionEvent);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$2");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/MaskLinearLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
