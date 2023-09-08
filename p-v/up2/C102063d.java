package up2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44668u3;
import f40.C86709a0;
import f62.C75700k0;
import or2.C100386c;
import qo3.C77407n;
import up2.C102064e;

/* renamed from: up2.d */
public class C102063d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f300555d;

    /* renamed from: e */
    public final /* synthetic */ AdClickActionInfo f300556e;

    /* renamed from: f */
    public final /* synthetic */ SnsInfo f300557f;

    /* renamed from: g */
    public final /* synthetic */ int f300558g;

    /* renamed from: h */
    public final /* synthetic */ C102064e f300559h;

    public C102063d(C102064e eVar, Context context, AdClickActionInfo adClickActionInfo, SnsInfo snsInfo, int i) {
        this.f300559h = eVar;
        this.f300555d = context;
        this.f300556e = adClickActionInfo;
        this.f300557f = snsInfo;
        this.f300558g = i;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$1");
        try {
            if (this.f300555d != null) {
                C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                C77407n nVar = new C77407n(this.f300555d, true, 0);
                C100386c cVar = new C100386c();
                Context context = this.f300555d;
                AdClickActionInfo adClickActionInfo = this.f300556e;
                SnsInfo snsInfo = this.f300557f;
                int i = this.f300558g;
                C102064e eVar = this.f300559h;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                C102064e.C102068b bVar = eVar.f300569j;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                nVar.mo107569n(cVar.mo139672a(context, adClickActionInfo, nVar, snsInfo, i, bVar, Ni), true);
                nVar.mo107559d(true);
                nVar.mo107573q();
            }
        } catch (Throwable th) {
            Log.m105920e("AdClickActionHandler", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$1");
    }
}
