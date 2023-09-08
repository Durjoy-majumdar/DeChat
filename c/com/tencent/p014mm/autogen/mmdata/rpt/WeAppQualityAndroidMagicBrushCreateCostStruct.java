package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidMagicBrushCreateCostStruct */
public final class WeAppQualityAndroidMagicBrushCreateCostStruct extends C61103a {

    /* renamed from: d */
    public String f236671d = "";

    /* renamed from: e */
    public String f236672e = "";

    /* renamed from: f */
    public C80758a f236673f;

    /* renamed from: g */
    public long f236674g = 0;

    /* renamed from: h */
    public long f236675h = 0;

    /* renamed from: i */
    public long f236676i = 0;

    /* renamed from: j */
    public long f236677j = 0;

    /* renamed from: k */
    public long f236678k = 0;

    /* renamed from: l */
    public long f236679l = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidMagicBrushCreateCostStruct$a */
    public enum C80758a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236684d;

        /* access modifiers changed from: public */
        C80758a(int i) {
            this.f236684d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 17111;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236671d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236672e);
        stringBuffer.append(",");
        C80758a aVar = this.f236673f;
        stringBuffer.append(aVar != null ? aVar.f236684d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236674g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236675h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236676i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236677j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236678k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236679l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236671d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236672e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236673f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236674g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236675h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236676i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236677j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236678k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236679l);
        return stringBuffer.toString();
    }
}
