package u42;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import e42.C7596h;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;
import p237sp.C90271s;
import s42.C90126a;
import s42.C90130d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lu42/b;", "Ls42/d;", "<init>", "()V", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90126a(name = "cancelDownloadTask")
/* renamed from: u42.b */
public final class C90613b extends C90130d {

    /* renamed from: u42.b$a */
    public static final class C90614a implements C90271s.C13751b {

        /* renamed from: a */
        public final /* synthetic */ C90613b f260333a;

        /* renamed from: b */
        public final /* synthetic */ C8478d0 f260334b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<String> f260335c;

        public C90614a(C90613b bVar, C8478d0 d0Var, C8479f0<String> f0Var) {
            this.f260333a = bVar;
            this.f260334b = d0Var;
            this.f260335c = f0Var;
        }

        /* renamed from: b */
        public final void mo13120b(int i, T t) {
            if (i == 0) {
                C90613b bVar = this.f260333a;
                bVar.mo124393a(bVar.mo124396e());
                return;
            }
            this.f260334b.f27483d = i;
            C8479f0<String> f0Var = this.f260335c;
            if (t == null) {
                t = "";
            }
            f0Var.f27484d = t;
            C90613b bVar2 = this.f260333a;
            bVar2.mo124393a(bVar2.mo124395d(i, t));
        }
    }

    /* renamed from: c */
    public void mo73403c(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        C8478d0 d0Var = new C8478d0();
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = "";
        long optLong = hVar.optLong("downloadId");
        ((C90271s) C86312j.m106911c(C90271s.class)).mo12604op(MMApplicationContext.getContext(), optLong, hVar, new C90614a(this, d0Var, f0Var));
    }
}
