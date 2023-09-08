package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct */
public final class WCPayTransferToPhoneActionReportStruct extends C61103a {

    /* renamed from: d */
    public long f194684d = 0;

    /* renamed from: e */
    public String f194685e = "";

    /* renamed from: f */
    public long f194686f = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 18262;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194684d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194685e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194686f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194684d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReqKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194685e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterSettingScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194686f);
        return stringBuffer.toString();
    }
}
