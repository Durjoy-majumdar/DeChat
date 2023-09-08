package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityRuntimeStateStruct;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84193f;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import rx3.C13598b0;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.g */
public final class C84196g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f245932d;

    /* renamed from: e */
    public final /* synthetic */ QualitySession f245933e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandInitConfigWC f245934f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84196g(int i, QualitySession qualitySession, AppBrandInitConfigWC appBrandInitConfigWC) {
        super(0);
        this.f245932d = i;
        this.f245933e = qualitySession;
        this.f245934f = appBrandInitConfigWC;
    }

    public Object invoke() {
        int i;
        LinkedList linkedList = new LinkedList();
        String[] strArr = C86709a0.f251722m;
        for (int i2 = 0; i2 < 5; i2++) {
            String str = MMApplicationContext.getPackageName() + strArr[i2];
            if (C87412m.m108589b(MMApplicationContext.getProcessName(), str)) {
                i = this.f245932d;
            } else if (MMApplicationContext.isProcessExist(str)) {
                IPCInteger iPCInteger = (IPCInteger) XIPCInvoker.m98749b(str, IPCVoid.f10316d, C84193f.C84194a.class);
                i = iPCInteger != null ? iPCInteger.f10313d : 0;
            } else {
                i = -1;
            }
            linkedList.addLast(Integer.valueOf(i));
        }
        WeAppQualityRuntimeStateStruct weAppQualityRuntimeStateStruct = new WeAppQualityRuntimeStateStruct();
        QualitySession qualitySession = this.f245933e;
        AppBrandInitConfigWC appBrandInitConfigWC = this.f245934f;
        int i3 = this.f245932d;
        weAppQualityRuntimeStateStruct.f237023d = weAppQualityRuntimeStateStruct.mo86045b("InstanceId", qualitySession.f245832d, true);
        weAppQualityRuntimeStateStruct.f237024e = weAppQualityRuntimeStateStruct.mo86045b("AppId", qualitySession.f245833e, true);
        weAppQualityRuntimeStateStruct.f237025f = (long) qualitySession.f245837i;
        int i4 = qualitySession.f245834f;
        weAppQualityRuntimeStateStruct.f237026g = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : WeAppQualityRuntimeStateStruct.C80772a.demo : WeAppQualityRuntimeStateStruct.C80772a.debug : WeAppQualityRuntimeStateStruct.C80772a.release;
        weAppQualityRuntimeStateStruct.f237027h = (long) qualitySession.f245835g;
        weAppQualityRuntimeStateStruct.f237028i = (long) qualitySession.f245836h;
        ArrayList arrayList = new ArrayList();
        for (Object next : linkedList) {
            if (((Number) next).intValue() >= 0) {
                arrayList.add(next);
            }
        }
        weAppQualityRuntimeStateStruct.f237029j = ((long) arrayList.size()) - (appBrandInitConfigWC.f239377h1 ? 1 : 0);
        weAppQualityRuntimeStateStruct.f237030k = (long) i3;
        weAppQualityRuntimeStateStruct.f237031l = weAppQualityRuntimeStateStruct.mo86045b("distribution", C90599h.m113512e(linkedList, "_"), true);
        StringBuilder sb = new StringBuilder();
        sb.append(MMApplicationContext.getPackageName());
        sb.append(":tools");
        weAppQualityRuntimeStateStruct.f237032m = MMApplicationContext.isProcessExist(sb.toString()) ? 1 : 0;
        weAppQualityRuntimeStateStruct.mo86054n();
        return C13598b0.f38549a;
    }
}
