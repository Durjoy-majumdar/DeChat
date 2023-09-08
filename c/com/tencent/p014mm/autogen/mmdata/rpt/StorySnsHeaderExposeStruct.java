package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StorySnsHeaderExposeStruct */
public final class StorySnsHeaderExposeStruct extends C61103a {

    /* renamed from: d */
    public String f266288d = "";

    /* renamed from: e */
    public String f266289e = "";

    /* renamed from: f */
    public long f266290f = 0;

    /* renamed from: g */
    public String f266291g = "";

    /* renamed from: h */
    public long f266292h = 0;

    /* renamed from: i */
    public long f266293i = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16843;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266288d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266289e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266290f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266291g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266292h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266293i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EnterObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266288d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266289e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeUinCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266290f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeUinList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266291g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeNewVideoCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266292h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InteractiveUserCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266293i);
        return stringBuffer.toString();
    }
}
