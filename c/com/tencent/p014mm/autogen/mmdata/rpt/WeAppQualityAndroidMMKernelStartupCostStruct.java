package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidMMKernelStartupCostStruct */
public final class WeAppQualityAndroidMMKernelStartupCostStruct extends C61103a {

    /* renamed from: d */
    public String f236656d = "";

    /* renamed from: e */
    public String f236657e = "";

    /* renamed from: f */
    public long f236658f = 0;

    /* renamed from: g */
    public C80757a f236659g;

    /* renamed from: h */
    public long f236660h = 0;

    /* renamed from: i */
    public long f236661i = 0;

    /* renamed from: j */
    public long f236662j = 0;

    /* renamed from: k */
    public long f236663k = 0;

    /* renamed from: l */
    public long f236664l = 0;

    /* renamed from: m */
    public long f236665m = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidMMKernelStartupCostStruct$a */
    public enum C80757a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236670d;

        /* access modifiers changed from: public */
        C80757a(int i) {
            this.f236670d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16900;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236656d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236657e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236658f);
        stringBuffer.append(",");
        C80757a aVar = this.f236659g;
        stringBuffer.append(aVar != null ? aVar.f236670d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236660h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236661i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236662j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236663k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236664l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236665m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236656d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236657e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236658f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236659g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236660h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236661i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236662j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236663k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236664l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BootstepType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236665m);
        return stringBuffer.toString();
    }
}
