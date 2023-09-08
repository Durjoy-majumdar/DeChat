package x03;

import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import gx3.C87404a;
import p03.C21913e;

/* renamed from: x03.o */
public class C22964o {

    /* renamed from: a */
    public boolean f65982a = false;

    /* renamed from: b */
    public C21913e f65983b;

    /* renamed from: c */
    public int f65984c = mo36182a();

    /* renamed from: d */
    public C29060q.C29061a f65985d = new C22965a();

    /* renamed from: x03.o$a */
    public class C22965a extends C29060q.C29061a {

        /* renamed from: x03.o$a$a */
        public class C22966a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f65987d;

            public C22966a(int i) {
                this.f65987d = i;
            }

            public void run() {
                C22964o oVar = C22964o.this;
                C21913e eVar = oVar.f65983b;
                if (eVar != null) {
                    eVar.mo24955M(this.f65987d, oVar.f65984c);
                }
            }
        }

        public C22965a() {
        }

        public void onNetworkChange(int i) {
            C22964o oVar = C22964o.this;
            int i2 = oVar.f65984c;
            oVar.f65984c = oVar.mo36182a();
            if (C22964o.this.f65984c != i2) {
                Log.m105925i("MicroMsg.TopStory.TopStoryNetworkMgr", "network change current:%d change:%d", Integer.valueOf(i2), Integer.valueOf(C22964o.this.f65984c));
                MMHandlerThread.postToMainThread(new C22966a(i2));
            }
        }
    }

    public C22964o() {
        C86709a0.m107529k().mo121126a(this.f65985d);
    }

    /* renamed from: a */
    public final int mo36182a() {
        if (!C87404a.m108578a(MMApplicationContext.getContext())) {
            return 0;
        }
        return C87404a.m108579b(MMApplicationContext.getContext()) ? 1 : 2;
    }

    /* renamed from: b */
    public boolean mo36183b() {
        return this.f65984c != 0;
    }
}
