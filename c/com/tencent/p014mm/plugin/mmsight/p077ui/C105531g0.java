package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.g0 */
public class C105531g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f313929d;

    public C105531g0(SightCaptureUI sightCaptureUI) {
        this.f313929d = sightCaptureUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SightCaptureUI sightCaptureUI = this.f313929d;
        int i = SightCaptureUI.f313821i1;
        int i2 = sightCaptureUI.f313866g;
        boolean z = true;
        if (!(i2 == 4 || i2 == 3 || i2 == 1 || i2 == 8 || i2 == 9)) {
            z = false;
        }
        if (!z) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        sightCaptureUI.finish();
        this.f313929d.overridePendingTransition(-1, C0966R.C0968anim.f2493eh);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
