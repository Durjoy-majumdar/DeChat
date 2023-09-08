package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7435f2;
import er1.C58736i1;
import er1.C58739j4;
import er1.C58745l0;
import er1.C58771q3;
import er1.C7842n2;
import er1.C7853p2;
import er1.C7888v2;
import fy3.C32224a;
import fy3.C32226l;
import gr1.C59667n2;
import gr1.C59670o2;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60905o;
import kotlin.Metadata;
import nj3.C11184p0;
import nj3.C76875f0;
import o40.C61926c;
import org.json.JSONObject;
import p166hy.C98567o0;
import pf1.C11920q;
import pf1.C62262d0;
import rs1.C13194da;
import rs1.C13442s8;
import rs1.C63513a1;
import rs1.C63648v;
import rx3.C13598b0;
import sf1.C13671a;
import te3.C49712hj1;
import te3.C50124kf1;
import te3.C51550ui0;
import te3.C64273c21;
import vp1.C65834e;
import wp1.C15587j;
import wp1.C66164a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1", "Lnj3/p0;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1 */
public final class C3401x1209cddc implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f16018d;

    /* renamed from: e */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16019e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f16020f;

    /* renamed from: g */
    public final /* synthetic */ BaseFinderFeed f16021g;

    /* renamed from: h */
    public final /* synthetic */ int f16022h;

    public C3401x1209cddc(C32224a<C13598b0> aVar, FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter, C60905o oVar, BaseFinderFeed baseFinderFeed, int i) {
        this.f16018d = aVar;
        this.f16019e = likedTimelinePresenter;
        this.f16020f = oVar;
        this.f16021g = baseFinderFeed;
        this.f16022h = i;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C51550ui0 ui02;
        FinderJumpInfo finderJumpInfo;
        MenuItem menuItem2 = menuItem;
        Class cls = C58417y0.class;
        C87412m.m108594g(menuItem2, "menuItem");
        C32224a<C13598b0> aVar = this.f16018d;
        if (aVar != null) {
            aVar.invoke();
        }
        int itemId = menuItem.getItemId();
        if (itemId == 106) {
            C66164a aVar2 = C66164a.f190162a;
            FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f16019e;
            aVar2.mo90220a(likedTimelinePresenter.f15975d, this.f16021g, false, new C3403x28461503(likedTimelinePresenter));
        } else if (itemId != 107) {
            int i2 = 2;
            C49712hj1 hj12 = null;
            if (itemId == 109) {
                if (this.f16021g.mo3513o().isPostFinish()) {
                    C65834e eVar = C65834e.f189316a;
                    FinderItem o = this.f16021g.mo3513o();
                    C65834e.C65836b bVar = C65834e.C65836b.f189322b;
                    eVar.mo89878l(o, C65834e.C65836b.f189323c);
                    C58771q3 q3Var = C58771q3.f168268a;
                    MMActivity mMActivity = this.f16019e.f15975d;
                    FinderObjectDesc finderObjectDesc = this.f16021g.mo3513o().getFeedObject().objectDesc;
                    q3Var.mo83812c(mMActivity, finderObjectDesc != null ? finderObjectDesc.feedBgmInfo : null, Long.valueOf(this.f16021g.mo3513o().field_id), 0);
                    ((C58417y0) C86312j.m106911c(cls)).wy0(this.f16019e.f15975d, 1, 1, Integer.valueOf(this.f16021g.mo3513o().field_finderObject.follow_feed_count));
                }
                MMActivity mMActivity2 = this.f16019e.f15975d;
                long itemId2 = this.f16021g.getItemId();
                int i3 = this.f16022h;
                C87412m.m108594g(mMActivity2, "context");
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity2);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                JSONObject jSONObject = new JSONObject();
                if (i3 == 1) {
                    i2 = 1;
                }
                jSONObject.put("from_action", i2);
                jSONObject.put("feedid", C61926c.m72691p(itemId2));
                C13598b0 b0Var = C13598b0.f38549a;
                f2Var.mo8577a(hj12, "button_original_sound", 1, jSONObject);
            } else if (itemId == 116) {
                FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter2 = this.f16019e;
                if (likedTimelinePresenter2.f15984p != null) {
                    C60905o oVar = this.f16020f;
                    ArrayList arrayList = new ArrayList();
                    View D = oVar.mo85812D(C0966R.C0970id.d97);
                    if (D != null) {
                        arrayList.add(D);
                    }
                    FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
                    C59670o2 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
                    FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) videoView : null;
                    if (finderThumbPlayerProxy != null) {
                        C39622i0 a = C39818r.f106831a.mo62444c(likedTimelinePresenter2.f15975d).mo75002a(C13194da.class);
                        C87412m.m108593f(a, "UICProvider.of(getActivi…edControlUIC::class.java)");
                        C13194da.m12605k3((C13194da) a, arrayList, finderThumbPlayerProxy, 0, false, (C32224a) null, 28, (Object) null);
                    }
                }
                MMActivity mMActivity3 = this.f16019e.f15975d;
                long itemId3 = this.f16021g.getItemId();
                int i4 = this.f16022h;
                C87412m.m108594g(mMActivity3, "context");
                C7435f2 f2Var2 = C7435f2.f25626a;
                C13442s8 f2 = C13442s8.f38060Q0.mo12873f(mMActivity3);
                if (f2 != null) {
                    hj12 = f2.mo12861q3();
                }
                JSONObject jSONObject2 = new JSONObject();
                if (i4 == 1) {
                    i2 = 1;
                }
                jSONObject2.put("from_action", i2);
                jSONObject2.put("feedid", C61926c.m72691p(itemId3));
                C13598b0 b0Var2 = C13598b0.f38549a;
                f2Var2.mo8577a(hj12, "button_speedplay", 1, jSONObject2);
            } else if (itemId == 120) {
                MMActivity mMActivity4 = this.f16019e.f15975d;
                BaseFinderFeed baseFinderFeed = this.f16021g;
                C87412m.m108594g(mMActivity4, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C87412m.m108594g(baseFinderFeed, "feed");
                ((C98567o0) C86312j.m106911c(C98567o0.class)).Wk0(mMActivity4, 2, baseFinderFeed.mo3513o().getFeedObject().toByteArray(), 0);
            } else if (itemId == 113) {
                C7888v2.C7889a.m8058y(C7888v2.f26513a, this.f16019e.f15975d, this.f16021g, (Bundle) null, 0, 12, (Object) null);
                MMActivity mMActivity5 = this.f16019e.f15975d;
                long itemId4 = this.f16021g.getItemId();
                int i5 = this.f16022h;
                C87412m.m108594g(mMActivity5, "context");
                C7435f2 f2Var3 = C7435f2.f25626a;
                C13442s8 f3 = C13442s8.f38060Q0.mo12873f(mMActivity5);
                if (f3 != null) {
                    hj12 = f3.mo12861q3();
                }
                JSONObject jSONObject3 = new JSONObject();
                if (i5 == 1) {
                    i2 = 1;
                }
                jSONObject3.put("from_action", i2);
                jSONObject3.put("feedid", C61926c.m72691p(itemId4));
                C13598b0 b0Var3 = C13598b0.f38549a;
                f2Var3.mo8577a(hj12, "textstatus_in_menu", 1, jSONObject3);
            } else if (itemId == 114) {
                FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) this.f16020f.mo85812D(C0966R.C0970id.eh4);
                C87412m.m108593f(finderFullSeekBarLayout, "fullVideoSeekBar");
                C59667n2.C8415a.m8377a(finderFullSeekBarLayout, (String) null, false, 3, (Object) null);
                C7842n2 n2Var = C7842n2.f26407a;
                FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter3 = this.f16019e;
                C7842n2.m7986b(n2Var, likedTimelinePresenter3.f15975d, this.f16021g, 2, false, (String) null, (String) null, 0, this.f16020f, new C3404x28461505(finderFullSeekBarLayout, likedTimelinePresenter3), 120, (Object) null);
                MMActivity mMActivity6 = this.f16019e.f15975d;
                long itemId5 = this.f16021g.getItemId();
                int i6 = this.f16022h;
                C87412m.m108594g(mMActivity6, "context");
                C7435f2 f2Var4 = C7435f2.f25626a;
                C13442s8 f4 = C13442s8.f38060Q0.mo12873f(mMActivity6);
                if (f4 != null) {
                    hj12 = f4.mo12861q3();
                }
                JSONObject jSONObject4 = new JSONObject();
                if (i6 == 1) {
                    i2 = 1;
                }
                jSONObject4.put("from_action", i2);
                jSONObject4.put("feedid", C61926c.m72691p(itemId5));
                C13598b0 b0Var4 = C13598b0.f38549a;
                f2Var4.mo8577a(hj12, "button_set_bell", 1, jSONObject4);
            } else if (itemId == 200) {
                C7853p2 p2Var = C7853p2.f26439a;
                BaseFinderFeed baseFinderFeed2 = this.f16021g;
                p2Var.mo8961d(baseFinderFeed2, this.f16019e.f15975d, C15587j.f42215a.mo14352d(baseFinderFeed2.mo3513o().getFromAppId()));
            } else if (itemId == 201) {
                C58736i1.f168173a.mo83671q(this.f16019e.f15975d, this.f16021g);
            } else if (itemId == 301 || itemId == 302) {
                C39622i0 a2 = C39818r.f106831a.mo62444c(this.f16019e.f15975d).mo75002a(C63513a1.class);
                C87412m.m108593f(a2, "UICProvider.of(getActivi…derBulletUIC::class.java)");
                C63513a1.m74853e3((C63513a1) a2, this.f16020f, false, true, false, 8, (Object) null);
            } else {
                switch (itemId) {
                    case 101:
                        if (C58739j4.f168176a.mo83686O(this.f16021g)) {
                            C64273c21 liveInfo = this.f16021g.mo3513o().getLiveInfo();
                            if (liveInfo != null) {
                                C13671a.m12976c(C13671a.f38718a, this.f16019e.f15975d, liveInfo.f182392d, this.f16021g.mo3513o().getUserName(), (Long) null, 0, (BaseFinderFeed) null, 56, (Object) null);
                            }
                        } else {
                            C13671a.m12975b(C13671a.f38718a, this.f16019e.f15975d, this.f16021g, 0, 0, 12, (Object) null);
                        }
                        MMActivity mMActivity7 = this.f16019e.f15975d;
                        long itemId6 = this.f16021g.getItemId();
                        int i7 = this.f16022h;
                        C87412m.m108594g(mMActivity7, "context");
                        C7435f2 f2Var5 = C7435f2.f25626a;
                        C13442s8 f5 = C13442s8.f38060Q0.mo12873f(mMActivity7);
                        if (f5 != null) {
                            hj12 = f5.mo12861q3();
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        if (i7 == 1) {
                            i2 = 1;
                        }
                        jSONObject5.put("from_action", i2);
                        jSONObject5.put("feedid", C61926c.m72691p(itemId6));
                        C13598b0 b0Var5 = C13598b0.f38549a;
                        f2Var5.mo8577a(hj12, "button_complaint", 1, jSONObject5);
                        return;
                    case 102:
                        C7888v2.C7889a aVar3 = C7888v2.f26513a;
                        FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f16019e.f15984p;
                        C87412m.m108591d(likedTimelineViewCallback);
                        C7888v2.C7889a.m8056t(aVar3, likedTimelineViewCallback.f15989f, this.f16021g.mo3513o(), (Bundle) null, 3, (C32226l) null, 20, (Object) null);
                        return;
                    case 103:
                        C7888v2.C7889a aVar4 = C7888v2.f26513a;
                        FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = this.f16019e.f15984p;
                        C87412m.m108591d(likedTimelineViewCallback2);
                        C7888v2.C7889a.m8057w(aVar4, likedTimelineViewCallback2.f15989f, this.f16021g, (Bundle) null, 0, 0, 28, (Object) null);
                        MMActivity mMActivity8 = this.f16019e.f15975d;
                        long itemId7 = this.f16021g.getItemId();
                        int i8 = this.f16022h;
                        C87412m.m108594g(mMActivity8, "context");
                        C7435f2 f2Var6 = C7435f2.f25626a;
                        C13442s8 f6 = C13442s8.f38060Q0.mo12873f(mMActivity8);
                        if (f6 != null) {
                            hj12 = f6.mo12861q3();
                        }
                        JSONObject jSONObject6 = new JSONObject();
                        if (i8 == 1) {
                            i2 = 1;
                        }
                        jSONObject6.put("from_action", i2);
                        jSONObject6.put("feedid", C61926c.m72691p(itemId7));
                        C13598b0 b0Var6 = C13598b0.f38549a;
                        f2Var6.mo8577a(hj12, "button_forward_friendcircle", 1, jSONObject6);
                        return;
                    case 104:
                        C58745l0 l0Var = C58745l0.f168212a;
                        BaseFinderFeed baseFinderFeed3 = this.f16021g;
                        FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback3 = this.f16019e.f15984p;
                        C87412m.m108591d(likedTimelineViewCallback3);
                        l0Var.mo83743a(baseFinderFeed3, likedTimelineViewCallback3.f15989f);
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                        C58417y0.Qy0((C58417y0) c, this.f16019e.f15975d, true, this.f16021g.getItemId(), false, 8, (Object) null);
                        return;
                    default:
                        switch (itemId) {
                            case 207:
                                C58736i1.f168173a.mo83670p(this.f16019e.f15975d, this.f16021g, this.f16022h);
                                return;
                            case 208:
                                C7888v2.C7889a aVar5 = C7888v2.f26513a;
                                FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback4 = this.f16019e.f15984p;
                                C87412m.m108591d(likedTimelineViewCallback4);
                                aVar5.mo9024z(likedTimelineViewCallback4.f15989f, this.f16021g.mo3513o());
                                return;
                            case 209:
                                MMActivity mMActivity9 = this.f16019e.f15975d;
                                BaseFinderFeed baseFinderFeed4 = this.f16021g;
                                C87412m.m108594g(mMActivity9, "context");
                                C87412m.m108594g(baseFinderFeed4, "feed");
                                C50124kf1 kf12 = baseFinderFeed4.mo3513o().getFeedObject().object_extend;
                                if (kf12 != null && (ui02 = kf12.f136756r) != null && (finderJumpInfo = ui02.f142864d) != null) {
                                    C62262d0.m73168c(C62262d0.f176978a, mMActivity9, new C11920q(finderJumpInfo), 0, (C60905o) null, 12, (Object) null);
                                    return;
                                }
                                return;
                            case 210:
                                C58736i1.f168173a.mo83672r(this.f16019e.f15975d, this.f16021g, this.f16020f);
                                return;
                            default:
                                switch (itemId) {
                                    case ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE /*305*/:
                                        C58736i1.f168173a.mo83666l(this.f16020f, true, this.f16021g, this.f16022h, this.f16019e.f15978g.getDataListJustForAdapter());
                                        return;
                                    case ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET /*306*/:
                                        C58736i1.f168173a.mo83666l(this.f16020f, false, this.f16021g, this.f16022h, this.f16019e.f15978g.getDataListJustForAdapter());
                                        return;
                                    case ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE /*307*/:
                                        C39622i0 a3 = C39818r.f106831a.mo62444c(this.f16019e.f15975d).mo75002a(C63648v.class);
                                        C87412m.m108593f(a3, "UICProvider.of(context).…ddHistoryUIC::class.java)");
                                        ((C63648v) a3).mo88474e3(this.f16020f, false);
                                        MMActivity mMActivity10 = this.f16019e.f15975d;
                                        long itemId8 = this.f16021g.getItemId();
                                        int i9 = this.f16022h;
                                        C87412m.m108594g(mMActivity10, "context");
                                        C7435f2 f2Var7 = C7435f2.f25626a;
                                        C13442s8 f7 = C13442s8.f38060Q0.mo12873f(mMActivity10);
                                        if (f7 != null) {
                                            hj12 = f7.mo12861q3();
                                        }
                                        JSONObject jSONObject7 = new JSONObject();
                                        if (i9 == 1) {
                                            i2 = 1;
                                        }
                                        jSONObject7.put("from_action", i2);
                                        jSONObject7.put("feedid", C61926c.m72691p(itemId8));
                                        C13598b0 b0Var7 = C13598b0.f38549a;
                                        f2Var7.mo8577a(hj12, "button_minimize", 1, jSONObject7);
                                        return;
                                    default:
                                        FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter4 = this.f16019e;
                                        likedTimelinePresenter4.f15977f.xc0((C76875f0) menuItem2, new C3405x28461506(likedTimelinePresenter4, menuItem2, this.f16021g, this.f16022h));
                                        return;
                                }
                        }
                }
            }
        } else {
            C66164a aVar6 = C66164a.f190162a;
            FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter5 = this.f16019e;
            aVar6.mo90220a(likedTimelinePresenter5.f15975d, this.f16021g, true, new C3402x28461502(likedTimelinePresenter5));
        }
    }
}
