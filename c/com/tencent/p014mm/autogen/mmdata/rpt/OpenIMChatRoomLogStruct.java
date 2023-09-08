package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct */
public final class OpenIMChatRoomLogStruct extends C61103a {

    /* renamed from: d */
    public String f194302d = "";

    /* renamed from: e */
    public long f194303e = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 15848;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194302d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194303e);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("chatRoomUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194302d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194303e);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public OpenIMChatRoomLogStruct mo93194s(String str) {
        this.f194302d = mo86045b("chatRoomUserName", str, true);
        return this;
    }

    /* renamed from: t */
    public OpenIMChatRoomLogStruct mo93195t(long j) {
        this.f194303e = j;
        return this;
    }
}
