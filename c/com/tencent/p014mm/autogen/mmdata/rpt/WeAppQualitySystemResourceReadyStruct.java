package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemResourceReadyStruct */
public final class WeAppQualitySystemResourceReadyStruct extends C61103a {

    /* renamed from: A */
    public long f237253A;

    /* renamed from: B */
    public String f237254B = "";

    /* renamed from: C */
    public C80790d f237255C;

    /* renamed from: D */
    public long f237256D;

    /* renamed from: d */
    public String f237257d = "";

    /* renamed from: e */
    public String f237258e = "";

    /* renamed from: f */
    public long f237259f = 0;

    /* renamed from: g */
    public C80787a f237260g;

    /* renamed from: h */
    public long f237261h = 0;

    /* renamed from: i */
    public long f237262i = 0;

    /* renamed from: j */
    public long f237263j = 0;

    /* renamed from: k */
    public long f237264k = 0;

    /* renamed from: l */
    public long f237265l = 0;

    /* renamed from: m */
    public long f237266m = 0;

    /* renamed from: n */
    public C80789c f237267n;

    /* renamed from: o */
    public C80788b f237268o;

    /* renamed from: p */
    public long f237269p = 0;

    /* renamed from: q */
    public long f237270q = 0;

    /* renamed from: r */
    public long f237271r = 0;

    /* renamed from: s */
    public long f237272s = 0;

    /* renamed from: t */
    public long f237273t = 0;

    /* renamed from: u */
    public long f237274u;

    /* renamed from: v */
    public long f237275v;

    /* renamed from: w */
    public long f237276w;

    /* renamed from: x */
    public long f237277x;

    /* renamed from: y */
    public C80791e f237278y;

    /* renamed from: z */
    public long f237279z;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemResourceReadyStruct$a */
    public enum C80787a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237284d;

        /* access modifiers changed from: public */
        C80787a(int i) {
            this.f237284d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemResourceReadyStruct$b */
    public enum C80788b {
        sync(0),
        unsync(1);
        

        /* renamed from: d */
        public final int f237288d;

        /* access modifiers changed from: public */
        C80788b(int i) {
            this.f237288d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemResourceReadyStruct$c */
    public enum C80789c {
        sync(0),
        unsync(1);
        

        /* renamed from: d */
        public final int f237292d;

        /* access modifiers changed from: public */
        C80789c(int i) {
            this.f237292d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemResourceReadyStruct$d */
    public enum C80790d {
        sync(0),
        unsync(1);
        

        /* renamed from: d */
        public final int f237296d;

        /* access modifiers changed from: public */
        C80790d(int i) {
            this.f237296d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemResourceReadyStruct$e */
    public enum C80791e {
        sync(0),
        unsync(1);
        

        /* renamed from: d */
        public final int f237300d;

        /* access modifiers changed from: public */
        C80791e(int i) {
            this.f237300d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 15766;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237257d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237258e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237259f);
        stringBuffer.append(",");
        C80787a aVar = this.f237260g;
        int i = -1;
        stringBuffer.append(aVar != null ? aVar.f237284d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237261h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237262i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237263j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237264k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237265l);
        stringBuffer.append(",");
        stringBuffer.append(this.f237266m);
        stringBuffer.append(",");
        C80789c cVar = this.f237267n;
        stringBuffer.append(cVar != null ? cVar.f237292d : -1);
        stringBuffer.append(",");
        C80788b bVar = this.f237268o;
        stringBuffer.append(bVar != null ? bVar.f237288d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237269p);
        stringBuffer.append(",");
        stringBuffer.append(this.f237270q);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f237271r);
        stringBuffer.append(",");
        stringBuffer.append(this.f237272s);
        stringBuffer.append(",");
        stringBuffer.append(this.f237273t);
        stringBuffer.append(",");
        stringBuffer.append(this.f237274u);
        stringBuffer.append(",");
        stringBuffer.append(this.f237275v);
        stringBuffer.append(",");
        stringBuffer.append(this.f237276w);
        stringBuffer.append(",");
        stringBuffer.append(this.f237277x);
        stringBuffer.append(",");
        C80791e eVar = this.f237278y;
        stringBuffer.append(eVar != null ? eVar.f237300d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237279z);
        stringBuffer.append(",");
        stringBuffer.append(this.f237253A);
        stringBuffer.append(",");
        stringBuffer.append(this.f237254B);
        stringBuffer.append(",");
        C80790d dVar = this.f237255C;
        if (dVar != null) {
            i = dVar.f237296d;
        }
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237256D);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237257d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237258e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237259f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237260g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237261h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237262i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237263j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237264k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237265l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PkgSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237266m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsLaunchSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237267n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsContactSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237268o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237269p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasDownloadCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237270q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFirstDownload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LaunchType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237271r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NonUICostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237272s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("initProcess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237273t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("launchReadyT");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237274u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("packageReadyT");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237275v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UIReadyT");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237276w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("requestType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237277x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isCheckJsApiInfoSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237278y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("checkJsApiInfoReadyT");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237279z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("runningState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237253A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkTypeStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237254B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isCheckAppidABTestInfoSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237255C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("checkAppidABTestInfoReadyT");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237256D);
        return stringBuffer.toString();
    }
}
