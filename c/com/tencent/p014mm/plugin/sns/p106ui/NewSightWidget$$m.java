package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$m */
public class NewSightWidget$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewSightWidget f277101d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$m$a */
    public class C95352a implements DialogInterface.OnCancelListener {
        public C95352a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.NewSightWidget$7$1");
            NewSightWidget newSightWidget = NewSightWidget$$m.this.f277101d;
            newSightWidget.f277032V = null;
            NewSightWidget.m121574k(newSightWidget, false);
            NewSightWidget newSightWidget2 = NewSightWidget$$m.this.f277101d;
            SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            Runnable runnable = newSightWidget2.f277060m0;
            SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            MMHandlerThread.removeRunnable(runnable);
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.NewSightWidget$7$1");
        }
    }

    public NewSightWidget$$m(NewSightWidget newSightWidget) {
        this.f277101d = newSightWidget;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$7");
        Log.m105924i("MicroMsg.SightWidget", "showProgress");
        NewSightWidget newSightWidget = this.f277101d;
        C89779i0 Q = C76879j.m92723Q(NewSightWidget.m121576m(newSightWidget), NewSightWidget.m121576m(this.f277101d).getString(C0966R.string.a3h), NewSightWidget.m121576m(this.f277101d).getString(C0966R.string.jhe), false, false, new C95352a());
        SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        newSightWidget.f277034X = Q;
        SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$7");
    }
}
