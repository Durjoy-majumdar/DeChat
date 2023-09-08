package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxImeSendFailedReportStruct */
public final class WxImeSendFailedReportStruct extends C61103a {

    /* renamed from: d */
    public String f194707d = "";

    /* renamed from: e */
    public String f194708e = "";

    /* renamed from: f */
    public String f194709f = "";

    /* renamed from: g */
    public int f194710g;

    /* renamed from: j */
    public int mo1004j() {
        return 28540;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194707d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194708e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194709f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194710g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("currentImePacketName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194707d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currentImePacketNameMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194708e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194709f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("emojiMd5Empty");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194710g);
        return stringBuffer.toString();
    }
}
