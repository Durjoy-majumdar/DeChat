package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.F2FMoneyRemindStruct */
public final class F2FMoneyRemindStruct extends C61103a {

    /* renamed from: d */
    public int f194204d;

    /* renamed from: e */
    public String f194205e = "";

    /* renamed from: f */
    public String f194206f = "";

    /* renamed from: g */
    public int f194207g = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 18885;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194204d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194205e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194206f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194207g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194204d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("F2FId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194205e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("QrCodeId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194206f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalAmount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194207g);
        return stringBuffer.toString();
    }
}
