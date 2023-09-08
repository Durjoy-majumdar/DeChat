package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SoliotaireJoinStruct */
public final class SoliotaireJoinStruct extends C61103a {

    /* renamed from: d */
    public String f194421d = "";

    /* renamed from: e */
    public String f194422e = "";

    /* renamed from: f */
    public long f194423f = 0;

    /* renamed from: g */
    public long f194424g = 0;

    /* renamed from: h */
    public long f194425h = 0;

    /* renamed from: i */
    public long f194426i = 0;

    /* renamed from: j */
    public String f194427j = "";

    /* renamed from: k */
    public String f194428k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18246;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194421d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194422e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194423f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194424g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194425h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194426i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194427j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194428k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194421d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LaunchUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194422e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194423f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("deleteCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194424g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("addCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194425h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EditScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194426i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Identifier");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194427j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Punctuation");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194428k);
        return stringBuffer.toString();
    }
}
