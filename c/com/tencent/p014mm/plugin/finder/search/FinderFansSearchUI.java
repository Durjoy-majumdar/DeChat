package com.tencent.p014mm.plugin.finder.search;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.p056ui.C41540v0;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C46088j;
import hp1.C46089k;
import hp1.C46090l;
import ht1.C60200t1;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import je1.C46507a3;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C88989a;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import pe3.C89349b;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C50275lk0;
import te3.C50542nh0;
import te3.C51554uj1;
import te3.C64707sc1;
import up1.C27696y;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderFansSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Lob0/n;", "Lht1/p5;", "Lte3/sc1;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "<init>", "()V", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.finder.search.FinderFansSearchUI */
public final class FinderFansSearchUI extends MMFinderUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l, C11385n, C8794p5<C64707sc1> {

    /* renamed from: A */
    public C46507a3 f111706A;

    /* renamed from: B */
    public C4191v0 f111707B;

    /* renamed from: C */
    public String f111708C = "";

    /* renamed from: D */
    public String f111709D = "";

    /* renamed from: o */
    public FTSSearchView f111710o;

    /* renamed from: p */
    public String f111711p = "";

    /* renamed from: q */
    public C89349b f111712q;

    /* renamed from: r */
    public int f111713r;

    /* renamed from: s */
    public ArrayList<C50275lk0> f111714s = new ArrayList<>();

    /* renamed from: t */
    public C41484b f111715t;

    /* renamed from: u */
    public View f111716u;

    /* renamed from: v */
    public CoordinatorLayout f111717v;

    /* renamed from: w */
    public RefreshLoadMoreLayout f111718w;

    /* renamed from: x */
    public RecyclerView f111719x;

    /* renamed from: y */
    public TextView f111720y;

    /* renamed from: z */
    public View f111721z;

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFansSearchUI$a */
    public final class C41483a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f111722A;

        /* renamed from: B */
        public final TextView f111723B;

        /* renamed from: C */
        public final RelativeLayout f111724C;

