package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct */
public final class WeAppQualityLibInjectStruct extends C61103a {

    /* renamed from: d */
    public String f236918d = "";

    /* renamed from: e */
    public String f236919e = "";

    /* renamed from: f */
    public long f236920f = 0;

    /* renamed from: g */
    public long f236921g = 0;

    /* renamed from: h */
    public long f236922h = 0;

    /* renamed from: i */
    public long f236923i = 0;

    /* renamed from: j */
    public long f236924j = 0;

    /* renamed from: k */
    public long f236925k = 0;

    /* renamed from: l */
    public long f236926l = 0;

    /* renamed from: m */
    public long f236927m = 0;

    /* renamed from: n */
    public String f236928n = "";

    /* renamed from: o */
    public String f236929o = "";

    /* renamed from: p */
    public long f236930p = 0;

    /* renamed from: q */
    public long f236931q = 0;

    /* renamed from: r */
    public long f236932r = 0;

    /* renamed from: s */
    public long f236933s = 0;

    /* renamed from: t */
    public long f236934t = 0;

    /* renamed from: u */
    public String f236935u = "";

    /* renamed from: v */
    public long f236936v = 0;

    /* renamed from: w */
    public String f236937w = "";

    /* renamed from: j */
    public int mo1004j() {
        return 15815;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236918d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236919e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236920f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236921g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236922h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236923i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236924j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236925k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236926l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236927m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236928n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236929o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236930p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236931q);
        stringBuffer.append(",");
        stringBuffer.append(this.f236932r);
        stringBuffer.append(",");
        stringBuffer.append(this.f236933s);
        stringBuffer.append(",");
        stringBuffer.append(this.f236934t);
        stringBuffer.append(",");
        stringBuffer.append(this.f236935u);
        stringBuffer.append(",");
        stringBuffer.append(this.f236936v);
        stringBuffer.append(",");
        stringBuffer.append(this.f236937w);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236918d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236919e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236920f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236921g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236922h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236923i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236924j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236925k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236926l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236927m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(DownloadInfo.FILENAME);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236928n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("libVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236929o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236930p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236931q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useCodeCache");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236932r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useIsolatedContext");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236933s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("compileTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236934t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236935u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("codeCacheType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236936v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("expt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236937w);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public WeAppQualityLibInjectStruct mo112531s(String str) {
        this.f236928n = mo86045b(DownloadInfo.FILENAME, str, true);
        return this;
    }
}
