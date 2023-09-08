package tt1;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.soter.core.biometric.BiometricManagerCompat;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import lt3.C21460a;
import p156gj.C107835h0;
import p602ly.C109440d;
import p602ly.C76737c;
import p623nr.C76954e;
import p623nr.C76956i;
import pt3.C110247f;
import pv2.C110259i;
import pv2.C110260j;
import pv2.C35701m;
import pv2.C77290d;
import pv2.C77292s;
import rt3.C22252b;
import st1.C77754b0;
import st1.C77761h0;
import st1.C77784y;
import tt3.C22550a;
import tt3.C22551c;
import ut3.C22662b;
import vt1.C78473a;
import vt1.C78476d;
import xb3.C15635h;
import xt3.C53448e;
import zt3.C119157j;

/* renamed from: tt1.j */
public class C78102j extends C52363a {

    /* renamed from: d */
    public C76956i f228909d;

    /* renamed from: tt1.j$a */
    public class C78103a implements C35701m {
        public C78103a(C78102j jVar) {
        }

        /* renamed from: n */
        public void mo59577n(int i, String str) {
            if (i != 0 || !C22252b.m25806c()) {
                Log.m105925i("MicroMsg.SoterBiometricPayManager", "init failed: %s, %s", Integer.valueOf(i), str);
                return;
            }
            Log.m105925i("MicroMsg.SoterBiometricPayManager", "init success: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: tt1.j$b */
    public class C78104b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f228910d;

        public C78104b(C78102j jVar, boolean z) {
            this.f228910d = z;
        }

        public void run() {
            MultiProcessMMKV.getMMKV("mmkv.wallet").putBoolean("MMKV_KEY_HAS_FACE_ID", this.f228910d);
        }
    }

    /* renamed from: tt1.j$c */
    public class C78105c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f228911d;

        public C78105c(C78102j jVar, boolean z) {
            this.f228911d = z;
        }

        public void run() {
            MultiProcessMMKV.getMMKV("mmkv.wallet").putBoolean("MMKV_KEY_HAS_FINGER", this.f228911d);
        }
    }

    /* renamed from: tt1.j$d */
    public class C78106d implements C78088b {

        /* renamed from: a */
        public int f228912a;

        /* renamed from: b */
        public final /* synthetic */ C78090d f228913b;

        public C78106d(C78102j jVar, C78090d dVar) {
            this.f228913b = dVar;
        }

        /* renamed from: a */
        public void mo107892a(C78089c cVar) {
            Log.m105925i("MicroMsg.SoterBiometricPayManager", "authorize pay result: %s, %s", Integer.valueOf(cVar.f228884a), null);
            C78091e a = C78091e.m94238a(cVar);
            if (a.f228890a == 0) {
                a.f228891b++;
                this.f228913b.onSuccess(a);
                return;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i = currentTimeMillis - this.f228912a;
            if (i >= 1) {
                a.f228891b++;
                this.f228912a = currentTimeMillis;
            }
            Log.m105919d("MicroMsg.SoterBiometricPayManager", "retryCount: %s", Integer.valueOf(a.f228891b));
            int i2 = a.f228890a;
            if (!(i2 == 1) || i < 1) {
                if (!(i2 == 1)) {
                    Log.m105919d("MicroMsg.SoterBiometricPayManager", "do fail: %s", Integer.valueOf(a.f228891b));
                    this.f228913b.onFail(a);
                    return;
                }
                Log.m105924i("MicroMsg.SoterBiometricPayManager", "do fast, do nothing");
                return;
            }
            Log.m105919d("MicroMsg.SoterBiometricPayManager", "do retry: %s", Integer.valueOf(a.f228891b));
            this.f228913b.onRetry(a);
        }
    }

    /* renamed from: tt1.j$e */
    public class C78107e implements C76956i.C76958b {

        /* renamed from: a */
        public final /* synthetic */ C78088b f228914a;

        public C78107e(C78088b bVar) {
            this.f228914a = bVar;
        }

        /* renamed from: a */
        public void mo107280a(C22550a aVar) {
            Log.m105924i("MicroMsg.SoterBiometricPayManager", "authentication success");
            C78102j.this.getClass();
            C78088b bVar = this.f228914a;
            if (bVar != null) {
                bVar.mo107892a(C78089c.m94237b(aVar));
            }
        }

        /* renamed from: b */
        public void mo107281b() {
        }

        /* renamed from: c */
        public void mo107282c(int i, C22550a aVar) {
            C77290d.m93105c(3, aVar.f61886a, 1);
            Log.m105925i("MicroMsg.SoterBiometricPayManager", "authentication failed: %s", Integer.valueOf(i));
            if (i == 1) {
                C78088b bVar = this.f228914a;
                if (bVar != null) {
                    C78089c cVar = new C78089c();
                    cVar.f228884a = 2002;
                    bVar.mo107892a(cVar);
                    return;
                }
                return;
            }
            if (aVar.f61886a == 1021) {
                C78102j.this.f228909d.cancel();
            }
            C78088b bVar2 = this.f228914a;
            if (bVar2 != null) {
                bVar2.mo107892a(C78089c.m94237b(aVar));
            }
        }
    }

