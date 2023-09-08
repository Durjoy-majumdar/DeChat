package com.tencent.p014mm.plugin.finder.model;

import cm1.C0740i2;
import cm1.C55033u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import di3.C86312j;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONObject;
import pe3.C89349b;
import te3.C51124rl1;
import te3.C52192z0;
import te3.C64726td1;
import te3.C64770ve1;
import tf1.C13914m;
import up1.C14357o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010+\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001b\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\"\u0010-\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\"\u00100\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\"\u00103\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u001eR\"\u00107\u001a\u0002068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u0002068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R(\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010O\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010\u001b\u001a\u0004\bP\u0010\u001c\"\u0004\bQ\u0010\u001eR$\u0010S\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Y\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bY\u0010\u001b\u001a\u0004\bZ\u0010\u001c\"\u0004\b[\u0010\u001eR\"\u0010\\\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u001b\u001a\u0004\b]\u0010\u001c\"\u0004\b^\u0010\u001eR\"\u0010_\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b_\u0010\u001b\u001a\u0004\b`\u0010\u001c\"\u0004\ba\u0010\u001eR\"\u0010b\u001a\u0002068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bb\u00108\u001a\u0004\bb\u0010:\"\u0004\bc\u0010<R$\u0010e\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010k\u001a\u0002068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bk\u00108\u001a\u0004\bl\u0010:\"\u0004\bm\u0010<R\u0019\u0010o\u001a\u0004\u0018\u00010n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\"\u0010s\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bs\u0010\u001b\u001a\u0004\bt\u0010\u001c\"\u0004\bu\u0010\u001eR\"\u0010v\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bv\u0010\u001b\u001a\u0004\b8\u0010\u001c\"\u0004\bw\u0010\u001eR\"\u0010x\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bx\u0010\u001b\u001a\u0004\by\u0010\u001c\"\u0004\bz\u0010\u001eR\"\u0010{\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b{\u0010\u001b\u001a\u0004\b|\u0010\u001c\"\u0004\b}\u0010\u001eR\"\u0010~\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b~\u0010\u001b\u001a\u0004\b~\u0010\u001c\"\u0004\b\u0010\u001eR&\u0010\u0001\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\u001b\u001a\u0005\b\u0001\u0010\u001c\"\u0005\b\u0001\u0010\u001eR&\u0010\u0001\u001a\u0002068\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u00108\u001a\u0005\b\u0001\u0010:\"\u0005\b\u0001\u0010<R&\u0010\u0001\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\u001b\u001a\u0005\b\u0001\u0010\u001c\"\u0005\b\u0001\u0010\u001eR&\u0010\u0001\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\u001b\u001a\u0005\b\u0001\u0010\u001c\"\u0005\b\u0001\u0010\u001eR&\u0010\u0001\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\u001b\u001a\u0005\b\u0001\u0010\u001c\"\u0005\b\u0001\u0010\u001eR&\u0010\u0001\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\u001b\u001a\u0005\b\u0001\u0010\u001c\"\u0005\b\u0001\u0010\u001eR.\u0010\u0001\u001a\u00020\u00192\u0007\u0010\u0001\u001a\u00020\u00198\u0006@FX\u000e¢\u0006\u0014\n\u0005\b\u0001\u0010\u001b\u001a\u0005\b\u0001\u0010\u001c\"\u0004\b\u001b\u0010\u001eR&\u0010\u0001\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\u001b\u001a\u0005\b\u0001\u0010\u001c\"\u0005\b\u0001\u0010\u001eR\u001d\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\u001b\u001a\u0005\b\u0001\u0010\u001c\"\u0005\b\u0001\u0010\u001e¨\u0006 \u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "Lcm1/i2;", "", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "feedObject", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "o", "()Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "V", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "Ljava/util/LinkedList;", "Lcm1/u;", "commentList", "Ljava/util/LinkedList;", "getCommentList", "()Ljava/util/LinkedList;", "setCommentList", "(Ljava/util/LinkedList;)V", "Lfe1/q;", "contact", "Lfe1/q;", "l", "()Lfe1/q;", "Q", "(Lfe1/q;)V", "", "isContentCollapsed", "Z", "()Z", "setContentCollapsed", "(Z)V", "isShowFooterMask", "setShowFooterMask", "", "headerWording", "Ljava/lang/String;", "getHeaderWording", "()Ljava/lang/String;", "d0", "(Ljava/lang/String;)V", "footerWording", "getFooterWording", "X", "isNeedShowUnFollow", "setNeedShowUnFollow", "showLikeTips", "B", "l0", "showCommentEdu", "A", "j0", "showShareSns", "C", "m0", "", "msgEventFriendLikeCount", "I", "u", "()I", "setMsgEventFriendLikeCount", "(I)V", "msgEventIncCount", "v", "setMsgEventIncCount", "", "Lcom/tencent/mm/protocal/protobuf/FinderCommentInfo;", "msgEventLikeList", "Ljava/util/List;", "w", "()Ljava/util/List;", "setMsgEventLikeList", "(Ljava/util/List;)V", "Lup1/o;", "attachFavInfo", "Lup1/o;", "getAttachFavInfo", "()Lup1/o;", "setAttachFavInfo", "(Lup1/o;)V", "doingRelReq", "getDoingRelReq", "setDoingRelReq", "Lpe3/b;", "likeBuffer", "Lpe3/b;", "s", "()Lpe3/b;", "setLikeBuffer", "(Lpe3/b;)V", "isOriginFeed", "L", "i0", "isPreview", "M", "setPreview", "markRead", "t", "g0", "isShowHistoryTips", "setShowHistoryTips", "Lte3/rl1;", "streamDivider", "Lte3/rl1;", "D", "()Lte3/rl1;", "n0", "(Lte3/rl1;)V", "isShowGuideTips", "N", "k0", "Lte3/td1;", "musicInfo", "Lte3/td1;", "x", "()Lte3/td1;", "isDeepEnjoy", "F", "T", "isHalfEnjoy", "Y", "hasShowFollowAnim", "q", "b0", "isFinishPostSoon", "H", "W", "isHasLongVideoTimeBack", "a0", "isHasShowGuideHot", "J", "c0", "currentFocusPos", "m", "R", "currentUsed", "n", "S", "ignoreLongTerm", "r", "f0", "isHistoryFeed", "K", "e0", "isDescEllipsized", "G", "U", "value", "hasExposed", "p", "needToPreload", "y", "h0", "Lorg/json/JSONObject;", "udfKv", "Lorg/json/JSONObject;", "E", "()Lorg/json/JSONObject;", "isUnReadCacheFeed", "O", "o0", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.model.BaseFinderFeed */
public abstract class BaseFinderFeed implements C0740i2 {
    private C14357o attachFavInfo;
    private LinkedList<C55033u> commentList = new LinkedList<>();
    private C58969q contact;
    private int currentFocusPos;
    private boolean currentUsed;
    private boolean doingRelReq;
    private FinderItem feedObject;
    private String footerWording = "";
    private boolean hasExposed;
    private boolean hasShowFollowAnim;
    private String headerWording = "";
    private boolean ignoreLongTerm;
    private boolean isContentCollapsed = true;
    private boolean isDeepEnjoy;
    private boolean isDescEllipsized;
    private boolean isFinishPostSoon;
    private boolean isHalfEnjoy;
    private boolean isHasLongVideoTimeBack;
    private boolean isHasShowGuideHot;
    private boolean isHistoryFeed;
    private boolean isNeedShowUnFollow;
    private boolean isOriginFeed;
    private boolean isPreview;
    private boolean isShowFooterMask;
    private int isShowGuideTips;
    private int isShowHistoryTips;
    private boolean isUnReadCacheFeed;
    private C89349b likeBuffer;
    private boolean markRead;
    private int msgEventFriendLikeCount;
    private int msgEventIncCount;
    private List<? extends FinderCommentInfo> msgEventLikeList;
    private final C64726td1 musicInfo;
    private boolean needToPreload;
    private boolean showCommentEdu;
    private boolean showLikeTips;
    private boolean showShareSns;
    private C51124rl1 streamDivider;
    private final JSONObject udfKv;

