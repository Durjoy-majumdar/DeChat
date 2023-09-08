package il1;

import android.content.Context;
import b50.C54421g;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58113g;
import d50.C7170j;
import fj1.C45795b;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.HashMap;
import p50.C62197e;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: il1.m6 */
public final class C9065m6 {

    /* renamed from: f */
    public static final C9066a f28605f = new C9066a((C8480h) null);

    /* renamed from: a */
    public final Context f28606a;

    /* renamed from: b */
    public final C13601g f28607b = C36568h.m40985a(C9067b.f28611d);

    /* renamed from: c */
    public C45795b f28608c;

    /* renamed from: d */
    public C7170j f28609d;

    /* renamed from: e */
    public boolean f28610e;

    /* renamed from: il1.m6$a */
    public static final class C9066a {
        public C9066a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C7170j mo9892a(boolean z) {
            C58113g gVar;
            HashMap<Integer, C7170j> hashMap;
            Collection<C7170j> values;
            C58113g gVar2;
            C62197e e0 = FinderLiveService.f159376d.mo77631e0();
            C7170j jVar = null;
            C54421g gVar3 = e0 != null ? e0.f176822Y0 : null;
            if (!(gVar3 == null || (gVar2 = gVar3.f152628b) == null)) {
                jVar = gVar2.mo82871d(gVar3.f152631e);
            }
            if (z) {
                int i = jVar != null ? jVar.f25143b : 0;
                if (!(gVar3 == null || (gVar = gVar3.f152628b) == null || (hashMap = gVar.f166241k) == null || (values = hashMap.values()) == null)) {
                    for (C7170j jVar2 : values) {
                        if (jVar2.f25143b > i) {
                            String str = jVar2.f25144c;
                            if (!(str == null || str.length() == 0)) {
                                jVar = jVar2;
                            }
                        }
                    }
                }
                Log.m105924i("FinderLiveVideoDefinitionWidget", "heightest level:" + jVar);
            }
            return jVar;
        }
    }

    /* renamed from: il1.m6$b */
    public static final class C9067b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C9067b f28611d = new C9067b();

        public C9067b() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (C32444a.f86117Y1.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C9065m6(Context context, C45795b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        this.f28606a = context;
        this.f28608c = bVar;
    }
}
