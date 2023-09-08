package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct */
public final class SecondCutShareSnsStruct extends C61103a {

    /* renamed from: d */
    public long f265823d;

    /* renamed from: e */
    public String f265824e = "";

    /* renamed from: f */
    public long f265825f;

    /* renamed from: g */
    public String f265826g = "";

    /* renamed from: h */
    public long f265827h;

    /* renamed from: i */
    public long f265828i = -1;

    /* renamed from: j */
    public long f265829j = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 21746;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265823d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265824e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265825f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265826g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265827h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265828i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265829j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265823d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Publishid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265824e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Outcome");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265825f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MonmentSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265826g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("templateType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265827h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsThumbExit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265828i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsThumbBlack");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265829j);
        return stringBuffer.toString();
    }
}
