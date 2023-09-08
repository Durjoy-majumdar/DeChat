package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPayJSAPIPayCallbackManageStruct */
public final class WCPayJSAPIPayCallbackManageStruct extends C61103a {

    /* renamed from: d */
    public long f194669d = 0;

    /* renamed from: e */
    public long f194670e = 0;

    /* renamed from: f */
    public String f194671f = "";

    /* renamed from: g */
    public String f194672g = "";

    /* renamed from: h */
    public String f194673h = "";

    /* renamed from: i */
    public String f194674i = "";

    /* renamed from: j */
    public String f194675j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16310;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194669d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194670e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194671f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194672g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194673h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194674i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194675j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PayType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194669d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CallbackType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194670e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceH5Url");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194671f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceAppUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194672g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceAppPath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194673h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TargetAppUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194674i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TargetAppPath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194675j);
        return stringBuffer.toString();
    }
}
