package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MvVideoEditPlayReportStruct */
public final class MvVideoEditPlayReportStruct extends C61103a {

    /* renamed from: d */
    public long f156678d;

    /* renamed from: e */
    public String f156679e = "";

    /* renamed from: f */
    public String f156680f = "";

    /* renamed from: g */
    public String f156681g = "";

    /* renamed from: h */
    public int f156682h;

    /* renamed from: i */
    public int f156683i;

    /* renamed from: j */
    public int f156684j;

    /* renamed from: k */
    public long f156685k;

    /* renamed from: l */
    public long f156686l;

    /* renamed from: m */
    public long f156687m;

    /* renamed from: n */
    public long f156688n;

    /* renamed from: j */
    public int mo1004j() {
        return 22278;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156678d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156679e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156680f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156681g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156682h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156683i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156684j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156685k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156686l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156687m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156688n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156678d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156679e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mvObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156680f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mvNonceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156681g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mvIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156682h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isChanged");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156683i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isLocal");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156684j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FirstFrameTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156685k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaitCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156686l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayErrType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156687m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayErrCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156688n);
        return stringBuffer.toString();
    }
}
