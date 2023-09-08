package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.UpgradeBootStatusReportStruct */
public final class UpgradeBootStatusReportStruct extends C61103a {

    /* renamed from: d */
    public long f236411d;

    /* renamed from: e */
    public long f236412e;

    /* renamed from: f */
    public long f236413f;

    /* renamed from: g */
    public long f236414g;

    /* renamed from: h */
    public long f236415h;

    /* renamed from: i */
    public long f236416i;

    /* renamed from: j */
    public long f236417j;

    /* renamed from: k */
    public long f236418k;

    /* renamed from: j */
    public int mo1004j() {
        return 23550;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236411d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236412e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236413f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236414g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236415h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236416i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236417j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236418k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("BootType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236411d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BootScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236412e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MergeCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236413f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MergeStayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236414g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UpdateWay");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236415h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236416i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PatchTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236417j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UseTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236418k);
        return stringBuffer.toString();
    }
}
