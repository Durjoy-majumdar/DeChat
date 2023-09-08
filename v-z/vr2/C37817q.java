package vr2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import zt3.C119157j;

/* renamed from: vr2.q */
public final class C37817q {

    /* renamed from: vr2.q$a */
    public class C37818a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f100149d;

        /* renamed from: e */
        public final /* synthetic */ String f100150e;

        /* renamed from: f */
        public final /* synthetic */ int f100151f;

        /* renamed from: g */
        public final /* synthetic */ int f100152g;

        /* renamed from: h */
        public final /* synthetic */ String f100153h;

        public C37818a(String str, String str2, int i, int i2, String str3) {
            this.f100149d = str;
            this.f100150e = str2;
            this.f100151f = i;
            this.f100152g = i2;
            this.f100153h = str3;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil$1");
            C37817q.m41545a(this.f100149d, this.f100150e, this.f100151f, this.f100152g, this.f100153h);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil$1");
        }
    }

    /* renamed from: a */
    public static void m41545a(String str, String str2, int i, int i2, String str3) {
        SnsMethodCalculate.markStartTimeMs("adTecReport", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
        try {
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("adTecReport", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
                return;
            }
            String nullAs = Util.nullAs(str2, "");
            String nullAs2 = Util.nullAs(str3, "");
            Log.m105924i("SnsAdTecReportUtil", "adTecReport, actName=" + str + ", actValue=" + nullAs + ", subType=" + i + ", subValue=" + i2 + ", extra=" + nullAs2);
            C115669n.INSTANCE.mo160131h(19789, str, nullAs, Integer.valueOf(i), Integer.valueOf(i2), nullAs2);
            SnsMethodCalculate.markEndTimeMs("adTecReport", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
        } catch (Throwable th) {
            Log.m105920e("SnsAdTecReportUtil", "adTecReport exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static void m41546b(String str, String str2, int i, int i2, String str3) {
        SnsMethodCalculate.markStartTimeMs("adTecReportOnSubThread", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
        ((C119157j) C119157j.f356862d).mo183884o(new C37818a(str, str2, i, i2, str3));
        SnsMethodCalculate.markEndTimeMs("adTecReportOnSubThread", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
    }
}
