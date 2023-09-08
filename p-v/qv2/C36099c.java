package qv2;

import com.tencent.p014mm.autogen.events.OnSoterInitializedEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import pv2.C35701m;
import qv2.C110476d;
import rt3.C22252b;

/* renamed from: qv2.c */
public class C36099c implements Runnable {

    /* renamed from: qv2.c$a */
    public class C36100a implements C35701m {
        public C36100a(C36099c cVar) {
        }

        /* renamed from: n */
        public void mo59577n(int i, String str) {
            Log.m105925i("MicroMsg.SoterInitManager", "init finish: %s, %s", Integer.valueOf(i), str);
            OnSoterInitializedEvent onSoterInitializedEvent = new OnSoterInitializedEvent();
            OnSoterInitializedEvent.C28786a aVar = onSoterInitializedEvent.f78887d;
            aVar.f78888a = i;
            aVar.f78889b = str;
            onSoterInitializedEvent.publish();
        }
    }

    public C36099c(C110476d.C110477a aVar) {
    }

    public void run() {
        if (!C22252b.m25806c()) {
            Log.m105924i("MicroMsg.SoterInitManager", "bind service timeout, reinit");
            C110476d.m150375a(false, true, new C36100a(this));
        }
    }
}
