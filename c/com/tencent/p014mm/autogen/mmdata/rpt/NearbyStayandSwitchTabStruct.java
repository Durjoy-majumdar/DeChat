package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.NearbyStayandSwitchTabStruct */
public final class NearbyStayandSwitchTabStruct extends C61103a {

    /* renamed from: d */
    public String f10010d = "";

    /* renamed from: e */
    public String f10011e = "";

    /* renamed from: f */
    public long f10012f;

    /* renamed from: g */
    public long f10013g;

    /* renamed from: h */
    public long f10014h;

    /* renamed from: i */
    public String f10015i = "";

    /* renamed from: j */
    public String f10016j = "";

    /* renamed from: k */
    public long f10017k;

    /* renamed from: l */
    public String f10018l = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21835;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f10010d);
        stringBuffer.append(",");
        stringBuffer.append(this.f10011e);
        stringBuffer.append(",");
        stringBuffer.append(this.f10012f);
        stringBuffer.append(",");
        stringBuffer.append(this.f10013g);
        stringBuffer.append(",");
        stringBuffer.append(this.f10014h);
        stringBuffer.append(",");
        stringBuffer.append(this.f10015i);
        stringBuffer.append(",");
        stringBuffer.append(this.f10016j);
        stringBuffer.append(",");
        stringBuffer.append(this.f10017k);
        stringBuffer.append(",");
        stringBuffer.append(this.f10018l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10010d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10011e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StayTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10012f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10013g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10014h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10015i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10016j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10017k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10018l);
        return stringBuffer.toString();
    }
}
