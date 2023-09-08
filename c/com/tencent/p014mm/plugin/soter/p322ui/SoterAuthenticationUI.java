package com.tencent.p014mm.plugin.soter.p322ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.ResultReceiver;
import android.util.SparseArray;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.internal.ConstValue;
import hr0.C87584b;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import lt3.C21460a;
import nv2.C21695a;
import nv2.C21696b;
import nv2.C21708j;
import ot3.C117897l;
import p224ra.C89909e;
import pv2.C22023p;
import pv2.C22024q;
import qo3.C77398g;
import rt3.C110655a;
import tt3.C22552d;
import tt3.C22553e;
import tt3.C64998b;
import ut3.C22662b;
import vt3.C22793a;
import yt3.C112486e;
import yt3.C23319f;
import yt3.C23324g;

/* renamed from: com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI */
public class SoterAuthenticationUI extends AppCompatActivity {

    /* renamed from: q */
    public static C77398g f54325q;

    /* renamed from: r */
    public static C19273c f54326r;

    /* renamed from: d */
    public C21708j f54327d = null;

    /* renamed from: e */
    public ProgressDialog f54328e = null;

    /* renamed from: f */
    public int f54329f = -1;

    /* renamed from: g */
    public int f54330g = -1;

    /* renamed from: h */
    public boolean f54331h = false;

    /* renamed from: i */
    public C117897l f54332i = null;

    /* renamed from: j */
    public String f54333j = null;

    /* renamed from: n */
    public ResultReceiver f54334n;

    /* renamed from: o */
    public C21708j.C21709a f54335o = new C19272a();

    /* renamed from: p */
    public C64998b<C22552d> f54336p = new C19274b(this);

    /* renamed from: com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI$a */
    public class C19272a implements C21708j.C21709a {
        public C19272a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI$c */
    public static class C19273c extends Handler {

        /* renamed from: a */
        public WeakReference<SoterAuthenticationUI> f54338a = null;

