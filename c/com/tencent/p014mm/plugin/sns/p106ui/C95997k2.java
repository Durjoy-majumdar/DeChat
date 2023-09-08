package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.k2 */
public class C95997k2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SightVideoFullScreenView f280325d;

    public C95997k2(SightVideoFullScreenView sightVideoFullScreenView) {
        this.f280325d = sightVideoFullScreenView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$6");
        try {
            SightVideoFullScreenView.m121758f(this.f280325d, true);
            if (SightVideoFullScreenView.m121754b(this.f280325d).mo132290h()) {
                SightVideoFullScreenView sightVideoFullScreenView = this.f280325d;
                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView.mo132482z();
                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            } else {
                SightVideoFullScreenView sightVideoFullScreenView2 = this.f280325d;
                SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                boolean z = sightVideoFullScreenView2.f277418G;
                SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                if (z) {
                    this.f280325d.mo132456l();
                } else {
                    this.f280325d.mo132480x();
                }
                this.f280325d.mo132452A();
            }
            SightVideoFullScreenView sightVideoFullScreenView3 = this.f280325d;
            SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            boolean z2 = sightVideoFullScreenView3.f277454z;
            SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            if (z2) {
                SightVideoFullScreenView sightVideoFullScreenView4 = this.f280325d;
                SnsMethodCalculate.markStartTimeMs("access$2308", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView4.f277426P++;
                SnsMethodCalculate.markEndTimeMs("access$2308", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            }
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$6");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
