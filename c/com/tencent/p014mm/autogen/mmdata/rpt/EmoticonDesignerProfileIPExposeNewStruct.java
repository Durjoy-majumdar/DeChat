package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonDesignerProfileIPExposeNewStruct */
public final class EmoticonDesignerProfileIPExposeNewStruct extends C61103a {

    /* renamed from: d */
    public String f154993d = "";

    /* renamed from: e */
    public int f154994e;

    /* renamed from: f */
    public int f154995f;

    /* renamed from: g */
    public String f154996g = "";

    /* renamed from: h */
    public int f154997h;

    /* renamed from: i */
    public int f154998i;

    /* renamed from: j */
    public int f154999j;

    /* renamed from: j */
    public int mo1004j() {
        return 27615;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f154993d);
        stringBuffer.append(",");
        stringBuffer.append(this.f154994e);
        stringBuffer.append(",");
        stringBuffer.append(this.f154995f);
        stringBuffer.append(",");
        stringBuffer.append(this.f154996g);
        stringBuffer.append(",");
        stringBuffer.append(this.f154997h);
        stringBuffer.append(",");
        stringBuffer.append(this.f154998i);
        stringBuffer.append(",");
        stringBuffer.append(this.f154999j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154993d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ifHasFinder");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154994e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ipCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154995f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("desUin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154996g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IPTabClick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154997h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("emotionTabClick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154998i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("emojiTabClick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154999j);
        return stringBuffer.toString();
    }
}
