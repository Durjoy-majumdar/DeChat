package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemJsApiInfoCGIStruct */
public final class WeAppQualitySystemJsApiInfoCGIStruct extends C61103a {

    /* renamed from: d */
    public String f237189d = "";

    /* renamed from: e */
    public String f237190e = "";

    /* renamed from: f */
    public long f237191f = 0;

    /* renamed from: g */
    public C80781a f237192g;

    /* renamed from: h */
    public long f237193h = 0;

    /* renamed from: i */
    public long f237194i = 0;

    /* renamed from: j */
    public long f237195j = 0;

    /* renamed from: k */
    public long f237196k = 0;

    /* renamed from: l */
    public long f237197l = 0;

    /* renamed from: m */
    public long f237198m = 0;

    /* renamed from: n */
    public C80782b f237199n;

    /* renamed from: o */
    public long f237200o = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemJsApiInfoCGIStruct$a */
    public enum C80781a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237205d;

        /* access modifiers changed from: public */
        C80781a(int i) {
            this.f237205d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemJsApiInfoCGIStruct$b */
    public enum C80782b {
        sync(0),
        async(1);
        

        /* renamed from: d */
        public final int f237209d;

        /* access modifiers changed from: public */
        C80782b(int i) {
            this.f237209d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 19986;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237189d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237190e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237191f);
        stringBuffer.append(",");
        C80781a aVar = this.f237192g;
        int i = -1;
        stringBuffer.append(aVar != null ? aVar.f237205d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237193h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237194i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237195j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237196k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237197l);
        stringBuffer.append(",");
        stringBuffer.append(this.f237198m);
        stringBuffer.append(",");
        C80782b bVar = this.f237199n;
        if (bVar != null) {
            i = bVar.f237209d;
        }
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237200o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237189d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237190e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237191f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237192g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237193h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237194i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237195j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237196k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237197l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Ret");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237198m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237199n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237200o);
        return stringBuffer.toString();
    }
}
