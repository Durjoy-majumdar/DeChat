package st1;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.GenFingerPrintRsaKeyEvent;
import com.tencent.p014mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.wallet_core.model.C7088m0;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import p156gj.C87203t;
import st1.C77759g0;
import ut1.C78280e;

/* renamed from: st1.o */
public class C77771o extends IStaticListener<GenFingerPrintRsaKeyEvent> implements C11385n {

    /* renamed from: d */
    public GenFingerPrintRsaKeyEvent f226611d;

    /* renamed from: e */
    public int f226612e = 0;

    /* renamed from: f */
    public String f226613f = "";

    /* renamed from: g */
    public boolean f226614g = false;

    /* renamed from: h */
    public MMHandler f226615h = new MMHandler(Looper.getMainLooper());

    /* renamed from: st1.o$b */
    public class C77772b implements C77759g0.C77760a {

        /* renamed from: st1.o$b$a */
        public class C77773a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f226617d;

            public C77773a(C77772b bVar, String str) {
                this.f226617d = str;
            }

            public void run() {
                if (TextUtils.isEmpty(this.f226617d)) {
                    Log.m105920e("MicroMsg.GenFingerPrintRsaKeyEventListener", "rsaKey is null");
                }
                C78280e eVar = new C78280e(this.f226617d);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(eVar);
            }
        }

        public C77772b(C36817a aVar) {
        }

        /* renamed from: a */
        public void mo107895a(String str) {
            C77771o.this.f226615h.post(new C77773a(this, str));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r7) {
        /*
            r6 = this;
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r7 = (com.tencent.p014mm.autogen.events.GenFingerPrintRsaKeyEvent) r7
            boolean r0 = f40.C86709a0.m107522a()
            java.lang.String r1 = "MicroMsg.GenFingerPrintRsaKeyEventListener"
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0013
            java.lang.String r7 = "GenFingerPrintRsaKeyEventListener account is not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
            goto L_0x00ca
        L_0x0013:
            java.lang.String r0 = "GenFingerPrintRsaKeyEventListener callback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r6.f226614g = r3
            boolean r0 = r7 instanceof com.tencent.p014mm.autogen.events.GenFingerPrintRsaKeyEvent
            if (r0 == 0) goto L_0x00ca
            boolean r0 = st1.C77770n.m93841c()
            r4 = 0
            if (r0 != 0) goto L_0x004d
            java.lang.String r7 = "device is not support FingerPrintAuth"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent$b r7 = new com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent$b
            r7.<init>()
            r7.f193635a = r3
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r0 = r6.f226611d
            r0.f193631e = r7
            r6.f226614g = r2
            java.lang.String r7 = "doCallback()"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r7 = r6.f226611d
            java.lang.Runnable r7 = r7.callback
            if (r7 == 0) goto L_0x0045
            r7.run()
        L_0x0045:
            boolean r7 = r6.f226614g
            if (r7 == 0) goto L_0x00cb
            r6.f226611d = r4
            goto L_0x00cb
        L_0x004d:
            r6.f226611d = r7
            f40.C86709a0.m107528h()
            f40.g r7 = f40.C86709a0.m107529k()
            ob0.b0 r7 = r7.f251779b
            r0 = 385(0x181, float:5.4E-43)
            r7.mo123455a(r0, r6)
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r7 = r6.f226611d
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent$a r7 = r7.f193630d
            boolean r0 = r7.f193632a
            int r5 = r7.f193633b
            r6.f226612e = r5
            java.lang.String r7 = r7.f193634c
            r6.f226613f = r7
            if (r0 != 0) goto L_0x00a4
            java.lang.String r7 = st1.C77770n.m93840b()
            java.lang.String r0 = p156gj.C87203t.m108273i()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = st1.C77770n.m93839a(r5)
            java.lang.String r7 = com.tencent.p014mm.plugin.fingerprint.FingerPrintAuth.getRsaKey(r5, r7, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "FingerPrintAuth.getRsaKey() success!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            ut1.e r0 = new ut1.e
            r0.<init>(r7)
            f40.C86709a0.m107528h()
            f40.g r7 = f40.C86709a0.m107529k()
            ob0.b0 r7 = r7.f251779b
            r7.mo123460f(r0)
            goto L_0x00aa
        L_0x009e:
            java.lang.String r7 = "FingerPrintAuth.getRsaKey() return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
            goto L_0x00a9
        L_0x00a4:
            java.lang.String r7 = "FingerPrintAuth should gen rsa key!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
        L_0x00a9:
            r3 = 1
        L_0x00aa:
            if (r3 == 0) goto L_0x00cb
            java.lang.String r7 = "FingerPrintAuth begin asyc gen rsa key!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            st1.g0 r7 = new st1.g0
            st1.o$b r0 = new st1.o$b
            r0.<init>(r4)
            r7.<init>(r0)
            st1.f0 r0 = new st1.f0
            r0.<init>(r7)
            java.lang.Class<st1.g0> r7 = st1.C77759g0.class
            java.lang.String r7 = r7.getName()
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r7)
            goto L_0x00cb
        L_0x00ca:
            r2 = 0
        L_0x00cb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: st1.C77771o.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        C117747y yVar2 = yVar;
        if (yVar2 instanceof C78280e) {
            GenFingerPrintRsaKeyEvent.C67705b bVar = new GenFingerPrintRsaKeyEvent.C67705b();
            bVar.f193635a = false;
            Log.m105924i("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene return errcode " + i3 + " errmsg" + str);
            if (i == 0 && i3 == 0) {
                Log.m105924i("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene is success");
                C78280e eVar = (C78280e) yVar2;
                String str2 = eVar.f229305d;
                String str3 = eVar.f229306e;
                String b = C77770n.m93840b();
                String i4 = C87203t.m108273i();
                String a = C7088m0.m7307a();
                if (!TextUtils.isEmpty(FingerPrintAuth.genOpenFPEncrypt(C77770n.m93839a(MMApplicationContext.getContext()), b, i4, String.valueOf(this.f226612e), a, "", str2, str3, C87203t.m108275k()))) {
                    Log.m105920e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.genOpenFPEncrypt success!");
                    bVar.f193635a = true;
                } else {
                    Log.m105920e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.genOpenFPEncrypt failed!");
                }
                String genPayFPEncrypt = FingerPrintAuth.genPayFPEncrypt(C77770n.m93839a(MMApplicationContext.getContext()), b, i4, String.valueOf(this.f226612e), a, this.f226613f, C87203t.m108275k());
                String genOpenFPSign = FingerPrintAuth.genOpenFPSign(C77770n.m93839a(MMApplicationContext.getContext()), C77770n.m93840b(), C87203t.m108273i(), genPayFPEncrypt);
                bVar.f193636b = genPayFPEncrypt;
                bVar.f193637c = genOpenFPSign;
            } else {
                Log.m105920e("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene is fail");
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(385, this);
            this.f226611d.f193631e = bVar;
            this.f226614g = true;
            Log.m105920e("MicroMsg.GenFingerPrintRsaKeyEventListener", "doCallback()");
            Runnable runnable = this.f226611d.callback;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f226614g) {
                this.f226611d = null;
            }
        }
    }
}