    public BaseFinderFeed(FinderItem finderItem) {
        C64770ve1 ve12;
        C87412m.m108594g(finderItem, "feedObject");
        this.feedObject = finderItem;
        this.msgEventFriendLikeCount = finderItem.getFriendLikeCount();
        this.msgEventIncCount = finderItem.getFeedObject().incFriendLikeCount;
        LinkedList<FinderCommentInfo> likeList = finderItem.getLikeList();
        ArrayList arrayList = new ArrayList();
        for (T next : likeList) {
            if (((FinderCommentInfo) next).unreadFlag == 1) {
                arrayList.add(next);
            }
        }
        this.msgEventLikeList = arrayList;
        this.likeBuffer = finderItem.getFeedObject().likeBuffer;
        this.isPreview = finderItem.isPreview();
        FinderObjectDesc finderObjectDesc = finderItem.getFeedObject().objectDesc;
        this.musicInfo = (finderObjectDesc == null || (ve12 = finderObjectDesc.feedBgmInfo) == null) ? null : ve12.f185873d;
        this.needToPreload = true;
        this.udfKv = new JSONObject();
    }

    /* renamed from: A */
    public final boolean mo3467A() {
        return this.showCommentEdu;
    }

    /* renamed from: B */
    public final boolean mo3468B() {
        return this.showLikeTips;
    }

