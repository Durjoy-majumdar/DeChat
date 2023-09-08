package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct */
public final class WeAppQualityWebviewUsageStruct extends C61103a {

    /* renamed from: d */
    public String f237357d = "";

    /* renamed from: e */
    public String f237358e = "";

    /* renamed from: f */
    public long f237359f = 0;

    /* renamed from: g */
    public C80794a f237360g;

    /* renamed from: h */
    public long f237361h = 0;

    /* renamed from: i */
    public long f237362i = 0;

    /* renamed from: j */
    public long f237363j = 0;

    /* renamed from: k */
    public long f237364k = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct$a */
    public enum C80794a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237369d;

        /* access modifiers changed from: public */
        C80794a(int i) {
            this.f237369d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16368;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237357d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237358e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237359f);
        stringBuffer.append(",");
        C80794a aVar = this.f237360g;
        stringBuffer.append(aVar != null ? aVar.f237369d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237361h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f237362i);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f237363j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237364k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237357d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237358e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237359f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237360g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237361h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237362i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237363j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237364k);
        return stringBuffer.toString();
    }
}
