package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.HbSessionReportStruct */
public final class HbSessionReportStruct extends C61103a {

    /* renamed from: d */
    public long f194230d = 0;

    /* renamed from: e */
    public long f194231e = 0;

    /* renamed from: f */
    public long f194232f = 0;

    /* renamed from: g */
    public long f194233g = 0;

    /* renamed from: h */
    public long f194234h = 0;

    /* renamed from: i */
    public long f194235i = 0;

    /* renamed from: j */
    public String f194236j = "";

    /* renamed from: k */
    public long f194237k = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16724;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194230d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194231e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194232f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194233g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194234h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194235i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194236j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194237k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194230d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Content");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194231e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChangeAmountTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194232f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AddSelfieEmoticonTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194233g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AddCustonEmoticonTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194234h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AddSelfieEmoticonFormBoardTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194235i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EmoticonMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194236j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AddShopEmoticonTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194237k);
        return stringBuffer.toString();
    }
}
