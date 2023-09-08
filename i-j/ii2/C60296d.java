package ii2;

import com.tencent.p014mm.plugin.reflect.factory.BootReflectClassFactory;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: ii2.d */
public final class C60296d {

    /* renamed from: a */
    public static final C13601g f171927a = C36568h.m40985a(C60297a.f171928d);

    /* renamed from: ii2.d$a */
    public static final class C60297a extends C87413o implements C32224a<C60295c> {

        /* renamed from: d */
        public static final C60297a f171928d = new C60297a();

        public C60297a() {
            super(0);
        }

        public Object invoke() {
            try {
                Object newInstance = BootReflectClassFactory.class.getConstructors()[0].newInstance(new Object[0]);
                if (newInstance != null) {
                    return (C60295c) newInstance;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.reflect.IReflectClassFactory");
            } catch (Exception unused) {
                return new C60294b();
            }
        }
    }
}
