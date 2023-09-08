package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EnterFinderLiveFromRedDotReportStruct */
public final class EnterFinderLiveFromRedDotReportStruct extends C61103a {

    /* renamed from: d */
    public long f155000d;

    /* renamed from: e */
    public long f155001e;

    /* renamed from: f */
    public String f155002f = "";

    /* renamed from: g */
    public String f155003g = "";

    /* renamed from: h */
    public String f155004h = "";

    /* renamed from: i */
    public String f155005i = "";

    /* renamed from: j */
    public String f155006j = "";

    /* renamed from: k */
    public String f155007k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23083;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155000d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155001e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155002f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155003g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155004h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155005i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155006j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155007k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155000d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorReason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155001e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155002f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LiveID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155003g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotTipsID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155004h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155005i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155006j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReportExtInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155007k);
        return stringBuffer.toString();
    }
}
