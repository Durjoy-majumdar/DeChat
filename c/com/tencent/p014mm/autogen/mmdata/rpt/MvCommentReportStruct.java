package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MvCommentReportStruct */
public final class MvCommentReportStruct extends C61103a {

    /* renamed from: d */
    public String f156522d = "";

    /* renamed from: e */
    public String f156523e = "";

    /* renamed from: f */
    public String f156524f = "";

    /* renamed from: g */
    public String f156525g = "";

    /* renamed from: h */
    public String f156526h = "";

    /* renamed from: i */
    public long f156527i;

    /* renamed from: j */
    public String f156528j = "";

    /* renamed from: k */
    public String f156529k = "";

    /* renamed from: l */
    public String f156530l = "";

    /* renamed from: m */
    public long f156531m;

    /* renamed from: n */
    public long f156532n;

    /* renamed from: o */
    public long f156533o;

    /* renamed from: p */
    public String f156534p = "";

    /* renamed from: q */
    public String f156535q = "";

    /* renamed from: r */
    public String f156536r = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22232;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156522d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156523e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156524f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156525g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156526h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156527i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156528j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156529k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156530l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156531m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156532n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156533o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156534p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156535q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156536r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156522d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156523e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156524f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WebUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156525g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DataUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156526h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156527i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156528j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvNonceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156529k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvUserId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156530l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MusicLength");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156531m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayMusicTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156532n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayMvTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156533o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156534p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentMessage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156535q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Singer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156536r);
        return stringBuffer.toString();
    }
}
