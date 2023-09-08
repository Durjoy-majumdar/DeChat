package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveEnterReplayStruct */
public final class LiveEnterReplayStruct extends C61103a {

    /* renamed from: d */
    public String f265646d = "";

    /* renamed from: e */
    public long f265647e;

    /* renamed from: f */
    public String f265648f = "";

    /* renamed from: g */
    public String f265649g = "";

    /* renamed from: h */
    public long f265650h;

    /* renamed from: i */
    public long f265651i;

    /* renamed from: j */
    public long f265652j;

    /* renamed from: k */
    public long f265653k;

    /* renamed from: l */
    public long f265654l;

    /* renamed from: j */
    public int mo1004j() {
        return 19897;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265646d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265647e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265648f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265649g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265650h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265651i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265652j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265653k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265654l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265646d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265647e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topic");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265648f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265649g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265650h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265651i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265652j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("replayStatusEnd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265653k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("replayStatusBegin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265654l);
        return stringBuffer.toString();
    }
}
