package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderRealLikeExposeStruct */
public final class FinderRealLikeExposeStruct extends C61103a {

    /* renamed from: d */
    public String f155929d = "";

    /* renamed from: e */
    public String f155930e = "";

    /* renamed from: f */
    public String f155931f = "";

    /* renamed from: g */
    public String f155932g = "";

    /* renamed from: h */
    public long f155933h;

    /* renamed from: i */
    public String f155934i = "";

    /* renamed from: j */
    public long f155935j;

    /* renamed from: k */
    public long f155936k;

    /* renamed from: l */
    public String f155937l = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19955;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155929d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155930e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155931f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155932g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155933h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155934i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155935j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155936k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155937l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155929d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155930e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155931f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeItems");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155932g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsCgiEnd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155933h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155934i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155935j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalFriendLikeCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155936k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155937l);
        return stringBuffer.toString();
    }
}
