package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;
import r40.C89868a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.console.Shell$$g */
public class Shell$$g implements Shell$$s1 {

    /* renamed from: com.tencent.mm.console.Shell$$g$a */
    public class C28906a implements Runnable {
        public C28906a(Shell$$g shell$$g) {
        }

        public void run() {
            Log.m105925i("MicroMsg.Shell", "Activity dump [%s]", C89868a.m112382a());
        }
    }

    /* renamed from: a */
    public void mo56303a(Intent intent) {
        Runtime.getRuntime().gc();
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "trigger gc...", 0).show();
        ((C119157j) C119157j.f356862d).mo183878i(new C28906a(this), 500);
    }
}
