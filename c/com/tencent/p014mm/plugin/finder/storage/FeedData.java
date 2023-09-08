package com.tencent.p014mm.plugin.finder.storage;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import te3.C64273c21;
import te3.C64689rq2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 k2\u00020\u0001:\u0001lB\u0007¢\u0006\u0004\bi\u0010jJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\fR\"\u0010 \u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010#\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010\b\u001a\u0004\b'\u0010\n\"\u0004\b(\u0010\fR\"\u0010)\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000f\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R(\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010\u000f\u001a\u0004\b5\u0010\u0011\"\u0004\b6\u0010\u0013R\"\u00108\u001a\u0002078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010?\u001a\b\u0012\u0004\u0012\u00020>0,8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010/\u001a\u0004\b@\u00101\"\u0004\bA\u00103R\"\u0010B\u001a\u0002078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u00109\u001a\u0004\bB\u0010;\"\u0004\bC\u0010=R\"\u0010D\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010\u000f\u001a\u0004\bE\u0010\u0011\"\u0004\bF\u0010\u0013R\"\u0010G\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bG\u0010\u000f\u001a\u0004\bH\u0010\u0011\"\u0004\bI\u0010\u0013R\"\u0010J\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0015\u001a\u0004\bK\u0010\u0017\"\u0004\bL\u0010\u0019R\"\u0010M\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0015\u001a\u0004\bN\u0010\u0017\"\u0004\bO\u0010\u0019R\"\u0010P\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bP\u0010\u000f\u001a\u0004\bQ\u0010\u0011\"\u0004\bR\u0010\u0013R\"\u0010S\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bS\u0010\u000f\u001a\u0004\bT\u0010\u0011\"\u0004\bU\u0010\u0013R$\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010]\u001a\u0002078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b]\u00109\u001a\u0004\b^\u0010;\"\u0004\b_\u0010=R\"\u0010`\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b`\u0010\b\u001a\u0004\ba\u0010\n\"\u0004\bb\u0010\fR\"\u0010c\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bc\u0010\u000f\u001a\u0004\bd\u0010\u0011\"\u0004\be\u0010\u0013R\"\u0010f\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bf\u0010\u000f\u001a\u0004\bg\u0010\u0011\"\u0004\bh\u0010\u0013¨\u0006m"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/storage/FeedData;", "", "", "getId", "getExpectId", "", "printSimpleId", "feedId", "J", "getFeedId", "()J", "setFeedId", "(J)V", "", "position", "I", "getPosition", "()I", "setPosition", "(I)V", "userName", "Ljava/lang/String;", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "sessionBuffer", "getSessionBuffer", "setSessionBuffer", "localId", "getLocalId", "setLocalId", "nickName", "getNickName", "setNickName", "description", "getDescription", "setDescription", "timestamps", "getTimestamps", "setTimestamps", "urlValidDuration", "getUrlValidDuration", "setUrlValidDuration", "Ljava/util/LinkedList;", "Lte3/rq2;", "mediaList", "Ljava/util/LinkedList;", "getMediaList", "()Ljava/util/LinkedList;", "setMediaList", "(Ljava/util/LinkedList;)V", "mediaType", "getMediaType", "setMediaType", "", "hasBgmInfo", "Z", "getHasBgmInfo", "()Z", "setHasBgmInfo", "(Z)V", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "rvFeedList", "getRvFeedList", "setRvFeedList", "isLongVideo", "setLongVideo", "likeCount", "getLikeCount", "setLikeCount", "commentCount", "getCommentCount", "setCommentCount", "nonceId", "getNonceId", "setNonceId", "nickname", "getNickname", "setNickname", "anchorStatus", "getAnchorStatus", "setAnchorStatus", "vrLive", "getVrLive", "setVrLive", "Lte3/c21;", "liveInfo", "Lte3/c21;", "getLiveInfo", "()Lte3/c21;", "setLiveInfo", "(Lte3/c21;)V", "ignoreLongTerm", "getIgnoreLongTerm", "setIgnoreLongTerm", "liveId", "getLiveId", "setLiveId", "liveStatus", "getLiveStatus", "setLiveStatus", "onlineNum", "getOnlineNum", "setOnlineNum", "<init>", "()V", "Companion", "a", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.storage.FeedData */
public final class FeedData {
    public static final C56323a Companion = new C56323a((C8480h) null);
    private int anchorStatus;
    private int commentCount;
    private String description = "";
    private long feedId;
    private boolean hasBgmInfo;
    private boolean ignoreLongTerm;
    private boolean isLongVideo;
    private int likeCount;
    private long liveId;
    private C64273c21 liveInfo;
    private int liveStatus;
    private long localId;
    private LinkedList<C64689rq2> mediaList = new LinkedList<>();
    private int mediaType;
    private String nickName = "";
    private String nickname = "";
    private String nonceId = "";
    private int onlineNum;
    private int position;
    private LinkedList<BaseFinderFeed> rvFeedList = new LinkedList<>();
    private String sessionBuffer = "";
    private long timestamps;
    private int urlValidDuration;
    private String userName = "";
    private int vrLive;

