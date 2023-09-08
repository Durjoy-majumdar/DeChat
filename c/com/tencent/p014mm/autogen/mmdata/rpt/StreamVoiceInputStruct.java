package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StreamVoiceInputStruct */
public final class StreamVoiceInputStruct extends C61103a {

    /* renamed from: d */
    public long f343833d = 0;

    /* renamed from: e */
    public String f343834e = "";

    /* renamed from: f */
    public String f343835f = "";

    /* renamed from: j */
    public int mo1004j() {
        return 15493;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343833d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343834e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343835f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LogType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343833d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WechatLanguage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343834e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InputLanguage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343835f);
        return stringBuffer.toString();
    }
}
