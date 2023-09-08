package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MsgRevokeReportStruct */
public final class MsgRevokeReportStruct extends C61103a {

    /* renamed from: d */
    public long f194277d;

    /* renamed from: e */
    public long f194278e;

    /* renamed from: f */
    public long f194279f;

    /* renamed from: g */
    public long f194280g;

    /* renamed from: h */
    public long f194281h;

    /* renamed from: i */
    public long f194282i;

    /* renamed from: j */
    public int mo1004j() {
        return 27627;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194277d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194278e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194279f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194280g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194281h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194282i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RevokeType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194277d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194278e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194279f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Result");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194280g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194281h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InnerType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194282i);
        return stringBuffer.toString();
    }
}
