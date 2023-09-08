package vh3;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import jp3.C9486a;
import jp3.C9487b;
import zt3.C119157j;

/* renamed from: vh3.g */
public final class C102196g extends C102192d implements C9486a {

    /* renamed from: d */
    public C102191c f300894d;

    /* renamed from: vh3.g$a */
    public static final class C102197a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ String f300895d;

        /* renamed from: e */
        public final /* synthetic */ C102196g f300896e;

        public C102197a(String str, C102196g gVar) {
            this.f300895d = str;
            this.f300896e = gVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            ((C119157j) C119157j.f356862d).mo183875f(new C102195f((Bundle) obj, this.f300895d, this.f300896e));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102196g(C9487b<C9486a> bVar, String str, C102191c cVar) {
        super(bVar, str, cVar);
        C87412m.m108594g(str, "lensId");
        this.f300894d = cVar;
        if (bVar != null) {
            bVar.keep(this);
        }
        Bundle bundle = new Bundle();
        bundle.putString("data", str);
        C80907o.m98781d(MMApplicationContext.getPackageName(), bundle, C102204m.class, new C102197a(str, this));
    }

    public void dead() {
        Log.m105924i("MicroMsg.GetLensInfoTask", "dead: ");
        this.f300894d = null;
    }
}
