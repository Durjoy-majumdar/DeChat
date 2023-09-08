package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C112919c0;
import as1.C0201a;
import bl3.C113200q;
import bl3.C54492n;
import bs1.C0368a;
import bs1.C0370b;
import bs1.C0371c;
import bs1.C0375d;
import c30.C104289g;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPageExposeStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import com.tencent.p014mm.plugin.finder.view.drawer.FinderDraggableLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import ds1.C7515a;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8820z3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kg3.C76577a;
import l31.C61212e;
import qo3.C89779i0;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import vn3.C118694m;
import z04.C112551y;

@C113200q(initialMode = 2)
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC */
public final class FinderProfileDrawerUIC extends UIComponent implements C8820z3 {

    /* renamed from: d */
    public VASCommonFragment f18764d;

    /* renamed from: e */
    public int f18765e;

    /* renamed from: f */
    public C0201a f18766f;

    /* renamed from: g */
    public FrameLayout f18767g;

    /* renamed from: h */
    public boolean f18768h = true;

    /* renamed from: i */
    public String f18769i = "";

    /* renamed from: j */
    public boolean f18770j = true;

    /* renamed from: n */
    public C89779i0 f18771n;

    /* renamed from: o */
    public CopyOnWriteArrayList<RecyclerViewDrawerSquares.C45117c> f18772o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    public long f18773p;

    /* renamed from: q */
    public final FinderProfileDrawerUIC$changeFeedListener$1 f18774q;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$a */
    public final class C4315a extends C0375d {
        public C4315a() {
        }

        /* renamed from: b */
        public void mo412b(C0201a aVar) {
            C87412m.m108594g(aVar, "layout");
            FinderProfileDrawerUIC.m4493c3(FinderProfileDrawerUIC.this, true);
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86150RW(FinderProfileDrawerUIC.this.f18764d, true);
            for (RecyclerViewDrawerSquares.C45117c g : FinderProfileDrawerUIC.this.f18772o) {
                g.mo3766g(false, false, 0);
            }
        }

        /* renamed from: d */
        public void mo414d(C0201a aVar) {
            C87412m.m108594g(aVar, "layout");
            FinderProfileDrawerUIC.m4493c3(FinderProfileDrawerUIC.this, false);
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86143M0(FinderProfileDrawerUIC.this.f18764d);
            for (RecyclerViewDrawerSquares.C45117c g : FinderProfileDrawerUIC.this.f18772o) {
                g.mo3766g(true, false, 0);
            }
        }

