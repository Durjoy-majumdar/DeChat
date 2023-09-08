package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C24560g0;
import gy3.C87412m;
import l14.C24950a;
import l14.C24951b;
import l14.C24952d;
import l14.C24954f;
import l14.C88369e;
import n14.C25217e;
import ny3.C25235d;
import o14.C25346c;
import o14.C25348d;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.b */
public abstract class C25421b<T> implements C24951b<T> {
    /* renamed from: b */
    public final void mo51999b(C25350f fVar, T t) {
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        C87412m.m108594g(t, "value");
        C24954f g = mo52660g(fVar, t);
        C24952d dVar = (C24952d) this;
        C25217e eVar = dVar.f71113a;
        C25348d b = fVar.mo52523b(eVar);
        b.mo52502h(dVar.f71113a, 0, g.mo51996a().mo52328j());
        b.mo52505q(dVar.f71113a, 1, g, t);
        b.mo52513a(eVar);
    }

    /* renamed from: d */
    public final T mo51997d(C25349e eVar) {
        T t;
        C87412m.m108594g(eVar, "decoder");
        C24952d dVar = (C24952d) this;
        C25217e eVar2 = dVar.f71113a;
        C25346c b = eVar.mo52515b(eVar2);
        if (b.mo52512m()) {
            t = C25346c.C25347a.m32441a(b, dVar.f71113a, 1, mo52659f(b, b.mo52496r(dVar.f71113a, 0)), (Object) null, 8, (Object) null);
            b.mo52508a(dVar.f71113a);
        } else {
            t = null;
            String str = null;
            while (true) {
                int e = b.mo52510e(dVar.f71113a);
                if (e != -1) {
                    if (e == 0) {
                        str = b.mo52496r(dVar.f71113a, e);
                    } else if (e != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid index in polymorphic deserialization of ");
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(e);
                        throw new C88369e(sb.toString());
                    } else if (str != null) {
                        t = C25346c.C25347a.m32441a(b, dVar.f71113a, e, mo52659f(b, str), (Object) null, 8, (Object) null);
                    } else {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                } else if (t == null) {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + str).toString());
                }
            }
        }
        b.mo52508a(eVar2);
        return t;
    }

    /* renamed from: f */
    public C24950a<? extends T> mo52659f(C25346c cVar, String str) {
        C87412m.m108594g(cVar, "decoder");
        C87412m.m108594g(str, "klassName");
        C24950a<? extends T> a = cVar.mo52509c().mo53061a(mo51998h(), str);
        if (a != null) {
            return a;
        }
        C25235d h = mo51998h();
        throw new C88369e(str + " is not registered for polymorphic serialization in the scope of " + h);
    }

    /* renamed from: g */
    public C24954f<T> mo52660g(C25350f fVar, T t) {
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        C87412m.m108594g(t, "value");
        C24954f<T> b = fVar.mo52524c().mo53062b(mo51998h(), t);
        if (b != null) {
            return b;
        }
        C25235d a = C24560g0.m30725a(t.getClass());
        C25235d h = mo51998h();
        C87412m.m108594g(a, "subClass");
        C87412m.m108594g(h, "baseClass");
        String obj = a.toString();
        throw new C88369e(obj + " is not registered for polymorphic serialization in the scope of " + h);
    }

    /* renamed from: h */
    public abstract C25235d<T> mo51998h();
}
