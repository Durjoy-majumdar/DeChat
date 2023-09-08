package com.tencent.p014mm.plugin.wear.model;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import o73.C47336d;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.wear.model.k */
public class C43468k {

    /* renamed from: a */
    public MMHandler f117490a;

    /* renamed from: com.tencent.mm.plugin.wear.model.k$a */
    public class C43469a extends MMHandler {
        public C43469a(C43468k kVar, String str) {
            super(str);
        }

        public void handleMessage(Message message) {
            C47336d dVar = (C47336d) message.obj;
            if (dVar != null) {
                try {
                    dVar.run();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Wear.WearWorker", e.getCause(), "run task %s occur exception", dVar.mo67621b());
                }
            }
        }
    }

    public C43468k() {
        if (C11171e.m11045b(18)) {
            this.f117490a = new C43469a(this, "WearWorker_worker_thread");
            Log.m105924i("MicroMsg.Wear.WearWorker", "start worker");
        }
    }

    /* renamed from: a */
    public void mo67630a(C47336d dVar) {
        MMHandler mMHandler = this.f117490a;
        if (mMHandler != null) {
            this.f117490a.sendMessage(mMHandler.obtainMessage(0, dVar));
        }
    }
}
