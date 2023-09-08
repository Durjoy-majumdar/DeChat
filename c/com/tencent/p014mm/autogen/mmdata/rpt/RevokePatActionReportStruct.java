package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct */
public final class RevokePatActionReportStruct extends C61103a {

    /* renamed from: d */
    public int f194344d;

    /* renamed from: e */
    public long f194345e;

    /* renamed from: f */
    public long f194346f;

    /* renamed from: g */
    public String f194347g = "";

    /* renamed from: h */
    public String f194348h = "";

    /* renamed from: i */
    public String f194349i = "";

    /* renamed from: j */
    public String f194350j = "";

    /* renamed from: k */
    public int f194351k;

    /* renamed from: l */
    public int f194352l;

    /* renamed from: m */
    public int f194353m;

    /* renamed from: j */
    public int mo1004j() {
        return 20590;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194344d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194345e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194346f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194347g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194348h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194349i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194350j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194351k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194352l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194353m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194344d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PatTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194345e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RevokeTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194346f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194347g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PattedUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194348h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PatSuffix");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194349i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatRoomName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194350j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RevokeMethod");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194351k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194352l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RevokeAction");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194353m);
        return stringBuffer.toString();
    }
}
