package com.tencent.p014mm.plugin.finder.nearby.live;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import bh3.C113177k;
import cm1.C0740i2;
import cn1.C0810b0;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.utils.FinderLbsLogic;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58684b;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import lm1.C10544b;
import mm1.C10934a;
import nm1.C11226c;
import nm1.C11227d;
import ns3.C11266d;
import ob0.C89132b;
import pe3.C89349b;
import rm1.C13087a;
import rx3.C13598b0;
import te3.C49548ge1;
import te3.C50989qo0;
import ve1.C14443a1;
import ve1.C14542i3;
import ve1.C14548j3;
import ve1.C14580n6;
import ve1.C14587o6;
import ve1.C14590p;
import ve1.C14706z2;
import xm1.C15828e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0014\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010)\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/NearbyLiveItemConvertFactory;", "Ljq3/j;", "Lcn1/b0;", "createBigCardLiveConvert", "Lve1/p;", "createFinderEmptyConvert", "Lve1/a1;", "createFinderFeedEmptyConvert", "Lve1/i3;", "createFinderFeedSameCityLiveConvert", "Lnm1/d;", "createNearbyFinderSquareLiveFeedConvert", "Lnm1/c;", "createRelatedLiveFeedConvert", "Landroid/content/Context;", "context", "", "feedId", "", "username", "", "commentScene", "Lrx3/b0;", "jumpProfile", "type", "Ljq3/i;", "getItemConvert", "Lcom/tencent/mm/ui/MMActivity;", "baseContext", "Lcom/tencent/mm/ui/MMActivity;", "Llm1/b;", "Lcm1/i2;", "presenter", "Llm1/b;", "", "isForceNightMode", "Z", "isLocalCityPage", "I", "getScreenWidth", "()I", "screenWidth", "<init>", "(Lcom/tencent/mm/ui/MMActivity;Llm1/b;ZZI)V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory */
public final class NearbyLiveItemConvertFactory implements C9500j {
    /* access modifiers changed from: private */
    public final MMActivity baseContext;
    /* access modifiers changed from: private */
    public final int commentScene;
    private final boolean isForceNightMode;
    private final boolean isLocalCityPage;
    /* access modifiers changed from: private */
    public final C10544b<C0740i2> presenter;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory$a */
    public static final class C3284a extends C87413o implements C32227p<Long, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyLiveItemConvertFactory f15594d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3284a(NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
            super(2);
            this.f15594d = nearbyLiveItemConvertFactory;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            C87412m.m108594g(str, "username");
            NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory = this.f15594d;
            nearbyLiveItemConvertFactory.jumpProfile(nearbyLiveItemConvertFactory.baseContext, longValue, str, this.f15594d.commentScene);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory$b */
    public static final class C3285b implements C15828e {
        /* renamed from: a */
        public C50989qo0 mo3565a() {
            Log.m105924i("NearbyLiveItemConvertFactory", "createBigCardLiveConvert getOutsideFinderGetLiveTabsResponse not suppport");
            return null;
        }

        /* renamed from: b */
        public C89349b mo3566b() {
            Log.m105924i("NearbyLiveItemConvertFactory", "createBigCardLiveConvert getOutsideLastBuffer not suppport");
            return null;
        }

        /* renamed from: c */
        public void mo3567c(int i, C89349b bVar, C32226l<? super C89132b.C89134c<C49548ge1>, C13598b0> lVar) {
            C87412m.m108594g(lVar, "gciListener");
            Log.m105924i("NearbyLiveItemConvertFactory", "createBigCardLiveConvert loadData not suppport");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory$c */
    public static final class C3286c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyLiveItemConvertFactory f15595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3286c(NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
            super(0);
            this.f15595d = nearbyLiveItemConvertFactory;
        }

        public Object invoke() {
            C10544b access$getPresenter$p = this.f15595d.presenter;
            C87412m.m108592e(access$getPresenter$p, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter");
            NearbyLiveFeedLoader nearbyLiveFeedLoader = ((NearbyLivePresenter) access$getPresenter$p).f15620u;
            C87412m.m108591d(nearbyLiveFeedLoader);
            nearbyLiveFeedLoader.requestRefresh();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory$d */
    public static final class C3287d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyLiveItemConvertFactory f15596d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3287d(NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
            super(0);
            this.f15596d = nearbyLiveItemConvertFactory;
        }

        public Object invoke() {
            FinderLbsLogic finderLbsLogic = FinderLbsLogic.f17479a;
            if (!finderLbsLogic.mo4229a() || ((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, C113177k.C113178a.LIVE)) {
                finderLbsLogic.mo4230b(this.f15596d.baseContext);
            } else {
                C10544b access$getPresenter$p = this.f15596d.presenter;
                C87412m.m108592e(access$getPresenter$p, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter");
                ((NearbyLivePresenter) access$getPresenter$p).onRefresh();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory$e */
    public static final class C3288e extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyLiveItemConvertFactory f15597d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3288e(NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
            super(1);
            this.f15597d = nearbyLiveItemConvertFactory;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            if (!C58739j4.f168176a.mo83683L()) {
                ((C11266d) C86312j.m106911c(C11266d.class)).mo9184Nw(this.f15597d.baseContext, new Intent());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory$f */
    public static final class C3289f extends C87413o implements C32227p<Long, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyLiveItemConvertFactory f15598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3289f(NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
            super(2);
            this.f15598d = nearbyLiveItemConvertFactory;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            C87412m.m108594g(str, "username");
            NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory = this.f15598d;
            nearbyLiveItemConvertFactory.jumpProfile(nearbyLiveItemConvertFactory.baseContext, longValue, str, this.f15598d.commentScene);
            return C13598b0.f38549a;
        }
    }

    public NearbyLiveItemConvertFactory(MMActivity mMActivity, C10544b<C0740i2> bVar, boolean z, boolean z2, int i) {
        C87412m.m108594g(mMActivity, "baseContext");
        C87412m.m108594g(bVar, "presenter");
        this.baseContext = mMActivity;
        this.presenter = bVar;
        this.isForceNightMode = z;
        this.isLocalCityPage = z2;
        this.commentScene = i;
    }

    private final C0810b0 createBigCardLiveConvert() {
        new ArrayList();
        return new C0810b0(true, getScreenWidth() - (C74942w4.m89784a(MMApplicationContext.getContext(), 0) * 2), 1.0f, new C3285b(), new C3284a(this));
    }

    private final C14590p createFinderEmptyConvert() {
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            throw new RuntimeException("type invalid");
        }
        Log.printInfoStack("RecyclerViewAdapterEx", "type invalid", new Object[0]);
        return new C14590p();
    }

    private final C14443a1 createFinderFeedEmptyConvert() {
        return new C14443a1(new C3286c(this), new C3287d(this), this.isForceNightMode);
    }

    private final C14542i3 createFinderFeedSameCityLiveConvert() {
        return new C14542i3(new C3288e(this));
    }

    private final C11227d createNearbyFinderSquareLiveFeedConvert() {
        int i = this.commentScene;
        return new C11227d(i, ((float) 3) * C10934a.f32583a.mo11133b(i), this.isForceNightMode, this.isLocalCityPage, this.baseContext);
    }

    private final C11226c createRelatedLiveFeedConvert() {
        return new C11226c(true, getScreenWidth(), 0.0f, new C3289f(this), 4, (C8480h) null);
    }

    private final int getScreenWidth() {
        return C75044y4.m89990b(this.baseContext).x;
    }

    /* access modifiers changed from: private */
    public final void jumpProfile(Context context, long j, String str, int i) {
        Class cls = C11266d.class;
        Intent intent = new Intent();
        intent.putExtra("key_click_tab_context_id", ((C11266d) C86312j.m106911c(cls)).mo9187Uy().mo10844b());
        intent.putExtra("finder_username", str);
        intent.putExtra("key_from_comment_scene", i);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76739CG(((C11266d) C86312j.m106911c(cls)).mo9187Uy().getContextId(), intent);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
        Log.m105924i("FinderLiveSquareTabLifeCycleReport", "enterProfile");
        C13087a.f37257d = "page_profile";
    }

    public C60896i<?> getItemConvert(int i) {
        return i != -10 ? i != -5 ? i != -3 ? i != -1 ? i != 4 ? i != 6 ? i != 9 ? i != 2021 ? i != 2022 ? createFinderEmptyConvert() : createBigCardLiveConvert() : createRelatedLiveFeedConvert() : createNearbyFinderSquareLiveFeedConvert() : new C14587o6(this.isForceNightMode) : new C14580n6(this.isForceNightMode) : createFinderFeedEmptyConvert() : new C14548j3() : new C14706z2() : createFinderFeedSameCityLiveConvert();
    }
}
