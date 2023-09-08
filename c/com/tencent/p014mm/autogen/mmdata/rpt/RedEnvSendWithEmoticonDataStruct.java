package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct */
public final class RedEnvSendWithEmoticonDataStruct extends C61103a {

    /* renamed from: d */
    public long f156788d = 0;

    /* renamed from: e */
    public String f156789e = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16868;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156788d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156789e);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SendScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156788d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("emoticonMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156789e);
        return stringBuffer.toString();
    }
}
