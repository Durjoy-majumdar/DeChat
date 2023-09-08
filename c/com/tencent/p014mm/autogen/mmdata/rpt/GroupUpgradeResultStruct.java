package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeResultStruct */
public final class GroupUpgradeResultStruct extends C61103a {

    /* renamed from: d */
    public long f107951d;

    /* renamed from: e */
    public long f107952e = 0;

    /* renamed from: f */
    public long f107953f = 0;

    /* renamed from: g */
    public long f107954g = 0;

    /* renamed from: h */
    public String f107955h = "";

    /* renamed from: i */
    public String f107956i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19451;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107951d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107952e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107953f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107954g);
        stringBuffer.append(",");
        stringBuffer.append(this.f107955h);
        stringBuffer.append(",");
        stringBuffer.append(this.f107956i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RecomdSuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107951d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RecomdFail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107952e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("otherSuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107953f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("otherFail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107954g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sucRoomList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107955h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ticketId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107956i);
        return stringBuffer.toString();
    }
}
