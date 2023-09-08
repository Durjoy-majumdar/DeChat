package uk1;

import ak1.C54067f0;
import ak1.C54116w;
import al1.C54129i;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import bl3.C39818r;
import cj1.C54738b1;
import cl1.C54979h1;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveMiniView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import fe1.C58966m;
import fj1.C45795b;
import fy3.C32224a;
import gh1.C59447j;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import j50.C60735a;
import j50.C60776v;
import java.util.ArrayList;
import kr0.C76630x0;
import ok1.C62042e;
import p165hr.C60106t;
import p646pn.C110234e;
import qj1.C47844c7;
import r50.C63363c;
import rx3.C13598b0;
import t91.C64208c;
import te3.C51292ss1;
import te3.C51439ts1;
import te3.C51870ws1;
import wg1.C53161l1;
import wg1.C53165p1;
import wg1.C66110y2;

/* renamed from: uk1.a */
public final class C65402a {

    /* renamed from: a */
    public FinderLiveMiniView f188207a;

    /* renamed from: b */
    public final C37479g f188208b = new C37479g();

    /* renamed from: c */
    public View.OnClickListener f188209c = new C65403a(this);

    /* renamed from: d */
    public final View.OnClickListener f188210d = new C65405b(this);

    /* renamed from: e */
    public final C60776v f188211e = new C37477c(this);

    /* renamed from: uk1.a$c */
    public static final class C37477c implements C60776v {

        /* renamed from: a */
        public final /* synthetic */ C65402a f99027a;

        public C37477c(C65402a aVar) {
            this.f99027a = aVar;
        }

        /* renamed from: a */
        public void mo61119a() {
            this.f99027a.f188208b.mo61123a(false);
        }

        /* renamed from: b */
        public void mo61120b(boolean z) {
            C37479g gVar = this.f99027a.f188208b;
            boolean z2 = !z;
            gVar.getClass();
            if (!C62042e.f176370a.mo87027N0() && gVar.f99033e > 0) {
                if (z2) {
                    gVar.mo61125c(false);
                }
                gVar.f99030b = 0;
                gVar.f99029a = C31543z5.m39453c();
                gVar.mo61124b();
                Log.m105924i("Finder.FinderLiveMiniWindowReporter", "enterForgound shouldReportExit:" + z2);
            }
        }

        /* renamed from: c */
        public void mo61121c(boolean z) {
            C37479g gVar = this.f99027a.f188208b;
            boolean z2 = !z;
            gVar.getClass();
            if (!C62042e.f176370a.mo87027N0() && gVar.f99033e > 0) {
                boolean z3 = false;
                if (C31543z5.m39453c() - gVar.f99033e < 1000) {
                    Log.m105924i("Finder.FinderLiveMiniWindowReporter", "enterBackground in 1s, skip report enter and exit");
                    z3 = true;
                } else {
                    gVar.mo61125c(false);
                }
                gVar.f99030b = 1;
                gVar.f99029a = C31543z5.m39453c();
                if (z2 && !z3) {
                    gVar.mo61124b();
                }
                Log.m105924i("Finder.FinderLiveMiniWindowReporter", "enterBackground shouldReportEnter:" + z2 + ", skipReport:" + z3);
            }
        }
    }

    /* renamed from: uk1.a$a */
    public static final class C65403a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65402a f188212d;

        /* renamed from: uk1.a$a$a */
        public static final class C65404a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C65402a f188213d;

            /* renamed from: e */
            public final /* synthetic */ View f188214e;

            /* renamed from: f */
            public final /* synthetic */ long f188215f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65404a(C65402a aVar, View view, long j) {
                super(0);
                this.f188213d = aVar;
                this.f188214e = view;
                this.f188215f = j;
            }

