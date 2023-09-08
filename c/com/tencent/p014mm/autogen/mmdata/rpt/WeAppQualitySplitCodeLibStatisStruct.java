package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct */
public final class WeAppQualitySplitCodeLibStatisStruct extends C61103a {

    /* renamed from: d */
    public String f237123d = "";

    /* renamed from: e */
    public long f237124e = 0;

    /* renamed from: f */
    public C80775a f237125f;

    /* renamed from: g */
    public long f237126g = 0;

    /* renamed from: h */
    public String f237127h = "";

    /* renamed from: i */
    public long f237128i = 0;

    /* renamed from: j */
    public long f237129j = 0;

    /* renamed from: k */
    public String f237130k = "";

    /* renamed from: l */
    public String f237131l = "";

    /* renamed from: m */
    public long f237132m = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct$a */
    public enum C80775a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237137d;

        /* access modifiers changed from: public */
        C80775a(int i) {
            this.f237137d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 17120;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237123d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237124e);
        stringBuffer.append(",");
        C80775a aVar = this.f237125f;
        stringBuffer.append(aVar != null ? aVar.f237137d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237126g);
        stringBuffer.append(",");
        stringBuffer.append(this.f237127h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237128i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237129j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237130k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237131l);
        stringBuffer.append(",");
        stringBuffer.append(this.f237132m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237123d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237124e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237125f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237126g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Provider");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237127h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Version");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237128i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Stage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237129j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237130k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237131l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237132m);
        return stringBuffer.toString();
    }
}
