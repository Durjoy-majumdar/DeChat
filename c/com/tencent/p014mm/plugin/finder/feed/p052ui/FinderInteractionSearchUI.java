package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0734g2;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.feed.flow.FlowLayoutManager;
import com.tencent.p014mm.plugin.finder.feed.model.FinderParcelTopicInfo;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.api.TPOptionalID;
import ef1.C58556f;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import jq3.C60896i;
import kotlin.Metadata;
import p192l4.C10462b;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51270sn1;
import vf1.C14716a1;
import vf1.C14726b1;
import vf1.C14735c1;
import vf1.C14744d1;
import vf1.C14834u0;
import vf1.C14844x0;
import vf1.C14853z0;
import ye1.C15979s;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUI */
public final class FinderInteractionSearchUI extends MMFinderUI {

    /* renamed from: o */
    public ArrayList<C0734g2> f14437o = new ArrayList<>();

    /* renamed from: p */
    public int f14438p = 2;

    /* renamed from: q */
    public C14844x0 f14439q;

    /* renamed from: r */
    public FinderInteractionSearchUIContract$ViewCallback f14440r;

    /* renamed from: s */
    public final C13601g f14441s = C36568h.m40985a(new C2940a(this));

    /* renamed from: t */
    public boolean f14442t = true;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUI$a */
    public static final class C2940a extends C87413o implements C32224a<C15979s> {

        /* renamed from: d */
        public final /* synthetic */ FinderInteractionSearchUI f14443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2940a(FinderInteractionSearchUI finderInteractionSearchUI) {
            super(0);
            this.f14443d = finderInteractionSearchUI;
        }

