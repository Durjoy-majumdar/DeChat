package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MvvmOptimizeReportStruct */
public final class MvvmOptimizeReportStruct extends C61103a {

    /* renamed from: d */
    public String f194290d = "";

    /* renamed from: e */
    public String f194291e = "";

    /* renamed from: f */
    public long f194292f;

    /* renamed from: g */
    public long f194293g;

    /* renamed from: j */
    public int mo1004j() {
        return 23677;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194290d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194291e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194292f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194293g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194290d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194291e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194292f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExptType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194293g);
        return stringBuffer.toString();
    }
}
