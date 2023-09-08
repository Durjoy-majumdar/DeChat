package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MethodAnalyseReportStruct */
public final class MethodAnalyseReportStruct extends C61103a {

    /* renamed from: d */
    public String f265695d = "";

    /* renamed from: e */
    public int f265696e = -1;

    /* renamed from: f */
    public String f265697f = "";

    /* renamed from: g */
    public int f265698g = -1;

    /* renamed from: h */
    public String f265699h = "";

    /* renamed from: i */
    public int f265700i = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 27450;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265695d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265696e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265697f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265698g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265699h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265700i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MethodName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265695d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MethodCostMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265696e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265697f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FrameIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265698g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MethodTrace");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265699h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnableImrove");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265700i);
        return stringBuffer.toString();
    }
}
