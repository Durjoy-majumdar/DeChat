package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct */
public final class FinderLbsCardActionReportStruct extends C61103a {

    /* renamed from: d */
    public String f9817d = "";

    /* renamed from: e */
    public String f9818e = "";

    /* renamed from: f */
    public String f9819f = "";

    /* renamed from: g */
    public long f9820g;

    /* renamed from: h */
    public long f9821h;

    /* renamed from: i */
    public long f9822i;

    /* renamed from: j */
    public String f9823j = "";

    /* renamed from: k */
    public long f9824k;

    /* renamed from: l */
    public String f9825l = "";

    /* renamed from: m */
    public String f9826m = "";

    /* renamed from: n */
    public long f9827n;

    /* renamed from: o */
    public String f9828o = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21564;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9817d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9818e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9819f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9820g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9821h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9822i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9823j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9824k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9825l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9826m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9827n);
        stringBuffer.append(",");
        stringBuffer.append(this.f9828o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9817d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9818e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9819f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("refreshTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9820g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9821h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9822i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9823j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardIcon");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9824k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cardTag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9825l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9826m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9827n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionBuffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9828o);
        return stringBuffer.toString();
    }
}
