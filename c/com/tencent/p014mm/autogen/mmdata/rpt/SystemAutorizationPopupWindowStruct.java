package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SystemAutorizationPopupWindowStruct */
public final class SystemAutorizationPopupWindowStruct extends C61103a {

    /* renamed from: d */
    public long f343836d;

    /* renamed from: e */
    public long f343837e;

    /* renamed from: f */
    public long f343838f;

    /* renamed from: g */
    public String f343839g = "";

    /* renamed from: h */
    public String f343840h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 24958;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343836d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343837e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343838f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343839g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343840h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343836d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PopupPrivacyType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343837e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PopupBiz");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343838f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeviceID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343839g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrentPrivacyFullStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343840h);
        return stringBuffer.toString();
    }
}
