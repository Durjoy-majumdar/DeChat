package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryChatTopBarEntranceExposeStruct */
public final class StoryChatTopBarEntranceExposeStruct extends C61103a {

    /* renamed from: d */
    public String f194463d = "";

    /* renamed from: e */
    public long f194464e = 0;

    /* renamed from: f */
    public long f194465f = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16656;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194463d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194464e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194465f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194463d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreviewEnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194464e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasUnreadStoryTips");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194465f);
        return stringBuffer.toString();
    }
}
