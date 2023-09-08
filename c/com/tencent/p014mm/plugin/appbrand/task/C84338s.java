package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandBackgroundMemoryReportStruct;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import lu3.C109426i;
import sx3.C110818d0;
import sx3.C36907w;

/* renamed from: com.tencent.mm.plugin.appbrand.task.s */
public final class C84338s implements C109426i {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProcessesManager f246250d;

    /* renamed from: e */
    public final /* synthetic */ int f246251e;

    /* renamed from: f */
    public final /* synthetic */ int f246252f;

    public C84338s(AppBrandProcessesManager appBrandProcessesManager, int i, int i2) {
        this.f246250d = appBrandProcessesManager;
        this.f246251e = i;
        this.f246252f = i2;
    }

    public String getKey() {
        return "";
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        AppBrandBackgroundMemoryReportStruct appBrandBackgroundMemoryReportStruct = new AppBrandBackgroundMemoryReportStruct();
        AppBrandProcessesManager appBrandProcessesManager = this.f246250d;
        AppBrandProcessesManager.C84268b bVar = AppBrandProcessesManager.f246131g;
        List<C84310k> j = appBrandProcessesManager.mo111395j();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(j, 10));
        for (C84310k e : j) {
            arrayList.add(Integer.valueOf(((ArrayList) e.mo111360e()).size()));
        }
        int q0 = C110818d0.m150945q0(arrayList);
        appBrandBackgroundMemoryReportStruct.f236333d = this.f246251e;
        appBrandBackgroundMemoryReportStruct.f236334e = C84566n2.m104161j() ? 1 : 0;
        appBrandBackgroundMemoryReportStruct.f236335f = q0 != 0 ? 1 : 0;
        appBrandBackgroundMemoryReportStruct.f236336g = q0;
        appBrandBackgroundMemoryReportStruct.f236337h = this.f246252f;
        Log.m105918d("MicroMsg.AppBrandProcessesManager", "report memory: " + appBrandBackgroundMemoryReportStruct.mo1006q());
        appBrandBackgroundMemoryReportStruct.mo86054n();
    }
}
