package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct */
public final class SpamMediaToEmojiOPStruct extends C61103a {

    /* renamed from: d */
    public long f194459d;

    /* renamed from: e */
    public long f194460e;

    /* renamed from: f */
    public long f194461f;

    /* renamed from: g */
    public long f194462g;

    /* renamed from: j */
    public int mo1004j() {
        return 21321;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194459d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194460e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194461f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194462g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MsgSvrId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194459d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194460e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BanType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194461f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194462g);
        return stringBuffer.toString();
    }
}
