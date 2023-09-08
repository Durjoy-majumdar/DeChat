package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct */
public final class AnimateEmojiReportStruct extends C61103a {

    /* renamed from: d */
    public String f310027d = "";

    /* renamed from: e */
    public int f310028e;

    /* renamed from: f */
    public int f310029f;

    /* renamed from: g */
    public int f310030g;

    /* renamed from: h */
    public int f310031h;

    /* renamed from: i */
    public String f310032i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22146;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310027d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310028e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310029f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310030g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310031h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310032i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Content");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310027d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IfPlay");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310028e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IfPlaySuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310029f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayFailReason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310030g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RecentUse");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310031h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310032i);
        return stringBuffer.toString();
    }
}
