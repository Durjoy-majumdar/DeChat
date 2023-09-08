package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.GenFingerPrintRsaKeyEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;

/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.a */
public class C71950a {

    /* renamed from: a */
    public Dialog f208716a = null;

    /* renamed from: b */
    public Context f208717b;

    /* renamed from: c */
    public C71952b f208718c;

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.a$a */
    public class C71951a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ GenFingerPrintRsaKeyEvent f208719d;

        public C71951a(GenFingerPrintRsaKeyEvent genFingerPrintRsaKeyEvent) {
            this.f208719d = genFingerPrintRsaKeyEvent;
        }

        public void run() {
            Log.m105924i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback");
            GenFingerPrintRsaKeyEvent.C67705b bVar = this.f208719d.f193631e;
            if (bVar != null && bVar.f193635a) {
                Log.m105924i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result.isSuccess is true");
                C71950a.this.mo99166a();
                C71952b bVar2 = C71950a.this.f208718c;
                if (bVar2 != null) {
                    bVar2.mo99087C4(bVar.f193635a, bVar.f193636b, bVar.f193637c);
                }
            } else if (bVar == null || bVar.f193635a) {
                Log.m105924i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result == null");
            } else {
                C71950a.this.mo99166a();
                C71952b bVar3 = C71950a.this.f208718c;
                if (bVar3 != null) {
                    bVar3.mo99087C4(bVar.f193635a, bVar.f193636b, bVar.f193637c);
                }
                Log.m105920e("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result.isSuccess is false");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.a$b */
    public interface C71952b {
        /* renamed from: C4 */
        void mo99087C4(boolean z, String str, String str2);
    }

    public C71950a(Context context, C71952b bVar) {
        this.f208717b = context;
        this.f208718c = bVar;
    }

    /* renamed from: a */
    public void mo99166a() {
        Dialog dialog = this.f208716a;
        if (dialog != null) {
            dialog.dismiss();
            this.f208716a = null;
        }
    }

    /* renamed from: b */
    public void mo99167b(boolean z, int i, String str) {
        Dialog dialog;
        GenFingerPrintRsaKeyEvent genFingerPrintRsaKeyEvent = new GenFingerPrintRsaKeyEvent();
        genFingerPrintRsaKeyEvent.f193631e = null;
        genFingerPrintRsaKeyEvent.f193630d.f193632a = z;
        if (z && ((dialog = this.f208716a) == null || !dialog.isShowing())) {
            Dialog dialog2 = this.f208716a;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f208716a = C75197d0.m90164e(this.f208717b, false, new C71953b(this));
        }
        GenFingerPrintRsaKeyEvent.C67704a aVar = genFingerPrintRsaKeyEvent.f193630d;
        aVar.f193633b = i;
        aVar.f193634c = str;
        genFingerPrintRsaKeyEvent.callback = new C71951a(genFingerPrintRsaKeyEvent);
        genFingerPrintRsaKeyEvent.asyncPublish(Looper.getMainLooper());
    }
}
