package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeSelectGroupStruct */
public final class GroupUpgradeSelectGroupStruct extends C61103a {

    /* renamed from: d */
    public long f107957d;

    /* renamed from: e */
    public long f107958e = 0;

    /* renamed from: f */
    public long f107959f = 0;

    /* renamed from: g */
    public long f107960g = 0;

    /* renamed from: h */
    public long f107961h;

    /* renamed from: i */
    public String f107962i = "";

    /* renamed from: j */
    public long f107963j;

    /* renamed from: j */
    public int mo1004j() {
        return 19450;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107957d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107958e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107959f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107960g);
        stringBuffer.append(",");
        stringBuffer.append(this.f107961h);
        stringBuffer.append(",");
        stringBuffer.append(this.f107962i);
        stringBuffer.append(",");
        stringBuffer.append(this.f107963j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RecomdCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107957d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickMore");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107958e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RecomdSelect");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107959f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OtherSelect");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107960g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107961h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TicketId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107962i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OtherCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107963j);
        return stringBuffer.toString();
    }
}
