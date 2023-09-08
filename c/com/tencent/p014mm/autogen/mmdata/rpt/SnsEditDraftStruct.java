package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsEditDraftStruct */
public final class SnsEditDraftStruct extends C61103a {

    /* renamed from: d */
    public String f266008d = "";

    /* renamed from: e */
    public long f266009e = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 15988;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266008d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266009e);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266008d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266009e);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public SnsEditDraftStruct mo126630s() {
        long nowMilliSecond = Util.nowMilliSecond();
        this.f266009e = nowMilliSecond;
        mo86048e("ClickTimeStampMs", nowMilliSecond);
        return this;
    }
}
