package com.tencent.p014mm.plugin.appbrand.report.model;

import com.tencent.p014mm.plugin.appbrand.report.C68632h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hr0.C87584b;
import p206nj.C117627q;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.r */
public class C84171r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Object[] f245782d;

    public C84171r(C84172s sVar, Object[] objArr) {
        this.f245782d = objArr;
    }

    public void run() {
        C87584b bVar = (C87584b) C89909e.m112439d(C87584b.class, true);
        if (bVar == null) {
            Log.m105920e("MicroMsg.AppBrand.Report.kv_14992", "report get null kvReporter");
            return;
        }
        try {
            String str = (String) this.f245782d[18];
            if (!Util.isNullOrNil(str)) {
                int indexOf = str.indexOf(63);
                this.f245782d[18] = indexOf < 0 ? "" : C117627q.m165908a(str.substring(indexOf + 1, str.length()));
            }
        } catch (Exception unused) {
            this.f245782d[18] = "";
        }
        bVar.mo121691h(14992, C68632h0.m80873a(this.f245782d));
        bVar.mo121692i();
    }
}
