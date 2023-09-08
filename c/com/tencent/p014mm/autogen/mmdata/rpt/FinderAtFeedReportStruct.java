package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderAtFeedReportStruct */
public final class FinderAtFeedReportStruct extends C61103a {

    /* renamed from: d */
    public long f155032d;

    /* renamed from: e */
    public String f155033e = "";

    /* renamed from: f */
    public String f155034f = "";

    /* renamed from: g */
    public String f155035g = "";

    /* renamed from: h */
    public String f155036h = "";

    /* renamed from: i */
    public long f155037i;

    /* renamed from: j */
    public long f155038j;

    /* renamed from: k */
    public String f155039k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21206;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155032d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155033e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155034f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155035g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155036h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155037i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155038j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155039k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IfSelf");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155032d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155033e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155034f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155035g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderContexId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155036h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155037i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTarget");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155038j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActivityId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155039k);
        return stringBuffer.toString();
    }
}
