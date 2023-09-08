package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityRuntimeStateStruct */
public final class WeAppQualityRuntimeStateStruct extends C61103a {

    /* renamed from: d */
    public String f237023d = "";

    /* renamed from: e */
    public String f237024e = "";

    /* renamed from: f */
    public long f237025f = 0;

    /* renamed from: g */
    public C80772a f237026g;

    /* renamed from: h */
    public long f237027h = 0;

    /* renamed from: i */
    public long f237028i = 0;

    /* renamed from: j */
    public long f237029j = 0;

    /* renamed from: k */
    public long f237030k = 0;

    /* renamed from: l */
    public String f237031l = "";

    /* renamed from: m */
    public long f237032m = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityRuntimeStateStruct$a */
    public enum C80772a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237037d;

        /* access modifiers changed from: public */
        C80772a(int i) {
            this.f237037d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 18032;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237023d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237024e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237025f);
        stringBuffer.append(",");
        C80772a aVar = this.f237026g;
        stringBuffer.append(aVar != null ? aVar.f237037d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237027h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f237028i);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f237029j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237030k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237031l);
        stringBuffer.append(",");
        stringBuffer.append(this.f237032m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237023d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237024e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237025f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237026g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237027h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237028i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("processNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237029j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("runtimeNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237030k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("distribution");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237031l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mmtoolsAlive");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237032m);
        return stringBuffer.toString();
    }
}
