package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct */
public final class RedEnvReplyWithEmoticonClickStruct extends C61103a {

    /* renamed from: d */
    public long f194327d = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16871;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194327d);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ClickScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194327d);
        return stringBuffer.toString();
    }
}
