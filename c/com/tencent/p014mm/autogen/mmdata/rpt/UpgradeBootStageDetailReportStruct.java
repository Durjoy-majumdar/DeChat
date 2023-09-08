package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.UpgradeBootStageDetailReportStruct */
public final class UpgradeBootStageDetailReportStruct extends C61103a {

    /* renamed from: d */
    public long f236402d;

    /* renamed from: e */
    public long f236403e;

    /* renamed from: f */
    public long f236404f;

    /* renamed from: g */
    public long f236405g;

    /* renamed from: h */
    public long f236406h;

    /* renamed from: i */
    public long f236407i;

    /* renamed from: j */
    public long f236408j;

    /* renamed from: k */
    public long f236409k;

    /* renamed from: l */
    public long f236410l;

    /* renamed from: j */
    public int mo1004j() {
        return 25395;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236402d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236403e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236404f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236405g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236406h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236407i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236408j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236409k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236410l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("BootStageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236402d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("patchWay");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236403e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UpdateWay");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236404f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MergeStayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236405g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236406h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PatchTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236407i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UseTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236408j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("erroCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236409k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("downloadPatchSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236410l);
        return stringBuffer.toString();
    }
}
