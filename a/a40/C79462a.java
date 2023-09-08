package a40;

import f30.C86705b;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.C89289c;
import y30.C91370a;

/* renamed from: a40.a */
public abstract class C79462a {

    /* renamed from: a */
    public C91370a f233006a;

    /* renamed from: a40.a$a */
    public class C79463a {

        /* renamed from: a */
        public Map<Integer, Float> f233007a = new HashMap();

        public C79463a(C79462a aVar) {
        }

        /* renamed from: a */
        public float mo109459a(int i) {
            return ((Float) ((HashMap) this.f233007a).get(Integer.valueOf(i))).floatValue();
        }

        /* renamed from: b */
        public void mo109460b(int i, float f) {
            ((HashMap) this.f233007a).put(Integer.valueOf(i), Float.valueOf(f));
        }
    }

    /* renamed from: a40.a$b */
    public abstract class C79464b {
        public C79464b(C79462a aVar) {
        }

        /* renamed from: a */
        public abstract C79463a mo109461a(C89289c cVar, Object[] objArr);
    }

    /* renamed from: a */
    public abstract boolean mo109455a();

    /* renamed from: b */
    public abstract boolean mo109456b();

    /* renamed from: c */
    public abstract C79463a mo109457c(C86705b bVar);

    /* renamed from: d */
    public abstract void mo109458d();
}
