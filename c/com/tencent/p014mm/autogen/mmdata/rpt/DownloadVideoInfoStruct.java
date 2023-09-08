package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DownloadVideoInfoStruct */
public final class DownloadVideoInfoStruct extends C61103a {

    /* renamed from: d */
    public String f265399d = "";

    /* renamed from: e */
    public String f265400e = "";

    /* renamed from: f */
    public long f265401f = 0;

    /* renamed from: g */
    public String f265402g = "";

    /* renamed from: h */
    public String f265403h = "";

    /* renamed from: i */
    public int f265404i = 0;

    /* renamed from: j */
    public String f265405j = "";

    /* renamed from: k */
    public long f265406k = 0;

    /* renamed from: l */
    public long f265407l = 0;

    /* renamed from: m */
    public long f265408m = 0;

    /* renamed from: n */
    public long f265409n = 0;

    /* renamed from: o */
    public long f265410o = 0;

    /* renamed from: p */
    public long f265411p = 0;

    /* renamed from: q */
    public long f265412q = 0;

    /* renamed from: r */
    public long f265413r = 0;

    /* renamed from: s */
    public long f265414s = 0;

    /* renamed from: t */
    public String f265415t = "";

    /* renamed from: u */
    public long f265416u = 0;

    /* renamed from: v */
    public long f265417v = 0;

    /* renamed from: w */
    public long f265418w = 0;

    /* renamed from: x */
    public String f265419x = "";

    public DownloadVideoInfoStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 13795;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265399d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265400e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265401f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265402g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265403h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265404i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265405j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265406k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265407l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265408m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265409n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265410o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265411p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265412q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265413r);
        stringBuffer.append(",");
        stringBuffer.append(this.f265414s);
        stringBuffer.append(",");
        stringBuffer.append(this.f265415t);
        stringBuffer.append(",");
        stringBuffer.append(this.f265416u);
        stringBuffer.append(",");
        stringBuffer.append(this.f265417v);
        stringBuffer.append(",");
        stringBuffer.append(this.f265418w);
        stringBuffer.append(",");
        stringBuffer.append(this.f265419x);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FromUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265399d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Session");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265400e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265401f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265402g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnsUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265403h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265404i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265405j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadStartTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265406k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadEndTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265407l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265408m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265409n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoBitrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265410o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AudioBitrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265411p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoFps");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265412q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoWidth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265413r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoHeight");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265414s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CDNIp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265415t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginalAudioChannel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265416u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HadPreloadSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265417v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HadPreloadCompletion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265418w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Publishid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265419x);
        return stringBuffer.toString();
    }

    public DownloadVideoInfoStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 21) {
                String[] strArr = new String[21];
                Arrays.fill(strArr, 0, 21, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f265399d = mo86045b("FromUser", split[0], true);
            this.f265400e = mo86045b("Session", split[1], true);
            this.f265401f = mo86051k(split[2]);
            this.f265402g = mo86045b("FileId", split[3], true);
            this.f265403h = mo86045b("SnsUrl", split[4], true);
            this.f265404i = Util.getInt(split[5], 0);
            this.f265405j = mo86045b("NewMd5", split[6], true);
            this.f265406k = mo86051k(split[7]);
            this.f265407l = mo86051k(split[8]);
            this.f265408m = mo86051k(split[9]);
            this.f265409n = mo86051k(split[10]);
            this.f265410o = mo86051k(split[11]);
            this.f265411p = mo86051k(split[12]);
            this.f265412q = mo86051k(split[13]);
            this.f265413r = mo86051k(split[14]);
            this.f265414s = mo86051k(split[15]);
            this.f265415t = mo86045b("CDNIp", split[16], true);
            this.f265416u = mo86051k(split[17]);
            this.f265417v = mo86051k(split[18]);
            this.f265418w = mo86051k(split[19]);
            this.f265419x = mo86045b("Publishid", split[20], true);
        }
    }
}
