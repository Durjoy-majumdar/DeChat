package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WAAppTaskUpdateResultAfterVersionFallBackStruct */
public final class WAAppTaskUpdateResultAfterVersionFallBackStruct extends C61103a {

    /* renamed from: d */
    public String f236419d = "";

    /* renamed from: e */
    public String f236420e = "";

    /* renamed from: f */
    public String f236421f = "";

    /* renamed from: g */
    public long f236422g = 0;

    /* renamed from: h */
    public long f236423h = 0;

    /* renamed from: i */
    public long f236424i = 0;

    /* renamed from: j */
    public long f236425j = 0;

    /* renamed from: k */
    public long f236426k = 0;

    /* renamed from: l */
    public long f236427l = 0;

    /* renamed from: m */
    public String f236428m = "";

    /* renamed from: n */
    public long f236429n = 0;

    /* renamed from: o */
    public long f236430o = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 20579;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236419d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236420e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236421f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236422g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236423h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236424i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236425j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236426k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236427l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236428m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236429n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236430o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236419d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236420e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236421f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OpenScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236422g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TargetAppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236423h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalAppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236424i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UpdateResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236425j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UpdateCostTimeInMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236426k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FallbackWaitTimeInMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236427l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236428m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsWeakNet");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236429n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FallbackScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236430o);
        return stringBuffer.toString();
    }
}
