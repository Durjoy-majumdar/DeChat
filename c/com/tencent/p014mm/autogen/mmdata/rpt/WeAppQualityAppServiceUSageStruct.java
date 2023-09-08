package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct */
public final class WeAppQualityAppServiceUSageStruct extends C61103a {

    /* renamed from: d */
    public String f236748d = "";

    /* renamed from: e */
    public String f236749e = "";

    /* renamed from: f */
    public long f236750f = 0;

    /* renamed from: g */
    public C80763a f236751g;

    /* renamed from: h */
    public long f236752h = 0;

    /* renamed from: i */
    public long f236753i = 0;

    /* renamed from: j */
    public long f236754j = 0;

    /* renamed from: k */
    public long f236755k = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct$a */
    public enum C80763a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236760d;

        /* access modifiers changed from: public */
        C80763a(int i) {
            this.f236760d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16369;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236748d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236749e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236750f);
        stringBuffer.append(",");
        C80763a aVar = this.f236751g;
        stringBuffer.append(aVar != null ? aVar.f236760d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236752h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f236753i);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f236754j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236755k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236748d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236749e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236750f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236751g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236752h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236753i);
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
        stringBuffer.append(this.f236754j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236755k);
        return stringBuffer.toString();
    }
}
