package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppFloatingVideoStruct */
public final class WeAppFloatingVideoStruct extends C61103a {

    /* renamed from: d */
    public String f236587d = "";

    /* renamed from: e */
    public String f236588e = "";

    /* renamed from: f */
    public String f236589f = "";

    /* renamed from: g */
    public long f236590g;

    /* renamed from: h */
    public long f236591h;

    /* renamed from: j */
    public int mo1004j() {
        return 18837;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236587d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236588e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236589f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236590g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236591h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236587d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PagePath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236588e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236589f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236590g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventNote");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236591h);
        return stringBuffer.toString();
    }
}
