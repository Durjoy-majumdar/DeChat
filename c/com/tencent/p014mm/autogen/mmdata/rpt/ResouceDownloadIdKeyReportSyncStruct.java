package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ResouceDownloadIdKeyReportSyncStruct */
public final class ResouceDownloadIdKeyReportSyncStruct extends C61103a {

    /* renamed from: d */
    public long f343808d = 0;

    /* renamed from: e */
    public long f343809e = 0;

    /* renamed from: f */
    public long f343810f = 0;

    /* renamed from: g */
    public String f343811g = "";

    /* renamed from: h */
    public long f343812h = 0;

    /* renamed from: i */
    public long f343813i = 0;

    /* renamed from: j */
    public long f343814j = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 15166;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343808d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343809e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343810f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343811g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343812h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343813i);
        stringBuffer.append(",");
        stringBuffer.append(this.f343814j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ResType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343808d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResSubType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343809e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343810f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Network");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343811g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReportId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343812h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReportKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343813i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AndroidPathMigrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343814j);
        return stringBuffer.toString();
    }
}
