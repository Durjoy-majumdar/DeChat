package yt3;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateRoutine;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.soter.core.biometric.BiometricManagerCompat;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.Signature;
import java.security.SignatureException;
import lt3.C21460a;
import lv2.C109427e;
import ot3.C117896h;
import ot3.C21881e;
import ot3.C21889m;
import p623nr.C76956i;
import pt3.C22005b;
import rt3.C22252b;
import st3.C110812b;
import st3.C22395a;
import tt3.C22550a;
import tt3.C22553e;
import ut3.C22660a;
import ut3.C22662b;
import xt3.C23112f;
import xt3.C23113g;
import xt3.C53447b;

/* renamed from: yt3.m */
public class C23339m extends C23317d implements C23315a {

    /* renamed from: c */
    public int f67077c = -1;

    /* renamed from: d */
    public String f67078d = null;

    /* renamed from: e */
    public String f67079e = null;

    /* renamed from: f */
    public int f67080f;

    /* renamed from: g */
    public WeakReference<Context> f67081g = null;

    /* renamed from: h */
    public C22395a f67082h = null;

    /* renamed from: i */
    public C110812b f67083i = null;

    /* renamed from: j */
    public String f67084j;

    /* renamed from: k */
    public String f67085k;

    /* renamed from: l */
    public String f67086l;

    /* renamed from: m */
    public String f67087m;

    /* renamed from: n */
    public boolean f67088n;

    /* renamed from: o */
    public C21889m f67089o = null;

    /* renamed from: p */
    public C23342c f67090p = null;

    /* renamed from: q */
    public boolean f67091q;

    /* renamed from: r */
    public boolean f67092r;

    /* renamed from: s */
    public boolean f67093s;

    /* renamed from: yt3.m$a */
    public class C23340a implements C53447b<Object> {
    }

    /* renamed from: yt3.m$b */
    public class C23341b implements C53447b<C23113g> {
        public C23341b() {
        }

        /* renamed from: a */
        public void mo36822a(Object obj) {
            C23113g gVar = (C23113g) obj;
            C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: upload or verify failed", new Object[0]);
            C23339m.this.mo36804b(new C22550a(TXLiveConstants.PUSH_EVT_ROOM_OUT));
        }
    }

    /* renamed from: yt3.m$c */
    public class C23342c extends BiometricManagerCompat.AuthenticationCallback {

        /* renamed from: a */
        public Signature f67095a;

        /* renamed from: b */
        public long f67096b;

        /* renamed from: yt3.m$c$a */
        public class C23343a implements Runnable {
            public C23343a(int i, CharSequence charSequence) {
            }

            public void run() {
                C110812b bVar = C23339m.this.f67083i;
                if (bVar != null) {
                    bVar.getClass();
                }
            }
        }

        /* renamed from: yt3.m$c$b */
        public class C23344b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ CharSequence f67099d;

            public C23344b(int i, CharSequence charSequence) {
                this.f67099d = charSequence;
            }

            public void run() {
                CharSequence charSequence;
                if (C23339m.this.f67083i != null && (charSequence = this.f67099d) != null) {
                    charSequence.toString();
                }
            }
        }

        /* renamed from: yt3.m$c$c */
        public class C23345c implements Runnable {
            public C23345c() {
            }

            public void run() {
                C110812b bVar = C23339m.this.f67083i;
                if (bVar != null) {
                    bVar.getClass();
                }
            }
        }

        /* renamed from: yt3.m$c$d */
        public class C23346d implements Runnable {
            public C23346d() {
            }

