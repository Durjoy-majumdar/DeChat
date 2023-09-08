package com.tencent.p014mm.p136ui.tools;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.tools.c0 */
public class C7006c0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ MTimerHandler f24744d;

    public C7006c0(CropImageNewUI cropImageNewUI, MTimerHandler mTimerHandler) {
        this.f24744d = mTimerHandler;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/CropImageNewUI$18", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f24744d.startTimer(200);
        } else if (action == 1) {
            this.f24744d.stopTimer();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/tools/CropImageNewUI$18", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
