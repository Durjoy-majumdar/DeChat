package p007bo;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: bo.e */
public final class C0336e {

    /* renamed from: a */
    public static final C0336e f914a = new C0336e();

    /* renamed from: b */
    public static final C13601g f915b = C36568h.m40985a(C0337a.f917d);

    /* renamed from: c */
    public static final C13601g f916c = C36568h.m40985a(C0338b.f918d);

    /* renamed from: bo.e$a */
    public static final class C0337a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C0337a f917d = new C0337a();

        public C0337a() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_magic_adbrandservice, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizFlutterDynamicCardHelper", "openAdBrandServiceCard " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: bo.e$b */
    public static final class C0338b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C0338b f918d = new C0338b();

        public C0338b() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_magic_brandservice, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizFlutterDynamicCardHelper", "openBrandServiceCard " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: a */
    public final boolean mo376a() {
        return ((Boolean) ((C36570n) f915b).getValue()).booleanValue();
    }
}
