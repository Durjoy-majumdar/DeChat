package y02;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C90430p93;
import te3.C90432q93;
import te3.C90435r93;

/* renamed from: y02.a */
public class C91357a extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f262025d;

    /* renamed from: e */
    public C11385n f262026e;

    /* renamed from: f */
    public String f262027f;

    /* renamed from: g */
    public String f262028g;

    /* renamed from: h */
    public LinkedList<C90430p93> f262029h = new LinkedList<>();

    /* renamed from: i */
    public String f262030i;

    /* renamed from: j */
    public LinkedList<C90432q93> f262031j = new LinkedList<>();

    /* renamed from: n */
    public int f262032n = 0;

    /* renamed from: o */
    public int f262033o = 0;

    public C91357a() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C90432q93();
        bVar.f127067b = new C90435r93();
        bVar.f127068c = "/cgi-bin/micromsg-bin/prconfig";
        bVar.f127069d = 3899;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f262025d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f262026e = nVar;
        C47350c cVar = this.f262025d;
        C90432q93 q932 = (C90432q93) cVar.f127055a.f127080a;
        q932.f259754d = this.f262027f;
        q932.f259755e = this.f262028g;
        q932.f259756f = this.f262029h;
        q932.f259758h = this.f262030i;
        q932.f259759i = this.f262031j;
        q932.f259760j = this.f262032n;
        q932.f259761n = this.f262033o;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 3899;
    }
}
