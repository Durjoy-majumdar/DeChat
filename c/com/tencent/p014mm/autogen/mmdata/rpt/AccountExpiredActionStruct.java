package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AccountExpiredActionStruct */
public final class AccountExpiredActionStruct extends C61103a {

    /* renamed from: d */
    public long f194110d;

    /* renamed from: e */
    public long f194111e;

    /* renamed from: f */
    public String f194112f = "";

    /* renamed from: g */
    public String f194113g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22500;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194110d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194111e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194112f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194113g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("errType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194110d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("errCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194111e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("errMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194112f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastKickReason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194113g);
        return stringBuffer.toString();
    }
}
