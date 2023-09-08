package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceInitStruct */
public final class WeAppQualityAppServiceInitStruct extends C61103a {

    /* renamed from: d */
    public String f236730d = "";

    /* renamed from: e */
    public String f236731e = "";

    /* renamed from: f */
    public long f236732f = 0;

    /* renamed from: g */
    public C80762a f236733g;

    /* renamed from: h */
    public long f236734h = 0;

    /* renamed from: i */
    public long f236735i = 0;

    /* renamed from: j */
    public long f236736j = 0;

    /* renamed from: k */
    public long f236737k = 0;

    /* renamed from: l */
    public long f236738l = 0;

    /* renamed from: m */
    public long f236739m = 0;

    /* renamed from: n */
    public long f236740n = 0;

    /* renamed from: o */
    public long f236741o = 0;

    /* renamed from: p */
    public String f236742p = "";

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceInitStruct$a */
    public enum C80762a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236747d;

        /* access modifiers changed from: public */
        C80762a(int i) {
            this.f236747d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 15814;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236730d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236731e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236732f);
        stringBuffer.append(",");
        C80762a aVar = this.f236733g;
        stringBuffer.append(aVar != null ? aVar.f236747d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236734h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236735i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236736j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236737k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236738l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236739m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236740n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236741o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236742p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236730d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236731e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236732f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236733g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236734h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236735i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236736j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236737k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236738l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236739m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236740n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isGame");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236741o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236742p);
        return stringBuffer.toString();
    }
}
