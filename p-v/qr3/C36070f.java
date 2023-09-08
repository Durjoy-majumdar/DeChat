package qr3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: qr3.f */
public final class C36070f {

    /* renamed from: a */
    public static boolean f96151a = true;

    /* renamed from: b */
    public static C32226l<? super String, C13598b0> f96152b = C36071a.f96153d;

    /* renamed from: qr3.f$a */
    public static final class C36071a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public static final C36071a f96153d = new C36071a();

        public C36071a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108595h(str, LocaleUtil.ITALIAN);
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj2 = new Object();
            C117292a.m165358d(obj2, aVar.mo10232b(), "com/tencent/mm/xeffect/XEffectLib$libLoader$1", "invoke", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj2, "com/tencent/mm/xeffect/XEffectLib$libLoader$1", "invoke", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m40901a(String str) {
        C87412m.m108595h(str, "name");
        f96152b.invoke(str);
    }
}
