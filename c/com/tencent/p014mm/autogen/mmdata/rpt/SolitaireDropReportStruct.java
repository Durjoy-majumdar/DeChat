package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SolitaireDropReportStruct */
public final class SolitaireDropReportStruct extends C61103a {

    /* renamed from: d */
    public String f194443d = "";

    /* renamed from: e */
    public String f194444e = "";

    /* renamed from: f */
    public long f194445f = 0;

    /* renamed from: g */
    public long f194446g = 0;

    /* renamed from: h */
    public String f194447h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18252;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194443d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194444e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194445f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194446g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194447h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194443d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LaunchUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194444e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194445f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_REASON);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194446g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Identifier");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194447h);
        return stringBuffer.toString();
    }
}
