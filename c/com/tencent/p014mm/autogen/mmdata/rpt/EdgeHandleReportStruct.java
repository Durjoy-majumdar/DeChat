package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EdgeHandleReportStruct */
public final class EdgeHandleReportStruct extends C61103a {

    /* renamed from: d */
    public String f236381d = "";

    /* renamed from: e */
    public long f236382e;

    /* renamed from: f */
    public long f236383f;

    /* renamed from: g */
    public long f236384g;

    /* renamed from: h */
    public long f236385h;

    /* renamed from: i */
    public long f236386i;

    /* renamed from: j */
    public int mo1004j() {
        return 23494;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236381d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236382e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236383f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236384g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236385h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236386i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("JsMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236381d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Step1");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236382e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Step2");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236383f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Step3");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236384g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("All");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236385h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EdgeResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236386i);
        return stringBuffer.toString();
    }
}
