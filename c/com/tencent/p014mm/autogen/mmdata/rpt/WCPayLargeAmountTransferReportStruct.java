package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct */
public final class WCPayLargeAmountTransferReportStruct extends C61103a {

    /* renamed from: d */
    public long f194676d = 0;

    /* renamed from: e */
    public long f194677e = 0;

    /* renamed from: f */
    public String f194678f = "";

    /* renamed from: j */
    public int mo1004j() {
        return 17072;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194676d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194677e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194678f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194676d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194677e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OrderId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194678f);
        return stringBuffer.toString();
    }
}
