package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonDetailActivityInfoStruct */
public final class EmoticonDetailActivityInfoStruct extends C61103a {

    /* renamed from: d */
    public String f265454d = "";

    /* renamed from: e */
    public long f265455e;

    /* renamed from: f */
    public long f265456f;

    /* renamed from: g */
    public long f265457g;

    /* renamed from: j */
    public int mo1004j() {
        return 23532;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265454d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265455e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265456f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265457g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("pid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265454d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265455e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("channelLinkExposure");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265456f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("channelLinkClick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265457g);
        return stringBuffer.toString();
    }
}
