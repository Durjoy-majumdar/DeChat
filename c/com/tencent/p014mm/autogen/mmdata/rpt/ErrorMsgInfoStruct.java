package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct */
public final class ErrorMsgInfoStruct extends C61103a {

    /* renamed from: d */
    public long f194199d;

    /* renamed from: e */
    public long f194200e;

    /* renamed from: f */
    public String f194201f = "";

    /* renamed from: g */
    public long f194202g;

    /* renamed from: h */
    public String f194203h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25996;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194199d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194200e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194201f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194202g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194203h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MsgCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194199d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InnerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194200e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LastMsgId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194201f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194202g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgCreateTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194203h);
        return stringBuffer.toString();
    }
}
