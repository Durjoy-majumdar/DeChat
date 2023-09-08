package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoiceMessageDownloadStruct */
public final class VoiceMessageDownloadStruct extends C61103a {

    /* renamed from: d */
    public int f48640d;

    /* renamed from: e */
    public String f48641e = "";

    /* renamed from: f */
    public int f48642f;

    /* renamed from: g */
    public int f48643g;

    /* renamed from: h */
    public int f48644h;

    /* renamed from: i */
    public int f48645i;

    /* renamed from: j */
    public String f48646j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 26956;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48640d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48641e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48642f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48643g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48644h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48645i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48646j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("eventType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48640d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(DownloadInfo.FILENAME);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48641e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("opType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48642f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48643g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("spendTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48644h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48645i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("errMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48646j);
        return stringBuffer.toString();
    }
}
