package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct */
public final class BrandTmplExposeReportStruct extends C61103a {

    /* renamed from: d */
    public long f194144d;

    /* renamed from: e */
    public long f194145e;

    /* renamed from: f */
    public String f194146f = "";

    /* renamed from: g */
    public String f194147g = "";

    /* renamed from: h */
    public String f194148h = "";

    /* renamed from: i */
    public String f194149i = "";

    /* renamed from: j */
    public String f194150j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 28222;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194144d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194145e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194146f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194147g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194148h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194149i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194150j);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("opType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194144d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("opTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194145e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194146f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("templateId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194147g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("templateTitle");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194148h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("templateContent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194149i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("complainReason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194150j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isAgreeScreenshot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isComplainSuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public BrandTmplExposeReportStruct mo93191s(long j) {
        this.f194145e = j;
        return this;
    }

    /* renamed from: t */
    public BrandTmplExposeReportStruct mo93192t(long j) {
        this.f194144d = j;
        return this;
    }

    /* renamed from: u */
    public BrandTmplExposeReportStruct mo93193u(String str) {
        this.f194146f = mo86045b("username", str, true);
        return this;
    }
}
