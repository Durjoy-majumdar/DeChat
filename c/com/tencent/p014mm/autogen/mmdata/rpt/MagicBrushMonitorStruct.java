package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MagicBrushMonitorStruct */
public final class MagicBrushMonitorStruct extends C61103a {

    /* renamed from: F0 */
    public long f343752F0;

    /* renamed from: d */
    public String f343753d = "";

    /* renamed from: e */
    public int f343754e;

    /* renamed from: f */
    public String f343755f = "";

    /* renamed from: j */
    public int mo1004j() {
        return 26632;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343753d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343754e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343755f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343752F0);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343753d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("value");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343754e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("extra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343755f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343752F0);
        return stringBuffer.toString();
    }
}
