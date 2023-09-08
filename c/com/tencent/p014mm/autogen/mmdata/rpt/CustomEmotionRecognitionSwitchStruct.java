package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct */
public final class CustomEmotionRecognitionSwitchStruct extends C61103a {

    /* renamed from: d */
    public int f265380d;

    /* renamed from: e */
    public long f265381e;

    /* renamed from: f */
    public long f265382f;

    /* renamed from: j */
    public int mo1004j() {
        return 25429;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265380d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265381e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265382f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265380d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265381e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Status");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265382f);
        return stringBuffer.toString();
    }
}
