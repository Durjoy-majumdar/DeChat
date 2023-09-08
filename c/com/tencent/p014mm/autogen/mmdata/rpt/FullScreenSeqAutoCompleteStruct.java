package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FullScreenSeqAutoCompleteStruct */
public final class FullScreenSeqAutoCompleteStruct extends C61103a {

    /* renamed from: d */
    public int f194208d = 0;

    /* renamed from: e */
    public String f194209e = "";

    /* renamed from: f */
    public int f194210f = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 27027;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194208d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194209e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194210f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194208d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CompleteSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194209e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFirstComplete");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194210f);
        return stringBuffer.toString();
    }
}
