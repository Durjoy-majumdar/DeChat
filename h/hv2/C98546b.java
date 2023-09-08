package hv2;

import com.tencent.p014mm.autogen.events.SnsAdBonusSlideEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.OverScrollLinearout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: hv2.b */
public class C98546b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f288991d;

    /* renamed from: e */
    public final /* synthetic */ int f288992e;

    /* renamed from: f */
    public final /* synthetic */ int f288993f;

    /* renamed from: g */
    public final /* synthetic */ int f288994g;

    public C98546b(OverScrollLinearout overScrollLinearout, int i, int i2, int i3, int i4) {
        this.f288991d = i;
        this.f288992e = i2;
        this.f288993f = i3;
        this.f288994g = i4;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout$1");
        Log.m105928w("OverScrollLinearout", "the onScrollChanged: l is " + this.f288991d + ", t is " + this.f288992e + ", old l is " + this.f288993f + ", oldt is " + this.f288994g);
        SnsAdBonusSlideEvent snsAdBonusSlideEvent = new SnsAdBonusSlideEvent();
        SnsAdBonusSlideEvent.C92565a aVar = snsAdBonusSlideEvent.f265108d;
        aVar.f265110b = this.f288991d;
        aVar.f265109a = this.f288992e;
        aVar.f265112d = this.f288993f;
        aVar.f265111c = this.f288994g;
        snsAdBonusSlideEvent.publish();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout$1");
    }
}
