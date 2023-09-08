package gv2;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdLandingPageFloatView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gv2.h */
public class C98233h implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SnsAdLandingPageFloatView f288014d;

    public C98233h(SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        this.f288014d = snsAdLandingPageFloatView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$6");
        Rect rect = new Rect(SnsAdLandingPageFloatView.m123459d(this.f288014d).mo131855p().getLeft(), SnsAdLandingPageFloatView.m123459d(this.f288014d).mo131855p().getTop(), SnsAdLandingPageFloatView.m123459d(this.f288014d).mo131855p().getRight(), SnsAdLandingPageFloatView.m123459d(this.f288014d).mo131855p().getBottom());
        Log.m105925i("MicroMsg.SnsAdLandingPageFloatView", "view area %s, (%f,%f)", rect, Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (motionEvent.getActionMasked() == 1) {
                SnsAdLandingPageFloatView snsAdLandingPageFloatView = this.f288014d;
                snsAdLandingPageFloatView.getClass();
                SnsMethodCalculate.markStartTimeMs("playExitAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                if (!snsAdLandingPageFloatView.f281479n) {
                    snsAdLandingPageFloatView.f281483r.start();
                    snsAdLandingPageFloatView.f281479n = true;
                }
                SnsMethodCalculate.markEndTimeMs("playExitAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            }
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$6");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$6");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
