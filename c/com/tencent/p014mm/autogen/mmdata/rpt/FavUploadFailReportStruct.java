package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavUploadFailReportStruct */
public final class FavUploadFailReportStruct extends C61103a {

    /* renamed from: d */
    public long f265557d;

    /* renamed from: e */
    public String f265558e = "";

    /* renamed from: f */
    public String f265559f = "";

    /* renamed from: g */
    public long f265560g;

    /* renamed from: h */
    public long f265561h;

    /* renamed from: j */
    public int mo1004j() {
        return 28115;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265557d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265558e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265559f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265560g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265561h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265557d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265558e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CdnCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265559f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265560g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InnerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265561h);
        return stringBuffer.toString();
    }
}
