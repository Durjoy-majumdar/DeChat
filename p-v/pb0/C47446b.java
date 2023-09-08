package pb0;

import c14.C54637q;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C58057l;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import lu3.C88656g;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49335eu3;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: pb0.b */
public final class C47446b {

    /* renamed from: a */
    public static final C47447a f127269a = new C47447a((C8480h) null);

    /* renamed from: pb0.b$a */
    public static final class C47447a {

        /* renamed from: pb0.b$a$a */
        public static final class C47448a implements C88656g {

            /* renamed from: d */
            public final /* synthetic */ C47350c f127270d;

            /* renamed from: e */
            public final /* synthetic */ C54637q<C47445a<T>> f127271e;

            public C47448a(C47350c cVar, C54637q<C47445a<T>> qVar) {
                this.f127270d = cVar;
                this.f127271e = qVar;
            }

            public String getKey() {
                return "FlowNetScene:" + this.f127270d.f127058d;
            }

            public void run() {
                new C47449c(this.f127270d, this.f127271e).doScene(C86709a0.m107524d().f256809d, (C11385n) null);
            }
        }

        public C47447a(C8480h hVar) {
        }

        /* renamed from: a */
        public final <T extends C49335eu3> C45252f<C47445a<T>> mo72464a(C47350c cVar) {
            C87412m.m108594g(cVar, "reqResp");
            Log.m105924i("MicroMsg.Mvvm.FlowNetScene", "doScene, " + cVar.f127058d + ' ' + cVar.f127057c);
            C54637q qVar = new C54637q();
            C119179t tVar = C119157j.f356862d;
            C47448a aVar = new C47448a(cVar, qVar);
            ((C119157j) tVar).mo183876g(aVar, "FlowNetScene:" + cVar.f127058d);
            return new C58057l(qVar);
        }
    }
}
