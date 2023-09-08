package com.tencent.p014mm.plugin.finder.search;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import dp1.C7428c1;
import er1.C7878t0;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import hp1.C46091u0;
import hp1.C8651a1;
import hp1.C8661f0;
import hp1.C8668i;
import hp1.C8706y0;
import hp1.C8708z0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import je1.C9320i4;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import kotlin.Metadata;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import pe3.C89349b;
import sx3.C36907w;
import te3.C49572gk1;
import te3.C49712hj1;
import te3.C51270sn1;
import te3.C51571un1;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderTopicSearchUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Lob0/n;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickCancelBtn", "onClickBackBtn", "onClickClearTextBtn", "<init>", "()V", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.finder.search.FinderTopicSearchUI */
public final class FinderTopicSearchUI extends MMActivity implements FTSSearchView.C6995e, FTSEditTextView.C45051l, C11385n {

    /* renamed from: d */
    public FTSSearchView f16606d;

    /* renamed from: e */
    public String f16607e = "";

    /* renamed from: f */
    public int f16608f;

    /* renamed from: g */
    public int f16609g;

    /* renamed from: h */
    public C89349b f16610h;

    /* renamed from: i */
    public ArrayList<C51571un1> f16611i = new ArrayList<>();

    /* renamed from: j */
    public String f16612j = "";

    /* renamed from: n */
    public int f16613n;

    /* renamed from: o */
    public boolean f16614o = true;

    /* renamed from: p */
    public HashMap<String, C8668i> f16615p = new HashMap<>();

    /* renamed from: q */
    public View f16616q;

    /* renamed from: r */
    public CoordinatorLayout f16617r;

    /* renamed from: s */
    public RefreshLoadMoreLayout f16618s;

    /* renamed from: t */
    public RecyclerView f16619t;

    /* renamed from: u */
    public TextView f16620u;

    /* renamed from: v */
    public View f16621v;

    /* renamed from: w */
    public C9320i4 f16622w;

