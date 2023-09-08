package zn1;

import a14.C0000n0;
import a14.C53930o0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.playlist.FinderPlayListDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8808v4;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: zn1.k */
public final class C16322k implements RecyclerViewDrawerSquares.C45117c {

    /* renamed from: d */
    public final C16323l f43629d;

    /* renamed from: e */
    public FinderPlayListDrawer f43630e;

    /* renamed from: f */
    public TextView f43631f;

    /* renamed from: g */
    public TextView f43632g;

    /* renamed from: h */
    public View f43633h;

    /* renamed from: i */
    public View f43634i;

    /* renamed from: j */
    public ImageView f43635j;

    /* renamed from: n */
    public FrameLayout f43636n;

    /* renamed from: o */
    public View f43637o;

    /* renamed from: p */
    public View f43638p;

    /* renamed from: q */
    public View f43639q;

    /* renamed from: r */
    public RefreshLoadMoreLayout f43640r;

    /* renamed from: s */
    public Context f43641s;

    public C16322k(C16323l lVar) {
        C87412m.m108594g(lVar, "presenter");
        this.f43629d = lVar;
    }

    /* renamed from: a */
    public final void mo14802a(boolean z) {
        if (z) {
            mo14808j().setEnableRefresh(true);
            if (mo14808j().getRefreshHeader() == null) {
                RefreshLoadMoreLayout j = mo14808j();
                View inflate = C85868k2.m106137b(mo14803b()).inflate(C0966R.C0971layout.d2i, (ViewGroup) null);
                C87412m.m108593f(inflate, "getInflater(context).inf…ist_refresh_header, null)");
                j.setRefreshHeaderView(inflate);
                return;
            }
            return;
        }
        mo14808j().setEnableRefresh(false);
    }

    /* renamed from: b */
    public final Context mo14803b() {
        Context context = this.f43641s;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("context");
        throw null;
    }

    /* renamed from: c */
    public final FrameLayout mo14804c() {
        FrameLayout frameLayout = this.f43636n;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("loadingLayout");
        throw null;
    }

    /* renamed from: d */
    public final View mo14805d() {
        View view = this.f43638p;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("nothingView");
        throw null;
    }

