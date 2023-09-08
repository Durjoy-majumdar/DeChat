package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCFeedTopicActionReportStruct */
public final class WCFeedTopicActionReportStruct extends C61103a {

    /* renamed from: d */
    public long f69632d = 0;

    /* renamed from: e */
    public long f69633e = 0;

    /* renamed from: f */
    public String f69634f = "";

    /* renamed from: g */
    public String f69635g = "";

    /* renamed from: h */
    public long f69636h = 0;

    /* renamed from: i */
    public String f69637i = "";

    /* renamed from: j */
    public String f69638j = "";

    /* renamed from: k */
    public long f69639k = 0;

    /* renamed from: l */
    public String f69640l = "";

    /* renamed from: m */
    public long f69641m = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 21192;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69632d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69633e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69634f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69635g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69636h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69637i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69638j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69639k);
        stringBuffer.append(",");
        stringBuffer.append(this.f69640l);
        stringBuffer.append(",");
        stringBuffer.append(this.f69641m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69632d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69633e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedAuthorUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69634f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69635g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedAuthorType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69636h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreatedCommentID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69637i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69638j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69639k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("QueryKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69640l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69641m);
        return stringBuffer.toString();
    }
}
