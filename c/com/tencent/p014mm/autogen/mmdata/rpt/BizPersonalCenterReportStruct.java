package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct */
public final class BizPersonalCenterReportStruct extends C61103a {

    /* renamed from: d */
    public long f107854d = 0;

    /* renamed from: e */
    public long f107855e = 0;

    /* renamed from: f */
    public long f107856f = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 27213;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107854d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107855e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107856f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("actionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107854d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107855e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107856f);
        return stringBuffer.toString();
    }
}
