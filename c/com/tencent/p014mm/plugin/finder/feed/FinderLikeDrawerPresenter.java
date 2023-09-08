package com.tencent.p014mm.plugin.finder.feed;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0777t2;
import cm1.C0793y;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C75592q0;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7832m3;
import er1.C7878t0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArraySet;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9500j;
import kf1.C10024w3;
import kf1.C10047xb;
import kf1.C9969s3;
import pe3.C89349b;
import te3.C50405mi0;
import te3.C50581nr0;
import u60.C14121l;
import u60.C65233m;
import up1.C37521f;
import ur1.C14378f;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter */
public class FinderLikeDrawerPresenter implements C10047xb, C60898l.C9502b<C60905o>, C60898l.C9503c<C60905o>, C9487b<C9486a> {

    /* renamed from: d */
    public FinderItem f13100d;

    /* renamed from: e */
    public C89349b f13101e;

    /* renamed from: f */
    public C65233m f13102f;

    /* renamed from: g */
    public final ArrayList<C0793y> f13103g = new ArrayList<>();

    /* renamed from: h */
    public final String f13104h = C75592q0.m90789s();

    /* renamed from: i */
    public C60905o f13105i;

    /* renamed from: j */
    public C14378f f13106j;

    /* renamed from: n */
    public boolean f13107n;

    /* renamed from: o */
    public boolean f13108o = true;

    /* renamed from: p */
    public int f13109p;

    /* renamed from: q */
    public final C0777t2 f13110q = new C0777t2();

    /* renamed from: r */
    public volatile C89349b f13111r;

    /* renamed from: s */
    public final CopyOnWriteArraySet<C9486a> f13112s = new CopyOnWriteArraySet<>();

    /* renamed from: t */
    public boolean f13113t;

    /* renamed from: u */
    public boolean f13114u;

    /* renamed from: v */
    public boolean f13115v;

    /* renamed from: w */
    public final C2525b f13116w = new C2525b(this);

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$a */
    public static final class C2524a extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$b */
    public static final class C2525b extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ FinderLikeDrawerPresenter f13117a;

        public C2525b(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
            this.f13117a = finderLikeDrawerPresenter;
        }

        /* renamed from: b */
        public void mo2556b() {
            this.f13117a.mo2555o();
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            this.f13117a.mo2555o();
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            mo2557c(i, i2);
            this.f13117a.mo2555o();
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            this.f13117a.mo2555o();
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            this.f13117a.mo2555o();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$c */
    public static final class C2526c extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ FinderLikeDrawerPresenter f13118a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$c$a */
        public static final class C2527a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderLikeDrawerPresenter f13119d;

            public C2527a(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
                this.f13119d = finderLikeDrawerPresenter;
            }

            public final void run() {
                FinderLikeDrawerPresenter finderLikeDrawerPresenter = this.f13119d;
                C65233m mVar = finderLikeDrawerPresenter.f13102f;
                if (mVar != null) {
                    mVar.mo11856a(new C14121l(new C9969s3(finderLikeDrawerPresenter), (String) null, 2, (C8480h) null));
                }
            }
        }

        public C2526c(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
            this.f13118a = finderLikeDrawerPresenter;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C2527a(this.f13118a));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C14378f fVar;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            FinderLikeDrawerPresenter finderLikeDrawerPresenter = this.f13118a;
            if (!finderLikeDrawerPresenter.f13108o && (fVar = finderLikeDrawerPresenter.f13106j) != null) {
                RefreshLoadMoreLayout.m66896C(fVar.mo13681i(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            }
        }
    }

    /* renamed from: h */
    public static final boolean m2448h(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
        finderLikeDrawerPresenter.getClass();
        C37521f.f99374d.getClass();
        return (C37521f.f99230M2.mo60266n().intValue() == 1 || finderLikeDrawerPresenter.f13114u) && !C58739j4.f168176a.mo83687P();
    }

    /* renamed from: a */
    public RecyclerView.C0129l mo2531a(Context context) {
        C87412m.m108594g(context, "context");
        return new C2524a();
    }

    /* renamed from: b */
    public RecyclerView.LayoutManager mo2532b(Context context) {
        C87412m.m108594g(context, "context");
        return new LinearLayoutManager(context, 1, false);
    }

    /* renamed from: c */
    public WxRecyclerAdapter<?> mo2533c(Context context) {
        C87412m.m108594g(context, "context");
        WxRecyclerAdapter<?> wxRecyclerAdapter = new WxRecyclerAdapter<>(mo2538j(), this.f13103g, true);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f173488o = this;
        wxRecyclerAdapter.f173487n = this;
        return wxRecyclerAdapter;
    }

