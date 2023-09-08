package p683s0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: s0.m */
public final class C36602m {

    /* renamed from: a */
    public static final C36601l<Object, Object> f97323a = m41009a(C36603a.f97324d, C36604b.f97325d);

    /* renamed from: s0.m$a */
    public static final class C36603a extends C87413o implements C32227p<C36606n, Object, Object> {

        /* renamed from: d */
        public static final C36603a f97324d = new C36603a();

        public C36603a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C87412m.m108594g((C36606n) obj, "$this$Saver");
            return obj2;
        }
    }

    /* renamed from: s0.m$b */
    public static final class C36604b extends C87413o implements C32226l<Object, Object> {

        /* renamed from: d */
        public static final C36604b f97325d = new C36604b();

        public C36604b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            C87412m.m108594g(obj, LocaleUtil.ITALIAN);
            return obj;
        }
    }

    /* renamed from: s0.m$c */
    public static final class C36605c implements C36601l<Original, Saveable> {

        /* renamed from: a */
        public final /* synthetic */ C32227p<C36606n, Original, Saveable> f97326a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Saveable, Original> f97327b;

        public C36605c(C32227p<? super C36606n, ? super Original, ? extends Saveable> pVar, C32226l<? super Saveable, ? extends Original> lVar) {
            this.f97326a = pVar;
            this.f97327b = lVar;
        }

        /* renamed from: a */
        public Saveable mo60749a(C36606n nVar, Original original) {
            C87412m.m108594g(nVar, "<this>");
            return this.f97326a.invoke(nVar, original);
        }

        /* renamed from: b */
        public Original mo60750b(Saveable saveable) {
            C87412m.m108594g(saveable, "value");
            return this.f97327b.invoke(saveable);
        }
    }

    /* renamed from: a */
    public static final <Original, Saveable> C36601l<Original, Saveable> m41009a(C32227p<? super C36606n, ? super Original, ? extends Saveable> pVar, C32226l<? super Saveable, ? extends Original> lVar) {
        C87412m.m108594g(pVar, "save");
        C87412m.m108594g(lVar, "restore");
        return new C36605c(pVar, lVar);
    }
}
