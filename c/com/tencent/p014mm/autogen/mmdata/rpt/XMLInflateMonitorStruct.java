package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.XMLInflateMonitorStruct */
public final class XMLInflateMonitorStruct extends C61103a {

    /* renamed from: d */
    public String f79239d = "";

    /* renamed from: e */
    public long f79240e;

    /* renamed from: f */
    public long f79241f;

    /* renamed from: g */
    public long f79242g;

    /* renamed from: h */
    public long f79243h;

    /* renamed from: i */
    public long f79244i;

    /* renamed from: j */
    public long f79245j;

    /* renamed from: k */
    public long f79246k;

    /* renamed from: l */
    public long f79247l;

    /* renamed from: m */
    public long f79248m;

    /* renamed from: n */
    public long f79249n;

    /* renamed from: j */
    public int mo1004j() {
        return 27564;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79239d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79240e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79241f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79242g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79243h);
        stringBuffer.append(",");
        stringBuffer.append(this.f79244i);
        stringBuffer.append(",");
        stringBuffer.append(this.f79245j);
        stringBuffer.append(",");
        stringBuffer.append(this.f79246k);
        stringBuffer.append(",");
        stringBuffer.append(this.f79247l);
        stringBuffer.append(",");
        stringBuffer.append(this.f79248m);
        stringBuffer.append(",");
        stringBuffer.append(this.f79249n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79239d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActStartTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79240e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DevLevel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79241f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalInflateCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79242g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AsyncInflateCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79243h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MainThreadInflateCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79244i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalInflateCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79245j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AsyncInflateCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79246k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MainThreadInflateCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79247l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AsyncCostRatio");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79248m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AsyncCountRatio");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79249n);
        return stringBuffer.toString();
    }
}
