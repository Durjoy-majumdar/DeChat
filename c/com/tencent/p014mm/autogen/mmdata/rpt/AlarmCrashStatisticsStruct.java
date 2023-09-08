package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AlarmCrashStatisticsStruct */
public final class AlarmCrashStatisticsStruct extends C61103a {

    /* renamed from: d */
    public long f236318d;

    /* renamed from: e */
    public String f236319e = "";

    /* renamed from: f */
    public long f236320f = 0;

    /* renamed from: g */
    public String f236321g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19574;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236318d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236319e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236320f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236321g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Requestcode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236318d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProcessName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236319e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236320f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Stack");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236321g);
        return stringBuffer.toString();
    }
}
