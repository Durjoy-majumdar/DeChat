package ez1;

import com.tencent.p014mm.loader.cache.memory.DefaultBitmapMemoryCache;
import k60.C60979d;
import k60.C99101e;
import n60.C100070a;
import n60.C100071b;
import n60.C100075f;
import s60.C101536b;
import s60.C101539c;

/* renamed from: ez1.h */
public final class C97775h {

    /* renamed from: a */
    public static final C60979d<C45720b> f286852a;

    static {
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        aVar.f293181g = 132;
        aVar.f293180f = 132;
        C100075f a = aVar.mo139398a();
        C100070a aVar2 = new C100070a();
        aVar2.f293145c = new C97769c();
        aVar2.f293144b = new DefaultBitmapMemoryCache();
        aVar2.f293146d = new C97770d();
        aVar2.f293143a = a;
        C101539c cVar = new C101539c(true, 0.1f);
        cVar.f297267c = C101536b.C101538b.DECODED;
        aVar2.mo139396a(cVar);
        f286852a = C99101e.f290570a.mo138480b(new C100071b(aVar2));
    }
}
