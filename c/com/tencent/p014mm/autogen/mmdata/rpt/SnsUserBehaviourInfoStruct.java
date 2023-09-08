package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct */
public final class SnsUserBehaviourInfoStruct extends C61103a {

    /* renamed from: d */
    public String f266212d = "";

    /* renamed from: e */
    public long f266213e;

    /* renamed from: f */
    public long f266214f;

    /* renamed from: g */
    public long f266215g;

    /* renamed from: h */
    public long f266216h;

    /* renamed from: i */
    public long f266217i;

    /* renamed from: j */
    public long f266218j;

    /* renamed from: k */
    public long f266219k;

    /* renamed from: l */
    public long f266220l;

    /* renamed from: m */
    public long f266221m;

    /* renamed from: n */
    public long f266222n;

    /* renamed from: o */
    public long f266223o;

    /* renamed from: p */
    public long f266224p;

    /* renamed from: q */
    public long f266225q;

    /* renamed from: r */
    public long f266226r;

    /* renamed from: s */
    public long f266227s;

    /* renamed from: t */
    public String f266228t = "";

    /* renamed from: u */
    public long f266229u;

    /* renamed from: v */
    public long f266230v;

    /* renamed from: w */
    public long f266231w;

    /* renamed from: x */
    public long f266232x;

    /* renamed from: y */
    public C92613a f266233y;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct$a */
    public enum C92613a {
        HIDE_ENTRANCE(1);
        

        /* renamed from: d */
        public final int f266236d;

        /* access modifiers changed from: public */
        C92613a(int i) {
            this.f266236d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 18840;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266212d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266213e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266214f);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f266215g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266216h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266217i);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f266218j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266219k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266220l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266221m);
        stringBuffer.append(",");
        stringBuffer.append(this.f266222n);
        stringBuffer.append(",");
        stringBuffer.append(this.f266223o);
        stringBuffer.append(",");
        stringBuffer.append(this.f266224p);
        stringBuffer.append(",");
        stringBuffer.append(this.f266225q);
        stringBuffer.append(",");
        stringBuffer.append(this.f266226r);
        stringBuffer.append(",");
        stringBuffer.append(this.f266227s);
        stringBuffer.append(",");
        stringBuffer.append(this.f266228t);
        stringBuffer.append(",");
        stringBuffer.append(this.f266229u);
        stringBuffer.append(",");
        stringBuffer.append(this.f266230v);
        stringBuffer.append(",");
        stringBuffer.append(this.f266231w);
        stringBuffer.append(",");
        stringBuffer.append(this.f266232x);
        stringBuffer.append(",");
        C92613a aVar = this.f266233y;
        stringBuffer.append(aVar != null ? aVar.f266236d : -1);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("OwnerUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266212d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266213e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFriend");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266214f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OwnerSetting");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OwnerPrivacySetting");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AlbumEntrancePicCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266215g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AlbumExplodeFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266216h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AlbumClickFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266217i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AlbumClickFeedList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AlbumTimelineStayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266218j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AlbumTimeDragCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266219k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LikeBanner");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266220l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GalleryBrowseFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266221m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GalleryBrowsePictureCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266222n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GalleryStayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266223o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedDetailPageBrowseFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266224p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedDetailPageBrowsePictureCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266225q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedDetailPageStayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266226r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalStayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266227s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AlbumClickFeedListStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266228t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("albumBannerFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266229u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("signatureFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266230v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("withFriendsFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266231w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("withFriendsStayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266232x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasWithFriends");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266233y);
        return stringBuffer.toString();
    }
}
