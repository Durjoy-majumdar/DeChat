package com.tencent.p014mm.plugin.finder.search;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.TouchableLayout;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7428c1;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7642k;
import f40.C86709a0;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import hp1.C46091u0;
import hp1.C60055x0;
import hp1.C8656d;
import hp1.C8658e;
import hp1.C8660f;
import hp1.C8661f0;
import hp1.C8664g;
import hp1.C8666h;
import hp1.C8668i;
import hp1.C8703w0;
import ht1.C60182l1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import je1.C9320i4;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C11184p0;
import nj3.C76912y0;
import o31.C11345b;
import o31.C76986a;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C89349b;
import rs1.C13442s8;
import rs1.C13466ta;
import rx3.C13604l;
import sx3.C22415w0;
import sx3.C36907w;
import sx3.C90364q0;
import te3.C48868bk1;
import te3.C49572gk1;
import te3.C49712hj1;
import te3.C50972qk0;
import uo3.C78253a;
import up1.C14272d;
import up1.C14364t0;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderContactSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Lob0/n;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "onContactItemLongClick", "<init>", "()V", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchUI */
public final class FinderContactSearchUI extends MMFinderUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l, C11385n {

    /* renamed from: A */
    public boolean f16427A;

    /* renamed from: B */
    public HashMap<String, C8668i> f16428B = new HashMap<>();

    /* renamed from: C */
    public RefreshLoadMoreLayout f16429C;

    /* renamed from: D */
    public RecyclerView f16430D;

    /* renamed from: E */
    public TextView f16431E;

    /* renamed from: F */
    public View f16432F;

    /* renamed from: G */
    public int f16433G = 1;

    /* renamed from: H */
    public C46091u0 f16434H;

    /* renamed from: I */
    public C60055x0 f16435I;

    /* renamed from: J */
    public final C58553c f16436J = new C58553c((String) null, 1, (C8480h) null);

    /* renamed from: K */
    public C9320i4 f16437K;

    /* renamed from: L */
    public final FinderContactSearchUI$contactChangelistener$1 f16438L = new FinderContactSearchUI$contactChangelistener$1(this, C40008f.f107254d);

    /* renamed from: M */
    public final C3540c f16439M = new C3540c();

    /* renamed from: o */
    public final String f16440o = "Finder.FinderContactSearchUI";

    /* renamed from: p */
    public FTSSearchView f16441p;

    /* renamed from: q */
    public String f16442q = "";

    /* renamed from: r */
    public int f16443r;

    /* renamed from: s */
    public int f16444s;

    /* renamed from: t */
    public C89349b f16445t;

    /* renamed from: u */
    public ArrayList<C48868bk1> f16446u = new ArrayList<>();

    /* renamed from: v */
    public int f16447v;

    /* renamed from: w */
    public String f16448w = "";

    /* renamed from: x */
    public int f16449x;

    /* renamed from: y */
    public boolean f16450y = true;

    /* renamed from: z */
    public boolean f16451z;

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchUI$a */
    public final class C3538a extends RecyclerView.C16613e<RecyclerView.C16631z> implements C60182l1 {

        /* renamed from: d */
        public final boolean f16452d;

        public C3538a(boolean z) {
            this.f16452d = z;
        }

