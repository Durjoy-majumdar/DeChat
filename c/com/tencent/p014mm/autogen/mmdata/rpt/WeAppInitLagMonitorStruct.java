package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppInitLagMonitorStruct */
public final class WeAppInitLagMonitorStruct extends C61103a {

    /* renamed from: d */
    public String f236592d = "";

    /* renamed from: e */
    public long f236593e = 0;

    /* renamed from: f */
    public C80752a f236594f;

    /* renamed from: g */
    public long f236595g = 0;

    /* renamed from: h */
    public long f236596h = 0;

    /* renamed from: i */
    public String f236597i = "";

    /* renamed from: j */
    public String f236598j = "";

    /* renamed from: k */
    public String f236599k = "";

    /* renamed from: l */
    public String f236600l = "";

    /* renamed from: m */
    public String f236601m = "";

    /* renamed from: n */
    public long f236602n;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppInitLagMonitorStruct$a */
    public enum C80752a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236607d;

        /* access modifiers changed from: public */
        C80752a(int i) {
            this.f236607d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 27224;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236592d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236593e);
        stringBuffer.append(",");
        C80752a aVar = this.f236594f;
        stringBuffer.append(aVar != null ? aVar.f236607d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236595g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236596h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236597i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236598j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236599k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236600l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236601m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236602n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236592d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236593e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236594f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236595g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236596h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236597i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProcessName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236598j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ThreadName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236599k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Stack");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236600l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StackID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236601m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LagThreshold");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236602n);
        return stringBuffer.toString();
    }
}
