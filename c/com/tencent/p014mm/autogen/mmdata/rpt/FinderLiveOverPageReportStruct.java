package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveOverPageReportStruct */
public final class FinderLiveOverPageReportStruct extends C61103a {

    /* renamed from: d */
    public long f155564d;

    /* renamed from: e */
    public String f155565e = "";

    /* renamed from: f */
    public long f155566f;

    /* renamed from: g */
    public String f155567g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21919;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155564d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155565e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155566f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155567g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155564d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155565e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155566f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155567g);
        return stringBuffer.toString();
    }
}
