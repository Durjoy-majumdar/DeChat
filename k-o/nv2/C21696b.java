package nv2;

import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.soter.p322ui.SoterAuthenticationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.internal.ConstValue;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import lt3.C21460a;
import nv2.C21708j;
import ot3.C117897l;
import pv2.C22023p;
import pv2.C22024q;
import pv2.C89440o;
import qo3.C77389a;
import qo3.C77398g;
import rt3.C22252b;
import tt3.C22550a;
import tt3.C22551c;
import tt3.C22553e;
import tt3.C64998b;
import vt3.C111616b;
import vt3.C22793a;
import yt3.C112484b;

/* renamed from: nv2.b */
public class C21696b extends C21708j {

    /* renamed from: i */
    public boolean f61407i = false;

    /* renamed from: j */
    public C22793a f61408j = null;

    /* renamed from: k */
    public C77398g f61409k = null;

    /* renamed from: l */
    public ImageView f61410l = null;

    /* renamed from: m */
    public TextView f61411m = null;

    /* renamed from: n */
    public Animation f61412n = null;

    /* renamed from: o */
    public Animation f61413o = null;

    /* renamed from: p */
    public Handler f61414p = new Handler(Looper.getMainLooper());

    /* renamed from: q */
    public Runnable f61415q = new C21700d();

    /* renamed from: nv2.b$a */
    public class C21697a implements C64998b<C22551c> {
        public C21697a() {
        }

        /* renamed from: a */
        public void mo24821a(C22553e eVar) {
            C22551c cVar = (C22551c) eVar;
            Log.m105925i("MicroMsg.SoterControllerFingerprint", "hy: update mp auth key result: errcode: %d, errmsg: %s", Integer.valueOf(cVar.f61886a), cVar.f61887b);
            C21696b.this.mo33976a();
            if (cVar.mo34909a()) {
                C21696b.m24654g(C21696b.this, false);
                C21708j.C21709a aVar = C21696b.this.f61436h;
                if (aVar != null) {
                    SoterAuthenticationUI.this.f54332i = (C117897l) cVar.f64864c;
                }
            } else {
                C89440o.m111814a(2, cVar.f61886a, 1);
            }
            int i = cVar.f61886a;
            if (i == 1006) {
                Log.m105920e("MicroMsg.SoterControllerFingerprint", "hy: model is null");
                C21696b bVar = C21696b.this;
                C22024q qVar = bVar.f61430b;
                qVar.f62342a = 90007;
                qVar.f62343b = "auth key can not be retrieved";
                bVar.mo33977b();
            } else if (i == 6) {
                Log.m105926v("MicroMsg.SoterControllerFingerprint", "alvinluo: gen auth key failed, remove auth key");
                C22252b.m25809f(C21696b.this.f61435g);
                C21696b bVar2 = C21696b.this;
                C22024q qVar2 = bVar2.f61430b;
                qVar2.f62342a = 90007;
                qVar2.f62343b = "auth key generate failed";
                bVar2.mo33977b();
            } else if (i == 1004) {
                Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy: update auth key failed. remove auth key");
                C22252b.m25809f(C21696b.this.f61435g);
                C21696b bVar3 = C21696b.this;
                C22024q qVar3 = bVar3.f61430b;
                qVar3.f62342a = 90007;
                qVar3.f62343b = "auth key update error";
                bVar3.mo33977b();
            }
        }
    }

    /* renamed from: nv2.b$b */
    public class C21698b implements C64998b<C22550a> {
        public C21698b() {
        }

        /* renamed from: a */
        public void mo24821a(C22553e eVar) {
            C22550a aVar = (C22550a) eVar;
            Log.m105925i("MicroMsg.SoterControllerFingerprint", "alvinluo request authentication result errCode: %d, errMsg: %s", Integer.valueOf(aVar.f61886a), aVar.f61887b);
            C21696b.this.f61407i = false;
            if (aVar.mo34909a()) {
                C21696b.this.f61414p.postDelayed(new C21702d(this, aVar), 500);
                return;
            }
            C89440o.m111814a(3, aVar.f61886a, 1);
            int i = aVar.f61886a;
            if (i == 1007 || i == 1015) {
                Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy: start authen error, maybe key invalid. remove former key and give suggestion");
                C22252b.m25809f(C21696b.this.f61435g);
                C22024q qVar = C21696b.this.f61430b;
                qVar.f62342a = 90007;
                qVar.f62343b = "start fingerprint authen failed";
            } else if (i == 1021) {
                C22024q qVar2 = C21696b.this.f61430b;
                qVar2.f62342a = 90010;
                qVar2.f62343b = "authenticate freeze. please try again later";
            } else {
                C22024q qVar3 = C21696b.this.f61430b;
                qVar3.f62342a = 90007;
                qVar3.f62343b = "authenticate error: " + aVar.f61887b;
            }
            C21696b.this.mo33977b();
        }
    }

