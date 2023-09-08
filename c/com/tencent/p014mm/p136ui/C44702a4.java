package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import he0.C46021h;
import nj3.C76912y0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.ui.a4 */
public class C44702a4 implements C46021h.C46023b {

    /* renamed from: a */
    public final /* synthetic */ Context f121224a;

    /* renamed from: b */
    public final /* synthetic */ SingleChatInfoUI f121225b;

    /* renamed from: com.tencent.mm.ui.a4$a */
    public class C44703a implements Runnable {
        public C44703a() {
        }

        public void run() {
            C44702a4.this.f121225b.finish();
        }
    }

    public C44702a4(SingleChatInfoUI singleChatInfoUI, Context context) {
        this.f121225b = singleChatInfoUI;
        this.f121224a = context;
    }

    /* renamed from: a */
    public void mo33199a(int i, Bundle bundle) {
        Log.m105924i("MicroMsg.SingleChatInfoUI", "alvinluo doCloseConversation success");
        Context context = this.f121224a;
        C76912y0.m92769h(context, context.getResources().getString(C0966R.string.f361115hf0), C0966R.raw.icons_filled_done);
        C119179t tVar = C119157j.f356862d;
        C44703a aVar = new C44703a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 2000, false);
    }

    /* renamed from: b */
    public void mo33200b(int i, int i2, int i3, String str, Bundle bundle) {
        Log.m105921e("MicroMsg.SingleChatInfoUI", "alvinluo doCloseConversation failed errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        Context context = this.f121224a;
        C76912y0.m92769h(context, context.getResources().getString(C0966R.string.hey), C0966R.raw.ic_filled_loading_fail);
    }
}