    /* renamed from: C */
    public final boolean mo3469C() {
        return this.showShareSns;
    }

    /* renamed from: D */
    public final C51124rl1 mo3470D() {
        return this.streamDivider;
    }

    /* renamed from: E */
    public final JSONObject mo3471E() {
        return this.udfKv;
    }

    /* renamed from: F */
    public final boolean mo3472F() {
        return this.isDeepEnjoy;
    }

    /* renamed from: G */
    public final boolean mo3473G() {
        return this.isDescEllipsized;
    }

    /* renamed from: H */
    public final boolean mo3474H() {
        return this.isFinishPostSoon;
    }

    /* renamed from: I */
    public final boolean mo3475I() {
        return this.isHalfEnjoy;
    }

    /* renamed from: J */
    public final boolean mo3476J() {
        return this.isHasShowGuideHot;
    }

    /* renamed from: K */
    public final boolean mo3477K() {
        return this.isHistoryFeed;
    }

    /* renamed from: L */
    public final boolean mo3478L() {
        return this.isOriginFeed;
    }

    /* renamed from: M */
    public final boolean mo3479M() {
        return this.isPreview;
    }

    /* renamed from: N */
    public final int mo3480N() {
        return this.isShowGuideTips;
    }

    /* renamed from: O */
    public final boolean mo3481O() {
        return this.isUnReadCacheFeed;
    }

    /* renamed from: P */
    public void mo3482P() {
        this.showLikeTips = false;
        this.showShareSns = false;
    }

    /* renamed from: Q */
    public final void mo3483Q(C58969q qVar) {
        this.contact = qVar;
    }

    /* renamed from: R */
    public final void mo3484R(int i) {
        this.currentFocusPos = i;
    }

    /* renamed from: S */
    public final void mo3485S(boolean z) {
        this.currentUsed = z;
    }

    /* renamed from: T */
    public final void mo3486T(boolean z) {
        this.isDeepEnjoy = z;
    }

    /* renamed from: U */
    public final void mo3487U(boolean z) {
        this.isDescEllipsized = z;
    }

