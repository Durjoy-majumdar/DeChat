package il1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gi1.C59463a;
import gi1.C59464c;
import gy3.C87412m;
import gy3.C87413o;
import hi1.C59914e;
import hq1.C60085d;
import hq1.C60090e;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import ky2.C10432i;
import l31.C61212e;
import ok1.C62042e;
import q31.C118148a;
import qj1.C62660c;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C64197v;
import sx3.C77813z;
import sx3.C90363p0;

/* renamed from: il1.u8 */
public final class C60532u8 implements View.OnClickListener {

    /* renamed from: d */
    public final ViewGroup f172536d;

    /* renamed from: e */
    public final C58124b f172537e;

    /* renamed from: f */
    public final C62660c f172538f;

    /* renamed from: g */
    public final String f172539g = "Finder.FinderLiveVisitorMicEntranceWidget";

    /* renamed from: h */
    public final C13601g f172540h = C36568h.m40985a(new C60534b(this));

    /* renamed from: i */
    public final View f172541i;

    /* renamed from: j */
    public final WeImageView f172542j;

    /* renamed from: n */
    public final View f172543n;

    /* renamed from: o */
    public int f172544o;

    /* renamed from: il1.u8$a */
    public static final class C60533a implements C118148a {

        /* renamed from: a */
        public static final C60533a f172545a = new C60533a();

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            return C90363p0.m113143b(new C13604l("is_link_running", Integer.valueOf(((C54116w) C86312j.m106911c(C54116w.class)).f151921U0 ? 1 : 0)));
        }
    }

    /* renamed from: il1.u8$b */
    public static final class C60534b extends C87413o implements C32224a<C59914e> {

        /* renamed from: d */
        public final /* synthetic */ C60532u8 f172546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60534b(C60532u8 u8Var) {
            super(0);
            this.f172546d = u8Var;
        }

        public Object invoke() {
            Context context = this.f172546d.f172536d.getContext();
            C87412m.m108593f(context, "root.context");
            C60532u8 u8Var = this.f172546d;
            return new C59914e(context, u8Var.f172537e, u8Var.f172538f);
        }
    }

    public C60532u8(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        Class cls = C61212e.class;
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f172536d = viewGroup;
        this.f172537e = bVar;
        this.f172538f = cVar;
        this.f172541i = viewGroup.findViewById(C0966R.C0970id.e1f);
        this.f172542j = (WeImageView) viewGroup.findViewById(C0966R.C0970id.e1g);
        this.f172543n = viewGroup.findViewById(C0966R.C0970id.f358170o70);
        ((C61212e) C86312j.m106911c(cls)).o30(viewGroup, "finder_live_apply_for_link");
        if (bVar.getLiveRole() == 0) {
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(viewGroup, 8, 25561);
            ((C61212e) C86312j.m106911c(cls)).E60(viewGroup, C60533a.f172545a);
        }
        viewGroup.setOnClickListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r8 = ((cl1.C54963d0) r8.mo87696x0(cl1.C54963d0.class)).f154048B;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85497a(int r8) {
        /*
            r7 = this;
            rx3.g r0 = r7.f172540h
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            hi1.e r0 = (hi1.C59914e) r0
            r0.f171020n = r8
            qj1.c r8 = r0.f171018i
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r8 = r8.mo87696x0(r1)
            cl1.o r8 = (cl1.C54991o) r8
            boolean r8 = r8.f154273W1
            r1 = 1
            if (r8 != r1) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x0092
            qj1.c r8 = r0.f171018i
            if (r8 == 0) goto L_0x0032
            java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
            androidx.lifecycle.i0 r8 = r8.mo87696x0(r1)
            cl1.d0 r8 = (cl1.C54963d0) r8
            te3.ww2 r8 = r8.f154048B
            if (r8 == 0) goto L_0x0032
            long r1 = r8.f144323d
            goto L_0x0034
        L_0x0032:
            r1 = 0
        L_0x0034:
            int r8 = (int) r1
            r1 = 16
            boolean r8 = o40.C61926c.m72696u(r8, r1)
            java.lang.String r1 = "viewBinding"
            r2 = 0
            if (r8 == 0) goto L_0x0057
            nh1.s r8 = r0.f171019j
            if (r8 == 0) goto L_0x0053
            android.widget.LinearLayout r8 = r8.f175534a
            android.content.res.Resources r8 = r8.getResources()
            r3 = 2131828014(0x7f111d2e, float:1.9288957E38)
            java.lang.String r8 = r8.getString(r3)
            goto L_0x0068
        L_0x0053:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0057:
            nh1.s r8 = r0.f171019j
            if (r8 == 0) goto L_0x008e
            android.widget.LinearLayout r8 = r8.f175534a
            android.content.res.Resources r8 = r8.getResources()
            r3 = 2131828012(0x7f111d2c, float:1.9288953E38)
            java.lang.String r8 = r8.getString(r3)
        L_0x0068:
            java.lang.String r3 = "if (opCheckFlag(settingF…pt_visitor)\n            }"
            gy3.C87412m.m108593f(r8, r3)
            nh1.s r3 = r0.f171019j
            if (r3 == 0) goto L_0x008a
            android.widget.LinearLayout r1 = r3.f175534a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131828978(0x7f1120f2, float:1.9290912E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "viewBinding.root.resourc…isitor_mic_request_title)"
            gy3.C87412m.m108593f(r1, r2)
            fg1.a r2 = r0.f28309g
            r2.mo9110a(r1, r8)
            goto L_0x0092
        L_0x008a:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x008e:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0092:
            r0.mo3431p()
            java.lang.Class<ak1.w> r8 = ak1.C54116w.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            java.lang.String r0 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r8, r0)
            r1 = r8
            ak1.w r1 = (ak1.C54116w) r1
            ak1.f0$u0 r2 = ak1.C54067f0.C54085u0.APPLY_LINKMIC
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            ak1.C54116w.oy0(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60532u8.mo85497a(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x011e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85498b(int r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.Class<ak1.o> r2 = ak1.C54108o.class
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            r0.f172544o = r1
            java.lang.String r5 = r0.f172539g
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "checkRequestLinkMic seatPos: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            di3.d r5 = di3.C86312j.m106911c(r2)
            java.lang.String r6 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            r7 = r5
            ht1.j5 r7 = (ht1.C8777j5) r7
            ak1.f0$m r8 = ak1.C54067f0.C0064m.LIVE_CALL
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            ht1.C8777j5.C8778a.m8606g(r7, r8, r9, r10, r11, r12)
            di3.d r2 = di3.C86312j.m106911c(r2)
            gy3.C87412m.m108593f(r2, r6)
            r7 = r2
            ht1.j5 r7 = (ht1.C8777j5) r7
            ak1.f0$m r8 = ak1.C54067f0.C0064m.WHEAT
            ht1.C8777j5.C8778a.m8606g(r7, r8, r9, r10, r11, r12)
            qj1.c r2 = r0.f172538f
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r3)
            cl1.d0 r2 = (cl1.C54963d0) r2
            boolean r2 = r2.mo75902I3()
            r5 = 0
            if (r2 != 0) goto L_0x007c
            java.lang.String r1 = r0.f172539g
            java.lang.String r2 = "skip apply mic, disable mic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.view.ViewGroup r1 = r0.f172536d
            android.content.Context r1 = r1.getContext()
            android.view.ViewGroup r2 = r0.f172536d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131827699(0x7f111bf3, float:1.9288318E38)
            java.lang.String r2 = r2.getString(r3)
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r5)
            r1.show()
            return
        L_0x007c:
            qj1.c r2 = r0.f172538f
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r4)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154366t
            if (r2 != 0) goto L_0x00af
            java.lang.String r1 = r0.f172539g
            java.lang.String r2 = "skip apply mic, ban comment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.view.ViewGroup r1 = r0.f172536d
            android.content.Context r1 = r1.getContext()
            android.view.ViewGroup r2 = r0.f172536d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131827694(0x7f111bee, float:1.9288308E38)
            java.lang.String r2 = r2.getString(r3)
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r5)
            r1.show()
            return
        L_0x00af:
            gg1.a r2 = gg1.C32444a.f86121a
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LIVE_KNOW_LICENSE_UPDATE_INT_SYNC
            int r2 = r2.mo119689j(r6, r5)
            r6 = 1
            if (r2 != r6) goto L_0x00c4
            r2 = 1
            goto L_0x00c5
        L_0x00c4:
            r2 = 0
        L_0x00c5:
            java.lang.String r7 = "PARAM_FINDER_LIVE_LINK_MIC_POSITION"
            if (r2 != 0) goto L_0x00e3
            java.lang.String r2 = r0.f172539g
            java.lang.String r3 = "skip apply mic, live lisence unchecked"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            d60.b r2 = r0.f172537e
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_SHOW_APPLY_LICENSE
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putInt(r7, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r2.statusChange(r3, r4)
            return
        L_0x00e3:
            qj1.c r8 = r0.f172538f
            r10 = 16
            r11 = 0
            r12 = 4
            r13 = 0
            java.lang.String r9 = "android.permission.CAMERA"
            boolean r2 = d60.C58121a.m67274c0(r8, r9, r10, r11, r12, r13)
            if (r2 != 0) goto L_0x00fa
            java.lang.String r2 = r0.f172539g
            java.lang.String r8 = "not get enough permission checkCamera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            goto L_0x0110
        L_0x00fa:
            qj1.c r9 = r0.f172538f
            r11 = 80
            r12 = 0
            r13 = 4
            r14 = 0
            java.lang.String r10 = "android.permission.RECORD_AUDIO"
            boolean r2 = d60.C58121a.m67274c0(r9, r10, r11, r12, r13, r14)
            if (r2 != 0) goto L_0x0112
            java.lang.String r2 = r0.f172539g
            java.lang.String r8 = "not get enough permission checkMicroPhone"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
        L_0x0110:
            r2 = 0
            goto L_0x0113
        L_0x0112:
            r2 = 1
        L_0x0113:
            if (r2 != 0) goto L_0x011e
            java.lang.String r1 = r0.f172539g
            java.lang.String r2 = "skip apply mic, live permission unchecked"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            return
        L_0x011e:
            qj1.c r2 = r0.f172538f
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r3)
            cl1.d0 r2 = (cl1.C54963d0) r2
            boolean r2 = r2.mo75913U3()
            r8 = 2
            r9 = 0
            if (r2 == 0) goto L_0x0136
            d60.b r1 = r0.f172537e
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_LINK_WAIT_CLICK
            d60.C58124b.C7172a.m7372a(r1, r2, r9, r8, r9)
            return
        L_0x0136:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            p50.e r2 = r2.mo77631e0()
            if (r2 == 0) goto L_0x0148
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0148
            boolean r2 = r2.f166264k
            if (r2 != r6) goto L_0x0148
            r2 = 1
            goto L_0x0149
        L_0x0148:
            r2 = 0
        L_0x0149:
            if (r2 == 0) goto L_0x016a
            android.view.ViewGroup r1 = r0.f172536d
            android.content.Context r1 = r1.getContext()
            android.view.ViewGroup r2 = r0.f172536d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828061(0x7f111d5d, float:1.9289052E38)
            java.lang.String r2 = r2.getString(r3)
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r5)
            r1.show()
            return
        L_0x016a:
            qj1.c r2 = r0.f172538f
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r3)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            java.lang.String r3 = "basePlugin.business(Live…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x017d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x019f
            java.lang.Object r3 = r2.next()
            r10 = r3
            al1.j r10 = (al1.C54130j) r10
            java.lang.String r10 = r10.f151997a
            qj1.c r11 = r0.f172538f
            androidx.lifecycle.i0 r11 = r11.mo87696x0(r4)
            cl1.o r11 = (cl1.C54991o) r11
            java.lang.String r11 = r11.mo76015n4()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r11)
            if (r10 == 0) goto L_0x017d
            goto L_0x01a0
        L_0x019f:
            r3 = r9
        L_0x01a0:
            if (r3 == 0) goto L_0x01a4
            r2 = 1
            goto L_0x01a5
        L_0x01a4:
            r2 = 0
        L_0x01a5:
            if (r2 == 0) goto L_0x0203
            qj1.c r1 = r0.f172538f
            d60.b r1 = r1.f177936g
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_MIC_OPEN_TRTC_PANEL
            d60.C58124b.C7172a.m7372a(r1, r2, r9, r8, r9)
            android.view.View r1 = r0.f172543n
            if (r1 != 0) goto L_0x01b5
            goto L_0x01f7
        L_0x01b5:
            r2 = 8
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r11 = r3.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget"
            java.lang.String r13 = "onMicUserClick"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = r3.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget"
            java.lang.String r12 = "onMicUserClick"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x01f7:
            ok1.e r1 = ok1.C62042e.f176370a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.mo87106p0()
            java.lang.String r2 = "LINK_RED_DOT_ENABLE_KEY"
            r1.putBoolean(r2, r5)
            goto L_0x0267
        L_0x0203:
            qj1.c r2 = r0.f172538f
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r4)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo75965J3()
            if (r2 == 0) goto L_0x0264
            qj1.c r2 = r0.f172538f
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r4)
            cl1.o r2 = (cl1.C54991o) r2
            te3.fs0 r2 = r2.mo75986U3()
            int r2 = r2.f183215f
            if (r2 == r6) goto L_0x0264
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.view.ViewGroup r3 = r0.f172536d
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131827722(0x7f111c0a, float:1.9288365E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "PARAM_FINDER_BOTTOM_TIP_TITLE"
            r2.putString(r4, r3)
            android.view.ViewGroup r3 = r0.f172536d
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131827721(0x7f111c09, float:1.9288363E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "PARAM_FINDER_BOTTOM_TIP_MSG"
            r2.putString(r4, r3)
            java.lang.String r3 = "PARAM_FINDER_BOTTOM_TIP_SCENE"
            r2.putInt(r3, r5)
            r2.putInt(r7, r1)
            qj1.c r1 = r0.f172538f
            d60.b r1 = r1.f177936g
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_SHOW_BOTTOM_TIP_PANEL
            r1.statusChange(r3, r2)
            goto L_0x0267
        L_0x0264:
            r18.mo85497a(r19)
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60532u8.mo85498b(int):void");
    }

    /* renamed from: c */
    public final void mo85499c(boolean z) {
        Class cls = C54108o.class;
        Class cls2 = C54116w.class;
        Class cls3 = C54991o.class;
        if (!z || C62042e.f176370a.mo87048V0(this.f172538f.mo87684A0()) || ((C54991o) this.f172538f.mo87696x0(cls3)).f154190D || !((C54963d0) this.f172538f.mo87696x0(C54963d0.class)).mo75902I3() || !((C54991o) this.f172538f.mo87696x0(cls3)).mo75999e4() || ((C54991o) this.f172538f.mo87696x0(cls3)).f154305d3) {
            mo85500d(8);
        } else {
            if (this.f172536d.getVisibility() != 0) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8608i((C8777j5) c, C54067f0.C0066n.LIVE_CALL, (Map) null, 2, (Object) null);
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8608i((C8777j5) c2, C54067f0.C0066n.WHEAT, (Map) null, 2, (Object) null);
            }
            mo85500d(0);
        }
        if (this.f172536d.getVisibility() == 0 && !((C54116w) C86312j.m106911c(cls2)).f151933b1) {
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_exp", this.f172536d, (Map<String, Object>) null, 25561);
        }
        ((C54116w) C86312j.m106911c(cls2)).ny0(C54067f0.C54085u0.LINKMIC_ICON_EXPLORE, C54067f0.C54068a0.INVALIDATE, this.f172536d.getVisibility());
    }

    /* renamed from: d */
    public final void mo85500d(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f172536d.setVisibility(8);
            Log.m105928w(this.f172539g, "setVisible return for isTeenMode");
        } else if (C62042e.f176370a.mo87048V0(this.f172538f.mo87684A0())) {
            this.f172536d.setVisibility(8);
            Log.m105928w(this.f172539g, "setVisible return for isDisableLinkMic");
        } else {
            this.f172536d.setVisibility(i);
        }
    }

    public void onClick(View view) {
        C60085d dVar;
        C60090e eVar;
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fou) {
            C59464c value = ((C54963d0) this.f172538f.mo87696x0(C54963d0.class)).f154077t.getValue();
            int i2 = 0;
            if (value != null && ((i = value.f169898c) == 3 || i == 3)) {
                LinkedList<C59463a> linkedList = value.f169896a;
                if (linkedList.size() > 1) {
                    C77813z.m93909o(linkedList, new C60537v8());
                }
                Iterator<T> it = value.f169896a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = 1;
                        break;
                    }
                    T next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C59463a aVar = (C59463a) next;
                        if (i2 > 0 && aVar.f169895b.f169904h) {
                            break;
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            mo85498b(i2);
            if (!(!((C54991o) this.f172538f.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f172538f.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2023);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
