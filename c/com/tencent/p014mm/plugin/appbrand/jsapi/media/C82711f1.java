package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gt0.C87327c0;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.f1 */
public final class C82711f1<T> implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C87327c0 f242009a;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.f1$a */
    public static final class C82712a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87327c0 f242010d;

        public C82712a(C87327c0 c0Var) {
            this.f242010d = c0Var;
        }

        public final void run() {
            this.f242010d.dismiss();
        }
    }

    public C82711f1(C87327c0 c0Var) {
        this.f242009a = c0Var;
    }

    /* renamed from: a */
    public final void mo1720a(Object obj) {
        C87327c0 c0Var = this.f242009a;
        if (c0Var != null) {
            MMHandlerThread.postToMainThread(new C82712a(c0Var));
        }
    }
}
