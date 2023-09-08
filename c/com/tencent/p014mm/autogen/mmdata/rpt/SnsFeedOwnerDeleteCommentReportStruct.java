package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsFeedOwnerDeleteCommentReportStruct */
public final class SnsFeedOwnerDeleteCommentReportStruct extends C61103a {

    /* renamed from: d */
    public String f266036d = "";

    /* renamed from: e */
    public String f266037e = "";

    /* renamed from: f */
    public String f266038f = "";

    /* renamed from: g */
    public int f266039g;

    /* renamed from: h */
    public long f266040h;

    /* renamed from: i */
    public long f266041i;

    /* renamed from: j */
    public int f266042j;

    /* renamed from: j */
    public int mo1004j() {
        return 20565;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266036d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266037e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266038f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266039g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266040h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266041i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266042j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PublishId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266036d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FriendUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266037e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266038f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266039g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrentLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266040h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrentCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266041i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OpResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266042j);
        return stringBuffer.toString();
    }
}
