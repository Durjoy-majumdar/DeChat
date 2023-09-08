package i83;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import sx3.C110818d0;
import te3.C49117da2;
import te3.C49256ea2;
import te3.zj4;

/* renamed from: i83.l */
public final class C46190l implements C0125s {

    /* renamed from: d */
    public C103766u f124495d = new C103766u(this);

    /* renamed from: e */
    public C54219z<C46193o> f124496e = new C54219z<>();

    /* renamed from: f */
    public final HashSet<Integer> f124497f = new HashSet<>();

    /* renamed from: g */
    public LinkedList<C46193o> f124498g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C46193o> f124499h = new LinkedList<>();

    /* renamed from: i */
    public int f124500i;

    /* renamed from: a */
    public final void mo71621a() {
        while (this.f124499h.size() < 8 && !this.f124498g.isEmpty()) {
            C46193o oVar = (C46193o) C110818d0.m150914L(this.f124498g);
            if (this.f124498g.size() > 0) {
                this.f124498g.remove(0);
            }
            this.f124499h.add(oVar);
            int i = this.f124500i + 1;
            this.f124500i = i;
            if (i > 2000) {
                this.f124498g.clear();
                Log.m105921e("MicroMsg.WebTransCgiLogic", "cgi num over limit! %d", 2000);
                return;
            }
            try {
                LinkedList<zj4> linkedList = new LinkedList<>();
                Iterator<C46192n> it = oVar.f124511a.iterator();
                while (it.hasNext()) {
                    zj4 zj4 = new zj4();
                    zj4.f146040d = 1;
                    zj4.f146041e = it.next().f124508b;
                    zj4.f146043g = 17;
                    linkedList.add(zj4);
                }
                C49117da2 da22 = new C49117da2();
                da22.f132209e = linkedList;
                da22.f132208d = linkedList.size();
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = da22;
                bVar.f127067b = new C49256ea2();
                bVar.f127068c = "/cgi-bin/micromsg-bin/gettranstext";
                bVar.f127069d = 631;
                bVar.f127070e = 0;
                bVar.f127071f = 0;
                C47350c a = bVar.mo72403a();
                int hashCode = da22.hashCode();
                this.f124497f.add(Integer.valueOf(hashCode));
                Log.m105924i("MicroMsg.WebTransCgiLogic", "translate: reqStringList size = " + linkedList.size() + " hashcode = " + hashCode);
                ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C46186j(this, oVar, hashCode));
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.WebTransCgiLogic", "translate: do cgi failed！！！");
                this.f124499h.remove(oVar);
            }
        }
    }

    public C39623j getLifecycle() {
        return this.f124495d;
    }
}