    /* renamed from: tt1.j$f */
    public class C78108f implements C76956i.C76958b {

        /* renamed from: a */
        public final /* synthetic */ C78088b f228916a;

        public C78108f(C78088b bVar) {
            this.f228916a = bVar;
        }

        /* renamed from: a */
        public void mo107280a(C22550a aVar) {
            Log.m105924i("MicroMsg.SoterBiometricPayManager", "authentication success");
            C78102j.this.getClass();
            C78088b bVar = this.f228916a;
            if (bVar != null) {
                bVar.mo107892a(C78089c.m94237b(aVar));
            }
        }

        /* renamed from: b */
        public void mo107281b() {
        }

        /* renamed from: c */
        public void mo107282c(int i, C22550a aVar) {
            C77290d.m93105c(3, aVar.f61886a, 1);
            Log.m105925i("MicroMsg.SoterBiometricPayManager", "authentication failed: %s", Integer.valueOf(i));
            if (i == 1) {
                C78088b bVar = this.f228916a;
                if (bVar != null) {
                    C78089c cVar = new C78089c();
                    cVar.f228884a = 2002;
                    bVar.mo107892a(cVar);
                    return;
                }
                return;
            }
            if (aVar.f61886a == 1022) {
                C78102j.this.f228909d.cancel();
            }
            C78088b bVar2 = this.f228916a;
            if (bVar2 != null) {
                bVar2.mo107892a(C78089c.m94237b(aVar));
            }
        }
    }

    /* renamed from: tt1.j$g */
    public class C78109g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f228918d;

        /* renamed from: e */
        public final /* synthetic */ int f228919e;

        /* renamed from: tt1.j$g$a */
        public class C78110a implements C76956i.C76959c {
            public C78110a() {
            }

            /* renamed from: a */
            public void mo107283a(int i) {
            }

            /* renamed from: b */
            public void mo107284b(C22551c cVar) {
                C78102j.this.getClass();
                C77290d.m93105c(2, cVar.f61886a, 1);
            }

            /* renamed from: c */
            public void mo107285c(C22551c cVar) {
                Log.m105925i("MicroMsg.SoterBiometricPayManager", "hy: gen auth key onResult: errCode: %d, errMsg: %s", Integer.valueOf(cVar.f61886a), cVar.f61887b);
                C78102j.this.getClass();
                C77761h0.IML.mo107896a();
            }
        }

        public C78109g(String str, int i) {
            this.f228918d = str;
            this.f228919e = i;
        }

        public void run() {
            C78102j.this.mo108070G3(new Object[0]);
            C78102j.this.mo108094a().mo107277b(new C78110a(), true, 1, (C53448e) ((C76954e) C86312j.m106911c(C76954e.class)).A30(this.f228918d, this.f228919e));
        }
    }

    public void Dq0(Context context, C78092f fVar, C78088b bVar) {
        Log.m105925i("MicroMsg.SoterBiometricPayManager", "request faceid authorize: %s, %s", Integer.valueOf(fVar.f228895b), fVar.f228894a);
        mo108094a().mo107276a(new C78108f(bVar), context, fVar.f228895b, 2, fVar.f228894a);
    }

    /* renamed from: G3 */
    public void mo108070G3(Object... objArr) {
        if (C21460a.m24275i(C77292s.m93114a())) {
            C21460a.m24284r(C77292s.m93114a(), false);
            Log.m105924i("MicroMsg.SoterBiometricPayManager", "change to new authkey name");
            C22662b.m26538b().mo35774a().put(1, C77292s.m93117d(1));
        }
    }

    /* renamed from: H0 */
    public boolean mo108071H0() {
        return C21460a.m24277k(MMApplicationContext.getContext(), 2);
    }

    /* renamed from: Hz */
    public void mo108072Hz(boolean z, boolean z2, boolean z3, Bundle bundle) {
        int i = 0;
        Log.m105925i("MicroMsg.SoterBiometricPayManager", "on post pay: %s, %s, %s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        if (z2 && !z && z3) {
            String string = bundle != null ? bundle.getString("pwd") : "";
            if (bundle != null) {
                i = bundle.getInt("key_open_biometric_type");
            }
            if (Util.isNullOrNil(string)) {
                Log.m105920e("MicroMsg.SoterBiometricPayManager", "no pwd. can not change auth key");
                return;
            }
            C15635h.f42265a.mo14380a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, "2", "update authkey after pay");
            ((C119157j) C119157j.f356862d).mo183878i(new C78109g(string, i), 500);
        }
    }

    /* renamed from: J4 */
    public boolean mo108073J4() {
        return C21460a.m24277k(MMApplicationContext.getContext(), 1);
    }

    /* renamed from: Qk */
    public boolean mo108074Qk() {
        Context context = MMApplicationContext.getContext();
        C110247f fVar = C21460a.f60757b;
        boolean hasEnrolledBiometric = BiometricManagerCompat.from(context, 1).hasEnrolledBiometric();
        ((C119157j) C119157j.f356862d).mo183875f(new C78105c(this, hasEnrolledBiometric));
        return hasEnrolledBiometric;
    }

