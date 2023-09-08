package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AiFinderSyncRedDotStruct */
public final class AiFinderSyncRedDotStruct extends C61103a {

    /* renamed from: d */
    public String f48140d = "";

    /* renamed from: e */
    public long f48141e;

    /* renamed from: f */
    public long f48142f;

    /* renamed from: g */
    public long f48143g;

    /* renamed from: h */
    public String f48144h = "";

    /* renamed from: i */
    public int f48145i;

    /* renamed from: j */
    public int f48146j;

    /* renamed from: k */
    public String f48147k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21639;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48140d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48141e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48142f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48143g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48144h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48145i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48146j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48147k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48140d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48141e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GetTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48142f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48143g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48144h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GetStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48145i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderSyncScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48146j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48147k);
        return stringBuffer.toString();
    }
}
