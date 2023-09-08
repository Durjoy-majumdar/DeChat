package com.tencent.p014mm.plugin.emoji.sync;

import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.plugin.emoji.sync.BKGLoaderManager;

/* renamed from: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$2$$a */
public final /* synthetic */ class BKGLoaderManager$2$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BKGLoaderManager.C410542 f110567d;

    /* renamed from: e */
    public final /* synthetic */ ActivateEvent f110568e;

    public /* synthetic */ BKGLoaderManager$2$$a(BKGLoaderManager.C410542 r1, ActivateEvent activateEvent) {
        this.f110567d = r1;
        this.f110568e = activateEvent;
    }

    public final void run() {
        BKGLoaderManager.C410542 r0 = this.f110567d;
        ActivateEvent activateEvent = this.f110568e;
        r0.getClass();
        if ((activateEvent instanceof ActivateEvent) && !activateEvent.f78706d.f78707a) {
            BKGLoaderManager.this.mo64097f();
        }
    }
}
