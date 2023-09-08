package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.autogen.events.SnsPostInfoEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MMImageExifInfoStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsPostReportLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.statistics.k */
public class C94998k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsPostInfoEvent f275619d;

    /* renamed from: e */
    public final /* synthetic */ SnsPostReportLogic.C949811 f275620e;

    public C94998k(SnsPostReportLogic.C949811 r1, SnsPostInfoEvent snsPostInfoEvent) {
        this.f275620e = r1;
        this.f275619d = snsPostInfoEvent;
    }

    public void run() {
        int i;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1$1");
        SnsPostReportLogic snsPostReportLogic = SnsPostReportLogic.this;
        SnsPostInfoEvent.C55166a aVar = this.f275619d.f154876d;
        long j = aVar.f154877a;
        HashMap hashMap = aVar.f154879c;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        snsPostReportLogic.getClass();
        SnsMethodCalculate.markStartTimeMs("reportSnsImageExif", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Integer intValue : hashMap.keySet()) {
                int intValue2 = intValue.intValue();
                SnsPostReportLogic.C94982a remove = snsPostReportLogic.f275500a.remove(Integer.valueOf(intValue2));
                if (remove != null && !Util.isNullOrNil(remove.f275504b)) {
                    try {
                        i = ((Integer) hashMap.get(Integer.valueOf(intValue2))).intValue() == 1 ? 1 : 2;
                    } catch (Exception unused) {
                        i = 0;
                    }
                    MMImageExifInfoStruct mMImageExifInfoStruct = new MMImageExifInfoStruct(remove.f275504b);
                    mMImageExifInfoStruct.f265664B = mMImageExifInfoStruct.mo86045b("publishId", C102236a0.m134765q0(j), true);
                    mMImageExifInfoStruct.f265680r = (long) i;
                    mMImageExifInfoStruct.f265665C = (long) remove.f275503a;
                    mMImageExifInfoStruct.mo86054n();
                    Log.m105925i("MicroMsg.SnsPostReportLogic", "report sns image exif [%s]", mMImageExifInfoStruct.mo1006q());
                    snsPostReportLogic = snsPostReportLogic;
                    hashMap = hashMap;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("reportSnsImageExif", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1$1");
    }
}
