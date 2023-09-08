package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VASPerformanceStruct */
public final class VASPerformanceStruct extends C61103a {

    /* renamed from: d */
    public String f310332d = "";

    /* renamed from: e */
    public String f310333e = "";

    /* renamed from: f */
    public int f310334f = 0;

    /* renamed from: g */
    public int f310335g = 0;

    /* renamed from: h */
    public long f310336h;

    /* renamed from: i */
    public long f310337i;

    /* renamed from: j */
    public long f310338j;

    /* renamed from: j */
    public int mo1004j() {
        return 24933;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310332d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310333e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310334f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310335g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310336h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310337i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310338j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SrcPageName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310332d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DestPageName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310333e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SrcPageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310334f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DestPageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310335g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Start2OnCreateCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310336h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Start2AnimBeginCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310337i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Start2AnimEndCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310338j);
        return stringBuffer.toString();
    }
}
