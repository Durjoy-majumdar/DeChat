package com.tencent.p014mm.p136ui.chatting.component;

import android.os.Bundle;
import android.view.animation.Animation;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.p136ui.chatting.ChattingFooterMoreBtnBar;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import p270xi.C91212b;
import s90.C77632o;
import zj3.C79343c0;
import zj3.C79348e;
import zj3.C79362h1;
import zj3.C79368l;
import zj3.C79369m;
import zj3.C79379r;
import zj3.C79384u0;
import zj3.C79387w;

@C91212b(exportInterface = C79369m.class)
/* renamed from: com.tencent.mm.ui.chatting.component.y0 */
public class C73655y0 extends C73412a implements C77632o, C79369m {

    /* renamed from: q */
    public static QueueWorkerThread f216259q = new QueueWorkerThread(5, "MicroMsg.ChattingMoreBtnBarHelper");

    /* renamed from: e */
    public ChattingFooterMoreBtnBar f216260e;

    /* renamed from: f */
    public C106742j1 f216261f;

    /* renamed from: g */
    public boolean f216262g = false;

    /* renamed from: h */
    public C72996z1 f216263h;

    /* renamed from: i */
    public boolean f216264i;

    /* renamed from: j */
    public boolean f216265j = true;

    /* renamed from: n */
    public Animation f216266n;

    /* renamed from: o */
    public String f216267o = "";

    /* renamed from: p */
    public boolean f216268p = false;

    /* renamed from: com.tencent.mm.ui.chatting.component.y0$a */
    public class C73656a implements Comparator<C72963f4> {
        public C73656a(C73655y0 y0Var) {
        }

        public int compare(Object obj, Object obj2) {
            return Long.compare(((C72963f4) obj).getCreateTime(), ((C72963f4) obj2).getCreateTime());
        }
    }

    /* renamed from: N */
    public boolean mo22497N() {
        return false;
    }

