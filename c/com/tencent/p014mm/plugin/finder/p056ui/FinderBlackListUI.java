package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.TouchableLayout;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C46517e3;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C50275lk0;
import te3.C50542nh0;
import te3.C51989xl0;
import te3.C64707sc1;
import uo3.C78253a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBlackListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lob0/n;", "Lht1/p5;", "Lte3/sc1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlackListUI */
public final class FinderBlackListUI extends MMFinderUI implements C11385n, C8794p5<C64707sc1> {

    /* renamed from: y */
    public static final /* synthetic */ int f111751y = 0;

    /* renamed from: o */
    public ListView f111752o;

    /* renamed from: p */
    public TextView f111753p;

    /* renamed from: q */
    public final C41525a f111754q = new C41525a(this);

    /* renamed from: r */
    public final ArrayList<C50275lk0> f111755r = new ArrayList<>();

    /* renamed from: s */
    public boolean f111756s;

    /* renamed from: t */
    public C78253a f111757t;

    /* renamed from: u */
    public C89349b f111758u;

    /* renamed from: v */
    public View f111759v;

    /* renamed from: w */
    public View f111760w;

    /* renamed from: x */
    public Runnable f111761x = new C41496a(this);

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlackListUI$a */
    public static final class C41496a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderBlackListUI f111762d;

        public C41496a(FinderBlackListUI finderBlackListUI) {
            this.f111762d = finderBlackListUI;
        }

