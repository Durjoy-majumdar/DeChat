package com.tencent.p014mm.plugin.soter.p322ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.internal.ConstValue;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import mv2.C47105g;
import mv2.C47106h;
import nj3.C88989a;
import nv2.C21695a;
import nv2.C21696b;
import nv2.C21708j;
import pv2.C12021r;
import pv2.C22023p;
import pv2.C22024q;
import pv2.C77292s;
import qo3.C77398g;
import qo3.C89782m0;
import tt3.C22552d;
import tt3.C64998b;
import vt3.C22793a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC */
public class SoterAuthenticationUIWC extends MMActivity {

    /* renamed from: h */
    public static C77398g f54339h;

    /* renamed from: i */
    public static C19276b f54340i;

    /* renamed from: d */
    public C21708j f54341d = null;

    /* renamed from: e */
    public ProgressDialog f54342e = null;

    /* renamed from: f */
    public int f54343f = -1;

    /* renamed from: g */
    public String f54344g = null;

    /* renamed from: com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC$a */
    public class C19275a implements C64998b<C22552d> {
    }

    /* renamed from: com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC$b */
    public static class C19276b extends Handler {

        /* renamed from: a */
        public WeakReference<SoterAuthenticationUIWC> f54345a = null;

        public C19276b(SoterAuthenticationUIWC soterAuthenticationUIWC, C19275a aVar) {
            this.f54345a = new WeakReference<>(soterAuthenticationUIWC);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            switch (i) {
                case 0:
                    Log.m105924i("MicroMsg.SoterAuthenticationUIWC", "hy: inform ok");
                    C22024q qVar = (C22024q) message.obj;
                    WeakReference<SoterAuthenticationUIWC> weakReference = this.f54345a;
                    if (weakReference == null || weakReference.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                        return;
                    }
                    SoterAuthenticationUIWC soterAuthenticationUIWC = this.f54345a.get();
                    C77398g gVar = SoterAuthenticationUIWC.f54339h;
                    soterAuthenticationUIWC.setResult(-1, soterAuthenticationUIWC.mo24823I7(qVar));
                    soterAuthenticationUIWC.mo24822H7(qVar);
                    soterAuthenticationUIWC.finish();
                    return;
                case 1:
                    Log.m105924i("MicroMsg.SoterAuthenticationUIWC", "hy: inform cancel");
                    C22024q qVar2 = (C22024q) message.obj;
                    WeakReference<SoterAuthenticationUIWC> weakReference2 = this.f54345a;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                        return;
                    }
                    SoterAuthenticationUIWC soterAuthenticationUIWC2 = this.f54345a.get();
                    C77398g gVar2 = SoterAuthenticationUIWC.f54339h;
                    soterAuthenticationUIWC2.getClass();
                    qVar2.f62342a = 90008;
                    qVar2.f62343b = "user cancelled the authentication process";
                    soterAuthenticationUIWC2.setResult(0, soterAuthenticationUIWC2.mo24823I7(qVar2));
                    soterAuthenticationUIWC2.mo24822H7(qVar2);
                    soterAuthenticationUIWC2.finish();
                    return;
                case 2:
                    Log.m105924i("MicroMsg.SoterAuthenticationUIWC", "hy: inform fail");
                    C22024q qVar3 = (C22024q) message.obj;
                    WeakReference<SoterAuthenticationUIWC> weakReference3 = this.f54345a;
                    if (weakReference3 == null || weakReference3.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                        return;
                    }
                    SoterAuthenticationUIWC soterAuthenticationUIWC3 = this.f54345a.get();
                    C77398g gVar3 = SoterAuthenticationUIWC.f54339h;
                    soterAuthenticationUIWC3.setResult(1, soterAuthenticationUIWC3.mo24823I7(qVar3));
                    soterAuthenticationUIWC3.mo24822H7(qVar3);
                    soterAuthenticationUIWC3.finish();
                    return;
                case 3:
                    Log.m105924i("MicroMsg.SoterAuthenticationUIWC", "hy: request permission");
                    WeakReference<SoterAuthenticationUIWC> weakReference4 = this.f54345a;
                    if (weakReference4 == null || weakReference4.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                        return;
                    }
                    String[] stringArray = message.getData().getStringArray("permissions");
                    int i2 = message.getData().getInt("request_code");
                    if (stringArray == null || stringArray.length <= 1) {
                        Log.m105920e("MicroMsg.SoterAuthenticationUIWC", "hy: permission null");
                        return;
                    }
                    SoterAuthenticationUIWC soterAuthenticationUIWC4 = this.f54345a.get();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i2));
                    aVar.mo10233c(stringArray);
                    SoterAuthenticationUIWC soterAuthenticationUIWC5 = soterAuthenticationUIWC4;
                    C117292a.m165358d(soterAuthenticationUIWC5, aVar.mo10232b(), "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUIWC$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                    soterAuthenticationUIWC4.requestPermissions((String[]) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(soterAuthenticationUIWC5, "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUIWC$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                    return;
                case 4:
                    Log.m105924i("MicroMsg.SoterAuthenticationUIWC", "hy: show progress");
                    WeakReference<SoterAuthenticationUIWC> weakReference5 = this.f54345a;
                    if (weakReference5 == null || weakReference5.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                        return;
                    }
                    SoterAuthenticationUIWC soterAuthenticationUIWC6 = this.f54345a.get();
                    ProgressDialog progressDialog = soterAuthenticationUIWC6.f54342e;
                    if (progressDialog == null || !progressDialog.isShowing()) {
                        C89782m0 a = C89782m0.m112251a(soterAuthenticationUIWC6, soterAuthenticationUIWC6.getString(C0966R.string.jks), false, (DialogInterface.OnCancelListener) null);
                        soterAuthenticationUIWC6.f54342e = a;
                        a.show();
                        return;
                    }
                    return;
                case 5:
                    Log.m105924i("MicroMsg.SoterAuthenticationUIWC", "hy: dismiss progress");
                    WeakReference<SoterAuthenticationUIWC> weakReference6 = this.f54345a;
                    if (weakReference6 == null || weakReference6.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                        return;
                    }
                    SoterAuthenticationUIWC soterAuthenticationUIWC7 = this.f54345a.get();
                    ProgressDialog progressDialog2 = soterAuthenticationUIWC7.f54342e;
                    if (progressDialog2 != null && progressDialog2.isShowing()) {
                        soterAuthenticationUIWC7.f54342e.dismiss();
                        return;
                    }
                    return;
                case 6:
                    Log.m105924i("MicroMsg.SoterAuthenticationUIWC", "hy: show dialog");
                    WeakReference<SoterAuthenticationUIWC> weakReference7 = this.f54345a;
                    if (weakReference7 == null || weakReference7.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                        return;
                    } else {
                        SoterAuthenticationUIWC.f54339h = (C77398g) message.obj;
                        return;
                    }
                default:
                    Log.m105921e("MicroMsg.SoterAuthenticationUIWC", "hy: unidentified msg: %d", Integer.valueOf(i));
                    return;
            }
        }
    }

    /* renamed from: H7 */
    public final void mo24822H7(C22024q qVar) {
        int i;
        if (qVar != null && this.f54343f == 0) {
            int i2 = qVar.f62342a;
            if (i2 != 0) {
                switch (i2) {
                    case 90001:
                    case ConstValue.APP_SET_LOCAL_STG_SUFFIX:
                    case 90003:
                    case 90004:
                        i = 2;
                        break;
                    default:
                        switch (i2) {
                            case 90006:
                            case 90007:
                            case 90011:
                                break;
                            case 90008:
                            case 90009:
                            case 90010:
                                i = 3;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        i = 2;
                        break;
                }
            } else {
                i = 0;
            }
            C12021r.INSTANCE.mo11883a("requireSoterBiometricAuthentication", this.f54344g, i, i2);
        }
    }

    /* renamed from: I7 */
    public final Intent mo24823I7(C22024q qVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("err_code", qVar.f62342a);
        bundle.putString("err_msg", qVar.f62343b);
        bundle.putByte("use_mode", qVar.f62344c);
        bundle.putString("result_json", qVar.f62345d);
        bundle.putString("result_json_signature", qVar.f62346e);
        Log.m105919d("MicroMsg.SoterAuthenticationUIWC", "hy: dump mp soter result: %s", bundle.toString());
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        WeakReference<SoterAuthenticationUIWC> weakReference;
        super.onCreate(bundle);
        if (26 != Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        getWindow().setStatusBarColor(0);
        C19276b bVar = f54340i;
        if (!(bVar == null || (weakReference = bVar.f54345a) == null)) {
            weakReference.clear();
        }
        f54340i = new C19276b(this, (C19275a) null);
        C22023p pVar = new C22023p();
        C22024q qVar = new C22024q();
        String stringExtra = getIntent().getStringExtra("auth_mode");
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.SoterAuthenticationUIWC", "hy: error authen mode : null");
            qVar.f62342a = 90003;
            qVar.f62343b = "authen mode is null";
        } else {
            try {
                pVar.f62339a = Byte.parseByte(Util.nullAs(stringExtra.substring(2), "00"), 16);
                pVar.f62340b = getIntent().getStringExtra("challenge");
                pVar.f62341c = getIntent().getStringExtra("auth_content");
                if (!C77292s.m93116c()) {
                    Log.m105920e("MicroMsg.SoterAuthenticationUIWC", "hy: not support soter");
                    qVar.f62342a = 90001;
                    qVar.f62343b = "not support soter";
                } else if (pVar.f62339a <= 0) {
                    Log.m105920e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: request mode illegal");
                    qVar.f62342a = 90003;
                    qVar.f62343b = "resp model error";
                } else if (Util.isNullOrNil(pVar.f62340b)) {
                    Log.m105920e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: challenge null");
                    qVar.f62342a = 90004;
                    qVar.f62343b = "challenge is null";
                } else if (pVar.f62340b.length() >= 512) {
                    Log.m105920e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: challenge too long");
                    qVar.f62342a = 90004;
                    qVar.f62343b = "challenge is too long. 512 chars at most";
                } else if (Util.isNullOrNil(pVar.f62341c)) {
                    pVar.f62341c = getString(C0966R.string.jkt);
                } else if (pVar.f62341c.length() > 42) {
                    Log.m105920e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: content too long. use default");
                    pVar.f62341c = getString(C0966R.string.jkt);
                }
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                Log.m105921e("MicroMsg.SoterAuthenticationUIWC", "hy: error authen mode format: %s", stringExtra);
                qVar.f62342a = 90003;
                qVar.f62343b = "authen mode is illegal: number format error. found: " + stringExtra;
            }
        }
        if (qVar.f62342a != 0) {
            setResult(1, mo24823I7(qVar));
            mo24822H7(qVar);
            finish();
            return;
        }
        this.f54343f = getIntent().getIntExtra("key_soter_fp_mp_scene", 0);
        C21708j a = C21695a.IML.mo33960a(this, pVar, qVar, f54340i);
        this.f54341d = a;
        if (a == null) {
            Log.m105920e("MicroMsg.SoterAuthenticationUIWC", "hy: no corresponding authen mode");
            qVar.f62342a = 90003;
            qVar.f62343b = "no corresponding mode";
            setResult(1, mo24823I7(qVar));
            mo24822H7(qVar);
            finish();
            return;
        }
        a.f61434f = new C47106h();
        this.f54341d.f61433e = new C47105g();
        this.f54341d.f61435g = 2;
        this.f54344g = getIntent().getStringExtra("key_app_id");
        this.f54341d.mo33961c(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.f54342e;
        if (progressDialog != null && progressDialog.isShowing()) {
            Log.m105924i("MicroMsg.SoterAuthenticationUIWC", "onDestroy mProgressDialog dismiss!");
            this.f54342e.dismiss();
        }
        C77398g gVar = f54339h;
        if (gVar != null && gVar.isShowing()) {
            Log.m105924i("MicroMsg.SoterAuthenticationUIWC", "onDestroy mAuthenDialog dismiss!");
            f54339h.dismiss();
        }
        WeakReference<SoterAuthenticationUIWC> weakReference = f54340i.f54345a;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public void onPause() {
        C22793a aVar;
        super.onPause();
        C21708j jVar = this.f54341d;
        if (jVar != null) {
            C21696b bVar = (C21696b) jVar;
            if (bVar.f61407i && (aVar = bVar.f61408j) != null) {
                aVar.mo35943a(true);
            }
            C77398g gVar = bVar.f61409k;
            if (gVar != null && gVar.isShowing()) {
                bVar.f61409k.dismiss();
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C21708j jVar = this.f54341d;
        if (jVar != null) {
            jVar.mo33963e(i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        C21708j jVar = this.f54341d;
        if (jVar != null) {
            C21696b bVar = (C21696b) jVar;
            if (bVar.f61407i) {
                bVar.mo33964i();
            }
        }
    }
}
