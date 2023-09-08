package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct */
public final class WCPayTrasnferCheckRealNameReportStruct extends C61103a {

    /* renamed from: d */
    public long f194687d = 0;

    /* renamed from: e */
    public String f194688e = "";

    /* renamed from: f */
    public long f194689f = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16016;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194687d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194688e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194689f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ReportScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194687d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TransferUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194688e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TransferAmount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194689f);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public WCPayTrasnferCheckRealNameReportStruct mo93202s(String str) {
        this.f194688e = mo86045b("TransferUserName", str, true);
        return this;
    }
}
