package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct */
public final class UserPrivacySettingClientReportStruct extends C61103a {

    /* renamed from: d */
    public long f10079d;

    /* renamed from: e */
    public String f10080e = "";

    /* renamed from: f */
    public String f10081f = "";

    /* renamed from: g */
    public String f10082g = "";

    /* renamed from: h */
    public String f10083h = "";

    /* renamed from: i */
    public String f10084i = "";

    /* renamed from: j */
    public String f10085j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 24370;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f10079d);
        stringBuffer.append(",");
        stringBuffer.append(this.f10080e);
        stringBuffer.append(",");
        stringBuffer.append(this.f10081f);
        stringBuffer.append(",");
        stringBuffer.append(this.f10082g);
        stringBuffer.append(",");
        stringBuffer.append(this.f10083h);
        stringBuffer.append(",");
        stringBuffer.append(this.f10084i);
        stringBuffer.append(",");
        stringBuffer.append(this.f10085j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10079d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10080e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10081f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10082g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScopeList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10083h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeviceID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10084i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrentPrivacyFullStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10085j);
        return stringBuffer.toString();
    }
}
