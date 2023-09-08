package ha0;

import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import ja0.C108679b;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;

/* renamed from: ha0.i */
public final class C108203i {

    /* renamed from: ha0.i$a */
    public static final class C108204a extends C87413o implements C32227p<T, MJError, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15601d<T> f323998d;

        /* renamed from: e */
        public final /* synthetic */ String f323999e;

        /* renamed from: f */
        public final /* synthetic */ long f324000f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108204a(C15601d<? super T> dVar, String str, long j) {
            super(2);
            this.f323998d = dVar;
            this.f323999e = str;
            this.f324000f = j;
        }

        public Object invoke(Object obj, Object obj2) {
            MJError mJError = (MJError) obj2;
            if (mJError != null) {
                Log.m105921e("MicroMsg.MaasFuncUtils", mJError.f154609ec + ' ' + mJError.message, new Throwable());
                this.f323998d.resumeWith(Result.m168114constructorimpl((Object) null));
                C108679b.f325464a.mo159694a(this.f323999e, mJError, System.currentTimeMillis() - this.f324000f);
            } else {
                this.f323998d.resumeWith(Result.m168114constructorimpl(obj));
                C108679b.f325464a.mo159695b(this.f323999e, System.currentTimeMillis() - this.f324000f);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final <T> Object m146548a(String str, C32226l<? super C32227p<? super T, ? super MJError, C13598b0>, C13598b0> lVar, C15601d<? super T> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        lVar.invoke(new C108204a(hVar, str, System.currentTimeMillis()));
        return hVar.mo90314b();
    }
}
