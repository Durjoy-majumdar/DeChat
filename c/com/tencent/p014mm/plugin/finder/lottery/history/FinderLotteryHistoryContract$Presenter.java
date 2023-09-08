package com.tencent.p014mm.plugin.finder.lottery.history;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0708a1;
import cm1.C0740i2;
import cm1.C0798z0;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.presenter.contract.BaseFinderLotteryContract;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C7335d;
import di3.C86312j;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hl1.C59988k;
import jq3.C60898l;
import jq3.C60905o;
import l31.C61212e;
import rx3.C13598b0;
import te3.C49540gb3;
import te3.C50191kx2;
import te3.C52204z21;
import tf0.C13883o1;
import tf0.C64916p1;

/* renamed from: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryHistoryContract$Presenter */
public final class FinderLotteryHistoryContract$Presenter extends BaseFinderLotteryContract.Presenter {

    /* renamed from: h */
    public final int f15470h;

    /* renamed from: i */
    public final long f15471i;

    /* renamed from: j */
    public final long f15472j;

    /* renamed from: n */
    public final String f15473n;

    /* renamed from: o */
    public final String f15474o;

    /* renamed from: p */
    public final byte[] f15475p;

    /* renamed from: q */
    public final int f15476q;

    /* renamed from: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryHistoryContract$Presenter$a */
    public static final class C3258a implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderLotteryHistoryContract$Presenter f15477d;

