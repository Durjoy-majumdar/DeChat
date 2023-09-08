package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeGuideFlowStruct */
public final class GroupUpgradeGuideFlowStruct extends C61103a {

    /* renamed from: d */
    public String f107945d = "";

    /* renamed from: e */
    public long f107946e;

    /* renamed from: f */
    public long f107947f = 0;

    /* renamed from: g */
    public long f107948g = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 19353;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107945d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107946e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107947f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107948g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107945d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107946e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Result");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107947f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107948g);
        return stringBuffer.toString();
    }
}
