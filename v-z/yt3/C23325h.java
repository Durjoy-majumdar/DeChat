package yt3;

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateRoutine;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.soter.core.biometric.BiometricManagerCompat;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.Signature;
import java.security.SignatureException;
import lt3.C21460a;
import mt3.C21527b;
import nv2.C21696b;
import nv2.C21703e;
import nv2.C21707i;
import ot3.C117896h;
import ot3.C21881e;
import ot3.C21889m;
import pt3.C22005b;
import rt3.C22252b;
import tt3.C22550a;
import tt3.C22553e;
import ut3.C22660a;
import ut3.C22662b;
import vt3.C111616b;
import vt3.C22793a;
import xt3.C23112f;
import xt3.C23113g;
import xt3.C53447b;

@Deprecated
/* renamed from: yt3.h */
public class C23325h extends C23317d implements C23315a {

    /* renamed from: c */
    public int f67048c = -1;

    /* renamed from: d */
    public String f67049d = null;

    /* renamed from: e */
    public String f67050e = null;

    /* renamed from: f */
    public WeakReference<Context> f67051f = null;

    /* renamed from: g */
    public C22793a f67052g = null;

    /* renamed from: h */
    public C111616b f67053h = null;

    /* renamed from: i */
    public C21889m f67054i = null;

    /* renamed from: j */
    public C23328c f67055j = null;

    /* renamed from: k */
    public boolean f67056k;

    /* renamed from: l */
    public boolean f67057l;

    /* renamed from: m */
    public boolean f67058m;

    /* renamed from: yt3.h$a */
    public class C23326a implements C53447b<Object> {
    }

    /* renamed from: yt3.h$b */
    public class C23327b implements C53447b<C23113g> {
        public C23327b() {
        }

        /* renamed from: a */
        public void mo36822a(Object obj) {
            C23113g gVar = (C23113g) obj;
            C21881e.m25087f("Soter.TaskAuthentication", "soter: upload or verify failed", new Object[0]);
            C23325h.this.mo36804b(new C22550a(TXLiveConstants.PUSH_EVT_ROOM_OUT));
        }
    }

    /* renamed from: yt3.h$c */
    public class C23328c extends C21527b.C21529b {

        /* renamed from: a */
        public Signature f67060a;

        /* renamed from: b */
        public long f67061b;

        /* renamed from: yt3.h$c$a */
        public class C23329a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f67063d;

            /* renamed from: e */
            public final /* synthetic */ CharSequence f67064e;

            public C23329a(int i, CharSequence charSequence) {
                this.f67063d = i;
                this.f67064e = charSequence;
            }

            public void run() {
                C111616b bVar = C23325h.this.f67053h;
                if (bVar != null) {
                    int i = this.f67063d;
                    CharSequence charSequence = this.f67064e;
                    ((C21696b.C21699c) bVar).getClass();
                    Log.m105921e("MicroMsg.SoterControllerFingerprint", "hy: on mp authen error errCode: %d, errMsg: %s", Integer.valueOf(i), charSequence);
                }
            }
        }

        /* renamed from: yt3.h$c$b */
        public class C23330b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f67066d;

            /* renamed from: e */
            public final /* synthetic */ CharSequence f67067e;

            public C23330b(int i, CharSequence charSequence) {
                this.f67066d = i;
                this.f67067e = charSequence;
            }

