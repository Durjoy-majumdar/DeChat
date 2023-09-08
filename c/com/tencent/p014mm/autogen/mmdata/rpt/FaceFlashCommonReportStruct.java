package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FaceFlashCommonReportStruct */
public final class FaceFlashCommonReportStruct extends C61103a {

    /* renamed from: d */
    public int f9681d = -1;

    /* renamed from: e */
    public int f9682e = -1;

    /* renamed from: f */
    public int f9683f = -1;

    /* renamed from: g */
    public String f9684g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21597;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9681d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9682e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9683f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9684g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EventType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9681d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FaceType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9682e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9683f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9684g);
        return stringBuffer.toString();
    }
}
