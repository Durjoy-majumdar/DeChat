package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidSendMsgFailStruct */
public final class AndroidSendMsgFailStruct extends C61103a {

    /* renamed from: d */
    public String f265295d = "";

    /* renamed from: e */
    public long f265296e;

    /* renamed from: f */
    public long f265297f;

    /* renamed from: g */
    public long f265298g;

    /* renamed from: h */
    public String f265299h = "";

    /* renamed from: i */
    public int f265300i;

    /* renamed from: j */
    public String f265301j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 28340;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265295d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265296e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265297f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265298g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265299h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265300i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265301j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LocalId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265295d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265296e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265297f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreateTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265298g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265299h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265300i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265301j);
        return stringBuffer.toString();
    }
}
