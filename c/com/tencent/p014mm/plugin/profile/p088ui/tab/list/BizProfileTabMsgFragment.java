package com.tencent.p014mm.plugin.profile.p088ui.tab.list;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI;
import com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizHeaderController;
import com.tencent.p014mm.plugin.profile.p088ui.tab.data.BizProfileDataFetcher;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.BizProfileRecyclerView;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.BizProfileTopicFlowView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import mf2.C47023f;
import nf2.C47240a;
import nf2.C47242b;
import nf2.C47243c;
import rf2.C48023a;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C48711ah;
import te3.C49001ch;
import te3.C49425fi;
import te3.C49699hg;
import te3.C49841ig;
import yt0.C53561a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "<init>", "()V", "a", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment */
public final class BizProfileTabMsgFragment extends BaseBizProfileFragment {

    /* renamed from: j */
    public final String f115700j = "BizProfileTabMsgFragment";

    /* renamed from: n */
    public long f115701n;

    /* renamed from: o */
    public boolean f115702o;

    /* renamed from: p */
    public C47240a f115703p;

    /* renamed from: q */
    public final C49841ig f115704q;

    /* renamed from: r */
    public C48023a f115705r;

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment$a */
    public static final class C42725a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final Context f115706d;

        public C42725a(Context context) {
            C87412m.m108594g(context, "context");
            this.f115706d = context;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.top = C76577a.m92151b(this.f115706d, 8);
            rect.bottom = C76577a.m92151b(this.f115706d, 8);
            rect.left = C76577a.m92151b(this.f115706d, 8);
            rect.right = C76577a.m92151b(this.f115706d, 8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment$b */
    public static final class C42726b implements BizProfileRecyclerView.C42770a {

        /* renamed from: a */
        public final /* synthetic */ BizProfileTabMsgFragment f115707a;

        public C42726b(BizProfileTabMsgFragment bizProfileTabMsgFragment) {
            this.f115707a = bizProfileTabMsgFragment;
        }

        /* renamed from: a */
        public void mo66881a() {
            AppBarLayout appBarLayout;
            ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = this.f115707a.f115693g;
            if (!(contactWidgetTabBizHeaderController == null || (appBarLayout = contactWidgetTabBizHeaderController.f115543F) == null)) {
                appBarLayout.mo146163d(true, true, true);
            }
            BizProfileRecyclerView N = this.f115707a.mo66877N();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(N, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
            N.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(N, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment$c */
    public static final class C42727c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTabMsgFragment f115708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42727c(BizProfileTabMsgFragment bizProfileTabMsgFragment) {
            super(0);
            this.f115708d = bizProfileTabMsgFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
            r0 = r0.f135309g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r9 = this;
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r9.f115708d
                te3.ch r0 = r0.mo66875L()
                te3.ig r0 = r0.f131709f
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0016
                te3.ah r0 = r0.f135309g
                if (r0 == 0) goto L_0x0016
                int r0 = r0.f130509e
                if (r0 != 0) goto L_0x0016
                r0 = 1
                goto L_0x0017
            L_0x0016:
                r0 = 0
            L_0x0017:
                if (r0 == 0) goto L_0x004c
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r9.f115708d
                com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher r0 = r0.mo66876M()
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r3 = r9.f115708d
                te3.ch r3 = r3.mo66875L()
                te3.ig r3 = r3.f131709f
                if (r3 == 0) goto L_0x0030
                te3.ah r3 = r3.f135309g
                if (r3 == 0) goto L_0x0030
                pe3.b r3 = r3.f130508d
                goto L_0x0031
            L_0x0030:
                r3 = 0
            L_0x0031:
                r6 = r3
                boolean r3 = r0.f115658p
                if (r3 == 0) goto L_0x0037
                goto L_0x004c
            L_0x0037:
                r0.f115658p = r2
                r4 = 1
                r5 = 0
                r7 = 2
                r8 = 0
                r3 = r0
                ob0.c r2 = com.tencent.p014mm.plugin.profile.p088ui.tab.data.BizProfileDataFetcher.m46402a(r3, r4, r5, r6, r7, r8)
                mf2.b r3 = new mf2.b
                r3.<init>(r0)
                com.tencent.mm.ui.MMActivity r0 = r0.f115651f
                ob0.C89144l0.m111430f(r2, r3, r1, r0)
            L_0x004c:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.list.BizProfileTabMsgFragment.C42727c.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment$d */
    public static final class C42728d<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTabMsgFragment f115709d;

        public C42728d(BizProfileTabMsgFragment bizProfileTabMsgFragment) {
            this.f115709d = bizProfileTabMsgFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00e7  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r7) {
            /*
                r6 = this;
                te3.ch r7 = (te3.C49001ch) r7
                if (r7 != 0) goto L_0x0006
                goto L_0x00f8
            L_0x0006:
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r6.f115709d
                te3.ch r1 = new te3.ch
                r1.<init>()
                r0.getClass()
                r0.f115691e = r1
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r6.f115709d
                te3.ch r0 = r0.mo66875L()
                te3.ig r1 = r7.f131709f
                r0.f131709f = r1
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r6.f115709d
                te3.ig r0 = r0.f115704q
                java.util.LinkedList<te3.hg> r0 = r0.f135306d
                if (r0 == 0) goto L_0x0027
                r0.clear()
            L_0x0027:
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r6.f115709d
                te3.ig r1 = r0.f115704q
                te3.ig r2 = r7.f131709f
                r3 = 0
                if (r2 == 0) goto L_0x0033
                te3.ah r4 = r2.f135309g
                goto L_0x0034
            L_0x0033:
                r4 = r3
            L_0x0034:
                r1.f135309g = r4
                if (r2 == 0) goto L_0x0068
                java.util.LinkedList<te3.hg> r2 = r2.f135306d
                if (r2 == 0) goto L_0x0068
                java.util.LinkedList<te3.hg> r1 = r1.f135306d
                if (r1 == 0) goto L_0x0043
                r1.addAll(r2)
            L_0x0043:
                nf2.a r1 = r0.f115703p
                if (r1 == 0) goto L_0x0061
                te3.ig r2 = r0.f115704q
                te3.ch r4 = r0.mo66875L()
                te3.ig r4 = r4.f131709f
                int r4 = r4.f135311i
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                te3.ch r0 = r0.mo66875L()
                te3.ig r0 = r0.f131709f
                java.util.LinkedList<te3.hg> r0 = r0.f135310h
                r1.mo72277F4(r2, r4, r0)
                goto L_0x0068
            L_0x0061:
                java.lang.String r7 = "mAdapter"
                gy3.C87412m.m108603p(r7)
                throw r3
            L_0x0068:
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r6.f115709d
                android.content.Context r0 = r0.getContext()
                r1 = 8
                java.lang.String r0 = com.tencent.p014mm.plugin.profile.p088ui.tab.C42700a.m46397a(r0, r1, r7)
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0085
                int r4 = r0.length()
                if (r4 <= 0) goto L_0x0080
                r4 = 1
                goto L_0x0081
            L_0x0080:
                r4 = 0
            L_0x0081:
                if (r4 != r2) goto L_0x0085
                r4 = 1
                goto L_0x0086
            L_0x0085:
                r4 = 0
            L_0x0086:
                java.lang.String r5 = "<get-footerTextView>(...)"
                if (r4 == 0) goto L_0x009d
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r4 = r6.f115709d
                rx3.g r4 = r4.f115695i
                rx3.n r4 = (rx3.C36570n) r4
                java.lang.Object r4 = r4.getValue()
                gy3.C87412m.m108593f(r4, r5)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r4.setText(r0)
                goto L_0x00b2
            L_0x009d:
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r6.f115709d
                rx3.g r0 = r0.f115695i
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                gy3.C87412m.m108593f(r0, r5)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r4 = 2131822697(0x7f110869, float:1.9278173E38)
                r0.setText(r4)
            L_0x00b2:
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r6.f115709d
                te3.ig r4 = r0.f115704q
                te3.ah r4 = r4.f135309g
                if (r4 == 0) goto L_0x00bf
                int r4 = r4.f130509e
                if (r4 != 0) goto L_0x00bf
                r1 = 1
            L_0x00bf:
                if (r1 != 0) goto L_0x00cf
                com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView r0 = r0.mo66877N()
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r1 = r6.f115709d
                android.view.View r1 = r1.mo66874K()
                r0.addFooterView(r1)
                goto L_0x00dc
            L_0x00cf:
                com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView r0 = r0.mo66877N()
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r1 = r6.f115709d
                android.view.View r1 = r1.mo66874K()
                r0.mo63441z1(r1)
            L_0x00dc:
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r6.f115709d
                r0.mo66878O(r7)
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r0 = r6.f115709d
                rf2.a r1 = r0.f115705r
                if (r1 == 0) goto L_0x00f9
                java.util.ArrayList r7 = r0.mo66878O(r7)
                r1.mo72803a(r7)
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r7 = r6.f115709d
                java.lang.String r7 = r7.f115700j
                java.lang.String r0 = "refresh topic"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            L_0x00f8:
                return
            L_0x00f9:
                java.lang.String r7 = "topicFlowContract"
                gy3.C87412m.m108603p(r7)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.list.BizProfileTabMsgFragment.C42728d.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment$e */
    public static final class C42729e<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTabMsgFragment f115710d;

        public C42729e(BizProfileTabMsgFragment bizProfileTabMsgFragment) {
            this.f115710d = bizProfileTabMsgFragment;
        }

        public void onChanged(Object obj) {
            C48711ah ahVar;
            C49001ch chVar = (C49001ch) obj;
            if (chVar != null) {
                if (this.f115710d.mo66875L().f131709f == null) {
                    chVar.f131709f = chVar.f131709f;
                } else {
                    C49841ig igVar = chVar.f131709f;
                    if (!(igVar == null || (ahVar = igVar.f135309g) == null)) {
                        BizProfileTabMsgFragment bizProfileTabMsgFragment = this.f115710d;
                        bizProfileTabMsgFragment.f115704q.f135309g = ahVar;
                        bizProfileTabMsgFragment.mo66875L().f131709f.f135309g = ahVar;
                    }
                }
                C49841ig igVar2 = chVar.f131709f;
                if (igVar2 != null) {
                    BizProfileTabMsgFragment bizProfileTabMsgFragment2 = this.f115710d;
                    LinkedList<C49699hg> linkedList = igVar2.f135306d;
                    if (linkedList != null) {
                        bizProfileTabMsgFragment2.f115704q.f135306d.addAll(linkedList);
                        C47240a aVar = bizProfileTabMsgFragment2.f115703p;
                        if (aVar != null) {
                            aVar.mo72277F4(bizProfileTabMsgFragment2.f115704q, Integer.valueOf(bizProfileTabMsgFragment2.mo66875L().f131709f.f135311i), bizProfileTabMsgFragment2.mo66875L().f131709f.f135310h);
                        } else {
                            C87412m.m108603p("mAdapter");
                            throw null;
                        }
                    }
                    C48711ah ahVar2 = igVar2.f135309g;
                    boolean z = false;
                    if (ahVar2 != null && ahVar2.f130509e == 0) {
                        z = true;
                    }
                    if (!z) {
                        bizProfileTabMsgFragment2.mo66877N().addFooterView(bizProfileTabMsgFragment2.mo66874K());
                    }
                }
            }
        }
    }

    public BizProfileTabMsgFragment() {
        C49841ig igVar = new C49841ig();
        igVar.f135306d = new LinkedList<>();
        igVar.f135309g = new C48711ah();
        this.f115704q = igVar;
    }

    /* renamed from: C */
    public void mo66873C() {
        BizProfileRecyclerView N = mo66877N();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(N, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
        N.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(N, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        return r0;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<te3.C49425fi> mo66878O(te3.C49001ch r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0024 }
            r0.<init>()     // Catch:{ all -> 0x0024 }
            if (r3 != 0) goto L_0x000a
            monitor-exit(r2)
            return r0
        L_0x000a:
            te3.gi r1 = r3.f131718r     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0022
            java.util.LinkedList<te3.fi> r1 = r1.f134058e     // Catch:{ all -> 0x0024 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0017
            goto L_0x0022
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0024 }
            te3.gi r3 = r3.f131718r     // Catch:{ all -> 0x0024 }
            java.util.LinkedList<te3.fi> r3 = r3.f134058e     // Catch:{ all -> 0x0024 }
            r0.<init>(r3)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return r0
        L_0x0022:
            monitor-exit(r2)
            return r0
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.list.BizProfileTabMsgFragment.mo66878O(te3.ch):java.util.ArrayList");
    }

    /* renamed from: P */
    public void mo66879P(C49001ch chVar) {
        C87412m.m108594g(chVar, "bizProfileResp");
        C49001ch chVar2 = new C49001ch();
        chVar2.f131709f = chVar.f131709f;
        chVar2.f131718r = chVar.f131718r;
        this.f115691e = chVar2;
        C49841ig igVar = this.f115704q;
        C49841ig igVar2 = chVar.f131709f;
        igVar.f135309g = igVar2 != null ? igVar2.f135309g : null;
    }

    /* renamed from: Q */
    public void mo66880Q(BizProfileDataFetcher bizProfileDataFetcher) {
        C87412m.m108594g(bizProfileDataFetcher, "dataFetcher");
        this.f115690d = bizProfileDataFetcher;
        mo66876M().f115653h.observe(this, new C42728d(this));
        mo66876M().f115655j.observe(this, new C42729e(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.f7061wv, viewGroup, false);
        View findViewById = inflate.findViewById(C0966R.C0970id.iiq);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.recycler_view)");
        this.f115692f = (BizProfileRecyclerView) findViewById;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("contact") : null;
        C44668u3 v = C97625j3.m125812b().mo105907v();
        C87412m.m108591d(string);
        C72996z1 z1Var = v.get(string);
        BizProfileRecyclerView N = mo66877N();
        Context context = getContext();
        C87412m.m108591d(context);
        N.mo17085h0(new C42725a(context));
        Context context2 = getContext();
        C87412m.m108591d(context2);
        C87412m.m108593f(z1Var, "contact");
        this.f115703p = new C47240a(context2, 0, z1Var, this.f115701n, this.f115702o);
        mo66877N().setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        BizProfileRecyclerView N2 = mo66877N();
        C47240a aVar = this.f115703p;
        if (aVar != null) {
            N2.setAdapter(aVar);
            mo66877N().setOnScrollToTopListener(new C42726b(this));
            if (mo66875L().f131709f != null) {
                C47240a aVar2 = this.f115703p;
                if (aVar2 != null) {
                    C49841ig igVar = mo66875L().f131709f;
                    C87412m.m108593f(igVar, "mBizProfileResp.MsgList");
                    aVar2.mo72277F4(igVar, Integer.valueOf(mo66875L().f131709f.f135311i), mo66875L().f131709f.f135310h);
                } else {
                    C87412m.m108603p("mAdapter");
                    throw null;
                }
            }
            C47240a aVar3 = this.f115703p;
            if (aVar3 != null) {
                aVar3.f126811j = new C42727c(this);
                Context context3 = getContext();
                C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
                C48023a aVar4 = new C48023a((ContactInfoUI) context3, mo66878O(mo66875L()));
                this.f115705r = aVar4;
                aVar4.f128818d.clear();
                ArrayList<C47023f> arrayList = aVar4.f128818d;
                ArrayList<C49425fi> arrayList2 = aVar4.f128816b;
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
                for (C49425fi fVar : arrayList2) {
                    arrayList3.add(new C47023f(fVar));
                }
                arrayList.addAll(arrayList3);
                BizProfileTopicFlowView bizProfileTopicFlowView = new BizProfileTopicFlowView(aVar4.f128815a);
                bizProfileTopicFlowView.mo24111b(aVar4);
                bizProfileTopicFlowView.mo24112c();
                if (aVar4.f128818d.isEmpty()) {
                    bizProfileTopicFlowView.setVisibility(8);
                } else {
                    bizProfileTopicFlowView.setVisibility(0);
                }
                aVar4.f128819e = bizProfileTopicFlowView;
                String str = aVar4.f128817c;
                Log.m105924i(str, "gen topic view, visibility = " + bizProfileTopicFlowView.getVisibility());
                C53561a aVar5 = mo66877N().f108989y1;
                ((LinkedList) aVar5.f150540g).remove(bizProfileTopicFlowView);
                aVar5.notifyItemRangeChanged(0, 1);
                mo66877N().addHeaderView(bizProfileTopicFlowView);
                C48023a aVar6 = this.f115705r;
                if (aVar6 != null) {
                    aVar6.f128820f = new C47242b(this);
                    C48023a aVar7 = this.f115705r;
                    if (aVar7 != null) {
                        aVar7.f128821g = new C47243c(this);
                        C48023a aVar8 = this.f115705r;
                        if (aVar8 != null) {
                            aVar8.mo72803a(mo66878O(mo66875L()));
                            return inflate;
                        }
                        C87412m.m108603p("topicFlowContract");
                        throw null;
                    }
                    C87412m.m108603p("topicFlowContract");
                    throw null;
                }
                C87412m.m108603p("topicFlowContract");
                throw null;
            }
            C87412m.m108603p("mAdapter");
            throw null;
        }
        C87412m.m108603p("mAdapter");
        throw null;
    }
}
