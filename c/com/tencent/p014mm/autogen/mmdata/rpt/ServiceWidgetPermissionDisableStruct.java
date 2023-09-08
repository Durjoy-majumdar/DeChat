package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ServiceWidgetPermissionDisableStruct */
public final class ServiceWidgetPermissionDisableStruct extends C61103a {

    /* renamed from: d */
    public String f10037d = "";

    /* renamed from: e */
    public String f10038e = "";

    /* renamed from: f */
    public String f10039f = "";

    /* renamed from: j */
    public int mo1004j() {
        return 15961;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f10037d);
        stringBuffer.append(",");
        stringBuffer.append(this.f10038e);
        stringBuffer.append(",");
        stringBuffer.append(this.f10039f);
        stringBuffer.append(",");
        stringBuffer.append(0);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10037d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ProviderConstants.API_PATH);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10038e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("arg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10039f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("timestampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        return stringBuffer.toString();
    }
}
