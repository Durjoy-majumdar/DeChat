package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WAPrefetchHitPkgStruct */
public final class WAPrefetchHitPkgStruct extends C61103a {

    /* renamed from: d */
    public String f236520d = "";

    /* renamed from: e */
    public String f236521e = "";

    /* renamed from: f */
    public long f236522f = 0;

    /* renamed from: g */
    public long f236523g = 0;

    /* renamed from: h */
    public long f236524h = 0;

    /* renamed from: i */
    public long f236525i;

    /* renamed from: j */
    public String f236526j = "";

    /* renamed from: k */
    public String f236527k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16634;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236520d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236521e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236522f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236523g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236524h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236525i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236526j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236527k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236520d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236521e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236522f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFirstHit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236523g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReportId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236524h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PackageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236525i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ModuleName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236526j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236527k);
        return stringBuffer.toString();
    }
}
