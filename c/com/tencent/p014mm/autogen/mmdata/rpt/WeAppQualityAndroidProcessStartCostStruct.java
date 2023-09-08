package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidProcessStartCostStruct */
public final class WeAppQualityAndroidProcessStartCostStruct extends C61103a {

    /* renamed from: d */
    public String f236700d = "";

    /* renamed from: e */
    public String f236701e = "";

    /* renamed from: f */
    public long f236702f = 0;

    /* renamed from: g */
    public C80760a f236703g;

    /* renamed from: h */
    public long f236704h = 0;

    /* renamed from: i */
    public long f236705i = 0;

    /* renamed from: j */
    public long f236706j = 0;

    /* renamed from: k */
    public long f236707k = 0;

    /* renamed from: l */
    public long f236708l = 0;

    /* renamed from: m */
    public long f236709m = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidProcessStartCostStruct$a */
    public enum C80760a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236714d;

        /* access modifiers changed from: public */
        C80760a(int i) {
            this.f236714d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16898;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236700d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236701e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236702f);
        stringBuffer.append(",");
        C80760a aVar = this.f236703g;
        stringBuffer.append(aVar != null ? aVar.f236714d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236704h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236705i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236706j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236707k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236708l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236709m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236700d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236701e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236702f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236703g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236704h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236705i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236706j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236707k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236708l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isFromAndroidRecents");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236709m);
        return stringBuffer.toString();
    }
}
