package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct */
public final class WACarLicensePlateAuthLogStruct extends C61103a {

    /* renamed from: d */
    public String f236454d = "";

    /* renamed from: e */
    public long f236455e = 0;

    /* renamed from: f */
    public long f236456f = 0;

    /* renamed from: g */
    public long f236457g = 0;

    /* renamed from: h */
    public long f236458h = 0;

    /* renamed from: i */
    public long f236459i = 0;

    /* renamed from: j */
    public long f236460j = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 23342;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236454d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236455e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236456f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236457g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236458h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236459i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236460j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236454d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236455e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236456f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236457g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CallPageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236458h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HalfPageOperation");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236459i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LicensePlateOperation");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236460j);
        return stringBuffer.toString();
    }
}
