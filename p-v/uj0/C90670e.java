package uj0;

import android.content.Context;
import aw0.C103928o;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import p547hb.C87466e;

/* renamed from: uj0.e */
public class C90670e extends AppBrandPageContainerWC {

    /* renamed from: uj0.e$b */
    public static final class C90672b extends C87466e {

        /* renamed from: uj0.e$b$a */
        public class C90673a implements C82531i.C82535d {
            public C90673a(C90672b bVar) {
            }

            /* renamed from: c */
            public void mo22090c() {
                C103928o.m138641a(true, true, true);
            }
        }

        /* renamed from: uj0.e$b$b */
        public class C90674b implements C82531i.C82533b {
            public C90674b(C90672b bVar) {
            }

            /* renamed from: b */
            public void mo22089b() {
                C103928o.m138642b();
            }
        }

        public C90672b(C90671a aVar) {
        }

        /* renamed from: d */
        public C83780d1 mo115880d(C83849m0 m0Var, String str) {
            C90675f fVar = new C90675f();
            fVar.mo114868y(new C90673a(this));
            fVar.mo114864j(new C90674b(this));
            return fVar;
        }
    }

    public C90670e(Context context, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(context, appBrandRuntimeWC, new C90672b((C90671a) null));
    }
}
