package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct */
public final class WCPayHongBaoRefundClickReportStruct extends C61103a {

    /* renamed from: d */
    public long f194666d = 0;

    /* renamed from: e */
    public long f194667e = 0;

    /* renamed from: f */
    public long f194668f = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 17573;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194666d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194667e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194668f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("clickScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194666d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("switchWay");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194667e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openFrom");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194668f);
        return stringBuffer.toString();
    }
}