    /* renamed from: com.tencent.mm.plugin.finder.storage.FeedData$a */
    public static final class C56323a {
        public C56323a(C8480h hVar) {
        }

        /* renamed from: a */
        public final FeedData mo78883a(BaseFinderFeed baseFinderFeed) {
            C87412m.m108594g(baseFinderFeed, "baseFinderFeed");
            FeedData b = mo78884b(baseFinderFeed.mo3513o());
            b.setIgnoreLongTerm(baseFinderFeed.mo3517r());
            return b;
        }

        /* renamed from: b */
        public final FeedData mo78884b(FinderItem finderItem) {
            int i;
            int i2;
            C87412m.m108594g(finderItem, "finderItem");
            FeedData feedData = new FeedData();
            feedData.setFeedId(finderItem.getId());
            feedData.setUserName(finderItem.getUserName());
            String str = finderItem.getFeedObject().sessionBuffer;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            feedData.setSessionBuffer(str);
            feedData.setLocalId(finderItem.getLocalId());
            feedData.setNickName(finderItem.getNickName());
            feedData.setDescription(finderItem.getDescription());
            feedData.setTimestamps(finderItem.getTimestamps());
            feedData.setUrlValidDuration(finderItem.getFeedObject().urlValidDuration);
            feedData.setMediaList(finderItem.getMediaList());
            feedData.setMediaType(finderItem.getMediaType());
            FinderObjectDesc finderObjectDesc = finderItem.getFeedObject().objectDesc;
            String str3 = null;
            int i3 = 0;
            feedData.setHasBgmInfo((finderObjectDesc != null ? finderObjectDesc.feedBgmInfo : null) != null);
            feedData.setLikeCount(finderItem.getLikeCount());
            feedData.setCommentCount(finderItem.getCommentCount());
            C64273c21 c212 = finderItem.getFeedObject().liveInfo;
            feedData.setLiveId((c212 == null && (c212 = finderItem.getLiveInfo()) == null) ? 0 : c212.f182392d);
            FinderContact finderContact = finderItem.getFeedObject().contact;
            if (finderContact != null) {
                i = finderContact.liveStatus;
            } else {
                C64273c21 c213 = finderItem.getFeedObject().liveInfo;
                if (c213 != null) {
                    i = c213.f182394f;
                } else {
                    C64273c21 liveInfo = finderItem.getLiveInfo();
                    Integer valueOf = liveInfo != null ? Integer.valueOf(liveInfo.f182394f) : null;
                    i = valueOf != null ? valueOf.intValue() : 0;
                }
            }
            feedData.setLiveStatus(i);
            C64273c21 c214 = finderItem.getFeedObject().liveInfo;
            if (c214 != null) {
                i2 = c214.f182393e;
            } else {
                C64273c21 liveInfo2 = finderItem.getLiveInfo();
                i2 = liveInfo2 != null ? liveInfo2.f182393e : 0;
            }
            feedData.setOnlineNum(i2);
            FinderObject feedObject = finderItem.getFeedObject();
            if (feedObject != null) {
                str3 = feedObject.objectNonceId;
            }
            if (str3 != null) {
                str2 = str3;
            }
            feedData.setNonceId(str2);
            feedData.setNickname(finderItem.getNickName());
            C64273c21 c215 = finderItem.getFeedObject().liveInfo;
            feedData.setAnchorStatus(c215 != null ? (int) c215.f182367M : 0);
            C64273c21 c216 = finderItem.getFeedObject().liveInfo;
            if (c216 != null) {
                i3 = c216.f182384X;
            }
            feedData.setVrLive(i3);
            feedData.setLiveInfo(finderItem.getFeedObject().liveInfo);
            return feedData;
        }
    }

