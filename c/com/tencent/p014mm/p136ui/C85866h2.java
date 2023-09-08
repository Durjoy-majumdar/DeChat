package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.p014mm.pluginsdk.model.app.C72682b;
import com.tencent.p014mm.sandbox.monitor.C85705h;
import com.tencent.p014mm.sandbox.updater.AppInstallerUI;
import com.tencent.p014mm.sandbox.updater.Updater;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C9556a;
import s72.C90148b;
import s72.C90149c;

/* renamed from: com.tencent.mm.ui.h2 */
public class C85866h2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f250083d;

    /* renamed from: e */
    public final /* synthetic */ String f250084e;

    /* renamed from: f */
    public final /* synthetic */ Context f250085f;

    /* renamed from: com.tencent.mm.ui.h2$a */
    public class C85867a implements Runnable {
        public C85867a() {
        }

        public void run() {
            C90148b bVar = C90149c.f258834a;
            if (bVar != null) {
                Context context = C85866h2.this.f250085f;
                ((SubCoreSandBox) bVar).getClass();
                int i = Updater.f249748o;
                Intent intent = new Intent(context, AppInstallerUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/sandbox/updater/Updater", "goInstall", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/sandbox/updater/Updater", "goInstall", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    public C85866h2(int i, String str, Context context) {
        this.f250083d = i;
        this.f250084e = str;
        this.f250085f = context;
    }

    public void run() {
        if (this.f250083d == 4 && C72682b.m85000c() == null) {
            Log.m105928w("MicroMsg.MMErrorProcessor", "alphaUpdateInfo expired");
            return;
        }
        C90148b bVar = C90149c.f258834a;
        if (bVar != null) {
            String str = this.f250084e;
            ((SubCoreSandBox) bVar).getClass();
            if (C85705h.m105861e(str, false) != null) {
                MMHandlerThread.postToMainThread(new C85867a());
            }
        }
    }
}
