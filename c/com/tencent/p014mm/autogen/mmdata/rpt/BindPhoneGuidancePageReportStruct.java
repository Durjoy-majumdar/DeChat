package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BindPhoneGuidancePageReportStruct */
public final class BindPhoneGuidancePageReportStruct extends C61103a {

    /* renamed from: d */
    public long f343662d;

    /* renamed from: e */
    public long f343663e;

    /* renamed from: f */
    public long f343664f;

    /* renamed from: g */
    public String f343665g = "";

    /* renamed from: h */
    public String f343666h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23947;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343662d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343663e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343664f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343665g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343666h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343662d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343663e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ModuleID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343664f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343665g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GuidanceScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343666h);
        return stringBuffer.toString();
    }
}
