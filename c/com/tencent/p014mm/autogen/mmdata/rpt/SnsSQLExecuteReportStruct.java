package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsSQLExecuteReportStruct */
public final class SnsSQLExecuteReportStruct extends C61103a {

    /* renamed from: d */
    public long f266161d = 0;

    /* renamed from: e */
    public int f266162e = 0;

    /* renamed from: f */
    public long f266163f = -1;

    /* renamed from: g */
    public String f266164g = "";

    /* renamed from: h */
    public String f266165h = "";

    /* renamed from: i */
    public int f266166i = -1;

    /* renamed from: j */
    public int f266167j = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 26209;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266161d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266162e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266163f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266164g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266165h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266166i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266167j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("OriginDbCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266161d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SqlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266162e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExecuteTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266163f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sql");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266164g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Stack");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266165h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsBeforeFirstTimeClean");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266166i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsMainThread");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266167j);
        return stringBuffer.toString();
    }
}