    /* renamed from: V */
    public final void mo3488V(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "<set-?>");
        this.feedObject = finderItem;
    }

    /* renamed from: W */
    public final void mo3489W(boolean z) {
        this.isFinishPostSoon = z;
    }

    /* renamed from: X */
    public final void mo3490X(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.footerWording = str;
    }

    /* renamed from: Y */
    public final void mo3491Y(boolean z) {
        this.isHalfEnjoy = z;
    }

    /* renamed from: Z */
    public final void mo3492Z(boolean z) {
        this.hasExposed = z;
        if (z) {
            this.isUnReadCacheFeed = false;
        }
    }

    /* renamed from: a0 */
    public final void mo3493a0(boolean z) {
        this.isHasLongVideoTimeBack = z;
    }

    /* renamed from: b0 */
    public final void mo3494b0(boolean z) {
        this.hasShowFollowAnim = z;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.feedObject.getMediaType();
    }

    /* renamed from: c0 */
    public final void mo3495c0(boolean z) {
        this.isHasShowGuideHot = z;
    }

    /* renamed from: d0 */
    public final void mo3496d0(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.headerWording = str;
    }

    /* renamed from: e0 */
    public final void mo3497e0(boolean z) {
        this.isHistoryFeed = z;
    }

    public boolean equals(Object obj) {
        return obj instanceof BaseFinderFeed ? getItemId() == ((BaseFinderFeed) obj).getItemId() : super.equals(obj);
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        BaseFinderFeed baseFinderFeed = mVar instanceof BaseFinderFeed ? (BaseFinderFeed) mVar : null;
        if (baseFinderFeed != null) {
            FinderItem finderItem = baseFinderFeed.feedObject;
            long j = finderItem.field_id;
            if (j != 0) {
                long j2 = this.feedObject.field_id;
                if (j2 != 0 && j == j2) {
                    return 0;
                }
            }
            if (finderItem.getLocalId() > 0 && this.feedObject.getLocalId() > 0 && baseFinderFeed.feedObject.getLocalId() == this.feedObject.getLocalId()) {
                return 0;
            }
            if (this.feedObject.getCreateTime() > baseFinderFeed.feedObject.getCreateTime()) {
                return 1;
            }
        }
        return -1;
    }

    /* renamed from: f0 */
    public final void mo3499f0(boolean z) {
        this.ignoreLongTerm = z;
    }

    /* renamed from: g0 */
    public final void mo3500g0(boolean z) {
        this.markRead = z;
    }

    public long getItemId() {
        FinderItem finderItem = this.feedObject;
        long j = finderItem.field_id;
        return j == 0 ? finderItem.getLocalId() : j;
    }

    /* renamed from: h0 */
    public final void mo3501h0(boolean z) {
        this.needToPreload = z;
    }

    public int hashCode() {
        return (int) getItemId();
    }

    /* renamed from: i */
    public final String mo3503i() {
        C52192z0 e6;
        String str;
        C58969q qVar = this.contact;
        String str2 = null;
        String avatarUrl = qVar != null ? qVar.getAvatarUrl() : null;
        if (avatarUrl == null || avatarUrl.length() == 0) {
            FinderContact finderContact = this.feedObject.getFeedObject().contact;
            if (finderContact != null) {
                str2 = finderContact.headUrl;
            }
            avatarUrl = str2;
        }
        C60216z4 l7 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7();
        return (!l7.mo83767N5(this.feedObject.getFeedObject()) || (e6 = l7.mo83786e6(this.feedObject.getFeedObject())) == null || (str = e6.f145601e) == null) ? avatarUrl : str;
    }

    /* renamed from: i0 */
    public final void mo3504i0(boolean z) {
        this.isOriginFeed = z;
    }

    /* renamed from: j0 */
    public final void mo3505j0(boolean z) {
        this.showCommentEdu = z;
    }

    /* renamed from: k0 */
    public final void mo3506k0(int i) {
        this.isShowGuideTips = i;
    }

    /* renamed from: l */
    public final C58969q mo3507l() {
        return this.contact;
    }

    /* renamed from: l0 */
    public final void mo3508l0(boolean z) {
        this.showLikeTips = z;
    }

    /* renamed from: m */
    public final int mo3509m() {
        return this.currentFocusPos;
    }

    /* renamed from: m0 */
    public final void mo3510m0(boolean z) {
        this.showShareSns = z;
    }

    /* renamed from: n */
    public final boolean mo3511n() {
        return this.currentUsed;
    }

    /* renamed from: n0 */
    public final void mo3512n0(C51124rl1 rl12) {
        this.streamDivider = rl12;
    }

    /* renamed from: o */
    public final FinderItem mo3513o() {
        return this.feedObject;
    }

    /* renamed from: o0 */
    public final void mo3514o0(boolean z) {
        this.isUnReadCacheFeed = z;
    }

    /* renamed from: p */
    public final boolean mo3515p() {
        return this.hasExposed;
    }

    /* renamed from: q */
    public final boolean mo3516q() {
        return this.hasShowFollowAnim;
    }

    /* renamed from: r */
    public final boolean mo3517r() {
        return this.ignoreLongTerm;
    }

    /* renamed from: s */
    public final C89349b mo3518s() {
        return this.likeBuffer;
    }

    /* renamed from: t */
    public final boolean mo3519t() {
        return this.markRead;
    }

    public String toString() {
        Integer valueOf = Integer.valueOf(this.feedObject.getCreateTime());
        if (this.feedObject.getMediaList().size() > 0) {
            String str = this.feedObject.getMediaList().get(0).f185266d;
        }
        return "id=[" + this.feedObject.field_id + ',' + C61926c.m72691p(this.feedObject.field_id) + "] type=" + this.feedObject.getMediaType() + " localId=" + this.feedObject.getLocalId() + " time:" + valueOf + ' ' + "";
    }

    /* renamed from: u */
    public final int mo3521u() {
        return this.msgEventFriendLikeCount;
    }

    /* renamed from: v */
    public final int mo3522v() {
        return this.msgEventIncCount;
    }

    /* renamed from: w */
    public final List<FinderCommentInfo> mo3523w() {
        return this.msgEventLikeList;
    }

    /* renamed from: x */
    public final C64726td1 mo3524x() {
        return this.musicInfo;
    }

    /* renamed from: y */
    public final boolean mo3525y() {
        return this.needToPreload;
    }

    /* renamed from: z */
    public String mo3526z() {
        String str = this.feedObject.getFeedObject().sessionBuffer;
        return str == null ? "" : str;
    }
}
