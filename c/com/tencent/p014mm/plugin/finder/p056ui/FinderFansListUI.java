package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import bd1.C54446b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.search.FinderFansSearchUI;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.TouchableLayout;
import di3.C86312j;
import er1.C58684b;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C8703w0;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Pattern;
import je1.C46520g3;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import lp3.C88643g;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C50275lk0;
import te3.C50542nh0;
import te3.C64707sc1;
import uo3.C78253a;
import up1.C37521f;
import vp1.C14925b;
import zc1.C66783a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderFansListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lob0/n;", "Lht1/p5;", "Lte3/sc1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI */
public final class FinderFansListUI extends MMFinderUI implements C11385n, C8794p5<C64707sc1> {

    /* renamed from: z */
    public static final /* synthetic */ int f111789z = 0;

    /* renamed from: o */
    public final String f111790o = "Finder.FinderFansListUI";

    /* renamed from: p */
    public ListView f111791p;

    /* renamed from: q */
    public TextView f111792q;

    /* renamed from: r */
    public final C41525a f111793r = new C41525a(this);

    /* renamed from: s */
    public final ArrayList<C50275lk0> f111794s = new ArrayList<>();

    /* renamed from: t */
    public boolean f111795t;

    /* renamed from: u */
    public C78253a f111796u;

    /* renamed from: v */
    public C89349b f111797v;

    /* renamed from: w */
    public final C14925b f111798w = new C14925b("fansList.fp");

    /* renamed from: x */
    public C4191v0 f111799x;

    /* renamed from: y */
    public final FinderFansListUI$addBlackListListener$1 f111800y = new FinderFansListUI$addBlackListListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI$a */
    public static final class C41511a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFansListUI f111801d;

