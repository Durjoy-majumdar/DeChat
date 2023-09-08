package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MvVideoPlayReportStruct */
public final class MvVideoPlayReportStruct extends C61103a {

    /* renamed from: d */
    public long f156689d;

    /* renamed from: e */
    public String f156690e = "";

    /* renamed from: f */
    public String f156691f = "";

    /* renamed from: g */
    public String f156692g = "";

    /* renamed from: h */
    public long f156693h;

    /* renamed from: i */
    public long f156694i;

    /* renamed from: j */
    public long f156695j;

    /* renamed from: k */
    public String f156696k = "";

    /* renamed from: l */
    public long f156697l;

    /* renamed from: j */
    public int mo1004j() {
        return 22222;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156689d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156690e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156691f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156692g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156693h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156694i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156695j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156696k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156697l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156689d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156690e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mvObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156691f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mvNonceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156692g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FirstFrameTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156693h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaittingCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156694i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156695j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoPlayInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156696k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoErrCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156697l);
        return stringBuffer.toString();
    }
}
