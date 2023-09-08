package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveActionStruct */
public final class FinderLiveActionStruct extends C61103a {

    /* renamed from: d */
    public String f155421d = "";

    /* renamed from: e */
    public String f155422e = "";

    /* renamed from: f */
    public int f155423f;

    /* renamed from: g */
    public String f155424g = "";

    /* renamed from: h */
    public long f155425h;

    /* renamed from: i */
    public String f155426i = "";

    /* renamed from: j */
    public String f155427j = "";

    /* renamed from: k */
    public String f155428k = "";

    /* renamed from: l */
    public long f155429l;

    /* renamed from: m */
    public long f155430m;

    /* renamed from: n */
    public long f155431n;

    /* renamed from: o */
    public long f155432o;

    /* renamed from: p */
    public String f155433p = "";

    /* renamed from: q */
    public long f155434q;

    /* renamed from: r */
    public String f155435r = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21054;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155421d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155422e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155423f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155424g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155425h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155426i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155427j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155428k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155429l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155430m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155431n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155432o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155433p);
        stringBuffer.append(",");
        stringBuffer.append(this.f155434q);
        stringBuffer.append(",");
        stringBuffer.append(this.f155435r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FinderUsrname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155421d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderWxAppInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155422e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsPrivate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155423f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155424g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155425h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LiveId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155426i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155427j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Description");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155428k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LiveTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155429l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155430m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OnlineCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155431n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155432o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155433p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155434q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChnlExtra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155435r);
        return stringBuffer.toString();
    }
}
