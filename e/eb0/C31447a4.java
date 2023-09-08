package eb0;

import com.tencent.p014mm.autogen.events.DeleteMsgEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.List;
import kj2.C117407d;

/* renamed from: eb0.a4 */
public class C31447a4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f84156d;

    /* renamed from: e */
    public final /* synthetic */ z3$$g f84157e;

    /* renamed from: eb0.a4$a */
    public class C31448a implements Runnable {
        public C31448a() {
        }

        public void run() {
            C31447a4.this.f84157e.mo24604c();
        }
    }

    public C31447a4(long j, z3$$g z3__g) {
        this.f84156d = j;
        this.f84157e = z3__g;
    }

    public void run() {
        Class cls = C75700k0.class;
        C117407d dVar = C117407d.INSTANCE;
        dVar.idkeyStat(1333, 0, 1, true);
        long currentTimeMillis = System.currentTimeMillis();
        ((C31505r2) C86312j.m106911c(C31505r2.class)).xq0();
        ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101181Ow("", this.f84156d);
        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69765g();
        new DeleteMsgEvent().publish();
        if (this.f84157e != null) {
            MMHandlerThread.postToMainThread(new C31448a());
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        Log.m105925i("MicroMsg.MsgInfoStorageLogic", "Delete all messages, synchronized part, time: %d ms", Long.valueOf(currentTimeMillis2));
        String str = "MicroMsg.MsgInfoStorageLogic";
        dVar.idkeyStat(1333, 6, currentTimeMillis2 / 1000, true);
        z3$$g z3__g = this.f84157e;
        if (z3__g == null || !z3__g.mo24603b()) {
            C75604z3.m90831c();
            z3$$g z3__g2 = this.f84157e;
            if (z3__g2 == null || !z3__g2.mo24603b()) {
                C75604z3.m90832d();
                z3$$g z3__g3 = this.f84157e;
                if (z3__g3 == null || !z3__g3.mo24603b()) {
                    List<C72963f4> bO = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101106bO("bottlemessage");
                    if (bO != null) {
                        for (int i = 0; i < bO.size(); i++) {
                            C75604z3.m90833e(bO.get(i), true);
                        }
                    }
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101104bD("bottlemessage");
                    z3$$g z3__g4 = this.f84157e;
                    if (z3__g4 == null || !z3__g4.mo24603b()) {
                        C75604z3.m90830b(this.f84156d, 1);
                        ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101181Ow("", 0);
                        Log.m105925i(str, "Delete all messages, asynchronous part, time: %d ms", Long.valueOf((System.currentTimeMillis() - currentTimeMillis) - currentTimeMillis2));
                    }
                }
            }
        }
    }

    public String toString() {
        return super.toString() + "|deleteAllMsg";
    }
}
