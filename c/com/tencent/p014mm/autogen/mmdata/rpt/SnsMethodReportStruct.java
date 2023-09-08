package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct */
public final class SnsMethodReportStruct extends C61103a {

    /* renamed from: F0 */
    public int f266072F0 = -1;

    /* renamed from: G0 */
    public int f266073G0 = -1;

    /* renamed from: d */
    public String f266074d = "";

    /* renamed from: e */
    public String f266075e = "";

    /* renamed from: f */
    public int f266076f = -1;

    /* renamed from: g */
    public int f266077g = -1;

    /* renamed from: h */
    public int f266078h = -1;

    /* renamed from: i */
    public int f266079i = -1;

    /* renamed from: j */
    public int f266080j = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 26080;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266074d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266075e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266076f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266077g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266078h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266079i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266080j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266072F0);
        stringBuffer.append(",");
        stringBuffer.append(this.f266073G0);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CpuInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266074d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266075e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreateViewCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266076f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FillContentCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266077g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Reuse");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266078h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GetViewCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266079i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SystemFps");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266080j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsAd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266072F0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RecyclerView");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266073G0);
        return stringBuffer.toString();
    }
}
