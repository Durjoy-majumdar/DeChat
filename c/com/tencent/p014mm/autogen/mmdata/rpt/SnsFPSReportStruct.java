package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsFPSReportStruct */
public final class SnsFPSReportStruct extends C61103a {

    /* renamed from: d */
    public int f266013d = 0;

    /* renamed from: e */
    public int f266014e = 0;

    /* renamed from: f */
    public int f266015f = 0;

    /* renamed from: g */
    public int f266016g = 0;

    /* renamed from: h */
    public int f266017h = 0;

    /* renamed from: i */
    public int f266018i = 0;

    /* renamed from: j */
    public int f266019j = 0;

    /* renamed from: k */
    public int f266020k = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 22765;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266013d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266014e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266015f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266016g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266017h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266018i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266019j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266020k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FPS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266013d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeviceLevel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266014e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DropBest");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266015f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DropNormal");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266016g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DropMiddle");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266017h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DropHigh");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266018i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DropFrozen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266019j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sensitivity");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266020k);
        return stringBuffer.toString();
    }
}
