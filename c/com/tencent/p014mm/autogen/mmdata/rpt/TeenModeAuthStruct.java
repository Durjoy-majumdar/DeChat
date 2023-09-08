package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TeenModeAuthStruct */
public final class TeenModeAuthStruct extends C61103a {

    /* renamed from: d */
    public long f10061d = 0;

    /* renamed from: e */
    public long f10062e = 0;

    /* renamed from: f */
    public long f10063f = 0;

    /* renamed from: g */
    public String f10064g = "";

    /* renamed from: h */
    public String f10065h = "";

    /* renamed from: i */
    public String f10066i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 24416;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f10061d);
        stringBuffer.append(",");
        stringBuffer.append(this.f10062e);
        stringBuffer.append(",");
        stringBuffer.append(this.f10063f);
        stringBuffer.append(",");
        stringBuffer.append(this.f10064g);
        stringBuffer.append(",");
        stringBuffer.append(this.f10065h);
        stringBuffer.append(",");
        stringBuffer.append(this.f10066i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10061d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("userrole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10062e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("requestType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10063f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("requestID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10064g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("requestResource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10065h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("requestResourceExtra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10066i);
        return stringBuffer.toString();
    }
}
