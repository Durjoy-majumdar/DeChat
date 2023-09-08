package wd2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C31924c1;
import f62.C75700k0;
import java.util.Map;
import ob0.C35136m;
import te3.C77949j3;
import ud2.C78147c;
import ud2.C78150h;
import zt3.C119157j;

/* renamed from: wd2.c */
public class C38066c implements C31924c1 {

    /* renamed from: wd2.c$a */
    public class C38067a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f100628d;

        /* renamed from: e */
        public final /* synthetic */ C35136m.C35137a f100629e;

        public C38067a(C38066c cVar, Map map, C35136m.C35137a aVar) {
            this.f100628d = map;
            this.f100629e = aVar;
        }

        public void run() {
            String str = (String) this.f100628d.get(".sysmsg.pat.fromusername");
            String str2 = (String) this.f100628d.get(".sysmsg.pat.chatusername");
            String str3 = (String) this.f100628d.get(".sysmsg.pat.pattedusername");
            String str4 = (String) this.f100628d.get(".sysmsg.pat.template");
            Log.m105925i("PatMsgListener", "fromUser: %s, chatUser: %s, pattedUser: %s, template:%s", str, str2, str3, str4);
            if (((C78150h) C86312j.m106911c(C78150h.class)).isPatEnable()) {
                if (((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).py0(this.f100629e.f94242a.f227638r)) {
                    Log.m105929w("PatMsgListener", "ignore insert, msg %d should be deleted!", Long.valueOf(this.f100629e.f94242a.f227638r));
                    return;
                }
                C77949j3 j3Var = this.f100629e.f94242a;
                ((C78147c) C86312j.m106911c(C78147c.class)).yx0(str2, str, str3, str4, j3Var.f227635o, j3Var.f227638r);
            }
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if ("pat".equals(str)) {
            ((C119157j) C119157j.f356862d).mo183876g(new C38067a(this, map, aVar), "HandlePatMsg");
        }
    }
}