        public C3258a(FinderLotteryHistoryContract$Presenter finderLotteryHistoryContract$Presenter) {
            this.f15477d = finderLotteryHistoryContract$Presenter;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            RecyclerView.C16613e eVar2 = eVar;
            C60905o oVar = (C60905o) zVar;
            Class cls = C13883o1.class;
            C87412m.m108594g(eVar2, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            if (i - ((C60898l) eVar2).mo85796c6() >= 0) {
                C0798z0 z0Var = (C0798z0) oVar.f173503E;
                Intent intent = new Intent();
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                Intent intent2 = intent;
                C64916p1.C64917a.m76443j((C64916p1) c, context, intent, 0, (String) null, 0, 0, false, 124, (Object) null);
                FinderLotteryHistoryContract$Presenter finderLotteryHistoryContract$Presenter = this.f15477d;
                int i2 = 0;
                if (finderLotteryHistoryContract$Presenter.f15470h == 2) {
                    intent2.putExtra("KEY_LIVE_ANCHOR_USERNAME", finderLotteryHistoryContract$Presenter.f15474o);
                    intent2.putExtra("FROM_SCENE", 2);
                    C58969q b = C58961d.f168673a.mo84155b(this.f15477d.f15474o);
                    if (b != null) {
                        intent2.putExtra("FINDER_NICKNAME", b.getNickname());
                    }
                    intent2.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", this.f15477d.f15471i);
                    byte[] bArr = this.f15477d.f15475p;
                    if (bArr != null) {
                        intent2.putExtra("KEY_LIVE_COOKIES", bArr);
                    }
                    intent2.putExtra("KEY_LOTTERY_HISTORY_SOURCE", this.f15477d.f15476q);
                    intent2.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", this.f15477d.f15472j);
                    intent2.putExtra("KEY_LOTTERY_ID", z0Var.mo730a());
                    Object b2 = z0Var.mo731b();
                    if (b2 instanceof C52204z21) {
                        C49540gb3 gb32 = ((C52204z21) b2).f145651r;
                        if (gb32 != null) {
                            i2 = gb32.f133951d;
                        }
                    } else if (!(b2 instanceof C50191kx2)) {
                        Log.m105920e("FinderLotteryHistoryData", "getPersonalMsgScene fail,lottery is " + b2 + '!');
                    }
                    intent2.putExtra("PERSON_MSG_SCENE", i2);
                    Context context2 = oVar.f173499A;
                    C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                    ((C13883o1) C86312j.m106911c(cls)).mo13286s3((Activity) context2, intent2);
                    C7335d c2 = C86312j.m106911c(C54116w.class);
                    C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                    C54116w.my0((C54116w) c2, C54067f0.C0071v0.CLICK_WIN_ITEM_ENTER_DETAIL, "", (String) null, 0, 12, (Object) null);
                    ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_lottery_record_item", view, C59988k.f171146g2.mo84902a(), 25561);
                    return;
                }
                intent2.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", finderLotteryHistoryContract$Presenter.f15471i);
                intent2.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", this.f15477d.f15472j);
                intent2.putExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID", this.f15477d.f15473n);
                intent2.putExtra("KEY_LOTTERY_ID", z0Var.mo730a());
                intent2.putExtra("KEY_SCENE", this.f15477d.f15470h);
                Context context3 = oVar.f173499A;
                C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
                intent2.putExtra("KEY_SHOW_SETTING_TITLE", ((Activity) context3).getIntent().getBooleanExtra("KEY_SHOW_SETTING_TITLE", false));
                Context context4 = oVar.f173499A;
                C87412m.m108592e(context4, "null cannot be cast to non-null type android.app.Activity");
                ((C13883o1) C86312j.m106911c(cls)).mo13290v1((Activity) context4, intent2);
                ((C54108o) C86312j.m106911c(C54108o.class)).Mx0(C54067f0.C0051c.CLICK_LOTTERY_RECORD_LIST_ENTER_WINNER_LIST_UI, "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryHistoryContract$Presenter$b */
    public static final class C3259b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLotteryHistoryContract$Presenter f15478d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveLotteryHistoryLoader f15479e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3259b(FinderLotteryHistoryContract$Presenter finderLotteryHistoryContract$Presenter, FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader) {
            super(1);
            this.f15478d = finderLotteryHistoryContract$Presenter;
            this.f15479e = finderLiveLotteryHistoryLoader;
        }

        public Object invoke(Object obj) {
            C0708a1 a1Var;
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            BaseFinderLotteryContract.ViewCallback viewCallback = this.f15478d.f15882f;
            RefreshLoadMoreLayout p = viewCallback != null ? viewCallback.mo3712p() : null;
            if (p != null) {
                p.setEnableLoadMore(iResponse.getHasMore());
            }
            if (this.f15479e.f13729d == 1 && this.f15478d.mo3710n().mo85796c6() == 0) {
                FinderLiveLotteryHistoryLoader.C2719b bVar = iResponse instanceof FinderLiveLotteryHistoryLoader.C2719b ? (FinderLiveLotteryHistoryLoader.C2719b) iResponse : null;
                if (!(bVar == null || (a1Var = bVar.f13736a) == null)) {
                    C60898l.m71328U5(this.f15478d.mo3710n(), a1Var, false, 2, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLotteryHistoryContract$Presenter(int i, long j, long j2, String str, String str2, byte[] bArr, int i2, FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader) {
        super(finderLiveLotteryHistoryLoader);
        C87412m.m108594g(str, "objectNonceId");
        C87412m.m108594g(str2, "anchorUsername");
        C87412m.m108594g(finderLiveLotteryHistoryLoader, "loader");
        this.f15470h = i;
        this.f15471i = j;
        this.f15472j = j2;
        this.f15473n = str;
        this.f15474o = str2;
        this.f15475p = bArr;
        this.f15476q = i2;
    }

    /* renamed from: e */
    public WxRecyclerAdapter<C0740i2> mo3455e() {
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderLotteryHistoryContract$Presenter$generateAdapter$1(), this.f15880d.getDataListJustForAdapter(), false);
        wxRecyclerAdapter.f173488o = new C3258a(this);
        return wxRecyclerAdapter;
    }

    /* renamed from: q */
    public void mo3456q(BaseFinderLotteryContract.ViewCallback viewCallback) {
        C87412m.m108594g(viewCallback, "callback");
        super.mo3456q(viewCallback);
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f15880d;
        FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader = baseFeedLoader instanceof FinderLiveLotteryHistoryLoader ? (FinderLiveLotteryHistoryLoader) baseFeedLoader : null;
        if (finderLiveLotteryHistoryLoader != null) {
            Intent intent = viewCallback.f15885d.getIntent();
            C87412m.m108593f(intent, "callback.getActivity().intent");
            finderLiveLotteryHistoryLoader.initFromCache(intent);
            finderLiveLotteryHistoryLoader.f13734i = new C3259b(this, finderLiveLotteryHistoryLoader);
        }
    }
}
