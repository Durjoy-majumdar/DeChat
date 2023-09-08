package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GameWebPageTimeReportStruct */
public final class GameWebPageTimeReportStruct extends C61103a {

    /* renamed from: d */
    public int f107937d;

    /* renamed from: e */
    public long f107938e;

    /* renamed from: f */
    public String f107939f = "";

    /* renamed from: g */
    public long f107940g;

    /* renamed from: h */
    public int f107941h = 1;

    /* renamed from: i */
    public long f107942i;

    /* renamed from: j */
    public String f107943j = "";

    /* renamed from: k */
    public String f107944k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 27743;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107937d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107938e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107939f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107940g);
        stringBuffer.append(",");
        stringBuffer.append(this.f107941h);
        stringBuffer.append(",");
        stringBuffer.append(this.f107942i);
        stringBuffer.append(",");
        stringBuffer.append(this.f107943j);
        stringBuffer.append(",");
        stringBuffer.append(this.f107944k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107937d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SceneId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107938e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("session_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107939f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPDownloadProxyEnum.USER_SSID);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107940g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107941h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("client_timestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107942i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("URL");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107943j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("extern_info");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107944k);
        return stringBuffer.toString();
    }
}
