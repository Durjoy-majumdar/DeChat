package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct */
public final class WeAppQualitySystemContactCGIStruct extends C61103a {

    /* renamed from: d */
    public String f237138d = "";

    /* renamed from: e */
    public String f237139e = "";

    /* renamed from: f */
    public long f237140f = 0;

    /* renamed from: g */
    public C80776a f237141g;

    /* renamed from: h */
    public long f237142h = 0;

    /* renamed from: i */
    public long f237143i = 0;

    /* renamed from: j */
    public long f237144j = 0;

    /* renamed from: k */
    public long f237145k = 0;

    /* renamed from: l */
    public long f237146l = 0;

    /* renamed from: m */
    public C80778c f237147m;

    /* renamed from: n */
    public C80777b f237148n;

    /* renamed from: o */
    public long f237149o = 0;

    /* renamed from: p */
    public String f237150p = "";

    /* renamed from: q */
    public String f237151q = "";

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct$a */
    public enum C80776a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237156d;

        /* access modifiers changed from: public */
        C80776a(int i) {
            this.f237156d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct$b */
    public enum C80777b {
        sync(0),
        async(1);
        

        /* renamed from: d */
        public final int f237160d;

        /* access modifiers changed from: public */
        C80777b(int i) {
            this.f237160d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct$c */
    public enum C80778c {
        ok(0),
        common_fail(1);
        

        /* renamed from: d */
        public final int f237164d;

        /* access modifiers changed from: public */
        C80778c(int i) {
            this.f237164d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 15764;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237138d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237139e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237140f);
        stringBuffer.append(",");
        C80776a aVar = this.f237141g;
        int i = -1;
        stringBuffer.append(aVar != null ? aVar.f237156d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237142h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237143i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237144j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237145k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237146l);
        stringBuffer.append(",");
        C80778c cVar = this.f237147m;
        stringBuffer.append(cVar != null ? cVar.f237164d : -1);
        stringBuffer.append(",");
        C80777b bVar = this.f237148n;
        if (bVar != null) {
            i = bVar.f237160d;
        }
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237149o);
        stringBuffer.append(",");
        stringBuffer.append(this.f237150p);
        stringBuffer.append(",");
        stringBuffer.append(this.f237151q);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237138d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237139e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237140f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237141g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237142h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237143i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237144j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237145k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237146l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Ret");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237147m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237148n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237149o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237150p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkTypeStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237151q);
        return stringBuffer.toString();
    }
}