        /* renamed from: F4 */
        public static void m3646F4(C3538a aVar, RecyclerView.C16631z zVar, int i, boolean z, int i2, Object obj) {
            Class cls = C61212e.class;
            C48868bk1 bk12 = FinderContactSearchUI.this.f16446u.get(i);
            C87412m.m108593f(bk12, "contactList[position]");
            C48868bk1 bk13 = bk12;
            FinderContactSearchUI finderContactSearchUI = FinderContactSearchUI.this;
            FinderContact finderContact = bk13.f131162d;
            String str = null;
            FinderContactSearchUI.m3639N7(finderContactSearchUI, finderContact != null ? finderContact.username : null, i, 0, 4, (Object) null);
            C87412m.m108592e(zVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactItemHolder");
            C8661f0 f0Var = (C8661f0) zVar;
            FinderContactSearchUI finderContactSearchUI2 = FinderContactSearchUI.this;
            f0Var.mo9518y(bk13, new C3579b(finderContactSearchUI2, i), new C3580c(finderContactSearchUI2), i != 0);
            View view = zVar.f44854d;
            View findViewById = view.findViewById(C0966R.C0970id.dv9);
            C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_onlive_widget)");
            FinderLiveOnliveWidget finderLiveOnliveWidget = (FinderLiveOnliveWidget) findViewById;
            ((C61212e) C86312j.m106911c(cls)).o30(finderLiveOnliveWidget, "living_label");
            C8479f0 f0Var2 = new C8479f0();
            T tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInfo");
            T t = (C48868bk1) tag;
            f0Var2.f27484d = t;
            FinderContact finderContact2 = t.f131162d;
            if (finderContact2 != null && finderContact2.liveStatus == 1) {
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(finderLiveOnliveWidget, 40, 26236);
                C61212e eVar = (C61212e) C86312j.m106911c(cls);
                C13604l[] lVarArr = new C13604l[5];
                lVarArr[0] = new C13604l("feed_id", "0");
                lVarArr[1] = new C13604l("live_id", "");
                lVarArr[2] = new C13604l("comment_scene", "temp_3");
                FinderContact finderContact3 = ((C48868bk1) f0Var2.f27484d).f131162d;
                if (finderContact3 != null) {
                    str = finderContact3.username;
                }
                lVarArr[3] = new C13604l("finder_username", str);
                lVarArr[4] = new C13604l("session_buffer", " ");
                eVar.mo86149PM(finderLiveOnliveWidget, C90364q0.m113147f(lVarArr));
                ((C61212e) C86312j.m106911c(cls)).E60(finderLiveOnliveWidget, new C3581d(f0Var2));
            }
        }

        public ArrayList<C48868bk1> getData() {
            return FinderContactSearchUI.this.f16446u;
        }

