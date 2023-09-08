package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.ui.MMWizardActivity */
public abstract class MMWizardActivity extends MMActivity {

    /* renamed from: d */
    public static final Map<String, Intent> f24166d = new HashMap();

    /* renamed from: com.tencent.mm.ui.MMWizardActivity$a */
    public class C6746a implements Runnable {
        public C6746a() {
        }

        public void run() {
            MMWizardActivity.this.finish();
        }
    }

    /* renamed from: L7 */
    public static void m7017L7(Context context, Intent intent) {
        Log.m105924i("MicroMsg.MMWizardActivity", "startWizardActivity()");
        String stringExtra = intent.getStringExtra("WizardRootClass");
        String stringExtra2 = intent.getStringExtra("WizardTransactionId");
        boolean z = context instanceof Activity;
        Intent intent2 = z ? ((Activity) context).getIntent() : null;
        if (Util.isNullOrNil(stringExtra) && intent2 != null) {
            stringExtra = intent2.getStringExtra("WizardRootClass");
            stringExtra2 = intent2.getStringExtra("WizardTransactionId");
            if (intent2.getComponent() != null) {
                Log.m105925i("MicroMsg.MMWizardActivity", "start wizard, callerIntent class=%s", intent2.getComponent().getClassName());
            }
        }
        Log.m105925i("MicroMsg.MMWizardActivity", "start wizard, root=%s", stringExtra);
        if (!Util.isNullOrNil(stringExtra)) {
            intent.putExtra("WizardRootClass", stringExtra);
        }
        if (stringExtra2 != null) {
            intent.putExtra("WizardTransactionId", stringExtra2);
        }
        if (intent.getExtras() == null) {
            intent.putExtras(new Bundle());
        }
        if (!z) {
            intent.addFlags(268435456);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/MMWizardActivity", "startWizardActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/ui/MMWizardActivity", "startWizardActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: M7 */
    public static void m7018M7(Context context, Intent intent, Intent intent2) {
        try {
            String str = "trans." + Util.currentTicks() + "." + intent2.hashCode();
            ((HashMap) f24166d).put(str, intent2);
            intent.putExtra("WizardTransactionId", str);
            Intent intent3 = ((Activity) context).getIntent();
            if (intent3 != null) {
                intent3.putExtra("WizardTransactionId", str);
            }
            m7017L7(context, intent);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMWizardActivity", "%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: H7 */
    public void mo7678H7() {
        Log.m105924i("MicroMsg.MMWizardActivity", "cancel()");
        String stringExtra = getIntent().getStringExtra("WizardTransactionId");
        Map<String, Intent> map = f24166d;
        Intent intent = (Intent) ((HashMap) map).get(stringExtra);
        ((HashMap) map).remove(stringExtra);
        if (intent != null) {
            Log.m105918d("MicroMsg.MMWizardActivity", "canceled exit for transaction=" + stringExtra + ", intent=" + intent);
        }
    }

    /* renamed from: I7 */
    public void mo7679I7(int i) {
        String stringExtra = getIntent().getStringExtra("WizardRootClass");
        String stringExtra2 = getIntent().getStringExtra("WizardTransactionId");
        Log.m105925i("MicroMsg.MMWizardActivity", "exit resultCode:%d, rootClass:%s, transaction:%s", Integer.valueOf(i), stringExtra, stringExtra2);
        Map<String, Intent> map = f24166d;
        Intent intent = (Intent) ((HashMap) map).get(stringExtra2);
        ((HashMap) map).remove(stringExtra2);
        if (intent == null) {
            intent = new Intent();
        }
        if (Util.isNullOrNil(stringExtra) && intent.getComponent() != null) {
            stringExtra = intent.getComponent().getClassName();
            Log.m105925i("MicroMsg.MMWizardActivity", "exit component rootClass %s", stringExtra);
        }
        if (!Util.isNullOrNil(stringExtra)) {
            try {
                intent.putExtra("wizard_activity_result_code", i);
                intent.setClassName(this, stringExtra);
                intent.addFlags(67108864);
                if (intent.getStringExtra("WizardRootClass") != null) {
                    m7017L7(this, intent);
                } else {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/MMWizardActivity", "exit", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/MMWizardActivity", "exit", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } catch (Exception unused) {
            }
        }
        C119179t tVar = C119157j.f356862d;
        C6746a aVar2 = new C6746a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar2, 200, false);
    }

    /* renamed from: J7 */
    public void mo7680J7() {
        mo7681K7(1);
    }

    /* renamed from: K7 */
    public void mo7681K7(int i) {
        Log.m105924i("MicroMsg.MMWizardActivity", "finishWizard()");
        mo7679I7(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.MMWizardActivity", "onCreate()");
        if (IntentUtil.getBoolean(getIntent().getExtras(), "WizardRootKillSelf", false)) {
            super.finish();
            Log.m105924i("MicroMsg.MMWizardActivity", "finish wizard, root=" + getComponentName().getClassName());
            mo7679I7(getIntent().getExtras().getInt("wizard_activity_result_code"));
        }
    }
}
