package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f32.C75672b;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.m4 */
public class C69640m4 implements C75672b.C75673a {

    /* renamed from: a */
    public final /* synthetic */ C77994sf2 f201012a;

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f201013b;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.m4$a */
    public class C69641a implements Runnable {
        public C69641a() {
        }

        public void run() {
            C77994sf2 sf22 = C69640m4.this.f201012a;
            if (sf22.f228205i == 1 || sf22.f228209p == 1) {
                Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "envelope has expired do nothing");
            }
        }
    }

    public C69640m4(LuckyMoneyPickEnvelopeUI.C69498r rVar, C77994sf2 sf22) {
        this.f201013b = rVar;
        this.f201012a = sf22;
    }

    public void onComplete(boolean z) {
        C69641a aVar = new C69641a();
        if (MMHandlerThread.isMainThread()) {
            aVar.run();
        } else {
            this.f201013b.f200636T.post(aVar);
        }
    }
}
