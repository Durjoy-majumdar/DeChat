package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidChatInputStruct */
public final class AndroidChatInputStruct extends C61103a {

    /* renamed from: d */
    public long f194122d = 0;

    /* renamed from: e */
    public long f194123e = 0;

    /* renamed from: f */
    public long f194124f = 0;

    /* renamed from: g */
    public long f194125g = 0;

    /* renamed from: h */
    public long f194126h = 0;

    /* renamed from: i */
    public long f194127i = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16113;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194122d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194123e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194124f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194125g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194126h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194127i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FirstInputTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194122d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LastInputTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194123e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SendStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194124f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194125g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TextLength");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194126h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmojiCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194127i);
        return stringBuffer.toString();
    }
}
