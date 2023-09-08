package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TestKvReportStruct */
public final class TestKvReportStruct extends C61103a {

    /* renamed from: d */
    public int f266357d = -1;

    /* renamed from: e */
    public int f266358e = -1;

    /* renamed from: f */
    public String f266359f = "";

    /* renamed from: g */
    public int f266360g = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 22021;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266357d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266358e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266359f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266360g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IsComeScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266357d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSolve");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266358e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgExt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266359f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isHit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266360g);
        return stringBuffer.toString();
    }
}
