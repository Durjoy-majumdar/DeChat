package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FlutterAnrReportStruct */
public final class FlutterAnrReportStruct extends C61103a {

    /* renamed from: d */
    public String f343733d = "";

    /* renamed from: e */
    public long f343734e = 0;

    /* renamed from: f */
    public long f343735f = 0;

    /* renamed from: g */
    public String f343736g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 27481;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343733d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343734e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343735f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343736g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("StackTrace");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343733d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343734e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsForeground");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343735f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Revision");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343736g);
        return stringBuffer.toString();
    }
}
