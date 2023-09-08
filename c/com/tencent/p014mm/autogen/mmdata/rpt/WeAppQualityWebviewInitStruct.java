package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewInitStruct */
public final class WeAppQualityWebviewInitStruct extends C61103a {

    /* renamed from: d */
    public String f237317d = "";

    /* renamed from: e */
    public String f237318e = "";

    /* renamed from: f */
    public long f237319f = 0;

    /* renamed from: g */
    public C80792a f237320g;

    /* renamed from: h */
    public long f237321h = 0;

    /* renamed from: i */
    public long f237322i = 0;

    /* renamed from: j */
    public long f237323j = 0;

    /* renamed from: k */
    public long f237324k = 0;

    /* renamed from: l */
    public long f237325l = 0;

    /* renamed from: m */
    public long f237326m = 0;

    /* renamed from: n */
    public long f237327n = 0;

    /* renamed from: o */
    public long f237328o = 0;

    /* renamed from: p */
    public String f237329p = "";

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewInitStruct$a */
    public enum C80792a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237334d;

        /* access modifiers changed from: public */
        C80792a(int i) {
            this.f237334d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 15813;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237317d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237318e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237319f);
        stringBuffer.append(",");
        C80792a aVar = this.f237320g;
        stringBuffer.append(aVar != null ? aVar.f237334d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237321h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237322i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237323j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237324k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237325l);
        stringBuffer.append(",");
        stringBuffer.append(this.f237326m);
        stringBuffer.append(",");
        stringBuffer.append(this.f237327n);
        stringBuffer.append(",");
        stringBuffer.append(this.f237328o);
        stringBuffer.append(",");
        stringBuffer.append(this.f237329p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237317d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237318e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237319f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237320g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237321h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237322i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237323j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237324k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237325l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237326m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237327n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237328o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineVersionStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237329p);
        return stringBuffer.toString();
    }
}
