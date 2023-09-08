package sx2;

import android.os.Looper;
import com.tencent.p014mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: sx2.n */
public class C118331n extends ILiveConEngineCallback_AIDL.C115779a {

    /* renamed from: e */
    public final /* synthetic */ C118325m f353671e;

    /* renamed from: sx2.n$a */
    public class C118332a implements Runnable {
        public C118332a() {
        }

        public void run() {
            C118331n.this.f353671e.mo183128u(true);
        }
    }

    /* renamed from: sx2.n$b */
    public class C118333b implements Runnable {
        public C118333b() {
        }

        public void run() {
            C118331n.this.f353671e.mo183116i();
        }
    }

    public C118331n(C118325m mVar) {
        this.f353671e = mVar;
    }

    public void keep_OnError(int i) {
        Log.m105921e("MicroMsg.TalkRoomServer", "engineCallback OnError: %d", Integer.valueOf(i));
        C118324l xx02 = C118318d.xx0();
        long j = xx02.f353613A;
        if (j != 0) {
            xx02.f353621c = Util.ticksToNow(j);
        }
        C118318d.xx0().f353622d = 1;
        C118339u uVar = this.f353671e.f353662x;
        uVar.mo183140b("component OnError " + i, 99, i);
        new MMHandler(Looper.getMainLooper()).post(new C118333b());
    }

    public void keep_OnOpenSuccess() {
        Log.m105924i("MicroMsg.TalkRoomServer", "OnOpenSuccess");
        int i = this.f353671e.f353647f;
        if (i != 1) {
            Log.m105929w("MicroMsg.TalkRoomServer", "has exit the talkroom state:%d", Integer.valueOf(i));
            return;
        }
        C118324l xx02 = C118318d.xx0();
        long j = xx02.f353613A;
        if (j != 0) {
            xx02.f353621c = Util.ticksToNow(j);
        }
        new MMHandler(Looper.getMainLooper()).post(new C118332a());
        this.f353671e.mo183114g();
        C118339u uVar = this.f353671e.f353662x;
        uVar.getClass();
        C118338t tVar = new C118338t(uVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            tVar.run();
        } else {
            uVar.f353680b.post(tVar);
        }
    }
}