    public final int getAnchorStatus() {
        return this.anchorStatus;
    }

    public final int getCommentCount() {
        return this.commentCount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getExpectId() {
        long j = this.feedId;
        return j == 0 ? this.localId : j;
    }

    public final long getFeedId() {
        return this.feedId;
    }

    public final boolean getHasBgmInfo() {
        return this.hasBgmInfo;
    }

    public final long getId() {
        return this.feedId;
    }

    public final boolean getIgnoreLongTerm() {
        return this.ignoreLongTerm;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final long getLiveId() {
        return this.liveId;
    }

    public final C64273c21 getLiveInfo() {
        return this.liveInfo;
    }

    public final int getLiveStatus() {
        return this.liveStatus;
    }

    public final long getLocalId() {
        return this.localId;
    }

    public final LinkedList<C64689rq2> getMediaList() {
        return this.mediaList;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getNonceId() {
        return this.nonceId;
    }

    public final int getOnlineNum() {
        return this.onlineNum;
    }

    public final int getPosition() {
        return this.position;
    }

    public final LinkedList<BaseFinderFeed> getRvFeedList() {
        return this.rvFeedList;
    }

    public final String getSessionBuffer() {
        return this.sessionBuffer;
    }

    public final long getTimestamps() {
        return this.timestamps;
    }

    public final int getUrlValidDuration() {
        return this.urlValidDuration;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final int getVrLive() {
        return this.vrLive;
    }

    public final boolean isLongVideo() {
        return this.isLongVideo;
    }

    public final String printSimpleId() {
        String valueOf = String.valueOf(getId());
        String substring = valueOf.substring(0, Math.min(valueOf.length(), 8));
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void setAnchorStatus(int i) {
        this.anchorStatus = i;
    }

    public final void setCommentCount(int i) {
        this.commentCount = i;
    }

    public final void setDescription(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.description = str;
    }

    public final void setFeedId(long j) {
        this.feedId = j;
    }

    public final void setHasBgmInfo(boolean z) {
        this.hasBgmInfo = z;
    }

    public final void setIgnoreLongTerm(boolean z) {
        this.ignoreLongTerm = z;
    }

    public final void setLikeCount(int i) {
        this.likeCount = i;
    }

    public final void setLiveId(long j) {
        this.liveId = j;
    }

    public final void setLiveInfo(C64273c21 c212) {
        this.liveInfo = c212;
    }

    public final void setLiveStatus(int i) {
        this.liveStatus = i;
    }

    public final void setLocalId(long j) {
        this.localId = j;
    }

    public final void setLongVideo(boolean z) {
        this.isLongVideo = z;
    }

    public final void setMediaList(LinkedList<C64689rq2> linkedList) {
        C87412m.m108594g(linkedList, "<set-?>");
        this.mediaList = linkedList;
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setNickName(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.nickName = str;
    }

    public final void setNickname(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.nickname = str;
    }

    public final void setNonceId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.nonceId = str;
    }

    public final void setOnlineNum(int i) {
        this.onlineNum = i;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setRvFeedList(LinkedList<BaseFinderFeed> linkedList) {
        C87412m.m108594g(linkedList, "<set-?>");
        this.rvFeedList = linkedList;
    }

    public final void setSessionBuffer(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.sessionBuffer = str;
    }

    public final void setTimestamps(long j) {
        this.timestamps = j;
    }

    public final void setUrlValidDuration(int i) {
        this.urlValidDuration = i;
    }

    public final void setUserName(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.userName = str;
    }

    public final void setVrLive(int i) {
        this.vrLive = i;
    }
}
