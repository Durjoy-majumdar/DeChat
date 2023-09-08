package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.NearbyLiveSquareReportStruct */
public final class NearbyLiveSquareReportStruct extends C61103a {

    /* renamed from: d */
    public int f48544d = 0;

    /* renamed from: e */
    public int f48545e = 0;

    /* renamed from: f */
    public int f48546f = 0;

    /* renamed from: g */
    public int f48547g = 0;

    /* renamed from: h */
    public int f48548h = 0;

    /* renamed from: i */
    public int f48549i = 0;

    /* renamed from: j */
    public int f48550j = 0;

    /* renamed from: k */
    public int f48551k = 0;

    /* renamed from: l */
    public int f48552l = 0;

    /* renamed from: m */
    public int f48553m = 0;

    /* renamed from: n */
    public String f48554n = "";

    /* renamed from: o */
    public int f48555o = 0;

    /* renamed from: p */
    public int f48556p = 0;

    /* renamed from: q */
    public int f48557q = 0;

    /* renamed from: r */
    public String f48558r = "";

    /* renamed from: j */
    public int mo1004j() {
        return 24459;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48544d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48545e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48546f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48547g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48548h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48549i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48550j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48551k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48552l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48553m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48554n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48555o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48556p);
        stringBuffer.append(",");
        stringBuffer.append(this.f48557q);
        stringBuffer.append(",");
        stringBuffer.append(this.f48558r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("enterCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48544d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cgiCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48545e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("dbCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48546f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("uiCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48547g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("activityCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48548h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("businessCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48549i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("squareTabCgiCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48550j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isFromClick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48551k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasCacheFromClick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48552l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("deviceLevel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48553m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48554n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pullType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48555o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("userProtocolVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48556p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tabId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48557q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tabName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48558r);
        return stringBuffer.toString();
    }
}
