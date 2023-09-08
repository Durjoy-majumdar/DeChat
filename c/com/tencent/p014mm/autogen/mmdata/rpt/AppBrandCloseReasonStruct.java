package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandCloseReasonStruct */
public final class AppBrandCloseReasonStruct extends C61103a {

    /* renamed from: d */
    public String f236338d = "";

    /* renamed from: e */
    public long f236339e;

    /* renamed from: f */
    public long f236340f;

    /* renamed from: g */
    public long f236341g;

    /* renamed from: h */
    public String f236342h = "";

    /* renamed from: i */
    public String f236343i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21804;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236338d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236339e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236340f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236341g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236342h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236343i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236338d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236339e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("aliveTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236340f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_REASON);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236341g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("flags");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236342h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236343i);
        return stringBuffer.toString();
    }
}
