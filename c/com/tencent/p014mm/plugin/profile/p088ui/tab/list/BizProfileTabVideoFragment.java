package com.tencent.p014mm.plugin.profile.p088ui.tab.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizHeaderController;
import com.tencent.p014mm.plugin.profile.p088ui.tab.data.BizProfileDataFetcher;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.BizProfileRecyclerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nf2.C47244d;
import rx3.C13598b0;
import te3.C48711ah;
import te3.C49001ch;
import te3.C49699hg;
import te3.C49841ig;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment */
public final class BizProfileTabVideoFragment extends BaseBizProfileFragment {

    /* renamed from: j */
    public C47244d f115711j;

    /* renamed from: n */
    public List<C49699hg> f115712n = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment$a */
    public static final class C42730a implements BizProfileRecyclerView.C42770a {

        /* renamed from: a */
        public final /* synthetic */ BizProfileTabVideoFragment f115713a;

        public C42730a(BizProfileTabVideoFragment bizProfileTabVideoFragment) {
            this.f115713a = bizProfileTabVideoFragment;
        }

        /* renamed from: a */
        public void mo66881a() {
            AppBarLayout appBarLayout;
            ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = this.f115713a.f115693g;
            if (!(contactWidgetTabBizHeaderController == null || (appBarLayout = contactWidgetTabBizHeaderController.f115543F) == null)) {
                appBarLayout.mo146163d(true, true, true);
            }
            BizProfileRecyclerView N = this.f115713a.mo66877N();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(N, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
            N.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(N, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment$b */
    public static final class C42731b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTabVideoFragment f115714d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42731b(BizProfileTabVideoFragment bizProfileTabVideoFragment) {
            super(0);
            this.f115714d = bizProfileTabVideoFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
            r0 = r0.f135309g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r9 = this;
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r9.f115714d
                te3.ch r0 = r0.mo66875L()
                te3.ig r0 = r0.f131711h
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
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r9.f115714d
                com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher r0 = r0.mo66876M()
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r3 = r9.f115714d
                te3.ch r3 = r3.mo66875L()
                te3.ig r3 = r3.f131711h
                if (r3 == 0) goto L_0x0030
                te3.ah r3 = r3.f135309g
                if (r3 == 0) goto L_0x0030
                pe3.b r3 = r3.f130508d
                goto L_0x0031
            L_0x0030:
                r3 = 0
            L_0x0031:
                r6 = r3
                boolean r3 = r0.f115657o
                if (r3 == 0) goto L_0x0037
                goto L_0x004c
            L_0x0037:
                r0.f115657o = r2
                r4 = 2
                r5 = 0
                r7 = 2
                r8 = 0
                r3 = r0
                ob0.c r2 = com.tencent.p014mm.plugin.profile.p088ui.tab.data.BizProfileDataFetcher.m46402a(r3, r4, r5, r6, r7, r8)
                mf2.c r3 = new mf2.c
                r3.<init>(r0)
                com.tencent.mm.ui.MMActivity r0 = r0.f115651f
                ob0.C89144l0.m111430f(r2, r3, r1, r0)
            L_0x004c:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.list.BizProfileTabVideoFragment.C42731b.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment$c */
    public static final class C42732c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTabVideoFragment f115715d;

        public C42732c(BizProfileTabVideoFragment bizProfileTabVideoFragment) {
            this.f115715d = bizProfileTabVideoFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
            r0 = r0.f135306d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r8) {
            /*
                r7 = this;
                te3.ch r8 = (te3.C49001ch) r8
                if (r8 != 0) goto L_0x0006
                goto L_0x00a7
            L_0x0006:
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r7.f115715d
                te3.ch r1 = new te3.ch
                r1.<init>()
                r0.getClass()
                r0.f115691e = r1
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r7.f115715d
                te3.ch r0 = r0.mo66875L()
                te3.ig r1 = r8.f131711h
                r0.f131711h = r1
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r7.f115715d
                te3.ch r0 = r0.mo66875L()
                te3.ig r0 = r0.f131711h
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0035
                java.util.LinkedList<te3.hg> r0 = r0.f135306d
                if (r0 == 0) goto L_0x0035
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r1
                if (r0 != r1) goto L_0x0035
                r0 = 1
                goto L_0x0036
            L_0x0035:
                r0 = 0
            L_0x0036:
                java.lang.String r3 = "mVideoAdapter"
                r4 = 0
                if (r0 == 0) goto L_0x0086
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r7.f115715d
                java.util.List<te3.hg> r0 = r0.f115712n
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.clear()
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r7.f115715d
                java.util.List<te3.hg> r0 = r0.f115712n
                te3.ig r5 = r8.f131711h
                java.util.LinkedList<te3.hg> r5 = r5.f135306d
                java.lang.String r6 = "bizProfileResp.VideoList.Msg"
                gy3.C87412m.m108593f(r5, r6)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.addAll(r5)
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r7.f115715d
                nf2.d r0 = r0.f115711j
                if (r0 == 0) goto L_0x0082
                r0.notifyDataSetChanged()
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r7.f115715d
                te3.ch r0 = r0.mo66875L()
                te3.ig r0 = r0.f131711h
                if (r0 == 0) goto L_0x008f
                te3.ah r0 = r0.f135309g
                if (r0 == 0) goto L_0x008f
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r5 = r7.f115715d
                nf2.d r5 = r5.f115711j
                if (r5 == 0) goto L_0x007e
                int r0 = r0.f130509e
                if (r0 != 0) goto L_0x0079
                goto L_0x007a
            L_0x0079:
                r1 = 0
            L_0x007a:
                r5.mo72278F4(r1)
                goto L_0x008f
            L_0x007e:
                gy3.C87412m.m108603p(r3)
                throw r4
            L_0x0082:
                gy3.C87412m.m108603p(r3)
                throw r4
            L_0x0086:
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r7.f115715d
                nf2.d r0 = r0.f115711j
                if (r0 == 0) goto L_0x00ac
                r0.mo72278F4(r2)
            L_0x008f:
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r7.f115715d
                android.content.Context r0 = r0.getContext()
                r1 = 64
                java.lang.String r8 = com.tencent.p014mm.plugin.profile.p088ui.tab.C42700a.m46397a(r0, r1, r8)
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r0 = r7.f115715d
                nf2.d r0 = r0.f115711j
                if (r0 == 0) goto L_0x00a8
                if (r8 != 0) goto L_0x00a5
                java.lang.String r8 = ""
            L_0x00a5:
                r0.f126830g = r8
            L_0x00a7:
                return
            L_0x00a8:
                gy3.C87412m.m108603p(r3)
                throw r4
            L_0x00ac:
                gy3.C87412m.m108603p(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.list.BizProfileTabVideoFragment.C42732c.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment$d */
    public static final class C42733d<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTabVideoFragment f115716d;

        public C42733d(BizProfileTabVideoFragment bizProfileTabVideoFragment) {
            this.f115716d = bizProfileTabVideoFragment;
        }

        public void onChanged(Object obj) {
            C48711ah ahVar;
            C49001ch chVar = (C49001ch) obj;
            if (chVar != null) {
                if (this.f115716d.mo66875L().f131711h == null) {
                    chVar.f131711h = chVar.f131711h;
                } else {
                    C49841ig igVar = chVar.f131711h;
                    if (!(igVar == null || (ahVar = igVar.f135309g) == null)) {
                        this.f115716d.mo66875L().f131711h.f135309g = ahVar;
                    }
                }
                C49841ig igVar2 = chVar.f131711h;
                if (igVar2 != null) {
                    BizProfileTabVideoFragment bizProfileTabVideoFragment = this.f115716d;
                    LinkedList<C49699hg> linkedList = igVar2.f135306d;
                    boolean z = true;
                    if (linkedList != null && (!linkedList.isEmpty())) {
                        int size = ((ArrayList) bizProfileTabVideoFragment.f115712n).size();
                        ((ArrayList) bizProfileTabVideoFragment.f115712n).addAll(linkedList);
                        C47244d dVar = bizProfileTabVideoFragment.f115711j;
                        if (dVar != null) {
                            dVar.notifyItemRangeInserted(size, linkedList.size());
                        } else {
                            C87412m.m108603p("mVideoAdapter");
                            throw null;
                        }
                    }
                    C47244d dVar2 = bizProfileTabVideoFragment.f115711j;
                    if (dVar2 != null) {
                        C48711ah ahVar2 = igVar2.f135309g;
                        if (ahVar2 == null || ahVar2.f130509e != 0) {
                            z = false;
                        }
                        dVar2.mo72278F4(z);
                        return;
                    }
                    C87412m.m108603p("mVideoAdapter");
                    throw null;
                }
            }
        }
    }

    /* renamed from: C */
    public void mo66873C() {
        BizProfileRecyclerView N = mo66877N();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(N, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
        N.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(N, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    /* renamed from: O */
    public void mo66882O(C49001ch chVar) {
        C87412m.m108594g(chVar, "bizProfileResp");
        this.f115691e = new C49001ch();
        mo66875L().f131711h = chVar.f131711h;
    }

    /* renamed from: P */
    public void mo66883P(BizProfileDataFetcher bizProfileDataFetcher) {
        C87412m.m108594g(bizProfileDataFetcher, "dataFetcher");
        this.f115690d = bizProfileDataFetcher;
        mo66876M().f115653h.observe(this, new C42732c(this));
        mo66876M().f115654i.observe(this, new C42733d(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.f7062ww, viewGroup, false);
        View findViewById = inflate.findViewById(C0966R.C0970id.iiq);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.recycler_view)");
        this.f115692f = (BizProfileRecyclerView) findViewById;
        mo66877N().setLayoutManager(new LinearLayoutManager(getActivity()));
        Bundle arguments = getArguments();
        C87412m.m108591d(arguments != null ? arguments.getString("contact") : null);
        this.f115711j = new C47244d(this.f115712n);
        RecyclerView.C16623q recycledViewPool = mo66877N().getRecycledViewPool();
        C87412m.m108593f(recycledViewPool, "mRecyclerView.recycledViewPool");
        recycledViewPool.mo17336e(0, 20);
        mo66877N().setRecycledViewPool(recycledViewPool);
        BizProfileRecyclerView N = mo66877N();
        C47244d dVar = this.f115711j;
        if (dVar != null) {
            N.setAdapter(dVar);
            mo66877N().setOnScrollToTopListener(new C42730a(this));
            return inflate;
        }
        C87412m.m108603p("mVideoAdapter");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        LinkedList<C49699hg> linkedList;
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        if (((ArrayList) this.f115712n).isEmpty()) {
            C49841ig igVar = mo66875L().f131711h;
            boolean z = false;
            if (!(igVar == null || (linkedList = igVar.f135306d) == null || !(!linkedList.isEmpty()))) {
                z = true;
            }
            if (z) {
                List<C49699hg> list = this.f115712n;
                LinkedList<C49699hg> linkedList2 = mo66875L().f131711h.f135306d;
                C87412m.m108593f(linkedList2, "mBizProfileResp.VideoList.Msg");
                ((ArrayList) list).addAll(linkedList2);
                C47244d dVar = this.f115711j;
                if (dVar != null) {
                    dVar.notifyDataSetChanged();
                } else {
                    C87412m.m108603p("mVideoAdapter");
                    throw null;
                }
            }
        }
        C47244d dVar2 = this.f115711j;
        if (dVar2 != null) {
            dVar2.f126831h = new C42731b(this);
        } else {
            C87412m.m108603p("mVideoAdapter");
            throw null;
        }
    }
}
