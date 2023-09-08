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
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import dp1.C7428c1;
import f40.C86709a0;
import fe1.C58961d;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import hp1.C46091u0;
import hp1.C8649a;
import hp1.C8652b;
import hp1.C8654c;
import hp1.C8661f0;
import hp1.C8668i;
import hp1.C8703w0;
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
import pe3.C89349b;
import sx3.C36907w;
import te3.C48868bk1;
import te3.C49572gk1;
import te3.C49712hj1;
import te3.C50972qk0;
import te3.C51571un1;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Lob0/n;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "<init>", "()V", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI */
public final class FinderContactSearchIncludeFollowUI extends MMActivity implements FTSSearchView.C6995e, FTSEditTextView.C45051l, C11385n {

    /* renamed from: B */
    public static final /* synthetic */ int f16400B = 0;

    /* renamed from: A */
    public C9320i4 f16401A;

    /* renamed from: d */
    public FTSSearchView f16402d;

    /* renamed from: e */
    public String f16403e = "";

    /* renamed from: f */
    public int f16404f;

    /* renamed from: g */
    public int f16405g;

    /* renamed from: h */
    public C89349b f16406h;

    /* renamed from: i */
    public ArrayList<C48868bk1> f16407i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C51571un1> f16408j = new ArrayList<>();

    /* renamed from: n */
    public int f16409n;

    /* renamed from: o */
    public String f16410o = "";

    /* renamed from: p */
    public int f16411p;

    /* renamed from: q */
    public boolean f16412q = true;

    /* renamed from: r */
    public boolean f16413r;

    /* renamed from: s */
    public HashMap<String, C8668i> f16414s = new HashMap<>();

    /* renamed from: t */
    public View f16415t;

    /* renamed from: u */
    public CoordinatorLayout f16416u;

    /* renamed from: v */
    public RefreshLoadMoreLayout f16417v;

    /* renamed from: w */
    public RecyclerView f16418w;

    /* renamed from: x */
    public TextView f16419x;

    /* renamed from: y */
    public View f16420y;

    /* renamed from: z */
    public C46091u0 f16421z;

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI$a */
    public final class C3536a extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final int f16422d;

        /* renamed from: e */
        public boolean f16423e;

        /* renamed from: f */
        public int f16424f;

        /* renamed from: g */
        public final /* synthetic */ FinderContactSearchIncludeFollowUI f16425g;

        public C3536a(FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI, int i, int i2, C8480h hVar) {
            i = (i2 & 1) != 0 ? 3 : i;
            this.f16425g = finderContactSearchIncludeFollowUI;
            this.f16422d = i;
        }

