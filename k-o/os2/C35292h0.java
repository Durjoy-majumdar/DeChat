package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38653r8;
import te3.C51263sl2;
import te3.l74;
import zh3.C91753f;

/* renamed from: os2.h0 */
public class C35292h0 extends MAutoStorage<C35291g0> {

    /* renamed from: e */
    public static final String[] f94551e = {MAutoStorage.getCreateSQLs(C35291g0.f94549w, "SnsReportKv")};

    /* renamed from: d */
    public C91753f f94552d;

    public C35292h0(C91753f fVar) {
        super(fVar, C35291g0.f94549w, "SnsReportKv", C38653r8.f103538j);
        this.f94552d = fVar;
    }

    /* renamed from: Lo */
    public final int mo60189Lo(l74 l74, int i) {
        SnsMethodCalculate.markStartTimeMs("addKvImpl", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        try {
            byte[] byteArray = l74.toByteArray();
            C35291g0 g0Var = new C35291g0();
            g0Var.field_value = byteArray;
            g0Var.field_logtime = System.currentTimeMillis();
            g0Var.field_logsize = i;
            g0Var.field_offset = 0;
            int q = (int) this.f94552d.mo125627q("SnsReportKv", "", g0Var.convertTo(), false);
            Log.m105918d("MicroMsg.SnsKvReportStg", "SnsKvReport Insert result " + q);
            SnsMethodCalculate.markEndTimeMs("addKvImpl", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
            return q;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("addKvImpl", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
            return 0;
        }
    }

    /* renamed from: jo */
    public int mo60190jo(l74 l74) {
        SnsMethodCalculate.markStartTimeMs("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        l74 l742 = new l74();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < l74.f137242d.size(); i3++) {
            C51263sl2 sl22 = l74.f137242d.get(i3);
            byte[] bArr = sl22.f141589e.f257327a;
            if (bArr.length + i > 51200) {
                mo60189Lo(l742, i);
                i2++;
                l742.f137242d.clear();
                i = 0;
            } else {
                i += bArr.length;
                l742.f137242d.add(sl22);
            }
        }
        if (l742.f137242d.size() > 0) {
            i2++;
            mo60189Lo(l742, i);
        }
        SnsMethodCalculate.markEndTimeMs("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        return i2;
    }
}
