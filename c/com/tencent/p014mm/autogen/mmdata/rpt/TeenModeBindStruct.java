package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TeenModeBindStruct */
public final class TeenModeBindStruct extends C61103a {

    /* renamed from: d */
    public long f10067d = 0;

    /* renamed from: e */
    public long f10068e = 0;

    /* renamed from: f */
    public long f10069f = 0;

    /* renamed from: g */
    public String f10070g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 24415;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f10067d);
        stringBuffer.append(",");
        stringBuffer.append(this.f10068e);
        stringBuffer.append(",");
        stringBuffer.append(this.f10069f);
        stringBuffer.append(",");
        stringBuffer.append(this.f10070g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10067d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stepname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10068e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("userrole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10069f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("targetUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10070g);
        return stringBuffer.toString();
    }
}
