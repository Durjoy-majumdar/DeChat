package nm0;

import fy3.C32227p;
import gy3.C87412m;
import hp3.C87581a;
import k40.C9562a;
import lp3.C88629c;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import p224ra.C89909e;
import p963fc.C86812g;
import rx3.C13598b0;
import te3.C50600nv3;
import te3.C50740ov3;
import zp0.C16377l;
import zp0.C91829i;

/* renamed from: nm0.b */
public final class C89020b {

    /* renamed from: a */
    public C88629c<C50740ov3> f256623a;

    /* renamed from: b */
    public final C50600nv3 f256624b = new C50600nv3();

    /* renamed from: nm0.b$a */
    public static final class C89021a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public static final C89021a<_Ret, _Var> f256625a = new C89021a<>();

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C88643g.m110544b().mo72091a(new C91829i(C91829i.C91830a.SEND, 0, (String) null));
            return null;
        }
    }

    /* renamed from: nm0.b$b */
    public static final class C89022b<T> implements C88631d.C88632b {

        /* renamed from: a */
        public final /* synthetic */ C32227p<Boolean, C91829i, C13598b0> f256626a;

        public C89022b(C32227p<? super Boolean, ? super C91829i, C13598b0> pVar) {
            this.f256626a = pVar;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            C50740ov3 ov32 = (C50740ov3) obj;
            this.f256626a.invoke(Boolean.TRUE, null);
        }
    }

    /* renamed from: nm0.b$c */
    public static final class C89023c<T> implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ C32227p<Boolean, C91829i, C13598b0> f256627a;

        public C89023c(C32227p<? super Boolean, ? super C91829i, C13598b0> pVar) {
            this.f256627a = pVar;
        }

        /* renamed from: a */
        public final void mo1720a(Object obj) {
            if (obj instanceof C91829i) {
                this.f256627a.invoke(Boolean.FALSE, obj);
            } else if (obj instanceof Throwable) {
                this.f256627a.invoke(Boolean.FALSE, new C91829i(C91829i.C91830a.SEND, 0, ((Throwable) obj).getMessage()));
            } else {
                this.f256627a.invoke(Boolean.FALSE, new C91829i(C91829i.C91830a.SEND, 0, obj != null ? obj.toString() : null));
            }
        }
    }

    /* renamed from: a */
    public final void mo123390a(C86812g gVar, C32227p<? super Boolean, ? super C91829i, C13598b0> pVar) {
        C88629c<C50740ov3> cVar;
        Class<C50740ov3> cls = C50740ov3.class;
        Class cls2 = C16377l.class;
        C87412m.m108594g(pVar, "callback");
        synchronized (this) {
            if (this.f256623a == null) {
                if (gVar != null) {
                    C9562a R0 = gVar.mo113027R0(cls2);
                    C87412m.m108591d(R0);
                    cVar = ((C16377l) R0).mo14840YQ("/cgi-bin/mmbiz-bin/wxartrappsvr/route", gVar.f238147j, this.f256624b, cls);
                    C87412m.m108593f(cVar, "{\n                      …va)\n                    }");
                } else {
                    C16377l lVar = (C16377l) C89909e.m112436a(cls2);
                    cVar = lVar != null ? lVar.mo14840YQ("/cgi-bin/mmbiz-bin/wxartrappsvr/route", (String) null, this.f256624b, cls) : null;
                    if (cVar == null) {
                        cVar = ((C88633e) C88643g.m110546d()).mo123064p(C89021a.f256625a);
                        C87412m.m108593f(cVar, "pipeline().`$logic` {\n  …                        }");
                    }
                }
                this.f256623a = cVar;
                cVar.mo114038a(new C89022b(pVar)).mo123065b(new C89023c(pVar));
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
