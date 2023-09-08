package com.tencent.p014mm.plugin.finder.p056ui.fav;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import ef1.C58556f;
import er1.C58684b;
import fy3.C32226l;
import gq1.C59604a;
import gq1.C59605b;
import gq1.C59606c;
import gq1.C59610e;
import gq1.C59611f;
import gq1.C59612g;
import gq1.C59613h;
import gy3.C87412m;
import j20.C117292a;
import java.util.Set;
import jq3.C60896i;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p525fr.C59313e;
import p525fr.C97951d;
import rs1.C13317l7;
import rs1.C13390r2;
import rs1.C13442s8;
import sx3.C110818d0;
import sx3.C110826x0;
import sx3.C64186f0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lfr/d;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment */
public final class FinderGlobalFavFeedFragment extends FinderHomeTabFragment implements C97951d {

    /* renamed from: q */
    public C59604a f161211q;

    /* renamed from: r */
    public C59613h f161212r;

    /* renamed from: s */
    public C59313e f161213s;

    /* renamed from: G */
    public void mo79139G(int i) {
        Class cls = C13390r2.class;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C39818r rVar = C39818r.f106831a;
            ((C13390r2) rVar.mo62443b(activity).mo75002a(cls)).f37929d = true;
            C59613h hVar = this.f161212r;
            if (hVar != null) {
                C0740i2 i2Var = (C0740i2) C110818d0.m150917O(hVar.f170329c.f170312d, i);
                if (i2Var != null) {
                    ((C13390r2) rVar.mo62443b(hVar.f170327a).mo75002a(cls)).f37930e.put(Long.valueOf(i2Var.getItemId()), Boolean.TRUE);
                    RecyclerView.C16613e adapter = hVar.mo84629b().getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C13317l7.class);
    }

    /* renamed from: R */
    public int mo2203R() {
        if (this.f161213s != null) {
            return WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED;
        }
        return 164;
    }

    /* renamed from: T */
    public void mo4178T() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, activity, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).Mx0(activity, intent, 4, C64186f0.f181907d);
        }
    }

    /* renamed from: U */
    public int mo4179U() {
        return 3;
    }

    /* renamed from: c */
    public Fragment mo79140c() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.alo;
    }

    /* renamed from: o */
    public void mo79141o(C59313e eVar) {
        this.f161213s = eVar;
    }

    public void onDestroy() {
        super.onDestroy();
        C59604a aVar = this.f161211q;
        if (aVar != null) {
            aVar.onDetach();
            this.f161213s = null;
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onPause() {
        super.onPause();
        if (this.f161213s != null) {
            ((C13317l7) C39818r.f106831a.mo62445d(this).mo75002a(C13317l7.class)).mo12761f3(true);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f161213s != null) {
            ((C13317l7) C39818r.f106831a.mo62445d(this).mo75002a(C13317l7.class)).mo12761f3(false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C87412m.m108594g(view2, "view");
        super.onViewCreated(view, bundle);
        C59313e eVar = this.f161213s;
        this.f161211q = eVar != null ? new C59605b(eVar) : new C59606c();
        FragmentActivity requireActivity = requireActivity();
        C87412m.m108593f(requireActivity, "requireActivity()");
        C59604a aVar = this.f161211q;
        if (aVar != null) {
            C59613h hVar = new C59613h(requireActivity, this, aVar, view2);
            this.f161212r = hVar;
            C59604a aVar2 = this.f161211q;
            if (aVar2 != null) {
                aVar2.f170313e = hVar;
                C59613h e = aVar2.mo84620e();
                e.f170334h = (FrameLayout) e.mo84628a(C0966R.C0970id.cjg);
                e.f170335i = e.mo84628a(C0966R.C0970id.i7j);
                e.f170336j = e.mo84628a(C0966R.C0970id.cj7);
                e.f170337k = e.mo84628a(C0966R.C0970id.is_);
                e.f170331e = (FinderRefreshLayout) e.mo84628a(C0966R.C0970id.ivb);
                FinderGlobalFavLoaderMoreFooter finderGlobalFavLoaderMoreFooter = new FinderGlobalFavLoaderMoreFooter(e.f170327a, (AttributeSet) null);
                finderGlobalFavLoaderMoreFooter.setDataList(e.f170329c.f170312d);
                finderGlobalFavLoaderMoreFooter.removeAllViews();
                View.inflate(finderGlobalFavLoaderMoreFooter.getContext(), C0966R.C0971layout.d6k, finderGlobalFavLoaderMoreFooter);
                e.f170340n = finderGlobalFavLoaderMoreFooter;
                FinderRefreshLayout c = e.mo84630c();
                FinderGlobalFavLoaderMoreFooter finderGlobalFavLoaderMoreFooter2 = e.f170340n;
                C87412m.m108591d(finderGlobalFavLoaderMoreFooter2);
                c.mo26641y(finderGlobalFavLoaderMoreFooter2);
                RecyclerView recyclerView = e.mo84630c().getRecyclerView();
                C87412m.m108592e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
                e.f170333g = (WxRecyclerView) recyclerView;
                e.mo84629b().setLayoutManager(e.f170339m.mo3666d(e.f170327a));
                e.mo84629b().setItemAnimator((RecyclerView.C16616j) null);
                FinderGlobalFavStaggeredConfig finderGlobalFavStaggeredConfig = (FinderGlobalFavStaggeredConfig) e.f170339m;
                finderGlobalFavStaggeredConfig.getClass();
                e.f170332f = new WxRecyclerAdapter<>(new FinderGlobalFavStaggeredConfig$getItemConvertFactory$1(finderGlobalFavStaggeredConfig, (C32226l<? super Integer, ? extends C60896i<?>>) null), e.f170329c.f170312d, false);
                WxRecyclerView b = e.mo84629b();
                ((FinderStaggeredConfig) e.f170339m).getClass();
                b.mo17085h0(new FinderStaggeredConfig.C3631b());
                WxRecyclerView b2 = e.mo84629b();
                WxRecyclerAdapter<?> wxRecyclerAdapter = e.f170332f;
                if (wxRecyclerAdapter != null) {
                    b2.setAdapter(wxRecyclerAdapter);
                    C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62445d(e.f170328b).mo62449e(C13442s8.class);
                    if (s8Var != null) {
                        C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
                        C58556f j3 = s8Var.mo12854j3(-1);
                        if (j3 != null) {
                            j3.mo83455c(e.mo84629b());
                        }
                    }
                    WxRecyclerAdapter<?> wxRecyclerAdapter2 = e.f170332f;
                    if (wxRecyclerAdapter2 != null) {
                        wxRecyclerAdapter2.f173488o = new C59610e(e);
                        if (wxRecyclerAdapter2 != null) {
                            wxRecyclerAdapter2.f173487n = new C59611f(e);
                            e.mo84630c().setOnSimpleAction(new C59612g(e));
                            C59613h e2 = aVar2.mo84620e();
                            FrameLayout frameLayout = e2.f170334h;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(0);
                                View view3 = e2.f170335i;
                                if (view3 != null) {
                                    C9556a aVar4 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar4.mo10233c(0);
                                    View view4 = view3;
                                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    View view5 = e2.f170336j;
                                    if (view5 != null) {
                                        C9556a aVar5 = new C9556a();
                                        aVar5.mo10233c(8);
                                        View view6 = view5;
                                        C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        View view7 = e2.f170337k;
                                        if (view7 != null) {
                                            C9556a aVar6 = new C9556a();
                                            aVar6.mo10233c(8);
                                            View view8 = view7;
                                            C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            aVar2.mo84624t();
                                            aVar2.requestRefresh();
                                            return;
                                        }
                                        C87412m.m108603p("retryView");
                                        throw null;
                                    }
                                    C87412m.m108603p("nothingView");
                                    throw null;
                                }
                                C87412m.m108603p("loadingView");
                                throw null;
                            }
                            C87412m.m108603p("loadingLayout");
                            throw null;
                        }
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                    C87412m.m108603p("adapter");
                    throw null;
                }
                C87412m.m108603p("adapter");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [gq1.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79142p(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            gq1.h r0 = r3.f161212r
            r1 = 0
            if (r0 == 0) goto L_0x007a
            r2 = 1
            if (r4 != r2) goto L_0x0079
            r4 = -1
            if (r5 != r4) goto L_0x0079
            r4 = 0
            if (r6 == 0) goto L_0x0018
            java.lang.String r5 = "DATA_SIZE"
            int r5 = r6.getIntExtra(r5, r4)
            goto L_0x0019
        L_0x0018:
            r5 = 0
        L_0x0019:
            gq1.a r6 = r0.f170329c
            boolean r0 = r6 instanceof gq1.C59605b
            if (r0 == 0) goto L_0x0022
            r1 = r6
            gq1.b r1 = (gq1.C59605b) r1
        L_0x0022:
            if (r1 != 0) goto L_0x0025
            goto L_0x0079
        L_0x0025:
            java.util.ArrayList<cm1.i2> r6 = r1.f170312d
            int r6 = r6.size()
            if (r5 <= r6) goto L_0x0079
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "onActivityResult detailSize: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", listSize:"
            r6.append(r0)
            java.util.ArrayList<cm1.i2> r0 = r1.f170312d
            int r0 = r0.size()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "FinderGlobalFavViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            java.util.ArrayList<cm1.i2> r6 = r1.f170312d
            int r6 = r6.size()
            int r5 = r5 - r6
            java.lang.Class<pb1.u0> r6 = pb1.C11882u0.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            pb1.u0 r6 = (pb1.C11882u0) r6
            java.util.ArrayList<cm1.i2> r0 = r1.f170312d
            int r0 = sx3.C64197v.m75536e(r0)
            rx3.l r5 = r6.mo11758LQ(r0, r5)
            A r6 = r5.f38555d
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            B r5 = r5.f38556e
            java.util.List r5 = (java.util.List) r5
            r1.mo84626G(r5, r4, r6)
        L_0x0079:
            return
        L_0x007a:
            java.lang.String r4 = "viewCallback"
            gy3.C87412m.m108603p(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.fav.FinderGlobalFavFeedFragment.mo79142p(int, int, android.content.Intent):void");
    }

    /* renamed from: q */
    public void mo79143q() {
        Class cls = C13390r2.class;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C39818r rVar = C39818r.f106831a;
            ((C13390r2) rVar.mo62443b(activity).mo75002a(cls)).f37929d = false;
            C59613h hVar = this.f161212r;
            if (hVar != null) {
                ((C13390r2) rVar.mo62443b(hVar.f170327a).mo75002a(cls)).f37930e.clear();
                RecyclerView.C16613e adapter = hVar.mo84629b().getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79144w(java.util.List<java.lang.Integer> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "positionList"
            gy3.C87412m.m108594g(r9, r0)
            gq1.h r0 = r8.f161212r
            r1 = 0
            if (r0 == 0) goto L_0x00ec
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            gq1.a r3 = r0.f170329c
            java.util.ArrayList<cm1.i2> r3 = r3.f170312d
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = 0
        L_0x0019:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x003c
            java.lang.Object r6 = r3.next()
            int r7 = r5 + 1
            if (r5 < 0) goto L_0x0038
            cm1.i2 r6 = (cm1.C0740i2) r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L_0x0036
            r2.add(r6)
        L_0x0036:
            r5 = r7
            goto L_0x0019
        L_0x0038:
            sx3.C64197v.m75542k()
            throw r1
        L_0x003c:
            java.util.Collections.reverse(r2)
            java.util.Iterator r9 = r2.iterator()
        L_0x0043:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0082
            java.lang.Object r2 = r9.next()
            cm1.i2 r2 = (cm1.C0740i2) r2
            gq1.a r3 = r0.f170329c
            java.util.ArrayList<cm1.i2> r3 = r3.f170312d
            int r3 = r3.indexOf(r2)
            gq1.a r5 = r0.f170329c
            java.util.ArrayList<cm1.i2> r5 = r5.f170312d
            r5.remove(r2)
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r0.mo84629b()
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x006b
            r2.notifyItemRemoved(r3)
        L_0x006b:
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r0.mo84629b()
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x0043
            gq1.a r5 = r0.f170329c
            java.util.ArrayList<cm1.i2> r5 = r5.f170312d
            int r5 = r5.size()
            int r5 = r5 - r3
            r2.notifyItemRangeChanged(r3, r5)
            goto L_0x0043
        L_0x0082:
            com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter r9 = r0.f170340n
            if (r9 == 0) goto L_0x00eb
            r0 = 2131308008(0x7f092de8, float:1.823426E38)
            android.view.View r0 = r9.findViewById(r0)
            java.util.List<? extends cm1.i2> r2 = r9.f161215e
            if (r2 == 0) goto L_0x00c0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x009a:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00bb
            java.lang.Object r5 = r2.next()
            r6 = r5
            cm1.i2 r6 = (cm1.C0740i2) r6
            java.util.List<java.lang.Integer> r7 = r9.f161216f
            int r6 = r6.mo75c()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x009a
            r3.add(r5)
            goto L_0x009a
        L_0x00bb:
            int r2 = r3.size()
            goto L_0x00c1
        L_0x00c0:
            r2 = 0
        L_0x00c1:
            if (r0 == 0) goto L_0x00cd
            r1 = 2131298942(0x7f090a7e, float:1.8215871E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x00cd:
            if (r1 != 0) goto L_0x00d0
            goto L_0x00eb
        L_0x00d0:
            android.content.Context r9 = r9.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r0 = 2131826796(0x7f11186c, float:1.9286487E38)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r4] = r2
            java.lang.String r9 = r9.getString(r0, r3)
            r1.setText(r9)
        L_0x00eb:
            return
        L_0x00ec:
            java.lang.String r9 = "viewCallback"
            gy3.C87412m.m108603p(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.fav.FinderGlobalFavFeedFragment.mo79144w(java.util.List):void");
    }
}