            public void run() {
                byte[] bArr;
                if (C117896h.m166297b(C23339m.this.f67079e)) {
                    C21881e.m25083b("Soter.TaskBiometricAuthentication", "soter: challenge is null. should not happen here", new Object[0]);
                    C23342c.this.onAuthenticationError(-1000, "challenge is null");
                } else if (C21460a.m24273g() == 1) {
                    C23342c cVar = C23342c.this;
                    C23339m mVar = C23339m.this;
                    long j = cVar.f67096b;
                    mVar.getClass();
                    try {
                        C22005b bVar = C21460a.f60758c;
                        if (bVar == null) {
                            C21881e.m25083b("Soter.SoterCore", "soter: finishSign IMPL is null, not support soter", new Object[0]);
                            bArr = new byte[0];
                        } else {
                            bArr = bVar.mo35100a(j);
                        }
                        mVar.f67089o = C21460a.m24267a(bArr);
                        mVar.getClass();
                        C21881e.m25084c("Soter.TaskBiometricAuthentication", "soter: no upload wrapper, return directly", new Object[0]);
                        mVar.mo36804b(new C22550a(0, mVar.f67089o));
                    } catch (Exception e) {
                        C21881e.m25083b("Soter.TaskBiometricAuthentication", "soter: finish sign failed due to exception: %s", e.getMessage());
                        C21881e.m25085d("Soter.TaskBiometricAuthentication", e, "soter: sign failed due to exception");
                        mVar.mo36804b(new C22550a(1018, "sign failed even after user authenticated the key."));
                    }
                } else {
                    try {
                        C23342c cVar2 = C23342c.this;
                        cVar2.f67095a.update(C23339m.this.f67079e.getBytes(Charset.forName("UTF-8")));
                    } catch (Exception e2) {
                        C21881e.m25083b("Soter.TaskBiometricAuthentication", "soter: exception in update", new Object[0]);
                        C21881e.m25085d("Soter.TaskBiometricAuthentication", e2, "soter: exception in update");
                        C21881e.m25083b("Soter.TaskBiometricAuthentication", "soter: remove the auth key: %s", C23339m.this.f67078d);
                        C21460a.m24284r(C23339m.this.f67078d, false);
                        C23339m.this.mo36804b(new C22550a((int) ExtStorageMigrateRoutine.NOTIFICATION_TASK_ID, "update signature failed. authkey removed after this failure, please check"));
                    }
                    try {
                        C23342c cVar3 = C23342c.this;
                        C23339m.m27841h(C23339m.this, cVar3.f67095a);
                    } catch (Exception e3) {
                        C21881e.m25083b("Soter.TaskBiometricAuthentication", "soter: exception in executeWhenAuthenticated method", new Object[0]);
                        C21881e.m25085d("Soter.TaskBiometricAuthentication", e3, "soter: exception when execute");
                        C23342c.this.onAuthenticationError(-1000, "execute failed");
                    }
                }
            }
        }

        /* renamed from: yt3.m$c$e */
        public class C23347e implements Runnable {
            public C23347e() {
            }

            public void run() {
                C76956i.C76958b bVar;
                C110812b bVar2 = C23339m.this.f67083i;
                if (bVar2 != null) {
                    C109427e.C109429b bVar3 = (C109427e.C109429b) bVar2;
                    bVar3.getClass();
                    Log.m105924i("MicroMsg.SoterManager", "request authorize failed");
                    if (bVar3.f327565b == 1 && (bVar = bVar3.f327564a) != null) {
                        bVar.mo107282c(1, new C22550a());
                    }
                }
            }
        }

        /* renamed from: yt3.m$c$f */
        public class C23348f implements Runnable {
            public C23348f() {
            }

            public void run() {
                C110812b bVar = C23339m.this.f67083i;
                if (bVar != null) {
                    bVar.getClass();
                }
            }
        }

        public C23342c(Signature signature, C23340a aVar) {
            this.f67095a = signature;
        }

        /* renamed from: a */
        public final void mo36836a() {
            C23339m mVar = C23339m.this;
            if (mVar.f67092r || mVar.f67080f == 2) {
                mVar.f67082h.mo35544a(false);
                C23339m.this.f67093s = true;
            }
        }

