package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidPageContainerCostStruct */
public final class WeAppQualityAndroidPageContainerCostStruct extends C61103a {

    /* renamed from: d */
    public String f236685d = "";

    /* renamed from: e */
    public String f236686e = "";

    /* renamed from: f */
    public long f236687f = 0;

    /* renamed from: g */
    public C80759a f236688g;

    /* renamed from: h */
    public long f236689h = 0;

    /* renamed from: i */
    public long f236690i = 0;

    /* renamed from: j */
    public long f236691j = 0;

    /* renamed from: k */
    public long f236692k = 0;

    /* renamed from: l */
    public long f236693l = 0;

    /* renamed from: m */
    public long f236694m = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidPageContainerCostStruct$a */
    public enum C80759a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236699d;

        /* access modifiers changed from: public */
        C80759a(int i) {
            this.f236699d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16895;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236685d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236686e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236687f);
        stringBuffer.append(",");
        C80759a aVar = this.f236688g;
        stringBuffer.append(aVar != null ? aVar.f236699d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236689h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236690i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236691j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236692k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236693l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236694m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236685d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236686e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236687f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236688g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236689h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236690i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236691j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236692k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236693l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236694m);
        return stringBuffer.toString();
    }
}
