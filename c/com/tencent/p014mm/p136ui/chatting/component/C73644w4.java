package com.tencent.p014mm.p136ui.chatting.component;

import android.os.Looper;
import android.os.Message;
import ck3.C67391b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C75576f4;
import eb0.C97625j3;
import g62.C75875l;
import ob0.C11385n;
import p270xi.C91212b;
import zj3.C79343c0;
import zj3.C79388w0;

@C91212b(exportInterface = C79388w0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.w4 */
public class C73644w4 extends C73412a implements C79388w0, C11385n, C75875l.C75877b {

    /* renamed from: i */
    public static boolean f216245i;

    /* renamed from: e */
    public int f216246e;

    /* renamed from: f */
    public int f216247f = -1;

    /* renamed from: g */
    public MMHandler f216248g = new C73645a();

    /* renamed from: h */
    public long f216249h;

    /* renamed from: com.tencent.mm.ui.chatting.component.w4$a */
    public class C73645a extends MMHandler {
        public C73645a() {
        }

        public void handleMessage(Message message) {
            C67391b bVar = C73644w4.this.f215752d;
            if (bVar != null && bVar.f193283g) {
                if (!bVar.f193295s) {
                    Log.m105920e("MicroMsg.SignallingComponent", "current ChattingUI lose focus!");
                    C73644w4.this.f215752d.f193296t = true;
                    return;
                }
                bVar.f193296t = false;
                if (C73644w4.f216245i) {
                    C73644w4.f216245i = false;
                    ((C79343c0) bVar.f193278b.mo102812a(C79343c0.class)).mo102611a();
                    C73644w4.this.f215752d.mo91540A();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.w4$b */
    public class C73646b implements C75576f4.C75578b {
        public C73646b(C73644w4 w4Var) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55455Q();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.w4$c */
    public class C73647c implements C75576f4.C75578b {
        public C73647c(C73644w4 w4Var) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55487q();
            }
        }
    }

    /* renamed from: Q */
    public void mo102671Q() {
        if (this.f216246e == -2) {
            C97625j3.m125815e().mo123460f(new C75576f4(new C73646b(this), (String) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
    /* renamed from: a4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102672a4(int r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            ck3.b r2 = r0.f215752d
            java.lang.String r3 = "MicroMsg.SignallingComponent"
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x001e
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r2 = r2.toString()
            r1[r4] = r2
            java.lang.String r2 = "[doDirectSend] mChattingContext is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r1)
            return
        L_0x001e:
            boolean r6 = r2.mo91582w()
            if (r6 != 0) goto L_0x0037
            java.lang.Class<zj3.e> r6 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r7 = r2.f193278b
            xi.d r6 = r7.mo102812a(r6)
            zj3.e r6 = (zj3.C79348e) r6
            boolean r6 = r6.mo70075s4()
            if (r6 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r6 = 0
            goto L_0x0038
        L_0x0037:
            r6 = 1
        L_0x0038:
            com.tencent.mm.storage.u1 r7 = eb0.C97625j3.m125818h()
            r8 = 35
            r9 = 10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r7 = r7.mo119661b(r8, r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.lang.String r9 = r2.mo91577r()
            r8.add(r9)
            r9 = -2
            r10 = 111(0x6f, float:1.56E-43)
            r11 = 2
            if (r7 != r9) goto L_0x0092
            if (r6 == 0) goto L_0x0074
            if (r1 == r5) goto L_0x0066
            if (r1 != r11) goto L_0x0074
        L_0x0066:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r2[r4] = r1
            java.lang.String r1 = "oreh old logic doDirectSend not support chatStatus:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r1, r2)
            return
        L_0x0074:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r2[r4] = r5
            java.lang.String r4 = "oreh old logic doDirectSend done chatStatus:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r2)
            com.tencent.mm.modelsimple.q r2 = new com.tencent.mm.modelsimple.q
            byte[] r1 = p823sg.C90196p.m112888e(r17)
            r2.<init>(r10, r8, r1)
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            r1.mo123460f(r2)
            return
        L_0x0092:
            if (r6 != 0) goto L_0x012f
            java.lang.String r6 = r2.mo91577r()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85848s5(r6)
            if (r6 != 0) goto L_0x012f
            java.lang.String r6 = r2.mo91577r()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85798E5(r6)
            if (r6 != 0) goto L_0x012f
            com.tencent.mm.storage.z1 r2 = r2.mo91574o()
            boolean r2 = r2.mo62916m3()
            if (r2 == 0) goto L_0x00b4
            goto L_0x012f
        L_0x00b4:
            long r12 = r0.f216249h
            r14 = 0
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x00e0
            ck3.b r2 = r0.f215752d
            java.lang.Class<zj3.h0> r6 = zj3.C79361h0.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r6)
            zj3.h0 r2 = (zj3.C79361h0) r2
            java.util.List r2 = r2.mo102465P0()
            if (r2 == 0) goto L_0x00e0
            int r6 = r2.size()
            if (r6 <= 0) goto L_0x00e0
            java.lang.Object r2 = r2.get(r4)
            com.tencent.mm.storage.f4 r2 = (com.tencent.p014mm.storage.C72963f4) r2
            long r12 = r2.getCreateTime()
            r0.f216249h = r12
        L_0x00e0:
            long r12 = r0.f216249h
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r12)
            r2 = -1
            r14 = 1000(0x3e8, double:4.94E-321)
            if (r7 == r2) goto L_0x0119
            long r5 = (long) r7
            long r5 = r5 * r14
            int r9 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x00f3
            goto L_0x0119
        L_0x00f3:
            java.lang.Object[] r5 = new java.lang.Object[r11]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)
            r5[r4] = r6
            long r12 = r12 / r14
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r2 = 1
            r5[r2] = r4
            java.lang.String r2 = "oreh doDirectSend done chatStatus:%d, delt:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r5)
            com.tencent.mm.modelsimple.q r2 = new com.tencent.mm.modelsimple.q
            byte[] r1 = p823sg.C90196p.m112888e(r17)
            r2.<init>(r10, r8, r1)
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            r1.mo123460f(r2)
            return
        L_0x0119:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            long r12 = r12 / r14
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r1[r4] = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r2 = 1
            r1[r2] = r4
            java.lang.String r2 = "oreh doDirectSend interval too long: %d;  interval: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r1)
            return
        L_0x012f:
            java.lang.String r1 = "oreh doDirectSend not support"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73644w4.mo102672a4(int):void");
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        ((C72972g4) C97625j3.m125812b().mo105911z()).mo101137qq(this, Looper.getMainLooper());
        C97625j3.m125815e().mo123455a(10, this);
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        Log.m105925i("MicroMsg.SignallingComponent", "[onComponentUnInstall] hash:%s", this);
        this.f216248g.removeCallbacksAndMessages((Object) null);
        ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(this);
        C97625j3.m125815e().mo123470p(10, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        r11 = (com.tencent.p014mm.modelsimple.C114745q) r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r8, int r9, java.lang.String r10, ob0.C117747y r11) {
        /*
            r7 = this;
            java.lang.Class<zj3.c0> r10 = zj3.C79343c0.class
            java.lang.Class<zj3.u0> r0 = zj3.C79384u0.class
            ck3.b r1 = r7.f215752d
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            r1.mo91561b()
            r1 = 10
            int r2 = r11.getType()
            if (r1 == r2) goto L_0x0015
            return
        L_0x0015:
            ck3.b r1 = r7.f215752d
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r0)
            zj3.u0 r1 = (zj3.C79384u0) r1
            boolean r1 = r1.mo102513x2()
            ck3.b r2 = r7.f215752d
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r0)
            zj3.u0 r2 = (zj3.C79384u0) r2
            boolean r2 = r2.mo102509Y()
            ck3.b r3 = r7.f215752d
            com.tencent.mm.ui.chatting.manager.a r3 = r3.f193278b
            xi.d r0 = r3.mo102812a(r0)
            zj3.u0 r0 = (zj3.C79384u0) r0
            boolean r0 = r0.mo102502H1()
            r3 = 3
            r4 = 0
            java.lang.String r5 = "MicroMsg.SignallingComponent"
            r6 = 1
            if (r0 != 0) goto L_0x00f8
            if (r2 != 0) goto L_0x00f8
            if (r1 == 0) goto L_0x004c
            goto L_0x00f8
        L_0x004c:
            if (r8 != 0) goto L_0x00f7
            if (r9 != 0) goto L_0x00f7
            com.tencent.mm.modelsimple.q r11 = (com.tencent.p014mm.modelsimple.C114745q) r11
            java.lang.String r8 = r11.f344015f
            if (r8 == 0) goto L_0x00f7
            ck3.b r9 = r7.f215752d
            java.lang.String r9 = r9.mo91577r()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00f7
            byte[] r8 = r11.f344016g
            if (r8 == 0) goto L_0x00f1
            int r9 = r8.length
            r11 = 4
            if (r9 == r11) goto L_0x006c
            goto L_0x00f1
        L_0x006c:
            int r8 = p823sg.C90196p.m112885b(r8, r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "directsend: status="
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r9)
            r0 = 15000(0x3a98, double:7.411E-320)
            if (r8 == r6) goto L_0x00cc
            if (r8 == r3) goto L_0x00af
            f216245i = r4
            ck3.b r8 = r7.f215752d
            com.tencent.mm.ui.chatting.manager.a r8 = r8.f193278b
            xi.d r8 = r8.mo102812a(r10)
            zj3.c0 r8 = (zj3.C79343c0) r8
            r8.mo102611a()
            ck3.b r8 = r7.f215752d
            boolean r9 = r8.f193295s
            if (r9 != 0) goto L_0x00a9
            java.lang.String r8 = "onSceneEnd, current ChattingUI lose focus!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            ck3.b r8 = r7.f215752d
            r8.f193296t = r6
            return
        L_0x00a9:
            r8.f193296t = r4
            r8.mo91540A()
            goto L_0x00f7
        L_0x00af:
            f216245i = r6
            ck3.b r8 = r7.f215752d
            com.tencent.mm.ui.chatting.manager.a r8 = r8.f193278b
            xi.d r8 = r8.mo102812a(r10)
            zj3.c0 r8 = (zj3.C79343c0) r8
            r9 = 2131823672(0x7f110c38, float:1.928015E38)
            r8.mo102603I0(r9)
            android.os.Message r8 = new android.os.Message
            r8.<init>()
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r7.f216248g
            r9.sendMessageDelayed(r8, r0)
            goto L_0x00f7
        L_0x00cc:
            f216245i = r6
            ck3.b r8 = r7.f215752d
            com.tencent.mm.ui.chatting.manager.a r8 = r8.f193278b
            xi.d r8 = r8.mo102812a(r10)
            zj3.c0 r8 = (zj3.C79343c0) r8
            r9 = 2131823671(0x7f110c37, float:1.9280148E38)
            r8.mo102603I0(r9)
            android.os.Message r8 = new android.os.Message
            r8.<init>()
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r7.f216248g
            r9.sendMessageDelayed(r8, r0)
            com.tencent.mm.autogen.events.ReceiveTypingEvent r8 = new com.tencent.mm.autogen.events.ReceiveTypingEvent
            r8.<init>()
            r8.publish()
            goto L_0x00f7
        L_0x00f1:
            java.lang.String r8 = "unknown directsend op"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
        L_0x00f7:
            return
        L_0x00f8:
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            r8[r4] = r9
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            r8[r6] = r9
            r9 = 2
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            r8[r9] = r10
            java.lang.String r9 = "[onSceneEnd] [%s|%s|%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73644w4.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    /* renamed from: q */
    public void mo102673q() {
        C97625j3.m125815e().mo123460f(new C75576f4(new C73647c(this), (String) null));
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        Log.m105925i("MicroMsg.SignallingComponent", "[onComponentInstall] hash:%s", this);
        C97625j3.m125815e().mo123460f(new C75576f4(new C30835x4(this), (String) null));
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(this);
        C97625j3.m125815e().mo123470p(10, this);
    }

    /* renamed from: w5 */
    public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
        Log.m105918d("MicroMsg.SignallingComponent", "on msg notify change");
        C67391b bVar = this.f215752d;
        if (bVar == null) {
            Log.m105928w("MicroMsg.SignallingComponent", "[onNotifyChange] mChattingContext is null!");
        } else if (bVar.mo91577r().equals(eVar.f123844a) && "insert".equals(eVar.f123845b) && eVar.f123846c.size() > 0 && eVar.f123846c.get(0).mo108769t2() == 0) {
            Log.m105925i("MicroMsg.SignallingComponent", "summerbadcr oreh onNotifyChange receive a new msg flag[%d], msgSeq[%d]", Integer.valueOf(eVar.f123846c.get(0).mo108762o2()), Long.valueOf(eVar.f123846c.get(0).mo108772w2()));
            this.f216249h = Util.nowMilliSecond();
        }
    }
}
