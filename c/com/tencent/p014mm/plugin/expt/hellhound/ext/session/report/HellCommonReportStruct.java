package com.tencent.p014mm.plugin.expt.hellhound.ext.session.report;

import android.os.Process;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import kj2.C61103a;

/* renamed from: com.tencent.mm.plugin.expt.hellhound.ext.session.report.HellCommonReportStruct */
public class HellCommonReportStruct extends C61103a {

    /* renamed from: d */
    public int f269471d;

    /* renamed from: e */
    public int f269472e = 0;

    /* renamed from: f */
    public String f269473f = "";

    /* renamed from: g */
    public long f269474g = 0;

    /* renamed from: h */
    public long f269475h = 0;

    /* renamed from: i */
    public long f269476i = 0;

    /* renamed from: j */
    public String f269477j = "";

    public HellCommonReportStruct(int i) {
        this.f269471d = i;
    }

    /* renamed from: s */
    public static boolean m117909s(int i, String str, int i2) {
        if (Util.isNullOrNil(str) || i <= 0) {
            return false;
        }
        List<String> f = C61103a.m71623f(str.replace(',', '#'), i2);
        if (f != null) {
            HellCommonReportStruct hellCommonReportStruct = new HellCommonReportStruct(i);
            hellCommonReportStruct.f269472e = Process.myPid();
            hellCommonReportStruct.f269473f = hellCommonReportStruct.mo86045b("PName", C86709a0.m107531m().mo58407a().f124988a, true);
            hellCommonReportStruct.f269474g = (long) C61103a.m71624h();
            ArrayList arrayList = (ArrayList) f;
            hellCommonReportStruct.f269476i = (long) arrayList.size();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                hellCommonReportStruct.f269475h = (long) i3;
                hellCommonReportStruct.f269477j = hellCommonReportStruct.mo86045b("DataContent", (String) arrayList.get(i3), false);
                hellCommonReportStruct.mo86054n();
            }
        }
        return true;
    }

    /* renamed from: j */
    public int mo1004j() {
        return this.f269471d;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f269472e);
        stringBuffer.append(",");
        stringBuffer.append(this.f269473f);
        stringBuffer.append(",");
        stringBuffer.append(this.f269474g);
        stringBuffer.append(",");
        stringBuffer.append(this.f269475h);
        stringBuffer.append(",");
        stringBuffer.append(this.f269476i);
        stringBuffer.append(",");
        stringBuffer.append(this.f269477j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f269472e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f269473f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Seq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f269474g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f269475h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeqSum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f269476i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DataContent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f269477j);
        return stringBuffer.toString();
    }
}
