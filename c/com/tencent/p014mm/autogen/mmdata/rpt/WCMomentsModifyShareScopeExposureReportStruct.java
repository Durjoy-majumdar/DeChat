package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCMomentsModifyShareScopeExposureReportStruct */
public final class WCMomentsModifyShareScopeExposureReportStruct extends C61103a {

    /* renamed from: d */
    public long f156898d = 0;

    /* renamed from: e */
    public long f156899e = 0;

    /* renamed from: f */
    public String f156900f = "";

    /* renamed from: j */
    public int mo1004j() {
        return 26579;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156898d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156899e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156900f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156898d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isClickModifiy");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156899e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156900f);
        return stringBuffer.toString();
    }
}