    /* renamed from: RQ */
    public C78476d mo108075RQ() {
        return new C77754b0();
    }

    /* renamed from: Wy */
    public boolean mo108076Wy(Context context) {
        boolean z = (C107835h0.f322851h.f322843b & 1) > 0;
        boolean m = C21460a.m24279m(context, 1);
        Log.m105925i("MicroMsg.SoterBiometricPayManager", "is support fp: %s, %s", Boolean.valueOf(z), Boolean.valueOf(m));
        return z && m;
    }

    /* renamed from: a */
    public final C76956i mo108094a() {
        if (this.f228909d == null) {
            this.f228909d = ((C109440d) C86312j.m106911c(C109440d.class)).mo160182Uq();
        }
        return this.f228909d;
    }

    public void cancel() {
        C76956i iVar = this.f228909d;
        if (iVar != null) {
            iVar.cancel();
        }
    }

    public int fr0() {
        return 2;
    }

    /* renamed from: gv */
    public boolean mo108079gv() {
        return gw0();
    }

    public boolean gw0() {
        boolean z = C107835h0.f322849f.f322932a == 1;
        boolean z2 = C107835h0.f322851h.f322842a;
        boolean c = C22252b.m25806c();
        Log.m105925i("MicroMsg.SoterBiometricPayManager", "is support: %s, %s, %s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(c));
        return (z || z2) && c;
    }

    /* renamed from: n3 */
    public boolean mo108081n3() {
        Context context = MMApplicationContext.getContext();
        C110247f fVar = C21460a.f60757b;
        boolean hasEnrolledBiometric = BiometricManagerCompat.from(context, 2).hasEnrolledBiometric();
        ((C119157j) C119157j.f356862d).mo183875f(new C78104b(this, hasEnrolledBiometric));
        return hasEnrolledBiometric;
    }

    /* renamed from: n4 */
    public void mo108082n4(Context context, C78092f fVar, C78088b bVar) {
        C76956i.C76957a aVar;
        Log.m105925i("MicroMsg.SoterBiometricPayManager", "request fingerprint authorize: %s, %s", Integer.valueOf(fVar.f228895b), fVar.f228894a);
        if (!Util.isNullOrNil(fVar.f228897d)) {
            aVar = new C76956i.C76957a();
            aVar.f224885a = fVar.f228897d;
            aVar.f224886b = fVar.f228898e;
            aVar.f224887c = fVar.f228899f;
        } else {
            aVar = null;
        }
        Context context2 = context;
        mo108094a().mo107278c(new C78107e(bVar), context2, fVar.f228895b, 1, fVar.f228894a, aVar);
    }

    public void prepare() {
        Class cls = C78473a.class;
        Log.m105924i("MicroMsg.SoterBiometricPayManager", "prepare");
        if (((C78473a) C86709a0.m107533q(cls)).type() != 2) {
            Log.m105924i("MicroMsg.SoterBiometricPayManager", "set soter manager");
            C77784y yVar = new C77784y();
            yVar.f226572d = this;
            C86709a0.m107532n(cls, yVar);
        }
        if (C22662b.m26538b().mo35774a().get(1).equals("WechatAuthKeyPay&null")) {
            Log.m105924i("MicroMsg.SoterBiometricPayManager", "init error, reinit");
            C22662b.m26538b().mo35778f(false);
            C115669n.INSTANCE.mo175911u(1104, 46);
            ((C76737c) C86312j.m106911c(C76737c.class)).mo59454n6(true, true, new C78103a(this));
        }
    }

    /* renamed from: rn */
    public void mo108084rn(Context context, C78092f fVar, C78090d dVar) {
        Log.m105924i("MicroMsg.SoterBiometricPayManager", "request fingerprint authorize for pay");
        if (dVar != null) {
            mo108082n4(context, fVar, new C78106d(this, dVar));
        }
    }

    /* renamed from: t0 */
    public Map<String, String> mo108085t0() {
        HashMap hashMap = new HashMap();
        C110260j a = C110259i.m149874a();
        String str = a.f329808a;
        String str2 = a.f329809b;
        hashMap.put("cpu_id", str);
        hashMap.put("uid", str2);
        return hashMap;
    }

    /* renamed from: xx */
    public boolean mo108086xx() {
        boolean i = C21460a.m24275i(C77292s.m93114a());
        Log.m105925i("MicroMsg.SoterBiometricPayManager", "py: hasAuthKey: %b", Boolean.valueOf(i));
        return i;
    }

    /* renamed from: zy */
    public boolean mo108087zy(Context context) {
        boolean z = (C107835h0.f322851h.f322843b & 2) > 0;
        boolean m = C21460a.m24279m(context, 2);
        Log.m105925i("MicroMsg.SoterBiometricPayManager", "is support fp: %s, %s", Boolean.valueOf(z), Boolean.valueOf(m));
        return z && m;
    }
}
