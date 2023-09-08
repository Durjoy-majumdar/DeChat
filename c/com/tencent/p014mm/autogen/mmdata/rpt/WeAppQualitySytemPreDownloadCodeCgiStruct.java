package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySytemPreDownloadCodeCgiStruct */
public final class WeAppQualitySytemPreDownloadCodeCgiStruct extends C61103a {

    /* renamed from: d */
    public String f237301d = "";

    /* renamed from: e */
    public String f237302e = "";

    /* renamed from: f */
    public long f237303f;

    /* renamed from: g */
    public long f237304g;

    /* renamed from: h */
    public long f237305h;

    /* renamed from: i */
    public long f237306i;

    /* renamed from: j */
    public long f237307j;

    /* renamed from: k */
    public int f237308k;

    /* renamed from: l */
    public long f237309l;

    /* renamed from: j */
    public int mo1004j() {
        return 18866;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237301d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237302e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237303f);
        stringBuffer.append(",");
        stringBuffer.append(this.f237304g);
        stringBuffer.append(",");
        stringBuffer.append(this.f237305h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237306i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237307j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237308k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237309l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237301d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237302e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237303f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237304g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237305h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237306i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237307j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Ret");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237308k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237309l);
        return stringBuffer.toString();
    }
}
