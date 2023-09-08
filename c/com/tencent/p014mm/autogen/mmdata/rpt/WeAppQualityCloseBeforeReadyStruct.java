package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCloseBeforeReadyStruct */
public final class WeAppQualityCloseBeforeReadyStruct extends C61103a {

    /* renamed from: d */
    public String f236774d = "";

    /* renamed from: e */
    public String f236775e = "";

    /* renamed from: f */
    public long f236776f = 0;

    /* renamed from: g */
    public C80764a f236777g;

    /* renamed from: h */
    public long f236778h = 0;

    /* renamed from: i */
    public long f236779i = 0;

    /* renamed from: j */
    public long f236780j = 0;

    /* renamed from: k */
    public long f236781k = 0;

    /* renamed from: l */
    public long f236782l = 0;

    /* renamed from: m */
    public String f236783m = "";

    /* renamed from: n */
    public long f236784n = 0;

    /* renamed from: o */
    public long f236785o = 0;

    /* renamed from: p */
    public String f236786p = "";

    /* renamed from: q */
    public long f236787q = 0;

    /* renamed from: r */
    public long f236788r = 0;

    /* renamed from: s */
    public long f236789s;

    /* renamed from: t */
    public long f236790t = 0;

    /* renamed from: u */
    public long f236791u = 0;

    /* renamed from: v */
    public long f236792v = 0;

    /* renamed from: w */
    public long f236793w = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCloseBeforeReadyStruct$a */
    public enum C80764a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236798d;

        /* access modifiers changed from: public */
        C80764a(int i) {
            this.f236798d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 18033;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236774d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236775e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236776f);
        stringBuffer.append(",");
        C80764a aVar = this.f236777g;
        stringBuffer.append(aVar != null ? aVar.f236798d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236778h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236779i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236780j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236781k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236782l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236783m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236784n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236785o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236786p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236787q);
        stringBuffer.append(",");
        stringBuffer.append(this.f236788r);
        stringBuffer.append(",");
        stringBuffer.append(this.f236789s);
        stringBuffer.append(",");
        stringBuffer.append(this.f236790t);
        stringBuffer.append(",");
        stringBuffer.append(this.f236791u);
        stringBuffer.append(",");
        stringBuffer.append(this.f236792v);
        stringBuffer.append(",");
        stringBuffer.append(this.f236793w);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236774d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236775e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236776f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236777g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236778h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236779i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236780j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236781k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236782l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236783m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isDownloadCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236784n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236785o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236786p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isContactSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236787q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isLaunchSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236788r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("phase");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236789s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("showAd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236790t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("checkShowAdTimeThreshold");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236791u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isCheckJsApiInfoSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236792v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isCheckAppidABTestInfoSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236793w);
        return stringBuffer.toString();
    }
}