    /* renamed from: nv2.b$c */
    public class C21699c implements C111616b {
        public C21699c() {
        }
    }

    /* renamed from: nv2.b$d */
    public class C21700d implements Runnable {
        public C21700d() {
        }

        public void run() {
            TextView textView = C21696b.this.f61411m;
            textView.setTextColor(textView.getResources().getColor(C0966R.color.f3561xr));
            TextView textView2 = C21696b.this.f61411m;
            textView2.setText(textView2.getResources().getString(C0966R.string.jlc));
            C21696b.this.f61410l.setImageResource(C0966R.C0969drawable.c2z);
        }
    }

    public C21696b(WeakReference<Activity> weakReference, C22023p pVar, C22024q qVar, Handler handler) {
        super(weakReference, pVar, qVar, handler);
    }

    /* renamed from: g */
    public static void m24654g(C21696b bVar, boolean z) {
        C77398g gVar = bVar.f61409k;
        boolean z2 = false;
        if (gVar == null || !gVar.isShowing()) {
            WeakReference<Activity> weakReference = bVar.f61431c;
            if (weakReference == null || weakReference.get() == null) {
                Log.m105920e("MicroMsg.SoterControllerFingerprint", "hy: ui released.");
                C22024q qVar = bVar.f61430b;
                qVar.f62342a = 90007;
                qVar.f62343b = "internal error occurred: ui released";
                bVar.mo33977b();
            } else {
                if (bVar.f61409k == null) {
                    Activity activity = bVar.f61431c.get();
                    C77389a aVar = new C77389a();
                    View inflate = activity.getLayoutInflater().inflate(C0966R.C0971layout.arj, (ViewGroup) null, false);
                    bVar.f61410l = (ImageView) inflate.findViewById(C0966R.C0970id.e9g);
                    bVar.f61411m = (TextView) inflate.findViewById(C0966R.C0970id.e9l);
                    ((TextView) inflate.findViewById(C0966R.C0970id.e9f)).setText(bVar.f61429a.f62341c);
                    aVar.f225627J = inflate;
                    aVar.f225668y = true;
                    aVar.f225664u = C0086a.m38a(activity).getString(C0966R.string.jkr);
                    aVar.f225621D = new C21705g(bVar);
                    aVar.f225622E = new C21706h(bVar);
                    C77398g gVar2 = new C77398g(activity, C0966R.style.a66);
                    gVar2.mo107525e(aVar);
                    bVar.f61409k = gVar2;
                    gVar2.setOnShowListener(new C21704f(bVar));
                    C77398g gVar3 = bVar.f61409k;
                    if (gVar3 == null) {
                        Log.m105920e("MicroMsg.SoterMpBaseController", "hy: dialog is null.");
                    } else if (bVar.f61432d != null) {
                        bVar.mo33976a();
                        bVar.f61432d.obtainMessage(6, gVar3).sendToTarget();
                    } else {
                        Log.m105920e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
                    }
                    bVar.f61409k.setCanceledOnTouchOutside(false);
                }
                if (!bVar.f61409k.isShowing() && bVar.f61431c.get() != null && !bVar.f61431c.get().isFinishing() && !bVar.f61431c.get().isDestroyed()) {
                    bVar.f61409k.show();
                }
            }
        }
        if (z) {
            if (Build.VERSION.SDK_INT < 23) {
                z2 = true;
            }
            if (!z2) {
                Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy: req restart after fail, but no need");
                return;
            }
        }
        if (bVar.f61408j != null) {
            Log.m105920e("MicroMsg.SoterControllerFingerprint", "alvinluo mFingerprintCanceller not null, cancel and start auth by delaying 500ms.");
            bVar.f61408j.mo35943a(true);
            bVar.f61414p.postDelayed(new C21701c(bVar), 500);
            return;
        }
        bVar.mo33965j();
    }

