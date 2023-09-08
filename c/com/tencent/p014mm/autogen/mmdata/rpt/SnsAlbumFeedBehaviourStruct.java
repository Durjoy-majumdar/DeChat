package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct */
public final class SnsAlbumFeedBehaviourStruct extends C61103a {

    /* renamed from: d */
    public String f265933d = "";

    /* renamed from: e */
    public long f265934e;

    /* renamed from: f */
    public String f265935f = "";

    /* renamed from: g */
    public long f265936g;

    /* renamed from: h */
    public long f265937h;

    /* renamed from: i */
    public long f265938i;

    /* renamed from: j */
    public long f265939j;

    /* renamed from: k */
    public long f265940k;

    /* renamed from: l */
    public long f265941l;

    /* renamed from: m */
    public long f265942m;

    /* renamed from: n */
    public long f265943n;

    /* renamed from: o */
    public long f265944o;

    /* renamed from: p */
    public long f265945p;

    /* renamed from: q */
    public long f265946q;

    /* renamed from: r */
    public long f265947r;

    /* renamed from: s */
    public long f265948s;

    /* renamed from: j */
    public int mo1004j() {
        return 18849;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265933d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265934e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265935f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265936g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265937h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265938i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265939j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265940k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265941l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265942m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265943n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265944o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265945p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265946q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265947r);
        stringBuffer.append(",");
        stringBuffer.append(this.f265948s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ToUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265933d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265934e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265935f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265936g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IfAddText");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265937h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedMediaCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265938i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsClickedFromAlbum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265939j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsClickIntoDetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265940k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowsedPicCountAtDetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265941l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowsedPicCountAtGallery");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265942m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseTimeAtDetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265943n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseTimeAtGallery");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265944o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CanViewCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265945p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CanViewLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265946q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265947r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LikeFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265948s);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public SnsAlbumFeedBehaviourStruct mo126628s(long j) {
        this.f265937h = j;
        return this;
    }
}