        public void onAuthenticationCancelled() {
            C21881e.m25084c("Soter.TaskBiometricAuthentication", "soter: called onAuthenticationCancelled", new Object[0]);
            if (C23339m.this.f67093s) {
                C21881e.m25086e("Soter.TaskBiometricAuthentication", "soter: during ignore cancel period", new Object[0]);
                return;
            }
            C23324g.m27822a().mo36818b(new C23348f());
            C23339m.this.mo36804b(new C22550a(1020, "user cancelled authentication"));
            mo36836a();
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            C21881e.m25083b("Soter.TaskBiometricAuthentication", "soter: on authentication fatal error: %d, %s", Integer.valueOf(i), charSequence);
            C23324g.m27822a().mo36818b(new C23343a(i, charSequence));
            String str = "unknown error";
            if (i == 10308) {
                C23339m mVar = C23339m.this;
                if (charSequence != null) {
                    str = charSequence.toString();
                }
                mVar.mo36804b(new C22550a((int) TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, str));
            } else if (i == 10309) {
                C23339m mVar2 = C23339m.this;
                if (charSequence != null) {
                    str = charSequence.toString();
                }
                mVar2.mo36804b(new C22550a((int) TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, str));
            } else if (i == 10310) {
                C23339m mVar3 = C23339m.this;
                if (charSequence != null) {
                    str = charSequence.toString();
                }
                mVar3.mo36804b(new C22550a(1029, str));
            } else {
                C23339m mVar4 = C23339m.this;
                if (charSequence != null) {
                    str = charSequence.toString();
                }
                mVar4.mo36804b(new C22550a(1017, str));
            }
            mo36836a();
        }

        public void onAuthenticationFailed() {
            C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: authentication failed once", new Object[0]);
            C23324g.m27822a().mo36818b(new C23347e());
            if (C23339m.this.f67091q) {
                C21881e.m25084c("Soter.TaskBiometricAuthentication", "soter: should compat lower android version logic.", new Object[0]);
                C23339m.this.f67082h.mo35544a(false);
                C23324g.m27822a().mo36819c(new C23351p(this));
                C23324g a = C23324g.m27822a();
                a.f67046b.postDelayed(new C23352q(this), 1000);
            }
            if (C23339m.this.f67080f == 2) {
                C21881e.m25084c("Soter.TaskBiometricAuthentication", "soter: should compat faceid logic.", new Object[0]);
                C23339m.this.mo36804b(new C22550a(1017, "faceid not match"));
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: on authentication help. you do not need to cancel the authentication: %d, %s", Integer.valueOf(i), charSequence);
            C23324g.m27822a().mo36818b(new C23344b(i, charSequence));
        }

        public void onAuthenticationSucceeded(BiometricManagerCompat.AuthenticationResult authenticationResult) {
            C21881e.m25084c("Soter.TaskBiometricAuthentication", "soter: authentication succeed. start sign and upload upload signature", new Object[0]);
            C23324g.m27822a().mo36818b(new C23345c());
            C23324g.m27822a().mo36819c(new C23346d());
            mo36836a();
        }
    }

    public C23339m(C112484b bVar) {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        this.f67091q = i < 23 && Build.MANUFACTURER.equalsIgnoreCase("vivo");
        this.f67092r = i >= 23 ? false : z;
        this.f67093s = false;
        if (bVar != null) {
            this.f67077c = bVar.f336849a;
            bVar.getClass();
            this.f67081g = new WeakReference<>(bVar.f336851c);
            this.f67083i = bVar.f336861m;
            this.f67082h = bVar.f336860l;
            this.f67080f = bVar.f336852d;
            this.f67079e = bVar.f336850b;
            this.f67084j = bVar.f336853e;
            this.f67085k = bVar.f336854f;
            this.f67086l = bVar.f336855g;
            this.f67087m = bVar.f336856h;
            this.f67088n = bVar.f336857i;
            return;
        }
        throw new IllegalArgumentException("param is null!");
    }

