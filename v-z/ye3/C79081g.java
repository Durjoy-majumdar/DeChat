package ye3;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: ye3.g */
public final class C79081g implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C79087l f232222d;

    /* renamed from: ye3.g$a */
    public static final class C79082a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C79087l f232223d;

        public C79082a(C79087l lVar) {
            this.f232223d = lVar;
        }

        public final void run() {
            C86709a0.m107524d().mo123470p(281, this.f232223d.f232230a);
            this.f232223d.f232230a = null;
        }
    }

    public C79081g(C79087l lVar) {
        this.f232222d = lVar;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        MMHandlerThread.postToMainThread(new C79082a(this.f232222d));
    }
}
