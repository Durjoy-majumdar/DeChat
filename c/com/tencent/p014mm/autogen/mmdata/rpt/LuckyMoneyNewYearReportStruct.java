package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LuckyMoneyNewYearReportStruct */
public final class LuckyMoneyNewYearReportStruct extends C61103a {

    /* renamed from: d */
    public long f194254d = 0;

    /* renamed from: e */
    public long f194255e = 0;

    /* renamed from: f */
    public long f194256f = 0;

    /* renamed from: g */
    public int f194257g = 0;

    /* renamed from: h */
    public String f194258h = "";

    /* renamed from: i */
    public String f194259i = "";

    /* renamed from: j */
    public int f194260j = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 13079;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194254d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194255e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194256f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194257g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194258h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194259i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194260j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194254d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sceneUI");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194255e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("playTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194256f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("amount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194257g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194258h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("flistid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194259i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hbstatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194260j);
        return stringBuffer.toString();
    }
}
