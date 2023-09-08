package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescStruct */
public final class ViewRoomDescStruct extends C61103a {

    /* renamed from: d */
    public String f194654d = "";

    /* renamed from: e */
    public long f194655e;

    /* renamed from: f */
    public long f194656f;

    /* renamed from: g */
    public long f194657g;

    /* renamed from: h */
    public long f194658h;

    /* renamed from: i */
    public String f194659i = "";

    /* renamed from: j */
    public long f194660j;

    /* renamed from: j */
    public int mo1004j() {
        return 22600;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194654d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194655e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194656f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194657g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194658h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194659i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194660j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194654d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194655e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MemberCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194656f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isMuteRoom");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194657g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194658h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NoticeId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194659i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NoticeType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194660j);
        return stringBuffer.toString();
    }
}
