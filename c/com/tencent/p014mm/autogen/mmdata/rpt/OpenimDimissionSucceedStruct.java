package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OpenimDimissionSucceedStruct */
public final class OpenimDimissionSucceedStruct extends C61103a {

    /* renamed from: d */
    public String f79137d = "";

    /* renamed from: e */
    public String f79138e = "";

    /* renamed from: f */
    public String f79139f = "";

    /* renamed from: g */
    public String f79140g = "";

    /* renamed from: h */
    public String f79141h = "";

    /* renamed from: i */
    public long f79142i = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 19942;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79137d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79138e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79139f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79140g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79141h);
        stringBuffer.append(",");
        stringBuffer.append(this.f79142i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ResignationWorkUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79137d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TakeOverWorkUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79138e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WorkEnterpriseDescId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79139f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WorkEnterpriseName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79140g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79141h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79142i);
        return stringBuffer.toString();
    }
}
