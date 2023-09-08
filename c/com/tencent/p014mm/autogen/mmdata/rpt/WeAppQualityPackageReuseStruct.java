package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPackageReuseStruct */
public final class WeAppQualityPackageReuseStruct extends C61103a {

    /* renamed from: d */
    public String f236966d = "";

    /* renamed from: e */
    public String f236967e = "";

    /* renamed from: f */
    public long f236968f = 0;

    /* renamed from: g */
    public long f236969g = 0;

    /* renamed from: h */
    public long f236970h = 0;

    /* renamed from: i */
    public String f236971i = "";

    /* renamed from: j */
    public String f236972j = "";

    /* renamed from: k */
    public long f236973k;

    /* renamed from: l */
    public long f236974l;

    /* renamed from: m */
    public String f236975m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22832;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236966d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236967e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236968f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236969g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236970h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236971i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236972j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236973k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236974l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236975m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236966d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236967e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236968f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236969g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236970h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("md5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236971i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("moduleName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236972j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("packageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236973k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reuse_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236974l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("resue_reason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236975m);
        return stringBuffer.toString();
    }
}