    /* renamed from: h */
    public static void m27841h(C23339m mVar, Signature signature) {
        mVar.getClass();
        try {
            mVar.f67089o = C21460a.m24267a(signature.sign());
            mVar.getClass();
            C21881e.m25084c("Soter.TaskBiometricAuthentication", "soter: no upload wrapper, return directly", new Object[0]);
            mVar.mo36804b(new C22550a(0, mVar.f67089o));
        } catch (SignatureException e) {
            C21881e.m25083b("Soter.TaskBiometricAuthentication", "soter: sign failed due to exception: %s", e.getMessage());
            C21881e.m25085d("Soter.TaskBiometricAuthentication", e, "soter: sign failed due to exception");
            mVar.mo36804b(new C22550a(1018, "sign failed even after user authenticated the key."));
        }
    }

    /* renamed from: a */
    public void mo36800a() {
        C21881e.m25084c("Soter.TaskBiometricAuthentication", "soter: called from cancellation signal", new Object[0]);
        C23342c cVar = this.f67090p;
        if (cVar != null) {
            cVar.onAuthenticationCancelled();
        }
    }

    /* renamed from: c */
    public void mo36805c() {
        SoterSessionResult soterSessionResult;
        if (!C117896h.m166297b(this.f67079e)) {
            C21881e.m25084c("Soter.TaskBiometricAuthentication", "soter: already provided the challenge. directly authenticate", new Object[0]);
            if (C21460a.m24273g() == 1) {
                String str = this.f67078d;
                String str2 = this.f67079e;
                C22005b bVar = C21460a.f60758c;
                if (bVar == null) {
                    C21881e.m25083b("Soter.SoterCore", "soter: initSigh IMPL is null, not support soter", new Object[0]);
                    soterSessionResult = null;
                } else {
                    soterSessionResult = bVar.mo35106i(str, str2);
                }
                if (soterSessionResult == null) {
                    C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: error occurred when init sign soterSessionResult is null", new Object[0]);
                    mo36804b(new C22550a(1007));
                } else if (soterSessionResult.f56992e != 0) {
                    C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: error occurred when init sign resultCode error", new Object[0]);
                    mo36804b(new C22550a(1007));
                } else {
                    C21881e.m25082a("Soter.TaskBiometricAuthentication", "soter: session is %d", Long.valueOf(soterSessionResult.f56991d));
                    C23342c cVar = new C23342c((Signature) null, (C23340a) null);
                    this.f67090p = cVar;
                    cVar.f67096b = soterSessionResult.f56991d;
                    mo36834i((Signature) null);
                    C23324g.m27822a().mo36818b(new C23349n(this));
                }
            } else {
                Signature d = C21460a.m24270d(this.f67078d);
                if (d == null) {
                    C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: error occurred when init sign", new Object[0]);
                    mo36804b(new C22550a(1007));
                    return;
                }
                this.f67090p = new C23342c(d, (C23340a) null);
                mo36834i(d);
                C23324g.m27822a().mo36818b(new C23350o(this));
            }
        } else {
            C21881e.m25084c("Soter.TaskBiometricAuthentication", "soter: not provide the challenge. we will do the job", new Object[0]);
            throw null;
        }
    }

    /* renamed from: d */
    public boolean mo36806d() {
        return true;
    }

    /* renamed from: e */
    public void mo36802e(C22553e eVar) {
        int i = eVar.f61886a;
        if ((i == 1018 || i == 1007 || i == 1015) && C22660a.m26537a(C23339m.class, eVar)) {
            C21881e.m25084c("Soter.TaskBiometricAuthentication", "soter: same error happen too much, delete ask", new Object[0]);
            C22252b.m25804a();
        }
    }

    /* renamed from: f */
    public void mo36807f() {
        C22395a aVar = this.f67082h;
        if (aVar != null) {
            aVar.mo35544a(true);
        }
    }

