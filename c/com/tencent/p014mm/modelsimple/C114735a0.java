package com.tencent.p014mm.modelsimple;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116746l3;
import eb0.C75576f4;
import eb0.C7627m3;
import f40.C86709a0;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedList;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$c;
import ob0.y$$d;
import org.xmlpull.v1.XmlPullParserException;
import p823sg.C77710q;
import qe3.C101127f;
import qe3.C118188q;
import qe3.C118189r;
import qe3.C89625d;
import sf0.C48374j0;
import te3.C118420aa;
import te3.C118458pu2;
import te3.C49569gj3;
import te3.C51018qv3;
import te3.C64666qu2;
import te3.C64691ru2;
import te3.ay4;
import te3.d54;
import te3.i45;
import te3.vc4;

/* renamed from: com.tencent.mm.modelsimple.a0 */
public class C114735a0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f343979d;

    /* renamed from: e */
    public final C114799u f343980e;

    /* renamed from: f */
    public String f343981f;

    /* renamed from: g */
    public String f343982g;

    /* renamed from: h */
    public String f343983h;

    /* renamed from: i */
    public int f343984i;

    /* renamed from: j */
    public int f343985j;

    /* renamed from: n */
    public int f343986n;

    /* renamed from: o */
    public int f343987o;

    /* renamed from: p */
    public String f343988p;

    /* renamed from: q */
    public boolean f343989q;

    /* renamed from: com.tencent.mm.modelsimple.a0$c */
    public static class C1301c {

        /* renamed from: a */
        public int f10408a;

        /* renamed from: b */
        public String f10409b;

        /* renamed from: c */
        public String f10410c;

        /* renamed from: d */
        public String f10411d;

        /* renamed from: e */
        public String f10412e;

        /* renamed from: f */
        public Bundle f10413f;

        public String toString() {
            return String.format("AuthBioInfo hash[%d], type[%d]. username[%s], ticket[%s], helpUrlp[%s], wording[%s], extra[%s]", new Object[]{Integer.valueOf(hashCode()), Integer.valueOf(this.f10408a), this.f10412e, Util.secPrint(this.f10409b), this.f10410c, this.f10411d, this.f10413f});
        }
    }

    /* renamed from: com.tencent.mm.modelsimple.a0$a */
    public class C114736a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f343990d;

        /* renamed from: com.tencent.mm.modelsimple.a0$a$a */
        public class C114737a implements C11385n {
            public C114737a() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                Log.m105919d("MicroMsg.NetSceneManualAuth", "summerauth dkcert getcert type:%d ret [%d,%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 0 && i2 == 0) {
                    C114735a0 a0Var = C114735a0.this;
                    a0Var.doScene(a0Var.dispatcher(), C114735a0.this.f343979d);
                    return;
                }
                C114735a0 a0Var2 = C114735a0.this;
                a0Var2.f343979d.onSceneEnd(i, i2, "", a0Var2);
            }
        }

        public C114736a(int i) {
            this.f343990d = i;
        }

        public void run() {
            new C40371t(this.f343990d).doScene(C114735a0.this.dispatcher(), new C114737a());
        }

        public String toString() {
            return super.toString() + "|onGYNetEnd1";
        }
    }

    /* renamed from: com.tencent.mm.modelsimple.a0$b */
    public class C114738b implements C75576f4.C75578b {

        /* renamed from: a */
        public final /* synthetic */ C118189r f343993a;

        public C114738b(C114735a0 a0Var, C118189r rVar) {
            this.f343993a = rVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
            r1 = r12.f343993a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo57753a(com.tencent.p014mm.network.C114770g r13) {
            /*
                r12 = this;
                java.lang.String r0 = "MicroMsg.NetSceneManualAuth"
                if (r13 == 0) goto L_0x0098
                com.tencent.mm.network.e r1 = r13.mo55443A3()
                if (r1 == 0) goto L_0x0098
                qe3.r r1 = r12.f343993a
                r2 = 1
                byte[] r1 = r1.mo182988a(r2)
                if (r1 == 0) goto L_0x0098
                qe3.r r1 = r12.f343993a
                r3 = 2
                byte[] r1 = r1.mo182988a(r3)
                if (r1 == 0) goto L_0x0098
                qe3.r r1 = r12.f343993a
                r4 = 3
                byte[] r1 = r1.mo182988a(r4)
                if (r1 == 0) goto L_0x0098
                qe3.r r1 = r12.f343993a
                te3.xk4 r5 = r1.f353315a
                if (r5 == 0) goto L_0x0098
                te3.y7 r5 = r5.f354538e
                if (r5 != 0) goto L_0x0030
                goto L_0x0098
            L_0x0030:
                r5 = 4
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                byte[] r1 = r1.mo182988a(r2)
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.dumpHex(r1)
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r1)
                r5[r6] = r1
                qe3.r r1 = r12.f343993a
                byte[] r1 = r1.mo182988a(r3)
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.dumpHex(r1)
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r1)
                r5[r2] = r1
                qe3.r r1 = r12.f343993a
                byte[] r1 = r1.mo182988a(r4)
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.dumpHex(r1)
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r1)
                r5[r3] = r1
                qe3.r r1 = r12.f343993a
                te3.xk4 r1 = r1.f353315a
                te3.y7 r1 = r1.f354538e
                int r1 = r1.f354583d
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5[r4] = r1
                java.lang.String r1 = "summerauth NetSceneLocalProxy setSessionInfo session:%s, %s, %s uin:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r5)
                com.tencent.mm.network.e r13 = r13.mo55443A3()
                qe3.r r0 = r12.f343993a
                byte[] r0 = r0.mo182988a(r2)
                qe3.r r1 = r12.f343993a
                byte[] r1 = r1.mo182988a(r3)
                qe3.r r2 = r12.f343993a
                byte[] r2 = r2.mo182988a(r4)
                qe3.r r3 = r12.f343993a
                te3.xk4 r3 = r3.f353315a
                te3.y7 r3 = r3.f354538e
                int r3 = r3.f354583d
                r13.mo55422X0(r0, r1, r2, r3)
                return
            L_0x0098:
                kj2.d r4 = kj2.C117407d.INSTANCE
                r5 = 148(0x94, double:7.3E-322)
                r7 = 8
                r9 = 1
                r11 = 0
                r4.idkeyStat(r5, r7, r9, r11)
                java.lang.String r13 = "[arthurdan.NetSceneManualAuthCrash] fatal error dispatcher == null || null == dispatcher.getAccInfo() || null == resp.getSession() || null == resp.rImpl || null == resp.rImpl.AuthSectResp !!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelsimple.C114735a0.C114738b.mo57753a(com.tencent.mm.network.g):void");
        }
    }

    public C114735a0(int i, String str, String str2, String str3) {
        this("", "", i, str, str2, str3, 0, "", false, false);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f343979d = nVar;
        return dispatch(gVar, this.f343980e, this);
    }

    public int getType() {
        return C101127f.f296015a ? 252 : 701;
    }

    /* renamed from: j1 */
    public String mo174354j1() {
        C114799u uVar = this.f343980e;
        return ((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e == null ? "" : ((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354595s;
    }

    /* renamed from: k1 */
    public String mo174355k1() {
        return ((C118189r) ((C116746l3) this.f343980e).f350049c).f353315a.f354538e.f354597u;
    }

    /* renamed from: l1 */
    public String mo174356l1() {
        d54 d54;
        LinkedList<vc4> linkedList;
        C114799u uVar = this.f343980e;
        if (!(((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e == null || (d54 = ((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354596t) == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0)) {
            Iterator<vc4> it = d54.f182633e.iterator();
            while (it.hasNext()) {
                vc4 next = it.next();
                if (next.f185871d == 16) {
                    return next.f185872e;
                }
            }
        }
        return "";
    }

    /* renamed from: m1 */
    public byte[] mo174357m1() {
        if (((C118189r) ((C116746l3) this.f343980e).f350049c).f353315a.f354538e == null) {
            return new byte[0];
        }
        int p1 = mo174360p1();
        if (p1 == 3) {
            C114799u uVar = this.f343980e;
            if (((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354590n != null) {
                return C48374j0.m53716e(((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354590n.f135864e, new byte[0]);
            }
        } else if (p1 == 1) {
            C114799u uVar2 = this.f343980e;
            if (((C118189r) ((C116746l3) uVar2).f350049c).f353315a.f354538e.f354589j != null) {
                return C48374j0.m53716e(((C118189r) ((C116746l3) uVar2).f350049c).f353315a.f354538e.f354589j.f131398g, new byte[0]);
            }
        } else if (p1 == 2 && ((C118188q) this.f343980e.getReqObj()).f353310b.f185080d != null) {
            C86709a0.m107523b().mo121113k().mo182476f(Util.getLong(((C118188q) this.f343980e.getReqObj()).f353310b.f185080d.f185297f, 0), C48374j0.m53715d(((C118189r) ((C116746l3) this.f343980e).f350049c).f353315a.f354538e.f354588i));
            return C86709a0.m107523b().mo121113k().mo182475e(Util.getLong(((C118188q) this.f343980e.getReqObj()).f353310b.f185080d.f185297f, 0));
        }
        return new byte[0];
    }

    /* renamed from: n1 */
    public String mo174358n1() {
        if (((C118189r) ((C116746l3) this.f343980e).f350049c).f353315a.f354538e != null && mo174360p1() == 1) {
            C114799u uVar = this.f343980e;
            if (((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354589j != null) {
                if (((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354589j.f131395d != null) {
                    return ((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354589j.f131395d;
                }
                return null;
            }
        }
        return "";
    }

    /* renamed from: o1 */
    public String mo174359o1() {
        if (((C118189r) ((C116746l3) this.f343980e).f350049c).f353315a.f354538e == null) {
            return "";
        }
        int p1 = mo174360p1();
        if (p1 == 3) {
            C114799u uVar = this.f343980e;
            if (((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354590n != null) {
                return Util.nullAsNil(((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354590n.f135863d);
            }
        } else if (p1 == 1) {
            C114799u uVar2 = this.f343980e;
            if (((C118189r) ((C116746l3) uVar2).f350049c).f353315a.f354538e.f354589j != null) {
                return Util.nullAsNil(((C118189r) ((C116746l3) uVar2).f350049c).f353315a.f354538e.f354589j.f131397f);
            }
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0381  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r27, int r28, int r29, java.lang.String r30, com.tencent.p014mm.network.C114799u r31, byte[] r32) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            r2 = r29
            r3 = r30
            qe3.w$d r4 = r31.getReqObj()
            qe3.q r4 = (qe3.C118188q) r4
            qe3.w$e r5 = r31.getRespObj()
            qe3.r r5 = (qe3.C118189r) r5
            te3.xk4 r6 = r5.f353315a
            r7 = 0
            java.lang.String r8 = "MicroMsg.NetSceneManualAuth"
            r9 = 1
            if (r6 == 0) goto L_0x0056
            te3.y7 r6 = r6.f354538e
            if (r6 == 0) goto L_0x0056
            int r6 = r6.f354602z
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r10[r7] = r11
            java.lang.String r11 = "summerauth mmtls manual:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r10)
            f40.C86709a0.m107528h()
            f40.o r10 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.u1 r10 = r10.f251803a
            r11 = 47
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r10.mo119664f(r11, r12)
            f40.g r10 = f40.C86709a0.m107529k()
            ob0.b0 r10 = r10.f251779b
            com.tencent.mm.network.g r10 = r10.f256809d
            if (r10 == 0) goto L_0x0068
            r6 = r6 & r9
            if (r6 != 0) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            r10.mo55468b3(r6)
            goto L_0x0068
        L_0x0056:
            java.lang.Object[] r6 = new java.lang.Object[r9]
            int r10 = r5.getRetCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r7] = r10
            java.lang.String r10 = "summerauth mmtls manual not set as ret:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r6)
        L_0x0068:
            r0.f343984i = r1
            r0.f343985j = r2
            te3.xk4 r6 = r5.f353315a
            java.lang.String r10 = ""
            r11 = -1
            r12 = 4
            if (r6 != 0) goto L_0x008c
            java.lang.String r1 = "summerauth error unifyAuthResp is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            ob0.n r1 = r0.f343979d
            r1.onSceneEnd(r12, r11, r10, r0)
            kj2.d r2 = kj2.C117407d.INSTANCE
            r3 = 148(0x94, double:7.3E-322)
            r5 = 3
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            return
        L_0x008c:
            int r13 = r6.f354537d
            r14 = 11
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r15 = r0.f343983h
            r14[r7] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r28)
            r14[r9] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r29)
            r7 = 2
            r14[r7] = r15
            r15 = 3
            r14[r15] = r3
            r14[r12] = r6
            r16 = 5
            java.lang.Integer r17 = java.lang.Integer.valueOf(r13)
            r14[r16] = r17
            r16 = 6
            te3.y7 r15 = r6.f354538e
            r14[r16] = r15
            r16 = 7
            te3.c1 r12 = r6.f354539f
            r14[r16] = r12
            r12 = 8
            te3.g33 r9 = r6.f354540g
            r14[r12] = r9
            r9 = 9
            if (r15 != 0) goto L_0x00cb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            goto L_0x00cd
        L_0x00cb:
            te3.qv3 r12 = r15.f354580B
        L_0x00cd:
            r14[r9] = r12
            te3.y7 r9 = r6.f354538e
            if (r9 != 0) goto L_0x00d8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            goto L_0x00da
        L_0x00d8:
            te3.qv3 r9 = r9.f354581C
        L_0x00da:
            r12 = 10
            r14[r12] = r9
            java.lang.String r9 = "summerauth account %s, errType:%d, errCode:%d, errMsg:%s unifyAuthResp:%s, unifyFlag:%d, auth:%s, acct:%s, network:%s  clientSessionKey[%s], serverSessionKey[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r14)
            if (r1 != 0) goto L_0x021c
            if (r2 == 0) goto L_0x00ea
            goto L_0x021c
        L_0x00ea:
            r9 = r13 & 2
            if (r9 == 0) goto L_0x020f
            te3.c1 r6 = r6.f354539f
            if (r6 == 0) goto L_0x0202
            java.lang.String r6 = r6.f353929d
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x00fc
            goto L_0x0202
        L_0x00fc:
            int r6 = eb0.C116746l3.m164675a(r31)
            if (r6 != r7) goto L_0x014b
            kj2.d r18 = kj2.C117407d.INSTANCE
            r19 = 148(0x94, double:7.3E-322)
            r21 = 7
            r23 = 1
            r25 = 0
            r18.idkeyStat(r19, r21, r23, r25)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r0.f343987o
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "summerauth decode faild loginDecodeFailedTry:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r3, r2)
            int r2 = r0.f343987o
            int r2 = r2 + r1
            r0.f343987o = r2
            if (r2 <= r1) goto L_0x012f
            ob0.n r1 = r0.f343979d
            r2 = 4
            r1.onSceneEnd(r2, r11, r10, r0)
            goto L_0x014a
        L_0x012f:
            com.tencent.mm.network.u r2 = r26.getReqResp()
            qe3.w$d r2 = r2.getReqObj()
            qe3.q r2 = (qe3.C118188q) r2
            te3.qu2 r2 = r2.f353310b
            te3.pu2 r2 = r2.f185081e
            te3.aa r2 = r2.f354250d
            r2.f353910i = r1
            com.tencent.mm.network.g r1 = r26.dispatcher()
            ob0.n r2 = r0.f343979d
            r0.doScene(r1, r2)
        L_0x014a:
            return
        L_0x014b:
            com.tencent.mm.sdk.platformtools.MMHandlerThread r6 = f40.C86709a0.m107525e()
            r6.setHighPriority()
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r9 = 0
            r6[r9] = r7
            int r7 = android.os.Process.myTid()
            int r7 = android.os.Process.getThreadPriority(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 1
            r6[r10] = r7
            java.lang.String r7 = "summerauth dkidc setAccUin Begin thread:[%s,%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r7, r6)
            te3.xk4 r6 = r5.f353315a
            eb0.C116728e2.m164639b(r6, r9)
            java.lang.Class<ru0.b> r6 = ru0.C118231b.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ru0.b r6 = (ru0.C118231b) r6
            ru0.b$b r6 = r6.f353396d
            r6.onAuthResponse(r4, r5, r9)
            java.lang.String r4 = r0.f343983h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x01a6
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LAST_LOGIN_USERNAME_STRING
            java.lang.String r7 = r0.f343983h
            r4.mo119677K(r6, r7)
            eb0.i3 r4 = eb0.C7624i3.f25910c
            java.lang.String r6 = r0.f343983h
            java.lang.String r7 = "login_user_name"
            r4.mo8756d(r7, r6)
        L_0x01a6:
            f40.g r4 = f40.C86709a0.m107529k()
            ob0.b0 r4 = r4.f251779b
            eb0.f4 r6 = new eb0.f4
            com.tencent.mm.modelsimple.a0$b r7 = new com.tencent.mm.modelsimple.a0$b
            r7.<init>(r0, r5)
            r5 = 0
            r6.<init>(r7, r5)
            r4.mo123460f(r6)
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            r6 = 15
            java.lang.Object r4 = r4.mo119684e(r6, r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r4)
            if (r4 == 0) goto L_0x01df
            java.lang.Class<lc3.c> r4 = lc3.C117474c.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            lc3.c r4 = (lc3.C117474c) r4
            pc0.e0 r4 = r4.yn0()
            r4.mo182766j(r12)
        L_0x01df:
            if (r1 != 0) goto L_0x01f5
            if (r2 != 0) goto L_0x01f5
            java.lang.String r4 = "publishManualAuthEvent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            com.tencent.mm.autogen.events.ManualAuthEvent r4 = new com.tencent.mm.autogen.events.ManualAuthEvent
            r4.<init>()
            com.tencent.mm.autogen.events.ManualAuthEvent$a r5 = r4.f78867d
            r6 = 1
            r5.f78868a = r6
            r4.publish()
        L_0x01f5:
            com.tencent.mm.sdk.platformtools.MMHandlerThread r4 = f40.C86709a0.m107525e()
            r4.setLowPriority()
            ob0.n r4 = r0.f343979d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x0202:
            java.lang.String r1 = "summerauth UserName is null and return false!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            ob0.n r1 = r0.f343979d
            r4 = 4
            r1.onSceneEnd(r4, r11, r10, r0)
            return
        L_0x020f:
            r4 = 4
            java.lang.String r1 = "summerauth acct resp is null and return false!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            ob0.n r1 = r0.f343979d
            r1.onSceneEnd(r4, r11, r10, r0)
            return
        L_0x021c:
            r4 = 4
            if (r1 != r4) goto L_0x02c1
            r4 = -301(0xfffffffffffffed3, float:NaN)
            if (r2 != r4) goto L_0x02c1
            java.lang.String r3 = "summerauth RedirectIDC"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r3)
            kj2.d r17 = kj2.C117407d.INSTANCE
            r18 = 148(0x94, double:7.3E-322)
            r20 = 4
            r22 = 1
            r24 = 0
            r17.idkeyStat(r18, r20, r22, r24)
            te3.g33 r3 = r6.f354540g
            if (r3 == 0) goto L_0x0252
            r17 = 1
            te3.lj r4 = r3.f133828f
            te3.e33 r5 = r3.f133827e
            te3.yg2 r6 = r3.f133826d
            r21 = 1
            int r3 = r3.f133829g
            r18 = r4
            r19 = r5
            r20 = r6
            r22 = r3
            eb0.C116746l3.m164676c(r17, r18, r19, r20, r21, r22)
            goto L_0x0258
        L_0x0252:
            java.lang.String r3 = "summerauth RedirectIDC but NetworkSectResp is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r3)
        L_0x0258:
            int r3 = r0.f343986n
            r4 = 1
            int r3 = r3 - r4
            r0.f343986n = r3
            if (r3 > 0) goto L_0x02a6
            java.lang.String r3 = "summerauth err and return with no try!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r3)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.res.Resources r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r6 = 2131822027(0x7f1105cb, float:1.9276814E38)
            java.lang.String r5 = r5.getString(r6)
            r4.append(r5)
            java.lang.String r5 = "("
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = ", "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = ")"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2 = 0
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r3, (java.lang.CharSequence) r1, (int) r2)
            r1.show()
            ob0.n r1 = r0.f343979d
            r2 = 3
            r1.onSceneEnd(r2, r11, r10, r0)
            goto L_0x03f6
        L_0x02a6:
            r1 = 1
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "summerauth RedirectIDC do scene again redirectCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r1)
            com.tencent.mm.network.g r1 = r26.dispatcher()
            ob0.n r2 = r0.f343979d
            r0.doScene(r1, r2)
            goto L_0x03f6
        L_0x02c1:
            boolean r4 = r0.f343989q
            if (r4 != 0) goto L_0x0301
            r4 = 4
            if (r1 != r4) goto L_0x0302
            r4 = -102(0xffffffffffffff9a, float:NaN)
            if (r2 != r4) goto L_0x0301
            kj2.d r18 = kj2.C117407d.INSTANCE
            r19 = 148(0x94, double:7.3E-322)
            r21 = 5
            r23 = 1
            r25 = 0
            r18.idkeyStat(r19, r21, r23, r25)
            qe3.w$d r1 = r31.getReqObj()
            qe3.b1 r1 = r1.getRsaInfo()
            int r1 = r1.f296014c
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r2)
            com.tencent.mm.sdk.platformtools.MMHandlerThread r2 = f40.C86709a0.m107525e()
            com.tencent.mm.modelsimple.a0$a r3 = new com.tencent.mm.modelsimple.a0$a
            r3.<init>(r1)
            r2.postToWorker(r3)
            goto L_0x03f6
        L_0x0301:
            r4 = 4
        L_0x0302:
            if (r1 != r4) goto L_0x0347
            r4 = -305(0xfffffffffffffecf, float:NaN)
            if (r2 == r4) goto L_0x030f
            r5 = -306(0xfffffffffffffece, float:NaN)
            if (r2 != r5) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            r4 = 4
            goto L_0x0347
        L_0x030f:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r29)
            r5 = 0
            r1[r5] = r3
            int r3 = qe3.C101127f.m132548a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r1[r5] = r3
            java.lang.String r3 = "summerauth auth MM_ERR_CERT_SWITCH or MM_ERR_ECDHFAIL_ROLLBACK errCode:%d ver:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r1)
            kj2.d r9 = kj2.C117407d.INSTANCE
            r10 = 148(0x94, double:7.3E-322)
            if (r2 != r4) goto L_0x0332
            r1 = 108(0x6c, double:5.34E-322)
            goto L_0x0334
        L_0x0332:
            r1 = 109(0x6d, double:5.4E-322)
        L_0x0334:
            r12 = r1
            r14 = 1
            r16 = 1
            r9.idkeyStat(r10, r12, r14, r16)
            com.tencent.mm.network.g r1 = r26.dispatcher()
            ob0.n r2 = r0.f343979d
            r0.doScene(r1, r2)
            goto L_0x03f6
        L_0x0347:
            if (r1 != r4) goto L_0x0361
            r4 = -217(0xffffffffffffff27, float:NaN)
            if (r2 != r4) goto L_0x0360
            ob0.n r4 = r0.f343979d
            r4.onSceneEnd(r1, r2, r3, r0)
            kj2.d r5 = kj2.C117407d.INSTANCE
            r6 = 148(0x94, double:7.3E-322)
            r8 = 47
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            goto L_0x03f6
        L_0x0360:
            r4 = 4
        L_0x0361:
            if (r1 != r4) goto L_0x037b
            r4 = -218(0xffffffffffffff26, float:NaN)
            if (r2 != r4) goto L_0x037a
            ob0.n r4 = r0.f343979d
            r4.onSceneEnd(r1, r2, r3, r0)
            kj2.d r5 = kj2.C117407d.INSTANCE
            r6 = 148(0x94, double:7.3E-322)
            r8 = 53
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            goto L_0x03f6
        L_0x037a:
            r4 = 4
        L_0x037b:
            if (r1 != r4) goto L_0x03b8
            r4 = -240(0xffffffffffffff10, float:NaN)
            if (r2 != r4) goto L_0x03b8
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            int r2 = r0.f343986n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "summerauth auth MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r1)
            int r1 = r0.f343986n
            int r1 = r1 - r4
            r0.f343986n = r1
            if (r1 > 0) goto L_0x03a1
            ob0.n r1 = r0.f343979d
            r2 = 3
            r1.onSceneEnd(r2, r11, r10, r0)
            return
        L_0x03a1:
            kj2.d r12 = kj2.C117407d.INSTANCE
            r13 = 148(0x94, double:7.3E-322)
            r15 = 57
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            com.tencent.mm.network.g r1 = r26.dispatcher()
            ob0.n r2 = r0.f343979d
            r0.doScene(r1, r2)
            goto L_0x03f6
        L_0x03b8:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r29)
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r28)
            r6 = 1
            r4[r6] = r5
            r4[r7] = r3
            java.lang.String r5 = "summerauth Failed. callback and return now ! [%d ,%d ,%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r5, r4)
            ob0.n r4 = r0.f343979d
            r4.onSceneEnd(r1, r2, r3, r0)
            kj2.d r1 = kj2.C117407d.INSTANCE
            r6 = 148(0x94, double:7.3E-322)
            r8 = 6
            r10 = 1
            r12 = 0
            r5 = r1
            r5.idkeyStat(r6, r8, r10, r12)
            boolean r3 = qe3.C101127f.f296015a
            if (r3 == 0) goto L_0x03f6
            r3 = -106(0xffffffffffffff96, float:NaN)
            if (r2 == r3) goto L_0x03f6
            r6 = 148(0x94, double:7.3E-322)
            r8 = 110(0x6e, double:5.43E-322)
            r10 = 1
            r12 = 0
            r5 = r1
            r5.idkeyStat(r6, r8, r10, r12)
        L_0x03f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelsimple.C114735a0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    /* renamed from: p1 */
    public int mo174360p1() {
        if (((C118189r) ((C116746l3) this.f343980e).f350049c).f353315a.f354538e == null) {
            Log.m105920e("MicroMsg.NetSceneManualAuth", "getSecCodeType ERROR AuthSectResp or WxVerifyCodeRespInfo is null");
            return 0;
        }
        int i = this.f343984i;
        if (i != 4) {
            Log.m105921e("MicroMsg.NetSceneManualAuth", "getSecCodeType ERROR errType :%d", Integer.valueOf(i));
            return 0;
        }
        int i2 = this.f343985j;
        if (i2 == -311) {
            return 2;
        }
        if (i2 == -6) {
            return 1;
        }
        return i2 == -310 ? 3 : 0;
    }

    /* renamed from: q1 */
    public int mo174361q1() {
        d54 d54;
        LinkedList<vc4> linkedList;
        C114799u uVar = this.f343980e;
        if (((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e == null || (d54 = ((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354596t) == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0) {
            return 0;
        }
        Iterator<vc4> it = d54.f182633e.iterator();
        while (it.hasNext()) {
            vc4 next = it.next();
            if (next.f185871d == 11) {
                return Util.getInt(next.f185872e, 0);
            }
        }
        return 0;
    }

    /* renamed from: r1 */
    public int mo174362r1() {
        d54 d54;
        LinkedList<vc4> linkedList;
        C114799u uVar = this.f343980e;
        if (((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e == null || (d54 = ((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354596t) == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0) {
            return 0;
        }
        Iterator<vc4> it = d54.f182633e.iterator();
        while (it.hasNext()) {
            vc4 next = it.next();
            if (next.f185871d == 13) {
                return Util.getInt(next.f185872e, 0);
            }
        }
        return 0;
    }

    /* renamed from: s1 */
    public BindWordingContent mo174363s1() {
        String str;
        LinkedList<vc4> linkedList;
        C114799u uVar = this.f343980e;
        if (((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e == null) {
            return null;
        }
        d54 d54 = ((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354596t;
        if (d54 != null && (linkedList = d54.f182633e) != null && linkedList.size() > 0) {
            Iterator<vc4> it = d54.f182633e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                vc4 next = it.next();
                if (next.f185871d == 12) {
                    str = next.f185872e;
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            return null;
        }
        try {
            return new C68138c().mo93650a(str);
        } catch (XmlPullParserException e) {
            Log.printErrStackTrace("MicroMsg.NetSceneManualAuth", e, "", new Object[0]);
            return null;
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.NetSceneManualAuth", e2, "", new Object[0]);
            return null;
        }
    }

    public int securityLimitCount() {
        return 5;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }

    /* renamed from: t1 */
    public String mo174364t1() {
        return ((C118189r) ((C116746l3) this.f343980e).f350049c).f353315a.f354539f.f353933h;
    }

    /* renamed from: u1 */
    public boolean mo174365u1() {
        return (((C118189r) ((C116746l3) this.f343980e).f350049c).f353315a.f354538e.f354600x & 16) != 0;
    }

    /* renamed from: v1 */
    public void mo174366v1(String str) {
        C64666qu2 qu22 = ((C118188q) this.f343980e.getReqObj()).f353310b;
        C64691ru2 ru22 = qu22.f185080d;
        ru22.f185298g = str;
        ru22.f185299h = str;
        C118420aa aaVar = qu22.f185081e.f354250d;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(new byte[0]);
        aaVar.f353905d = qv32;
        this.f343981f = str;
        this.f343982g = str;
    }

    /* renamed from: w1 */
    public C114735a0 mo174367w1(boolean z) {
        this.f343989q = z;
        return this;
    }

    /* renamed from: x1 */
    public boolean mo174368x1() {
        d54 d54;
        LinkedList<vc4> linkedList;
        C114799u uVar = this.f343980e;
        if (((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e != null && (d54 = ((C118189r) ((C116746l3) uVar).f350049c).f353315a.f354538e.f354596t) != null && (linkedList = d54.f182633e) != null && linkedList.size() > 0) {
            Iterator<vc4> it = d54.f182633e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                vc4 next = it.next();
                if (next.f185871d == 18) {
                    if (Util.getInt(next.f185872e, 0) == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public C114735a0(String str, String str2, String str3, int i) {
        this(str, str2, 0, "", "", "", i, str3, false, false);
    }

    public C114735a0(String str, String str2, int i, String str3, String str4, String str5, int i2, String str6, boolean z, boolean z2) {
        C64691ru2 ru22;
        C118188q qVar;
        int i3;
        String str7;
        int i4;
        String str8 = str;
        String str9 = str2;
        int i5 = i;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        int i6 = i2;
        String str13 = str6;
        boolean z3 = z;
        this.f343981f = "";
        this.f343982g = "";
        this.f343983h = "";
        this.f343984i = 0;
        this.f343985j = 0;
        this.f343986n = 3;
        this.f343987o = 0;
        this.f343989q = false;
        Log.m105918d("MicroMsg.NetSceneManualAuth", "summerauth NetSceneManualAuth this: " + this + " account: " + str8 + " secCodetype: " + i5 + " secCode: " + str10 + " sid: " + str11 + " encryptKey: " + str12 + " inputType: " + i6 + " authTicket: " + str13 + " useRawPwd: " + z3 + " isMobileAutoLogin: " + z2 + " stack: " + Util.getStack());
        if (z3 && Util.isNullOrNil(str2)) {
            Log.m105919d("MicroMsg.NetSceneManualAuth", "summerauth NetSceneManualAuth useRawPwd but [%s]", str9);
        }
        this.f343983h = str8;
        C116746l3 l3Var = new C116746l3(C101127f.f296015a ? 252 : 701);
        this.f343980e = l3Var;
        C118188q qVar2 = (C118188q) l3Var.getReqObj();
        int i7 = C7627m3.m7760a().getInt("key_auth_update_version", 0);
        Log.m105919d("MicroMsg.NetSceneManualAuth", "summerauth updateVersion:%d, clientVersion:%d", Integer.valueOf(i7), Integer.valueOf(C89625d.f257841g));
        if (i7 == 0) {
            qVar2.setSceneStatus(1);
            C117407d.INSTANCE.idkeyStat(148, 0, 1, false);
            qVar2.f353311c = true;
        } else if (i7 < C89625d.f257841g) {
            qVar2.setSceneStatus(16);
            C117407d.INSTANCE.idkeyStat(148, 1, 1, false);
        } else {
            qVar2.setSceneStatus(1);
        }
        qVar2.setUin(0);
        C64691ru2 ru23 = new C64691ru2();
        C118458pu2 pu22 = new C118458pu2();
        C64666qu2 qu22 = qVar2.f353310b;
        qu22.f185080d = ru23;
        qu22.f185081e = pu22;
        pu22.f354249D = new C49569gj3();
        String a = C114766b.f344135e.mo174416a();
        if (!TextUtils.isEmpty(a)) {
            C49569gj3 gj32 = pu22.f354249D;
            qVar = qVar2;
            C114766b bVar = C114766b.f344135e;
            bVar.mo174417b();
            gj32.f134078d = bVar.f344136a.f134078d;
            C49569gj3 gj33 = pu22.f354249D;
            C51018qv3 qv32 = new C51018qv3();
            ru22 = ru23;
            qv32.mo73350k(a.getBytes(StandardCharsets.ISO_8859_1));
            gj33.f134079e = qv32;
            Log.m105924i("MicroMsg.NetSceneManualAuth", "manual auth add public key , length " + a.length());
            i3 = 0;
        } else {
            ru22 = ru23;
            qVar = qVar2;
            C49569gj3 gj34 = pu22.f354249D;
            i3 = 0;
            gj34.f134078d = 0;
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(new byte[0]);
            gj34.f134079e = qv33;
            Log.m105920e("MicroMsg.NetSceneManualAuth", "get sign key failed");
        }
        pu22.f354269z = i6;
        C118420aa aaVar = new C118420aa();
        pu22.f354250d = aaVar;
        aaVar.f353911j = str13;
        aaVar.f353910i = i3;
        C51018qv3 qv34 = new C51018qv3();
        qv34.mo73350k(new byte[i3]);
        aaVar.f353909h = qv34;
        C51018qv3 qv35 = new C51018qv3();
        qv35.mo73350k(new byte[i3]);
        aaVar.f353908g = qv35;
        ay4 ay4 = new ay4();
        aaVar.f353906e = ay4;
        ay4.f297891e = "";
        ay4.f297890d = "";
        ay4.f297892f = "";
        i45 i45 = new i45();
        aaVar.f353907f = i45;
        i45.f332071e = "";
        i45.f332070d = "";
        if (i5 == 1) {
            ay4.f297891e = str10;
            ay4.f297890d = str11;
            ay4.f297892f = str12;
            i45.f332071e = "";
            i45.f332070d = "";
        } else if (i5 == 3) {
            ay4.f297891e = "";
            ay4.f297890d = "";
            ay4.f297892f = "";
            i45.f332071e = str10;
            i45.f332070d = str11;
        }
        byte[] bArr = null;
        if (!Util.isNullOrNil(str) || !C86709a0.m107522a()) {
            if (z3 || z2) {
                String str14 = str2;
                this.f343981f = str14;
                this.f343982g = str14;
            } else {
                this.f343981f = Util.getCutPasswordMD5(Util.nullAsNil(str2));
                this.f343982g = Util.getFullPasswordMD5(Util.nullAsNil(str2));
            }
            str7 = str;
        } else {
            C117407d.INSTANCE.idkeyStat(148, 2, 1, false);
            this.f343981f = (String) C86709a0.m107535s().mo121142i().mo119684e(3, (Object) null);
            this.f343982g = (String) C86709a0.m107535s().mo121142i().mo119684e(19, (Object) null);
            C118189r rVar = (C118189r) l3Var.getRespObj();
            str7 = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
            if (Util.isNullOrNil(str7)) {
                str7 = new C77710q(Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null), 0)).toString();
            } else {
                rVar.f353316b = str7;
            }
        }
        C64691ru2 ru24 = ru22;
        ru24.f185297f = str7;
        if (!(i5 == 1 || i5 == 3)) {
            if (i5 == 2) {
                bArr = C86709a0.m107523b().mo121113k().mo182473c(Util.getLong(str7, 0), str10);
            } else if (Util.isValidQQNum(str7)) {
                bArr = C86709a0.m107523b().mo121113k().mo182474d(Util.getLong(str7, 0), this.f343982g, true);
            }
        }
        Object[] objArr = new Object[2];
        if (bArr == null) {
            i4 = -1;
        } else {
            i4 = bArr.length;
        }
        objArr[0] = Integer.valueOf(i4);
        objArr[1] = Util.secPrint(Util.dumpHex(bArr));
        Log.m105925i("MicroMsg.NetSceneManualAuth", "summerauth loginbuf len:%d content:[%s]", objArr);
        C51018qv3 qv36 = new C51018qv3();
        qv36.mo73350k(Util.isNullOrNil(bArr) ? new byte[0] : bArr);
        aaVar.f353905d = qv36;
        ru24.f185298g = this.f343982g;
        ru24.f185299h = this.f343981f;
        C114766b.C114767a aVar = new C114766b.C114767a();
        aVar.f344141b = C114766b.f344135e.mo174416a();
        C114766b bVar2 = C114766b.f344135e;
        bVar2.mo174417b();
        aVar.f344140a = bVar2.f344137b;
        qVar.setCGiVerifyKey(aVar);
        C117407d dVar = C117407d.INSTANCE;
        dVar.idkeyStat(148, C101127f.f296015a ? 104 : 105, 1, false);
        dVar.idkeyStat(148, C101127f.f296016b ? 106 : 107, 1, false);
    }
}
