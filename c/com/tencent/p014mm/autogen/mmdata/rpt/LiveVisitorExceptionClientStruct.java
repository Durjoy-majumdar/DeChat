package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveVisitorExceptionClientStruct */
public final class LiveVisitorExceptionClientStruct extends C61103a {

    /* renamed from: d */
    public String f156467d = "";

    /* renamed from: e */
    public long f156468e;

    /* renamed from: f */
    public String f156469f = "";

    /* renamed from: g */
    public long f156470g;

    /* renamed from: h */
    public long f156471h;

    /* renamed from: i */
    public long f156472i;

    /* renamed from: j */
    public long f156473j;

    /* renamed from: k */
    public long f156474k;

    /* renamed from: l */
    public long f156475l;

    /* renamed from: m */
    public String f156476m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21505;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156467d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156468e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156469f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156470g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156471h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156472i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156473j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156474k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156475l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156476m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("moduleName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156467d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eventCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156468e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eventMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156469f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156470g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156471h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156472i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("anchorSEITimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156473j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("audienceSEITimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156474k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sdkliveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156475l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156476m);
        return stringBuffer.toString();
    }
}
