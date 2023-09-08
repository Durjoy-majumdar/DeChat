package com.tencent.p014mm.plugin.scanner;

import com.tencent.p014mm.ipcinvoker.wx_extension.IPCRunCgi;
import hp3.C87581a;
import java.util.LinkedList;
import lp3.C46888b;
import lp3.C88633e;
import lp3.C88643g;
import nr3.C89059e;
import ob0.C47350c;
import op3.C117877b;
import p200lx.C46897s;
import te3.C50104kb;
import te3.C50237lb;
import te3.C51080ra2;
import te3.C51216sa2;

/* renamed from: com.tencent.mm.plugin.scanner.i */
public class C42902i implements C46897s {

    /* renamed from: com.tencent.mm.plugin.scanner.i$a */
    public class C42903a implements C87581a<C51216sa2, C117877b<Integer, C46897s.C46898a>> {
        public C42903a(C42902i iVar) {
        }

        public Object call(Object obj) {
            C117877b bVar = (C117877b) obj;
            C46888b c = C88643g.m110545c();
            int intValue = ((Integer) bVar.mo182596a(0)).intValue();
            C46897s.C46898a aVar = (C46897s.C46898a) bVar.mo182596a(1);
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            bVar2.f127066a = new C50104kb();
            bVar2.f127067b = new C50237lb();
            bVar2.f127068c = "/cgi-bin/micromsg-bin/batchgeturlinfo";
            bVar2.f127069d = 3964;
            C47350c a = bVar2.mo72403a();
            C50104kb kbVar = (C50104kb) a.f127055a.f127080a;
            C51080ra2 ra22 = new C51080ra2();
            String str = aVar.f126105a;
            ra22.f140789d = str;
            ra22.f140790e = C42914t.m46583d(intValue, str) ? 3 : C42914t.m46594o(intValue, str) ? 4 : C42914t.m46587h(intValue, str) ? 2 : C42914t.m46591l(intValue, str) ? 1 : C42914t.m46593n(intValue, str) ? 7 : C42914t.m46592m(intValue, str) ? 5 : C42914t.m46590k(intValue, str) ? 6 : C42914t.m46586g(intValue, str) ? 9 : -1;
            ra22.f140791f = aVar.f126106b;
            ra22.f140792g = aVar.f126107c;
            ra22.f140793h = aVar.f126108d;
            ra22.f140794i = aVar.f126109e;
            kbVar.f136642f = 1;
            LinkedList<C51080ra2> linkedList = new LinkedList<>();
            linkedList.add(ra22);
            kbVar.f136640d = linkedList.size();
            kbVar.f136641e = linkedList;
            IPCRunCgi.m98794a(a, new C42901h(this, c));
            return null;
        }
    }

    /* renamed from: a */
    public C88633e<C51216sa2> mo67099a(int i, C46897s.C46898a aVar) {
        Integer valueOf = Integer.valueOf(i);
        C89059e eVar = new C89059e();
        eVar.mo123423K(valueOf, aVar);
        return eVar.mo123062e(new C42903a(this));
    }
}
