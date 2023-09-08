package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct */
public final class WCPaySaftyClickReportStruct extends C61103a {

    /* renamed from: d */
    public long f194681d = 0;

    /* renamed from: e */
    public long f194682e = 0;

    /* renamed from: f */
    public long f194683f = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 15661;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194681d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194682e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194683f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ClickScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194681d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReportValue");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194682e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EntryScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194683f);
        return stringBuffer.toString();
    }
}
