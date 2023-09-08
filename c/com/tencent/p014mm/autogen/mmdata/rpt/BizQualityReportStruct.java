package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct */
public final class BizQualityReportStruct extends C61103a {

    /* renamed from: d */
    public long f107857d = 0;

    /* renamed from: e */
    public long f107858e = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 26211;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107857d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107858e);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("BizTimeLineInfoDbType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107857d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BizTimeLineInfoDbMigrateOp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107858e);
        return stringBuffer.toString();
    }
}
