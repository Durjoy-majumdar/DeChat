package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveErrorCodeReportStruct */
public final class LiveErrorCodeReportStruct extends C61103a {

    /* renamed from: d */
    public String f156377d = "";

    /* renamed from: e */
    public long f156378e;

    /* renamed from: f */
    public String f156379f = "";

    /* renamed from: g */
    public long f156380g;

    /* renamed from: h */
    public long f156381h;

    /* renamed from: i */
    public long f156382i;

    /* renamed from: j */
    public long f156383j;

    /* renamed from: k */
    public int f156384k;

    /* renamed from: j */
    public int mo1004j() {
        return 19968;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156377d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156378e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156379f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156380g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156381h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156382i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156383j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156384k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156377d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156378e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("micId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156379f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156380g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("groupRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156381h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("linkStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156382i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("audienceMode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156383j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156384k);
        return stringBuffer.toString();
    }
}