        public Object invoke() {
            View findViewById = this.f14443d.findViewById(C0966R.C0970id.br_);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById;
            int i = C0966R.C0970id.ms9;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ms9);
            if (linearLayout != null) {
                i = C0966R.C0970id.g3e;
                LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.g3e);
                if (linearLayout2 != null) {
                    i = C0966R.C0970id.hgr;
                    TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.hgr);
                    if (textView != null) {
                        i = C0966R.C0970id.iiq;
                        RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.iiq);
                        if (recyclerView != null) {
                            i = C0966R.C0970id.ivb;
                            FinderRefreshLayout finderRefreshLayout = (FinderRefreshLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivb);
                            if (finderRefreshLayout != null) {
                                i = C0966R.C0970id.ksl;
                                WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.ksl);
                                if (wxRecyclerView != null) {
                                    return new C15979s(relativeLayout, relativeLayout, linearLayout, linearLayout2, textView, recyclerView, finderRefreshLayout, wxRecyclerView);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return getIntent().getIntExtra("KEY_SCENE", 2) == 2 ? TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS : TPOptionalID.f349338xc9bdf6cd;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.csd;
    }

    public void onCreate(Bundle bundle) {
        C13442s8 f;
        C58556f j3;
        super.onCreate(bundle);
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        this.f14438p = getIntent().getIntExtra("KEY_SCENE", 2);
        ArrayList<FinderParcelTopicInfo> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("KEY_TOPIC_LIST");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new ArrayList<>();
        }
        this.f14437o.clear();
        for (FinderParcelTopicInfo finderParcelTopicInfo : parcelableArrayListExtra) {
            ArrayList<C0734g2> arrayList = this.f14437o;
            C51270sn1 sn12 = finderParcelTopicInfo.f13764d;
            C87412m.m108593f(sn12, "it.topicInfo");
            arrayList.add(new C0734g2(sn12, 2));
        }
        C14844x0 x0Var = new C14844x0(this, this.f14437o, this.f14438p);
        this.f14439q = x0Var;
        C15979s sVar = (C15979s) ((C36570n) this.f14441s).getValue();
        C87412m.m108593f(sVar, "uiBinding");
        FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback = new FinderInteractionSearchUIContract$ViewCallback(this, x0Var, sVar, this.f14438p);
        this.f14440r = finderInteractionSearchUIContract$ViewCallback;
        C14844x0 x0Var2 = this.f14439q;
        if (x0Var2 != null) {
            x0Var2.f40846g = finderInteractionSearchUIContract$ViewCallback;
            FinderInteractionSearchUIContract$Presenter$onAttach$1 finderInteractionSearchUIContract$Presenter$onAttach$1 = new FinderInteractionSearchUIContract$Presenter$onAttach$1(x0Var2, C40008f.f107254d);
            x0Var2.f40855s = finderInteractionSearchUIContract$Presenter$onAttach$1;
            finderInteractionSearchUIContract$Presenter$onAttach$1.alive();
            FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback2 = this.f14440r;
            if (finderInteractionSearchUIContract$ViewCallback2 != null) {
                FTSSearchView fTSSearchView = new FTSSearchView((Context) finderInteractionSearchUIContract$ViewCallback2.f14445d, false);
                finderInteractionSearchUIContract$ViewCallback2.f14455q = fTSSearchView;
                fTSSearchView.setSearchViewListener(finderInteractionSearchUIContract$ViewCallback2);
                FTSSearchView fTSSearchView2 = finderInteractionSearchUIContract$ViewCallback2.f14455q;
                if (fTSSearchView2 != null) {
                    fTSSearchView2.getFtsEditText().setHint(finderInteractionSearchUIContract$ViewCallback2.f14445d.getString(C0966R.string.m_x));
                    FTSSearchView fTSSearchView3 = finderInteractionSearchUIContract$ViewCallback2.f14455q;
                    if (fTSSearchView3 != null) {
                        fTSSearchView3.getFtsEditText().setFtsEditTextListener(finderInteractionSearchUIContract$ViewCallback2);
                        FTSSearchView fTSSearchView4 = finderInteractionSearchUIContract$ViewCallback2.f14455q;
                        if (fTSSearchView4 != null) {
                            fTSSearchView4.getFtsEditText().setCanDeleteTag(true);
                            FTSSearchView fTSSearchView5 = finderInteractionSearchUIContract$ViewCallback2.f14455q;
                            if (fTSSearchView5 != null) {
                                fTSSearchView5.getFtsEditText().mo70355k();
                                FTSSearchView fTSSearchView6 = finderInteractionSearchUIContract$ViewCallback2.f14455q;
                                if (fTSSearchView6 != null) {
                                    fTSSearchView6.getFtsEditText().mo70361q();
                                    FTSSearchView fTSSearchView7 = finderInteractionSearchUIContract$ViewCallback2.f14455q;
                                    if (fTSSearchView7 != null) {
                                        fTSSearchView7.getFtsEditText().mo70338f();
                                        FTSSearchView fTSSearchView8 = finderInteractionSearchUIContract$ViewCallback2.f14455q;
                                        if (fTSSearchView8 != null) {
                                            TextView textView = (TextView) fTSSearchView8.getFtsEditText().getTagPanel().findViewById(C0966R.C0970id.kdb);
                                            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                                            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                            marginLayoutParams.rightMargin = finderInteractionSearchUIContract$ViewCallback2.f14445d.getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
                                            textView.setLayoutParams(marginLayoutParams);
                                            ActionBar supportActionBar = finderInteractionSearchUIContract$ViewCallback2.f14445d.getSupportActionBar();
                                            C87412m.m108591d(supportActionBar);
                                            FTSSearchView fTSSearchView9 = finderInteractionSearchUIContract$ViewCallback2.f14455q;
                                            if (fTSSearchView9 != null) {
                                                supportActionBar.mo91114y(fTSSearchView9);
                                                ((WxRecyclerView) ((C36570n) finderInteractionSearchUIContract$ViewCallback2.f14449h).getValue()).mo17085h0(new C14834u0(finderInteractionSearchUIContract$ViewCallback2.f14445d, 0, 2, (C8480h) null));
                                                ((WxRecyclerView) ((C36570n) finderInteractionSearchUIContract$ViewCallback2.f14449h).getValue()).setLayoutManager(new FlowLayoutManager());
                                                WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new C2947xb5aef471(), finderInteractionSearchUIContract$ViewCallback2.f14446e.f40844e, false);
                                                wxRecyclerAdapter.f173488o = new C14744d1(finderInteractionSearchUIContract$ViewCallback2);
                                                ((WxRecyclerView) ((C36570n) finderInteractionSearchUIContract$ViewCallback2.f14449h).getValue()).setAdapter(wxRecyclerAdapter);
                                                if (!finderInteractionSearchUIContract$ViewCallback2.mo3008x()) {
                                                    finderInteractionSearchUIContract$ViewCallback2.mo3007v().setVisibility(8);
                                                } else {
                                                    finderInteractionSearchUIContract$ViewCallback2.mo3007v().setVisibility(0);
                                                }
                                                RecyclerView recyclerView = finderInteractionSearchUIContract$ViewCallback2.getRecyclerView();
                                                if (recyclerView != null) {
                                                    recyclerView.setLayoutManager(new FinderStaggeredGridLayoutManager(2, 1));
                                                }
                                                finderInteractionSearchUIContract$ViewCallback2.f14456r = new C14853z0(finderInteractionSearchUIContract$ViewCallback2, finderInteractionSearchUIContract$ViewCallback2.f14457s.mo3010b((C32226l<? super Integer, ? extends C60896i<?>>) null), finderInteractionSearchUIContract$ViewCallback2.f14446e.f40853q);
                                                RecyclerView recyclerView2 = finderInteractionSearchUIContract$ViewCallback2.getRecyclerView();
                                                if (recyclerView2 != null) {
                                                    finderInteractionSearchUIContract$ViewCallback2.f14457s.getClass();
                                                    recyclerView2.mo17085h0(new FinderStaggeredConfig.C3631b());
                                                }
                                                WxRecyclerAdapter<C0740i2> wxRecyclerAdapter2 = finderInteractionSearchUIContract$ViewCallback2.f14456r;
                                                if (wxRecyclerAdapter2 != null) {
                                                    wxRecyclerAdapter2.f173488o = new C14716a1(finderInteractionSearchUIContract$ViewCallback2);
                                                    RecyclerView recyclerView3 = finderInteractionSearchUIContract$ViewCallback2.getRecyclerView();
                                                    if (recyclerView3 != null) {
                                                        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter3 = finderInteractionSearchUIContract$ViewCallback2.f14456r;
                                                        if (wxRecyclerAdapter3 != null) {
                                                            recyclerView3.setAdapter(wxRecyclerAdapter3);
                                                        } else {
                                                            C87412m.m108603p("adapter");
                                                            throw null;
                                                        }
                                                    }
                                                    RecyclerView recyclerView4 = finderInteractionSearchUIContract$ViewCallback2.getRecyclerView();
                                                    if (recyclerView4 != null) {
                                                        C23564m.m28137g(recyclerView4, new C14726b1(finderInteractionSearchUIContract$ViewCallback2));
                                                    }
                                                    FinderLoaderMoreFooter finderLoaderMoreFooter = new FinderLoaderMoreFooter(finderInteractionSearchUIContract$ViewCallback2.f14445d, (AttributeSet) null);
                                                    finderLoaderMoreFooter.mo79990j(C0966R.C0971layout.b7t);
                                                    finderInteractionSearchUIContract$ViewCallback2.mo3006p().mo26641y(finderLoaderMoreFooter);
                                                    finderInteractionSearchUIContract$ViewCallback2.mo3006p().setOnSimpleAction(new C14735c1(finderInteractionSearchUIContract$ViewCallback2));
                                                    RecyclerView recyclerView5 = finderInteractionSearchUIContract$ViewCallback2.getRecyclerView();
                                                    if (recyclerView5 != null && (f = C13442s8.f38060Q0.mo12873f(finderInteractionSearchUIContract$ViewCallback2.f14445d)) != null && (j3 = f.mo12854j3(-1)) != null) {
                                                        j3.mo83455c(recyclerView5);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                C87412m.m108603p("adapter");
                                                throw null;
                                            }
                                            C87412m.m108603p("searchView");
                                            throw null;
                                        }
                                        C87412m.m108603p("searchView");
                                        throw null;
                                    }
                                    C87412m.m108603p("searchView");
                                    throw null;
                                }
                                C87412m.m108603p("searchView");
                                throw null;
                            }
                            C87412m.m108603p("searchView");
                            throw null;
                        }
                        C87412m.m108603p("searchView");
                        throw null;
                    }
                    C87412m.m108603p("searchView");
                    throw null;
                }
                C87412m.m108603p("searchView");
                throw null;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C14844x0 x0Var = this.f14439q;
        if (x0Var != null) {
            x0Var.onDetach();
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f14442t) {
            this.f14442t = false;
        } else {
            hideVKB();
        }
    }
}
