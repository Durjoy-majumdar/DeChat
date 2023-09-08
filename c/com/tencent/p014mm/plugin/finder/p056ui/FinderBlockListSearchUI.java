package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0767q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.TouchableLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import er1.C58684b;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;
import p192l4.C10462b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import uo3.C78253a;
import up1.C14342g0;
import up1.C14348h0;
import up1.C14364t0;
import ye1.C15971e;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBlockListSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickCancelBtn", "onClickBackBtn", "onClickClearTextBtn", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI */
public final class FinderBlockListSearchUI extends MMFinderUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l {

    /* renamed from: u */
    public static final /* synthetic */ int f16778u = 0;

    /* renamed from: o */
    public FTSSearchView f16779o;

    /* renamed from: p */
    public WxRecyclerAdapter<C0767q> f16780p;

    /* renamed from: q */
    public final ArrayList<C0767q> f16781q = new ArrayList<>();

    /* renamed from: r */
    public String f16782r = "";

    /* renamed from: s */
    public C14364t0 f16783s;

    /* renamed from: t */
    public final C13601g f16784t = C36568h.m40985a(new C3644c(this));

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI$a */
    public static final class C3642a implements C60898l.C9503c<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderBlockListSearchUI f16785d;

        public C3642a(FinderBlockListSearchUI finderBlockListSearchUI) {
            this.f16785d = finderBlockListSearchUI;
        }

        /* renamed from: n */
        public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            C78253a aVar = new C78253a(this.f16785d.getContext());
            int c6 = i - ((C60898l) eVar).mo85796c6();
            FinderBlockListSearchUI finderBlockListSearchUI = this.f16785d;
            aVar.mo108272g(view, c6, 0, new C3893z(finderBlockListSearchUI), new C3767a0(c6, finderBlockListSearchUI, eVar), TouchableLayout.f24959d, TouchableLayout.f24960e);
            aVar.mo70679m();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI$b */
    public static final class C3643b implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderBlockListSearchUI f16786d;

        public C3643b(FinderBlockListSearchUI finderBlockListSearchUI) {
            this.f16786d = finderBlockListSearchUI;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C60905o oVar = (C60905o) zVar;
            Class cls = C58684b.class;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            int c6 = i - ((C60898l) eVar).mo85796c6();
            if (c6 >= 0 && c6 < this.f16786d.f16781q.size()) {
                FinderContact finderContact = this.f16786d.f16781q.get(c6).f1809d;
                if (C72996z1.m85817T4(finderContact.username)) {
                    Intent intent = new Intent();
                    intent.putExtra("finder_username", finderContact.username);
                    Context context = oVar.f173499A;
                    C87412m.m108593f(context, "holder.context");
                    ((C58684b) C86312j.m106911c(cls)).mo13272V1(context, intent);
                    return;
                }
                String str = finderContact.username;
                AppCompatActivity context2 = this.f16786d.getContext();
                C87412m.m108593f(context2, "context");
                ((C58684b) C86312j.m106911c(cls)).fy0(str, context2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI$c */
    public static final class C3644c extends C87413o implements C32224a<C15971e> {

        /* renamed from: d */
        public final /* synthetic */ FinderBlockListSearchUI f16787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3644c(FinderBlockListSearchUI finderBlockListSearchUI) {
            super(0);
            this.f16787d = finderBlockListSearchUI;
        }

        public Object invoke() {
            View findViewById = this.f16787d.findViewById(C0966R.C0970id.f357668b43);
            TouchableLayout touchableLayout = (TouchableLayout) findViewById;
            WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.d7e);
            if (wxRecyclerView != null) {
                return new C15971e(touchableLayout, touchableLayout, wxRecyclerView);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(C0966R.C0970id.d7e)));
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: N7 */
    public final void mo4015N7(String str) {
        Cursor S3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69670S3((String[]) null, str, this.f16782r, "", (List<String>) null);
        LinkedList<FinderContact> linkedList = new LinkedList<>();
        while (S3.moveToNext()) {
            C72996z1 z1Var = new C72996z1();
            z1Var.convertFrom(S3);
            FinderContact finderContact = new FinderContact();
            finderContact.username = z1Var.getUsername();
            linkedList.add(finderContact);
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderContact qVar : linkedList) {
            arrayList.add(new C0767q(qVar));
        }
        this.f16781q.clear();
        this.f16781q.addAll(arrayList);
        WxRecyclerAdapter<C0767q> wxRecyclerAdapter = this.f16780p;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        ((C15971e) ((C36570n) this.f16784t).getValue()).f42879a.setVisibility(0);
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        if (Util.isNullOrNil(str3)) {
            mo4015N7("");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a98;
    }

    public void initView() {
        ((C15971e) ((C36570n) this.f16784t).getValue()).f42879a.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f16780p = new WxRecyclerAdapter<>(new FinderBlockListSearchUI$initView$1(), this.f16781q, true);
        ((C15971e) ((C36570n) this.f16784t).getValue()).f42879a.setAdapter(this.f16780p);
        WxRecyclerAdapter<C0767q> wxRecyclerAdapter = this.f16780p;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f173487n = new C3642a(this);
        }
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f173488o = new C3643b(this);
        }
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickBackBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickClearTextBtn(View view) {
        FTSSearchView fTSSearchView = this.f16779o;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70355k();
            showVKB();
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FTSSearchView fTSSearchView = new FTSSearchView((Context) this, false);
        this.f16779o = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        FTSSearchView fTSSearchView2 = this.f16779o;
        C14364t0 t0Var = null;
        if (fTSSearchView2 != null) {
            fTSSearchView2.getFtsEditText().setHint(getString(C0966R.string.a2p));
            FTSSearchView fTSSearchView3 = this.f16779o;
            if (fTSSearchView3 != null) {
                fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
                FTSSearchView fTSSearchView4 = this.f16779o;
                if (fTSSearchView4 != null) {
                    fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
                    FTSSearchView fTSSearchView5 = this.f16779o;
                    if (fTSSearchView5 != null) {
                        fTSSearchView5.getFtsEditText().mo70338f();
                        ActionBar supportActionBar = getSupportActionBar();
                        C87412m.m108591d(supportActionBar);
                        FTSSearchView fTSSearchView6 = this.f16779o;
                        if (fTSSearchView6 != null) {
                            supportActionBar.mo91114y(fTSSearchView6);
                            FTSSearchView fTSSearchView7 = this.f16779o;
                            if (fTSSearchView7 != null) {
                                fTSSearchView7.getFtsEditText().mo70355k();
                                FTSSearchView fTSSearchView8 = this.f16779o;
                                if (fTSSearchView8 != null) {
                                    fTSSearchView8.getFtsEditText().mo70361q();
                                    initView();
                                    String stringExtra = getIntent().getStringExtra("BLOCK_LIST_SEARCH_TYPE");
                                    C87412m.m108591d(stringExtra);
                                    this.f16782r = stringExtra;
                                    if (C87412m.m108589b(stringExtra, "@finder.block.my.liked.android")) {
                                        t0Var = new C14348h0();
                                    } else if (C87412m.m108589b(stringExtra, "@finder.block.his.liked.android")) {
                                        t0Var = new C14342g0();
                                    }
                                    this.f16783s = t0Var;
                                    mo4015N7("");
                                    return;
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

    /* renamed from: y */
    public boolean mo3009y() {
        String str;
        hideVKB();
        FTSSearchView fTSSearchView = this.f16779o;
        if (fTSSearchView != null) {
            String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
            if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
                str = "";
            }
            if (Util.isNullOrNil(str)) {
                return true;
            }
            mo4015N7(str);
            return false;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
