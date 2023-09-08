package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct */
public final class FinderLiveErrorReportStruct extends C61103a {

    /* renamed from: d */
    public String f155538d = "";

    /* renamed from: e */
    public int f155539e;

    /* renamed from: f */
    public String f155540f = "";

    /* renamed from: g */
    public long f155541g;

    /* renamed from: j */
    public int mo1004j() {
        return 25510;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155538d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155539e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155540f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155541g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("playerLeaksTrace");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155538d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("opType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155539e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("opMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155540f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("innerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155541g);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public FinderLiveErrorReportStruct mo76263s(String str) {
        this.f155540f = mo86045b("opMsg", str, true);
        return this;
    }
}
