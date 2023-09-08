package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderExposeClickSDKReportStruct */
public final class FinderExposeClickSDKReportStruct extends C61103a {

    /* renamed from: d */
    public String f9794d = "";

    /* renamed from: e */
    public String f9795e = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25496;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9794d);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f9795e);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EventId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9794d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventParams");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9795e);
        return stringBuffer.toString();
    }
}
