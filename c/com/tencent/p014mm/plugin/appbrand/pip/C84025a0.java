package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppFloatingVideoStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.a0 */
public enum C84025a0 implements C84036e {
    INSTANCE;

    /* renamed from: a */
    public final WeAppFloatingVideoStruct mo116679a(C84034d dVar) {
        WeAppFloatingVideoStruct weAppFloatingVideoStruct = new WeAppFloatingVideoStruct();
        weAppFloatingVideoStruct.f236587d = weAppFloatingVideoStruct.mo86045b("AppId", dVar.f245371a, true);
        weAppFloatingVideoStruct.f236588e = weAppFloatingVideoStruct.mo86045b("PagePath", dVar.f245372b, true);
        weAppFloatingVideoStruct.f236589f = weAppFloatingVideoStruct.mo86045b("VideoUrl", dVar.f245373c, true);
        return weAppFloatingVideoStruct;
    }

    /* renamed from: b */
    public void mo116680b(C84034d dVar, C84043h hVar) {
        int i = 2;
        Log.m105919d("MicroMsg.AppBrand.AppBrandPipReporter", "onPipHide, baseInfo: %s, hideReason: %s", dVar, hVar);
        WeAppFloatingVideoStruct a = mo116679a(dVar);
        int ordinal = hVar.ordinal();
        int i2 = ordinal != 0 ? ordinal != 1 ? 6 : 5 : 4;
        a.f236590g = (long) i2;
        if (6 == i2) {
            int ordinal2 = hVar.ordinal();
            if (ordinal2 == 2) {
                i = 1;
            } else if (ordinal2 != 3) {
                i = ordinal2 != 4 ? ordinal2 != 5 ? 0 : 4 : 3;
            }
            a.f236591h = (long) i;
        }
        a.mo86054n();
    }
}
