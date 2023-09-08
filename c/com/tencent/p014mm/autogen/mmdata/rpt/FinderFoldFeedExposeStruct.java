package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderFoldFeedExposeStruct */
public final class FinderFoldFeedExposeStruct extends C61103a {

    /* renamed from: d */
    public long f155306d;

    /* renamed from: e */
    public String f155307e = "";

    /* renamed from: f */
    public String f155308f = "";

    /* renamed from: g */
    public String f155309g = "";

    /* renamed from: h */
    public String f155310h = "";

    /* renamed from: i */
    public String f155311i = "";

    /* renamed from: j */
    public long f155312j;

    /* renamed from: k */
    public String f155313k = "";

    /* renamed from: l */
    public long f155314l;

    /* renamed from: m */
    public long f155315m;

    /* renamed from: j */
    public int mo1004j() {
        return 20027;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155306d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155307e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155308f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155309g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155310h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155311i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155312j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155313k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155314l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155315m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155306d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155307e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155308f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155309g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155310h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FlodUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155311i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FlodFeedCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155312j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AllFlodFeedItems");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155313k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MoreTabClickTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155314l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TopTabClickTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155315m);
        return stringBuffer.toString();
    }
}
