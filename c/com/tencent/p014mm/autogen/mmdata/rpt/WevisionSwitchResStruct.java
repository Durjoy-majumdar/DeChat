package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct */
public final class WevisionSwitchResStruct extends C61103a {

    /* renamed from: d */
    public int f79234d = 0;

    /* renamed from: e */
    public int f79235e;

    /* renamed from: f */
    public int f79236f;

    /* renamed from: g */
    public String f79237g = "";

    /* renamed from: h */
    public String f79238h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 26428;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79234d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79235e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79236f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79237g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79238h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppSDKVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79234d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BusinessType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79235e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79236f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CgiSwitchRes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79237g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SwitchRes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79238h);
        return stringBuffer.toString();
    }
}
