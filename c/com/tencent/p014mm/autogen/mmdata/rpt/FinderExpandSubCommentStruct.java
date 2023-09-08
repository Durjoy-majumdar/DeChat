package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderExpandSubCommentStruct */
public final class FinderExpandSubCommentStruct extends C61103a {

    /* renamed from: d */
    public long f155201d;

    /* renamed from: e */
    public long f155202e;

    /* renamed from: f */
    public String f155203f = "";

    /* renamed from: g */
    public String f155204g = "";

    /* renamed from: h */
    public String f155205h = "";

    /* renamed from: i */
    public String f155206i = "";

    /* renamed from: j */
    public long f155207j;

    /* renamed from: k */
    public long f155208k;

    /* renamed from: l */
    public String f155209l = "";

    /* renamed from: m */
    public long f155210m;

    /* renamed from: n */
    public long f155211n;

    /* renamed from: o */
    public long f155212o;

    /* renamed from: p */
    public long f155213p;

    /* renamed from: j */
    public int mo1004j() {
        return 19421;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155201d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155202e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155203f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155204g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155205h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155206i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155207j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155208k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155209l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155210m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155211n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155212o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155213p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ExpandType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155201d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExpandCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155202e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155203f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155204g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155205h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155206i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155207j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155208k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155209l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155210m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155211n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155212o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155213p);
        return stringBuffer.toString();
    }
}
