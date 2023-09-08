package yw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f62.C31924c1;
import java.util.Map;
import ob0.C35133k;
import ob0.C35136m;
import ww0.C53204g;
import ww0.C53209j;
import zt3.C119157j;

/* renamed from: yw0.a */
public class C39224a implements C31924c1 {

    /* renamed from: yw0.a$a */
    public class C39225a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ byte[] f105527d;

        public C39225a(C39224a aVar, byte[] bArr) {
            this.f105527d = bArr;
        }

        public void run() {
            C53204g.m59621i(this.f105527d);
            C53204g.m59614b(false);
            C53204g.m59619g(C53204g.m59617e(false));
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        String str2;
        Object obj;
        Class cls = C53209j.class;
        if (str.equals("functionmsg") && (str2 = map.get(".sysmsg.functionmsg.businessid")) != null) {
            ((C53209j) C86312j.m106911c(cls)).f148435d.getClass();
            if (str2.equals("20002") && (obj = aVar.f94248g) != null) {
                byte[] f = ((C35133k.C35134b) obj).f94240a.f139227e.mo123703f();
                ((C53209j) C86312j.m106911c(cls)).f148435d.getClass();
                String i = new C86009m1(new C86009m1(C53204g.m59616d()), "blackWhite").mo119971i();
                if (C86013q1.m106450k(i)) {
                    C86013q1.m106447h(i);
                }
                C86013q1.m106444e(i);
                C86013q1.m106438T(i, f, 0, f.length);
                Log.m105925i("BoxNewXmlReceived", "[onNewXmlReceived] bytesLen: %s", Integer.valueOf(f.length));
                ((C119157j) C119157j.f356862d).mo183876g(new C39225a(this, f), "box.HotWordSearchModel");
            }
        }
    }
}
