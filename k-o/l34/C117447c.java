package l34;

import n34.C117604b;
import n34.C117605d;
import t34.C118367e;
import t34.C118375m;
import v34.C118649d;

/* renamed from: l34.c */
public class C117447c {

    /* renamed from: b */
    public static final /* synthetic */ int f351512b = 0;

    /* renamed from: a */
    public final C117450c f351513a;

    /* renamed from: l34.c$a */
    public static class C117448a implements C117450c {
        public void call(Object obj) {
            C117451d dVar = (C117451d) obj;
            dVar.mo182152b(C118649d.f355040a);
            dVar.mo182151a();
        }
    }

    /* renamed from: l34.c$b */
    public static class C117449b implements C117450c {
        public void call(Object obj) {
            ((C117451d) obj).mo182152b(C118649d.f355040a);
        }
    }

    /* renamed from: l34.c$c */
    public interface C117450c extends C117604b<C117451d> {
    }

    /* renamed from: l34.c$d */
    public interface C117451d {
        /* renamed from: a */
        void mo182151a();

        /* renamed from: b */
        void mo182152b(C117459k kVar);
    }

    static {
        new C117447c(new C117448a(), false);
        new C117447c(new C117449b(), false);
    }

    public C117447c(C117450c cVar) {
        C117605d<C117450c, C117450c> dVar = C118375m.f353771c;
        this.f351513a = dVar != null ? (C117450c) ((C118367e) dVar).call(cVar) : cVar;
    }

    public C117447c(C117450c cVar, boolean z) {
        C117605d<C117450c, C117450c> dVar;
        if (z && (dVar = C118375m.f353771c) != null) {
            cVar = (C117450c) ((C118367e) dVar).call(cVar);
        }
        this.f351513a = cVar;
    }
}
