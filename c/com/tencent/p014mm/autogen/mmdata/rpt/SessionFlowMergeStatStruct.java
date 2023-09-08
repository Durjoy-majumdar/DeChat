package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SessionFlowMergeStatStruct */
public final class SessionFlowMergeStatStruct extends C61103a {

    /* renamed from: d */
    public int f343815d = 0;

    /* renamed from: e */
    public String f343816e = "";

    /* renamed from: f */
    public long f343817f = 0;

    /* renamed from: g */
    public long f343818g = 0;

    /* renamed from: h */
    public long f343819h = 0;

    /* renamed from: i */
    public String f343820i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16976;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343815d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343816e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343817f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343818g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343819h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343820i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343815d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343816e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Seq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343817f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343818g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeqSum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343819h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DataContent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343820i);
        return stringBuffer.toString();
    }
}
