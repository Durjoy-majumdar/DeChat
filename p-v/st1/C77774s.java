package st1;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.wallet_core.model.C7088m0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import f40.C86709a0;
import ob0.C117747y;
import p156gj.C87203t;
import pv2.C77290d;
import st1.C77759g0;
import tt1.C78088b;
import tt1.C78089c;
import tt1.C78092f;
import tt1.C78101i;
import ut1.C52607f;
import ut1.C78280e;
import vt1.C78474b;
import vt1.C78476d;

/* renamed from: st1.s */
public class C77774s implements C78476d {

    /* renamed from: a */
    public C78474b f226618a = null;

    /* renamed from: b */
    public C78474b f226619b = null;

    /* renamed from: c */
    public WalletBaseUI f226620c = null;

    /* renamed from: d */
    public String f226621d = null;

    /* renamed from: e */
    public String f226622e = null;

    /* renamed from: f */
    public String f226623f = null;

    /* renamed from: g */
    public int f226624g;

    /* renamed from: h */
    public MMHandler f226625h = new MMHandler((MMHandler.Callback) new C77775a());

    /* renamed from: st1.s$a */
    public class C77775a implements MMHandler.Callback {

        /* renamed from: st1.s$a$a */
        public class C77776a implements Runnable {
            public C77776a() {
            }

            public void run() {
                C77774s sVar = C77774s.this;
                sVar.f226618a.mo94918n(-1, sVar.f226620c.getString(C0966R.string.eud));
            }
        }

        public C77775a() {
        }

        public boolean handleMessage(Message message) {
            if (1 != message.what) {
                return false;
            }
            String string = message.getData().getString("rsaKey");
            if (TextUtils.isEmpty(string)) {
                Log.m105920e("MicroMsg.HwFingerprintOpenDelegate", "handleMessage msg.what=" + message.what + " rsaKey is null");
                MMHandlerThread.postToMainThread(new C77776a());
            }
            C77774s.this.f226620c.doSceneProgress(new C78280e(string), false);
            return true;
        }
    }

    /* renamed from: st1.s$b */
    public class C77777b implements C78088b {

        /* renamed from: a */
        public final /* synthetic */ C78474b f226628a;

        public C77777b(C78474b bVar) {
            this.f226628a = bVar;
        }

        /* renamed from: a */
        public void mo107892a(C78089c cVar) {
            Log.m105925i("MicroMsg.HwFingerprintOpenDelegate", "result: %s", Integer.valueOf(cVar.f228884a));
            int i = cVar.f228884a;
            String str = "";
            if (i != 0) {
                if (i == 2005) {
                    str = MMApplicationContext.getContext().getString(C0966R.string.jlh);
                    C77290d.m93109g(1000, -1000223, cVar.f228884a, "fingerprint error");
                } else if (i == 2007 || i == 10308) {
                    Log.m105925i("MicroMsg.HwFingerprintOpenDelegate", "hy: on error: %s", Integer.valueOf(i));
                    str = MMApplicationContext.getContext().getString(C0966R.string.jle);
                    int i2 = cVar.f228884a;
                    if (i2 == 10308) {
                        String string = MMApplicationContext.getContext().getString(C0966R.string.jlg);
                        C77290d.m93109g(6, -1000223, -1, "too many trial");
                        this.f226628a.mo94918n(-3, string);
                        return;
                    }
                    C77290d.m93109g(1000, -1000223, i2, "fingerprint error");
                } else if (i == 2001) {
                    Log.m105924i("MicroMsg.HwFingerprintOpenDelegate", "identify timeout");
                } else if (i == 2002) {
                    Log.m105924i("MicroMsg.HwFingerprintOpenDelegate", "identify FingerPrintConst.RESULT_NO_MATCH");
                    this.f226628a.mo94918n(-1, str);
                    return;
                }
                this.f226628a.mo94918n(-2, str);
                return;
            }
            Log.m105924i("MicroMsg.HwFingerprintOpenDelegate", "identify success");
            C77774s.this.f226624g = cVar.f228885b;
            this.f226628a.mo94918n(0, str);
        }
    }

    /* renamed from: st1.s$c */
    public class C77778c implements C77759g0.C77760a {

        /* renamed from: st1.s$c$a */
        public class C77779a implements Runnable {
            public C77779a() {
            }

            public void run() {
                C77774s sVar = C77774s.this;
                sVar.f226618a.mo94918n(-1, sVar.f226620c.getString(C0966R.string.eud));
            }
        }

        /* renamed from: st1.s$c$b */
        public class C77780b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f226632d;

            public C77780b(String str) {
                this.f226632d = str;
            }

