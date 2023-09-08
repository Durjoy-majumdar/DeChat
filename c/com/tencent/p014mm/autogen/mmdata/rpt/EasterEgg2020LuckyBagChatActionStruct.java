package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EasterEgg2020LuckyBagChatActionStruct */
public final class EasterEgg2020LuckyBagChatActionStruct extends C61103a {

    /* renamed from: d */
    public String f9662d = "";

    /* renamed from: e */
    public String f9663e = "";

    /* renamed from: f */
    public String f9664f = "";

    /* renamed from: g */
    public String f9665g = "";

    /* renamed from: h */
    public String f9666h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18914;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9662d);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f9663e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9664f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9665g);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f9666h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Keyword");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9662d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsRecevier");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9663e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatRoomId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9664f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9665g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExtentString");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9666h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EffectType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        return stringBuffer.toString();
    }
}
