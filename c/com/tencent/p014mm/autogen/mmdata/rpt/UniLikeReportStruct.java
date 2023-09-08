package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.UniLikeReportStruct */
public final class UniLikeReportStruct extends C61103a {

    /* renamed from: d */
    public String f156876d = "";

    /* renamed from: e */
    public String f156877e = "";

    /* renamed from: f */
    public String f156878f = "";

    /* renamed from: g */
    public String f156879g = "";

    /* renamed from: h */
    public String f156880h = "";

    /* renamed from: i */
    public long f156881i;

    /* renamed from: j */
    public String f156882j = "";

    /* renamed from: k */
    public String f156883k = "";

    /* renamed from: l */
    public String f156884l = "";

    /* renamed from: m */
    public long f156885m;

    /* renamed from: n */
    public long f156886n;

    /* renamed from: o */
    public long f156887o;

    /* renamed from: p */
    public String f156888p = "";

    /* renamed from: q */
    public String f156889q = "";

    /* renamed from: r */
    public String f156890r = "";

    /* renamed from: s */
    public String f156891s = "";

    /* renamed from: t */
    public long f156892t;

    /* renamed from: j */
    public int mo1004j() {
        return 22230;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156876d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156877e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156878f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156879g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156880h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156881i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156882j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156883k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156884l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156885m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156886n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156887o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156888p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156889q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156890r);
        stringBuffer.append(",");
        stringBuffer.append(this.f156891s);
        stringBuffer.append(",");
        stringBuffer.append(this.f156892t);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156876d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156877e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156878f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WebUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156879g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DataUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156880h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156881i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156882j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvNonceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156883k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvUserId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156884l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MusicLength");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156885m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayMusicTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156886n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayMvTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156887o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156888p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentMessage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156889q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156890r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Singer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156891s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LikeButton");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156892t);
        return stringBuffer.toString();
    }
}
