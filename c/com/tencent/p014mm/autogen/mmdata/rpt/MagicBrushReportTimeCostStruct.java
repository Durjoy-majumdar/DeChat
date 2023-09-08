package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MagicBrushReportTimeCostStruct */
public final class MagicBrushReportTimeCostStruct extends C61103a {

    /* renamed from: d */
    public String f69568d = "";

    /* renamed from: e */
    public String f69569e = "";

    /* renamed from: f */
    public long f69570f;

    /* renamed from: g */
    public long f69571g;

    /* renamed from: h */
    public String f69572h = "";

    /* renamed from: i */
    public long f69573i;

    /* renamed from: j */
    public int mo1004j() {
        return 26777;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69568d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69569e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69570f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69571g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69572h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69573i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69568d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BizName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69569e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69570f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69571g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Extras");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69572h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69573i);
        return stringBuffer.toString();
    }
}
