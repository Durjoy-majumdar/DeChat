package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageframeInjectStruct */
public final class WeAppQualityPageframeInjectStruct extends C61103a {

    /* renamed from: d */
    public String f236996d = "";

    /* renamed from: e */
    public String f236997e = "";

    /* renamed from: f */
    public long f236998f = 0;

    /* renamed from: g */
    public C80771a f236999g;

    /* renamed from: h */
    public long f237000h = 0;

    /* renamed from: i */
    public long f237001i = 0;

    /* renamed from: j */
    public long f237002j = 0;

    /* renamed from: k */
    public long f237003k = 0;

    /* renamed from: l */
    public long f237004l = 0;

    /* renamed from: m */
    public String f237005m = "";

    /* renamed from: n */
    public long f237006n = 0;

    /* renamed from: o */
    public long f237007o = 0;

    /* renamed from: p */
    public long f237008p = 0;

    /* renamed from: q */
    public String f237009q = "";

    /* renamed from: r */
    public String f237010r = "";

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageframeInjectStruct$a */
    public enum C80771a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237015d;

        /* access modifiers changed from: public */
        C80771a(int i) {
            this.f237015d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16005;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236996d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236997e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236998f);
        stringBuffer.append(",");
        C80771a aVar = this.f236999g;
        stringBuffer.append(aVar != null ? aVar.f237015d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237000h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237001i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237002j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237003k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237004l);
        stringBuffer.append(",");
        stringBuffer.append(this.f237005m);
        stringBuffer.append(",");
        stringBuffer.append(this.f237006n);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f237007o);
        stringBuffer.append(",");
        stringBuffer.append(this.f237008p);
        stringBuffer.append(",");
        stringBuffer.append(this.f237009q);
        stringBuffer.append(",");
        stringBuffer.append(this.f237010r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236996d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236997e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236998f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236999g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237000h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237001i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237002j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237003k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237004l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("package");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237005m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237006n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreloadPageFrame");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useCodeCache");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237007o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237008p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237009q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lazyLoadKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237010r);
        return stringBuffer.toString();
    }
}
