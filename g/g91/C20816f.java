package g91;

import android.os.Message;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import e91.C116711b;
import f91.C116850b;
import j91.C21201c;
import java.util.concurrent.locks.ReentrantLock;
import lu3.C88656g;
import te3.C64285cg2;
import zt3.C119157j;

/* renamed from: g91.f */
public final class C20816f {

    /* renamed from: a */
    public MMHandler f58818a;

    /* renamed from: b */
    public C20815e f58819b;

    /* renamed from: c */
    public C20812b f58820c = new C20812b();

    /* renamed from: d */
    public final C88656g f58821d;

    /* renamed from: g91.f$a */
    public class C20817a implements C88656g {
        public C20817a() {
        }

        public String getKey() {
            return "hellhound-receive";
        }

        public void run() {
            while (true) {
                try {
                    C20811a d = C20816f.this.f58820c.mo32506d();
                    if (d == null) {
                        Log.m105920e("HABBYGE-MALI.MsgQ", "MsgQ, mReceiver, localMsg == null");
                    } else {
                        C20815e eVar = C20816f.this.f58819b;
                        if (eVar != null) {
                            ((C21201c.C21202a) eVar).mo33181a(d);
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("HABBYGE-MALI.MsgQ", e, "MsgQ, mReceiver: %s", e.getMessage());
                    C115669n.INSTANCE.idkeyStat(932, 113, 1, false);
                }
            }
        }
    }

    /* renamed from: g91.f$b */
    public final class C20818b extends MMHandler {
        public C20818b(String str) {
            super(str);
        }

        public void handleMessage(Message message) {
            ReentrantLock reentrantLock;
            if (message != null && message.what == 0) {
                try {
                    C20811a aVar = (C20811a) message.obj;
                    C20812b bVar = C20816f.this.f58820c;
                    if (aVar == null) {
                        bVar.getClass();
                        return;
                    }
                    reentrantLock = bVar.f58813a;
                    reentrantLock.lockInterruptibly();
                    while (true) {
                        C64285cg2 a = C20812b.m22806a();
                        if ((a == null ? 0 : a.f182474d.size()) == 10) {
                            bVar.f58815c.await();
                        } else {
                            bVar.mo32505c(aVar);
                            reentrantLock.unlock();
                            return;
                        }
                    }
                } catch (Exception unused) {
                    C115669n.INSTANCE.idkeyStat(932, 114, 1, false);
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
    }

    public C20816f() {
        C20817a aVar = new C20817a();
        this.f58821d = aVar;
        if (C116711b.m164589n()) {
            C116850b.m164834d("key_hellhound_msgQ", new byte[0]);
        }
        C20818b bVar = new C20818b("hellhound_msgq");
        this.f58818a = bVar;
        bVar.setLogging(false);
        ((C119157j) C119157j.f356862d).mo183884o(aVar);
    }
}
