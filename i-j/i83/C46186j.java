package i83;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import o40.C61926c;
import ob0.C47350c;
import pe3.C47465a;
import sx3.C64197v;
import te3.C49256ea2;
import te3.ak4;

/* renamed from: i83.j */
public final class C46186j implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C46190l f124488a;

    /* renamed from: b */
    public final /* synthetic */ C46193o f124489b;

    /* renamed from: c */
    public final /* synthetic */ int f124490c;

    public C46186j(C46190l lVar, C46193o oVar, int i) {
        this.f124488a = lVar;
        this.f124489b = oVar;
        this.f124490c = i;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        this.f124488a.f124499h.remove(this.f124489b);
        int i3 = 0;
        if (i != 0 || i2 != 0) {
            Log.m105925i("MicroMsg.WebTransCgiLogic", "translate: onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        } else if (!this.f124488a.f124497f.contains(Integer.valueOf(this.f124490c))) {
            Log.m105928w("MicroMsg.WebTransCgiLogic", "translate: hashCode has been erased, lifecycle is end!");
            this.f124488a.f124497f.remove(Integer.valueOf(this.f124490c));
        } else {
            C46190l lVar = this.f124488a;
            C87412m.m108593f(cVar, "rr");
            C46193o oVar = this.f124489b;
            lVar.getClass();
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetTransTextResponse");
            C49256ea2 ea22 = (C49256ea2) aVar;
            Iterator<C46192n> it = oVar.f124511a.iterator();
            while (it.hasNext()) {
                C46192n next = it.next();
                int i4 = i3 + 1;
                String str2 = null;
                if (i3 >= 0) {
                    C46192n nVar = next;
                    ak4 ak4 = ea22.f132827e.get(i3);
                    nVar.f124509c = ak4 != null ? ak4.f130597e : null;
                    ak4 ak42 = ea22.f132827e.get(i3);
                    if (ak42 != null) {
                        str2 = ak42.f130599g;
                    }
                    nVar.f124510d = str2;
                    i3 = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            lVar.mo71621a();
            C61926c.m72668M(new C46188k(lVar, oVar));
        }
    }
}
