package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppFileSystemTempFileSingleAllocStatStruct;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.c */
public final class C82413c {
    /* renamed from: a */
    public static final WeAppFileSystemTempFileSingleAllocStatStruct m101171a(QualitySessionRuntime qualitySessionRuntime) {
        WeAppFileSystemTempFileSingleAllocStatStruct weAppFileSystemTempFileSingleAllocStatStruct = new WeAppFileSystemTempFileSingleAllocStatStruct();
        weAppFileSystemTempFileSingleAllocStatStruct.f236577d = weAppFileSystemTempFileSingleAllocStatStruct.mo86045b("AppId", qualitySessionRuntime.f245833e, true);
        weAppFileSystemTempFileSingleAllocStatStruct.f236578e = (long) qualitySessionRuntime.f245837i;
        int i = qualitySessionRuntime.f245834f;
        weAppFileSystemTempFileSingleAllocStatStruct.f236579f = i != 1 ? i != 2 ? i != 3 ? null : WeAppFileSystemTempFileSingleAllocStatStruct.C80751a.demo : WeAppFileSystemTempFileSingleAllocStatStruct.C80751a.debug : WeAppFileSystemTempFileSingleAllocStatStruct.C80751a.release;
        weAppFileSystemTempFileSingleAllocStatStruct.f236580g = (long) qualitySessionRuntime.f245835g;
        return weAppFileSystemTempFileSingleAllocStatStruct;
    }
}
