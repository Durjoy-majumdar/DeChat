package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupNoticeInfoStruct */
public final class GroupNoticeInfoStruct extends C61103a {

    /* renamed from: d */
    public String f194223d = "";

    /* renamed from: e */
    public long f194224e;

    /* renamed from: f */
    public long f194225f;

    /* renamed from: g */
    public long f194226g;

    /* renamed from: h */
    public String f194227h = "";

    /* renamed from: i */
    public long f194228i;

    /* renamed from: j */
    public int mo1004j() {
        return 24947;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194223d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194224e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194225f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194226g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194227h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194228i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194223d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194224e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MemberCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194225f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NoticeType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194226g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NoticeId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194227h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194228i);
        return stringBuffer.toString();
    }
}
