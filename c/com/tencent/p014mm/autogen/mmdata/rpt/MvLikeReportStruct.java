package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MvLikeReportStruct */
public final class MvLikeReportStruct extends C61103a {

    /* renamed from: d */
    public String f156646d = "";

    /* renamed from: e */
    public String f156647e = "";

    /* renamed from: f */
    public String f156648f = "";

    /* renamed from: g */
    public String f156649g = "";

    /* renamed from: h */
    public String f156650h = "";

    /* renamed from: i */
    public long f156651i;

    /* renamed from: j */
    public String f156652j = "";

    /* renamed from: k */
    public String f156653k = "";

    /* renamed from: l */
    public String f156654l = "";

    /* renamed from: m */
    public long f156655m;

    /* renamed from: n */
    public long f156656n;

    /* renamed from: o */
    public long f156657o;

    /* renamed from: p */
    public String f156658p = "";

    /* renamed from: q */
    public String f156659q = "";

    /* renamed from: r */
    public String f156660r = "";

    /* renamed from: s */
    public String f156661s = "";

    /* renamed from: t */
    public long f156662t;

    /* renamed from: j */
    public int mo1004j() {
        return 22230;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156646d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156647e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156648f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156649g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156650h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156651i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156652j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156653k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156654l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156655m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156656n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156657o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156658p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156659q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156660r);
        stringBuffer.append(",");
        stringBuffer.append(this.f156661s);
        stringBuffer.append(",");
        stringBuffer.append(this.f156662t);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156646d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156647e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156648f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WebUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156649g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DataUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156650h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156651i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156652j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvNonceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156653k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvUserId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156654l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MusicLength");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156655m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayMusicTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156656n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayMvTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156657o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156658p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentMessage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156659q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156660r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Singer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156661s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LikeButton");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156662t);
        return stringBuffer.toString();
    }
}
