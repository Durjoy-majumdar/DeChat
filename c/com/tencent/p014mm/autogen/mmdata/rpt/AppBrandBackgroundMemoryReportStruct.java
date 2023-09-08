package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandBackgroundMemoryReportStruct */
public final class AppBrandBackgroundMemoryReportStruct extends C61103a {

    /* renamed from: d */
    public int f236333d = 0;

    /* renamed from: e */
    public int f236334e = 0;

    /* renamed from: f */
    public int f236335f = 0;

    /* renamed from: g */
    public int f236336g = 0;

    /* renamed from: h */
    public int f236337h = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 21711;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236333d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236334e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236335f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236336g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236337h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("memory");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236333d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isSingleProcessStrategy");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236334e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasAppBrandRunning");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236335f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("runningAppBrandCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236336g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("maxProcessMemory");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236337h);
        return stringBuffer.toString();
    }
}
