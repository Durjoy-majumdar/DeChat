package p371ph;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import nc3.C34767b;
import p302ch.C16928a;
import p375qh.C22086d;

/* renamed from: ph.b */
public class C21970b implements C22086d.C22088b {

    /* renamed from: a */
    public final /* synthetic */ C21967a f62215a;

    /* renamed from: ph.b$a */
    public class C21971a implements Runnable {
        public C21971a() {
        }

        public void run() {
            C21970b.this.f62215a.f62211l.mo96016a();
        }
    }

    public C21970b(C21967a aVar) {
        this.f62215a = aVar;
    }

    /* renamed from: a */
    public void mo35072a() {
        C16928a aVar = this.f62215a.f62210k;
        aVar.mo157511t();
        if (aVar.f45752p) {
            C34767b.C34768c cVar = aVar.f45749m;
            if (cVar != null) {
                ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
            }
            aVar.f45749m = null;
            aVar.f45752p = false;
        }
        this.f62215a.getClass();
        Log.m105925i("MicroMsg.SceneVoicePlayer", "setError abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s", Boolean.valueOf(this.f62215a.f62207h), Boolean.FALSE);
        if (this.f62215a.f62211l != null) {
            MMHandlerThread.postToMainThread(new C21971a());
        }
    }
}
