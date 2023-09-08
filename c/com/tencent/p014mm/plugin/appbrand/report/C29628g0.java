package com.tencent.p014mm.plugin.appbrand.report;

import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.report.model.WeAppQualityRequestOrientationStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr0.C86119n;

/* renamed from: com.tencent.mm.plugin.appbrand.report.g0 */
public class C29628g0 implements C86119n {
    public void jf0(C79778e.C79780b bVar, C79778e.C79780b bVar2) {
        WeAppQualityRequestOrientationStruct weAppQualityRequestOrientationStruct = new WeAppQualityRequestOrientationStruct();
        int i = bVar2.f233805d;
        weAppQualityRequestOrientationStruct.f80559d = i;
        weAppQualityRequestOrientationStruct.f80560e = bVar.f233805d;
        Log.m105919d("MicroMsg.report.ReportReqOrientationFunction", "reportFailed: req[%d] current[%d]", Integer.valueOf(i), Integer.valueOf(weAppQualityRequestOrientationStruct.f80560e));
        weAppQualityRequestOrientationStruct.mo86054n();
    }
}
