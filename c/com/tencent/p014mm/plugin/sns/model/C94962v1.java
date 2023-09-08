package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import di3.C86312j;
import gy3.C87412m;
import hf3.C98448b;
import hf3.C98449c;
import if3.C98670a;
import ot2.C100435d;

/* renamed from: com.tencent.mm.plugin.sns.model.v1 */
public final class C94962v1 implements C98448b {

    /* renamed from: a */
    public final /* synthetic */ C94849d f275287a;

    /* renamed from: b */
    public final /* synthetic */ int f275288b;

    /* renamed from: c */
    public final /* synthetic */ int f275289c;

    public C94962v1(C94849d dVar, int i, int i2) {
        this.f275287a = dVar;
        this.f275288b = i;
        this.f275289c = i2;
    }

    /* renamed from: a */
    public void mo131296a(C98670a aVar) {
        C100435d b;
        Class cls = C98449c.class;
        SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$1");
        if (aVar != null) {
            long j = aVar.f289303c;
            Log.m105924i("MicroMsg.SnsTimeLineFakeViewHandler", "info workType >> " + aVar.f289301a + ", confirmRemuxTime: " + j + ", muxCode: " + aVar.f289306f);
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            boolean z = i > 0 && System.currentTimeMillis() - j > ApkDownloadManager.INTERVAL;
            boolean z2 = i > 0 && System.currentTimeMillis() - j > 600000;
            Log.m105924i("MicroMsg.SnsTimeLineFakeViewHandler", "time check: " + z + ", timeOut: " + z2);
            int i2 = aVar.f289306f;
            if (i2 == 0 && z) {
                Log.m105924i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> remux success");
                ((q2$$a) this.f275287a).mo131218a(false);
                ((C98449c) C86312j.m106911c(cls)).mo136675Q7(aVar.f289302b, aVar.f289303c, aVar.f289307g, aVar.f289306f);
                int i3 = this.f275288b;
                SnsMethodCalculate.markStartTimeMs("access$checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                SnsMethodCalculate.markStartTimeMs("checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                Log.m105924i("MicroMsg.SnsTimeLineFakeViewHandler", "checkToCommit");
                if (C86013q1.m106450k(aVar.f289304d) && aVar.f289308h != null) {
                    Log.m105924i("MicroMsg.SnsTimeLineFakeViewHandler", "go to commit");
                    C100435d dVar = new C100435d();
                    byte[] bArr = aVar.f289308h;
                    C87412m.m108591d(bArr);
                    C100435d d = dVar.mo139924d(i3, bArr);
                    if (!(d == null || (b = d.mo139922b(aVar.f289304d, aVar.f289305e)) == null)) {
                        b.mo139923c();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                SnsMethodCalculate.markEndTimeMs("access$checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$1");
                return;
            } else if (i2 != 1002 || !z) {
                if (z2) {
                    Log.m105924i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> isTimeOut");
                    ((C98449c) C86312j.m106911c(cls)).Fw0(this.f275288b, this.f275289c);
                }
                ((q2$$a) this.f275287a).mo131218a(z2);
            } else {
                Log.m105924i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> remux error");
                ((q2$$a) this.f275287a).mo131218a(true);
                ((C98449c) C86312j.m106911c(cls)).mo136675Q7(aVar.f289302b, aVar.f289303c, aVar.f289307g, aVar.f289306f);
                SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$1");
                return;
            }
        } else {
            Log.m105924i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> is null");
            ((q2$$a) this.f275287a).mo131218a(true);
        }
        SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$1");
    }
}
