package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonDesignerIPPageExposureStruct */
public final class EmoticonDesignerIPPageExposureStruct extends C61103a {

    /* renamed from: d */
    public String f265450d = "";

    /* renamed from: e */
    public String f265451e = "";

    /* renamed from: f */
    public String f265452f = "";

    /* renamed from: g */
    public int f265453g;

    /* renamed from: j */
    public int mo1004j() {
        return 27617;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265450d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265451e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265452f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265453g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265450d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IPSetKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265451e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DesUin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265452f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SendClick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265453g);
        return stringBuffer.toString();
    }
}
