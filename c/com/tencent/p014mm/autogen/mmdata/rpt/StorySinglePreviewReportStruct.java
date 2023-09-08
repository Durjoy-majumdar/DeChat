package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct */
public final class StorySinglePreviewReportStruct extends C61103a {

    /* renamed from: d */
    public long f266283d = 0;

    /* renamed from: e */
    public long f266284e = 0;

    /* renamed from: f */
    public long f266285f = 0;

    /* renamed from: g */
    public String f266286g = "";

    /* renamed from: h */
    public String f266287h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16763;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266283d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266284e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266285f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266286g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266287h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PreviewEnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266283d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProfileSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266284e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266285f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StoryOwnerUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266286g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StoryTid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266287h);
        return stringBuffer.toString();
    }
}
