package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FTSRelatedSugH5ReportStruct */
public final class FTSRelatedSugH5ReportStruct extends C61103a {

    /* renamed from: d */
    public String f107877d = "";

    /* renamed from: e */
    public long f107878e;

    /* renamed from: f */
    public long f107879f;

    /* renamed from: g */
    public String f107880g = "";

    /* renamed from: h */
    public long f107881h;

    /* renamed from: j */
    public int mo1004j() {
        return 22251;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107877d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107878e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107879f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107880g);
        stringBuffer.append(",");
        stringBuffer.append(this.f107881h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Query");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107877d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107878e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107879f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InitUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107880g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107881h);
        return stringBuffer.toString();
    }
}
