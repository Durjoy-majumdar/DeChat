package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SolitaireClickReportStruct */
public final class SolitaireClickReportStruct extends C61103a {

    /* renamed from: d */
    public String f194438d = "";

    /* renamed from: e */
    public long f194439e = 0;

    /* renamed from: f */
    public long f194440f = 0;

    /* renamed from: g */
    public long f194441g = 0;

    /* renamed from: h */
    public String f194442h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18258;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194438d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194439e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194440f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194441g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194442h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194438d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194439e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194440f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194441g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Identifier");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194442h);
        return stringBuffer.toString();
    }
}
