package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C8479f0;
import java.lang.ref.WeakReference;
import ob0.C47350c;

/* renamed from: com.tencent.mm.ui.chatting.gallery.p1 */
public final class C85818p1 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ String f249940a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<WeakReference<C40324j.C40326a>> f249941b;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.p1$a */
    public static final class C85819a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<WeakReference<C40324j.C40326a>> f249942d;

        /* renamed from: e */
        public final /* synthetic */ int f249943e;

        /* renamed from: f */
        public final /* synthetic */ int f249944f;

        /* renamed from: g */
        public final /* synthetic */ String f249945g;

        /* renamed from: h */
        public final /* synthetic */ C47350c f249946h;

        public C85819a(C8479f0<WeakReference<C40324j.C40326a>> f0Var, int i, int i2, String str, C47350c cVar) {
            this.f249942d = f0Var;
            this.f249943e = i;
            this.f249944f = i2;
            this.f249945g = str;
            this.f249946h = cVar;
        }

        public final void run() {
            C40324j.C40326a aVar = (C40324j.C40326a) ((WeakReference) this.f249942d.f27484d).get();
            if (aVar != null) {
                aVar.mo288a(this.f249943e, this.f249944f, this.f249945g, this.f249946h);
            }
        }
    }

    public C85818p1(String str, C8479f0<WeakReference<C40324j.C40326a>> f0Var) {
        this.f249940a = str;
        this.f249941b = f0Var;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        C85820q1 q1Var = C85820q1.f249947a;
        Log.m105924i("MicroMsg.MpShareViewUtil", "getplayurl errType " + i + ", errCode " + i2 + ", errMsg " + str);
        C85820q1 q1Var2 = C85820q1.f249947a;
        C85820q1.f249948b.remove(this.f249940a);
        MMHandlerThread.postToMainThread(new C85819a(this.f249941b, i, i2, str, cVar));
    }
}
