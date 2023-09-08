package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SearchStaytimeReportStruct */
public final class SearchStaytimeReportStruct extends C61103a {

    /* renamed from: d */
    public String f69596d = "";

    /* renamed from: e */
    public String f69597e = "";

    /* renamed from: f */
    public long f69598f;

    /* renamed from: g */
    public String f69599g = "";

    /* renamed from: h */
    public long f69600h;

    /* renamed from: i */
    public long f69601i;

    /* renamed from: j */
    public long f69602j;

    /* renamed from: k */
    public String f69603k = "";

    /* renamed from: l */
    public long f69604l;

    /* renamed from: m */
    public String f69605m = "";

    /* renamed from: n */
    public String f69606n = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25114;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69596d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69597e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69598f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69599g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69600h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69601i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69602j);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f69603k);
        stringBuffer.append(",");
        stringBuffer.append(this.f69604l);
        stringBuffer.append(",");
        stringBuffer.append(this.f69605m);
        stringBuffer.append(",");
        stringBuffer.append(this.f69606n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Query");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69596d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69597e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69598f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ParentSearchId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69599g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReqBusinessType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69600h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69601i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69602j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExtInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69603k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69604l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69605m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69606n);
        return stringBuffer.toString();
    }
}
