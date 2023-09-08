package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct */
public final class FinderEnterSharedCardStruct extends C61103a {

    /* renamed from: d */
    public String f155182d = "";

    /* renamed from: e */
    public long f155183e;

    /* renamed from: f */
    public long f155184f;

    /* renamed from: g */
    public String f155185g = "";

    /* renamed from: h */
    public String f155186h = "";

    /* renamed from: i */
    public String f155187i = "";

    /* renamed from: j */
    public String f155188j = "";

    /* renamed from: k */
    public String f155189k = "";

    /* renamed from: l */
    public long f155190l;

    /* renamed from: m */
    public long f155191m;

    /* renamed from: n */
    public long f155192n;

    /* renamed from: o */
    public String f155193o = "";

    /* renamed from: p */
    public long f155194p;

    /* renamed from: q */
    public String f155195q = "";

    /* renamed from: r */
    public String f155196r = "";

    /* renamed from: s */
    public String f155197s = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18944;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155182d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155183e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155184f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155185g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155186h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155187i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155188j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155189k);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f155190l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155191m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155192n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155193o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155194p);
        stringBuffer.append(",");
        stringBuffer.append(this.f155195q);
        stringBuffer.append(",");
        stringBuffer.append(this.f155196r);
        stringBuffer.append(",");
        stringBuffer.append(this.f155197s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155182d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155183e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CardType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155184f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceUsr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155185g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155186h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedUsr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155187i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Tag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155188j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TagId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155189k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsPoi");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TagFeedCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsHaveCover");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155190l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsCgiEnd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155191m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UIType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155192n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GroupID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155193o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TrackType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155194p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ColumnId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155195q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActivityID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155196r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155197s);
        return stringBuffer.toString();
    }
}
