package vr2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import lo2.C99552l;
import rq2.C63505q;
import vr2.C102240d;
import wr2.C102485d;
import wr2.C102489e;

/* renamed from: vr2.s */
public class C102265s implements C44580q1 {

    /* renamed from: a */
    public final /* synthetic */ int f301187a;

    /* renamed from: b */
    public final /* synthetic */ String f301188b;

    /* renamed from: c */
    public final /* synthetic */ String f301189c;

    /* renamed from: d */
    public final /* synthetic */ String f301190d;

    /* renamed from: e */
    public final /* synthetic */ C102239c f301191e;

    /* renamed from: f */
    public final /* synthetic */ String f301192f;

    /* renamed from: g */
    public final /* synthetic */ SnsInfo f301193g;

    public C102265s(int i, String str, String str2, String str3, C102239c cVar, String str4, SnsInfo snsInfo) {
        this.f301187a = i;
        this.f301188b = str;
        this.f301189c = str2;
        this.f301190d = str3;
        this.f301191e = cVar;
        this.f301192f = str4;
        this.f301193g = snsInfo;
    }

    /* renamed from: a */
    public void mo1579a(boolean z, boolean z2) {
        C102489e eVar;
        SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$3");
        if (z) {
            if (this.f301187a != 2) {
                C102260r.m134859a0(this.f301188b, this.f301189c, this.f301190d, 2, "0");
                C102239c cVar = this.f301191e;
                ArrayList<Integer> arrayList = C99552l.f291829a;
                SnsMethodCalculate.markStartTimeMs("reportAppMarketDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    C102240d.C102242b bVar = new C102240d.C102242b();
                    bVar.mo141803k(4001002);
                    bVar.mo141805m(cVar.f301049a);
                    bVar.mo141795c(cVar.f301052d);
                    bVar.mo141806n(cVar.f301053e);
                    bVar.mo141804l(cVar.f301054f);
                    bVar.mo141807o(cVar.f301055g);
                    bVar.mo141801i(1);
                    C63505q.m74843b(bVar.mo141793a());
                } catch (Throwable th) {
                    Log.m105920e("AdConversionOnlineReportHelper", "reportAppMarketDialogConfirm, exp is " + th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("reportAppMarketDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
            C99552l.m129929e(this.f301191e, 1);
            String str = this.f301192f;
            String str2 = this.f301188b;
            String str3 = this.f301189c;
            String str4 = this.f301190d;
            SnsInfo snsInfo = this.f301193g;
            SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            try {
                eVar = new C102489e(str, str2, str3, str4, snsInfo, true);
                SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            } catch (Throwable unused) {
                eVar = null;
                SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            }
            if (eVar != null) {
                C102485d.m135281i(eVar);
            }
        } else if (this.f301187a != 2) {
            C102260r.m134859a0(this.f301188b, this.f301189c, this.f301190d, 2, "2");
        }
        SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$3");
    }
}
