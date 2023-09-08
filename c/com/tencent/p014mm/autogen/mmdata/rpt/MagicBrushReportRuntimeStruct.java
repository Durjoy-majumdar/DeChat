package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MagicBrushReportRuntimeStruct */
public final class MagicBrushReportRuntimeStruct extends C61103a {

    /* renamed from: d */
    public String f69564d = "";

    /* renamed from: e */
    public String f69565e = "";

    /* renamed from: f */
    public String f69566f = "";

    /* renamed from: g */
    public String f69567g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 26778;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69564d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69565e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69566f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69567g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("BizName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69564d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69565e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Content");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69566f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Extras");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69567g);
        return stringBuffer.toString();
    }
}
