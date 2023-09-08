package qh3;

import android.content.Context;
import java.util.HashMap;

/* renamed from: qh3.b */
public final class C89661b {

    /* renamed from: a */
    public final C89663b<?>[] f257893a;

    /* renamed from: qh3.b$a */
    public interface C89662a<T> {
        /* renamed from: a */
        void mo123994a(C89663b<T> bVar, T t);
    }

    /* renamed from: qh3.b$b */
    public interface C89663b<T> {
        /* renamed from: b */
        void mo123985b(C89662a<T> aVar);

        /* renamed from: c */
        void mo123986c(C89662a<T> aVar);

        T get();

        String name();
    }

    public C89661b(Context context) {
        C89669g gVar = new C89669g(context);
        this.f257893a = new C89663b[]{gVar.f257901a, gVar.f257902b};
        new HashMap();
    }

    /* renamed from: a */
    public <T> C89663b<T> mo123993a(int i, Class<T> cls) {
        if (i >= 0) {
            C89663b<?>[] bVarArr = this.f257893a;
            if (i < bVarArr.length) {
                return bVarArr[i];
            }
        }
        return null;
    }
}
