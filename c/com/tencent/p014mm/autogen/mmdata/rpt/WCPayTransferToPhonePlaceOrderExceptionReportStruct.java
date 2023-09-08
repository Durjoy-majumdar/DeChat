package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhonePlaceOrderExceptionReportStruct */
public final class WCPayTransferToPhonePlaceOrderExceptionReportStruct extends C61103a {

    /* renamed from: d */
    public long f156901d = 0;

    /* renamed from: e */
    public String f156902e = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18263;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156901d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156902e);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156901d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReqKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156902e);
        return stringBuffer.toString();
    }
}
