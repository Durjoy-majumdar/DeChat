package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CommentItemClickStruct */
public final class CommentItemClickStruct extends C61103a {

    /* renamed from: d */
    public String f154940d = "";

    /* renamed from: e */
    public String f154941e = "";

    /* renamed from: f */
    public String f154942f = "";

    /* renamed from: g */
    public long f154943g;

    /* renamed from: h */
    public String f154944h = "";

    /* renamed from: i */
    public String f154945i = "";

    /* renamed from: j */
    public String f154946j = "";

    /* renamed from: k */
    public long f154947k;

    /* renamed from: l */
    public String f154948l = "";

    /* renamed from: m */
    public long f154949m;

    /* renamed from: n */
    public long f154950n;

    /* renamed from: o */
    public String f154951o = "";

    /* renamed from: j */
    public int mo1004j() {
        return 28477;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f154940d);
        stringBuffer.append(",");
        stringBuffer.append(this.f154941e);
        stringBuffer.append(",");
        stringBuffer.append(this.f154942f);
        stringBuffer.append(",");
        stringBuffer.append(this.f154943g);
        stringBuffer.append(",");
        stringBuffer.append(this.f154944h);
        stringBuffer.append(",");
        stringBuffer.append(this.f154945i);
        stringBuffer.append(",");
        stringBuffer.append(this.f154946j);
        stringBuffer.append(",");
        stringBuffer.append(this.f154947k);
        stringBuffer.append(",");
        stringBuffer.append(this.f154948l);
        stringBuffer.append(",");
        stringBuffer.append(this.f154949m);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f154950n);
        stringBuffer.append(",");
        stringBuffer.append(this.f154951o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154940d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154941e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154942f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154943g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154944h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("rootCommentid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154945i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("subCommentid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154946j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154947k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportJson");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154948l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(FirebaseAnalytics.C113379b.INDEX);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154949m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("subCommentIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickZone");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154950n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ad_report_data");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154951o);
        return stringBuffer.toString();
    }
}
