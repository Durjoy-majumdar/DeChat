package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderJointBusinessWithContextIDStruct */
public final class FinderJointBusinessWithContextIDStruct extends C61103a {

    /* renamed from: d */
    public String f9813d = "";

    /* renamed from: e */
    public String f9814e = "";

    /* renamed from: f */
    public String f9815f = "";

    /* renamed from: g */
    public String f9816g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21140;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9813d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9814e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9815f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9816g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9813d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReportExtraInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9814e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterSourceFeedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9815f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterSourceUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9816g);
        return stringBuffer.toString();
    }
}
