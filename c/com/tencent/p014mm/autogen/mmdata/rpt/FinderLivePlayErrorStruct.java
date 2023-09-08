package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct */
public final class FinderLivePlayErrorStruct extends C61103a {

    /* renamed from: d */
    public String f155580d = "";

    /* renamed from: e */
    public int f155581e;

    /* renamed from: f */
    public String f155582f = "";

    /* renamed from: g */
    public String f155583g = "";

    /* renamed from: h */
    public String f155584h = "";

    /* renamed from: i */
    public long f155585i;

    /* renamed from: j */
    public int mo1004j() {
        return 26088;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155580d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155581e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155582f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155583g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155584h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155585i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155580d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eventCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155581e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("errMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155582f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155583g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("nickname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155584h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("innerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155585i);
        return stringBuffer.toString();
    }
}
