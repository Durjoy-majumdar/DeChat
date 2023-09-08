package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageHtmlInjectStruct */
public final class WeAppQualityPageHtmlInjectStruct extends C61103a {

    /* renamed from: d */
    public String f236976d = "";

    /* renamed from: e */
    public String f236977e = "";

    /* renamed from: f */
    public long f236978f = 0;

    /* renamed from: g */
    public C80770a f236979g;

    /* renamed from: h */
    public long f236980h = 0;

    /* renamed from: i */
    public long f236981i = 0;

    /* renamed from: j */
    public long f236982j = 0;

    /* renamed from: k */
    public long f236983k = 0;

    /* renamed from: l */
    public long f236984l = 0;

    /* renamed from: m */
    public String f236985m = "";

    /* renamed from: n */
    public String f236986n = "";

    /* renamed from: o */
    public long f236987o = 0;

    /* renamed from: p */
    public long f236988p = 0;

    /* renamed from: q */
    public long f236989q = 0;

    /* renamed from: r */
    public String f236990r = "";

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageHtmlInjectStruct$a */
    public enum C80770a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236995d;

        /* access modifiers changed from: public */
        C80770a(int i) {
            this.f236995d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16006;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236976d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236977e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236978f);
        stringBuffer.append(",");
        C80770a aVar = this.f236979g;
        stringBuffer.append(aVar != null ? aVar.f236995d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236980h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236981i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236982j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236983k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236984l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236985m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236986n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236987o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236988p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236989q);
        stringBuffer.append(",");
        stringBuffer.append(this.f236990r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236976d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236977e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236978f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236979g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236980h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236981i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236982j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236983k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236984l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236985m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("referrer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236986n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236987o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useCodeCache");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236988p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236989q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("engineVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236990r);
        return stringBuffer.toString();
    }
}