        /* renamed from: z */
        public final ImageView f111725z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41483a(FinderFansSearchUI finderFansSearchUI, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.a27);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.avatar_iv)");
            this.f111725z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.hg4);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.nickname_tv)");
            this.f111722A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.a84);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.before_split_tv)");
            this.f111723B = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.ctc);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.fans_main_layout)");
            this.f111724C = (RelativeLayout) findViewById4;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFansSearchUI$b */
    public final class C41484b extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderFansSearchUI$b$a */
        public static final class C41485a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ FinderFansSearchUI f111727d;

            /* renamed from: e */
            public final /* synthetic */ C50275lk0 f111728e;

            /* renamed from: com.tencent.mm.plugin.finder.search.FinderFansSearchUI$b$a$a */
            public static final class C41486a extends C87413o implements C32226l<String, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ FinderFansSearchUI f111729d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C41486a(FinderFansSearchUI finderFansSearchUI) {
                    super(1);
                    this.f111729d = finderFansSearchUI;
                }

                public Object invoke(Object obj) {
                    String str = (String) obj;
                    C4191v0 v0Var = this.f111729d.f111707B;
                    if (v0Var != null) {
                        v0Var.mo5072g();
                    }
                    C32228q<String, Context, C8794p5<C64707sc1>, C13598b0> qVar = C41540v0.f111850a;
                    FinderFansSearchUI finderFansSearchUI = this.f111729d;
                    ((C41540v0.C3878a) qVar).invoke(str, finderFansSearchUI, finderFansSearchUI);
                    return C13598b0.f38549a;
                }
            }

            public C41485a(FinderFansSearchUI finderFansSearchUI, C50275lk0 lk02) {
                this.f111727d = finderFansSearchUI;
                this.f111728e = lk02;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (!C58739j4.f168176a.mo83683L()) {
                    FinderFansSearchUI finderFansSearchUI = this.f111727d;
                    finderFansSearchUI.f111707B = C41540v0.m44890a(this.f111728e, finderFansSearchUI, new C41486a(finderFansSearchUI));
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C41484b() {
        }

        public int getItemCount() {
            return FinderFansSearchUI.this.f111714s.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            String str;
            String str2;
            int i2;
            boolean z;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(zVar, "holder");
            if (zVar instanceof C41483a) {
                C50275lk0 lk02 = FinderFansSearchUI.this.f111714s.get(i);
                C87412m.m108593f(lk02, "fansList[position]");
                C50275lk0 lk03 = lk02;
                FinderContact finderContact = lk03.f137476d;
                CharSequence charSequence = "";
                if (finderContact == null || (str = finderContact.headUrl) == null) {
                    str = charSequence;
                }
                String nullAsNil = Util.nullAsNil(str);
                if (lk03.f137480h == 0) {
                    ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85957c(new C62345f(nullAsNil, (C27696y) null, 2, (C8480h) null), ((C41483a) zVar).f111725z, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
                } else {
                    ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(nullAsNil, (C27696y) null, 2, (C8480h) null), ((C41483a) zVar).f111725z, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                }
                C41483a aVar = (C41483a) zVar;
                TextView textView = aVar.f111722A;
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                Context context = MMApplicationContext.getContext();
                FinderContact finderContact2 = lk03.f137476d;
                if (finderContact2 == null || (str2 = finderContact2.nickname) == null) {
                    str2 = charSequence;
                }
                CharSequence charSequence2 = charSequence;
                if (!Util.isNullOrNil(str2)) {
                    charSequence2 = Html.fromHtml("<font color=\"#06AD56\">" + str2 + "</font>");
                }
                textView.setText(hVar.Te0(context, charSequence2, aVar.f111722A.getTextSize()));
                ArrayList<C50275lk0> arrayList = FinderFansSearchUI.this.f111714s;
                ListIterator<C50275lk0> listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i2 = -1;
                        break;
                    }
                    if (listIterator.previous().f137477e == 1) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        i2 = listIterator.nextIndex();
                        break;
                    }
                }
                if (i2 != i || i == getItemCount() - 1) {
                    aVar.f111723B.setVisibility(8);
                } else {
                    aVar.f111723B.setVisibility(0);
                }
                if (lk03.f137479g) {
                    aVar.f111724C.setOnClickListener((View.OnClickListener) null);
                } else {
                    aVar.f111724C.setOnClickListener(new C41485a(FinderFansSearchUI.this, lk03));
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            AppCompatActivity context = FinderFansSearchUI.this.getContext();
            C87412m.m108591d(context);
            View inflate = context.getLayoutInflater().inflate(C0966R.C0971layout.a_q, viewGroup, false);
            FinderFansSearchUI finderFansSearchUI = FinderFansSearchUI.this;
            C87412m.m108593f(inflate, "contactLayout");
            return new C41483a(finderFansSearchUI, inflate);
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 75;
    }

    /* renamed from: N7 */
    public final int mo64574N7() {
        RecyclerView recyclerView = this.f111719x;
        if (recyclerView != null) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            return adapter != null ? adapter.getItemCount() : this.f111714s.size();
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: O7 */
    public final boolean mo64575O7() {
        String str;
        FTSSearchView fTSSearchView = this.f111710o;
        if (fTSSearchView != null) {
            String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
            if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
                str = "";
            }
            String str2 = str;
            if (Util.isNullOrNil(str2)) {
                return true;
            }
            this.f111711p = str2;
            this.f111713r = 0;
            this.f111712q = null;
            this.f111714s.clear();
            String uuid = UUID.randomUUID().toString();
            C87412m.m108593f(uuid, "randomUUID().toString()");
            this.f111708C = uuid;
            C46507a3 a3Var = this.f111706A;
            if (a3Var != null) {
                C86709a0.m107524d().mo123458d(a3Var);
            }
            this.f111706A = new C46507a3(str2, this.f111712q, (C49712hj1) null, 4, (C8480h) null);
            C86709a0.m107524d().mo123460f(this.f111706A);
            C86709a0.m107524d().mo123455a(6665, this);
            View view = this.f111721z;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f111720y;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f111718w;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.setVisibility(8);
                        RecyclerView recyclerView = this.f111719x;
                        if (recyclerView != null) {
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(0);
                            RecyclerView recyclerView2 = recyclerView;
                            C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
                            recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
                            View view3 = this.f111716u;
                            if (view3 != null) {
                                view3.setBackground(getContext().getResources().getDrawable(C0966R.color.f2927a));
                                return false;
                            }
                            C87412m.m108603p("rootView");
                            throw null;
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
        C87412m.m108603p("searchView");
        throw null;
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        if (Util.isNullOrNil(str3)) {
            View view = this.f111721z;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f111720y;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f111718w;
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
            mo64575O7();
        }
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C64707sc1 sc12 = (C64707sc1) obj;
        C87412m.m108594g(sc12, "req");
        C87412m.m108594g(nh02, "ret");
        C61926c.m72668M(new C46090l(nh02, this, sc12));
    }

    public boolean enableActivityAnimation() {
        return false;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_s;
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
        FTSSearchView fTSSearchView = this.f111710o;
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
        this.f111710o = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        FTSSearchView fTSSearchView2 = this.f111710o;
        if (fTSSearchView2 != null) {
            fTSSearchView2.getFtsEditText().setHint(getString(C0966R.string.a2r));
            FTSSearchView fTSSearchView3 = this.f111710o;
            if (fTSSearchView3 != null) {
                fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
                FTSSearchView fTSSearchView4 = this.f111710o;
                if (fTSSearchView4 != null) {
                    fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
                    FTSSearchView fTSSearchView5 = this.f111710o;
                    if (fTSSearchView5 != null) {
                        fTSSearchView5.getFtsEditText().mo70338f();
                        ActionBar supportActionBar = getSupportActionBar();
                        C87412m.m108591d(supportActionBar);
                        FTSSearchView fTSSearchView6 = this.f111710o;
                        if (fTSSearchView6 != null) {
                            supportActionBar.mo91114y(fTSSearchView6);
                            this.f111711p = "";
                            FTSSearchView fTSSearchView7 = this.f111710o;
                            if (fTSSearchView7 != null) {
                                fTSSearchView7.getFtsEditText().mo70355k();
                                FTSSearchView fTSSearchView8 = this.f111710o;
                                if (fTSSearchView8 != null) {
                                    fTSSearchView8.getFtsEditText().mo70361q();
                                    String uuid = UUID.randomUUID().toString();
                                    C87412m.m108593f(uuid, "randomUUID().toString()");
                                    this.f111709D = uuid;
                                    this.f111715t = new C41484b();
                                    View findViewById = findViewById(C0966R.C0970id.iwc);
                                    C87412m.m108593f(findViewById, "findViewById(R.id.root)");
                                    this.f111716u = findViewById;
                                    View findViewById2 = findViewById(C0966R.C0970id.gkz);
                                    C87412m.m108593f(findViewById2, "findViewById(R.id.main_rv)");
                                    this.f111717v = (CoordinatorLayout) findViewById2;
                                    View findViewById3 = findViewById(C0966R.C0970id.ivb);
                                    C87412m.m108593f(findViewById3, "findViewById(R.id.rl_layout)");
                                    RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById3;
                                    this.f111718w = refreshLoadMoreLayout;
                                    this.f111719x = refreshLoadMoreLayout.getRecyclerView();
                                    View findViewById4 = findViewById(C0966R.C0970id.hgr);
                                    C87412m.m108593f(findViewById4, "findViewById(R.id.no_result_tv)");
                                    this.f111720y = (TextView) findViewById4;
                                    View findViewById5 = findViewById(C0966R.C0970id.g3e);
                                    C87412m.m108593f(findViewById5, "findViewById(R.id.loading_layout)");
                                    this.f111721z = findViewById5;
                                    FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(this);
                                    RecyclerView recyclerView = this.f111719x;
                                    if (recyclerView != null) {
                                        recyclerView.setLayoutManager(finderLinearLayoutManager);
                                        RecyclerView recyclerView2 = this.f111719x;
                                        if (recyclerView2 != null) {
                                            C41484b bVar = this.f111715t;
                                            if (bVar != null) {
                                                recyclerView2.setAdapter(bVar);
                                                RecyclerView recyclerView3 = this.f111719x;
                                                if (recyclerView3 != null) {
                                                    recyclerView3.setHasFixedSize(true);
                                                    RecyclerView recyclerView4 = this.f111719x;
                                                    if (recyclerView4 != null) {
                                                        recyclerView4.setItemViewCacheSize(5);
                                                        RecyclerView recyclerView5 = this.f111719x;
                                                        if (recyclerView5 != null) {
                                                            recyclerView5.setOnTouchListener(new C46088j(this));
                                                            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f111718w;
                                                            if (refreshLoadMoreLayout2 != null) {
                                                                refreshLoadMoreLayout2.setEnablePullDownHeader(false);
                                                                RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f111718w;
                                                                if (refreshLoadMoreLayout3 != null) {
                                                                    View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                                                                    C87412m.m108593f(inflate, "getInflater(context).inf…t.load_more_footer, null)");
                                                                    refreshLoadMoreLayout3.setLoadMoreFooter(inflate);
                                                                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f111718w;
                                                                    if (refreshLoadMoreLayout4 != null) {
                                                                        refreshLoadMoreLayout4.setActionCallback(new C46089k(this));
                                                                        String str = this.f111711p;
                                                                        if (str != null) {
                                                                            FTSSearchView fTSSearchView9 = this.f111710o;
                                                                            if (fTSSearchView9 != null) {
                                                                                fTSSearchView9.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
                                                                            } else {
                                                                                C87412m.m108603p("searchView");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        RecyclerView recyclerView6 = this.f111719x;
                                                                        if (recyclerView6 != null) {
                                                                            RecyclerView.C16613e adapter = recyclerView6.getAdapter();
                                                                            if (adapter != null) {
                                                                                adapter.notifyDataSetChanged();
                                                                            }
                                                                            RecyclerView recyclerView7 = this.f111719x;
                                                                            if (recyclerView7 != null) {
                                                                                C9556a aVar = new C9556a();
                                                                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                                                                aVar.mo10233c(0);
                                                                                RecyclerView recyclerView8 = recyclerView7;
                                                                                C117292a.m165358d(recyclerView8, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
                                                                                recyclerView7.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                                                                                C117292a.m165359e(recyclerView8, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
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
                                            C87412m.m108603p("adapter");
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

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        setTheme(C0966R.style.f8644pq);
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(6665, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107524d().mo123470p(6665, this);
        int N7 = mo64574N7();
        if (i == 0 && i2 == 0) {
            C46507a3 a3Var = this.f111706A;
            C51554uj1 uj12 = a3Var != null ? a3Var.f125293j : null;
            C87412m.m108592e(uj12, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchFansResponse");
            LinkedList<C50275lk0> linkedList = uj12.f142874f;
            C87412m.m108593f(linkedList, "response.fansContactList");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C50275lk0 add : linkedList) {
                arrayList.add(Boolean.valueOf(this.f111714s.add(add)));
            }
            this.f111713r = uj12.f142872d;
            this.f111712q = uj12.f142873e;
            int N72 = mo64574N7();
            Log.m105924i("Finder.FinderFansSearchUI", "onSceneEnd " + uj12.f142872d + ' ' + this.f111714s.size());
            String str2 = this.f111711p;
            int i3 = uj12.f142874f.isEmpty() ? 1 : 2;
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            String str3 = this.f111709D;
            String str4 = this.f111708C;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            y0Var.ay0(1, str3, str4, str2, 2, 1, 2, i3, 0, f != null ? f.mo12861q3() : null);
            N7 = N72;
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f111718w;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.mo82440F(0);
            if (N7 == 0) {
                View view = this.f111721z;
                if (view != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = this.f111720y;
                    if (textView != null) {
                        textView.setVisibility(0);
                        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f111718w;
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
                View view3 = this.f111721z;
                if (view3 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView2 = this.f111720y;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f111718w;
                        if (refreshLoadMoreLayout3 != null) {
                            refreshLoadMoreLayout3.setVisibility(0);
                            CoordinatorLayout coordinatorLayout = this.f111717v;
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
            RecyclerView recyclerView = this.f111719x;
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
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: y */
    public boolean mo3009y() {
        hideVKB();
        return mo64575O7();
    }
}
