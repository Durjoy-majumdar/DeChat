package s42;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.magicbrush.jsapi.base.CallbackType;
import com.tencent.p014mm.plugin.magicbrush.jsapi.base.RequestType;
import e42.C7596h;
import e42.C7597n;
import e42.C86430i;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;
import s42.C90130d;
import x20.C15618a;

/* renamed from: s42.b */
public final class C90127b<MainProcessTask extends C90130d> extends C86430i<C7597n> {

    /* renamed from: d */
    public final Class<MainProcessTask> f258818d;

    /* renamed from: e */
    public String f258819e;

    /* renamed from: s42.b$a */
    public static final class C90128a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C90127b<MainProcessTask> f258820d;

        public C90128a(C90127b<MainProcessTask> bVar) {
            this.f258820d = bVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            CallbackType callbackType = (CallbackType) obj;
            if (callbackType instanceof CallbackType.Event) {
                C7597n nVar = (C7597n) this.f258820d.f251227a;
                if (nVar != null) {
                    nVar.mo8722f0(((CallbackType.Event) callbackType).f248432d);
                }
            } else if (callbackType instanceof CallbackType.FinalCallback) {
                C32226l<C7596h, C13598b0> p = this.f258820d.mo120840p();
                String str = ((CallbackType.FinalCallback) callbackType).f248433d.f10315d;
                C87412m.m108593f(str, "it.callbackStr.value");
                p.invoke(new C7596h(str));
            }
        }
    }

    public C90127b(Class<MainProcessTask> cls) {
        C87412m.m108594g(cls, "taskClass");
        this.f258818d = cls;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if ((r0.length() > 0) != false) goto L_0x002c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo16e() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f258819e
            if (r0 != 0) goto L_0x0031
            java.lang.Class<MainProcessTask> r0 = r3.f258818d
            java.lang.Class<s42.a> r1 = s42.C90126a.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            s42.a r0 = (s42.C90126a) r0
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.name()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r3.f258819e = r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002b
            gy3.C87412m.m108591d(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            junit.framework.Assert.assertTrue(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0031:
            java.lang.String r0 = r3.f258819e
            gy3.C87412m.m108591d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s42.C90127b.mo16e():java.lang.String");
    }

    /* renamed from: o */
    public C86430i<C7597n> mo71237o() {
        C90127b newInstance = C90127b.class.getConstructor(new Class[]{Class.class}).newInstance(new Object[]{this.f258818d});
        C87412m.m108593f(newInstance, "javaClass.getConstructor…a).newInstance(taskClass)");
        return newInstance;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        C90130d dVar = (C90130d) this.f258818d.newInstance();
        RequestType requestType = new RequestType(new IPCString(mo16e()), new IPCString(hVar.toString()));
        C87412m.m108593f(dVar, "instance");
        C15618a.m14626b(requestType, dVar, new C90128a(this));
    }
}
