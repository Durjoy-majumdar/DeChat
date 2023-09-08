package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveThermalStateReportStruct */
public final class FinderLiveThermalStateReportStruct extends C61103a {

    /* renamed from: d */
    public String f155704d = "";

    /* renamed from: e */
    public long f155705e;

    /* renamed from: f */
    public String f155706f = "";

    /* renamed from: g */
    public int f155707g;

    /* renamed from: h */
    public int f155708h;

    /* renamed from: i */
    public int f155709i;

    /* renamed from: j */
    public int mo1004j() {
        return 23558;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f155704d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155705e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155706f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155707g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155708h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155709i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ThermalState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsLowPowerModeEnabled");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LiveId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155704d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrentLiveScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155705e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderNickname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155706f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatteryState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155707g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatteryLevelPercentage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155708h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeviceTemperature");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155709i);
        return stringBuffer.toString();
    }
}
