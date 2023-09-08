package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CameraKitMethodReportStruct */
public final class CameraKitMethodReportStruct extends C61103a {

    /* renamed from: d */
    public String f310052d = "";

    /* renamed from: e */
    public int f310053e = -1;

    /* renamed from: f */
    public int f310054f = -1;

    /* renamed from: g */
    public String f310055g = "";

    /* renamed from: h */
    public String f310056h = "";

    /* renamed from: i */
    public String f310057i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 27195;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310052d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310053e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310054f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310055g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310056h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310057i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MethodName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310052d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310053e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310054f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310055g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpuInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310056h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310057i);
        return stringBuffer.toString();
    }
}
