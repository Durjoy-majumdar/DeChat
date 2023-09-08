package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPreloadOpenRateStatisStruct */
public final class WeAppQualityPreloadOpenRateStatisStruct extends C61103a {

    /* renamed from: d */
    public long f237016d;

    /* renamed from: e */
    public long f237017e;

    /* renamed from: f */
    public long f237018f;

    /* renamed from: g */
    public String f237019g = "";

    /* renamed from: h */
    public long f237020h;

    /* renamed from: i */
    public String f237021i = "";

    /* renamed from: j */
    public String f237022j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18852;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237016d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237017e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237018f);
        stringBuffer.append(",");
        stringBuffer.append(this.f237019g);
        stringBuffer.append(",");
        stringBuffer.append(this.f237020h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237021i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237022j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("visitScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237016d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("businessScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237017e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("innerScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237018f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237019g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237020h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237021i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openRate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237022j);
        return stringBuffer.toString();
    }
}
