package u42;

import android.content.Context;
import di3.C86312j;
import e42.C7596h;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;
import p237sp.C90271s;
import s42.C90126a;
import s42.C90130d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lu42/d;", "Ls42/d;", "<init>", "()V", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90126a(name = "pauseDownloadTask")
/* renamed from: u42.d */
public final class C90615d extends C90130d {

    /* renamed from: u42.d$a */
    public static final class C90616a implements C90271s.C13751b {

        /* renamed from: a */
        public final /* synthetic */ C90615d f260336a;

        /* renamed from: b */
        public final /* synthetic */ C8478d0 f260337b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<String> f260338c;

        public C90616a(C90615d dVar, C8478d0 d0Var, C8479f0<String> f0Var) {
            this.f260336a = dVar;
            this.f260337b = d0Var;
            this.f260338c = f0Var;
        }

        /* renamed from: b */
        public final void mo13120b(int i, T t) {
            if (i == 0) {
                C90615d dVar = this.f260336a;
                dVar.mo124393a(dVar.mo124396e());
                return;
            }
            this.f260337b.f27483d = i;
            C8479f0<String> f0Var = this.f260338c;
            if (t == null) {
                t = "";
            }
            f0Var.f27484d = t;
            C90615d dVar2 = this.f260336a;
            dVar2.mo124393a(dVar2.mo124395d(i, t));
        }
    }

    /* renamed from: c */
    public void mo73403c(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        C8478d0 d0Var = new C8478d0();
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = "";
        ((C90271s) C86312j.m106911c(C90271s.class)).mo12598D7((Context) null, hVar.optLong("downloadId"), hVar, new C90616a(this, d0Var, f0Var));
    }
}
