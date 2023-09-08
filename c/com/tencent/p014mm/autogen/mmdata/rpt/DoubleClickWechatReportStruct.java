package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DoubleClickWechatReportStruct */
public final class DoubleClickWechatReportStruct extends C61103a {

    /* renamed from: d */
    public long f194195d;

    /* renamed from: e */
    public long f194196e;

    /* renamed from: f */
    public long f194197f = 0;

    /* renamed from: g */
    public String f194198g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20134;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194195d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194196e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194197f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194198g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ClickMethod");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194195d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnreadNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194196e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpToChatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194197f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194198g);
        return stringBuffer.toString();
    }
}