        /* renamed from: F4 */
        public static void m3638F4(C3536a aVar, RecyclerView.C16631z zVar, int i, boolean z, int i2, Object obj) {
            String str;
            C3536a aVar2 = aVar;
            RecyclerView.C16631z zVar2 = zVar;
            int i3 = i;
            aVar.getClass();
            boolean z2 = true;
            if (!(zVar2 instanceof C3537b)) {
                C48868bk1 bk12 = (aVar2.f16422d != 3 || !aVar2.f16423e || aVar2.f16424f == aVar2.f16425g.f16407i.size()) ? aVar2.f16425g.f16407i.get(i3) : i3 < aVar2.f16424f + 1 ? aVar2.f16425g.f16407i.get(i3 - 1) : aVar2.f16425g.f16407i.get(i3 - 2);
                C87412m.m108593f(bk12, "if (requestType == Const…sition]\n                }");
                FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI = aVar2.f16425g;
                FinderContact finderContact = bk12.f131162d;
                if (finderContact == null || (str = finderContact.username) == null) {
                    str = "";
                }
                finderContactSearchIncludeFollowUI.getClass();
                if (!finderContactSearchIncludeFollowUI.f16414s.containsKey(str)) {
                    Log.m105918d("Finder.FinderContactSearchIncludeFollowUI", "addExposeItem " + str + ' ' + i3 + ' ' + 1);
                    C8668i iVar = new C8668i();
                    iVar.f27858b = str;
                    iVar.f27857a = i3;
                    iVar.f27859c = 1;
                    iVar.f27860d = System.currentTimeMillis();
                    finderContactSearchIncludeFollowUI.f16414s.put(str, iVar);
                    if (finderContactSearchIncludeFollowUI.f16414s.size() % 30 == 0) {
                        finderContactSearchIncludeFollowUI.mo3871J7(false);
                    }
                }
                C87412m.m108592e(zVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactItemHolder");
                C8661f0 f0Var = (C8661f0) zVar2;
                C3578a aVar3 = new C3578a(aVar2.f16425g, i3);
                if (i3 == 0) {
                    z2 = false;
                }
                int i4 = C8661f0.f27826W;
                f0Var.mo9518y(bk12, aVar3, (View.OnLongClickListener) null, z2);
                View findViewById = zVar2.f44854d.findViewById(C0966R.C0970id.ect);
                if (findViewById != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (aVar2.getItemViewType(i3) == 1) {
                ((C3537b) zVar2).f16426z.setText(aVar2.f16425g.getString(C0966R.string.d49));
            } else {
                ((C3537b) zVar2).f16426z.setText(aVar2.f16425g.getString(C0966R.string.d4a));
            }
        }

        public int getItemCount() {
            if (this.f16422d == 3 && this.f16425g.f16407i.size() != 0) {
                this.f16424f = 0;
                this.f16423e = false;
                Iterator<C48868bk1> it = this.f16425g.f16407i.iterator();
                while (it.hasNext()) {
                    C48868bk1 next = it.next();
                    int i = FinderContactSearchIncludeFollowUI.f16400B;
                    StringBuilder sb = new StringBuilder();
                    sb.append("getItemCount isFollow:");
                    FinderContact finderContact = next.f131162d;
                    String str = null;
                    sb.append(finderContact != null ? finderContact.username : null);
                    Log.m105924i("Finder.FinderContactSearchIncludeFollowUI", sb.toString());
                    C58961d.C58963b bVar = C58961d.f168673a;
                    FinderContact finderContact2 = next.f131162d;
                    if (finderContact2 != null) {
                        str = finderContact2.username;
                    }
                    if (!C58961d.C58963b.m68836h(bVar, str, (String) null, false, false, 14, (Object) null)) {
                        break;
                    }
                    this.f16423e = true;
                    this.f16424f++;
                }
                if (this.f16423e) {
                    return this.f16424f == this.f16425g.f16407i.size() ? this.f16425g.f16407i.size() : this.f16425g.f16407i.size() + 2;
                }
            }
            return this.f16425g.f16407i.size();
        }

        public int getItemViewType(int i) {
            if (this.f16422d != 3 || !this.f16423e || this.f16424f == this.f16425g.f16407i.size()) {
                return 3;
            }
            if (i == 0) {
                return 1;
            }
            return i == this.f16424f + 1 ? 2 : 3;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List<Object> list) {
            C87412m.m108594g(zVar, "holder");
            C87412m.m108594g(list, "payloads");
            m3638F4(this, zVar, i, false, 4, (Object) null);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            if (i == 3) {
                AppCompatActivity context = this.f16425g.getContext();
                C87412m.m108591d(context);
                View inflate = context.getLayoutInflater().inflate(C0966R.C0971layout.a9v, viewGroup, false);
                C87412m.m108593f(inflate, "contactLayout");
                return new C8661f0(inflate, false, false, 6, (C8480h) null);
            }
            FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI = this.f16425g;
            AppCompatActivity context2 = finderContactSearchIncludeFollowUI.getContext();
            C87412m.m108591d(context2);
            View inflate2 = context2.getLayoutInflater().inflate(C0966R.C0971layout.and, viewGroup, false);
            C87412m.m108593f(inflate2, "context!!.layoutInflater…ader_item, parent, false)");
            return new C3537b(finderContactSearchIncludeFollowUI, inflate2);
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            m3638F4(this, zVar, i, false, 4, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI$b */
    public final class C3537b extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f16426z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3537b(FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.kpm);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.title_tv)");
            this.f16426z = (TextView) findViewById;
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
    public final int mo3869H7() {
        RecyclerView recyclerView = this.f16418w;
        if (recyclerView != null) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            return adapter != null ? adapter.getItemCount() : this.f16407i.size();
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: I7 */
    public final boolean mo3870I7() {
        String str;
        FTSSearchView fTSSearchView = this.f16402d;
        if (fTSSearchView != null) {
            String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
            if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
                str = "";
            }
            if (Util.isNullOrNil(str)) {
                return true;
            }
            mo3872K7(str);
            C46091u0 u0Var = this.f16421z;
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
    public final void mo3871J7(boolean z) {
        if (!Util.isNullOrNil(this.f16410o) && (!this.f16414s.isEmpty())) {
            C7428c1.f25609a.mo8561a(this.f16410o, this.f16403e, 0, this.f16414s, 2);
            if (z) {
                this.f16414s.clear();
            }
        }
    }

    /* renamed from: K7 */
    public final void mo3872K7(String str) {
        mo3871J7(true);
        this.f16403e = str;
        this.f16404f = 0;
        this.f16405g = 0;
        this.f16406h = null;
        if (this.f16411p == 4) {
            this.f16408j.clear();
        } else {
            this.f16407i.clear();
        }
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        this.f16410o = uuid;
        if (this.f16401A != null) {
            C86709a0.m107524d().mo123458d(this.f16401A);
        }
        C9320i4 i4Var = r2;
        C9320i4 i4Var2 = new C9320i4(str, this.f16404f, this.f16410o, this.f16406h, this.f16411p, (C49712hj1) null, (C89349b) null, (C89349b) null, (C89349b) null, false, 0, 2016, (C8480h) null);
        this.f16401A = i4Var;
        C86709a0.m107524d().mo123460f(this.f16401A);
        C86709a0.m107524d().mo123455a(3820, this);
        View view = this.f16420y;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c((Object) null);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = this.f16419x;
            if (textView != null) {
                textView.setVisibility(8);
                RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16417v;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.setVisibility(8);
                    RecyclerView recyclerView = this.f16418w;
                    if (recyclerView != null) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c((Object) null);
                        C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
                        recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
                        View view3 = this.f16415t;
                        if (view3 != null) {
                            view3.setBackground(getContext().getResources().getDrawable(C0966R.color.f2927a));
                        } else {
                            C87412m.m108603p("rootView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("recyclerView");
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

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        if (Util.isNullOrNil(str3)) {
            View view = this.f16420y;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f16419x;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16417v;
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
            mo3870I7();
        }
        C46091u0 u0Var = this.f16421z;
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
        return C0966R.C0971layout.a9u;
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
        FTSSearchView fTSSearchView = this.f16402d;
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
        this.f16402d = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        FTSSearchView fTSSearchView2 = this.f16402d;
        if (fTSSearchView2 != null) {
            fTSSearchView2.getFtsEditText().setHint(getString(C0966R.string.a2p));
            FTSSearchView fTSSearchView3 = this.f16402d;
            if (fTSSearchView3 != null) {
                fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
                FTSSearchView fTSSearchView4 = this.f16402d;
                if (fTSSearchView4 != null) {
                    fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
                    FTSSearchView fTSSearchView5 = this.f16402d;
                    if (fTSSearchView5 != null) {
                        fTSSearchView5.getFtsEditText().mo70338f();
                        ActionBar supportActionBar = getSupportActionBar();
                        C87412m.m108591d(supportActionBar);
                        FTSSearchView fTSSearchView6 = this.f16402d;
                        if (fTSSearchView6 != null) {
                            supportActionBar.mo91114y(fTSSearchView6);
                            this.f16411p = getIntent().getIntExtra("request_type", 3);
                            this.f16413r = getIntent().getBooleanExtra("from_at_contact", false);
                            this.f16412q = getIntent().getBooleanExtra("need_history", false);
                            C50972qk0 qk02 = C8703w0.f27929c;
                            String str = "";
                            if (qk02 != null) {
                                C8703w0.f27929c = null;
                                String str2 = qk02.f140366j;
                                if (str2 == null) {
                                    str2 = str;
                                }
                                this.f16410o = str2;
                                String str3 = qk02.f140360d;
                                if (str3 != null) {
                                    str = str3;
                                }
                                this.f16403e = str;
                                this.f16404f = qk02.f140361e;
                                this.f16405g = qk02.f140362f;
                                this.f16406h = qk02.f140364h;
                                this.f16409n = qk02.f140365i;
                                LinkedList<C48868bk1> linkedList = qk02.f140367n;
                                C87412m.m108593f(linkedList, "finderFeedObj.contactList");
                                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                                for (C48868bk1 add : linkedList) {
                                    arrayList.add(Boolean.valueOf(this.f16407i.add(add)));
                                }
                            } else {
                                String uuid = UUID.randomUUID().toString();
                                C87412m.m108593f(uuid, "randomUUID().toString()");
                                this.f16410o = uuid;
                                this.f16403e = str;
                                FTSSearchView fTSSearchView7 = this.f16402d;
                                if (fTSSearchView7 != null) {
                                    fTSSearchView7.getFtsEditText().mo70355k();
                                    FTSSearchView fTSSearchView8 = this.f16402d;
                                    if (fTSSearchView8 != null) {
                                        fTSSearchView8.getFtsEditText().mo70361q();
                                    } else {
                                        C87412m.m108603p("searchView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("searchView");
                                    throw null;
                                }
                            }
                            if (this.f16412q) {
                                View findViewById = getContext().findViewById(C0966R.C0970id.ewk);
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view = findViewById;
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                this.f16421z = new C46091u0(this, new C8654c(this));
                            } else {
                                View findViewById2 = getContext().findViewById(C0966R.C0970id.ewk);
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar2.mo10233c(8);
                                View view2 = findViewById2;
                                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            if (this.f16413r) {
                                setResult(0, getIntent());
                            }
                            Log.m105925i("Finder.FinderContactSearchIncludeFollowUI", "fromAtContact:%s", Boolean.valueOf(this.f16413r));
                            View findViewById3 = getContext().findViewById(C0966R.C0970id.iwc);
                            C87412m.m108593f(findViewById3, "context.findViewById(R.id.root)");
                            this.f16415t = findViewById3;
                            View findViewById4 = getContext().findViewById(C0966R.C0970id.gkz);
                            C87412m.m108593f(findViewById4, "context.findViewById(R.id.main_rv)");
                            this.f16416u = (CoordinatorLayout) findViewById4;
                            View findViewById5 = getContext().findViewById(C0966R.C0970id.ivb);
                            C87412m.m108593f(findViewById5, "context.findViewById(R.id.rl_layout)");
                            RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById5;
                            this.f16417v = refreshLoadMoreLayout;
                            this.f16418w = refreshLoadMoreLayout.getRecyclerView();
                            View findViewById6 = getContext().findViewById(C0966R.C0970id.hgr);
                            C87412m.m108593f(findViewById6, "context.findViewById(R.id.no_result_tv)");
                            this.f16419x = (TextView) findViewById6;
                            View findViewById7 = getContext().findViewById(C0966R.C0970id.g3e);
                            C87412m.m108593f(findViewById7, "context.findViewById(R.id.loading_layout)");
                            this.f16420y = findViewById7;
                            FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(this);
                            RecyclerView recyclerView = this.f16418w;
                            if (recyclerView != null) {
                                recyclerView.setLayoutManager(finderLinearLayoutManager);
                                RecyclerView recyclerView2 = this.f16418w;
                                if (recyclerView2 != null) {
                                    recyclerView2.setAdapter(new C3536a(this, 0, 1, (C8480h) null));
                                    RecyclerView recyclerView3 = this.f16418w;
                                    if (recyclerView3 != null) {
                                        recyclerView3.setHasFixedSize(true);
                                        RecyclerView recyclerView4 = this.f16418w;
                                        if (recyclerView4 != null) {
                                            recyclerView4.setItemViewCacheSize(5);
                                            RecyclerView recyclerView5 = this.f16418w;
                                            if (recyclerView5 != null) {
                                                recyclerView5.setOnTouchListener(new C8649a(this));
                                                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f16417v;
                                                if (refreshLoadMoreLayout2 != null) {
                                                    refreshLoadMoreLayout2.setEnablePullDownHeader(false);
                                                    RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f16417v;
                                                    if (refreshLoadMoreLayout3 != null) {
                                                        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                                                        C87412m.m108593f(inflate, "getInflater(context).inf…t.load_more_footer, null)");
                                                        refreshLoadMoreLayout3.setLoadMoreFooter(inflate);
                                                        RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f16417v;
                                                        if (refreshLoadMoreLayout4 != null) {
                                                            refreshLoadMoreLayout4.setActionCallback(new C8652b(this));
                                                            String str4 = this.f16403e;
                                                            if (str4 != null) {
                                                                FTSSearchView fTSSearchView9 = this.f16402d;
                                                                if (fTSSearchView9 != null) {
                                                                    fTSSearchView9.getFtsEditText().mo70356l(str4, (List<FTSSearchView.C6996f>) null);
                                                                } else {
                                                                    C87412m.m108603p("searchView");
                                                                    throw null;
                                                                }
                                                            }
                                                            RecyclerView recyclerView6 = this.f16418w;
                                                            if (recyclerView6 != null) {
                                                                RecyclerView.C16613e adapter = recyclerView6.getAdapter();
                                                                if (adapter != null) {
                                                                    adapter.notifyDataSetChanged();
                                                                }
                                                                RecyclerView recyclerView7 = this.f16418w;
                                                                if (recyclerView7 != null) {
                                                                    int i = this.f16409n;
                                                                    C9556a aVar3 = new C9556a();
                                                                    aVar3.mo10233c(Integer.valueOf(i));
                                                                    RecyclerView recyclerView8 = recyclerView7;
                                                                    C117292a.m165358d(recyclerView8, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
                                                                    recyclerView7.mo17115r1(((Integer) aVar3.mo10231a(0)).intValue());
                                                                    C117292a.m165359e(recyclerView8, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
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

    public void onDestroy() {
        C46091u0 u0Var = this.f16421z;
        if (u0Var != null) {
            u0Var.mo71527a();
        }
        mo3871J7(true);
        C86709a0.m107524d().mo123470p(3820, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107524d().mo123470p(3820, this);
        int H7 = mo3869H7();
        int H72 = mo3869H7();
        if (i == 0 && i2 == 0) {
            C117407d.INSTANCE.idkeyStat(1265, 10, 1, false);
            C9320i4 i4Var = this.f16401A;
            C49572gk1 gk12 = i4Var != null ? i4Var.f29125v : null;
            C87412m.m108592e(gk12, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchResponse");
            LinkedList<C48868bk1> linkedList = gk12.f134088d;
            C87412m.m108593f(linkedList, "response.infoList");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C48868bk1 add : linkedList) {
                arrayList.add(Boolean.valueOf(this.f16407i.add(add)));
            }
            this.f16404f = gk12.f134089e;
            this.f16405g = gk12.f134090f;
            this.f16406h = gk12.f134092h;
            int H73 = mo3869H7();
            Log.m105924i("Finder.FinderContactSearchIncludeFollowUI", "onSceneEnd " + gk12.f134089e + ' ' + gk12.f134090f + ' ' + this.f16407i.size());
            H72 = H73;
        } else {
            C117407d.INSTANCE.idkeyStat(1265, 11, 1, false);
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16417v;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.mo82440F(0);
            if (H72 == 0) {
                View view = this.f16420y;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = this.f16419x;
                    if (textView != null) {
                        textView.setVisibility(0);
                        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f16417v;
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
                View view3 = this.f16420y;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView2 = this.f16419x;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f16417v;
                        if (refreshLoadMoreLayout3 != null) {
                            refreshLoadMoreLayout3.setVisibility(0);
                            CoordinatorLayout coordinatorLayout = this.f16416u;
                            if (coordinatorLayout != null) {
                                coordinatorLayout.setVisibility(0);
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
                RecyclerView recyclerView = this.f16418w;
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
                RecyclerView recyclerView2 = this.f16418w;
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
        if (mo3870I7()) {
            return true;
        }
        C117407d.INSTANCE.idkeyStat(1265, 9, 1, false);
        return false;
    }
}
