package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ServiceWidgetSwitchProviderStruct */
public final class ServiceWidgetSwitchProviderStruct extends C61103a {

    /* renamed from: d */
    public String f10040d = "";

    /* renamed from: e */
    public String f10041e = "";

    /* renamed from: f */
    public String f10042f = "";

    /* renamed from: g */
    public String f10043g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 15960;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f10040d);
        stringBuffer.append(",");
        stringBuffer.append(this.f10041e);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f10042f);
        stringBuffer.append(",");
        stringBuffer.append(this.f10043g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(SearchIntents.EXTRA_QUERY);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10040d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10041e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isChange");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appidBefore");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10042f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appidAfter");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10043g);
        return stringBuffer.toString();
    }
}
