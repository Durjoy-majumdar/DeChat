package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PatSuffixActionReportStruct */
public final class PatSuffixActionReportStruct extends C61103a {

    /* renamed from: d */
    public String f194323d = "";

    /* renamed from: e */
    public int f194324e;

    /* renamed from: f */
    public int f194325f;

    /* renamed from: g */
    public int f194326g;

    /* renamed from: j */
    public int mo1004j() {
        return 20379;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194323d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194324e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194325f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194326g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194323d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194324e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194325f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194326g);
        return stringBuffer.toString();
    }
}
