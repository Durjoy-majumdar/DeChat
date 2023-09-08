package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SessionUBAStruct */
public final class SessionUBAStruct extends C61103a {

    /* renamed from: d */
    public int f343827d = 0;

    /* renamed from: e */
    public String f343828e = "";

    /* renamed from: f */
    public long f343829f = 0;

    /* renamed from: g */
    public long f343830g = 0;

    /* renamed from: h */
    public long f343831h = 0;

    /* renamed from: i */
    public String f343832i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 17193;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343827d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343828e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343829f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343830g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343831h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343832i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343827d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343828e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Seq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343829f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343830g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeqSum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343831h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DataContent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343832i);
        return stringBuffer.toString();
    }
}
