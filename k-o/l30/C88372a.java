package l30;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Objects;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: l30.a */
public abstract class C88372a {

    /* renamed from: a */
    public Runnable f255365a = new C88373a();

    /* renamed from: l30.a$a */
    public class C88373a implements Runnable {
        public C88373a() {
        }

        public void run() {
            String str = "";
            if (C88372a.this.mo59472a()) {
                Object[] objArr = new Object[1];
                if (C88372a.this.mo59474c() != null) {
                    str = C88372a.this.mo59474c();
                }
                objArr[0] = str;
                Log.m105925i("Kara.BaseCollector", "%s finish working", objArr);
                C119179t tVar = C119157j.f356862d;
                C88372a aVar = C88372a.this;
                Runnable runnable = aVar.f255365a;
                long b = aVar.mo59473b() == 0 ? 1800000 : C88372a.this.mo59473b();
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                Objects.requireNonNull(runnable);
                jVar.mo183886q(runnable, b, (String) null);
                return;
            }
            Object[] objArr2 = new Object[1];
            if (C88372a.this.mo59474c() != null) {
                str = C88372a.this.mo59474c();
            }
            objArr2[0] = str;
            Log.m105921e("Kara.BaseCollector", "%s no working", objArr2);
        }
    }

    /* renamed from: a */
    public abstract boolean mo59472a();

    /* renamed from: b */
    public abstract long mo59473b();

    /* renamed from: c */
    public abstract String mo59474c();
}
