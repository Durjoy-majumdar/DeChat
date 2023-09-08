package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryDownloadReportStruct */
public final class StoryDownloadReportStruct extends C61103a {

    /* renamed from: d */
    public String f266246d = "";

    /* renamed from: e */
    public String f266247e = "";

    /* renamed from: f */
    public String f266248f = "";

    /* renamed from: g */
    public long f266249g = 0;

    /* renamed from: h */
    public long f266250h = 0;

    /* renamed from: i */
    public long f266251i = 0;

    /* renamed from: j */
    public long f266252j = 0;

    /* renamed from: k */
    public long f266253k = 0;

    /* renamed from: l */
    public long f266254l = 0;

    /* renamed from: m */
    public long f266255m = 0;

    /* renamed from: n */
    public long f266256n = 0;

    /* renamed from: o */
    public long f266257o = 0;

    /* renamed from: p */
    public String f266258p = "";

    /* renamed from: q */
    public long f266259q = 0;

    /* renamed from: r */
    public long f266260r = 0;

    /* renamed from: s */
    public long f266261s = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16665;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266246d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266247e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266248f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266249g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266250h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266251i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266252j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266253k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266254l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266255m);
        stringBuffer.append(",");
        stringBuffer.append(this.f266256n);
        stringBuffer.append(",");
        stringBuffer.append(this.f266257o);
        stringBuffer.append(",");
        stringBuffer.append(this.f266258p);
        stringBuffer.append(",");
        stringBuffer.append(this.f266259q);
        stringBuffer.append(",");
        stringBuffer.append(this.f266260r);
        stringBuffer.append(",");
        stringBuffer.append(this.f266261s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Tid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266246d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266247e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266248f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadStartTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266249g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadEndTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266250h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266251i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266252j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoBitrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266253k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AudioBitrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266254l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoFps");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266255m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoWidth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266256n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoHeight");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266257o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CDNIp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266258p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginalAudioChannel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266259q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HadPreloadSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266260r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HadPreloadCompletion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266261s);
        return stringBuffer.toString();
    }
}
