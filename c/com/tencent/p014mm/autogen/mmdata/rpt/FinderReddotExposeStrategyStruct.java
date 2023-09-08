package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderReddotExposeStrategyStruct */
public final class FinderReddotExposeStrategyStruct extends C61103a {

    /* renamed from: d */
    public String f156006d = "";

    /* renamed from: e */
    public String f156007e = "";

    /* renamed from: f */
    public int f156008f;

    /* renamed from: g */
    public int f156009g;

    /* renamed from: h */
    public int f156010h;

    /* renamed from: i */
    public int f156011i;

    /* renamed from: j */
    public long f156012j;

    /* renamed from: k */
    public long f156013k;

    /* renamed from: j */
    public int mo1004j() {
        return 23303;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156006d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156007e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156008f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156009g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156010h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156011i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156012j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156013k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156006d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156007e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeCountLimit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156008f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeLimitStrategy");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156009g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156010h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156011i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ColdTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156012j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156013k);
        return stringBuffer.toString();
    }
}
