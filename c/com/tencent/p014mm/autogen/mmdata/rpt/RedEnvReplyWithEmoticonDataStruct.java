package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct */
public final class RedEnvReplyWithEmoticonDataStruct extends C61103a {

    /* renamed from: d */
    public long f156785d = 0;

    /* renamed from: e */
    public String f156786e = "";

    /* renamed from: f */
    public long f156787f = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16872;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156785d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156786e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156787f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SendScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156785d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("emoticonMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156786e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasTxt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156787f);
        return stringBuffer.toString();
    }
}
