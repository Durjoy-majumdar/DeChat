package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsPermissionReportStruct */
public final class SnsPermissionReportStruct extends C61103a {

    /* renamed from: d */
    public String f108003d = "";

    /* renamed from: e */
    public String f108004e = "";

    /* renamed from: f */
    public int f108005f = -1;

    /* renamed from: g */
    public int f108006g = -1;

    /* renamed from: h */
    public int f108007h = -1;

    /* renamed from: i */
    public int f108008i = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 18197;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f108003d);
        stringBuffer.append(",");
        stringBuffer.append(this.f108004e);
        stringBuffer.append(",");
        stringBuffer.append(this.f108005f);
        stringBuffer.append(",");
        stringBuffer.append(this.f108006g);
        stringBuffer.append(",");
        stringBuffer.append(this.f108007h);
        stringBuffer.append(",");
        stringBuffer.append(this.f108008i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108003d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PublishId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108004e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108005f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OnDestroyAction");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108006g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108007h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108008i);
        return stringBuffer.toString();
    }
}
