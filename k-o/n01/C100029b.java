package n01;

import com.tencent.p014mm.modelcdntran.C92773g0;
import com.tencent.p014mm.modelcdntran.C92778h0;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C100322j;
import p206nj.C76861g;
import te3.C101795jm;
import zt3.C119157j;

/* renamed from: n01.b */
public class C100029b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101795jm f293049d;

    /* renamed from: e */
    public final /* synthetic */ C101795jm f293050e;

    /* renamed from: f */
    public final /* synthetic */ C101795jm f293051f;

    public C100029b(C101795jm jmVar, C101795jm jmVar2, C101795jm jmVar3) {
        this.f293049d = jmVar;
        this.f293050e = jmVar2;
        this.f293051f = jmVar3;
    }

    public void run() {
        long j;
        C76861g.C47263a aVar = new C76861g.C47263a();
        C92779i0 Cx0 = C92779i0.Cx0();
        if (Cx0.f267052p == null) {
            Cx0.f267052p = new C92778h0(Cx0);
        }
        if (Cx0.f267052p == null || this.f293049d == null) {
            j = -1;
        } else {
            C92779i0 Cx02 = C92779i0.Cx0();
            if (Cx02.f267052p == null) {
                Cx02.f267052p = new C92778h0(Cx02);
            }
            C100322j jVar = Cx02.f267052p;
            C101795jm jmVar = this.f293049d;
            C101795jm jmVar2 = this.f293050e;
            C101795jm jmVar3 = this.f293051f;
            C92778h0 h0Var = (C92778h0) jVar;
            h0Var.getClass();
            Log.m105918d("MicroMsg.SubCoreCdnTransport", "cdntra infoUpdate dns info " + jmVar.toString() + " getCore().engine:" + C92779i0.Dx0());
            if (C92779i0.Dx0() != null) {
                C92779i0.Dx0().mo127022f(jmVar, jmVar2, jmVar3, (byte[]) null, (byte[]) null, (C101795jm) null);
                ((C119157j) C119157j.f356862d).mo183876g(new C92773g0(h0Var), "MicroMsg.Cdn.ThreadName");
            }
            j = aVar.mo72288a();
        }
        Log.m105919d("MicroMsg.PinCdnTransport", "dkrsa setautoauthtick [%d %d]", Long.valueOf(aVar.mo72288a()), Long.valueOf(j));
    }
}
