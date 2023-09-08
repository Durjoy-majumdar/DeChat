package fc2;

import com.tencent.p014mm.app.C80625v0;
import dd3.C58256b;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.util.Collections;
import ob0.C11385n;
import ob0.C117747y;
import te3.C118449o22;
import te3.C64234an2;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: fc2.b */
public class C116856b extends C86301e implements C58256b {

    /* renamed from: fc2.b$a */
    public class C116857a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ boolean f350241d;

        /* renamed from: e */
        public final /* synthetic */ C58256b.C58257a f350242e;

        public C116857a(C116856b bVar, boolean z, C58256b.C58257a aVar) {
            this.f350241d = z;
            this.f350242e = aVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107524d().mo123470p(603, this);
            if (i == 0 && i2 == 0) {
                this.f350242e.mo75059r2(this.f350241d ? ((C118449o22) ((C116859f) yVar).f350254e.f127056b.f127083a).f354171s : ((C118449o22) ((C116859f) yVar).f350254e.f127056b.f127083a).f354168p, ((C118449o22) ((C116859f) yVar).f350254e.f127056b.f127083a).f354163h);
            } else {
                this.f350242e.mo75059r2("", Collections.EMPTY_LIST);
            }
        }
    }

    public void L00(int i, C64234an2 an22, boolean z, C58256b.C58257a aVar) {
        C116859f fVar = new C116859f(0, i, an22);
        C86709a0.m107524d().mo123455a(603, new C116857a(this, z, aVar));
        C86709a0.m107524d().mo123460f(fVar);
    }
}
