package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SendFileActionReportStruct */
public final class SendFileActionReportStruct extends C61103a {

    /* renamed from: d */
    public long f265841d;

    /* renamed from: e */
    public long f265842e;

    /* renamed from: f */
    public String f265843f = "";

    /* renamed from: g */
    public String f265844g = "";

    /* renamed from: h */
    public String f265845h = "";

    /* renamed from: i */
    public long f265846i;

    /* renamed from: j */
    public int mo1004j() {
        return 22579;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265841d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265842e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265843f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265844g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265845h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265846i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265841d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265842e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileExt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265843f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265844g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgSvrId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265845h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LogVersionlog");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265846i);
        return stringBuffer.toString();
    }
}
