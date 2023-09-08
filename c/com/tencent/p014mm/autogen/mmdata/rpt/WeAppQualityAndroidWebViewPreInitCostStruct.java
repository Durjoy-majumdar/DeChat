package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidWebViewPreInitCostStruct */
public final class WeAppQualityAndroidWebViewPreInitCostStruct extends C61103a {

    /* renamed from: d */
    public String f236715d = "";

    /* renamed from: e */
    public String f236716e = "";

    /* renamed from: f */
    public long f236717f = 0;

    /* renamed from: g */
    public C80761a f236718g;

    /* renamed from: h */
    public long f236719h = 0;

    /* renamed from: i */
    public long f236720i = 0;

    /* renamed from: j */
    public long f236721j = 0;

    /* renamed from: k */
    public long f236722k = 0;

    /* renamed from: l */
    public long f236723l = 0;

    /* renamed from: m */
    public long f236724m = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidWebViewPreInitCostStruct$a */
    public enum C80761a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236729d;

        /* access modifiers changed from: public */
        C80761a(int i) {
            this.f236729d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16899;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236715d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236716e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236717f);
        stringBuffer.append(",");
        C80761a aVar = this.f236718g;
        stringBuffer.append(aVar != null ? aVar.f236729d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236719h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236720i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236721j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236722k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236723l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236724m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236715d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236716e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236717f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236718g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236719h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236720i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236721j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236722k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236723l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236724m);
        return stringBuffer.toString();
    }
}
