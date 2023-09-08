package pe2;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import i40.C98597b;
import java.util.LinkedList;
import java.util.List;
import ke2.C99129c;
import te2.C101747e;
import te2.C101749f;
import ye2.C102838a;
import ye2.C102840c;
import zt3.C119157j;

/* renamed from: pe2.h */
public class C100788h {

    /* renamed from: a */
    public List<Object> f295256a = new LinkedList();

    /* renamed from: b */
    public C100789a f295257b = new C100789a("Priority.PriorityTaskRunner");

    /* renamed from: pe2.h$a */
    public class C100789a extends MMHandler {
        public C100789a(String str) {
            super(str);
            setLogging(false);
        }

        public void handleMessage(Message message) {
            Class cls = C99129c.class;
            try {
                int i = message.what;
                if (i == 0) {
                    Log.m105924i("MicroMsg.Priority.PriorityTaskRunner", "priority runner tick");
                    C100789a aVar = C100788h.this.f295257b;
                    if (aVar != null) {
                        aVar.removeMessages(0);
                    }
                    C100789a aVar2 = C100788h.this.f295257b;
                    if (aVar2 != null) {
                        aVar2.sendEmptyMessageDelayed(0, 120000);
                    }
                    if (!((C99129c) C86312j.m106911c(cls)).f290671x.mo129620c() && ((C99129c) C86312j.m106911c(cls)).f290671x.mo129619b()) {
                        ((C99129c) C86312j.m106911c(cls)).f290671x.mo129621d();
                    }
                    C99129c cVar = (C99129c) C86312j.m106911c(cls);
                    cVar.requireAccountInitialized();
                    if (!(!Util.isNullOrNil(cVar.f290672y.f297402d))) {
                        C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                        cVar2.requireAccountInitialized();
                        if (cVar2.f290672y.mo141059a()) {
                            C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
                            cVar3.requireAccountInitialized();
                            cVar3.f290672y.mo141061c();
                        }
                    }
                    if (C102840c.m135908c()) {
                        C100788h.this.mo140229a(new C102840c());
                    }
                    C100788h hVar = C100788h.this;
                    hVar.getClass();
                    ((C119157j) C119157j.f356862d).mo183875f(new C100787g(hVar));
                } else if (i == 1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C102838a aVar3 = (C102838a) message.obj;
                    try {
                        aVar3.run();
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Priority.PriorityTaskRunner", e, "MESSAGE_ONCE_RUN_TASK %s", aVar3.mo129622a());
                    }
                    Log.m105925i("MicroMsg.Priority.PriorityTaskRunner", "Once Run Task %s Use Time %d", aVar3.mo129622a(), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } else if (i != 2) {
                    Log.m105928w("MicroMsg.Priority.PriorityTaskRunner", "msg.what = " + message.what);
                } else {
                    C100789a aVar4 = C100788h.this.f295257b;
                    if (aVar4 != null) {
                        aVar4.removeMessages(2);
                    }
                    Log.m105924i("MicroMsg.Priority.PriorityTaskRunner", "MESSAGE_PRE_DOWNLOAD_CHECK");
                    C99129c cVar4 = (C99129c) C86312j.m106911c(cls);
                    cVar4.getClass();
                    C98597b.C60245a aVar5 = C98597b.f289091e;
                    ((C119157j) C119157j.f356862d).mo183875f(new C101749f((C101747e) aVar5.mo85231a(cVar4, C101747e.class)));
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.Priority.PriorityTaskRunner", e2, "handle priority msg", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo140229a(C102838a aVar) {
        C100789a aVar2 = this.f295257b;
        if (aVar2 != null) {
            this.f295257b.sendMessage(aVar2.obtainMessage(1, aVar));
        }
    }
}
