package i40;

import android.content.Context;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: i40.b */
public class C98597b extends C39622i0 {

    /* renamed from: e */
    public static final C60245a f289091e = new C60245a((C8480h) null);

    /* renamed from: d */
    public final C98598e f289092d;

    /* renamed from: i40.b$a */
    public static final class C60245a {

        /* renamed from: i40.b$a$a */
        public static final class C60246a implements C54209k0.C54210b {

            /* renamed from: a */
            public final /* synthetic */ C98598e f171774a;

            public C60246a(C98598e eVar) {
                this.f171774a = eVar;
            }

            public <T extends C39622i0> T create(Class<T> cls) {
                C87412m.m108594g(cls, "modelClass");
                return (C39622i0) cls.getConstructor(new Class[]{C98598e.class}).newInstance(new Object[]{this.f171774a});
            }
        }

        public C60245a(C8480h hVar) {
        }

        /* renamed from: a */
        public final <T extends C98597b> T mo85231a(C98598e eVar, Class<T> cls) {
            C87412m.m108594g(eVar, "service");
            C87412m.m108594g(cls, "modelClass");
            if (C98597b.class.isAssignableFrom(cls)) {
                T a = new C54209k0(eVar.getViewModelStore(), (C54209k0.C54210b) new C60246a(eVar)).mo75002a(cls);
                C87412m.m108593f(a, "service: MvvmFeatureServ…       }).get(modelClass)");
                return (C98597b) a;
            }
            throw new IllegalArgumentException(eVar.getClass().getName() + " must extends FeatureServiceComponent");
        }
    }

    public C98597b(C98598e eVar) {
        C87412m.m108594g(eVar, "service");
        this.f289092d = eVar;
    }

    /* renamed from: c3 */
    public static final <T extends C98597b> T m128130c3(C98598e eVar, Class<T> cls) {
        return f289091e.mo85231a(eVar, cls);
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C87412m.m108594g(context, "context");
    }

    /* renamed from: e3 */
    public void mo106534e3(Context context) {
        C87412m.m108594g(context, "context");
    }

    /* renamed from: f3 */
    public void mo57311f3() {
    }
}
