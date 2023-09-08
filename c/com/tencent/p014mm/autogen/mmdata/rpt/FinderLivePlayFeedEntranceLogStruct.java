package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayFeedEntranceLogStruct */
public final class FinderLivePlayFeedEntranceLogStruct extends C61103a {

    /* renamed from: d */
    public String f155586d = "";

    /* renamed from: e */
    public String f155587e = "";

    /* renamed from: f */
    public String f155588f = "";

    /* renamed from: g */
    public String f155589g = "";

    /* renamed from: h */
    public long f155590h;

    /* renamed from: i */
    public long f155591i;

    /* renamed from: j */
    public String f155592j = "";

    /* renamed from: k */
    public long f155593k;

    /* renamed from: l */
    public long f155594l;

    /* renamed from: m */
    public String f155595m = "";

    /* renamed from: n */
    public String f155596n = "";

    /* renamed from: o */
    public String f155597o = "";

    /* renamed from: p */
    public long f155598p;

    /* renamed from: q */
    public String f155599q = "";

    /* renamed from: r */
    public String f155600r = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22648;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155586d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155587e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155588f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155589g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155590h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155591i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155592j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155593k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155594l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155595m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155596n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155597o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155598p);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f155599q);
        stringBuffer.append(",");
        stringBuffer.append(this.f155600r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155586d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LiveID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155587e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155588f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155589g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155590h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155591i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155592j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(FirebaseAnalytics.C113379b.INDEX);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155593k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155594l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155595m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155596n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionBuffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155597o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OnlineNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155598p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chnl_extra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155599q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickSubTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155600r);
        return stringBuffer.toString();
    }
}
