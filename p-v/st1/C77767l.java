package st1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.OpenFingerPrintAuthEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.Map;
import k20.C9556a;
import tt1.C78088b;
import tt1.C78089c;
import tt1.C78092f;
import vt1.C78475c;

/* renamed from: st1.l */
public class C77767l extends C77752a {

    /* renamed from: e */
    public String f226604e;

    /* renamed from: f */
    public String f226605f;

    /* renamed from: st1.l$a */
    public class C77768a implements C78088b {

        /* renamed from: a */
        public final /* synthetic */ C78475c f226606a;

        public C77768a(C78475c cVar) {
            this.f226606a = cVar;
        }

        /* renamed from: a */
        public void mo107892a(C78089c cVar) {
            int i = cVar.f228884a;
            if (i == 0) {
                C77767l lVar = C77767l.this;
                lVar.f226604e = cVar.f228886c;
                lVar.f226605f = cVar.f228887d;
            }
            this.f226606a.mo23733a(i, cVar.f228885b, -1, -1);
        }
    }

    /* renamed from: BE */
    public boolean mo107904BE() {
        return true;
    }

    public boolean Fk0() {
        return false;
    }

    public void Il0(Context context) {
        if (context != null) {
            Intent intent = new Intent();
            intent.setAction("com.android.settings.fingerprint.FingerprintSettings");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setFlags(268435456);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/huawei/securitymgr/HwFingerprintAuth", "startRigesterFinger", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/huawei/securitymgr/HwFingerprintAuth", "startRigesterFinger", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: Vr */
    public boolean mo107907Vr() {
        return C77770n.m93841c();
    }

    /* renamed from: ZF */
    public void mo107908ZF(OpenFingerPrintAuthEvent openFingerPrintAuthEvent, int i) {
        if (!TextUtils.isEmpty(this.f226604e)) {
            Log.m105924i("MicroMsg.FingerPrintMgrImpl", "success gen encrypted_pay_info!");
        } else {
            Log.m105924i("MicroMsg.FingerPrintMgrImpl", "fail gen encrypted_pay_info!");
        }
        if (!TextUtils.isEmpty(this.f226605f)) {
            Log.m105924i("MicroMsg.FingerPrintMgrImpl", "success gen encrypted_pay_sign!");
        } else {
            Log.m105924i("MicroMsg.FingerPrintMgrImpl", "fail gen encrypted_pay_sign!");
        }
        Log.m105924i("MicroMsg.FingerPrintMgrImpl", "callback FingerPrintAuthEvent onSuccess()");
        if (!(openFingerPrintAuthEvent == null || openFingerPrintAuthEvent.f193784d.f193788c == null)) {
            OpenFingerPrintAuthEvent.C67749b bVar = new OpenFingerPrintAuthEvent.C67749b();
            bVar.f193795g = type();
            bVar.f193789a = 0;
            bVar.f193791c = this.f226604e;
            bVar.f193792d = this.f226605f;
            bVar.f193793e = i;
            openFingerPrintAuthEvent.f193785e = bVar;
            openFingerPrintAuthEvent.f193784d.f193788c.run();
        }
        this.f226604e = "";
        this.f226605f = "";
    }

    /* renamed from: dx */
    public void mo107909dx() {
        Log.m105924i("MicroMsg.FingerPrintMgrImpl", "initFP");
        this.f226572d.prepare();
    }

    /* renamed from: hq */
    public int mo107910hq(C78475c cVar, int i) {
        return 0;
    }

    public boolean isRoot() {
        return false;
    }

    public boolean iw0() {
        boolean Qk = this.f226572d.mo108074Qk();
        Log.m105925i("MicroMsg.FingerPrintMgrImpl", "isDeviceHasFingerPrint:%s", Boolean.valueOf(Qk));
        return Qk;
    }

    /* renamed from: l3 */
    public boolean mo107913l3() {
        return false;
    }

    /* renamed from: qV */
    public boolean mo107914qV() {
        return true;
    }

    /* renamed from: t0 */
    public Map<String, String> mo107915t0() {
        return null;
    }

    public int type() {
        return this.f226572d.fr0();
    }

    /* renamed from: uN */
    public int mo107917uN(C78475c cVar, int i, boolean z) {
        this.f226572d.mo108082n4(MMApplicationContext.getContext(), new C78092f(C77761h0.IML.f226591e), new C77768a(cVar));
        return 0;
    }

    public void userCancel() {
        this.f226572d.cancel();
    }

    public Map<String, String> vc0() {
        return null;
    }

    /* renamed from: vu */
    public boolean mo107920vu(boolean z, boolean z2, Bundle bundle) {
        return false;
    }

    /* renamed from: ys */
    public boolean mo107921ys() {
        return this.f226572d.mo108076Wy(MMApplicationContext.getContext());
    }
}
