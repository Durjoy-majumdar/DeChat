package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OnlyAdminModifyTopicReportStruct */
public final class OnlyAdminModifyTopicReportStruct extends C61103a {

    /* renamed from: d */
    public String f107996d = "";

    /* renamed from: e */
    public long f107997e;

    /* renamed from: f */
    public long f107998f;

    /* renamed from: g */
    public long f107999g;

    /* renamed from: j */
    public int mo1004j() {
        return 24874;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107996d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107997e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107998f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107999g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107996d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107997e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MemberCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107998f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107999g);
        return stringBuffer.toString();
    }
}
