package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CommentExposeStruct */
public final class CommentExposeStruct extends C61103a {

    /* renamed from: d */
    public String f154928d = "";

    /* renamed from: e */
    public String f154929e = "";

    /* renamed from: f */
    public String f154930f = "";

    /* renamed from: g */
    public long f154931g;

    /* renamed from: h */
    public String f154932h = "";

    /* renamed from: i */
    public String f154933i = "";

    /* renamed from: j */
    public String f154934j = "";

    /* renamed from: k */
    public long f154935k;

    /* renamed from: l */
    public String f154936l = "";

    /* renamed from: m */
    public long f154937m;

    /* renamed from: n */
    public String f154938n = "";

    /* renamed from: o */
    public String f154939o = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23092;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f154928d);
        stringBuffer.append(",");
        stringBuffer.append(this.f154929e);
        stringBuffer.append(",");
        stringBuffer.append(this.f154930f);
        stringBuffer.append(",");
        stringBuffer.append(this.f154931g);
        stringBuffer.append(",");
        stringBuffer.append(this.f154932h);
        stringBuffer.append(",");
        stringBuffer.append(this.f154933i);
        stringBuffer.append(",");
        stringBuffer.append(this.f154934j);
        stringBuffer.append(",");
        stringBuffer.append(this.f154935k);
        stringBuffer.append(",");
        stringBuffer.append(this.f154936l);
        stringBuffer.append(",");
        stringBuffer.append(this.f154937m);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f154938n);
        stringBuffer.append(",");
        stringBuffer.append(this.f154939o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154928d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154929e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154930f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154931g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154932h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("rootCommentid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154933i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("subCommentid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154934j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154935k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportJson");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154936l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(FirebaseAnalytics.C113379b.INDEX);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154937m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("subCommentIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterSessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154938n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ad_report_data");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154939o);
        return stringBuffer.toString();
    }
}