        public int getItemCount() {
            return FinderContactSearchUI.this.f16446u.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List<Object> list) {
            C87412m.m108594g(zVar, "holder");
            C87412m.m108594g(list, "payloads");
            m3646F4(this, zVar, i, false, 4, (Object) null);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            AppCompatActivity context = FinderContactSearchUI.this.getContext();
            C87412m.m108591d(context);
            View inflate = context.getLayoutInflater().inflate(this.f16452d ? C0966R.C0971layout.a9w : C0966R.C0971layout.a9v, viewGroup, false);
            C87412m.m108593f(inflate, "contactLayout");
            return new C8661f0(inflate, true, !this.f16452d);
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            m3646F4(this, zVar, i, false, 4, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchUI$b */
    public final class C3539b extends C58555d {
        public C3539b() {
        }

        /* renamed from: B1 */
        public void mo2331B1(C7637b bVar) {
            C7642k kVar;
            int i;
            int i2;
            C87412m.m108594g(bVar, "event");
            if ((bVar instanceof C7642k) && (i = kVar.f25953d) <= (i2 = (kVar = (C7642k) bVar).f25955f)) {
                while (true) {
                    FinderContactSearchUI finderContactSearchUI = FinderContactSearchUI.this;
                    FinderContact finderContact = finderContactSearchUI.f16446u.get(i).f131162d;
                    FinderContactSearchUI.m3639N7(finderContactSearchUI, finderContact != null ? finderContact.username : null, i, 0, 4, (Object) null);
                    if (i != i2) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: y1 */
        public boolean mo2424y1() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchUI$c */
    public static final class C3540c extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderContactSearchUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderContactSearchUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "temp_3", C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchUI$d */
    public static final class C3541d implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f16455d;

        public C3541d(C8478d0 d0Var) {
            this.f16455d = d0Var;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            if (contextMenu != null) {
                contextMenu.add(0, this.f16455d.f27483d, 0, C0966R.string.ecc);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchUI$e */
    public static final class C3542e implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ int f16456d;

        /* renamed from: e */
        public final /* synthetic */ FinderContactSearchUI f16457e;

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchUI$e$a */
        public static final class C3543a implements C14364t0.C14366b {

            /* renamed from: a */
            public final /* synthetic */ FinderContactSearchUI f16458a;

            /* renamed from: b */
            public final /* synthetic */ int f16459b;

            public C3543a(FinderContactSearchUI finderContactSearchUI, int i) {
                this.f16458a = finderContactSearchUI;
                this.f16459b = i;
            }

            /* renamed from: a */
            public void mo3725a(boolean z) {
                if (z) {
                    this.f16458a.f16446u.remove(this.f16459b);
                    RecyclerView recyclerView = this.f16458a.f16430D;
                    if (recyclerView != null) {
                        RecyclerView.C16613e adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            adapter.notifyItemRemoved(this.f16459b);
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
                C76912y0.makeText((Context) this.f16458a.getContext(), (CharSequence) StateEvent.ProcessResult.FAILED, 0).show();
            }
        }

        public C3542e(int i, FinderContactSearchUI finderContactSearchUI) {
            this.f16456d = i;
            this.f16457e = finderContactSearchUI;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C48868bk1 bk12;
            FinderContact finderContact;
            int i2 = this.f16456d;
            if (i2 >= 0 && i2 < this.f16457e.f16446u.size() && (bk12 = this.f16457e.f16446u.get(this.f16456d)) != null && (finderContact = bk12.f131162d) != null) {
                new C14272d().mo13651m(finderContact, new C3543a(this.f16457e, this.f16456d));
            }
        }
    }

    /* renamed from: N7 */
    public static void m3639N7(FinderContactSearchUI finderContactSearchUI, String str, int i, int i2, int i3, Object obj) {
        FinderContactSearchUI finderContactSearchUI2 = finderContactSearchUI;
        String str2 = str;
        int i4 = i;
        int i5 = (i3 & 4) != 0 ? 1 : i2;
        Class cls = C58417y0.class;
        int i6 = finderContactSearchUI2.f16433G;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0 y0Var = (C58417y0) c;
        String str3 = finderContactSearchUI2.f16448w;
        String str4 = finderContactSearchUI2.f16442q;
        String str5 = ((C58417y0) C86312j.m106911c(cls)).f167351e;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(finderContactSearchUI2);
        int i7 = i5;
        String str6 = str2;
        C58417y0.cy0(y0Var, str3, str4, 1, 1, str, i, 2, 1, str5, 1, i6, f != null ? f.mo12861q3() : null, (String) null, 0, 12288, (Object) null);
        if (str6 != null) {
            String str7 = str6;
            FinderContactSearchUI finderContactSearchUI3 = finderContactSearchUI;
            if (!finderContactSearchUI3.f16428B.containsKey(str7)) {
                String str8 = finderContactSearchUI3.f16440o;
                StringBuilder sb = new StringBuilder();
                sb.append("addExposeItem ");
                sb.append(str7);
                sb.append(' ');
                int i8 = i;
                sb.append(i8);
                sb.append(' ');
                int i9 = i7;
                sb.append(i9);
                Log.m105918d(str8, sb.toString());
                C8668i iVar = new C8668i();
                iVar.f27858b = str7;
                iVar.f27857a = i8;
                iVar.f27859c = i9;
                iVar.f27860d = System.currentTimeMillis();
                finderContactSearchUI3.f16428B.put(str7, iVar);
                if (finderContactSearchUI3.f16428B.size() % 30 == 0 && !Util.isNullOrNil(finderContactSearchUI3.f16448w) && (!finderContactSearchUI3.f16428B.isEmpty())) {
                    C7428c1.f25609a.mo8561a(finderContactSearchUI3.f16448w, finderContactSearchUI3.f16442q, 0, finderContactSearchUI3.f16428B, 2);
                }
            }
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

    /* renamed from: I7 */
    public int mo2194I7() {
        return 6;
    }

    /* renamed from: O7 */
    public final void mo3874O7(String str) {
        this.f16442q = str;
        this.f16443r = 0;
        this.f16444s = 0;
        this.f16445t = null;
        this.f16446u.clear();
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        this.f16448w = uuid;
        if (this.f16437K != null) {
            C86709a0.m107524d().mo123458d(this.f16437K);
        }
        C9320i4 i4Var = r1;
        C9320i4 i4Var2 = new C9320i4(str, this.f16443r, this.f16448w, this.f16445t, this.f16449x, (C49712hj1) null, (C89349b) null, (C89349b) null, (C89349b) null, false, 0, 2016, (C8480h) null);
        this.f16437K = i4Var;
        C86709a0.m107524d().mo123460f(this.f16437K);
        C86709a0.m107524d().mo123455a(3820, this);
        View view = this.f16432F;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c((Object) null);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = this.f16431E;
            if (textView != null) {
                textView.setVisibility(8);
                RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16429C;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.setVisibility(8);
                    RecyclerView recyclerView = this.f16430D;
                    if (recyclerView != null) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c((Object) null);
                        C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
                        recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
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
            View view = this.f16432F;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f16431E;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16429C;
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
        }
        C46091u0 u0Var = this.f16434H;
        if (u0Var != null) {
            u0Var.mo71528b(str3);
        }
    }

    public int getLayoutId() {
        return this.f16427A ? C0966R.C0971layout.a9y : C0966R.C0971layout.a9x;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C13466ta.class);
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
        FTSSearchView fTSSearchView = this.f16441p;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70355k();
            showVKB();
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public final void onContactItemLongClick(View view) {
        C87412m.m108594g(view, "view");
        if (this.f16449x == 8) {
            C78253a aVar = new C78253a(getContext());
            RecyclerView recyclerView = this.f16430D;
            if (recyclerView != null) {
                int N0 = recyclerView.mo17029N0(view);
                C8478d0 d0Var = new C8478d0();
                d0Var.f27483d = 1;
                C3541d dVar = new C3541d(d0Var);
                C3542e eVar = new C3542e(N0, this);
                int i = TouchableLayout.f24959d;
                aVar.mo108272g(view, N0, 0, dVar, eVar, TouchableLayout.f24959d, TouchableLayout.f24960e);
                aVar.mo70679m();
                return;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("is_force_night_mode", false);
        this.f16427A = booleanExtra;
        if (booleanExtra) {
            getController().mo177081j0(getContext().getResources().getColor(C0966R.color.f2947a4));
            setBackGroundColorResource(C0966R.color.f2947a4);
        }
        FTSSearchView fTSSearchView = new FTSSearchView((Context) this, false, this.f16427A);
        this.f16441p = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        FTSSearchView fTSSearchView2 = this.f16441p;
        if (fTSSearchView2 != null) {
            fTSSearchView2.getFtsEditText().setHint(getString(C0966R.string.a2p));
            FTSSearchView fTSSearchView3 = this.f16441p;
            if (fTSSearchView3 != null) {
                fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
                FTSSearchView fTSSearchView4 = this.f16441p;
                if (fTSSearchView4 != null) {
                    fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
                    FTSSearchView fTSSearchView5 = this.f16441p;
                    if (fTSSearchView5 != null) {
                        fTSSearchView5.getFtsEditText().mo70338f();
                        ActionBar supportActionBar = getSupportActionBar();
                        C87412m.m108591d(supportActionBar);
                        FTSSearchView fTSSearchView6 = this.f16441p;
                        if (fTSSearchView6 != null) {
                            supportActionBar.mo91114y(fTSSearchView6);
                            this.f16449x = getIntent().getIntExtra("request_type", 2);
                            this.f16451z = getIntent().getBooleanExtra("from_at_contact", false);
                            this.f16450y = getIntent().getBooleanExtra("need_history", true);
                            C50972qk0 qk02 = C8703w0.f27929c;
                            String str = "";
                            if (qk02 != null) {
                                C8703w0.f27929c = null;
                                String str2 = qk02.f140366j;
                                if (str2 == null) {
                                    str2 = str;
                                }
                                this.f16448w = str2;
                                String str3 = qk02.f140360d;
                                if (str3 != null) {
                                    str = str3;
                                }
                                this.f16442q = str;
                                this.f16443r = qk02.f140361e;
                                this.f16444s = qk02.f140362f;
                                this.f16445t = qk02.f140364h;
                                this.f16447v = qk02.f140365i;
                                LinkedList<C48868bk1> linkedList = qk02.f140367n;
                                C87412m.m108593f(linkedList, "finderFeedObj.contactList");
                                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                                for (C48868bk1 add : linkedList) {
                                    arrayList.add(Boolean.valueOf(this.f16446u.add(add)));
                                }
                            } else {
                                String uuid = UUID.randomUUID().toString();
                                C87412m.m108593f(uuid, "randomUUID().toString()");
                                this.f16448w = uuid;
                                this.f16442q = str;
                                FTSSearchView fTSSearchView7 = this.f16441p;
                                if (fTSSearchView7 != null) {
                                    fTSSearchView7.getFtsEditText().mo70355k();
                                    FTSSearchView fTSSearchView8 = this.f16441p;
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
                            if (this.f16450y) {
                                this.f16434H = new C46091u0(this, false, this.f16427A, new C8660f(this), new C8664g());
                            } else {
                                View findViewById = findViewById(C0966R.C0970id.ewk);
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            if (this.f16451z) {
                                setResult(0, getIntent());
                            }
                            Log.m105925i(this.f16440o, "fromAtContact:%s", Boolean.valueOf(this.f16451z));
                            FTSSearchView fTSSearchView9 = this.f16441p;
                            if (fTSSearchView9 != null) {
                                FTSEditTextView ftsEditText = fTSSearchView9.getFtsEditText();
                                C87412m.m108593f(ftsEditText, "searchView.ftsEditText");
                                this.f16435I = new C60055x0(this, ftsEditText, 0, 2, false, this.f16427A, new C8666h(this));
                                View findViewById2 = getContext().findViewById(C0966R.C0970id.ivb);
                                C87412m.m108593f(findViewById2, "context.findViewById(R.id.rl_layout)");
                                RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById2;
                                this.f16429C = refreshLoadMoreLayout;
                                this.f16430D = refreshLoadMoreLayout.getRecyclerView();
                                View findViewById3 = getContext().findViewById(C0966R.C0970id.hgr);
                                C87412m.m108593f(findViewById3, "context.findViewById(R.id.no_result_tv)");
                                this.f16431E = (TextView) findViewById3;
                                View findViewById4 = getContext().findViewById(C0966R.C0970id.g3e);
                                C87412m.m108593f(findViewById4, "context.findViewById(R.id.loading_layout)");
                                this.f16432F = findViewById4;
                                if (this.f16427A) {
                                    View findViewById5 = getContext().findViewById(C0966R.C0970id.gkz);
                                    C87412m.m108592e(findViewById5, "null cannot be cast to non-null type android.view.View");
                                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f16429C;
                                    if (refreshLoadMoreLayout2 != null) {
                                        refreshLoadMoreLayout2.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2947a4));
                                        findViewById5.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2947a4));
                                    } else {
                                        C87412m.m108603p("rlLayout");
                                        throw null;
                                    }
                                }
                                FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(this);
                                RecyclerView recyclerView = this.f16430D;
                                if (recyclerView != null) {
                                    recyclerView.setLayoutManager(finderLinearLayoutManager);
                                    RecyclerView recyclerView2 = this.f16430D;
                                    if (recyclerView2 != null) {
                                        recyclerView2.setAdapter(new C3538a(this.f16427A));
                                        RecyclerView recyclerView3 = this.f16430D;
                                        if (recyclerView3 != null) {
                                            recyclerView3.setHasFixedSize(true);
                                            RecyclerView recyclerView4 = this.f16430D;
                                            if (recyclerView4 != null) {
                                                recyclerView4.setItemViewCacheSize(5);
                                                RecyclerView recyclerView5 = this.f16430D;
                                                if (recyclerView5 != null) {
                                                    recyclerView5.setOnTouchListener(new C8656d(this));
                                                    RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f16429C;
                                                    if (refreshLoadMoreLayout3 != null) {
                                                        refreshLoadMoreLayout3.setEnablePullDownHeader(false);
                                                        RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f16429C;
                                                        if (refreshLoadMoreLayout4 != null) {
                                                            View inflate = C85868k2.m106137b(getContext()).inflate(this.f16427A ? C0966R.C0971layout.b7v : C0966R.C0971layout.b7t, (ViewGroup) null);
                                                            C87412m.m108593f(inflate, "getInflater(context).inf…oter\n            }, null)");
                                                            refreshLoadMoreLayout4.setLoadMoreFooter(inflate);
                                                            RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f16429C;
                                                            if (refreshLoadMoreLayout5 != null) {
                                                                refreshLoadMoreLayout5.setActionCallback(new C8658e(this));
                                                                String str4 = this.f16442q;
                                                                if (str4 != null) {
                                                                    C60055x0 x0Var = this.f16435I;
                                                                    if (x0Var != null) {
                                                                        x0Var.f171399r = str4;
                                                                        FTSSearchView fTSSearchView10 = this.f16441p;
                                                                        if (fTSSearchView10 != null) {
                                                                            fTSSearchView10.getFtsEditText().mo70356l(str4, (List<FTSSearchView.C6996f>) null);
                                                                        } else {
                                                                            C87412m.m108603p("searchView");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C87412m.m108603p("searchSuggestionManager");
                                                                        throw null;
                                                                    }
                                                                }
                                                                RecyclerView recyclerView6 = this.f16430D;
                                                                if (recyclerView6 != null) {
                                                                    RecyclerView.C16613e adapter = recyclerView6.getAdapter();
                                                                    if (adapter != null) {
                                                                        adapter.notifyDataSetChanged();
                                                                    }
                                                                    RecyclerView recyclerView7 = this.f16430D;
                                                                    if (recyclerView7 != null) {
                                                                        int i = this.f16447v;
                                                                        C9556a aVar2 = new C9556a();
                                                                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                                                        aVar2.mo10233c(Integer.valueOf(i));
                                                                        RecyclerView recyclerView8 = recyclerView7;
                                                                        C117292a.m165358d(recyclerView8, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
                                                                        recyclerView7.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                                                                        C117292a.m165359e(recyclerView8, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
                                                                        this.f16436J.mo83450a(new C3539b());
                                                                        this.f16438L.alive();
                                                                        RecyclerView recyclerView9 = this.f16430D;
                                                                        if (recyclerView9 != null) {
                                                                            recyclerView9.mo17043c(this.f16439M);
                                                                            if (!this.f16427A) {
                                                                                ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderContactSearchUI_Finder).mo86179qs(this, C76986a.Finder);
                                                                            } else {
                                                                                ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderContactSearchUI_Live).mo86179qs(this, C76986a.FinderLive);
                                                                            }
                                                                        } else {
                                                                            C87412m.m108603p("recyclerView");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C87412m.m108603p("recyclerView");
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
                                                            C87412m.m108603p("rlLayout");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("rlLayout");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("recyclerView");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("recyclerView");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("recyclerView");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("recyclerView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("recyclerView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("searchView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("searchView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("searchView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("searchView");
                    throw null;
                }
            } else {
                C87412m.m108603p("searchView");
                throw null;
            }
        } else {
            C87412m.m108603p("searchView");
            throw null;
        }
    }

    public void onDestroy() {
        this.f16438L.dead();
        C46091u0 u0Var = this.f16434H;
        if (u0Var != null) {
            u0Var.mo71527a();
        }
        this.f16436J.mo83452c();
        C86709a0.m107524d().mo123470p(3820, this);
        RecyclerView recyclerView = this.f16430D;
        if (recyclerView != null) {
            recyclerView.mo17098m1(this.f16439M);
            super.onDestroy();
            return;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public void onPause() {
        super.onPause();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        RecyclerView recyclerView = this.f16430D;
        if (recyclerView != null) {
            C8777j5.C8778a.m8602c(j5Var, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "temp_3", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
            C60055x0 x0Var = this.f16435I;
            if (x0Var != null) {
                C86709a0.m107524d().mo123470p(6200, x0Var);
            } else {
                C87412m.m108603p("searchSuggestionManager");
                throw null;
            }
        } else {
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        RecyclerView recyclerView = this.f16430D;
        if (recyclerView != null) {
            C8777j5.C8778a.m8602c(j5Var, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "temp_3", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
            C60055x0 x0Var = this.f16435I;
            if (x0Var != null) {
                C86709a0.m107524d().mo123455a(6200, x0Var);
            } else {
                C87412m.m108603p("searchSuggestionManager");
                throw null;
            }
        } else {
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107524d().mo123470p(3820, this);
        int size = this.f16446u.size();
        int size2 = this.f16446u.size();
        if (i == 0 && i2 == 0) {
            C117407d.INSTANCE.idkeyStat(1265, 10, 1, false);
            C9320i4 i4Var = this.f16437K;
            C49572gk1 gk12 = i4Var != null ? i4Var.f29125v : null;
            C87412m.m108592e(gk12, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchResponse");
            LinkedList<C48868bk1> linkedList = gk12.f134088d;
            C87412m.m108593f(linkedList, "response.infoList");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C48868bk1 add : linkedList) {
                arrayList.add(Boolean.valueOf(this.f16446u.add(add)));
            }
            this.f16443r = gk12.f134089e;
            this.f16444s = gk12.f134090f;
            this.f16445t = gk12.f134092h;
            int size3 = this.f16446u.size();
            String str2 = this.f16440o;
            Log.m105924i(str2, "onSceneEnd " + gk12.f134089e + ' ' + gk12.f134090f + ' ' + this.f16446u.size());
            String str3 = this.f16442q;
            boolean isEmpty = gk12.f134088d.isEmpty();
            Class cls = C58417y0.class;
            int i3 = this.f16433G;
            int i4 = isEmpty ? 1 : 2;
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            String str4 = ((C58417y0) C86312j.m106911c(cls)).f167351e;
            String str5 = this.f16448w;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            y0Var.ay0(1, str4, str5, str3, 2, i3, 2, i4, 1, f != null ? f.mo12861q3() : null);
            size2 = size3;
        } else {
            C117407d.INSTANCE.idkeyStat(1265, 11, 1, false);
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16429C;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.mo82440F(0);
            if (size2 == 0) {
                View view = this.f16432F;
                if (view != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = this.f16431E;
                    if (textView != null) {
                        textView.setVisibility(0);
                        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f16429C;
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
                View view3 = this.f16432F;
                if (view3 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView2 = this.f16431E;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f16429C;
                        if (refreshLoadMoreLayout3 != null) {
                            refreshLoadMoreLayout3.setVisibility(0);
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
            if (size == 0) {
                RecyclerView recyclerView = this.f16430D;
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
            } else if (size < size2) {
                RecyclerView recyclerView2 = this.f16430D;
                if (recyclerView2 != null) {
                    RecyclerView.C16613e adapter2 = recyclerView2.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemRangeInserted(size, size2 - size);
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
        String str;
        hideVKB();
        FTSSearchView fTSSearchView = this.f16441p;
        if (fTSSearchView != null) {
            String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
            if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
                str = "";
            }
            if (Util.isNullOrNil(str)) {
                return true;
            }
            this.f16433G = 1;
            mo3874O7(str);
            C46091u0 u0Var = this.f16434H;
            if (u0Var != null) {
                u0Var.mo71529c(str);
            }
            C60055x0 x0Var = this.f16435I;
            if (x0Var != null) {
                x0Var.mo84916b();
                C117407d.INSTANCE.idkeyStat(1265, 9, 1, false);
                return false;
            }
            C87412m.m108603p("searchSuggestionManager");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
