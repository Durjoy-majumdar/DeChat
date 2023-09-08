package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.mobile_network_registerStruct */
public final class mobile_network_registerStruct extends C61103a {

    /* renamed from: d */
    public long f343877d;

    /* renamed from: e */
    public String f343878e = "";

    /* renamed from: f */
    public String f343879f = "";

    /* renamed from: g */
    public int f343880g;

    /* renamed from: h */
    public int f343881h;

    /* renamed from: j */
    public int mo1004j() {
        return 19822;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343877d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343878e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343879f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343880g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343881h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343877d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RegisterMobile");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343878e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeviceID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343879f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343880g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Result");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343881h);
        return stringBuffer.toString();
    }
}