        public C19273c(SoterAuthenticationUI soterAuthenticationUI, C19272a aVar) {
            this.f54338a = new WeakReference<>(soterAuthenticationUI);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            switch (i) {
                case 0:
                    Log.m105924i("MicroMsg.SoterAuthenticationUI", "hy: inform ok");
                    C22024q qVar = (C22024q) message.obj;
                    WeakReference<SoterAuthenticationUI> weakReference = this.f54338a;
                    if (weakReference == null || weakReference.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                        return;
                    }
                    SoterAuthenticationUI soterAuthenticationUI = this.f54338a.get();
                    C77398g gVar = SoterAuthenticationUI.f54325q;
                    Bundle I7 = soterAuthenticationUI.mo24818I7(qVar);
                    C117897l lVar = soterAuthenticationUI.f54332i;
                    if (lVar != null) {
                        I7.putString("authkey_result_json", lVar.f352428e);
                        I7.putString("authkey_result_json_signature", soterAuthenticationUI.f54332i.f352430g);
                    }
                    soterAuthenticationUI.f54334n.send(-1, I7);
                    soterAuthenticationUI.mo24816G7(qVar);
                    soterAuthenticationUI.finish();
                    return;
                case 1:
                    Log.m105924i("MicroMsg.SoterAuthenticationUI", "hy: inform cancel");
                    C22024q qVar2 = (C22024q) message.obj;
                    WeakReference<SoterAuthenticationUI> weakReference2 = this.f54338a;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                        return;
                    }
                    SoterAuthenticationUI soterAuthenticationUI2 = this.f54338a.get();
                    C77398g gVar2 = SoterAuthenticationUI.f54325q;
                    soterAuthenticationUI2.getClass();
                    qVar2.f62342a = 90008;
                    qVar2.f62343b = "user cancelled the authentication process";
                    soterAuthenticationUI2.f54334n.send(0, soterAuthenticationUI2.mo24818I7(qVar2));
                    soterAuthenticationUI2.mo24816G7(qVar2);
                    soterAuthenticationUI2.finish();
                    return;
                case 2:
                    Log.m105924i("MicroMsg.SoterAuthenticationUI", "hy: inform fail");
                    C22024q qVar3 = (C22024q) message.obj;
                    WeakReference<SoterAuthenticationUI> weakReference3 = this.f54338a;
                    if (weakReference3 == null || weakReference3.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                        return;
                    }
                    C77398g gVar3 = SoterAuthenticationUI.f54325q;
                    this.f54338a.get().mo24817H7(qVar3);
                    return;
                case 3:
                    Log.m105924i("MicroMsg.SoterAuthenticationUI", "hy: request permission");
                    WeakReference<SoterAuthenticationUI> weakReference4 = this.f54338a;
                    if (weakReference4 == null || weakReference4.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                        return;
                    }
                    String[] stringArray = message.getData().getStringArray("permissions");
                    int i2 = message.getData().getInt("request_code");
                    if (stringArray == null || stringArray.length <= 1) {
                        Log.m105920e("MicroMsg.SoterAuthenticationUI", "hy: permission null");
                        return;
                    }
                    SoterAuthenticationUI soterAuthenticationUI3 = this.f54338a.get();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i2));
                    aVar.mo10233c(stringArray);
                    SoterAuthenticationUI soterAuthenticationUI4 = soterAuthenticationUI3;
                    C117292a.m165358d(soterAuthenticationUI4, aVar.mo10232b(), "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUI$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                    soterAuthenticationUI3.requestPermissions((String[]) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(soterAuthenticationUI4, "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUI$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                    return;
                case 4:
                    Log.m105924i("MicroMsg.SoterAuthenticationUI", "hy: show progress");
                    WeakReference<SoterAuthenticationUI> weakReference5 = this.f54338a;
                    if (weakReference5 == null || weakReference5.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                        return;
                    }
                    SoterAuthenticationUI soterAuthenticationUI5 = this.f54338a.get();
                    ProgressDialog progressDialog = soterAuthenticationUI5.f54328e;
                    if (progressDialog == null || !progressDialog.isShowing()) {
                        soterAuthenticationUI5.f54328e = ProgressDialog.show(soterAuthenticationUI5, "", soterAuthenticationUI5.getString(C0966R.string.jks), true, false, (DialogInterface.OnCancelListener) null);
                        return;
                    }
                    return;
                case 5:
                    Log.m105924i("MicroMsg.SoterAuthenticationUI", "hy: dismiss progress");
                    WeakReference<SoterAuthenticationUI> weakReference6 = this.f54338a;
                    if (weakReference6 == null || weakReference6.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                        return;
                    }
                    SoterAuthenticationUI soterAuthenticationUI6 = this.f54338a.get();
                    ProgressDialog progressDialog2 = soterAuthenticationUI6.f54328e;
                    if (progressDialog2 != null && progressDialog2.isShowing()) {
                        soterAuthenticationUI6.f54328e.dismiss();
                        return;
                    }
                    return;
                case 6:
                    Log.m105924i("MicroMsg.SoterAuthenticationUI", "hy: show dialog");
                    WeakReference<SoterAuthenticationUI> weakReference7 = this.f54338a;
                    if (weakReference7 == null || weakReference7.get() == null) {
                        Log.m105928w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                        return;
                    } else {
                        SoterAuthenticationUI.f54325q = (C77398g) message.obj;
                        return;
                    }
                default:
                    Log.m105921e("MicroMsg.SoterAuthenticationUI", "hy: unidentified msg: %d", Integer.valueOf(i));
                    return;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI$b */
    public class C19274b implements C64998b<C22552d> {
        public C19274b(SoterAuthenticationUI soterAuthenticationUI) {
        }

        /* renamed from: a */
        public void mo24821a(C22553e eVar) {
            boolean a = ((C22552d) eVar).mo34909a();
            Log.m105924i("MicroMsg.SoterAuthenticationUI", "hy: init soter " + a);
        }
    }

    /* renamed from: G7 */
    public final void mo24816G7(C22024q qVar) {
        int i;
        if (qVar != null && this.f54329f == 1) {
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
            ((C87584b) C89909e.m112439d(C87584b.class, true)).mo121691h(13711, 0, this.f54333j, Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    /* renamed from: H7 */
    public final void mo24817H7(C22024q qVar) {
        this.f54334n.send(1, mo24818I7(qVar));
        mo24816G7(qVar);
        finish();
    }

    /* renamed from: I7 */
    public final Bundle mo24818I7(C22024q qVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("err_code", qVar.f62342a);
        bundle.putString("err_msg", qVar.f62343b);
        bundle.putByte("use_mode", qVar.f62344c);
        bundle.putString("result_json", qVar.f62345d);
        bundle.putString("result_json_signature", qVar.f62346e);
        Log.m105919d("MicroMsg.SoterAuthenticationUI", "hy: dump mp soter result: %s", bundle.toString());
        return bundle;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public Resources getResources() {
        return MMApplicationContext.getResources();
    }

    public void onCreate(Bundle bundle) {
        WeakReference<SoterAuthenticationUI> weakReference;
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        this.f54334n = (ResultReceiver) getIntent().getParcelableExtra("Soter_Result_Receiver");
        C19273c cVar = f54326r;
        if (!(cVar == null || (weakReference = cVar.f54338a) == null)) {
            weakReference.clear();
        }
        f54326r = new C19273c(this, (C19272a) null);
        C22023p pVar = new C22023p();
        C22024q qVar = new C22024q();
        String stringExtra = getIntent().getStringExtra("auth_mode");
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.SoterAuthenticationUI", "hy: error authen mode : null");
            qVar.f62342a = 90003;
            qVar.f62343b = "authen mode is null";
        } else {
            try {
                pVar.f62339a = Byte.parseByte(Util.nullAs(stringExtra.substring(2), "00"), 16);
                pVar.f62340b = getIntent().getStringExtra("challenge");
                pVar.f62341c = getIntent().getStringExtra("auth_content");
                if (!C21460a.m24278l()) {
                    Log.m105920e("MicroMsg.SoterAuthenticationUI", "hy: not support soter");
                    qVar.f62342a = 90001;
                    qVar.f62343b = "not support soter";
                } else if (pVar.f62339a <= 0) {
                    Log.m105920e("MicroMsg.SoterAuthenticationUI", "hy: param error: request mode illegal");
                    qVar.f62342a = 90003;
                    qVar.f62343b = "resp model error";
                } else if (Util.isNullOrNil(pVar.f62340b)) {
                    Log.m105920e("MicroMsg.SoterAuthenticationUI", "hy: param error: challenge null");
                    qVar.f62342a = 90004;
                    qVar.f62343b = "challenge is null";
                } else if (pVar.f62340b.length() >= 512) {
                    Log.m105920e("MicroMsg.SoterAuthenticationUI", "hy: param error: challenge too long");
                    qVar.f62342a = 90004;
                    qVar.f62343b = "challenge is too long. 512 chars at most";
                } else if (Util.isNullOrNil(pVar.f62341c)) {
                    pVar.f62341c = getString(C0966R.string.jkt);
                } else if (pVar.f62341c.length() > 42) {
                    Log.m105920e("MicroMsg.SoterAuthenticationUI", "hy: param error: content too long. use default");
                    pVar.f62341c = getString(C0966R.string.jkt);
                }
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                Log.m105921e("MicroMsg.SoterAuthenticationUI", "hy: error authen mode format: %s", stringExtra);
                qVar.f62342a = 90003;
                qVar.f62343b = "authen mode is illegal: number format error. found: " + stringExtra;
            }
        }
        if (qVar.f62342a != 0) {
            mo24817H7(qVar);
            return;
        }
        this.f54329f = getIntent().getIntExtra("key_soter_fp_luggage_fromscene", 1);
        this.f54330g = getIntent().getIntExtra("key_soter_fp_luggage_scene", 2048);
        C21708j a = C21695a.IML.mo33960a(this, pVar, qVar, f54326r);
        this.f54327d = a;
        if (a == null) {
            Log.m105920e("MicroMsg.SoterAuthenticationUI", "hy: no corresponding authen mode");
            qVar.f62342a = 90003;
            qVar.f62343b = "no corresponding mode";
            mo24817H7(qVar);
            return;
        }
        a.f61434f = null;
        a.f61433e = null;
        a.f61435g = this.f54330g;
        a.f61436h = this.f54335o;
        boolean d = C22662b.m26538b().mo35776d();
        Log.m105924i("MicroMsg.SoterAuthenticationUI", "hy: isInit:" + d);
        if (!d) {
            Log.m105924i("MicroMsg.SoterAuthenticationUI", "hy: init scene:" + this.f54327d.f61435g);
            C112486e eVar = new C112486e((C112486e.C112487a) null);
            eVar.f336863b = new int[]{this.f54327d.f61435g};
            C23324g.m27822a().mo36819c(new C110655a(getApplicationContext(), eVar, this.f54336p));
            this.f54331h = true;
        }
        this.f54333j = getIntent().getStringExtra("key_app_id");
        this.f54327d.mo33961c(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.f54328e;
        if (progressDialog != null && progressDialog.isShowing()) {
            Log.m105924i("MicroMsg.SoterAuthenticationUI", "onDestroy mProgressDialog dismiss!");
            this.f54328e.dismiss();
        }
        C77398g gVar = f54325q;
        if (gVar != null && gVar.isShowing()) {
            Log.m105924i("MicroMsg.SoterAuthenticationUI", "onDestroy mAuthenDialog dismiss!");
            f54325q.dismiss();
        }
        WeakReference<SoterAuthenticationUI> weakReference = f54326r.f54338a;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (this.f54331h) {
            C23319f.m27817c().mo36811b();
            C22662b b = C22662b.m26538b();
            b.getClass();
            synchronized (C22662b.class) {
                b.f65188a = false;
                b.f65189b = false;
                b.f65190c = new SparseArray<>(10);
                b.f65191d = null;
            }
        }
    }

    public void onPause() {
        C22793a aVar;
        super.onPause();
        C21708j jVar = this.f54327d;
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
        C21708j jVar = this.f54327d;
        if (jVar != null) {
            jVar.mo33963e(i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        C21708j jVar = this.f54327d;
        if (jVar != null) {
            C21696b bVar = (C21696b) jVar;
            if (bVar.f61407i) {
                bVar.mo33964i();
            }
        }
        overridePendingTransition(0, 0);
    }
}
