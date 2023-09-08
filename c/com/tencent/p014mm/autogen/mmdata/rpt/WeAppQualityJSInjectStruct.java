package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityJSInjectStruct */
public final class WeAppQualityJSInjectStruct extends C61103a {

    /* renamed from: d */
    public String f236841d = "";

    /* renamed from: e */
    public String f236842e = "";

    /* renamed from: f */
    public long f236843f = 0;

    /* renamed from: g */
    public long f236844g = 0;

    /* renamed from: h */
    public long f236845h = 0;

    /* renamed from: i */
    public long f236846i = 0;

    /* renamed from: j */
    public long f236847j = 0;

    /* renamed from: k */
    public long f236848k = 0;

    /* renamed from: l */
    public long f236849l = 0;

    /* renamed from: m */
    public long f236850m = 0;

    /* renamed from: n */
    public String f236851n = "";

    /* renamed from: o */
    public long f236852o = 0;

    /* renamed from: p */
    public long f236853p = 0;

    /* renamed from: q */
    public long f236854q = 0;

    /* renamed from: r */
    public long f236855r = 0;

    /* renamed from: s */
    public String f236856s = "";

    /* renamed from: t */
    public String f236857t = "";

    /* renamed from: u */
    public String f236858u = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16007;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236841d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236842e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236843f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236844g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236845h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236846i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236847j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236848k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236849l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236850m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236851n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236852o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236853p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236854q);
        stringBuffer.append(",");
        stringBuffer.append(this.f236855r);
        stringBuffer.append(",");
        stringBuffer.append(this.f236856s);
        stringBuffer.append(",");
        stringBuffer.append(this.f236857t);
        stringBuffer.append(",");
        stringBuffer.append(this.f236858u);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236841d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236842e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236843f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236844g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236845h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236846i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236847j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236848k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236849l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236850m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236851n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236852o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useCodeCache");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236853p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useIsolatedContext");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236854q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("compileTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236855r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236856s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pluginAppid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236857t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pluginVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236858u);
        return stringBuffer.toString();
    }
}
