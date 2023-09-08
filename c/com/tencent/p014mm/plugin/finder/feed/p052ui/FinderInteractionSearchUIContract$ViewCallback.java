package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fo1.C8178c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import vf1.C14844x0;
import vf1.C14848y0;
import ye1.C15979s;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback */
public final class FinderInteractionSearchUIContract$ViewCallback implements C8178c<C14844x0>, FTSSearchView.C6995e, FTSEditTextView.C45051l {

    /* renamed from: d */
    public final MMFragmentActivity f14445d;

    /* renamed from: e */
    public final C14844x0 f14446e;

    /* renamed from: f */
    public final C15979s f14447f;

    /* renamed from: g */
    public final int f14448g;

    /* renamed from: h */
    public final C13601g f14449h = C36568h.m40985a(new C2946f(this));

    /* renamed from: i */
    public final C13601g f14450i = C36568h.m40985a(new C2944d(this));

    /* renamed from: j */
    public final C13601g f14451j = C36568h.m40985a(new C2943c(this));

    /* renamed from: n */
    public final C13601g f14452n = C36568h.m40985a(new C2942b(this));

    /* renamed from: o */
    public final C13601g f14453o = C36568h.m40985a(new C2941a(this));

    /* renamed from: p */
    public final C13601g f14454p = C36568h.m40985a(new C2945e(this));

    /* renamed from: q */
    public FTSSearchView f14455q;

    /* renamed from: r */
    public WxRecyclerAdapter<C0740i2> f14456r;

    /* renamed from: s */
    public final FinderInteractionSearchUIContract$ViewCallback$config$1 f14457s = new FinderInteractionSearchUIContract$ViewCallback$config$1(this);

    /* renamed from: t */
    public final int f14458t = -1;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$a */
    public static final class C2941a extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f14459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2941a(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
            super(0);
            this.f14459d = finderInteractionSearchUIContract$ViewCallback;
        }

        public Object invoke() {
            return this.f14459d.f14447f.f42979b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$b */
    public static final class C2942b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f14460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2942b(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
            super(0);
            this.f14460d = finderInteractionSearchUIContract$ViewCallback;
        }

        public Object invoke() {
            return this.f14460d.f14447f.f42980c;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$c */
    public static final class C2943c extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f14461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2943c(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
            super(0);
            this.f14461d = finderInteractionSearchUIContract$ViewCallback;
        }

        public Object invoke() {
            return this.f14461d.mo3006p().getRecyclerView();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$d */
    public static final class C2944d extends C87413o implements C32224a<FinderRefreshLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f14462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2944d(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
            super(0);
            this.f14462d = finderInteractionSearchUIContract$ViewCallback;
        }

        public Object invoke() {
            return this.f14462d.f14447f.f42981d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$e */
    public static final class C2945e extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f14463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2945e(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
            super(0);
            this.f14463d = finderInteractionSearchUIContract$ViewCallback;
        }

        public Object invoke() {
            return this.f14463d.f14447f.f42978a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$f */
    public static final class C2946f extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f14464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2946f(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
            super(0);
            this.f14464d = finderInteractionSearchUIContract$ViewCallback;
        }

        public Object invoke() {
            return this.f14464d.f14447f.f42982e;
        }
    }

    public FinderInteractionSearchUIContract$ViewCallback(MMFragmentActivity mMFragmentActivity, C14844x0 x0Var, C15979s sVar, int i) {
        C87412m.m108594g(mMFragmentActivity, "context");
        C87412m.m108594g(x0Var, "presenter");
        C87412m.m108594g(sVar, "uiBinding");
        this.f14445d = mMFragmentActivity;
        this.f14446e = x0Var;
        this.f14447f = sVar;
        this.f14448g = i;
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        if (!Util.isNullOrNil((List) list)) {
            FTSSearchView fTSSearchView = this.f14455q;
            if (fTSSearchView != null) {
                fTSSearchView.getFtsEditText().setHint(this.f14445d.getString(C0966R.string.m_y));
            } else {
                C87412m.m108603p("searchView");
                throw null;
            }
        } else {
            FTSSearchView fTSSearchView2 = this.f14455q;
            if (fTSSearchView2 != null) {
                fTSSearchView2.getFtsEditText().setHint(this.f14445d.getString(C0966R.string.m_x));
            } else {
                C87412m.m108603p("searchView");
                throw null;
            }
        }
        if (Util.isNullOrNil(str2) && Util.isNullOrNil((List) list)) {
            if (mo3008x()) {
                mo3007v().setVisibility(0);
            }
            ((LinearLayout) ((C36570n) this.f14453o).getValue()).setVisibility(8);
            ((TextView) ((C36570n) this.f14452n).getValue()).setVisibility(8);
            mo3006p().setVisibility(8);
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f14445d;
    }

    public final RecyclerView getRecyclerView() {
        return (RecyclerView) ((C36570n) this.f14451j).getValue();
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickBackBtn(View view) {
        this.f14445d.hideVKB();
        this.f14445d.finish();
    }

    public void onClickClearTextBtn(View view) {
        FTSSearchView fTSSearchView = this.f14455q;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70355k();
            this.f14445d.showVKB();
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    /* renamed from: p */
    public final FinderRefreshLayout mo3006p() {
        return (FinderRefreshLayout) ((C36570n) this.f14450i).getValue();
    }

    /* renamed from: v */
    public final LinearLayout mo3007v() {
        return (LinearLayout) ((C36570n) this.f14454p).getValue();
    }

    /* renamed from: x */
    public final boolean mo3008x() {
        return !Util.isNullOrNil((List) this.f14446e.f40844e) && this.f14448g == 2;
    }

    /* renamed from: y */
    public boolean mo3009y() {
        this.f14445d.hideVKB();
        FTSSearchView fTSSearchView = this.f14455q;
        if (fTSSearchView != null) {
            String inEditTextQuery = fTSSearchView.getFtsEditText().getInEditTextQuery();
            if (inEditTextQuery == null) {
                inEditTextQuery = "";
            }
            if (Util.isNullOrNil(inEditTextQuery)) {
                FTSSearchView fTSSearchView2 = this.f14455q;
                if (fTSSearchView2 == null) {
                    C87412m.m108603p("searchView");
                    throw null;
                } else if (Util.isNullOrNil((List) fTSSearchView2.getFtsEditText().getTagList())) {
                    return true;
                }
            }
            LinkedList linkedList = new LinkedList();
            FTSSearchView fTSSearchView3 = this.f14455q;
            if (fTSSearchView3 != null) {
                List<FTSSearchView.C6996f> tagList = fTSSearchView3.getFtsEditText().getTagList();
                C87412m.m108593f(tagList, "searchView.ftsEditText.tagList");
                ArrayList<C14848y0> arrayList = new ArrayList<>(C36907w.m41090l(tagList, 10));
                for (FTSSearchView.C6996f fVar : tagList) {
                    C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract.TagModel");
                    arrayList.add((C14848y0) fVar);
                }
                for (C14848y0 y0Var : arrayList) {
                    String str = y0Var.f40860d.f1749d.f141617d;
                    if (str == null) {
                        str = "";
                    }
                    linkedList.add(str);
                }
                this.f14446e.mo13931t(inEditTextQuery, linkedList);
                return true;
            }
            C87412m.m108603p("searchView");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