        public final void run() {
            View view = this.f111762d.f111759v;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$delayLoadingRunnable$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$delayLoadingRunnable$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlackListUI$b */
    public static final class C41497b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderBlackListUI f111763d;

        public C41497b(FinderBlackListUI finderBlackListUI) {
            this.f111763d = finderBlackListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f111763d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlackListUI$c */
    public static final class C41498c implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public final /* synthetic */ FinderBlackListUI f111764d;

        public C41498c(FinderBlackListUI finderBlackListUI) {
            this.f111764d = finderBlackListUI;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0 && absListView != null) {
                FinderBlackListUI finderBlackListUI = this.f111764d;
                if (!absListView.canScrollVertically(1)) {
                    if (finderBlackListUI.f111756s) {
                        C86709a0.m107524d().mo123460f(new C46517e3(finderBlackListUI.f111758u));
                    } else {
                        ListView listView = finderBlackListUI.f111752o;
                        if (listView == null) {
                            C87412m.m108603p("listView");
                            throw null;
                        } else if (listView.getFooterViewsCount() == 0) {
                            ListView listView2 = finderBlackListUI.f111752o;
                            if (listView2 != null) {
                                listView2.addFooterView(View.inflate(finderBlackListUI, C0966R.C0971layout.al_, (ViewGroup) null));
                            } else {
                                C87412m.m108603p("listView");
                                throw null;
                            }
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlackListUI$d */
    public static final class C41499d extends C87413o implements C32227p<View, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderBlackListUI f111765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41499d(FinderBlackListUI finderBlackListUI) {
            super(2);
            this.f111765d = finderBlackListUI;
        }

        public Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(view, "view");
            FinderBlackListUI finderBlackListUI = this.f111765d;
            C50275lk0 a = finderBlackListUI.f111754q.getItem(intValue);
            C78253a aVar = finderBlackListUI.f111757t;
            if (aVar != null) {
                aVar.mo108266a();
                C78253a aVar2 = finderBlackListUI.f111757t;
                if (aVar2 != null) {
                    aVar2.mo108273h(view, new C41542x(finderBlackListUI), new C41543y(a, finderBlackListUI), TouchableLayout.f24959d, TouchableLayout.f24960e);
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("popupMenu");
                throw null;
            }
            C87412m.m108603p("popupMenu");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlackListUI$e */
    public static final class C41500e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderBlackListUI f111766d;

        public C41500e(FinderBlackListUI finderBlackListUI) {
            this.f111766d = finderBlackListUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderBlackListUI finderBlackListUI = this.f111766d;
            View view2 = finderBlackListUI.f111759v;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ListView listView = finderBlackListUI.f111752o;
            if (listView != null) {
                listView.setVisibility(4);
                View view4 = finderBlackListUI.f111760w;
                if (view4 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C86709a0.m107524d().mo123460f(new C46517e3(finderBlackListUI.f111758u));
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("listView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlackListUI$f */
    public static final class C41501f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderBlackListUI f111767d;

        /* renamed from: e */
        public final /* synthetic */ C117747y f111768e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41501f(FinderBlackListUI finderBlackListUI, C117747y yVar) {
            super(0);
            this.f111767d = finderBlackListUI;
            this.f111768e = yVar;
        }

        public Object invoke() {
            FinderBlackListUI finderBlackListUI = this.f111767d;
            C47465a aVar = ((C46517e3) this.f111768e).f125316g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetBlackListResponse");
            LinkedList<C50275lk0> linkedList = ((C51989xl0) aVar).f144731d;
            int i = FinderBlackListUI.f111751y;
            finderBlackListUI.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("black contact ");
            sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
            Log.m105924i("Finder.FinderBlackListUI", sb.toString());
            if (linkedList != null) {
                finderBlackListUI.f111755r.addAll(linkedList);
                finderBlackListUI.mo64589N7();
                finderBlackListUI.f111754q.mo64610b(finderBlackListUI.f111755r);
                finderBlackListUI.f111754q.notifyDataSetChanged();
            } else {
                finderBlackListUI.mo64589N7();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: N5 */
    public final void mo64588N5() {
        View view = this.f111759v;
        if (view != null) {
            view.removeCallbacks(this.f111761x);
        }
        View view2 = this.f111759v;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "dismissLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "dismissLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: N7 */
    public final void mo64589N7() {
        mo64588N5();
        View view = this.f111760w;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f111755r.isEmpty()) {
            TextView textView = this.f111753p;
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.f111753p;
                if (textView2 != null) {
                    textView2.setText(getString(C0966R.string.d28));
                } else {
                    C87412m.m108603p("emptyTip");
                    throw null;
                }
            } else {
                C87412m.m108603p("emptyTip");
                throw null;
            }
        } else {
            ListView listView = this.f111752o;
            if (listView != null) {
                listView.setVisibility(0);
                TextView textView3 = this.f111753p;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                } else {
                    C87412m.m108603p("emptyTip");
                    throw null;
                }
            } else {
                C87412m.m108603p("listView");
                throw null;
            }
        }
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C64707sc1 sc12 = (C64707sc1) obj;
        C87412m.m108594g(sc12, "req");
        C87412m.m108594g(nh02, "ret");
        C61926c.m72668M(new C41541w(nh02, this, sc12));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_0;
    }

    public void initView() {
        setMMTitle(getString(C0966R.string.f360720ee2));
        View findViewById = findViewById(C0966R.C0970id.bpb);
        C87412m.m108593f(findViewById, "findViewById<ListView>(c…se.api.R.id.contact_list)");
        this.f111752o = (ListView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.cj7);
        C87412m.m108593f(findViewById2, "findViewById<TextView>(R.id.empty_tip)");
        this.f111753p = (TextView) findViewById2;
        setBackBtn(new C41497b(this));
        this.f111757t = new C78253a(this);
        ListView listView = this.f111752o;
        if (listView != null) {
            listView.setAdapter(this.f111754q);
            ListView listView2 = this.f111752o;
            if (listView2 != null) {
                listView2.setOnScrollListener(new C41498c(this));
                this.f111754q.f111822f = new C41499d(this);
                View findViewById3 = findViewById(C0966R.C0970id.kne);
                this.f111759v = findViewById3;
                if (findViewById3 != null) {
                    findViewById3.postDelayed(this.f111761x, 400);
                }
                View findViewById4 = findViewById(C0966R.C0970id.knl);
                this.f111760w = findViewById4;
                if (findViewById4 != null) {
                    findViewById4.setOnClickListener(new C41500e(this));
                    return;
                }
                return;
            }
            C87412m.m108603p("listView");
            throw null;
        }
        C87412m.m108603p("listView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(3717, this);
        initView();
        C86709a0.m107524d().mo123460f(new C46517e3(this.f111758u));
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3717, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        View view;
        Log.m105924i("Finder.FinderBlackListUI", "errType " + i + ", errCode " + i2 + ", errMsg " + str);
        boolean z = false;
        if (i == 0 && i2 == 0) {
            C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetBlackList");
            C46517e3 e3Var = (C46517e3) yVar;
            C47465a aVar = e3Var.f125316g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetBlackListResponse");
            if (((C51989xl0) aVar).f144732e != 0) {
                z = true;
            }
            this.f111756s = z;
            C47465a aVar2 = e3Var.f125316g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetBlackListResponse");
            this.f111758u = ((C51989xl0) aVar2).f144733f;
            C61926c.m72668M(new C41501f(this, yVar));
            return;
        }
        mo64588N5();
        if (this.f111755r.isEmpty() && (view = this.f111760w) != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
