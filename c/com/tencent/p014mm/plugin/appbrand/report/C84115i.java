package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.d55;
import te3.j55;

/* renamed from: com.tencent.mm.plugin.appbrand.report.i */
public class C84115i implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f245580d;

    public C84115i(LinkedList linkedList) {
        this.f245580d = linkedList;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105925i("MicroMsg.AppBrandIDKeyBatchReport", "reportToSvr, cgi back, errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            AppBrandIDKeyBatchReport.C84097b.f245530d = ((d55) cVar.f127056b.f127083a).f132137d;
            AppBrandIDKeyBatchReport.C84097b.m103641a(AppBrandIDKeyBatchReport.C84097b.f245530d);
        } else {
            Iterator it = this.f245580d.iterator();
            while (it.hasNext()) {
                AppBrandIDKeyBatchReport.C84097b.m103643c((j55) it.next());
            }
        }
        return 0;
    }
}
