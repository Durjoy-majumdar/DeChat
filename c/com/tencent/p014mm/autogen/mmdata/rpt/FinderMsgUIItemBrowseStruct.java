package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct */
public final class FinderMsgUIItemBrowseStruct extends C61103a {

    /* renamed from: d */
    public String f155719d = "";

    /* renamed from: e */
    public long f155720e;

    /* renamed from: f */
    public long f155721f;

    /* renamed from: g */
    public long f155722g;

    /* renamed from: h */
    public long f155723h;

    /* renamed from: i */
    public long f155724i;

    /* renamed from: j */
    public long f155725j;

    /* renamed from: k */
    public long f155726k;

    /* renamed from: l */
    public long f155727l;

    /* renamed from: m */
    public long f155728m;

    /* renamed from: n */
    public long f155729n;

    /* renamed from: o */
    public long f155730o;

    /* renamed from: p */
    public long f155731p;

    /* renamed from: q */
    public long f155732q;

    /* renamed from: r */
    public long f155733r;

    /* renamed from: j */
    public int mo1004j() {
        return 19948;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155719d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155720e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155721f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155722g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155723h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155724i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155725j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155726k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155727l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155728m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155729n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155730o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155731p);
        stringBuffer.append(",");
        stringBuffer.append(this.f155732q);
        stringBuffer.append(",");
        stringBuffer.append(this.f155733r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155719d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FetchNewCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155720e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseTotalCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155721f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseNewCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155722g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseOldCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155723h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseNewFollowCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155724i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseNewLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155725j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseNewCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155726k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseNewAtCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155727l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseOldFollowCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155728m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseOldLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155729n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseOldCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155730o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseOldAtCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155731p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155732q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TabType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155733r);
        return stringBuffer.toString();
    }
}
