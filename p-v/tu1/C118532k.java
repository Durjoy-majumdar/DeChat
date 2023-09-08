package tu1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: tu1.k */
public final class C118532k {

    /* renamed from: c */
    public static final C118533a f354730c = new C118533a((C8480h) null);

    /* renamed from: d */
    public static C118532k f354731d;

    /* renamed from: a */
    public C118520b f354732a;

    /* renamed from: b */
    public C101928c f354733b = new C101928c();

    /* renamed from: tu1.k$a */
    public static final class C118533a {
        public C118533a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C118532k mo183248a() {
            C118532k kVar;
            C118532k kVar2 = C118532k.f354731d;
            if (kVar2 != null) {
                return kVar2;
            }
            synchronized (this) {
                kVar = C118532k.f354731d;
                if (kVar == null) {
                    kVar = new C118532k();
                    C118532k.f354731d = kVar;
                }
            }
            return kVar;
        }
    }

    public C118532k() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        this.f354732a = new C118520b(context);
    }
}
