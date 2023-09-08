package av0;

import android.os.Looper;
import androidx.camera.core.FocusMeteringAction;
import av0.C16710c;
import bv0.C54591a;
import bv0.C54594b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import f40.C86718e;
import gv0.C20842c;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import te3.C49112d9;
import te3.C49249e9;
import te3.C51018qv3;
import te3.C64844xz;
import yu0.C102911g;
import yu0.C102913k;

/* renamed from: av0.d */
public class C54335d {

    /* renamed from: a */
    public LinkedList<C64844xz> f152468a;

    /* renamed from: b */
    public String f152469b;

    /* renamed from: c */
    public String f152470c = "";

    /* renamed from: d */
    public boolean f152471d = false;

    /* renamed from: e */
    public long f152472e = 0;

    /* renamed from: f */
    public C102911g f152473f;

    /* renamed from: g */
    public String f152474g = "";

    /* renamed from: h */
    public C54339d f152475h;

    /* renamed from: i */
    public MTimerHandler f152476i = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C54336a(), true);

    /* renamed from: j */
    public final C11385n f152477j = new C54337b();

    /* renamed from: k */
    public final C11385n f152478k = new C54338c();

    /* renamed from: av0.d$a */
    public class C54336a implements MTimerHandler.CallBack {
        public C54336a() {
        }

        public boolean onTimerExpired() {
            C54335d.this.mo75109a();
            return true;
        }
    }

    /* renamed from: av0.d$b */
    public class C54337b implements C11385n {
        public C54337b() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C51018qv3 qv32;
            C20842c.m22884u1(704, C54335d.this.f152477j);
            Log.m105925i("MicroMsg.CheckNetworkGenQrCodeHandler", "backup move receive createQrcode response.[%d,%d,%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
            byte[] bArr = null;
            if (i == 0 && i2 == 0) {
                C54594b bVar = (C54594b) yVar;
                C49249e9 e9Var = (C49249e9) bVar.f153089d.f127056b.f127083a;
                C16686a.m16193i().f303742b = "";
                C16686a.m16193i().f303743c = e9Var.f132798h;
                C16686a.m16193i().f303744d = e9Var.f132799i;
                C16686a.m16193i().f45099o = e9Var.f132802o;
                C49249e9 e9Var2 = (C49249e9) bVar.f153089d.f127056b.f127083a;
                if (!(e9Var2 == null || (qv32 = e9Var2.f132795e) == null)) {
                    bArr = qv32.f140574f.f257327a;
                }
                if (bArr != null) {
                    C54335d.this.f152473f.mo142628f(51);
                    ((C16710c.C16716e) C54335d.this.f152475h).mo17709a(51, bArr);
                }
            } else if (i2 == -100 || i2 == -2023) {
                C97625j3.m125815e().mo123455a(1000, C54335d.this.f152478k);
                C54335d dVar = C54335d.this;
                C97625j3.m125815e().mo123460f(new C54591a(dVar.f152468a, dVar.f152469b, C16686a.m16193i().f45099o));
            } else {
                C54335d.this.f152473f.mo142628f(-11);
                ((C16710c.C16716e) C54335d.this.f152475h).mo17709a(-11, (byte[]) null);
            }
        }
    }

    /* renamed from: av0.d$c */
    public class C54338c implements C11385n {
        public C54338c() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C51018qv3 qv32;
            C20842c.m22884u1(1000, C54335d.this.f152478k);
            Log.m105925i("MicroMsg.CheckNetworkGenQrCodeHandler", "backup move receive createOffilineQrcode response.[%d,%d,%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
            byte[] bArr = null;
            if (i == 0 && i2 == 0) {
                C49112d9 d9Var = ((C54591a.C54592b) ((C54591a) yVar).f153084e).f153086b.f128383a;
                Object[] objArr = new Object[1];
                objArr[0] = d9Var == null ? "null" : d9Var.f132191f;
                Log.m105925i("MicroMsg.BackupCreateQRCodeOfflineScene", "onGYNetEnd QRCodeUrl:%s", objArr);
                if (!(d9Var == null || (qv32 = d9Var.f132190e) == null)) {
                    bArr = qv32.f140574f.f257327a;
                }
                if (bArr != null) {
                    C54335d.this.f152473f.mo142628f(51);
                    ((C16710c.C16716e) C54335d.this.f152475h).mo17709a(51, bArr);
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.CheckNetworkGenQrCodeHandler", "create offline qrcode failed, errMsg:" + str);
            C54335d.this.f152473f.mo142628f(-11);
            ((C16710c.C16716e) C54335d.this.f152475h).mo17709a(-11, (byte[]) null);
        }
    }

    /* renamed from: av0.d$d */
    public interface C54339d {
    }

    public C54335d(C54339d dVar, C102911g gVar) {
        this.f152475h = dVar;
        this.f152473f = gVar;
    }

    /* renamed from: a */
    public final void mo75109a() {
        String A = C102913k.m136029A(MMApplicationContext.getContext());
        if (!A.equals(this.f152470c) || Util.milliSecondsToNow(this.f152472e) >= 30000) {
            Log.m105925i("MicroMsg.CheckNetworkGenQrCodeHandler", "checkNetStatus newWifiName:%s, preWifiName:%s", A, this.f152470c);
            if (C97625j3.m125811a()) {
                this.f152470c = A;
                if (!mo75110b((String) null)) {
                    Log.m105920e("MicroMsg.CheckNetworkGenQrCodeHandler", "checkNetStatus initNetSceneParameter failed");
                    this.f152471d = false;
                    return;
                }
                this.f152471d = false;
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("system_config_prefs");
                if ((!mmkv.decodeBool("has_uin_timely", false) ? C86718e.m107549h() : mmkv.decodeInt("default_uin_timely", 0)) != 0) {
                    Log.m105924i("MicroMsg.CheckNetworkGenQrCodeHandler", "checkNetStatus create QRCode online ");
                    C97625j3.m125815e().mo123455a(704, this.f152477j);
                    C97625j3.m125815e().mo123460f(new C54594b(this.f152468a, this.f152469b));
                } else {
                    Log.m105924i("MicroMsg.CheckNetworkGenQrCodeHandler", "checkNetStatus create QRCode offline");
                    C97625j3.m125815e().mo123455a(1000, this.f152478k);
                    C97625j3.m125815e().mo123460f(new C54591a(this.f152468a, this.f152469b, C16686a.m16193i().f45099o));
                }
                this.f152472e = Util.nowMilliSecond();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo75110b(java.lang.String r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r0.f152468a = r2
            com.tencent.mm.pointers.PString r2 = new com.tencent.mm.pointers.PString
            r2.<init>()
            com.tencent.mm.pointers.PInt r3 = new com.tencent.mm.pointers.PInt
            r3.<init>()
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = yu0.C102913k.m136029A(r4)
            r0.f152469b = r4
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r4
            r4 = 1
            r6[r4] = r1
            java.lang.String r8 = "MicroMsg.CheckNetworkGenQrCodeHandler"
            java.lang.String r9 = "wifiName :%s, pIP:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r6)
            java.lang.String r6 = r0.f152469b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r9 = 0
            java.lang.String r10 = ""
            r11 = -4
            if (r6 == 0) goto L_0x004b
            yu0.g r1 = r0.f152473f
            r1.mo142628f(r11)
            av0.d$d r1 = r0.f152475h
            av0.c$e r1 = (av0.C16710c.C16716e) r1
            r1.mo17709a(r11, r9)
            r0.f152470c = r10
            return r7
        L_0x004b:
            av0.a r6 = av0.C16686a.m16193i()
            zu0.c r6 = r6.mo17660h()
            java.util.concurrent.atomic.AtomicInteger r12 = r6.f67576a
            int r12 = r12.get()
            java.lang.String r13 = "MicroMsg.BackupCEngine"
            r14 = 3
            if (r12 == 0) goto L_0x0069
            java.lang.String r12 = r6.f67579d
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0069
            java.lang.String r6 = r6.f67579d
            goto L_0x0099
        L_0x0069:
            java.lang.Object[] r12 = com.tencent.p014mm.lan_cs.Server.Java2C.start()
            com.tencent.p014mm.lan_cs.Server.Java2C.stop()
            if (r12 == 0) goto L_0x0098
            r15 = r12[r7]
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r4 == r15) goto L_0x007d
            goto L_0x0098
        L_0x007d:
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r16 = r12[r7]
            r15[r7] = r16
            r16 = r12[r4]
            r15[r4] = r16
            r16 = r12[r5]
            r15[r5] = r16
            java.lang.String r9 = "getIp, result[%d, %s, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r9, r15)
            r9 = r12[r4]
            java.lang.String r9 = (java.lang.String) r9
            r6.f67579d = r9
            r6 = r9
            goto L_0x0099
        L_0x0098:
            r6 = r10
        L_0x0099:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r23)
            if (r9 != 0) goto L_0x00a1
            r2.value = r1
        L_0x00a1:
            av0.a r9 = av0.C16686a.m16193i()
            zu0.c r9 = r9.mo17660h()
            java.util.concurrent.atomic.AtomicInteger r12 = r9.f67576a
            int r12 = r12.get()
            r15 = 5
            if (r12 == 0) goto L_0x00d2
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.util.concurrent.atomic.AtomicInteger r11 = r9.f67576a
            int r11 = r11.get()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r7] = r11
            java.lang.String r11 = "server already start,  mode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r11, r12)
            java.lang.String r11 = r9.f67580e
            r2.value = r11
            int r9 = r9.f67581f
            r3.value = r9
        L_0x00ce:
            r14 = r8
        L_0x00cf:
            r7 = 1
            goto L_0x0187
        L_0x00d2:
            java.util.concurrent.atomic.AtomicInteger r11 = r9.f67576a
            r11.set(r7)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r12 = r2.value
            r11[r7] = r12
            java.lang.String r12 = "listen, before server.stop pIP:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r12, r11)
            com.tencent.p014mm.lan_cs.Server.Java2C.stop()
            zu0.c$d r11 = new zu0.c$d
            r11.<init>()
            java.lang.String r12 = "listen, before server.start listener"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)
            java.lang.String r12 = r2.value
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x0144
            com.tencent.p014mm.lan_cs.Server.f157041a = r11
            java.lang.Object[] r11 = com.tencent.p014mm.lan_cs.Server.Java2C.start()
            if (r11 == 0) goto L_0x013d
            int r12 = r11.length
            if (r12 == r14) goto L_0x0103
            goto L_0x013d
        L_0x0103:
            java.lang.Object[] r12 = new java.lang.Object[r14]
            r17 = r11[r7]
            r12[r7] = r17
            r17 = r11[r4]
            r12[r4] = r17
            r17 = r11[r5]
            r12[r5] = r17
            java.lang.String r14 = "listen, result[%d, %s, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r12)
            r12 = r11[r7]
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 == r4) goto L_0x0121
            goto L_0x0142
        L_0x0121:
            r12 = r11[r4]
            java.lang.String r12 = (java.lang.String) r12
            r2.value = r12
            r11 = r11[r5]
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3.value = r11
            java.lang.String r12 = r2.value
            r9.f67580e = r12
            r9.f67581f = r11
            java.util.concurrent.atomic.AtomicInteger r9 = r9.f67576a
            r9.set(r4)
            goto L_0x00ce
        L_0x013d:
            java.lang.String r9 = "listen error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r9)
        L_0x0142:
            r14 = r8
            goto L_0x0187
        L_0x0144:
            double r18 = java.lang.Math.random()
            r20 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r14 = r8
            double r7 = r18 * r20
            int r7 = (int) r7
            r8 = 0
        L_0x0152:
            if (r8 >= r15) goto L_0x0186
            int r12 = r7 + 9014
            int r12 = r12 + r8
            r3.value = r12
            com.tencent.p014mm.lan_cs.Server.f157041a = r11
            java.lang.String r15 = "0.0.0.0"
            boolean r12 = com.tencent.p014mm.lan_cs.Server.Java2C.startWithIP(r15, r12)
            if (r12 == 0) goto L_0x0182
            java.lang.String r7 = r2.value
            r9.f67580e = r7
            int r8 = r3.value
            r9.f67581f = r8
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r12 = 0
            r11[r12] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r11[r4] = r7
            java.lang.String r7 = "listen, [%s, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r7, r11)
            java.util.concurrent.atomic.AtomicInteger r7 = r9.f67576a
            r7.set(r4)
            goto L_0x00cf
        L_0x0182:
            int r8 = r8 + 1
            r15 = 5
            goto L_0x0152
        L_0x0186:
            r7 = 0
        L_0x0187:
            if (r7 != 0) goto L_0x019b
            yu0.g r1 = r0.f152473f
            r2 = -4
            r1.mo142628f(r2)
            av0.d$d r1 = r0.f152475h
            av0.c$e r1 = (av0.C16710c.C16716e) r1
            r3 = 0
            r1.mo17709a(r2, r3)
            r0.f152470c = r10
            r7 = 0
            return r7
        L_0x019b:
            r7 = 0
            te3.xz r8 = new te3.xz
            r8.<init>()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r9 != 0) goto L_0x01aa
            r8.f186422d = r6
            goto L_0x01ae
        L_0x01aa:
            java.lang.String r9 = r2.value
            r8.f186422d = r9
        L_0x01ae:
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r7] = r1
            java.lang.String r1 = r2.value
            r9[r4] = r1
            int r1 = r3.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r5] = r1
            r1 = 3
            r9[r1] = r6
            r1 = 4
            java.lang.String r5 = r8.f186422d
            r9[r1] = r5
            java.lang.String r1 = "server listen ip:%s, pIP:%s, port:%d, hostIp:%s, addr.IP:%s"
            r5 = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r9)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r8.f186423e = r1
            int r6 = r3.value
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.add(r6)
            java.util.LinkedList<te3.xz> r1 = r0.f152468a
            r1.add(r8)
            java.lang.String r1 = r0.f152474g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x022b
            te3.xz r1 = new te3.xz
            r1.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r0.f152474g
            r6.append(r7)
            java.lang.String r7 = "$"
            r6.append(r7)
            java.lang.String r2 = r2.value
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r1.f186422d = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r1.f186423e = r2
            int r3 = r3.value
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = r1.f186422d
            r6 = 0
            r2[r6] = r3
            java.lang.String r3 = "addr1 ip:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            java.util.LinkedList<te3.xz> r2 = r0.f152468a
            r2.add(r1)
        L_0x022b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: av0.C54335d.mo75110b(java.lang.String):boolean");
    }

    /* renamed from: c */
    public void mo75111c(String str, String str2) {
        Log.m105925i("MicroMsg.CheckNetworkGenQrCodeHandler", "start check network and gen qrcode handler starting:%b stop:%b, ip:%s", Boolean.valueOf(this.f152471d), Boolean.valueOf(this.f152476i.stopped()), str);
        this.f152474g = str2;
        if (!this.f152471d) {
            this.f152471d = true;
            this.f152472e = Util.nowMilliSecond();
            if (mo75110b(str)) {
                this.f152470c = null;
                mo75109a();
            } else {
                this.f152473f.mo142628f(-4);
                ((C16710c.C16716e) this.f152475h).mo17709a(-4, (byte[]) null);
            }
            this.f152476i.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }

    /* renamed from: d */
    public void mo75112d() {
        Log.m105924i("MicroMsg.CheckNetworkGenQrCodeHandler", "stop check network and gen qrcode handler.");
        this.f152471d = false;
        C97625j3.m125815e().mo123470p(704, this.f152477j);
        C97625j3.m125815e().mo123470p(1000, this.f152478k);
        this.f152476i.stopTimer();
    }
}