        public C41511a(FinderFansListUI finderFansListUI) {
            this.f111801d = finderFansListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f111801d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI$b */
    public static final class C41512b implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFansListUI f111802d;

        public C41512b(FinderFansListUI finderFansListUI) {
            this.f111802d = finderFansListUI;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderFansListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderFansListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderFansListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0 && absListView != null) {
                FinderFansListUI finderFansListUI = this.f111802d;
                if (!absListView.canScrollVertically(1)) {
                    if (finderFansListUI.f111795t) {
                        C86709a0.m107524d().mo123460f(new C46520g3(finderFansListUI.f111797v, 0, 0));
                    } else {
                        ListView listView = finderFansListUI.f111791p;
                        if (listView == null) {
                            C87412m.m108603p("listView");
                            throw null;
                        } else if (listView.getFooterViewsCount() == 0) {
                            ListView listView2 = finderFansListUI.f111791p;
                            if (listView2 != null) {
                                listView2.addFooterView(View.inflate(finderFansListUI, C0966R.C0971layout.a_r, (ViewGroup) null));
                            } else {
                                C87412m.m108603p("listView");
                                throw null;
                            }
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderFansListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI$c */
    public static final class C41513c extends C87413o implements C32227p<View, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFansListUI f111803d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41513c(FinderFansListUI finderFansListUI) {
            super(2);
            this.f111803d = finderFansListUI;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g((View) obj, "view");
            if (!C58739j4.f168176a.mo83683L()) {
                FinderFansListUI finderFansListUI = this.f111803d;
                C50275lk0 a = finderFansListUI.f111793r.getItem(intValue);
                FinderFansListUI finderFansListUI2 = this.f111803d;
                finderFansListUI.f111799x = C41540v0.m44890a(a, finderFansListUI2, new C41534p0(finderFansListUI2));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI$d */
    public static final class C41514d extends C87413o implements C32227p<View, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFansListUI f111804d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41514d(FinderFansListUI finderFansListUI) {
            super(2);
            this.f111804d = finderFansListUI;
        }

        public Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(view, "view");
            if (!this.f111804d.f111793r.getItem(intValue).f137479g) {
                FinderFansListUI finderFansListUI = this.f111804d;
                C50275lk0 a = finderFansListUI.f111793r.getItem(intValue);
                C78253a aVar = finderFansListUI.f111796u;
                if (aVar != null) {
                    aVar.mo108266a();
                    C78253a aVar2 = finderFansListUI.f111796u;
                    if (aVar2 != null) {
                        aVar2.mo108273h(view, new C41536r0(finderFansListUI), new C41537s0(a, finderFansListUI), TouchableLayout.f24959d, TouchableLayout.f24960e);
                    } else {
                        C87412m.m108603p("popupMenu");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("popupMenu");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI$e */
    public static final class C41515e extends C87413o implements C32226l<Void, LinkedList<C50275lk0>> {

        /* renamed from: d */
        public final /* synthetic */ FinderFansListUI f111805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41515e(FinderFansListUI finderFansListUI) {
            super(1);
            this.f111805d = finderFansListUI;
        }

        public Object invoke(Object obj) {
            Void voidR = (Void) obj;
            return this.f111805d.f111798w.mo73082b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI$f */
    public static final class C41516f extends C87413o implements C32226l<LinkedList<C50275lk0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ FinderFansListUI f111806d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41516f(FinderFansListUI finderFansListUI) {
            super(1);
            this.f111806d = finderFansListUI;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            LinkedList linkedList = (LinkedList) obj;
            FinderFansListUI finderFansListUI = this.f111806d;
            C89349b bVar = finderFansListUI.f111797v;
            if (bVar != null) {
                return bVar;
            }
            if (linkedList != null) {
                if (finderFansListUI.f111794s.isEmpty()) {
                    finderFansListUI.f111794s.addAll(linkedList);
                    finderFansListUI.f111793r.mo64610b(finderFansListUI.f111794s);
                    finderFansListUI.f111793r.notifyDataSetChanged();
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI$g */
    public static final class C41517g extends C87413o implements C32226l<Void, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C117747y f111807d;

        /* renamed from: e */
        public final /* synthetic */ FinderFansListUI f111808e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41517g(C117747y yVar, FinderFansListUI finderFansListUI) {
            super(1);
            this.f111807d = yVar;
            this.f111808e = finderFansListUI;
        }

        public Object invoke(Object obj) {
            Void voidR = (Void) obj;
            LinkedList<C50275lk0> H = ((C46520g3) this.f111807d).mo71560H();
            if (H == null) {
                return null;
            }
            FinderFansListUI finderFansListUI = this.f111808e;
            finderFansListUI.f111798w.mo73081a();
            finderFansListUI.f111798w.mo73083c(H);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI$h */
    public static final class C41518h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFansListUI f111809d;

        /* renamed from: e */
        public final /* synthetic */ C117747y f111810e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41518h(FinderFansListUI finderFansListUI, C117747y yVar) {
            super(0);
            this.f111809d = finderFansListUI;
            this.f111810e = yVar;
        }

        public Object invoke() {
            FinderFansListUI finderFansListUI = this.f111809d;
            LinkedList<C50275lk0> H = ((C46520g3) this.f111810e).mo71560H();
            String str = finderFansListUI.f111790o;
            StringBuilder sb = new StringBuilder();
            sb.append("fans contact ");
            sb.append(H != null ? Integer.valueOf(H.size()) : null);
            Log.m105924i(str, sb.toString());
            if (H != null) {
                finderFansListUI.f111794s.addAll(H);
                finderFansListUI.f111793r.mo64610b(finderFansListUI.f111794s);
                finderFansListUI.f111793r.notifyDataSetChanged();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI$i */
    public static final class C41519i implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFansListUI f111811d;

        public C41519i(FinderFansListUI finderFansListUI) {
            this.f111811d = finderFansListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderFansListUI finderFansListUI = this.f111811d;
            Intent intent = new Intent();
            ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
            C87412m.m108594g(finderFansListUI, "context");
            C8703w0.f27929c = null;
            intent.setClass(finderFansListUI, FinderFansSearchUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(finderFansListUI, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderFansSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finderFansListUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(finderFansListUI, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderFansSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    /* renamed from: N7 */
    public final void mo64600N7() {
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        int i = c != null ? c.mo75251m2().f132484A : 0;
        Log.m105925i(this.f111790o, "update title %s", Integer.valueOf(i));
        setMMTitle(getString(C0966R.string.f360721ee3, new Object[]{Integer.valueOf(i)}));
        if (i == 0) {
            TextView textView = this.f111792q;
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.f111792q;
                if (textView2 != null) {
                    textView2.setText(getString(C0966R.string.d84));
                } else {
                    C87412m.m108603p("emptyTip");
                    throw null;
                }
            } else {
                C87412m.m108603p("emptyTip");
                throw null;
            }
        } else {
            TextView textView3 = this.f111792q;
            if (textView3 != null) {
                textView3.setVisibility(8);
                addIconOptionMenu(0, C0966R.raw.icons_outlined_search, new C41519i(this));
                return;
            }
            C87412m.m108603p("emptyTip");
            throw null;
        }
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C64707sc1 sc12 = (C64707sc1) obj;
        C87412m.m108594g(sc12, "req");
        C87412m.m108594g(nh02, "ret");
        String str = sc12.f185408h;
        if (str == null) {
            str = "";
        }
        C61926c.m72668M(new C41535q0(nh02.f138603e, this, str));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_0;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.bpb);
        C87412m.m108593f(findViewById, "findViewById<ListView>(c…se.api.R.id.contact_list)");
        this.f111791p = (ListView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.cj7);
        C87412m.m108593f(findViewById2, "findViewById<TextView>(R.id.empty_tip)");
        this.f111792q = (TextView) findViewById2;
        mo64600N7();
        setBackBtn(new C41511a(this));
        this.f111796u = new C78253a(this);
        ListView listView = this.f111791p;
        if (listView != null) {
            listView.setAdapter(this.f111793r);
            ListView listView2 = this.f111791p;
            if (listView2 != null) {
                listView2.setSelector(new ColorDrawable(0));
                ListView listView3 = this.f111791p;
                if (listView3 != null) {
                    listView3.setOnScrollListener(new C41512b(this));
                    C37521f.f99374d.getClass();
                    if (C37521f.f99376d2.mo60266n().intValue() > 0) {
                        this.f111793r.f111823g = new C41513c(this);
                    }
                    this.f111793r.f111822f = new C41514d(this);
                    return;
                }
                C87412m.m108603p("listView");
                throw null;
            }
            C87412m.m108603p("listView");
            throw null;
        }
        C87412m.m108603p("listView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(3531, this);
        initView();
        C61926c.m72665J(C61926c.m72701z(C88643g.m110546d(), new C41515e(this)), new C41516f(this));
        C86709a0.m107524d().mo123460f(new C46520g3(this.f111797v, 0, 0));
        this.f111800y.alive();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderFansListUI).mo86179qs(this, C76986a.Finder);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3531, this);
        this.f111800y.dead();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = this.f111790o;
        Log.m105924i(str2, "errType " + i + ", errCode " + i2 + ", errMsg " + str);
        if (i == 0 && i2 == 0) {
            C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetFansList");
            C46520g3 g3Var = (C46520g3) yVar;
            if (!C87412m.m108589b(this.f111797v, g3Var.mo71562W0())) {
                Log.m105924i(this.f111790o, "not my buf, ignore!");
                return;
            }
            this.f111795t = g3Var.mo71561I0();
            if (this.f111797v == null) {
                this.f111794s.clear();
                Pattern pattern = C61926c.f176038a;
                C61926c.m72701z(C88643g.m110546d(), new C41517g(yVar, this));
            }
            this.f111797v = g3Var.mo71563n();
            C61926c.m72668M(new C41518h(this, yVar));
        }
    }
}
