package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AiFinderRedDotSyncStruct */
public final class AiFinderRedDotSyncStruct extends C61103a {

    /* renamed from: d */
    public long f194114d;

    /* renamed from: e */
    public long f194115e;

    /* renamed from: f */
    public int f194116f;

    /* renamed from: j */
    public int mo1004j() {
        return 24081;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194114d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194115e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194116f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LastFinderSyncMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194114d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NowMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194115e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderSyncScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194116f);
        return stringBuffer.toString();
    }
}