    /* renamed from: x */
    public C46091u0 f16623x;

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderTopicSearchUI$a */
    public final class C3576a extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f16624z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3576a(FinderTopicSearchUI finderTopicSearchUI, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.kpm);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.title_tv)");
            this.f16624z = (TextView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderTopicSearchUI$b */
    public final class C3577b extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final int f16625d;

        /* renamed from: e */
        public boolean f16626e;

        /* renamed from: f */
        public int f16627f;

        /* renamed from: g */
        public final /* synthetic */ FinderTopicSearchUI f16628g;

        public C3577b(FinderTopicSearchUI finderTopicSearchUI, int i, int i2, C8480h hVar) {
            i = (i2 & 1) != 0 ? 4 : i;
            this.f16628g = finderTopicSearchUI;
            this.f16625d = i;
        }

        /* renamed from: F4 */
        public final void mo3928F4(RecyclerView.C16631z zVar, int i) {
            String str;
            if (!(zVar instanceof C3576a)) {
                C51571un1 un12 = (this.f16625d != 4 || !this.f16626e || this.f16627f == this.f16628g.f16611i.size()) ? this.f16628g.f16611i.get(i) : i < this.f16627f + 1 ? this.f16628g.f16611i.get(i - 1) : this.f16628g.f16611i.get(i - 2);
                C87412m.m108593f(un12, "if (requestType == Const…sition]\n                }");
                FinderTopicSearchUI finderTopicSearchUI = this.f16628g;
                C51270sn1 sn12 = un12.f142961d;
                if (sn12 == null || (str = sn12.f141617d) == null) {
                    str = "";
                }
                if (!finderTopicSearchUI.f16615p.containsKey(str)) {
                    Log.m105918d("Finder.FinderTopicSearchUI", "addExposeItem " + str + ' ' + i + ' ' + 1);
                    C8668i iVar = new C8668i();
                    iVar.f27858b = str;
                    iVar.f27857a = i;
                    iVar.f27859c = 1;
                    iVar.f27860d = System.currentTimeMillis();
                    finderTopicSearchUI.f16615p.put(str, iVar);
                    if (finderTopicSearchUI.f16615p.size() % 30 == 0) {
                        finderTopicSearchUI.mo3925J7(false);
                    }
                }
                C51270sn1 sn13 = un12.f142961d;
                if (sn13 != null) {
                    ((TextView) zVar.f44854d.findViewById(C0966R.C0970id.ecs)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(zVar.f44854d.getContext(), sn13.f141617d));
                    ((TextView) zVar.f44854d.findViewById(C0966R.C0970id.ecr)).setText(zVar.f44854d.getContext().getString(C0966R.string.eej, new Object[]{C7878t0.m8034c(2, sn13.f141619f)}));
                }
            } else if (getItemViewType(i) == 1) {
                ((C3576a) zVar).f16624z.setText(this.f16628g.getString(C0966R.string.d4_));
            } else {
                ((C3576a) zVar).f16624z.setText(this.f16628g.getString(C0966R.string.d4b));
            }
        }

        public int getItemCount() {
            if (this.f16625d == 3 && this.f16628g.f16611i.size() != 0) {
                this.f16627f = 0;
                this.f16626e = false;
                Iterator<C51571un1> it = this.f16628g.f16611i.iterator();
                while (it.hasNext()) {
                    C51270sn1 sn12 = it.next().f142961d;
                    boolean z = sn12 != null && sn12.f141622i > 0;
                    this.f16626e = z;
                    if (!z) {
                        break;
                    }
                    this.f16627f++;
                }
                if (this.f16626e) {
                    return this.f16627f == this.f16628g.f16611i.size() ? this.f16628g.f16611i.size() : this.f16628g.f16611i.size() + 2;
                }
            }
            return this.f16628g.f16611i.size();
        }

        public int getItemViewType(int i) {
            if (this.f16625d != 4 || !this.f16626e || this.f16627f == this.f16628g.f16611i.size()) {
                return 3;
            }
            if (i == 0) {
                return 1;
            }
            return i == this.f16627f + 1 ? 2 : 3;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            mo3928F4(zVar, i);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            if (i == 3) {
                AppCompatActivity context = this.f16628g.getContext();
                C87412m.m108591d(context);
                View inflate = context.getLayoutInflater().inflate(C0966R.C0971layout.abx, viewGroup, false);
                C87412m.m108593f(inflate, "contactLayout");
                return new C8661f0(inflate, false, false, 6, (C8480h) null);
            }
            FinderTopicSearchUI finderTopicSearchUI = this.f16628g;
            AppCompatActivity context2 = finderTopicSearchUI.getContext();
            C87412m.m108591d(context2);
            View inflate2 = context2.getLayoutInflater().inflate(C0966R.C0971layout.and, viewGroup, false);
            C87412m.m108593f(inflate2, "context!!.layoutInflater…ader_item, parent, false)");
            return new C3576a(finderTopicSearchUI, inflate2);
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List<Object> list) {
            C87412m.m108594g(zVar, "holder");
            C87412m.m108594g(list, "payloads");
            mo3928F4(zVar, i);
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        if (z) {
            String str = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb() + ',' + 1;
            Log.m105924i("Finder.FinderSearchReportLogic", "report19184 " + str);
            C117407d.INSTANCE.kvStat(19184, str);
        }
    }

    /* renamed from: H7 */
    public final int mo3923H7() {
        RecyclerView recyclerView = this.f16619t;
        if (recyclerView != null) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            return adapter != null ? adapter.getItemCount() : this.f16611i.size();
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: I7 */
    public final boolean mo3924I7() {
        String str;
        FTSSearchView fTSSearchView = this.f16606d;
        if (fTSSearchView != null) {
            String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
            if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
                str = "";
            }
            if (Util.isNullOrNil(str)) {
                return true;
            }
            mo3926K7(str);
            C46091u0 u0Var = this.f16623x;
            if (u0Var == null) {
                return false;
            }
            u0Var.mo71529c(str);
            return false;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    /* renamed from: J7 */
    public final void mo3925J7(boolean z) {
        if (!Util.isNullOrNil(this.f16612j) && (!this.f16615p.isEmpty())) {
            C7428c1.f25609a.mo8561a(this.f16612j, this.f16607e, 0, this.f16615p, 2);
            if (z) {
                this.f16615p.clear();
            }
        }
    }

    /* renamed from: K7 */
    public final void mo3926K7(String str) {
        mo3925J7(true);
        this.f16607e = str;
        this.f16608f = 0;
        this.f16609g = 0;
        this.f16610h = null;
        this.f16611i.clear();
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        this.f16612j = uuid;
        if (this.f16622w != null) {
            C86709a0.m107524d().mo123458d(this.f16622w);
        }
        C9320i4 i4Var = r2;
        C9320i4 i4Var2 = new C9320i4(str, this.f16608f, this.f16612j, this.f16610h, this.f16613n, (C49712hj1) null, (C89349b) null, (C89349b) null, (C89349b) null, false, 0, 2016, (C8480h) null);
        this.f16622w = i4Var;
        C86709a0.m107524d().mo123460f(this.f16622w);
        C86709a0.m107524d().mo123455a(3820, this);
        View view = this.f16621v;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c((Object) null);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = this.f16620u;
            if (textView != null) {
                textView.setVisibility(8);
                RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16618s;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.setVisibility(8);
                    RecyclerView recyclerView = this.f16619t;
                    if (recyclerView != null) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c((Object) null);
                        C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
                        recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
                        return;
                    }
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            C87412m.m108603p("noResultView");
            throw null;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        if (Util.isNullOrNil(str3)) {
            View view = this.f16621v;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f16620u;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16618s;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.setVisibility(8);
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("noResultView");
                    throw null;
                }
            } else {
                C87412m.m108603p("loadingView");
                throw null;
            }
        } else {
            mo3924I7();
        }
        C46091u0 u0Var = this.f16623x;
        if (u0Var != null) {
            u0Var.mo71528b(str3);
        }
    }

    public boolean enableActivityAnimation() {
        return false;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aqu;
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
        FTSSearchView fTSSearchView = this.f16606d;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70355k();
            showVKB();
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(C0966R.color.ahf));
        FTSSearchView fTSSearchView = new FTSSearchView((Context) this, false);
        this.f16606d = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        FTSSearchView fTSSearchView2 = this.f16606d;
        if (fTSSearchView2 != null) {
            fTSSearchView2.getFtsEditText().setHint(getString(C0966R.string.a2p));
            FTSSearchView fTSSearchView3 = this.f16606d;
            if (fTSSearchView3 != null) {
                fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
                FTSSearchView fTSSearchView4 = this.f16606d;
                if (fTSSearchView4 != null) {
                    fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
                    FTSSearchView fTSSearchView5 = this.f16606d;
                    if (fTSSearchView5 != null) {
                        fTSSearchView5.getFtsEditText().mo70338f();
                        ActionBar supportActionBar = getSupportActionBar();
                        C87412m.m108591d(supportActionBar);
                        FTSSearchView fTSSearchView6 = this.f16606d;
                        if (fTSSearchView6 != null) {
                            supportActionBar.mo91114y(fTSSearchView6);
                            this.f16613n = getIntent().getIntExtra("request_type", 4);
                            this.f16614o = getIntent().getBooleanExtra("need_history", false);
                            String uuid = UUID.randomUUID().toString();
                            C87412m.m108593f(uuid, "randomUUID().toString()");
                            this.f16612j = uuid;
                            this.f16607e = "";
                            FTSSearchView fTSSearchView7 = this.f16606d;
                            if (fTSSearchView7 != null) {
                                fTSSearchView7.getFtsEditText().mo70355k();
                                FTSSearchView fTSSearchView8 = this.f16606d;
                                if (fTSSearchView8 != null) {
                                    fTSSearchView8.getFtsEditText().mo70361q();
                                    if (this.f16614o) {
                                        View findViewById = getContext().findViewById(C0966R.C0970id.ewk);
                                        C9556a aVar = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar.mo10233c(0);
                                        View view = findViewById;
                                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        this.f16623x = new C46091u0(this, new C8651a1(this));
                                    } else {
                                        View findViewById2 = getContext().findViewById(C0966R.C0970id.ewk);
                                        C9556a aVar2 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                        aVar2.mo10233c(8);
                                        View view2 = findViewById2;
                                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                    Log.m105924i("Finder.FinderTopicSearchUI", "initData");
                                    View findViewById3 = getContext().findViewById(C0966R.C0970id.iwc);
                                    C87412m.m108593f(findViewById3, "context.findViewById(R.id.root)");
                                    this.f16616q = findViewById3;
                                    View findViewById4 = getContext().findViewById(C0966R.C0970id.gkz);
                                    C87412m.m108593f(findViewById4, "context.findViewById(R.id.main_rv)");
                                    this.f16617r = (CoordinatorLayout) findViewById4;
                                    View findViewById5 = getContext().findViewById(C0966R.C0970id.ivb);
                                    C87412m.m108593f(findViewById5, "context.findViewById(R.id.rl_layout)");
                                    RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById5;
                                    this.f16618s = refreshLoadMoreLayout;
                                    this.f16619t = refreshLoadMoreLayout.getRecyclerView();
                                    View findViewById6 = getContext().findViewById(C0966R.C0970id.hgr);
                                    C87412m.m108593f(findViewById6, "context.findViewById(R.id.no_result_tv)");
                                    this.f16620u = (TextView) findViewById6;
                                    View findViewById7 = getContext().findViewById(C0966R.C0970id.g3e);
                                    C87412m.m108593f(findViewById7, "context.findViewById(R.id.loading_layout)");
                                    this.f16621v = findViewById7;
                                    FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(this);
                                    RecyclerView recyclerView = this.f16619t;
                                    if (recyclerView != null) {
                                        recyclerView.setLayoutManager(finderLinearLayoutManager);
                                        RecyclerView recyclerView2 = this.f16619t;
                                        if (recyclerView2 != null) {
                                            recyclerView2.setAdapter(new C3577b(this, 0, 1, (C8480h) null));
                                            RecyclerView recyclerView3 = this.f16619t;
                                            if (recyclerView3 != null) {
                                                recyclerView3.setHasFixedSize(true);
                                                RecyclerView recyclerView4 = this.f16619t;
                                                if (recyclerView4 != null) {
                                                    recyclerView4.setItemViewCacheSize(5);
                                                    RecyclerView recyclerView5 = this.f16619t;
                                                    if (recyclerView5 != null) {
                                                        recyclerView5.setOnTouchListener(new C8706y0(this));
                                                        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f16618s;
                                                        if (refreshLoadMoreLayout2 != null) {
                                                            refreshLoadMoreLayout2.setEnablePullDownHeader(false);
                                                            RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f16618s;
                                                            if (refreshLoadMoreLayout3 != null) {
                                                                View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                                                                C87412m.m108593f(inflate, "getInflater(context).inf…t.load_more_footer, null)");
                                                                refreshLoadMoreLayout3.setLoadMoreFooter(inflate);
                                                                RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f16618s;
                                                                if (refreshLoadMoreLayout4 != null) {
                                                                    refreshLoadMoreLayout4.setActionCallback(new C8708z0(this));
                                                                    String str = this.f16607e;
                                                                    if (str != null) {
                                                                        FTSSearchView fTSSearchView9 = this.f16606d;
                                                                        if (fTSSearchView9 != null) {
                                                                            fTSSearchView9.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
                                                                        } else {
                                                                            C87412m.m108603p("searchView");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    RecyclerView recyclerView6 = this.f16619t;
                                                                    if (recyclerView6 != null) {
                                                                        RecyclerView.C16613e adapter = recyclerView6.getAdapter();
                                                                        if (adapter != null) {
                                                                            adapter.notifyDataSetChanged();
                                                                        }
                                                                        RecyclerView recyclerView7 = this.f16619t;
                                                                        if (recyclerView7 != null) {
                                                                            C9556a aVar3 = new C9556a();
                                                                            aVar3.mo10233c(0);
                                                                            RecyclerView recyclerView8 = recyclerView7;
                                                                            C117292a.m165358d(recyclerView8, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
                                                                            recyclerView7.mo17115r1(((Integer) aVar3.mo10231a(0)).intValue());
                                                                            C117292a.m165359e(recyclerView8, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
                                                                            return;
                                                                        }
                                                                        C87412m.m108603p("recyclerView");
                                                                        throw null;
                                                                    }
                                                                    C87412m.m108603p("recyclerView");
                                                                    throw null;
                                                                }
                                                                C87412m.m108603p("rlLayout");
                                                                throw null;
                                                            }
                                                            C87412m.m108603p("rlLayout");
                                                            throw null;
                                                        }
                                                        C87412m.m108603p("rlLayout");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("recyclerView");
                                                    throw null;
                                                }
                                                C87412m.m108603p("recyclerView");
                                                throw null;
                                            }
                                            C87412m.m108603p("recyclerView");
                                            throw null;
                                        }
                                        C87412m.m108603p("recyclerView");
                                        throw null;
                                    }
                                    C87412m.m108603p("recyclerView");
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

    public void onDestroy() {
        C46091u0 u0Var = this.f16623x;
        if (u0Var != null) {
            u0Var.mo71527a();
        }
        mo3925J7(true);
        C86709a0.m107524d().mo123470p(3820, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107524d().mo123470p(3820, this);
        int H7 = mo3923H7();
        int H72 = mo3923H7();
        if (i == 0 && i2 == 0) {
            C117407d.INSTANCE.idkeyStat(1265, 10, 1, false);
            C9320i4 i4Var = this.f16622w;
            C49572gk1 gk12 = i4Var != null ? i4Var.f29125v : null;
            C87412m.m108592e(gk12, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchResponse");
            LinkedList<C51571un1> linkedList = gk12.f134094j;
            C87412m.m108593f(linkedList, "response.topicInfoList");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C51571un1 add : linkedList) {
                arrayList.add(Boolean.valueOf(this.f16611i.add(add)));
            }
            this.f16608f = gk12.f134089e;
            this.f16609g = gk12.f134096o;
            this.f16610h = gk12.f134092h;
            int H73 = mo3923H7();
            Log.m105924i("Finder.FinderTopicSearchUI", "onSceneEnd " + gk12.f134089e + ' ' + gk12.f134090f + ' ' + this.f16611i.size());
            H72 = H73;
        } else {
            C117407d.INSTANCE.idkeyStat(1265, 11, 1, false);
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16618s;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.mo82440F(0);
            if (H72 == 0) {
                View view = this.f16621v;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = this.f16620u;
                    if (textView != null) {
                        textView.setVisibility(0);
                        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f16618s;
                        if (refreshLoadMoreLayout2 != null) {
                            refreshLoadMoreLayout2.setVisibility(8);
                        } else {
                            C87412m.m108603p("rlLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("noResultView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("loadingView");
                    throw null;
                }
            } else {
                View view3 = this.f16621v;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView2 = this.f16620u;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f16618s;
                        if (refreshLoadMoreLayout3 != null) {
                            refreshLoadMoreLayout3.setVisibility(0);
                            CoordinatorLayout coordinatorLayout = this.f16617r;
                            if (coordinatorLayout != null) {
                                coordinatorLayout.setVisibility(0);
                                View view5 = this.f16616q;
                                if (view5 != null) {
                                    view5.setBackground(getContext().getResources().getDrawable(C0966R.color.f2927a));
                                } else {
                                    C87412m.m108603p("rootView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mainContainer");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("rlLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("noResultView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("loadingView");
                    throw null;
                }
            }
            if (H7 == 0) {
                RecyclerView recyclerView = this.f16619t;
                if (recyclerView != null) {
                    RecyclerView.C16613e adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            } else if (H7 < H72) {
                RecyclerView recyclerView2 = this.f16619t;
                if (recyclerView2 != null) {
                    RecyclerView.C16613e adapter2 = recyclerView2.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemRangeInserted(H7, H72 - H7);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else {
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }

    /* renamed from: y */
    public boolean mo3009y() {
        hideVKB();
        if (mo3924I7()) {
            return true;
        }
        C117407d.INSTANCE.idkeyStat(1265, 9, 1, false);
        return false;
    }
}