        /* renamed from: f */
        public void mo409f(C0201a aVar, float f, String str) {
            C87412m.m108594g(aVar, "layout");
            C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
            super.mo409f(aVar, f, str);
            for (RecyclerViewDrawerSquares.C45117c cVar : FinderProfileDrawerUIC.this.f18772o) {
                float f2 = 1.0f;
                float borderExpand = ((f - aVar.getBorderExpand()) * 1.0f) / (aVar.getBorderClose() - aVar.getBorderExpand());
                if (borderExpand < 0.0f) {
                    borderExpand = 0.0f;
                }
                if (borderExpand <= 1.0f) {
                    f2 = borderExpand;
                }
                Log.m105924i(C54492n.TAG, "onTranslationChange translation: " + f + " percent: " + f2);
                cVar.mo9497e(f2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$b */
    public static final class C4316b extends C87413o implements C32226l<C0201a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDrawerUIC f18776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4316b(FinderProfileDrawerUIC finderProfileDrawerUIC) {
            super(1);
            this.f18776d = finderProfileDrawerUIC;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C0201a) obj, LocaleUtil.ITALIAN);
            Iterator<RecyclerViewDrawerSquares.C45117c> it = this.f18776d.f18772o.iterator();
            while (it.hasNext()) {
                it.next().mo9498f();
            }
            this.f18776d.f18772o.clear();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$c */
    public static final class C4317c extends C87413o implements C32226l<VASActivity, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDrawerUIC f18777d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4317c(FinderProfileDrawerUIC finderProfileDrawerUIC) {
            super(1);
            this.f18777d = finderProfileDrawerUIC;
        }

        public Object invoke(Object obj) {
            VASActivity vASActivity = (VASActivity) obj;
            C0201a aVar = this.f18777d.f18766f;
            if (aVar != null) {
                aVar.mo4919k(-aVar.f18132i, false);
            }
            FinderProfileUI finderProfileUI = vASActivity instanceof FinderProfileUI ? (FinderProfileUI) vASActivity : null;
            if (finderProfileUI != null) {
                finderProfileUI.f14745p = new C4334h(this.f18777d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$d */
    public static final class C4318d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDrawerUIC f18778d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4318d(FinderProfileDrawerUIC finderProfileDrawerUIC) {
            super(0);
            this.f18778d = finderProfileDrawerUIC;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
            if (((com.google.android.material.appbar.AppBarLayout.Behavior) r1).mo146259w() != 0) goto L_0x0049;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r3 = this;
                com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC r0 = r3.f18778d
                com.tencent.mm.ui.vas.VASCommonFragment r0 = r0.f18764d
                r1 = 0
                if (r0 == 0) goto L_0x000a
                com.tencent.mm.ui.vas.VASActivity r0 = r0.f348642o
                goto L_0x000b
            L_0x000a:
                r0 = r1
            L_0x000b:
                boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI
                if (r2 == 0) goto L_0x0012
                r1 = r0
                com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI r1 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI) r1
            L_0x0012:
                r0 = 1
                if (r1 == 0) goto L_0x004a
                bl3.r r2 = bl3.C39818r.f106831a
                bl3.r$a r1 = r2.mo62444c(r1)
                java.lang.Class<mo1.a> r2 = mo1.C10943a.class
                bl3.t r1 = r1.mo62449e(r2)
                mo1.a r1 = (mo1.C10943a) r1
                if (r1 == 0) goto L_0x0049
                rx3.g r1 = r1.f32633o
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                java.lang.String r2 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"
                gy3.C87412m.m108592e(r1, r2)
                androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.f306328a
                boolean r2 = r1 instanceof com.google.android.material.appbar.AppBarLayout.Behavior
                if (r2 == 0) goto L_0x004a
                com.google.android.material.appbar.AppBarLayout$Behavior r1 = (com.google.android.material.appbar.AppBarLayout.Behavior) r1
                int r1 = r1.mo146259w()
                if (r1 != 0) goto L_0x0049
                goto L_0x004a
            L_0x0049:
                r0 = 0
            L_0x004a:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.C4318d.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$e */
    public static final class C4319e extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDrawerUIC f18779d;

        /* renamed from: e */
        public final /* synthetic */ long f18780e;

        /* renamed from: f */
        public final /* synthetic */ int f18781f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4319e(FinderProfileDrawerUIC finderProfileDrawerUIC, long j, int i) {
            super(1);
            this.f18779d = finderProfileDrawerUIC;
            this.f18780e = j;
            this.f18781f = i;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            this.f18779d.mo5170f3(this.f18780e, this.f18781f - 1, (C0740i2) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileDrawerUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f18774q = new FinderProfileDrawerUIC$changeFeedListener$1(appCompatActivity, this);
    }

    /* renamed from: c3 */
    public static final void m4493c3(FinderProfileDrawerUIC finderProfileDrawerUIC, boolean z) {
        VASActivity vASActivity;
        String str;
        String str2;
        FinderProfileDrawerUIC finderProfileDrawerUIC2 = finderProfileDrawerUIC;
        boolean z2 = z;
        VASCommonFragment vASCommonFragment = finderProfileDrawerUIC2.f18764d;
        if (vASCommonFragment != null && (vASActivity = vASCommonFragment.f348642o) != null) {
            String stringExtra = vASActivity.getIntent().getStringExtra("finder_username");
            String str3 = "";
            if (stringExtra == null) {
                stringExtra = str3;
            }
            String stringExtra2 = vASActivity.getIntent().getStringExtra("KEY_RINGTONE_REPORT_JSON");
            if (stringExtra2 == null) {
                stringExtra2 = str3;
            }
            String stringExtra3 = vASActivity.getIntent().getStringExtra("key_udf_kv");
            if (stringExtra3 == null) {
                stringExtra3 = str3;
            }
            boolean z3 = true;
            C104289g gVar = stringExtra3.length() > 0 ? new C104289g(stringExtra3) : new C104289g();
            C13442s8 f = C13442s8.f38060Q0.mo12873f(vASActivity);
            String str4 = null;
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            int i = q3 != null ? q3.f134675i : 0;
            Log.m105924i("FinderPageExposeUIC", "report21874: isExit = " + z2 + ", commentScene = " + i + ", visibleTimestamp = " + finderProfileDrawerUIC2.f18773p);
            if (i != 0) {
                if (z2 && finderProfileDrawerUIC2.f18773p <= 0) {
                    return;
                }
                if (z2 || finderProfileDrawerUIC2.f18773p <= 0) {
                    FinderPageExposeStruct finderPageExposeStruct = new FinderPageExposeStruct();
                    finderPageExposeStruct.mo1036z(q3 != null ? q3.f134670d : null);
                    finderPageExposeStruct.mo1032v(q3 != null ? q3.f134671e : null);
                    if (q3 != null) {
                        str4 = q3.f134672f;
                    }
                    finderPageExposeStruct.mo1029s(str4);
                    finderPageExposeStruct.mo1030t(String.valueOf(i));
                    finderPageExposeStruct.mo1035y(String.valueOf(q3 != null ? q3.f134677n : 0));
                    finderPageExposeStruct.f9879g = z2 ? 1 : 0;
                    finderPageExposeStruct.mo1031u(String.valueOf(C31543z5.m39453c()));
                    finderPageExposeStruct.mo1033w(stringExtra);
                    finderPageExposeStruct.f9885m = z2 ? C31543z5.m39453c() - finderProfileDrawerUIC2.f18773p : 0;
                    if (stringExtra2.length() <= 0) {
                        z3 = false;
                    }
                    if (z3) {
                        gVar.put("bell_info", stringExtra2);
                    }
                    if (!z2) {
                        gVar.put("finder_username", stringExtra);
                    }
                    if (gVar.length() > 0) {
                        String gVar2 = gVar.toString();
                        C87412m.m108593f(gVar2, "kvJson.toString()");
                        str = C112551y.m153814n(gVar2, ",", ";", false);
                    } else {
                        str = str3;
                    }
                    finderPageExposeStruct.mo1028A(str);
                    if (!(q3 == null || (str2 = q3.f134686w) == null)) {
                        str3 = str2;
                    }
                    finderPageExposeStruct.mo1034x(str3);
                    finderPageExposeStruct.mo86054n();
                    ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderPageExposeStruct);
                    finderProfileDrawerUIC2.f18773p = z2 ? 0 : C31543z5.m39453c();
                }
            }
        }
    }

    /* renamed from: d3 */
    public final void mo5168d3(int i) {
        C0201a aVar = this.f18766f;
        if (aVar == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(C0966R.C0970id.md6);
            frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(C0966R.color.ahf));
            this.f18767g = frameLayout;
            float j = i > 0 ? (float) i : ((float) (C76577a.m92159j(getContext()) + C85875k4.m106198o(getContext()))) * C7515a.f25777a.mo8637a(getContext());
            C0201a.C0202a aVar2 = new C0201a.C0202a();
            aVar2.f712d = j;
            aVar2.f713e = new C0371c(getContext(), 0, 0, 0, false, 30, (C8480h) null);
            FrameLayout frameLayout2 = this.f18767g;
            C87412m.m108591d(frameLayout2);
            aVar2.f714f = new C0370b(frameLayout2);
            ((HashSet) aVar2.f716h).add(new C4315a());
            aVar2.f715g = new C0368a(getContext(), false);
            View findViewById = findViewById(16908290);
            C87412m.m108593f(findViewById, "findViewById(android.R.id.content)");
            C0201a a = aVar2.mo235a((ViewGroup) findViewById);
            this.f18766f = a;
            a.setOnDrawerDetach(new C4316b(this));
        } else if (i > 0) {
            aVar.setExpandHeight((float) i);
        }
    }

    /* renamed from: e3 */
    public final void mo5169e3(Intent intent, int i) {
        C87412m.m108594g(intent, "intent");
        String stringExtra = intent.getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f18769i = stringExtra;
        long longExtra = intent.getLongExtra("finder_read_feed_id", 0);
        int hashCode = this.f18769i.hashCode() ^ ((int) (longExtra ^ (longExtra >>> 32)));
        if (this.f18765e != hashCode) {
            mo5168d3(i);
            C112919c0 beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            C87412m.m108593f(beginTransaction, "activity.supportFragmentManager.beginTransaction()");
            FrameLayout frameLayout = this.f18767g;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            VASCommonFragment b = C118694m.m167384b("com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI", intent, false, 4, (Object) null);
            this.f18764d = b;
            b.f348636F = new C4317c(this);
            C0201a aVar = this.f18766f;
            if (aVar != null) {
                aVar.setContentReachTop(new C4318d(this));
            }
            VASCommonFragment vASCommonFragment = this.f18764d;
            C87412m.m108591d(vASCommonFragment);
            beginTransaction.mo165200l(C0966R.C0970id.md6, vASCommonFragment);
            beginTransaction.mo165164f();
            this.f18765e = hashCode;
            return;
        }
        C0201a aVar2 = this.f18766f;
        if (aVar2 != null) {
            aVar2.mo4919k(-aVar2.f18132i, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013e A[SYNTHETIC] */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5170f3(long r19, int r21, cm1.C0740i2 r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            r4 = 0
            java.lang.String r5 = "tryScrollToFeed feedId="
            java.lang.String r6 = "SimpleUIComponent"
            if (r3 != 0) goto L_0x002f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = ", maxFindPage=0, return"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            qo3.i0 r1 = r0.f18771n
            if (r1 == 0) goto L_0x002c
            r1.dismiss()
        L_0x002c:
            r0.f18771n = r4
            return
        L_0x002f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r8 = o40.C61926c.m72691p(r19)
            r7.append(r8)
            java.lang.String r8 = ", maxFindPage="
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            android.app.Activity r7 = r18.getContext()
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileTimeLineUI
            if (r8 == 0) goto L_0x0058
            com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI r7 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileTimeLineUI) r7
            goto L_0x0059
        L_0x0058:
            r7 = r4
        L_0x0059:
            if (r7 != 0) goto L_0x005c
            return
        L_0x005c:
            com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r8 = r7.f14728p
            java.lang.String r9 = "presenter"
            if (r8 == 0) goto L_0x01ea
            com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r8 = r8.mo2583x()
            if (r22 != 0) goto L_0x0090
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r12 = r8.getDataList()
            java.util.Iterator r12 = r12.iterator()
        L_0x0070:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x008b
            java.lang.Object r13 = r12.next()
            r14 = r13
            cm1.i2 r14 = (cm1.C0740i2) r14
            long r14 = r14.getItemId()
            int r16 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x0087
            r14 = 1
            goto L_0x0088
        L_0x0087:
            r14 = 0
        L_0x0088:
            if (r14 == 0) goto L_0x0070
            goto L_0x008c
        L_0x008b:
            r13 = r4
        L_0x008c:
            r12 = r13
            cm1.i2 r12 = (cm1.C0740i2) r12
            goto L_0x0092
        L_0x0090:
            r12 = r22
        L_0x0092:
            rs1.s8$a r13 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r14 = r18.getActivity()
            rs1.s8 r13 = r13.mo12873f(r14)
            if (r13 == 0) goto L_0x00a3
            te3.hj1 r13 = r13.mo12861q3()
            goto L_0x00a4
        L_0x00a3:
            r13 = r4
        L_0x00a4:
            if (r13 == 0) goto L_0x00a9
            int r13 = r13.f134675i
            goto L_0x00aa
        L_0x00a9:
            r13 = 0
        L_0x00aa:
            boolean r14 = r12 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r14 == 0) goto L_0x0115
            co1.b r14 = co1.C0898b.f2115a
            co1.b$a r15 = r14.mo785a()
            boolean r15 = r15.mo786a()
            if (r15 == 0) goto L_0x0115
            java.lang.String r15 = "tryScrollToFeed"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "startPreloadVideo "
            r10.append(r11)
            r10.append(r15)
            java.lang.String r11 = " feedId:"
            r10.append(r11)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r12
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
            r17 = r5
            long r4 = r11.f164794id
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            r4.add(r5)
            com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r5 = r7.f14728p
            if (r5 == 0) goto L_0x0110
            com.tencent.mm.plugin.finder.video.FinderVideoCore r5 = r5.f13153x
            com.tencent.mm.plugin.finder.preload.MediaPreloadCore r5 = r5.f161830p
            if (r5 == 0) goto L_0x0117
            co1.b$a r9 = r14.mo785a()
            int r9 = r9.f2118c
            r5.mo78448j3(r15, r13, r4, r9)
            goto L_0x0117
        L_0x0110:
            gy3.C87412m.m108603p(r9)
            r1 = 0
            throw r1
        L_0x0115:
            r17 = r5
        L_0x0117:
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r4 = r8.getDataList()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x0120:
            boolean r9 = r4.hasNext()
            r10 = -1
            if (r9 == 0) goto L_0x013e
            java.lang.Object r9 = r4.next()
            cm1.i2 r9 = (cm1.C0740i2) r9
            long r11 = r9.getItemId()
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x0137
            r9 = 1
            goto L_0x0138
        L_0x0137:
            r9 = 0
        L_0x0138:
            if (r9 == 0) goto L_0x013b
            goto L_0x013f
        L_0x013b:
            int r5 = r5 + 1
            goto L_0x0120
        L_0x013e:
            r5 = -1
        L_0x013f:
            if (r5 == r10) goto L_0x0197
            kf1.g8 r1 = r7.f14733u
            if (r1 == 0) goto L_0x018c
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.mo10233c(r3)
            java.lang.Object[] r7 = r2.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProfileDrawerUIC"
            java.lang.String r9 = "tryScrollToFeed"
            java.lang.String r10 = "(JILcom/tencent/mm/plugin/finder/model/RVFeed;)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "scrollToPosition"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.mo17115r1(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProfileDrawerUIC"
            java.lang.String r8 = "tryScrollToFeed"
            java.lang.String r9 = "(JILcom/tencent/mm/plugin/finder/model/RVFeed;)V"
            java.lang.String r10 = "Undefined"
            java.lang.String r11 = "scrollToPosition"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x018c:
            qo3.i0 r1 = r0.f18771n
            if (r1 == 0) goto L_0x0193
            r1.dismiss()
        L_0x0193:
            r1 = 0
            r0.f18771n = r1
            return
        L_0x0197:
            boolean r4 = r8.getHasMore()
            if (r4 != 0) goto L_0x01c1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r17
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", hasMore=false, return"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            qo3.i0 r1 = r0.f18771n
            if (r1 == 0) goto L_0x01bd
            r1.dismiss()
        L_0x01bd:
            r1 = 0
            r0.f18771n = r1
            return
        L_0x01c1:
            qo3.i0 r4 = r0.f18771n
            if (r4 != 0) goto L_0x01db
            android.app.Activity r9 = r18.getContext()
            r4 = 2131832197(0x7f112d85, float:1.9297441E38)
            java.lang.String r11 = r0.getString(r4)
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r10 = ""
            qo3.i0 r4 = nj3.C76879j.m92723Q(r9, r10, r11, r12, r13, r14)
            r0.f18771n = r4
        L_0x01db:
            com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$e r4 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$e
            r4.<init>(r0, r1, r3)
            r8.callOnNextFetch(r4)
            r1 = 1
            r2 = 0
            r3 = 0
            com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(r8, r2, r1, r3)
            return
        L_0x01ea:
            r3 = r4
            gy3.C87412m.m108603p(r9)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.mo5170f3(long, int, cm1.i2):void");
    }

    public boolean onBackPressed() {
        C0201a aVar = this.f18766f;
        if (!(aVar != null ? aVar.f18137q : false)) {
            return super.onBackPressed();
        }
        if (aVar != null) {
            FinderDraggableLayout.m4279a(aVar, false, 1, (Object) null);
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo5168d3(0);
        this.f18774q.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f18774q.dead();
        this.f18766f = null;
    }

    public void onPause() {
        super.onPause();
        this.f18770j = false;
    }

    public void onResume() {
        super.onResume();
        this.f18770j = true;
        if (this.f18768h) {
            this.f18768h = false;
            return;
        }
        C0201a aVar = this.f18766f;
        if (aVar != null) {
            FinderDraggableLayout.m4280l(aVar, 0, false, 3, (Object) null);
        }
    }
}
