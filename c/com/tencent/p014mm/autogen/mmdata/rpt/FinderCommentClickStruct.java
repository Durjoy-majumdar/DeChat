package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderCommentClickStruct */
public final class FinderCommentClickStruct extends C61103a {

    /* renamed from: d */
    public String f155167d = "";

    /* renamed from: e */
    public String f155168e = "";

    /* renamed from: f */
    public String f155169f = "";

    /* renamed from: g */
    public String f155170g = "";

    /* renamed from: h */
    public long f155171h;

    /* renamed from: i */
    public long f155172i;

    /* renamed from: j */
    public long f155173j;

    /* renamed from: k */
    public int f155174k;

    /* renamed from: l */
    public long f155175l;

    /* renamed from: m */
    public long f155176m;

    /* renamed from: n */
    public String f155177n = "";

    /* renamed from: o */
    public String f155178o = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19017;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155167d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155168e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155169f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155170g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155171h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155172i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155173j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155174k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155175l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155176m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155177n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155178o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155167d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickUI");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155168e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155169f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedUsr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155170g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155171h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155172i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedFriLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155173j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickAll");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155174k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155175l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FullScreenCommentsArea");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155176m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155177n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155178o);
        return stringBuffer.toString();
    }
}
