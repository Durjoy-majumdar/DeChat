package com.tencent.p014mm.plugin.finder.nearby.video;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bh3.C113177k;
import bl3.C39818r;
import cm1.C0731g;
import cm1.C0735h;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import f40.C86709a0;
import fe1.C8014g;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60898l;
import k20.C60958c;
import k20.C9556a;
import kn1.C10364a;
import kotlin.Metadata;
import nc0.C76850a;
import o40.C61926c;
import os1.C11759w;
import p286zl.C16292g;
import p447aw.C103918d;
import pe3.C89349b;
import pm1.C62381d;
import qm1.C63285a;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C51942x91;
import tf1.C13908i;
import up1.C37521f;
import zp3.C16389w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001iB\u000f\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\bg\u0010hJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0016\u0010\u001a\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\fH\u0016J\b\u0010!\u001a\u00020\u0003H\u0016J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\b\u0010(\u001a\u00020\u0003H\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\b\u0010*\u001a\u00020\u0003H\u0016J\u000e\u0010-\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+J\u0006\u0010.\u001a\u00020\u0003J\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u00020\u0003J/\u00106\u001a\u00020\u00032\u0006\u00101\u001a\u00020\f2\u000e\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010<R\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010<R\u0016\u0010P\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010<R\u0017\u0010R\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\"\u0010Y\u001a\u00020\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bY\u0010<\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010<R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010<R\u0016\u0010e\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010<R\u0016\u0010f\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010<¨\u0006j"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter;", "Lcom/tencent/mm/plugin/finder/nearby/video/a;", "Lcm1/i2;", "Lrx3/b0;", "requestRefresh", "requestRefreshNoPermission", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$c;", "", "r", "checkEmptyHeader", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "findFirstPosition", "", "invokeSource", "checkAutoPlay", "checkPermission", "checkTryRequestFirstPageAgain", "requestLocationPermission", "onRefresh", "reason", "onRefreshEnd", "onLoadMore", "Lcom/tencent/mm/plugin/finder/nearby/video/b;", "callback", "onAttach", "", "delayStart", "", "isSilence", "autoFlingToRefresh", "getCommentScene", "onFinishing", "isDouble", "onActionbarClick", "onDetach", "", "Ljq3/l$a;", "getHeaderInfo", "onUserVisibleFocused", "checkAndShowBusinessPermissionDialog", "onUserVisibleUnFocused", "Landroid/content/Intent;", "data", "refreshRV", "onResume", "onPause", "onStop", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/tencent/mm/ui/MMActivity;", "activity", "Lcom/tencent/mm/ui/MMActivity;", "firstAttach", "Z", "viewCallback", "Lcom/tencent/mm/plugin/finder/nearby/video/b;", "getViewCallback", "()Lcom/tencent/mm/plugin/finder/nearby/video/b;", "setViewCallback", "(Lcom/tencent/mm/plugin/finder/nearby/video/b;)V", "Los1/w;", "tlCache", "Los1/w;", "canTimelineRefresh", "Lkn1/a;", "nextPagePreload", "Lkn1/a;", "Lpm1/d;", "liveAutoPlayManager", "Lpm1/d;", "totalDy", "I", "isOnUserVisibleFocused", "isOnResume", "Lcom/tencent/mm/plugin/finder/nearby/video/NearbyVideoFeedLoader;", "feedLoader", "Lcom/tencent/mm/plugin/finder/nearby/video/NearbyVideoFeedLoader;", "getFeedLoader", "()Lcom/tencent/mm/plugin/finder/nearby/video/NearbyVideoFeedLoader;", "Lzp3/w;", "tagViewActionCallback", "Lzp3/w;", "isRequestingLbs", "()Z", "setRequestingLbs", "(Z)V", "isEmptyLocation", "Lcm1/g;", "emptyData", "Lcm1/g;", "Lcm1/h;", "msgNotifyData", "Lcm1/h;", "isFirstOnUserVisibleFocused", "isFirstOnResume", "lastOnPauseHasPermission", "<init>", "(Lcom/tencent/mm/ui/MMActivity;)V", "Companion", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter */
public final class NearbyVideoPresenter implements C3342a<C0740i2> {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "Finder.NearbyVideoPresenter";
    private byte _hellAccFlag_;
    private final MMActivity activity;
    /* access modifiers changed from: private */
    public final boolean canTimelineRefresh;
    /* access modifiers changed from: private */
    public C0731g emptyData = new C0731g((CharSequence) null, 0, 0, 7, (C8480h) null);
    private final NearbyVideoFeedLoader feedLoader;
    private boolean firstAttach;
    /* access modifiers changed from: private */
    public boolean isEmptyLocation;
    private boolean isFirstOnResume = true;
    private boolean isFirstOnUserVisibleFocused = true;
    private boolean isOnResume;
    private boolean isOnUserVisibleFocused;
    private boolean isRequestingLbs;
    private boolean lastOnPauseHasPermission;
    private C62381d liveAutoPlayManager;
    private final C0735h msgNotifyData = new C0735h();
    /* access modifiers changed from: private */
    public C10364a nextPagePreload;
    private C16389w tagViewActionCallback = new NearbyVideoPresenter$tagViewActionCallback$1(this);
    /* access modifiers changed from: private */
    public final C11759w tlCache;
    /* access modifiers changed from: private */
    public int totalDy;
    public C3343b<C0740i2> viewCallback;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter$Companion;", "", "()V", "TAG", "", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public NearbyVideoPresenter(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.activity = mMActivity;
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11759w.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…eloadCacheVM::class.java)");
        C11759w wVar = (C11759w) a;
        this.tlCache = wVar;
        boolean f3 = wVar.mo11637f3(2);
        this.canTimelineRefresh = f3;
        C13908i a2 = C13908i.f39090e.mo13382a(2);
        C49712hj1 q3 = ((C13442s8) rVar.mo62444c(mMActivity).mo75002a(C13442s8.class)).mo12861q3();
        q3.f134675i = getCommentScene();
        C13598b0 b0Var = C13598b0.f38549a;
        NearbyVideoFeedLoader nearbyVideoFeedLoader = new NearbyVideoFeedLoader(a2, f3 ^ true ? 1 : 0, q3);
        nearbyVideoFeedLoader.setInitDone(new NearbyVideoPresenter$feedLoader$2$1(nearbyVideoFeedLoader, this));
        this.feedLoader = nearbyVideoFeedLoader;
    }

    /* access modifiers changed from: private */
    public final void checkAutoPlay(String str) {
        if (!this.isOnResume) {
            Log.m105924i(TAG, "checkAutoPlay " + str + " return for isOnResume:" + this.isOnResume + ' ');
        } else if (!this.isOnUserVisibleFocused) {
            Log.m105924i(TAG, "checkAutoPlay " + str + " return for isOnUserVisibleFocused:" + this.isOnUserVisibleFocused + '}');
        } else {
            C62381d dVar = this.liveAutoPlayManager;
            if (dVar != null) {
                dVar.mo11215b();
            }
        }
    }

    public static /* synthetic */ void checkAutoPlay$default(NearbyVideoPresenter nearbyVideoPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        nearbyVideoPresenter.checkAutoPlay(str);
    }

    /* access modifiers changed from: private */
    public final void checkEmptyHeader(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C61926c.m72668M(new NearbyVideoPresenter$checkEmptyHeader$1(cVar, this));
    }

    public static /* synthetic */ void checkEmptyHeader$default(NearbyVideoPresenter nearbyVideoPresenter, RefreshLoadMoreLayout.C7080c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        nearbyVideoPresenter.checkEmptyHeader(cVar);
    }

    private final void checkPermission() {
        this.lastOnPauseHasPermission = ((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9103H();
    }

    private final void checkTryRequestFirstPageAgain() {
        if (!this.isOnResume) {
            Log.m105924i(TAG, "shouldTryRequestFirstPageAgain return for isOnResume:" + this.isOnResume);
        } else if (!this.isOnUserVisibleFocused) {
            Log.m105924i(TAG, "shouldTryRequestFirstPageAgain return for isOnUserVisibleFocused:" + this.isOnUserVisibleFocused);
        } else if (this.lastOnPauseHasPermission) {
            Log.m105924i(TAG, "shouldTryRequestFirstPageAgain return for lastOnPauseHasPermission:" + this.lastOnPauseHasPermission);
        } else if (!((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9103H()) {
            Log.m105924i(TAG, "shouldTryRequestFirstPageAgain return for permission:" + this.lastOnPauseHasPermission);
        } else {
            Log.m105924i(TAG, "shouldTryRequestFirstPageAgain requestInit");
            checkEmptyHeader$default(this, (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            NearbyVideoFeedLoader nearbyVideoFeedLoader = this.feedLoader;
            C87412m.m108591d(nearbyVideoFeedLoader);
            BaseFeedLoader.requestInit$default(nearbyVideoFeedLoader, false, 1, (Object) null);
        }
    }

    private final int findFirstPosition(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] iArr = new int[2];
            ((StaggeredGridLayoutManager) layoutManager).mo17394A(iArr);
            return iArr[0];
        } else if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).mo16957C();
        } else {
            return 0;
        }
    }

    private final void requestLocationPermission() {
        boolean z;
        Class cls = C103918d.class;
        Object e = C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
        C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.String");
        if (C76850a.m92639k((String) e)) {
            z = ((C103918d) C86312j.m106911c(cls)).Lb0(this.activity, "android.permission.ACCESS_FINE_LOCATION");
            if (!z) {
                if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, false)) {
                    MMActivity mMActivity = this.activity;
                    ((C16292g) C86312j.m106911c(C16292g.class)).nr0(mMActivity, mMActivity.getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30764, true);
                } else {
                    ((C103918d) C86312j.m106911c(cls)).mo125790zt(this.activity, "android.permission.ACCESS_FINE_LOCATION", 153);
                }
            }
        } else {
            z = ((C103918d) C86312j.m106911c(cls)).Uu0(this.activity, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 153, (String) null, (String) null);
        }
        Log.m105924i(TAG, "requestLocationPermission checkLocation:" + z);
    }

    /* access modifiers changed from: private */
    public final void requestRefresh() {
        if (((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, C113177k.C113178a.FINDER)) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Hx0(this.activity, 6);
            this.feedLoader.requestRefresh();
            return;
        }
        requestRefreshNoPermission();
    }

    /* access modifiers changed from: private */
    public final void requestRefreshNoPermission() {
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Hx0(this.activity, 7);
        getViewCallback().mo3668c().postDelayed(new NearbyVideoPresenter$requestRefreshNoPermission$1(this), 200);
    }

    public void autoFlingToRefresh(long j, boolean z) {
        RefreshLoadMoreLayout c = getViewCallback().mo3668c();
        c.postDelayed(new NearbyVideoPresenter$autoFlingToRefresh$1(c, z), j);
    }

    public boolean checkAndShowBusinessPermissionDialog() {
        if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.LOCAION, C113177k.C113178a.FINDER, new NearbyVideoPresenter$checkAndShowBusinessPermissionDialog$1(this))) {
            return false;
        }
        Log.m105924i(TAG, "shouldTryRequestFirstPageAgain return for permission:" + this.lastOnPauseHasPermission);
        return true;
    }

    public int getCommentScene() {
        return 15;
    }

    public final NearbyVideoFeedLoader getFeedLoader() {
        return this.feedLoader;
    }

    public List<C60898l.C60899a> getHeaderInfo() {
        LinkedList linkedList = new LinkedList();
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
        int j2 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
        int j3 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        int j4 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        C0735h hVar = this.msgNotifyData;
        hVar.f1753d = j + j2 + j3 + j4;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        hVar.getClass();
        hVar.f1757h = (String) f;
        linkedList.add(this.msgNotifyData);
        return linkedList;
    }

    public final C3343b<C0740i2> getViewCallback() {
        C3343b<C0740i2> bVar = this.viewCallback;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public final boolean isRequestingLbs() {
        return this.isRequestingLbs;
    }

    public void onActionbarClick(boolean z) {
        Class cls = C58417y0.class;
        RecyclerView recyclerView = getViewCallback().getRecyclerView();
        int findFirstPosition = findFirstPosition(recyclerView);
        Log.m105924i(TAG, "[onActionbarClick] position=" + findFirstPosition + " isDouble=" + z);
        if (z) {
            if (findFirstPosition <= 12) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
            }
            if (findFirstPosition <= 12) {
                autoFlingToRefresh(20, false);
            } else {
                autoFlingToRefresh(600, false);
            }
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.activity);
            if (f != null) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                ((C58417y0) c).zx0(f.mo12861q3(), 5, 0);
                return;
            }
            return;
        }
        C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.activity);
        if (f2 != null) {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
            ((C58417y0) c2).zx0(f2.mo12861q3(), 1, 0);
        }
    }

    public void onDetach() {
        this.feedLoader.unregister(this.tagViewActionCallback);
        NearbyVideoFeedLoader nearbyVideoFeedLoader = this.feedLoader;
        C87412m.m108591d(nearbyVideoFeedLoader);
        if (nearbyVideoFeedLoader.getDataListJustForAdapter().size() > 0) {
            ((C11759w) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11759w.class)).mo11638g3(2);
        }
        this.firstAttach = false;
        C62381d dVar = this.liveAutoPlayManager;
        if (dVar != null) {
            dVar.detach();
        }
    }

    public void onFinishing() {
        int findFirstPosition = findFirstPosition(getViewCallback().getRecyclerView());
        Log.m105924i(TAG, "[onFinishing] position=" + findFirstPosition + " totalDy=" + this.totalDy);
        for (C0740i2 i2Var : this.feedLoader.getDataListJustForAdapter()) {
            if (i2Var instanceof BaseFinderFeed) {
                ((BaseFinderFeed) i2Var).mo3482P();
            }
        }
        C11759w.m11458i3(this.tlCache, 2, 0, this.totalDy, this.feedLoader.getDataListJustForAdapter(), (ArrayList) null, (C89349b) null, false, 0, 240, (Object) null);
    }

    public void onLoadMore() {
        C10364a aVar = this.nextPagePreload;
        if (aVar != null && aVar.f31560h) {
            Log.m105924i(TAG, "onLoadMore is preloading.");
        } else {
            BaseFeedLoader.requestLoadMore$default(this.feedLoader, false, 1, (Object) null);
        }
    }

    public final void onPause() {
        this.isOnResume = false;
        C62381d dVar = this.liveAutoPlayManager;
        if (dVar != null) {
            dVar.mo87435n();
        }
        C62381d dVar2 = this.liveAutoPlayManager;
        if (dVar2 != null) {
            dVar2.mo11214a();
        }
    }

    public void onRefresh() {
        NearbyVideoPresenter$onRefresh$1 nearbyVideoPresenter$onRefresh$1 = new NearbyVideoPresenter$onRefresh$1(this);
        NearbyVideoPresenter$onRefresh$2 nearbyVideoPresenter$onRefresh$2 = new NearbyVideoPresenter$onRefresh$2(this);
        NearbyVideoPresenter$onRefresh$3 nearbyVideoPresenter$onRefresh$3 = new NearbyVideoPresenter$onRefresh$3(this);
        C8014g gVar = (C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class);
        if (!gVar.mo9103H()) {
            nearbyVideoPresenter$onRefresh$1.invoke();
            return;
        }
        C37521f.f99374d.getClass();
        if (C31543z5.m39451a() - gVar.mo9106t1() < ((long) C37521f.f99296U)) {
            nearbyVideoPresenter$onRefresh$3.invoke();
        } else {
            nearbyVideoPresenter$onRefresh$2.invoke();
        }
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        View loadMoreFooter;
        View findViewById;
        View loadMoreFooter2;
        TextView textView;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (cVar.f24953h <= 0) {
            getViewCallback().mo3668c().mo82448Q(0, NearbyVideoPresenter$onRefreshEnd$1.INSTANCE);
        }
        if (cVar.f24951f) {
            if (!getViewCallback().mo3668c().f165608I) {
                RefreshLoadMoreLayout c = getViewCallback().mo3668c();
                if (c != null) {
                    c.setHasBottomMore(true);
                }
                RefreshLoadMoreLayout c2 = getViewCallback().mo3668c();
                if (!(c2 == null || (loadMoreFooter2 = c2.getLoadMoreFooter()) == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setVisibility(0);
                }
                RefreshLoadMoreLayout c3 = getViewCallback().mo3668c();
                if (!(c3 == null || (loadMoreFooter = c3.getLoadMoreFooter()) == null || (findViewById = loadMoreFooter.findViewById(C0966R.C0970id.g2s)) == null)) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (!getViewCallback().mo3668c().getEnableLoadMore()) {
                RefreshLoadMoreLayout c4 = getViewCallback().mo3668c();
                if (c4 != null) {
                    c4.setEnableLoadMore(true);
                }
                RefreshLoadMoreLayout c5 = getViewCallback().mo3668c();
                if (c5 != null) {
                    View inflate = C85868k2.m106137b(this.activity).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                    C87412m.m108593f(inflate, "getInflater(activity).in…t.load_more_footer, null)");
                    c5.setLoadMoreFooter(inflate);
                }
            }
        }
        checkEmptyHeader(cVar);
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("finder_tl_nearby_tab");
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77263e("finder_tl_nearby_tab", "onRefreshEnd");
        C2483o0.f12984a.mo2463m(2, ((C13442s8) C39818r.f106831a.mo62444c(this.activity).mo75002a(C13442s8.class)).mo12861q3());
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("NearbyFeedTab");
        C10364a aVar2 = this.nextPagePreload;
        if (aVar2 != null) {
            aVar2.mo10671a(cVar.f24951f);
        }
        checkAutoPlay("onRefreshEnd");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        Log.m105924i(TAG, "onRequestPermissionsResult requestCode:" + i + " grantResults[0]:" + iArr[0]);
        if (i != 79 && i != 153) {
            return;
        }
        if (iArr[0] == 0) {
            checkTryRequestFirstPageAgain();
        } else {
            Log.m105924i(TAG, "onRequestPermissionsResult return for grant.");
        }
    }

    public final void onResume() {
        this.isOnResume = true;
        if (!this.isFirstOnResume) {
            checkTryRequestFirstPageAgain();
        }
        checkAutoPlay("onStart");
        this.isFirstOnResume = false;
    }

    public final void onStop() {
        checkPermission();
    }

    public void onUserVisibleFocused() {
        if (this.firstAttach) {
            if (!((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9103H()) {
                RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
                cVar.f24947b = -2;
                checkEmptyHeader(cVar);
                requestLocationPermission();
            } else if (!checkAndShowBusinessPermissionDialog()) {
                BaseFeedLoader.requestInit$default(this.feedLoader, false, 1, (Object) null);
            } else {
                return;
            }
            this.firstAttach = false;
        }
        this.isOnUserVisibleFocused = true;
        if (!this.isFirstOnUserVisibleFocused) {
            checkTryRequestFirstPageAgain();
        }
        checkAutoPlay("onUserVisibleFocused");
        this.isFirstOnUserVisibleFocused = false;
    }

    public void onUserVisibleUnFocused() {
        this.isOnUserVisibleFocused = false;
        C62381d dVar = this.liveAutoPlayManager;
        if (dVar != null) {
            dVar.mo87435n();
        }
        C62381d dVar2 = this.liveAutoPlayManager;
        if (dVar2 != null) {
            dVar2.mo11214a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r8 = r8.f14080b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void refreshRV(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r8, r0)
            com.tencent.mm.plugin.finder.nearby.video.b r0 = r7.getViewCallback()
            if (r0 == 0) goto L_0x003e
            androidx.recyclerview.widget.RecyclerView r3 = r0.getRecyclerView()
            if (r3 == 0) goto L_0x003e
            er1.w3 r0 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r4 = r7.feedLoader
            r5 = 0
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$refreshRV$1$backCache$1 r6 = com.tencent.p014mm.plugin.finder.nearby.video.NearbyVideoPresenter$refreshRV$1$backCache$1.INSTANCE
            r1 = r0
            r2 = r8
            com.tencent.mm.plugin.finder.feed.model.w0 r8 = r1.mo83951n1(r2, r3, r4, r5, r6)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r2 = 2
            com.tencent.mm.storage.y1$a r0 = r0.mo83914a0(r2)
            if (r8 == 0) goto L_0x0036
            pe3.b r8 = r8.f14080b
            if (r8 == 0) goto L_0x0036
            byte[] r8 = r8.mo123703f()
            goto L_0x0037
        L_0x0036:
            r8 = 0
        L_0x0037:
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r8)
            r1.mo119677K(r0, r8)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.video.NearbyVideoPresenter.refreshRV(android.content.Intent):void");
    }

    public final void setRequestingLbs(boolean z) {
        this.isRequestingLbs = z;
    }

    public final void setViewCallback(C3343b<C0740i2> bVar) {
        C87412m.m108594g(bVar, "<set-?>");
        this.viewCallback = bVar;
    }

    public void onAttach(C3343b<C0740i2> bVar) {
        C87412m.m108594g(bVar, "callback");
        setViewCallback(bVar);
        getViewCallback().mo3669d(this.feedLoader.getDataListJustForAdapter());
        getViewCallback().getRecyclerView().mo17043c(new NearbyVideoPresenter$onAttach$1(this));
        this.nextPagePreload = new C10364a(getViewCallback().getRecyclerView(), this.feedLoader, (C51942x91) null, getCommentScene());
        this.feedLoader.register(this.tagViewActionCallback);
        this.firstAttach = true;
        MMActivity mMActivity = this.activity;
        RecyclerView recyclerView = getViewCallback().getRecyclerView();
        NearbyVideoFeedLoader nearbyVideoFeedLoader = this.feedLoader;
        C87412m.m108591d(nearbyVideoFeedLoader);
        C62381d dVar = new C62381d(mMActivity, recyclerView, nearbyVideoFeedLoader.getDataListJustForAdapter(), false, 0, false, false, false, (WxRecyclerAdapter) null, 480, (C8480h) null);
        this.liveAutoPlayManager = dVar;
        dVar.mo87429h((C63285a) null);
        checkPermission();
    }
}
