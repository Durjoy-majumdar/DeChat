package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct */
public final class ViewRoomDescTipsStruct extends C61103a {

    /* renamed from: d */
    public String f194661d = "";

    /* renamed from: e */
    public long f194662e;

    /* renamed from: f */
    public long f194663f;

    /* renamed from: g */
    public long f194664g;

    /* renamed from: h */
    public String f194665h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22613;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194661d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194662e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194663f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194664g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194665h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194661d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194662e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MemberCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194663f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194664g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NoticeId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194665h);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public ViewRoomDescTipsStruct mo93200s(String str) {
        this.f194661d = mo86045b("ChatName", str, true);
        return this;
    }

    /* renamed from: t */
    public ViewRoomDescTipsStruct mo93201t(String str) {
        this.f194665h = mo86045b("NoticeId", str, true);
        return this;
    }
}
