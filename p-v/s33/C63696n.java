package s33;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.plugin.voip.model.C57469x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: s33.n */
public abstract class C63696n<REQ, RESP> extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f180556d;

    /* renamed from: e */
    public C11385n f180557e;

    /* renamed from: f */
    public C11385n f180558f;

    /* renamed from: g */
    public C106377r f180559g = C57469x.m66239a();

    /* renamed from: s33.n$a */
    public class C63697a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f180560d;

        /* renamed from: e */
        public final /* synthetic */ int f180561e;

        /* renamed from: f */
        public final /* synthetic */ String f180562f;

        public C63697a(int i, int i2, String str) {
            this.f180560d = i;
            this.f180561e = i2;
            this.f180562f = str;
        }

        public void run() {
            C63696n nVar = C63696n.this;
            C11385n nVar2 = nVar.f180557e;
            if (nVar2 != null) {
                nVar2.onSceneEnd(this.f180560d, this.f180561e, this.f180562f, nVar);
            }
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        int j1 = mo88542j1();
        if (j1 != 0) {
            return j1;
        }
        this.f180558f = nVar;
        this.f180557e = mo72979l1();
        return dispatch(gVar, this.f180556d, this);
    }

    /* renamed from: j1 */
    public int mo88542j1() {
        return 0;
    }

    /* renamed from: k1 */
    public void mo72978k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
    }

    /* renamed from: l1 */
    public abstract C11385n mo72979l1();

    /* renamed from: m1 */
    public <RESP> RESP mo88543m1() {
        return this.f180556d.f127056b.f127083a;
    }

    /* renamed from: n1 */
    public void mo88544n1() {
        Log.m105924i("MicroMsg.VoipNetSceneBase", "netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " is started.");
        C86709a0.m107524d().mo123460f(this);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        mo72978k1(i, i2, i3, str, uVar, bArr);
        C11385n nVar = this.f180558f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        if (this.f180557e != null) {
            MMHandlerThread.postToMainThread(new C63697a(i2, i3, str));
        }
    }
}
