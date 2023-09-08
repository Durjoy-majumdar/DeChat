package eb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: eb0.f4 */
public class C75576f4 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C75578b f222026d;

    /* renamed from: e */
    public C11385n f222027e;

    /* renamed from: f */
    public final String f222028f;

    /* renamed from: g */
    public long f222029g;

    /* renamed from: eb0.f4$a */
    public class C75577a implements Runnable {
        public C75577a() {
        }

        public void run() {
            C75576f4.this.onGYNetEnd(0, 0, 0, (String) null, (C114799u) null, (byte[]) null);
        }

        public String toString() {
            return super.toString() + "|doScene";
        }
    }

    /* renamed from: eb0.f4$b */
    public interface C75578b {
        /* renamed from: a */
        void mo57753a(C114770g gVar);
    }

    public C75576f4(C75578b bVar) {
        this(bVar, (String) null);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        prepareDispatcher(gVar);
        this.f222027e = nVar;
        this.f222029g = Util.currentTicks();
        C86709a0.m107525e().postToWorker(new C75577a());
        return 0;
    }

    public int getType() {
        return 0;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (this.f222026d != null) {
            Log.m105919d("MicroMsg.NetSceneLocalProxy", "local proxy [%s] end, cost=%d", this.f222028f, Long.valueOf(Util.ticksToNow(this.f222029g)));
            this.f222026d.mo57753a(super.dispatcher());
        }
        this.f222027e.onSceneEnd(0, 0, (String) null, this);
    }

    public C75576f4(C75578b bVar, String str) {
        Log.m105925i("MicroMsg.NetSceneLocalProxy", "init LocalProxy task:%s", str);
        this.f222026d = bVar;
        this.f222028f = str;
    }
}
