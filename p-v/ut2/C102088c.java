package ut2;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.appcompat.app.AppCompatActivity;
import b14.C54392a;
import b14.C54393b;
import b14.C54394c;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eu3.C58834h;
import eu3.C97749e;
import gy3.C87412m;

/* renamed from: ut2.c */
public final class C102088c extends C102084a {

    /* renamed from: d */
    public final HandlerThread f300618d;

    /* renamed from: e */
    public final Handler f300619e;

    /* renamed from: f */
    public final C54393b f300620f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102088c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("Sns-Dispatch", -2);
        this.f300618d = a;
        a.start();
        Handler handler = new Handler(a.getLooper());
        this.f300619e = handler;
        int i2 = C54394c.f152601a;
        this.f300620f = new C54392a(handler, (String) null, false);
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveDispatchUIC");
        super.onDestroy();
        this.f300619e.removeCallbacksAndMessages((Object) null);
        this.f300618d.quitSafely();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveDispatchUIC");
    }
}