    /* renamed from: g */
    public boolean mo36808g() {
        if (!C22662b.m26538b().mo35776d()) {
            C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: not initialized yet", new Object[0]);
            mo36804b(new C22550a(1008));
            return true;
        } else if (!C22662b.m26538b().mo35777e()) {
            C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: not support soter", new Object[0]);
            mo36804b(new C22550a(2));
            return true;
        } else {
            String str = C22662b.m26538b().mo35774a().get(this.f67077c, "");
            this.f67078d = str;
            if (C117896h.m166297b(str)) {
                C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
                mo36804b(new C22550a(1009, String.format("auth scene %d not initialized in map", new Object[]{Integer.valueOf(this.f67077c)})));
                return true;
            } else if (!C21460a.m24275i(this.f67078d)) {
                C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: auth key %s not exists. need re-generate", this.f67078d);
                mo36804b(new C22550a(1006, String.format("the auth key to scene %d not exists. it may because you haven't prepare it, or user removed them already in system settings. please prepare the key again", new Object[]{Integer.valueOf(this.f67077c)})));
                return true;
            } else if (C117896h.m166297b(this.f67079e)) {
                C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: challenge wrapper is null!", new Object[0]);
                mo36804b(new C22550a(1010, "neither get challenge wrapper nor challenge str is found in request parameter"));
                return true;
            } else {
                Context context = this.f67081g.get();
                if (context == null) {
                    C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: context instance released in preExecute", new Object[0]);
                    mo36804b(new C22550a(1011));
                    return true;
                } else if (!BiometricManagerCompat.from(context, Integer.valueOf(this.f67080f)).hasEnrolledBiometric()) {
                    C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: user has not enrolled any biometric in system.", new Object[0]);
                    mo36804b(new C22550a(1013));
                    return true;
                } else if (C21460a.m24277k(context, this.f67080f)) {
                    C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: biometric sensor frozen", new Object[0]);
                    mo36804b(new C22550a(1021, "Too many failed times"));
                    return true;
                } else if (this.f67082h == null) {
                    C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: did not pass cancellation obj. We suggest you pass one", new Object[0]);
                    this.f67082h = new C22395a();
                    return false;
                } else {
                    C21881e.m25087f("Soter.TaskBiometricAuthentication", "hy: we strongly recommend you to check the final authentication data in server! Please make sure you upload and check later", new Object[0]);
                    return false;
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo36834i(Signature signature) {
        if (this.f67032b) {
            C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: already finished. can not authenticate", new Object[0]);
            return;
        }
        Context context = this.f67081g.get();
        if (context == null) {
            C21881e.m25087f("Soter.TaskBiometricAuthentication", "soter: context instance released in startAuthenticate", new Object[0]);
            mo36804b(new C22550a(1011));
            return;
        }
        try {
            C21881e.m25086e("Soter.TaskBiometricAuthentication", "soter: performing start", new Object[0]);
            Bundle bundle = new Bundle();
            bundle.putString("prompt_title", this.f67084j);
            bundle.putString("prompt_subtitle", this.f67085k);
            bundle.putString("prompt_description", this.f67086l);
            bundle.putString("prompt_button", this.f67087m);
            bundle.putBoolean("use_biometric_prompt", this.f67088n);
            BiometricManagerCompat from = BiometricManagerCompat.from(context, Integer.valueOf(this.f67080f));
            BiometricManagerCompat.CryptoObject cryptoObject = new BiometricManagerCompat.CryptoObject(signature);
            C22395a aVar = this.f67082h;
            from.authenticate(cryptoObject, 0, aVar != null ? aVar.f63495a : null, this.f67090p, (Handler) null, bundle);
        } catch (Exception e) {
            String message = e.getMessage();
            C21881e.m25083b("Soter.TaskBiometricAuthentication", "soter: caused exception when authenticating: %s", message);
            C21881e.m25085d("Soter.TaskBiometricAuthentication", e, "soter: caused exception when authenticating");
            mo36804b(new C22550a(1015, String.format("start authentication failed due to %s", new Object[]{message})));
        }
    }

    public boolean isCancelled() {
        return this.f67093s;
    }

    /* renamed from: j */
    public final void mo36835j() {
        C21889m mVar = this.f67089o;
        if (mVar == null) {
            mo36804b(new C22550a(1018, "sign failed even after user authenticated the key."));
        } else {
            new C23112f(mVar.f61900k, mVar.f61899j, mVar.f61898i);
            throw null;
        }
    }
}