            public void run() {
                Log.m105924i("MicroMsg.HwFingerprintOpenDelegate", "GenRsaKeySync.callback running");
                Message obtainMessage = C77774s.this.f226625h.obtainMessage();
                obtainMessage.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString("rsaKey", this.f226632d);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public C77778c(C77775a aVar) {
        }

        /* renamed from: a */
        public void mo107895a(String str) {
            if (TextUtils.isEmpty(str)) {
                MMHandlerThread.postToMainThread(new C77779a());
                Log.m105920e("MicroMsg.HwFingerprintOpenDelegate", "GenRsaKeySync.callback rsaKey is empty!");
                return;
            }
            MMHandlerThread.postToMainThread(new C77780b(str));
        }
    }

    /* renamed from: a */
    public void mo107886a(Context context, C78474b bVar) {
        ((C78101i) C86709a0.m107533q(C78101i.class)).mo108082n4(context, new C78092f(""), new C77777b(bVar));
    }

    /* renamed from: b */
    public void mo107887b(Context context, C78474b bVar, String str) {
        this.f226620c = (WalletBaseUI) context;
        this.f226618a = bVar;
        this.f226623f = str;
        String rsaKey = FingerPrintAuth.getRsaKey(C77770n.m93839a(MMApplicationContext.getContext()), C77770n.m93840b(), C87203t.m108273i());
        C77290d.m93112j();
        if (TextUtils.isEmpty(rsaKey)) {
            Log.m105920e("MicroMsg.HwFingerprintOpenDelegate", "FingerPrintAuth.getRsaKey() is null");
            ThreadPool.post(new C77758f0(new C77759g0(new C77778c((C77775a) null))), C77759g0.class.getName());
            return;
        }
        Log.m105924i("MicroMsg.HwFingerprintOpenDelegate", "do NetSceneTenpayGetOpenTouchCert");
        this.f226620c.doSceneProgress(new C78280e(rsaKey), false);
    }

    /* renamed from: c */
    public void mo107888c(C78474b bVar, String str, int i) {
        String str2;
        this.f226619b = bVar;
        if (TextUtils.isEmpty(this.f226623f)) {
            Log.m105920e("MicroMsg.HwFingerprintOpenDelegate", "get user pwd error");
            bVar.mo94918n(-1, this.f226620c.getString(C0966R.string.eud));
            return;
        }
        String b = C77770n.m93840b();
        String i2 = C87203t.m108273i();
        String a = C7088m0.m7307a();
        String str3 = "";
        if (C77770n.m93841c()) {
            String genOpenFPEncrypt = FingerPrintAuth.genOpenFPEncrypt(C77770n.m93839a(MMApplicationContext.getContext()), b, i2, String.valueOf(this.f226624g), a, "", this.f226621d, this.f226622e, C87203t.m108275k());
            String str4 = genOpenFPEncrypt;
            str3 = FingerPrintAuth.genOpenFPSign(C77770n.m93839a(MMApplicationContext.getContext()), C77770n.m93840b(), C87203t.m108273i(), genOpenFPEncrypt);
            str2 = str4;
        } else {
            str2 = str3;
        }
        if (TextUtils.isEmpty(this.f226621d)) {
            Log.m105920e("MicroMsg.HwFingerprintOpenDelegate", "The value of encrypted_device_info which return by FingerPrintAuth.genOpenFPEncrypt is null");
        } else if (TextUtils.isEmpty(str3)) {
            Log.m105920e("MicroMsg.HwFingerprintOpenDelegate", "The value of encrypto_open_sign which return by FingerPrintAuth.genOpenFPSign is null");
        }
        this.f226620c.doSceneProgress(new C52607f(str2, str3, this.f226623f, i), false);
    }

    public void clear() {
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C78280e) {
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.HwFingerprintOpenDelegate", "get FingerPrint cert success");
                C78280e eVar = (C78280e) yVar;
                this.f226621d = eVar.f229305d;
                this.f226622e = eVar.f229306e;
                this.f226618a.mo94918n(0, "");
            } else {
                Log.m105924i("MicroMsg.HwFingerprintOpenDelegate", "get FingerPrint cert error");
                C78474b bVar = this.f226618a;
                if (Util.isNullOrNil(str)) {
                    str = this.f226620c.getString(C0966R.string.eud);
                }
                bVar.mo94918n(-1, str);
            }
            return true;
        } else if (!(yVar instanceof C52607f)) {
            return false;
        } else {
            if (i == 0 && i2 == 0) {
                C77290d.m93110h();
                C77290d.m93109g(0, 0, 0, "OK");
                this.f226619b.mo94918n(0, "");
            } else {
                this.f226619b.mo94918n(-2, "");
            }
            return true;
        }
    }
}
