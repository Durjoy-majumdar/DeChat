package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityOpenStruct */
public final class WeAppQualityOpenStruct extends C61103a {

    /* renamed from: d */
    public String f236938d = "";

    /* renamed from: e */
    public String f236939e = "";

    /* renamed from: f */
    public long f236940f = 0;

    /* renamed from: g */
    public C80769a f236941g;

    /* renamed from: h */
    public long f236942h = 0;

    /* renamed from: i */
    public long f236943i = 0;

    /* renamed from: j */
    public long f236944j = 0;

    /* renamed from: k */
    public String f236945k = "";

    /* renamed from: l */
    public long f236946l = 0;

    /* renamed from: m */
    public String f236947m = "";

    /* renamed from: n */
    public long f236948n = 0;

    /* renamed from: o */
    public String f236949o = "";

    /* renamed from: p */
    public long f236950p;

    /* renamed from: q */
    public String f236951q = "";

    /* renamed from: r */
    public String f236952r = "";

    /* renamed from: s */
    public String f236953s = "";

    /* renamed from: t */
    public int f236954t;

    /* renamed from: u */
    public long f236955u;

    /* renamed from: v */
    public long f236956v;

    /* renamed from: w */
    public String f236957w = "";

    /* renamed from: x */
    public String f236958x = "";

    /* renamed from: y */
    public String f236959y = "";

    /* renamed from: z */
    public long f236960z;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityOpenStruct$a */
    public enum C80769a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236965d;

        /* access modifiers changed from: public */
        C80769a(int i) {
            this.f236965d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16367;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236938d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236939e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236940f);
        stringBuffer.append(",");
        C80769a aVar = this.f236941g;
        stringBuffer.append(aVar != null ? aVar.f236965d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236942h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f236943i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236944j);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f236945k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236946l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236947m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236948n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236949o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236950p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236951q);
        stringBuffer.append(",");
        stringBuffer.append(this.f236952r);
        stringBuffer.append(",");
        stringBuffer.append(this.f236953s);
        stringBuffer.append(",");
        stringBuffer.append(this.f236954t);
        stringBuffer.append(",");
        stringBuffer.append(this.f236955u);
        stringBuffer.append(",");
        stringBuffer.append(this.f236956v);
        stringBuffer.append(",");
        stringBuffer.append(this.f236957w);
        stringBuffer.append(",");
        stringBuffer.append(this.f236958x);
        stringBuffer.append(",");
        stringBuffer.append(this.f236959y);
        stringBuffer.append(",");
        stringBuffer.append(this.f236960z);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236938d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236939e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236940f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236941g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236942h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236943i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236944j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236945k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isLaunch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236946l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236947m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("loadingType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236948n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("scene_data");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236949o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("runningState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236950p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236951q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reload_referrer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236952r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reload_reason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236953s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("user_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236954t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("launchMode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236955u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("coldStartMode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236956v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("shortLink");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236957w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236958x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SceneNote");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236959y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WeakNetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236960z);
        return stringBuffer.toString();
    }
}
