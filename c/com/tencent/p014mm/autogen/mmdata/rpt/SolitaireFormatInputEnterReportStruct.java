package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SolitaireFormatInputEnterReportStruct */
public final class SolitaireFormatInputEnterReportStruct extends C61103a {

    /* renamed from: d */
    public String f194448d = "";

    /* renamed from: e */
    public long f194449e = 0;

    /* renamed from: f */
    public long f194450f = 0;

    /* renamed from: g */
    public long f194451g = 0;

    /* renamed from: h */
    public long f194452h = 0;

    /* renamed from: i */
    public String f194453i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18256;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194448d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194449e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194450f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194451g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194452h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194453i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194448d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194449e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194450f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194451g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OperateType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194452h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Identifier");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194453i);
        return stringBuffer.toString();
    }
}
