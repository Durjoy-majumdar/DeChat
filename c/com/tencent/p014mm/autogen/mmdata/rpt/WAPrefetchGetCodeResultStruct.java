package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WAPrefetchGetCodeResultStruct */
public final class WAPrefetchGetCodeResultStruct extends C61103a {

    /* renamed from: d */
    public String f236509d = "";

    /* renamed from: e */
    public String f236510e = "";

    /* renamed from: f */
    public long f236511f = 0;

    /* renamed from: g */
    public long f236512g = 0;

    /* renamed from: h */
    public long f236513h = 0;

    /* renamed from: i */
    public long f236514i = 0;

    /* renamed from: j */
    public long f236515j = 0;

    /* renamed from: k */
    public long f236516k = 0;

    /* renamed from: l */
    public long f236517l = 0;

    /* renamed from: m */
    public long f236518m = 0;

    /* renamed from: n */
    public String f236519n = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16636;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236509d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236510e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236511f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236512g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236513h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236514i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236515j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236516k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236517l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236518m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236519n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236509d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236510e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236511f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsEncrypt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236512g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236513h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236514i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RetryCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236515j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CmdSequence");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236516k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReportId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236517l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PackageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236518m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PackageKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236519n);
        return stringBuffer.toString();
    }
}