            public Object invoke() {
                C65402a aVar = this.f188213d;
                View view = this.f188214e;
                C87412m.m108593f(view, LocaleUtil.ITALIAN);
                C65402a.m77014b(aVar, view, true, this.f188215f);
                return C13598b0.f38549a;
            }
        }

        public C65403a(C65402a aVar) {
            this.f188212d = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x0249 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0260  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x039b  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0146  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0149  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0154  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0159  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x015e  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0186  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x018d  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01a4  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01ba  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0225  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r37) {
            /*
                r36 = this;
                r6 = r36
                r7 = r37
                java.lang.Class<cl1.u> r8 = cl1.C55001u.class
                java.lang.Class<cl1.o> r9 = cl1.C54991o.class
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r7)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/view/mini/FinderLiveMiniWindowManager$miniWindowClickListener$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r36
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                uk1.a r0 = r6.f188212d
                r0.getClass()
                java.lang.ref.WeakReference r0 = com.tencent.p014mm.app.AppForegroundDelegate.m161224g()
                if (r0 == 0) goto L_0x0037
                java.lang.Object r0 = r0.get()
                android.app.Activity r0 = (android.app.Activity) r0
                if (r0 != 0) goto L_0x0047
            L_0x0037:
                com.tencent.mm.app.AppForegroundDelegate r0 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
                java.lang.ref.WeakReference r0 = r0.mo174212f()
                if (r0 == 0) goto L_0x0046
                java.lang.Object r0 = r0.get()
                android.app.Activity r0 = (android.app.Activity) r0
                goto L_0x0047
            L_0x0046:
                r0 = 0
            L_0x0047:
                r2 = 1
                r3 = 0
                if (r0 != 0) goto L_0x004c
                goto L_0x0052
            L_0x004c:
                boolean r0 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveShoppingManagerUI
                if (r0 == 0) goto L_0x0052
                r0 = 1
                goto L_0x0053
            L_0x0052:
                r0 = 0
            L_0x0053:
                java.lang.String r4 = "(Landroid/view/View;)V"
                java.lang.String r5 = "onClick"
                java.lang.String r10 = "android/view/View$OnClickListener"
                java.lang.String r11 = "com/tencent/mm/plugin/finder/live/view/mini/FinderLiveMiniWindowManager$miniWindowClickListener$1"
                if (r0 == 0) goto L_0x007b
                uk1.a r0 = r6.f188212d
                r0.getClass()
                com.tencent.mm.autogen.events.FinderMiniWindowEvent r0 = new com.tencent.mm.autogen.events.FinderMiniWindowEvent
                r0.<init>()
                com.tencent.mm.autogen.events.FinderMiniWindowEvent$a r1 = r0.f154804d
                r1.f154805a = r2
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r2.getClass()
                boolean r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
                r1.f154806b = r2
                r0.publish()
                j20.C117292a.m165361g(r6, r11, r10, r5, r4)
                return
            L_0x007b:
                uk1.a r0 = r6.f188212d
                r0.getClass()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r12 = "miniWindowClickListener onClick "
                r0.append(r12)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r12.getClass()
                al1.i r13 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
                r0.append(r13)
                java.lang.String r0 = r0.toString()
                java.lang.String r13 = "Finder.FinderLiveMiniWindowManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
                uk1.a r0 = r6.f188212d
                uk1.g r0 = r0.f188208b
                r0.mo61123a(r3)
                up1.f r0 = up1.C37521f.f99374d
                r0.getClass()
                pe1.c<java.lang.Integer> r14 = up1.C37521f.f99135B6
                java.lang.Object r15 = r14.mo60266n()
                java.lang.Number r15 = (java.lang.Number) r15
                int r15 = r15.intValue()
                if (r15 != r2) goto L_0x00db
                r0.getClass()
                pe1.c<java.lang.Integer> r15 = up1.C37521f.f99578z6
                java.lang.Object r15 = r15.mo60266n()
                java.lang.Number r15 = (java.lang.Number) r15
                int r15 = r15.intValue()
                if (r15 != r2) goto L_0x00d6
                boolean r15 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
                if (r15 != 0) goto L_0x00d6
                boolean r15 = com.tencent.p014mm.p136ui.C85875k4.m106167X()
                if (r15 != 0) goto L_0x00d6
                r15 = 1
                goto L_0x00d7
            L_0x00d6:
                r15 = 0
            L_0x00d7:
                if (r15 == 0) goto L_0x00db
                r15 = 1
                goto L_0x00dc
            L_0x00db:
                r15 = 0
            L_0x00dc:
                if (r15 == 0) goto L_0x0122
                ph1.i r15 = ph1.C62293i.f177081a
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r1 = "isFluentEnable isUseByWindowDirector: "
                r15.append(r1)
                boolean r1 = ph1.C62293i.f177085e
                r15.append(r1)
                java.lang.String r1 = " isLiveRoomOnDestory: "
                r15.append(r1)
                boolean r1 = ph1.C62293i.f177084d
                r15.append(r1)
                java.lang.String r1 = r15.toString()
                java.lang.String r15 = "FinderFluentSwitchManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
                boolean r1 = ph1.C62293i.f177085e
                if (r1 == 0) goto L_0x010d
                boolean r1 = ph1.C62293i.f177084d
                if (r1 == 0) goto L_0x010b
                goto L_0x010d
            L_0x010b:
                r1 = 0
                goto L_0x010e
            L_0x010d:
                r1 = 1
            L_0x010e:
                if (r1 != 0) goto L_0x0122
                boolean r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
                if (r1 != 0) goto L_0x0122
                uk1.a r0 = r6.f188212d
                r0.getClass()
                java.lang.String r0 = "miniWindowClickListener isEnableFluentClick = false"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
                j20.C117292a.m165361g(r6, r11, r10, r5, r4)
                return
            L_0x0122:
                androidx.lifecycle.i0 r1 = r12.mo77630e(r9)
                cl1.o r1 = (cl1.C54991o) r1
                r17 = 0
                if (r1 == 0) goto L_0x0136
                androidx.lifecycle.i0 r1 = r1.business(r8)
                cl1.u r1 = (cl1.C55001u) r1
                r15 = r4
                long r3 = r1.f154416j
                goto L_0x0139
            L_0x0136:
                r15 = r4
                r3 = r17
            L_0x0139:
                uk1.a r1 = r6.f188212d
                r1.getClass()
                androidx.lifecycle.i0 r1 = r12.mo77630e(r9)
                cl1.o r1 = (cl1.C54991o) r1
                if (r1 == 0) goto L_0x0149
                int r1 = r1.f154291a1
                goto L_0x014a
            L_0x0149:
                r1 = 0
            L_0x014a:
                r2 = 524288(0x80000, float:7.34684E-40)
                boolean r1 = o40.C61926c.m72696u(r1, r2)
                com.tencent.mm.plugin.finder.live.view.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
                if (r2 == 0) goto L_0x0159
                android.content.Context r2 = r2.getContext()
                goto L_0x015a
            L_0x0159:
                r2 = 0
            L_0x015a:
                boolean r2 = r2 instanceof android.app.Activity
                if (r2 == 0) goto L_0x017b
                com.tencent.mm.plugin.finder.live.view.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
                if (r2 == 0) goto L_0x0169
                android.content.Context r2 = r2.getContext()
                r32 = r15
                goto L_0x016c
            L_0x0169:
                r32 = r15
                r2 = 0
            L_0x016c:
                java.lang.String r15 = "null cannot be cast to non-null type android.app.Activity"
                gy3.C87412m.m108592e(r2, r15)
                android.app.Activity r2 = (android.app.Activity) r2
                boolean r2 = r2.isFinishing()
                if (r2 == 0) goto L_0x017d
                r2 = 1
                goto L_0x017e
            L_0x017b:
                r32 = r15
            L_0x017d:
                r2 = 0
            L_0x017e:
                androidx.lifecycle.i0 r15 = r12.mo77630e(r9)
                cl1.o r15 = (cl1.C54991o) r15
                if (r15 == 0) goto L_0x018d
                boolean r15 = r15.mo75997d4()
                r33 = r5
                goto L_0x0190
            L_0x018d:
                r33 = r5
                r15 = 1
            L_0x0190:
                com.tencent.mm.app.AppForegroundDelegate r5 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
                boolean r5 = r5.f343454n
                r34 = r10
                j50.a r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                r35 = r11
                boolean r11 = r10 instanceof p50.C62196c
                if (r11 == 0) goto L_0x01a1
                p50.c r10 = (p50.C62196c) r10
                goto L_0x01a2
            L_0x01a1:
                r10 = 0
            L_0x01a2:
                if (r10 == 0) goto L_0x01ba
                androidx.lifecycle.i0 r8 = r12.mo77630e(r8)
                cl1.u r8 = (cl1.C55001u) r8
                if (r8 == 0) goto L_0x01b3
                te3.c21 r8 = r8.f154420q
                if (r8 == 0) goto L_0x01b3
                long r7 = r8.f182392d
                goto L_0x01b5
            L_0x01b3:
                r7 = r17
            L_0x01b5:
                boolean r7 = r10.mo87264x(r7)
                goto L_0x01bb
            L_0x01ba:
                r7 = 0
            L_0x01bb:
                java.lang.Class<cl1.d> r8 = cl1.C54951d.class
                androidx.lifecycle.i0 r8 = r12.mo77630e(r8)
                cl1.d r8 = (cl1.C54951d) r8
                if (r8 == 0) goto L_0x01ce
                boolean r8 = r8.mo75869e3()
                r10 = 1
                if (r8 != r10) goto L_0x01ce
                r10 = 1
                goto L_0x01cf
            L_0x01ce:
                r10 = 0
            L_0x01cf:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r11 = "isEnableFluentSwitchEnter isPause: "
                r8.append(r11)
                r8.append(r1)
                java.lang.String r11 = " isActivityFinish: "
                r8.append(r11)
                r8.append(r2)
                java.lang.String r11 = " isLiveFinish: "
                r8.append(r11)
                r8.append(r15)
                java.lang.String r11 = " foreground: "
                r8.append(r11)
                r8.append(r5)
                java.lang.String r11 = " isAdPlaying: "
                r8.append(r11)
                r8.append(r10)
                java.lang.String r11 = " isAnchor： "
                r8.append(r11)
                boolean r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
                r8.append(r11)
                java.lang.String r11 = " isVisitorPlaying:"
                r8.append(r11)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r8)
                r0.getClass()
                java.lang.Object r0 = r14.mo60266n()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r8 = 1
                if (r0 != r8) goto L_0x0246
                pe1.c<java.lang.Integer> r0 = up1.C37521f.f99578z6
                java.lang.Object r0 = r0.mo60266n()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                if (r0 != r8) goto L_0x0241
                boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
                if (r0 != 0) goto L_0x0241
                boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106167X()
                if (r0 != 0) goto L_0x0241
                r0 = 1
                goto L_0x0242
            L_0x0241:
                r0 = 0
            L_0x0242:
                if (r0 == 0) goto L_0x0246
                r0 = 1
                goto L_0x0247
            L_0x0246:
                r0 = 0
            L_0x0247:
                if (r0 == 0) goto L_0x025b
                if (r5 == 0) goto L_0x025b
                if (r2 == 0) goto L_0x025b
                if (r15 != 0) goto L_0x025b
                if (r1 != 0) goto L_0x025b
                boolean r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
                if (r0 != 0) goto L_0x025b
                if (r7 == 0) goto L_0x025b
                if (r10 != 0) goto L_0x025b
                r10 = 1
                goto L_0x025c
            L_0x025b:
                r10 = 0
            L_0x025c:
                java.lang.String r0 = "it"
                if (r10 == 0) goto L_0x039b
                j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                boolean r2 = r1 instanceof p50.C62197e
                if (r2 == 0) goto L_0x0269
                p50.e r1 = (p50.C62197e) r1
                goto L_0x026a
            L_0x0269:
                r1 = 0
            L_0x026a:
                if (r1 == 0) goto L_0x0273
                r50.f r2 = r1.f173028o
                if (r2 == 0) goto L_0x0273
                android.view.View r2 = r2.f179749i
                goto L_0x0274
            L_0x0273:
                r2 = 0
            L_0x0274:
                if (r1 == 0) goto L_0x027b
                b50.g r1 = r1.f176822Y0
                f50.d r1 = r1.f152627a
                goto L_0x027c
            L_0x027b:
                r1 = 0
            L_0x027c:
                uk1.a r5 = r6.f188212d
                r5.getClass()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "miniWindowClickListener player:"
                r5.append(r7)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
                if (r2 == 0) goto L_0x0384
                if (r1 != 0) goto L_0x029b
                goto L_0x0384
            L_0x029b:
                boolean r5 = r2 instanceof x50.C15625a
                if (r5 == 0) goto L_0x02bb
                x50.a r2 = (x50.C15625a) r2
                int r5 = r2.getChildCount()
                r7 = 0
                r8 = 0
            L_0x02a7:
                if (r7 >= r5) goto L_0x02c8
                android.view.View r10 = r2.getChildAt(r7)
                boolean r11 = r10 instanceof com.tencent.rtmp.p899ui.TXCloudVideoView
                if (r11 == 0) goto L_0x02b4
                com.tencent.rtmp.ui.TXCloudVideoView r10 = (com.tencent.rtmp.p899ui.TXCloudVideoView) r10
                goto L_0x02b5
            L_0x02b4:
                r10 = 0
            L_0x02b5:
                if (r10 == 0) goto L_0x02b8
                r8 = r10
            L_0x02b8:
                int r7 = r7 + 1
                goto L_0x02a7
            L_0x02bb:
                boolean r5 = r2 instanceof com.tencent.rtmp.p899ui.TXCloudVideoView
                if (r5 == 0) goto L_0x02c4
                com.tencent.rtmp.ui.TXCloudVideoView r2 = (com.tencent.rtmp.p899ui.TXCloudVideoView) r2
                r16 = r2
                goto L_0x02c6
            L_0x02c4:
                r16 = 0
            L_0x02c6:
                r8 = r16
            L_0x02c8:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r5 = r2.mo77630e(r9)
                cl1.o r5 = (cl1.C54991o) r5
                if (r5 == 0) goto L_0x02d5
                int r5 = r5.f154335l1
                goto L_0x02d6
            L_0x02d5:
                r5 = 0
            L_0x02d6:
                androidx.lifecycle.i0 r2 = r2.mo77630e(r9)
                cl1.o r2 = (cl1.C54991o) r2
                if (r2 == 0) goto L_0x02e1
                int r2 = r2.f154338m1
                goto L_0x02e2
            L_0x02e1:
                r2 = 0
            L_0x02e2:
                if (r8 == 0) goto L_0x036d
                int r7 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
                if (r7 == 0) goto L_0x036d
                if (r5 == 0) goto L_0x036d
                if (r2 == 0) goto L_0x036d
                android.view.TextureView r7 = r8.getVideoView()
                if (r7 == 0) goto L_0x036d
                android.view.TextureView r7 = r8.getVideoView()
                android.graphics.SurfaceTexture r7 = r7.getSurfaceTexture()
                if (r7 == 0) goto L_0x036d
                uk1.a r7 = r6.f188212d
                boolean r7 = uk1.C65402a.m77013a(r7, r8)
                if (r7 != 0) goto L_0x0305
                goto L_0x036d
            L_0x0305:
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r7 = 2131166635(0x7f0705ab, float:1.794752E38)
                com.tencent.p014mm.p136ui.C74942w4.m89786c(r0, r7)
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r7 = 2131166634(0x7f0705aa, float:1.7947519E38)
                com.tencent.p014mm.p136ui.C74942w4.m89786c(r0, r7)
                r0 = 1
                aw0.C103928o.m138641a(r0, r0, r0)
                ph1.g r0 = new ph1.g
                lt1.a r20 = lt1.C61401a.LIVE_WINDOW
                r7 = 1065353216(0x3f800000, float:1.0)
                float r9 = (float) r5
                float r9 = r9 * r7
                float r7 = (float) r2
                float r26 = r9 / r7
                r28 = 0
                android.view.TextureView r7 = r8.getVideoView()
                java.lang.String r9 = "playerView!!.videoView"
                gy3.C87412m.m108593f(r7, r9)
                r30 = 1
                r31 = 0
                r19 = r0
                r21 = r3
                r23 = r8
                r24 = r5
                r25 = r2
                r27 = r1
                r29 = r7
                r19.<init>(r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                ph1.i r1 = ph1.C62293i.f177081a
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r5 = "getContext()"
                gy3.C87412m.m108593f(r2, r5)
                ph1.m r0 = r1.mo87363h(r2, r0)
                uk1.a$a$a r1 = new uk1.a$a$a
                uk1.a r2 = r6.f188212d
                r5 = r37
                r1.<init>(r2, r5, r3)
                r0.mo84323h(r1)
                r1 = r32
                r7 = r33
                r8 = r34
                r9 = r35
                goto L_0x03ae
            L_0x036d:
                r5 = r37
                uk1.a r1 = r6.f188212d
                gy3.C87412m.m108593f(r5, r0)
                r2 = 0
                uk1.C65402a.m77014b(r1, r5, r2, r3)
                r1 = r32
                r7 = r33
                r8 = r34
                r9 = r35
                j20.C117292a.m165361g(r6, r9, r8, r7, r1)
                return
            L_0x0384:
                r5 = r37
                r1 = r32
                r7 = r33
                r8 = r34
                r9 = r35
                r2 = 0
                uk1.a r10 = r6.f188212d
                gy3.C87412m.m108593f(r5, r0)
                uk1.C65402a.m77014b(r10, r5, r2, r3)
                j20.C117292a.m165361g(r6, r9, r8, r7, r1)
                return
            L_0x039b:
                r5 = r37
                r1 = r32
                r7 = r33
                r8 = r34
                r9 = r35
                r2 = 0
                uk1.a r10 = r6.f188212d
                gy3.C87412m.m108593f(r5, r0)
                uk1.C65402a.m77014b(r10, r5, r2, r3)
            L_0x03ae:
                j20.C117292a.m165361g(r6, r9, r8, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uk1.C65402a.C65403a.onClick(android.view.View):void");
        }
    }

    /* renamed from: uk1.a$b */
    public static final class C65405b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65402a f188216d;

        public C65405b(C65402a aVar) {
            this.f188216d = aVar;
        }

        public final void onClick(View view) {
            C47844c7 c7Var;
            C53161l1 l1Var;
            C51292ss1 ss12;
            C51439ts1 ts12;
            C51870ws1 ws12;
            Class cls = C60106t.class;
            Class cls2 = C54116w.class;
            Class cls3 = C54979h1.class;
            Class cls4 = C54991o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/mini/FinderLiveMiniWindowManager$miniWindowCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = true;
            this.f188216d.f188208b.mo61123a(true);
            boolean z2 = false;
            C64208c.f181948O = false;
            boolean isTopApplication = Util.isTopApplication(MMApplicationContext.getContext());
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            if (!FinderLiveService.f159380h) {
                ((C58966m) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C58966m.class)).mo5195m0();
            }
            this.f188216d.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("mini window close,is top applicaton:");
            sb.append(isTopApplication);
            sb.append(",is shopping in MiniPro:");
            C54979h1 h1Var = (C54979h1) finderLiveService.mo77630e(cls3);
            Bundle bundle = null;
            sb.append(h1Var != null ? Boolean.valueOf(h1Var.f154109A) : null);
            sb.append(",isAnchor:");
            sb.append(FinderLiveService.f159380h);
            Log.m105924i("Finder.FinderLiveMiniWindowManager", sb.toString());
            if (!FinderLiveService.f159380h) {
                C54979h1 h1Var2 = (C54979h1) finderLiveService.mo77630e(cls3);
                if (h1Var2 != null && h1Var2.f154109A) {
                    C60735a aVar = FinderLiveService.f159378f;
                    if (aVar != null) {
                        aVar.mo85683a0();
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/mini/FinderLiveMiniWindowManager$miniWindowCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            if (!FinderLiveService.f159380h) {
                C54991o oVar = (C54991o) finderLiveService.mo77630e(cls4);
                if (oVar != null && oVar.f154375v1) {
                    ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(true);
                    C63363c.C63364a aVar2 = C63363c.C63364a.f179734a;
                    C63363c.C63364a.f179735b.f179732a.mo90535c(false);
                    this.f188216d.getClass();
                    Log.m105924i("Finder.FinderLiveMiniWindowManager", "miniWindowCloseClickListener hideFloatBall");
                    C60735a aVar3 = FinderLiveService.f159378f;
                    if (aVar3 != null) {
                        aVar3.mo75580f0();
                    }
                    LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
                    if (liveRoomControllerStore != null) {
                        C59447j.f169870a.mo84553e(liveRoomControllerStore);
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/mini/FinderLiveMiniWindowManager$miniWindowCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            this.f188216d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = bVar instanceof FinderLiveVisitorPluginLayout ? (FinderLiveVisitorPluginLayout) bVar : null;
            if (!(finderLiveVisitorPluginLayout == null || (c7Var = (C47844c7) finderLiveVisitorPluginLayout.getPlugin(C47844c7.class)) == null || (l1Var = c7Var.f128423p) == null || (ss12 = ((C53165p1) l1Var).f148345i) == null || (ts12 = ss12.f141719g) == null || (ws12 = ts12.f142383e) == null)) {
                String str = ws12.f144243d;
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (z) {
                    Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#preloadMiniApp appid is null, preload return");
                } else {
                    C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
                    String str2 = ws12.f144243d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    x0Var.mo106894i7("", str2, -1, false);
                }
            }
            C66110y2 y2Var = C66110y2.f190024a;
            C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls4);
            int i = oVar2 != null ? oVar2.f154284Y2 : 0;
            C54991o oVar3 = (C54991o) finderLiveService.mo77630e(cls4);
            C66110y2.m77912b(y2Var, 3, i, oVar3 != null ? oVar3.f154291a1 : 0, false, 8, (Object) null);
            C54067f0.C54079q0 q0Var = C54067f0.C54079q0.CloseTypeFloat;
            ((C54116w) C86312j.m106911c(cls2)).Gy0(q0Var);
            FinderLiveService.m63768J(finderLiveService, isTopApplication, (C32224a) null, 2, (Object) null);
            FinderLiveMiniView finderLiveMiniView = this.f188216d.f188207a;
            if (finderLiveMiniView != null) {
                z2 = finderLiveMiniView.f159790n;
            }
            if (!z2) {
                ((C60106t) C86312j.m106911c(cls)).Cx0().mo58846jo();
                ((C60106t) C86312j.m106911c(cls)).yx0().mo9439Yt();
                C7335d c = C86312j.m106911c(cls2);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar = (C54116w) c;
                C56032b bVar2 = FinderLiveService.f159379g;
                Context context = bVar2 != null ? bVar2.getContext() : null;
                C54129i iVar = FinderLiveService.f159398z;
                if (iVar != null) {
                    bundle = iVar.f151996k;
                }
                C54116w.wy0(wVar, context, q0Var, bundle, false, 8, (Object) null);
                C54738b1.f153409B.mo559a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/mini/FinderLiveMiniWindowManager$miniWindowCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        r2 = (r2 = r3.getVideoView()).getSurfaceTexture();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m77013a(uk1.C65402a r2, com.tencent.rtmp.p899ui.TXCloudVideoView r3) {
        /*
            r2.getClass()
            r2 = 26
            boolean r2 = p206nj.C11171e.m11046c(r2)
            r0 = 0
            r1 = 1
            if (r2 == 0) goto L_0x0027
            if (r3 == 0) goto L_0x0023
            android.view.TextureView r2 = r3.getVideoView()
            if (r2 == 0) goto L_0x0023
            android.graphics.SurfaceTexture r2 = r2.getSurfaceTexture()
            if (r2 == 0) goto L_0x0023
            boolean r2 = r2.isReleased()
            if (r2 != r1) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uk1.C65402a.m77013a(uk1.a, com.tencent.rtmp.ui.TXCloudVideoView):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0204  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m77014b(uk1.C65402a r15, android.view.View r16, boolean r17, long r18) {
        /*
            r15.getClass()
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<ak1.o> r1 = ak1.C54108o.class
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            com.tencent.mm.plugin.finder.live.view.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            r4 = 0
            if (r3 == 0) goto L_0x0016
            android.content.Context r3 = r3.getContext()
            goto L_0x0017
        L_0x0016:
            r3 = r4
        L_0x0017:
            boolean r3 = r3 instanceof android.app.Activity
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0036
            com.tencent.mm.plugin.finder.live.view.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r3 == 0) goto L_0x0026
            android.content.Context r3 = r3.getContext()
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            java.lang.String r7 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r3, r7)
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r3 = r3.isFinishing()
            if (r3 == 0) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            zt3.t r7 = zt3.C119157j.f356862d
            cj1.w5 r8 = cj1.C28594w5.f78482d
            zt3.j r7 = (zt3.C119157j) r7
            java.lang.String r9 = "Finder.LiveExceptionMonitor"
            r7.mo183876g(r8, r9)
            j50.a r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r7 == 0) goto L_0x0049
            r7.mo75580f0()
        L_0x0049:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r7 == 0) goto L_0x0052
            gh1.j r8 = gh1.C59447j.f169870a
            r8.mo84553e(r7)
        L_0x0052:
            r2.mo77608K()
            java.lang.Class<cl1.d> r7 = cl1.C54951d.class
            androidx.lifecycle.i0 r7 = r2.mo77630e(r7)
            cl1.d r7 = (cl1.C54951d) r7
            r8 = 2
            if (r7 == 0) goto L_0x006b
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.Integer> r7 = r7.f154005j
            if (r7 == 0) goto L_0x006b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.postValue(r9)
        L_0x006b:
            androidx.lifecycle.i0 r7 = r2.mo77630e(r0)
            cl1.o r7 = (cl1.C54991o) r7
            r9 = -1
            if (r7 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r7.mo76025w4(r9)
        L_0x0078:
            boolean r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            java.lang.String r10 = "it.context"
            if (r7 == 0) goto L_0x00b1
            j50.a r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            boolean r7 = r7 instanceof c50.C54655b
            if (r7 == 0) goto L_0x00a3
            androidx.lifecycle.i0 r0 = r2.mo77630e(r0)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x0092
            boolean r0 = r0.f154301c3
            if (r0 != r5) goto L_0x0092
            r0 = 1
            goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            if (r0 != 0) goto L_0x00a3
            ok1.e r0 = ok1.C62042e.f176370a
            android.content.Context r7 = r16.getContext()
            gy3.C87412m.m108593f(r7, r10)
            java.lang.Class r0 = r0.mo87056Y(r7)
            goto L_0x00be
        L_0x00a3:
            ok1.e r0 = ok1.C62042e.f176370a
            android.content.Context r7 = r16.getContext()
            gy3.C87412m.m108593f(r7, r10)
            java.lang.Class r0 = r0.mo87053X(r7)
            goto L_0x00be
        L_0x00b1:
            ok1.e r0 = ok1.C62042e.f176370a
            android.content.Context r7 = r16.getContext()
            gy3.C87412m.m108593f(r7, r10)
            java.lang.Class r0 = r0.mo87062a0(r7)
        L_0x00be:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7.<init>(r11, r0)
            java.lang.Class<cl1.v1> r11 = cl1.C55004v1.class
            androidx.lifecycle.i0 r11 = r2.mo77630e(r11)
            cl1.v1 r11 = (cl1.C55004v1) r11
            if (r11 == 0) goto L_0x00e0
            java.util.LinkedList<te3.aq2> r11 = r11.f154438i
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x00db
            r11 = 1
            goto L_0x00dc
        L_0x00db:
            r11 = 0
        L_0x00dc:
            if (r11 != r5) goto L_0x00e0
            r11 = 1
            goto L_0x00e1
        L_0x00e0:
            r11 = 0
        L_0x00e1:
            if (r11 == 0) goto L_0x00f1
            java.lang.String r11 = "Finder.FinderLiveMiniWindowManager"
            java.lang.String r12 = "miniWindowStartActivity isMultiStreamEnable justRemoveMiniWindow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            j50.a r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r11 == 0) goto L_0x00f1
            r11.mo85683a0()
        L_0x00f1:
            boolean r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            if (r11 != 0) goto L_0x0127
            com.tencent.mm.plugin.finder.live.view.b r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r11 == 0) goto L_0x0127
            android.content.Context r12 = r11.getContext()
            java.lang.Class r12 = r12.getClass()
            boolean r0 = gy3.C87412m.m108589b(r12, r0)
            if (r0 != 0) goto L_0x0127
            android.content.Context r0 = r11.getContext()
            boolean r12 = r0 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r12 == 0) goto L_0x0112
            com.tencent.mm.plugin.finder.ui.MMFinderUI r0 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r0
            goto L_0x0113
        L_0x0112:
            r0 = r4
        L_0x0113:
            if (r0 == 0) goto L_0x0127
            androidx.lifecycle.j r12 = r0.getLifecycle()
            androidx.lifecycle.j$c r12 = r12.getCurrentState()
            androidx.lifecycle.j$c r13 = androidx.lifecycle.C39623j.C39626c.DESTROYED
            if (r12 == r13) goto L_0x0127
            r11.setFinishActivityNotReleaseLive(r5)
            r0.finish()
        L_0x0127:
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r2.mo77630e(r0)
            cl1.u r0 = (cl1.C55001u) r0
            if (r0 == 0) goto L_0x0137
            te3.c21 r0 = r0.f154420q
            if (r0 == 0) goto L_0x0137
            int r9 = r0.f182405s
        L_0x0137:
            java.lang.String r0 = "KEY_PARAMS_SOURCE_TYPE"
            r7.putExtra(r0, r9)
            java.lang.String r0 = "LAUNCH_WITH_ANIM"
            r2 = r17
            r7.putExtra(r0, r2)
            java.lang.String r0 = "CURRENT_FEED_ID"
            r11 = r18
            r7.putExtra(r0, r11)
            java.lang.String r0 = "route_to_maximize"
            r7.putExtra(r0, r5)
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r0.mo76876sZ(r8, r7)
            r0 = 872415232(0x34000000, float:1.1920929E-7)
            r7.addFlags(r0)
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r0 == 0) goto L_0x016c
            java.lang.Class<fh1.p2> r2 = fh1.C59062p2.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r0.controller(r2)
            fh1.p2 r0 = (fh1.C59062p2) r0
            goto L_0x016d
        L_0x016c:
            r0 = r4
        L_0x016d:
            if (r0 == 0) goto L_0x0171
            cj1.n4 r4 = r0.f168993z
        L_0x0171:
            bk1.a r2 = bk1.C54487a.f152770a
            android.content.Context r8 = r16.getContext()
            gy3.C87412m.m108593f(r8, r10)
            boolean r8 = r2.mo75312b(r8, r4)
            if (r8 == 0) goto L_0x0188
            boolean r2 = r2.mo75311a(r4)
            if (r2 != 0) goto L_0x0188
            r2 = 1
            goto L_0x0189
        L_0x0188:
            r2 = 0
        L_0x0189:
            if (r0 == 0) goto L_0x018e
            r0.mo84274L3(r2)
        L_0x018e:
            if (r2 == 0) goto L_0x01ba
            if (r3 == 0) goto L_0x01ba
            boolean r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            if (r0 != 0) goto L_0x01ba
            cj1.n4$a r0 = cj1.C0576n4.f1379b
            r0.mo599b(r7, r4)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "KEY_ENTER_LIVE_PARAM_INTENT_DATA"
            r0.putExtra(r2, r7)
            java.lang.Class<ea.d> r2 = p147ea.C7606d.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ea.d r2 = (p147ea.C7606d) r2
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = "getContext()"
            gy3.C87412m.m108593f(r3, r4)
            r2.mo8741aa(r3, r0)
            goto L_0x01f4
        L_0x01ba:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r7)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/view/mini/FinderLiveMiniWindowManager"
            java.lang.String r10 = "miniWindowStartActivity"
            java.lang.String r11 = "(Landroid/view/View;ZJ)V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r6)
            android.content.Intent r2 = (android.content.Intent) r2
            r0.startActivity(r2)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/view/mini/FinderLiveMiniWindowManager"
            java.lang.String r9 = "miniWindowStartActivity"
            java.lang.String r10 = "(Landroid/view/View;ZJ)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x01f4:
            r50.c r0 = r50.C63363c.C63364a.f179735b
            r0.mo88268b()
            r0 = r15
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r0 = r0.f188207a
            if (r0 == 0) goto L_0x0201
            boolean r0 = r0.f159790n
            goto L_0x0202
        L_0x0201:
            r0 = 0
        L_0x0202:
            if (r0 == 0) goto L_0x0235
            di3.d r0 = di3.C86312j.m106911c(r1)
            ak1.o r0 = (ak1.C54108o) r0
            r0.getClass()
            ak1.f0 r0 = ak1.C54108o.f151869h
            r0.f151444Z = r6
            di3.d r2 = di3.C86312j.m106911c(r1)
            ak1.o r2 = (ak1.C54108o) r2
            r2.getClass()
            r0.f151446a0 = r5
            di3.d r0 = di3.C86312j.m106911c(r1)
            java.lang.String r1 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r6 = r0
            ht1.j5 r6 = (ht1.C8777j5) r6
            ak1.g0 r7 = ak1.C0073g0.LIVE_ANCHOR_ACTION_MINIMIZE
            java.lang.String r8 = java.lang.String.valueOf(r5)
            r9 = 0
            r10 = 4
            r11 = 0
            ht1.C8777j5.C8778a.m8605f(r6, r7, r8, r9, r10, r11)
            goto L_0x0242
        L_0x0235:
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.w r0 = (ak1.C54116w) r0
            ak1.f0$t r1 = ak1.C54067f0.C54084t.LIVE_FLOAT_ACTION_MAXIMIZE
            r0.Zx0(r6, r1)
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uk1.C65402a.m77014b(uk1.a, android.view.View, boolean, long):void");
    }

    /* renamed from: c */
    public final FinderLiveMiniView mo89485c(C45795b bVar, boolean z) {
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "liveData");
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        FinderLiveMiniView finderLiveMiniView = new FinderLiveMiniView(context);
        this.f188207a = finderLiveMiniView;
        View.OnClickListener onClickListener = this.f188209c;
        View.OnClickListener onClickListener2 = this.f188210d;
        C87412m.m108594g(onClickListener, "clickListener");
        C87412m.m108594g(onClickListener2, "closeClickListener");
        finderLiveMiniView.setOnClickListener(onClickListener);
        finderLiveMiniView.f159791o = onClickListener2;
        FinderLiveMiniView finderLiveMiniView2 = this.f188207a;
        if (finderLiveMiniView2 != null) {
            finderLiveMiniView2.mo77963f(((C54991o) bVar.mo71262a(cls)).f154345o, ((C54991o) bVar.mo71262a(cls)).mo75969L3(), z);
        }
        return finderLiveMiniView;
    }
}