    /* renamed from: h */
    public static Animation m24655h(Context context, long j) {
        if (context == null) {
            Log.m105920e("MicroMsg.SoterControllerFingerprint", "hy: context is null.");
            return null;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2332x);
        if (j > 0) {
            loadAnimation.setDuration(j);
        }
        loadAnimation.setInterpolator(new DecelerateInterpolator());
        return loadAnimation;
    }

    /* renamed from: c */
    public void mo33961c(Bundle bundle) {
        if (!C21460a.m24281o(MMApplicationContext.getContext())) {
            C22024q qVar = this.f61430b;
            qVar.f62342a = 90011;
            qVar.f62343b = "no fingerprint enrolled";
            mo33977b();
        }
        try {
            if (MMApplicationContext.getContext().checkSelfPermission("android.permission.USE_FINGERPRINT") != 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(new String[]{"android.permission.USE_FINGERPRINT"});
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreate", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                mo33978f((String[]) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(this, "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreate", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                return;
            }
            this.f61407i = true;
        } catch (NoSuchMethodError unused) {
            Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy: not implements the checkSelfPermission. permission already given");
            this.f61407i = true;
        }
    }

    /* renamed from: d */
    public void mo33962d(Bundle bundle) {
        if (!C21460a.m24281o(MMApplicationContext.getContext())) {
            C22024q qVar = this.f61430b;
            qVar.f62342a = 90011;
            qVar.f62343b = "no fingerprint enrolled, inform fail and return";
            mo33977b();
            return;
        }
        try {
            if (MMApplicationContext.getContext().checkSelfPermission("android.permission.USE_FINGERPRINT") != 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(new String[]{"android.permission.USE_FINGERPRINT"});
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreateAndAutoStartVerify", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                mo33978f((String[]) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(this, "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreateAndAutoStartVerify", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
            } else {
                this.f61407i = true;
            }
        } catch (NoSuchMethodError unused) {
            Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy: not implements the checkSelfPermission. permission already given");
            this.f61407i = true;
        }
        if (this.f61407i) {
            Log.m105924i("MicroMsg.SoterControllerFingerprint", "mIsRequestingFingerprintAuthen true, start prepareAuthKey");
            mo33964i();
        }
    }

    /* renamed from: e */
    public void mo33963e(int i, String[] strArr, int[] iArr) {
        if (i != 0) {
            return;
        }
        if (strArr.length < 1 || iArr.length < 1 || !"android.permission.USE_FINGERPRINT".equals(strArr[0]) || iArr[0] != 0) {
            Log.m105928w("MicroMsg.SoterControllerFingerprint", "hy: permission not granted");
            C22024q qVar = this.f61430b;
            qVar.f62342a = ConstValue.APP_SET_LOCAL_STG_SUFFIX;
            qVar.f62343b = "user not grant to use fingerprint";
            mo33977b();
            return;
        }
        Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy: permission granted");
        mo33964i();
        this.f61407i = true;
    }

    /* renamed from: i */
    public final boolean mo33964i() {
        Handler handler = this.f61432d;
        if (handler != null) {
            handler.obtainMessage(4).sendToTarget();
        } else {
            Log.m105920e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        }
        Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy: auth key not valid or auth key not valid");
        C21697a aVar = new C21697a();
        Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy:mscene:" + this.f61435g);
        C22252b.m25808e(aVar, false, true, this.f61435g, this.f61433e, this.f61434f);
        return false;
    }

    /* renamed from: j */
    public final void mo33965j() {
        this.f61408j = new C22793a();
        C21698b bVar = new C21698b();
        C21699c cVar = new C21699c();
        C112484b bVar2 = new C112484b((C112484b.C112485a) null);
        bVar2.f336849a = this.f61435g;
        bVar2.f336851c = MMApplicationContext.getContext();
        bVar2.f336858j = this.f61408j;
        bVar2.f336850b = this.f61429a.f62340b;
        bVar2.f336859k = cVar;
        C22252b.m25810g(bVar, bVar2);
    }
}