    /* renamed from: d */
    public void mo2534d(Context context, FrameLayout frameLayout) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout, "headerLayout");
    }

    /* renamed from: e */
    public int mo2550e() {
        return this.f13109p;
    }

    /* renamed from: f */
    public void mo2535f(View view) {
        C87412m.m108594g(view, "view");
    }

    /* renamed from: g */
    public void mo2536g(C14378f fVar, FinderItem finderItem, C89349b bVar) {
        C14378f fVar2;
        C87412m.m108594g(fVar, "builder");
        C87412m.m108594g(finderItem, "feedObj");
        this.f13100d = finderItem;
        this.f13101e = bVar;
        this.f13102f = new C65233m("FinderLikeExecutor");
        this.f13106j = fVar;
        Log.m105924i("Finder.DrawerPresenter", "onAttach " + finderItem.getId());
        C65233m mVar = this.f13102f;
        if (mVar != null) {
            mVar.mo89361d();
        }
        mo2555o();
        this.f13103g.clear();
        try {
            RecyclerView.C16613e adapter = fVar.mo13681i().getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f13116w);
            }
        } catch (IllegalStateException e) {
            Log.printErrStackTrace("Finder.DrawerPresenter", e, "", new Object[0]);
        }
        fVar.mo13676a(false);
        C14378f fVar3 = this.f13106j;
        if (fVar3 != null) {
            fVar3.mo13678c().mo82529d(true);
        }
        fVar.mo13681i().getRecyclerView().setLayoutFrozen(false);
        fVar.mo13681i().setActionCallback(new C2526c(this));
        C14378f fVar4 = this.f13106j;
        if (fVar4 != null) {
            FrameLayout frameLayout = fVar4.f39935h;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                fVar4.mo13680h().setOnClickListener((View.OnClickListener) null);
            } else {
                C87412m.m108603p("loadingLayout");
                throw null;
            }
        }
        C14378f fVar5 = this.f13106j;
        if (fVar5 != null) {
            fVar5.mo13682j();
        }
        C65233m mVar2 = this.f13102f;
        if (mVar2 != null) {
            mVar2.mo11856a(new C14121l(new C10024w3(true, this, (C32226l<? super LinkedList<C50581nr0>, ? extends LinkedList<C50581nr0>>) null), (String) null, 2, (C8480h) null));
        }
        if (!this.f13108o && (fVar2 = this.f13106j) != null) {
            RefreshLoadMoreLayout.m66896C(fVar2.mo13681i(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
        }
        this.f13113t = true;
    }

    public int getScene() {
        FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
        return 2;
    }

    /* renamed from: i */
    public final FinderItem mo2551i() {
        FinderItem finderItem = this.f13100d;
        if (finderItem != null) {
            return finderItem;
        }
        C87412m.m108603p("feedObj");
        throw null;
    }

    /* renamed from: j */
    public C9500j mo2538j() {
        return new FinderLikeDrawerPresenter$getItemConvertFactory$1(this);
    }

    /* renamed from: k */
    public CharSequence mo2539k() {
        if (mo2553l(mo2551i())) {
            C14378f fVar = this.f13106j;
            String string = fVar != null ? fVar.mo13677b().getString(C0966R.string.foe, new Object[]{C7878t0.m8035d((long) this.f13109p)}) : null;
            C14378f fVar2 = this.f13106j;
            if (fVar2 == null) {
                return "";
            }
            Context b = fVar2.mo13677b();
            return C7832m3.m7968c(C7832m3.f26372a, 0, string == null ? "" : string, b, true, b.getResources().getColor(C0966R.color.FG_0), 0, false, 96, (Object) null);
        }
        Context context = MMApplicationContext.getContext();
        String string2 = context.getString(C0966R.string.fon, new Object[]{Integer.valueOf(Util.safeParseInt(C7878t0.m8035d((long) this.f13109p)))});
        C87412m.m108593f(string2, "context.getString(R.stri…osterNumber(totalCount)))");
        int dimension = (int) context.getResources().getDimension(C0966R.dimen.f3736cp);
        C58784w3 w3Var = C58784w3.f168295a;
        Integer b0 = w3Var.mo83917b0(1, true);
        return w3Var.mo83957q1(context, string2, '#', b0 != null ? b0.intValue() : C0966R.raw.icons_filled_channels_like_bold, C0966R.color.FG_0, dimension, dimension);
    }

    public void keep(C9486a aVar) {
        this.f13112s.add(aVar);
    }

    /* renamed from: l */
    public final boolean mo2553l(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "item");
        return finderItem.getFeedObject().objectType == 1;
    }

    /* renamed from: m */
    public final void mo2554m(boolean z) {
        this.f13108o = z;
        Log.m105924i("Finder.DrawerPresenter", "set downContinue " + z);
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2555o() {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f13109p
            java.lang.String r2 = "headerTitleTv"
            r3 = 1
            r4 = 0
            java.lang.String r5 = ""
            if (r1 > 0) goto L_0x006e
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ur1.f r1 = r0.f13106j
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.mo13677b()
            android.content.res.Resources r1 = r1.getResources()
            goto L_0x001e
        L_0x001d:
            r1 = r4
        L_0x001e:
            if (r1 == 0) goto L_0x002c
            r6 = 2131826874(0x7f1118ba, float:1.9286645E38)
            java.lang.String r1 = r1.getString(r6)
            if (r1 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r8 = r1
            goto L_0x002d
        L_0x002c:
            r8 = r5
        L_0x002d:
            android.content.res.Resources r1 = r7.getResources()
            r5 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r1 = r1.getDimension(r5)
            int r13 = (int) r1
            er1.w3 r6 = er1.C58784w3.f168295a
            java.lang.Integer r1 = r6.mo83917b0(r3, r3)
            if (r1 == 0) goto L_0x0047
            int r1 = r1.intValue()
            r10 = r1
            goto L_0x004d
        L_0x0047:
            r1 = 2131755982(0x7f1003ce, float:1.9142859E38)
            r10 = 2131755982(0x7f1003ce, float:1.9142859E38)
        L_0x004d:
            ur1.f r1 = r0.f13106j
            if (r1 == 0) goto L_0x005b
            android.widget.TextView r1 = r1.f39932e
            if (r1 == 0) goto L_0x0057
            r4 = r1
            goto L_0x005b
        L_0x0057:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x005b:
            if (r4 != 0) goto L_0x005f
            goto L_0x0184
        L_0x005f:
            r9 = 35
            r11 = 2131099800(0x7f060098, float:1.7811963E38)
            r12 = r13
            java.lang.CharSequence r1 = r6.mo83957q1(r7, r8, r9, r10, r11, r12, r13)
            r4.setText(r1)
            goto L_0x0184
        L_0x006e:
            wp1.j r1 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r21.mo2551i()
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
            int r6 = r6.objectType
            te3.if1 r14 = r1.mo14351c(r6)
            cm1.t2 r1 = r0.f13110q
            r6 = 3
            r1.getClass()
            r1 = 0
            if (r14 == 0) goto L_0x00a1
            java.util.LinkedList<te3.df1> r7 = r14.f135276v
            if (r7 == 0) goto L_0x00a1
            java.util.Iterator r7 = r7.iterator()
        L_0x008f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00a1
            java.lang.Object r8 = r7.next()
            te3.df1 r8 = (te3.C49138df1) r8
            int r8 = r8.f132282d
            if (r8 != r6) goto L_0x008f
            r6 = 1
            goto L_0x00a2
        L_0x00a1:
            r6 = 0
        L_0x00a2:
            if (r14 == 0) goto L_0x0156
            java.lang.String r7 = r14.f135264g
            if (r7 == 0) goto L_0x00ae
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00af
        L_0x00ae:
            r1 = 1
        L_0x00af:
            if (r1 == 0) goto L_0x00b5
            if (r6 != 0) goto L_0x00b5
            goto L_0x0156
        L_0x00b5:
            ur1.f r1 = r0.f13106j
            if (r1 == 0) goto L_0x0184
            android.widget.TextView r9 = r1.f39932e
            if (r9 == 0) goto L_0x0152
            cm1.t2 r1 = r0.f13110q
            android.content.Context r10 = r9.getContext()
            java.lang.String r2 = "context"
            gy3.C87412m.m108593f(r10, r2)
            int r2 = r0.f13109p
            long r6 = (long) r2
            java.lang.String r11 = er1.C7878t0.m8035d(r6)
            java.lang.String r2 = "formatPosterNumber(totalCount)"
            gy3.C87412m.m108593f(r11, r2)
            int r13 = r0.f13109p
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r21.mo2551i()
            boolean r12 = r0.mo2553l(r2)
            android.content.Context r2 = r9.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r6 = 2131099800(0x7f060098, float:1.7811963E38)
            int r2 = r2.getColor(r6)
            r6 = -1
            r1.getClass()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setDrawerDesc :"
            r7.append(r8)
            int r8 = r1.hashCode()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Finder.SyncGetImageModel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            a14.z1 r7 = r1.f1825i
            if (r7 == 0) goto L_0x0113
            a14.C53973z1.C53974a.m60623a(r7, r4, r3, r4)
        L_0x0113:
            boolean r3 = r1.f1820d
            r1.f1820d = r3
            r1.f1821e = r2
            r1.f1822f = r6
            r1.f1824h = r10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "setDesc textView:"
            r2.append(r3)
            java.lang.CharSequence r3 = r9.getText()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            r9.setText(r5)
            r16 = 0
            r17 = 0
            cm1.b3 r18 = new cm1.b3
            r15 = 0
            r7 = r18
            r8 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r19 = 3
            r20 = 0
            r15 = r1
            a14.z1 r2 = cm1.C0777t2.m721i3(r15, r16, r17, r18, r19, r20)
            r1.f1825i = r2
            goto L_0x0184
        L_0x0152:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x0156:
            java.lang.CharSequence r1 = r21.mo2539k()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "no config text:"
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "Finder.DrawerPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            ur1.f r3 = r0.f13106j
            if (r3 == 0) goto L_0x017e
            android.widget.TextView r3 = r3.f39932e
            if (r3 == 0) goto L_0x017a
            r4 = r3
            goto L_0x017e
        L_0x017a:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x017e:
            if (r4 != 0) goto L_0x0181
            goto L_0x0184
        L_0x0181:
            r4.setText(r1)
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter.mo2555o():void");
    }

    public void onDetach() {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        if (!this.f13113t) {
            Log.m105924i("Finder.DrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        this.f13113t = false;
        C65233m mVar = this.f13102f;
        if (mVar != null) {
            mVar.mo89362e();
        }
        this.f13102f = null;
        for (C9486a dead : this.f13112s) {
            dead.dead();
        }
        this.f13112s.clear();
        this.f13103g.clear();
        this.f13111r = null;
        this.f13107n = false;
        Log.m105924i("Finder.DrawerPresenter", "set upContinue false");
        mo2554m(true);
        C14378f fVar = this.f13106j;
        RefreshLoadMoreLayout i = fVar != null ? fVar.mo13681i() : null;
        if (i != null) {
            i.setHasBottomMore(true);
        }
        C14378f fVar2 = this.f13106j;
        if (!(fVar2 == null || (recyclerView = fVar2.mo13681i().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
            adapter.notifyDataSetChanged();
        }
        C14378f fVar3 = this.f13106j;
        RecyclerView recyclerView2 = fVar3 != null ? fVar3.mo13681i().getRecyclerView() : null;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutFrozen(true);
        }
        C14378f fVar4 = this.f13106j;
        RefreshLoadMoreLayout i2 = fVar4 != null ? fVar4.mo13681i() : null;
        if (i2 != null) {
            i2.setActionCallback((RefreshLoadMoreLayout.C57879a) null);
        }
        this.f13106j = null;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C0793y yVar = (C0793y) oVar.f173503E;
        String str = null;
        C50581nr0 nr02 = yVar != null ? yVar.f1851d : null;
        StringBuilder sb = new StringBuilder();
        sb.append("click likeInfo:");
        if (nr02 != null) {
            str = nr02.f138729i;
        }
        sb.append(str);
        Log.m105924i("Finder.DrawerPresenter", sb.toString());
        if (nr02 != null) {
            C58784w3 w3Var = C58784w3.f168295a;
            String userName = mo2551i().getUserName();
            long id = mo2551i().getId();
            String objectNonceId = mo2551i().getObjectNonceId();
            w3Var.getClass();
            C87412m.m108594g(userName, "feedUserName");
            C87412m.m108594g(objectNonceId, "nonceId");
            Intent intent = new Intent();
            if (Util.isNullOrNil(userName) || !C87412m.m108589b(userName, C66785b.f191882e.mo90662O5())) {
                intent.putExtra("Action", 2);
                intent.putExtra("IsPoster", false);
            } else {
                intent.putExtra("IsPoster", true);
                intent.putExtra("Action", 1);
                intent.putExtra("feedUser", userName);
            }
            intent.putExtra("Avatar", nr02.f138725e);
            intent.putExtra("Nickname", nr02.f138724d);
            intent.putExtra("CommentId", nr02.f138726f);
            intent.putExtra("FeedId", id);
            intent.putExtra("FeedNonceId", objectNonceId);
            intent.putExtra("V5UserName", nr02.f138729i);
            C50405mi0 mi02 = nr02.f138732o;
            if (mi02 != null) {
                intent.putExtra("ContactMsgInfo", mi02.toByteArray());
            }
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C58784w3.m68437l1(w3Var, context, nr02.f138729i, intent, 4, (C32226l) null, 16, (Object) null);
            if (nr02.f138732o == null) {
                String str2 = C58784w3.f168296b;
                Log.m105924i(str2, "msgInfo is null ,feedId:" + id + ",likeId:" + nr02.f138726f);
            }
        }
    }
}