    /* renamed from: e */
    public void mo9497e(float f) {
        float f2 = f * 2.5f;
        float f3 = 0.0f;
        float f4 = f2 < 0.0f ? 0.0f : f2;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (0.0f < f2) {
            f3 = f2;
        }
        int b = C76577a.m92151b(mo14803b(), 16);
        int b2 = C76577a.m92151b(mo14803b(), 4);
        View view = this.f43633h;
        if (view == null) {
            C87412m.m108603p("headerLine");
            throw null;
        } else if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = (int) (((float) b2) + (f3 * ((float) (b - b2))));
            view.setLayoutParams(layoutParams);
            View view2 = this.f43634i;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(f4));
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onDrawerTranslation", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onDrawerTranslation", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            C87412m.m108603p("headerArrow");
            throw null;
        } else {
            C87412m.m108603p("headerLine");
            throw null;
        }
    }

    /* renamed from: f */
    public void mo9498f() {
        C16323l lVar = this.f43629d;
        lVar.mo14814f();
        C0000n0 n0Var = lVar.f43648g;
        C53930o0.m60557d(n0Var, lVar + " onDetach", (Throwable) null, 2, (Object) null);
        mo14806h().mo82543k(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        r8 = r8.f136745d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3766g(boolean r20, boolean r21, int r22) {
        /*
            r19 = this;
            r1 = r19
            if (r20 == 0) goto L_0x023f
            if (r21 == 0) goto L_0x023f
            zn1.l r0 = r1.f43629d
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer r2 = r19.mo14806h()
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer r3 = r19.mo14806h()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.getFeedObj()
            gy3.C87412m.m108591d(r3)
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer r4 = r19.mo14806h()
            boolean r4 = r4.getUseCache()
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer r5 = r19.mo14806h()
            int r5 = r5.getScene()
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer r6 = r19.mo14806h()
            r6.getPosition()
            r0.getClass()
            java.lang.Class<ht1.v4> r6 = ht1.C8808v4.class
            r7 = 0
            r0.f43650i = r7
            r0.f43644c = r3
            r0.f43645d = r2
            r0.f43646e = r1
            zn1.v r2 = r0.f43643b
            r2.getClass()
            r2.f43695c = r3
            java.util.ArrayList<zn1.u> r8 = r2.f43693a
            boolean r8 = r8.isEmpty()
            r9 = 1
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x0052
            java.util.ArrayList<zn1.u> r8 = r2.f43693a
            r8.clear()
        L_0x0052:
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r3.getFeedObject()
            te3.kf1 r8 = r8.object_extend
            if (r8 == 0) goto L_0x0061
            te3.rh0 r8 = r8.f136745d
            if (r8 == 0) goto L_0x0061
            long r10 = r8.f140917d
            goto L_0x0063
        L_0x0061:
            r10 = 0
        L_0x0063:
            r8 = 0
            if (r4 == 0) goto L_0x010e
            zn1.a r4 = zn1.C16309a.f43609a
            monitor-enter(r4)
            java.util.Map<zn1.a$a, java.util.List<zn1.u>> r12 = zn1.C16309a.f43610b     // Catch:{ all -> 0x010b }
            zn1.a$a r13 = new zn1.a$a     // Catch:{ all -> 0x010b }
            r13.<init>(r10)     // Catch:{ all -> 0x010b }
            java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12     // Catch:{ all -> 0x010b }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x010b }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x010b }
            monitor-exit(r4)
            if (r12 == 0) goto L_0x00f3
            java.util.Iterator r4 = r12.iterator()
        L_0x007f:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0091
            java.lang.Object r13 = r4.next()
            r14 = r13
            zn1.u r14 = (zn1.C16340u) r14
            boolean r14 = r14.f43691d
            if (r14 == 0) goto L_0x007f
            goto L_0x0092
        L_0x0091:
            r13 = r8
        L_0x0092:
            zn1.u r13 = (zn1.C16340u) r13
            if (r13 == 0) goto L_0x00a6
            long r14 = r13.getItemId()
            long r16 = r3.getId()
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x00a6
            r13.f43691d = r7
            r13.f43692e = r7
        L_0x00a6:
            java.util.Iterator r4 = r12.iterator()
        L_0x00aa:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x00c9
            java.lang.Object r13 = r4.next()
            r14 = r13
            zn1.u r14 = (zn1.C16340u) r14
            long r15 = r3.getId()
            long r17 = r14.getItemId()
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x00c5
            r14 = 1
            goto L_0x00c6
        L_0x00c5:
            r14 = 0
        L_0x00c6:
            if (r14 == 0) goto L_0x00aa
            goto L_0x00ca
        L_0x00c9:
            r13 = r8
        L_0x00ca:
            zn1.u r13 = (zn1.C16340u) r13
            if (r13 == 0) goto L_0x00d2
            r13.f43691d = r9
            r13.f43692e = r9
        L_0x00d2:
            java.util.ArrayList<zn1.u> r2 = r2.f43693a
            r2.addAll(r12)
            java.lang.String r2 = "Finder.FinderPlayListLoader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "onAttach hit data cache, size: "
            r4.append(r13)
            int r12 = r12.size()
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r2 = 1
            goto L_0x00f4
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            zn1.a r4 = zn1.C16309a.f43609a
            monitor-enter(r4)
            java.util.Map<zn1.a$a, zn1.a$b> r12 = zn1.C16309a.f43611c     // Catch:{ all -> 0x0108 }
            zn1.a$a r13 = new zn1.a$a     // Catch:{ all -> 0x0108 }
            r13.<init>(r10)     // Catch:{ all -> 0x0108 }
            java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12     // Catch:{ all -> 0x0108 }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x0108 }
            zn1.a$b r12 = (zn1.C16309a.C16311b) r12     // Catch:{ all -> 0x0108 }
            monitor-exit(r4)
            goto L_0x0110
        L_0x0108:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x010b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x010e:
            r2 = 0
            r12 = r8
        L_0x0110:
            java.lang.String r4 = "Finder.FinderPlayListLoader"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "onAttach id: "
            r13.append(r14)
            r13.append(r10)
            java.lang.String r10 = ", extra:"
            r13.append(r10)
            r13.append(r12)
            java.lang.String r10 = ", hitCache:"
            r13.append(r10)
            r13.append(r2)
            java.lang.String r10 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            if (r2 == 0) goto L_0x0145
            rx3.l r4 = new rx3.l
            gy3.C87412m.m108591d(r12)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4.<init>(r12, r2)
            goto L_0x0153
        L_0x0145:
            rx3.l r4 = new rx3.l
            zn1.a$b r10 = new zn1.a$b
            r10.<init>(r8, r9, r9)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4.<init>(r10, r2)
        L_0x0153:
            A r2 = r4.f38555d
            zn1.a$b r2 = (zn1.C16309a.C16311b) r2
            B r4 = r4.f38556e
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            pe3.b r10 = r2.f43613a
            boolean r11 = r2.f43614b
            boolean r2 = r2.f43615c
            r0.f43649h = r10
            r0.mo14817i(r11)
            r0.mo14816h(r2)
            r0.f43653l = r5
            r0.getClass()
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r19.mo14808j()
            zn1.l$a r5 = r0.f43654m
            r2.setActionCallback(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r19.mo14808j()
            di3.d r5 = di3.C86312j.m106911c(r6)
            ht1.v4 r5 = (ht1.C8808v4) r5
            boolean r5 = r5.mo9635e()
            r5 = r5 ^ r9
            r2.setEnableLoadMore(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r19.mo14808j()
            di3.d r5 = di3.C86312j.m106911c(r6)
            ht1.v4 r5 = (ht1.C8808v4) r5
            boolean r5 = r5.mo9635e()
            r5 = r5 ^ r9
            r2.setEnableRefresh(r5)
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r3.getFeedObject()
            te3.kf1 r2 = r2.object_extend
            if (r2 == 0) goto L_0x01fa
            te3.rh0 r2 = r2.f136745d
            if (r2 == 0) goto L_0x01fa
            android.widget.TextView r5 = r1.f43631f
            if (r5 == 0) goto L_0x01f4
            r5.setVisibility(r7)
            android.content.Context r6 = r5.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131829409(0x7f1122a1, float:1.9291786E38)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.String r12 = r2.f140918e
            r11[r7] = r12
            java.lang.String r6 = r6.getString(r10, r11)
            r5.setText(r6)
            android.widget.TextView r5 = r1.f43632g
            if (r5 == 0) goto L_0x01ee
            r5.setVisibility(r7)
            android.content.Context r6 = r5.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131829414(0x7f1122a6, float:1.9291796E38)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r2 = r2.f140921h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r7] = r2
            java.lang.String r2 = r6.getString(r10, r9)
            r5.setText(r2)
            goto L_0x01fa
        L_0x01ee:
            java.lang.String r0 = "headerDescTv"
            gy3.C87412m.m108603p(r0)
            throw r8
        L_0x01f4:
            java.lang.String r0 = "headerTitleTv"
            gy3.C87412m.m108603p(r0)
            throw r8
        L_0x01fa:
            java.lang.String r2 = r3.getUserName()
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x021a
            android.widget.ImageView r2 = r1.f43635j
            if (r2 == 0) goto L_0x0214
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x021a
        L_0x0214:
            java.lang.String r0 = "headerMoreIv"
            gy3.C87412m.m108603p(r0)
            throw r8
        L_0x021a:
            r0.mo14811c()
            zn1.k r2 = r0.f43646e
            if (r2 == 0) goto L_0x0238
            r2.mo14809k()
            if (r4 != 0) goto L_0x022a
            r0.mo14815g()
            goto L_0x0248
        L_0x022a:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?> r0 = r0.f43647f
            if (r0 == 0) goto L_0x0232
            r0.notifyDataSetChanged()
            goto L_0x0248
        L_0x0232:
            java.lang.String r0 = "adapter"
            gy3.C87412m.m108603p(r0)
            throw r8
        L_0x0238:
            java.lang.String r0 = "viewCallBack"
            gy3.C87412m.m108603p(r0)
            throw r8
        L_0x023f:
            if (r20 != 0) goto L_0x0248
            if (r21 == 0) goto L_0x0248
            zn1.l r0 = r1.f43629d
            r0.mo14814f()
        L_0x0248:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.C16322k.mo3766g(boolean, boolean, int):void");
    }

    /* renamed from: h */
    public final FinderPlayListDrawer mo14806h() {
        FinderPlayListDrawer finderPlayListDrawer = this.f43630e;
        if (finderPlayListDrawer != null) {
            return finderPlayListDrawer;
        }
        C87412m.m108603p("playListDrawer");
        throw null;
    }

    /* renamed from: i */
    public final View mo14807i() {
        View view = this.f43639q;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("retryView");
        throw null;
    }

    /* renamed from: j */
    public final RefreshLoadMoreLayout mo14808j() {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f43640r;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: k */
    public final void mo14809k() {
        mo14804c().setVisibility(8);
        mo14807i().setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: l */
    public final void mo14810l() {
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            Log.m105924i("Finder.FinderPlayListDrawerBuilder", "showLoading return for teen mode.");
            return;
        }
        mo14804c().setVisibility(0);
        View view = this.f43637o;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View d = mo14805d();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = d;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View i = mo14807i();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(i, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(i, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }
}