    /* renamed from: R1 */
    public void mo102680R1(C72963f4 f4Var) {
        if (f4Var == null) {
            Log.m105928w("MicroMsg.ChattingMoreBtnBarHelper", "perform search mode click msg item fail, msg is null");
            return;
        }
        C79368l lVar = (C79368l) this.f215752d.f193278b.mo102812a(C79368l.class);
        if (lVar.mo108183N0(f4Var.getMsgId())) {
            this.f216260e.mo102072c(lVar.mo108181M5());
            this.f216260e.setVisibility(0);
            this.f216261f.mo153850b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0167  */
    /* renamed from: X2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102681X2(com.tencent.p014mm.storage.C72963f4 r8) {
        /*
            r7 = this;
            java.lang.Class<zj3.l> r0 = zj3.C79368l.class
            java.lang.Class<zj3.u0> r1 = zj3.C79384u0.class
            boolean r2 = r7.f216268p
            java.lang.String r3 = "MicroMsg.ChattingMoreBtnBarHelper"
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = "[init] hasInit!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            goto L_0x00b5
        L_0x0013:
            r7.f216268p = r5
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r2 = r7.f216260e
            if (r2 != 0) goto L_0x0034
            ck3.b r2 = r7.f215752d
            r6 = 2131316299(0x7f094e4b, float:1.8251076E38)
            android.view.View r2 = r2.mo91562c(r6)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r2.inflate()
            ck3.b r2 = r7.f215752d
            r6 = 2131299227(0x7f090b9b, float:1.821645E38)
            android.view.View r2 = r2.mo91562c(r6)
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r2 = (com.tencent.p014mm.p136ui.chatting.ChattingFooterMoreBtnBar) r2
            r7.f216260e = r2
        L_0x0034:
            ck3.b r2 = r7.f215752d
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r1)
            zj3.u0 r2 = (zj3.C79384u0) r2
            boolean r2 = r2.mo102502H1()
            if (r2 == 0) goto L_0x0051
            java.lang.String r2 = "is in show search chat result"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
            com.tencent.mm.ui.tools.j1 r2 = r7.f216261f
            if (r2 == 0) goto L_0x005f
            r3 = 0
            r2.f319122j = r3
            goto L_0x005f
        L_0x0051:
            com.tencent.mm.ui.tools.j1 r2 = new com.tencent.mm.ui.tools.j1
            r2.<init>(r5, r5)
            r7.f216261f = r2
            com.tencent.mm.ui.chatting.component.z0 r3 = new com.tencent.mm.ui.chatting.component.z0
            r3.<init>(r7)
            r2.f319122j = r3
        L_0x005f:
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r2 = r7.f216260e
            com.tencent.mm.ui.chatting.component.n0 r3 = new com.tencent.mm.ui.chatting.component.n0
            r3.<init>(r7)
            r6 = 3
            r2.mo102071b(r6, r3)
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r2 = r7.f216260e
            com.tencent.mm.ui.chatting.component.o0 r3 = new com.tencent.mm.ui.chatting.component.o0
            r3.<init>(r7)
            r6 = 2
            r2.mo102071b(r6, r3)
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r2 = r7.f216260e
            com.tencent.mm.ui.chatting.component.p0 r3 = new com.tencent.mm.ui.chatting.component.p0
            r3.<init>(r7)
            r2.mo102071b(r5, r3)
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r2 = r7.f216260e
            com.tencent.mm.ui.chatting.component.q0 r3 = new com.tencent.mm.ui.chatting.component.q0
            r3.<init>(r7)
            r2.mo102071b(r4, r3)
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r2 = r7.f216260e
            com.tencent.mm.ui.chatting.component.r0 r3 = new com.tencent.mm.ui.chatting.component.r0
            r3.<init>(r7)
            r6 = 4
            r2.mo102071b(r6, r3)
            ck3.b r2 = r7.f215752d
            android.app.Activity r2 = r2.mo91565f()
            r3 = 2130772149(0x7f0100b5, float:1.7147408E38)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r3)
            r7.f216266n = r2
            ck3.b r2 = r7.f215752d
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r0)
            zj3.l r2 = (zj3.C79368l) r2
            com.tencent.mm.ui.chatting.component.m0 r3 = new com.tencent.mm.ui.chatting.component.m0
            r3.<init>(r7)
            r2.mo108211t5(r3)
        L_0x00b5:
            ck3.b r2 = r7.f215752d
            com.tencent.mm.storage.z1 r2 = r2.mo91574o()
            r7.f216263h = r2
            ck3.b r2 = r7.f215752d
            boolean r2 = r2.mo91582w()
            if (r2 != 0) goto L_0x00da
            ck3.b r2 = r7.f215752d
            java.lang.Class<zj3.e> r3 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r3)
            zj3.e r2 = (zj3.C79348e) r2
            boolean r2 = r2.mo70075s4()
            if (r2 == 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r2 = 0
            goto L_0x00db
        L_0x00da:
            r2 = 1
        L_0x00db:
            r7.f216264i = r2
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r2 = r7.f216260e
            r2.mo102070a()
            ck3.b r2 = r7.f215752d
            com.tencent.mm.ui.MMActivityController r2 = r2.mo91564e()
            com.tencent.mm.ui.tools.j1 r3 = r7.f216261f
            r2.mo177078i(r5, r3)
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r2 = r7.f216260e
            if (r2 == 0) goto L_0x00fb
            android.view.animation.Animation r3 = r7.f216266n
            r2.startAnimation(r3)
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r2 = r7.f216260e
            r2.setVisibility(r4)
        L_0x00fb:
            r7.f216262g = r5
            ck3.b r2 = r7.f215752d
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r1 = r2.mo102812a(r1)
            zj3.u0 r1 = (zj3.C79384u0) r1
            r1.mo102503H2()
            ck3.b r1 = r7.f215752d
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r0 = r1.mo102812a(r0)
            zj3.l r0 = (zj3.C79368l) r0
            r0.mo108193e5(r8)
            r0.mo108192d2()
            long r1 = r8.getMsgId()
            r0.mo108183N0(r1)
            int r8 = r0.mo108181M5()
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar r0 = r7.f216260e
            r0.mo102072c(r8)
            ck3.b r8 = r7.f215752d
            java.lang.Class<zj3.r> r0 = zj3.C79379r.class
            com.tencent.mm.ui.chatting.manager.a r8 = r8.f193278b
            xi.d r8 = r8.mo102812a(r0)
            zj3.r r8 = (zj3.C79379r) r8
            r8.mo102493X3()
            ck3.b r8 = r7.f215752d
            r8.mo91578s()
            r7.mo102682Y5()
            ck3.b r8 = r7.f215752d
            java.lang.Class<zj3.w> r0 = zj3.C79387w.class
            com.tencent.mm.ui.chatting.manager.a r8 = r8.f193278b
            xi.d r8 = r8.mo102812a(r0)
            zj3.w r8 = (zj3.C79387w) r8
            r8.mo102180G3()
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 10811(0x2a3b, float:1.515E-41)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1[r4] = r2
            r8.mo160131h(r0, r1)
            com.tencent.mm.storage.z1 r8 = r7.f216263h
            boolean r8 = r8.mo62916m3()
            if (r8 == 0) goto L_0x0183
            ck3.b r8 = r7.f215752d
            r0 = 2131309154(0x7f093262, float:1.8236584E38)
            r8.getClass()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r4] = r2
            java.lang.String r2 = "MicroMsg.ChattingContext"
            java.lang.String r3 = "[showOptionMenu] menuID:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            com.tencent.mm.ui.chatting.v3 r8 = r8.f193287k
            r8.removeOptionMenu(r0)
        L_0x0183:
            ck3.b r8 = r7.f215752d
            java.lang.Class<zj3.d0> r0 = zj3.C79346d0.class
            com.tencent.mm.ui.chatting.manager.a r8 = r8.f193278b
            xi.d r8 = r8.mo102812a(r0)
            zj3.d0 r8 = (zj3.C79346d0) r8
            r8.mo102652f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73655y0.mo102681X2(com.tencent.mm.storage.f4):void");
    }

    /* renamed from: Y5 */
    public final void mo102682Y5() {
        if (this.f216262g) {
            this.f215752d.mo91554O(false);
        } else {
            ((C79343c0) this.f215752d.f193278b.mo102812a(C79343c0.class)).mo102628n3();
        }
        ((C79362h1) this.f215752d.f193278b.mo102812a(C79362h1.class)).mo102319B0();
    }

    /* renamed from: e0 */
    public boolean mo22498e0() {
        return true;
    }

    /* renamed from: g0 */
    public void mo22499g0(Bundle bundle) {
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        if (this.f216262g) {
            mo102686y3();
        }
    }

    /* renamed from: m6 */
    public void mo22500m6(C77632o.C77633a aVar) {
        mo102686y3();
    }

    /* renamed from: n0 */
    public List<C72963f4> mo102683n0() {
        LinkedList linkedList = new LinkedList();
        for (Long longValue : ((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class)).mo108206p3()) {
            long longValue2 = longValue.longValue();
            Log.m105927v("MicroMsg.ChattingMoreBtnBarHelper", "select msg id %d", Long.valueOf(longValue2));
            linkedList.add(((C72972g4) C97625j3.m125812b().mo105911z()).b00(longValue2));
        }
        Collections.sort(linkedList, new C73656a(this));
        return linkedList;
    }

    /* renamed from: o3 */
    public void mo102684o3() {
        C106742j1 j1Var = this.f216261f;
        if (j1Var != null) {
            j1Var.mo153850b();
            this.f216261f.f319122j = null;
        }
    }

    /* renamed from: p2 */
    public boolean mo102685p2() {
        return this.f216262g;
    }

    /* renamed from: r7 */
    public void mo22502r7(C77632o.C77633a aVar) {
        this.f215752d.mo91558S();
        mo102686y3();
    }

    /* renamed from: s0 */
    public boolean mo22503s0() {
        return this.f216265j;
    }

    /* renamed from: y3 */
    public void mo102686y3() {
        this.f215752d.mo91564e().mo177078i(false, this.f216261f);
        ChattingFooterMoreBtnBar chattingFooterMoreBtnBar = this.f216260e;
        if (chattingFooterMoreBtnBar != null) {
            chattingFooterMoreBtnBar.setVisibility(8);
        }
        ((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class)).mo108179M2();
        ((C79348e) this.f215752d.f193278b.mo102812a(C79348e.class)).mo70069l1();
        ((C79384u0) this.f215752d.f193278b.mo102812a(C79384u0.class)).mo102503H2();
        this.f216262g = false;
        mo102682Y5();
        ((C79379r) this.f215752d.f193278b.mo102812a(C79379r.class)).mo102494f1();
        ((C79387w) this.f215752d.f193278b.mo102812a(C79387w.class)).mo102180G3();
        this.f215752d.mo91578s();
        C73313b1.C73320g gVar = C73313b1.f215414a;
        gVar.f215425a = null;
        gVar.f215426b = false;
        gVar.f215427c = null;
        gVar.f215428d = null;
        gVar.f215429e = null;
        gVar.f215430f = null;
    }

    /* renamed from: z1 */
    public void mo22504z1(C77632o.C77633a aVar) {
    }
}
