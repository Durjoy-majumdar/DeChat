package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p154fy.C45843c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.b */
public final class C82137b implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C45843c f240929d;

    /* renamed from: e */
    public final /* synthetic */ C1256g<IPCBoolean> f240930e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.b$a */
    public static final class C82138a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C1256g<IPCBoolean> f240931d;

        /* renamed from: e */
        public final /* synthetic */ int f240932e;

        /* renamed from: f */
        public final /* synthetic */ int f240933f;

        public C82138a(C1256g<IPCBoolean> gVar, int i, int i2) {
            this.f240931d = gVar;
            this.f240932e = i;
            this.f240933f = i2;
        }

        public final void run() {
            C1256g<IPCBoolean> gVar = this.f240931d;
            if (gVar != null) {
                gVar.mo894a(new IPCBoolean(this.f240932e == 0 && this.f240933f == 0));
            }
        }
    }

    public C82137b(C45843c cVar, C1256g<IPCBoolean> gVar) {
        this.f240929d = cVar;
        this.f240930e = gVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        MMHandlerThread.postToMainThread(new C82138a(this.f240930e, i, i2));
        C89137b0 d = C86709a0.m107524d();
        this.f240929d.getClass();
        d.mo123470p(2700, this);
    }
}
