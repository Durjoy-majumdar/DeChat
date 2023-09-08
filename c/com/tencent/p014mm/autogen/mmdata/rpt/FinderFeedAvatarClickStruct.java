package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderFeedAvatarClickStruct */
public final class FinderFeedAvatarClickStruct extends C61103a {

    /* renamed from: d */
    public String f155220d = "";

    /* renamed from: e */
    public String f155221e = "";

    /* renamed from: f */
    public long f155222f;

    /* renamed from: g */
    public String f155223g = "";

    /* renamed from: h */
    public long f155224h;

    /* renamed from: i */
    public long f155225i;

    /* renamed from: j */
    public long f155226j;

    /* renamed from: k */
    public String f155227k = "";

    /* renamed from: l */
    public long f155228l;

    /* renamed from: m */
    public long f155229m;

    /* renamed from: n */
    public long f155230n;

    /* renamed from: j */
    public int mo1004j() {
        return 19405;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f155220d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155221e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155222f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155223g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155224h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155225i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155226j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155227k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155228l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155229m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155230n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ClickAvatarScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155220d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155221e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155222f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155223g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155224h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155225i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155226j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155227k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155228l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewAvatarClickScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155229m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InnerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155230n);
        return stringBuffer.toString();
    }
}