            public void run() {
                if (C23325h.this.f67053h != null) {
                    int i = this.f67066d;
                    CharSequence charSequence = this.f67067e;
                    Log.m105925i("MicroMsg.SoterControllerFingerprint", "hy: mp on authen help errCode: %d, errMsg:%s", Integer.valueOf(i), charSequence == null ? "unknown error" : charSequence.toString());
                }
            }
        }

        /* renamed from: yt3.h$c$c */
        public class C23331c implements Runnable {
            public C23331c() {
            }

            public void run() {
                byte[] bArr;
                if (C117896h.m166297b(C23325h.this.f67050e)) {
                    C21881e.m25083b("Soter.TaskAuthentication", "soter: challenge is null. should not happen here", new Object[0]);
                    C23328c.this.mo33740b(-1000, "challenge is null");
                } else if (C21460a.m24273g() == 1) {
                    C23328c cVar = C23328c.this;
                    C23325h hVar = C23325h.this;
                    long j = cVar.f67061b;
                    hVar.getClass();
                    try {
                        C22005b bVar = C21460a.f60758c;
                        if (bVar == null) {
                            C21881e.m25083b("Soter.SoterCore", "soter: finishSign IMPL is null, not support soter", new Object[0]);
                            bArr = new byte[0];
                        } else {
                            bArr = bVar.mo35100a(j);
                        }
                        hVar.f67054i = C21460a.m24267a(bArr);
                        hVar.getClass();
                        C21881e.m25084c("Soter.TaskAuthentication", "soter: no upload wrapper, return directly", new Object[0]);
                        hVar.mo36804b(new C22550a(0, hVar.f67054i));
                    } catch (Exception e) {
                        C21881e.m25083b("Soter.TaskAuthentication", "soter: finish sign failed due to exception: %s", e.getMessage());
                        C21881e.m25085d("Soter.TaskAuthentication", e, "soter: sign failed due to exception");
                        hVar.mo36804b(new C22550a(1018, "sign failed even after user authenticated the key."));
                    }
                } else {
                    try {
                        C23328c cVar2 = C23328c.this;
                        cVar2.f67060a.update(C23325h.this.f67050e.getBytes(Charset.forName("UTF-8")));
                    } catch (SignatureException e2) {
                        C21881e.m25083b("Soter.TaskAuthentication", "soter: exception in update", new Object[0]);
                        C21881e.m25085d("Soter.TaskAuthentication", e2, "soter: exception in update");
                        C21881e.m25083b("Soter.TaskAuthentication", "soter: remove the auth key: %s", C23325h.this.f67049d);
                        C21460a.m24284r(C23325h.this.f67049d, false);
                        C23325h.this.mo36804b(new C22550a((int) ExtStorageMigrateRoutine.NOTIFICATION_TASK_ID, "update signature failed. authkey removed after this failure, please check"));
                    }
                    try {
                        C23328c cVar3 = C23328c.this;
                        C23325h.m27825h(C23325h.this, cVar3.f67060a);
                    } catch (Exception e3) {
                        C21881e.m25083b("Soter.TaskAuthentication", "soter: exception in executeWhenAuthenticated method", new Object[0]);
                        C21881e.m25085d("Soter.TaskAuthentication", e3, "soter: exception when execute");
                        C23328c.this.mo33740b(-1000, "execute failed");
                    }
                }
            }
        }

        /* renamed from: yt3.h$c$d */
        public class C23332d implements Runnable {
            public C23332d() {
            }

            public void run() {
                C111616b bVar = C23325h.this.f67053h;
                if (bVar != null) {
                    C21696b.C21699c cVar = (C21696b.C21699c) bVar;
                    cVar.getClass();
                    Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy: mp on authen success");
                    C21696b bVar2 = C21696b.this;
                    bVar2.f61407i = false;
                    bVar2.f61408j = null;
                    bVar2.f61411m.removeCallbacks(bVar2.f61415q);
                    bVar2.f61410l.setImageResource(C0966R.C0969drawable.f357207c31);
                    TextView textView = bVar2.f61411m;
                    textView.setTextColor(textView.getResources().getColor(C0966R.color.afx));
                    TextView textView2 = bVar2.f61411m;
                    textView2.setText(textView2.getResources().getString(C0966R.string.jld));
                }
            }
        }

        /* renamed from: yt3.h$c$e */
        public class C23333e implements Runnable {
            public C23333e() {
            }

            public void run() {
                C111616b bVar = C23325h.this.f67053h;
                if (bVar != null) {
                    C21696b.C21699c cVar = (C21696b.C21699c) bVar;
                    cVar.getClass();
                    Log.m105928w("MicroMsg.SoterControllerFingerprint", "hy: mp user trying failed");
                    C21696b bVar2 = C21696b.this;
                    String string = MMApplicationContext.getContext().getString(C0966R.string.jl_);
                    if (bVar2.f61412n == null) {
                        bVar2.f61412n = C21696b.m24655h(bVar2.f61410l.getContext(), -1);
                    }
                    if (bVar2.f61413o == null) {
                        bVar2.f61413o = C21696b.m24655h(bVar2.f61410l.getContext(), -1);
                    }
                    bVar2.f61412n.setAnimationListener(new C21707i(bVar2, string));
                    bVar2.f61411m.startAnimation(bVar2.f61412n);
                    bVar2.f61410l.startAnimation(bVar2.f61413o);
                    C21696b.this.f61414p.postDelayed(new C21703e(cVar), 500);
                }
            }
        }

        /* renamed from: yt3.h$c$f */
        public class C23334f implements Runnable {
            public C23334f() {
            }

            public void run() {
                C111616b bVar = C23325h.this.f67053h;
                if (bVar != null) {
                    C21696b.C21699c cVar = (C21696b.C21699c) bVar;
                    cVar.getClass();
                    Log.m105926v("MicroMsg.SoterControllerFingerprint", "alvinluo mp onAuthenticationCancelled");
                    C21696b.this.f61408j = null;
                }
            }
        }

        public C23328c(Signature signature, C23326a aVar) {
            this.f67060a = signature;
        }

        /* renamed from: a */
        public void mo33739a() {
            C21881e.m25084c("Soter.TaskAuthentication", "soter: called onAuthenticationCancelled", new Object[0]);
            if (C23325h.this.f67058m) {
                C21881e.m25086e("Soter.TaskAuthentication", "soter: during ignore cancel period", new Object[0]);
                return;
            }
            C23324g.m27822a().mo36818b(new C23334f());
            C23325h.this.mo36804b(new C22550a(1020, "user cancelled authentication"));
            mo36823f();
        }

        /* renamed from: b */
        public void mo33740b(int i, CharSequence charSequence) {
            C21881e.m25083b("Soter.TaskAuthentication", "soter: on authentication fatal error: %d, %s", Integer.valueOf(i), charSequence);
            String str = "unknown error";
            if (i != 10308) {
                C23324g.m27822a().mo36818b(new C23329a(i, charSequence));
                C23325h hVar = C23325h.this;
                if (charSequence != null) {
                    str = charSequence.toString();
                }
                hVar.mo36804b(new C22550a(1016, str));
            } else {
                C23325h hVar2 = C23325h.this;
                if (charSequence != null) {
                    str = charSequence.toString();
                }
                hVar2.mo36804b(new C22550a(1021, str));
            }
            mo36823f();
        }

        /* renamed from: c */
        public void mo33741c() {
            C21881e.m25087f("Soter.TaskAuthentication", "soter: authentication failed once", new Object[0]);
            C23324g.m27822a().mo36818b(new C23333e());
            if (C23325h.this.f67056k) {
                C21881e.m25084c("Soter.TaskAuthentication", "soter: should compat lower android version logic.", new Object[0]);
                C23325h.this.f67052g.mo35943a(false);
                C23324g.m27822a().mo36819c(new C23337k(this));
                C23324g a = C23324g.m27822a();
                a.f67046b.postDelayed(new C23338l(this), 1000);
            }
        }

        /* renamed from: d */
        public void mo33742d(int i, CharSequence charSequence) {
            C21881e.m25087f("Soter.TaskAuthentication", "soter: on authentication help. you do not need to cancel the authentication: %d, %s", Integer.valueOf(i), charSequence);
            C23324g.m27822a().mo36818b(new C23330b(i, charSequence));
        }

        /* renamed from: e */
        public void mo33743e(C21527b.C21530c cVar) {
            C21881e.m25084c("Soter.TaskAuthentication", "soter: authentication succeed. start sign and upload upload signature", new Object[0]);
            C23324g.m27822a().mo36819c(new C23331c());
            C23324g.m27822a().mo36818b(new C23332d());
            mo36823f();
        }

        /* renamed from: f */
        public final void mo36823f() {
            C23325h hVar = C23325h.this;
            if (hVar.f67057l) {
                hVar.f67052g.mo35943a(false);
                C23325h.this.f67058m = true;
            }
        }
    }

    public C23325h(C112484b bVar) {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        this.f67056k = i < 23 && Build.MANUFACTURER.equalsIgnoreCase("vivo");
        this.f67057l = i >= 23 ? false : z;
        this.f67058m = false;
        if (bVar != null) {
            this.f67048c = bVar.f336849a;
            bVar.getClass();
            this.f67051f = new WeakReference<>(bVar.f336851c);
            this.f67053h = bVar.f336859k;
            this.f67052g = bVar.f336858j;
            this.f67050e = bVar.f336850b;
            return;
        }
        throw new IllegalArgumentException("param is null!");
    }

    /* renamed from: h */
    public static void m27825h(C23325h hVar, Signature signature) {
        hVar.getClass();
        try {
            hVar.f67054i = C21460a.m24267a(signature.sign());
            hVar.getClass();
            C21881e.m25084c("Soter.TaskAuthentication", "soter: no upload wrapper, return directly", new Object[0]);
            hVar.mo36804b(new C22550a(0, hVar.f67054i));
        } catch (SignatureException e) {
            C21881e.m25083b("Soter.TaskAuthentication", "soter: sign failed due to exception: %s", e.getMessage());
            C21881e.m25085d("Soter.TaskAuthentication", e, "soter: sign failed due to exception");
            hVar.mo36804b(new C22550a(1018, "sign failed even after user authenticated the key."));
        }
    }

    /* renamed from: a */
    public void mo36800a() {
        C21881e.m25084c("Soter.TaskAuthentication", "soter: called from cancellation signal", new Object[0]);
        C23328c cVar = this.f67055j;
        if (cVar != null) {
            cVar.mo33739a();
        }
    }

    /* renamed from: c */
    public void mo36805c() {
        SoterSessionResult soterSessionResult;
        if (!C117896h.m166297b(this.f67050e)) {
            C21881e.m25084c("Soter.TaskAuthentication", "soter: already provided the challenge. directly authenticate", new Object[0]);
            if (C21460a.m24273g() == 1) {
                String str = this.f67049d;
                String str2 = this.f67050e;
                C22005b bVar = C21460a.f60758c;
                if (bVar == null) {
                    C21881e.m25083b("Soter.SoterCore", "soter: initSigh IMPL is null, not support soter", new Object[0]);
                    soterSessionResult = null;
                } else {
                    soterSessionResult = bVar.mo35106i(str, str2);
                }
                if (soterSessionResult == null) {
                    C21881e.m25087f("Soter.TaskAuthentication", "soter: error occurred when init sign soterSessionResult is null", new Object[0]);
                    mo36804b(new C22550a(1007));
                } else if (soterSessionResult.f56992e != 0) {
                    C21881e.m25087f("Soter.TaskAuthentication", "soter: error occurred when init sign resultCode error", new Object[0]);
                    mo36804b(new C22550a(1007));
                } else {
                    C21881e.m25082a("Soter.TaskAuthentication", "soter: session is %d", Long.valueOf(soterSessionResult.f56991d));
                    C23328c cVar = new C23328c((Signature) null, (C23326a) null);
                    this.f67055j = cVar;
                    cVar.f67061b = soterSessionResult.f56991d;
                    mo36820i((Signature) null);
                    C23324g.m27822a().mo36818b(new C23335i(this));
                }
            } else {
                Signature d = C21460a.m24270d(this.f67049d);
                if (d == null) {
                    C21881e.m25087f("Soter.TaskAuthentication", "soter: error occurred when init sign", new Object[0]);
                    mo36804b(new C22550a(1007));
                    return;
                }
                this.f67055j = new C23328c(d, (C23326a) null);
                mo36820i(d);
                C23324g.m27822a().mo36818b(new C23336j(this));
            }
        } else {
            C21881e.m25084c("Soter.TaskAuthentication", "soter: not provide the challenge. we will do the job", new Object[0]);
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
        if ((i == 1018 || i == 1007 || i == 1015) && C22660a.m26537a(C23325h.class, eVar)) {
            C21881e.m25084c("Soter.TaskAuthentication", "soter: same error happen too much, delete ask", new Object[0]);
            C22252b.m25804a();
        }
    }

    /* renamed from: f */
    public void mo36807f() {
        C22793a aVar = this.f67052g;
        if (aVar != null) {
            aVar.mo35943a(true);
        }
    }

    /* renamed from: g */
    public boolean mo36808g() {
        if (!C22662b.m26538b().mo35776d()) {
            C21881e.m25087f("Soter.TaskAuthentication", "soter: not initialized yet", new Object[0]);
            mo36804b(new C22550a(1008));
            return true;
        } else if (!C22662b.m26538b().mo35777e()) {
            C21881e.m25087f("Soter.TaskAuthentication", "soter: not support soter", new Object[0]);
            mo36804b(new C22550a(2));
            return true;
        } else {
            String str = C22662b.m26538b().mo35774a().get(this.f67048c, "");
            this.f67049d = str;
            if (C117896h.m166297b(str)) {
                C21881e.m25087f("Soter.TaskAuthentication", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
                mo36804b(new C22550a(1009, String.format("auth scene %d not initialized in map", new Object[]{Integer.valueOf(this.f67048c)})));
                return true;
            } else if (!C21460a.m24275i(this.f67049d)) {
                C21881e.m25087f("Soter.TaskAuthentication", "soter: auth key %s not exists. need re-generate", this.f67049d);
                mo36804b(new C22550a(1006, String.format("the auth key to scene %d not exists. it may because you haven't prepare it, or user removed them already in system settings. please prepare the key again", new Object[]{Integer.valueOf(this.f67048c)})));
                return true;
            } else if (C117896h.m166297b(this.f67050e)) {
                C21881e.m25087f("Soter.TaskAuthentication", "soter: challenge wrapper is null!", new Object[0]);
                mo36804b(new C22550a(1010, "neither get challenge wrapper nor challenge str is found in request parameter"));
                return true;
            } else {
                Context context = this.f67051f.get();
                if (context == null) {
                    C21881e.m25087f("Soter.TaskAuthentication", "soter: context instance released in preExecute", new Object[0]);
                    mo36804b(new C22550a(1011));
                    return true;
                } else if (!C21527b.f60988b.mo33737b(context)) {
                    C21881e.m25087f("Soter.TaskAuthentication", "soter: user has not enrolled any fingerprint in system.", new Object[0]);
                    mo36804b(new C22550a(1012));
                    return true;
                } else {
                    if (!BiometricManagerCompat.from(context, 1).isCurrentFailTimeAvailable() && !BiometricManagerCompat.from(context, 1).isCurrentTweenTimeAvailable(context)) {
                        C21881e.m25087f("Soter.TaskAuthentication", "soter: fingerprint sensor frozen", new Object[0]);
                        mo36804b(new C22550a(1021, "Too many failed times"));
                        return true;
                    } else if (this.f67052g == null) {
                        C21881e.m25087f("Soter.TaskAuthentication", "soter: did not pass cancellation obj. We suggest you pass one", new Object[0]);
                        this.f67052g = new C22793a();
                        return false;
                    } else {
                        C21881e.m25087f("Soter.TaskAuthentication", "hy: we strongly recommend you to check the final authentication data in server! Please make sure you upload and check later", new Object[0]);
                        return false;
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo36820i(Signature signature) {
        if (this.f67032b) {
            C21881e.m25087f("Soter.TaskAuthentication", "soter: already finished. can not authenticate", new Object[0]);
            return;
        }
        Context context = this.f67051f.get();
        if (context == null) {
            C21881e.m25087f("Soter.TaskAuthentication", "soter: context instance released in startAuthenticate", new Object[0]);
            mo36804b(new C22550a(1011));
            return;
        }
        try {
            C21881e.m25086e("Soter.TaskAuthentication", "soter: performing start", new Object[0]);
            C21527b.C21531d dVar = new C21527b.C21531d(signature);
            C22793a aVar = this.f67052g;
            CancellationSignal cancellationSignal = aVar != null ? aVar.f65530a : null;
            C21527b.f60988b.mo33736a(context, dVar, 0, cancellationSignal, this.f67055j, (Handler) null);
        } catch (Exception e) {
            String message = e.getMessage();
            C21881e.m25083b("Soter.TaskAuthentication", "soter: caused exception when authenticating: %s", message);
            C21881e.m25085d("Soter.TaskAuthentication", e, "soter: caused exception when authenticating");
            mo36804b(new C22550a(1015, String.format("start authentication failed due to %s", new Object[]{message})));
        }
    }

    public boolean isCancelled() {
        return this.f67058m;
    }

    /* renamed from: j */
    public final void mo36821j() {
        C21889m mVar = this.f67054i;
        if (mVar == null) {
            mo36804b(new C22550a(1018, "sign failed even after user authenticated the key."));
        } else {
            new C23112f(mVar.f61900k, mVar.f61899j, mVar.f61898i);
            throw null;
        }
    }
}
