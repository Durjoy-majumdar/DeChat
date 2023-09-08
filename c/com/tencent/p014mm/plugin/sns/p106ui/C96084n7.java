package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.n7 */
public final class C96084n7 implements View.OnTouchListener {

    /* renamed from: d */
    public float f280573d;

    /* renamed from: e */
    public float f280574e;

    /* renamed from: f */
    public boolean f280575f;

    /* renamed from: g */
    public final /* synthetic */ AbsSnsUploadSayFooter f280576g;

    /* renamed from: h */
    public final /* synthetic */ WrapScollview f280577h;

    /* renamed from: i */
    public final /* synthetic */ C96173q7 f280578i;

    public C96084n7(AbsSnsUploadSayFooter absSnsUploadSayFooter, WrapScollview wrapScollview, C96173q7 q7Var) {
        this.f280576g = absSnsUploadSayFooter;
        this.f280577h = wrapScollview;
        this.f280578i = q7Var;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUploadInputScrollHelper$setUpView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$1");
        C87412m.m108594g(view, "v");
        C87412m.m108594g(motionEvent, "event");
        if (view.getId() != C0966R.C0970id.jsy) {
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$1");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/SnsUploadInputScrollHelper$setUpView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        boolean z = this.f280576g.getVisibility() == 0;
        if (motionEvent.getAction() == 0) {
            motionEvent.getX();
            this.f280573d = motionEvent.getY();
            this.f280574e = 0.0f;
        } else if (motionEvent.getAction() == 2) {
            if (z) {
                this.f280577h.setCheckInterceptTouchEventByCheckArea(true);
                float y = this.f280574e + (motionEvent.getY() - this.f280573d);
                this.f280574e = y;
                if (Math.abs(y) >= 50.0f) {
                    C96173q7 q7Var = this.f280578i;
                    q7Var.getClass();
                    SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
                    Context context = q7Var.f280954a;
                    SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
                    SnsUploadUI snsUploadUI = context instanceof SnsUploadUI ? (SnsUploadUI) context : null;
                    if (snsUploadUI != null) {
                        snsUploadUI.mo133084W7();
                    }
                    this.f280575f = true;
                    this.f280574e = 0.0f;
                    z = false;
                }
            }
            if (!z) {
                this.f280577h.setCheckInterceptTouchEventByCheckArea(false);
            }
        } else if (motionEvent.getAction() == 1) {
            this.f280577h.setCheckInterceptTouchEventByCheckArea(false);
        }
        Log.m105919d(C96173q7.m123250c(this.f280578i), "onTouch: touch editText, isShowFooter:%b, event action = %d, etMoveDelta:%f", Boolean.valueOf(z), Integer.valueOf(motionEvent.getAction()), Float.valueOf(this.f280574e));
        boolean z2 = this.f280575f;
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$1");
        C117292a.m165362h(z2, this, "com/tencent/mm/plugin/sns/ui/SnsUploadInputScrollHelper$setUpView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z2;
    }
}
