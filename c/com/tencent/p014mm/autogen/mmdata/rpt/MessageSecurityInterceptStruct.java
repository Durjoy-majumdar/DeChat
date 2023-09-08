package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MessageSecurityInterceptStruct */
public final class MessageSecurityInterceptStruct extends C61103a {

    /* renamed from: d */
    public long f194271d;

    /* renamed from: e */
    public long f194272e;

    /* renamed from: f */
    public long f194273f;

    /* renamed from: g */
    public long f194274g;

    /* renamed from: h */
    public long f194275h = 0;

    /* renamed from: i */
    public long f194276i = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 18712;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194271d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194272e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194273f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194274g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194275h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194276i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194271d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SelfSendMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194272e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194273f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194274g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CopyLen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194275h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194276i);
        return stringBuffer.toString();
    }
}
