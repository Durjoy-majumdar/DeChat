package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct */
public final class FinderShareMomentReportStruct extends C61103a {

    /* renamed from: d */
    public long f265595d;

    /* renamed from: e */
    public String f265596e = "";

    /* renamed from: f */
    public String f265597f = "";

    /* renamed from: g */
    public long f265598g;

    /* renamed from: h */
    public String f265599h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21181;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265595d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265596e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265597f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265598g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265599h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ForwardType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265595d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265596e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Publishid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265597f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Outcome");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265598g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MonmentSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265599h);
        return stringBuffer.toString();
    }
}
