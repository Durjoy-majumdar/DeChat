package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.HideSessionExitStruct */
public final class HideSessionExitStruct extends C61103a {

    /* renamed from: d */
    public long f194238d = 0;

    /* renamed from: e */
    public String f194239e = "";

    /* renamed from: f */
    public long f194240f;

    /* renamed from: g */
    public long f194241g;

    /* renamed from: h */
    public long f194242h;

    /* renamed from: i */
    public long f194243i;

    /* renamed from: j */
    public long f194244j;

    /* renamed from: j */
    public int mo1004j() {
        return 21169;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194238d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194239e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194240f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194241g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194242h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194243i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194244j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194238d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194239e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194240f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194241g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterChatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194242h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitChatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194243i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitHiddenStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194244j);
        return stringBuffer.toString();
    }
}
