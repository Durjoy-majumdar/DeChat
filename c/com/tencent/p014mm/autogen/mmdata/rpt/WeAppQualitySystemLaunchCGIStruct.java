package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct */
public final class WeAppQualitySystemLaunchCGIStruct extends C61103a {

    /* renamed from: d */
    public String f237210d = "";

    /* renamed from: e */
    public String f237211e = "";

    /* renamed from: f */
    public long f237212f = 0;

    /* renamed from: g */
    public C80783a f237213g;

    /* renamed from: h */
    public long f237214h = 0;

    /* renamed from: i */
    public long f237215i = 0;

    /* renamed from: j */
    public long f237216j = 0;

    /* renamed from: k */
    public long f237217k = 0;

    /* renamed from: l */
    public long f237218l = 0;

    /* renamed from: m */
    public C80785c f237219m;

    /* renamed from: n */
    public C80784b f237220n;

    /* renamed from: o */
    public long f237221o = 0;

    /* renamed from: p */
    public long f237222p = 0;

    /* renamed from: q */
    public String f237223q = "";

    /* renamed from: r */
    public long f237224r = 0;

    /* renamed from: s */
    public String f237225s = "";

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct$a */
    public enum C80783a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237230d;

        /* access modifiers changed from: public */
        C80783a(int i) {
            this.f237230d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct$b */
    public enum C80784b {
        sync(0),
        async(1);
        

        /* renamed from: d */
        public final int f237234d;

        /* access modifiers changed from: public */
        C80784b(int i) {
            this.f237234d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct$c */
    public enum C80785c {
        ok(0),
        common_fail(1),
        bundle_null(2),
        jsapi_control_bytes_null(3);
        

        /* renamed from: d */
        public final int f237240d;

        /* access modifiers changed from: public */
        C80785c(int i) {
            this.f237240d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 15765;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237210d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237211e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237212f);
        stringBuffer.append(",");
        C80783a aVar = this.f237213g;
        int i = -1;
        stringBuffer.append(aVar != null ? aVar.f237230d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237214h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237215i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237216j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237217k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237218l);
        stringBuffer.append(",");
        C80785c cVar = this.f237219m;
        stringBuffer.append(cVar != null ? cVar.f237240d : -1);
        stringBuffer.append(",");
        C80784b bVar = this.f237220n;
        if (bVar != null) {
            i = bVar.f237234d;
        }
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237221o);
        stringBuffer.append(",");
        stringBuffer.append(this.f237222p);
        stringBuffer.append(",");
        stringBuffer.append(this.f237223q);
        stringBuffer.append(",");
        stringBuffer.append(this.f237224r);
        stringBuffer.append(",");
        stringBuffer.append(this.f237225s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237210d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237211e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237212f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237213g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237214h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237215i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237216j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237217k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237218l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Ret");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237219m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237220n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237221o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsNormalOpen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237222p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237223q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isParallel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237224r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkTypeStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237225s);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public WeAppQualitySystemLaunchCGIStruct mo112532s(C80784b bVar) {
        this.f237220n = bVar;
        return this;
    }

    /* renamed from: t */
    public WeAppQualitySystemLaunchCGIStruct mo112533t(long j) {
        this.f237221o = j;
        return this;
    }

    /* renamed from: u */
    public WeAppQualitySystemLaunchCGIStruct mo112534u(String str) {
        this.f237225s = mo86045b("NetworkTypeStr", str, true);
        return this;
    }
}
