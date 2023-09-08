package p930bb;

import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import gy3.C87412m;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import my3.C61594j;
import p1030s6.C90132b;
import p416qd.C89598h;
import p927ab.C79480e;
import p930bb.C79680d;
import z04.C112550d0;
import z04.C112551y;
import z04.C66731x;

/* renamed from: bb.c */
public class C79679c extends C79680d<C79680d.C79684d> {

    /* renamed from: a */
    public final C79680d.C79684d f233593a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79679c(C79680d.C79684d dVar) {
        super(dVar);
        C87412m.m108594g(dVar, "bufferConfig");
        this.f233593a = dVar;
    }

    /* renamed from: a */
    public String mo109801a() {
        return "NativeBuffer";
    }

    public boolean accept(Object obj) {
        if (obj instanceof String) {
            return C112551y.m153820t((String) obj, "nativebuffer://", false, 2, (Object) null);
        }
        return false;
    }

    /* renamed from: b */
    public C90132b.C90133a mo109803b(Object obj, ImageDecodeConfig imageDecodeConfig) {
        C90132b.C90133a aVar = new C90132b.C90133a();
        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Integer e = C66731x.m78731e(C112550d0.m153790Z(str, new C61594j(15, str.length() - 1)));
        if (e != null) {
            C79480e.C79482b bVar = (C79480e.C79482b) this.f233593a;
            ByteBuffer k1 = (bVar.f233042a.get() != null ? (C83170k) bVar.f233042a.get().mo113047b0().getJsRuntime().mo63321n0(C83170k.class) : null).mo115416k1(e.intValue(), false);
            if (k1 == null) {
                C89598h.f257791a.mo109485w("MicroMsg.AppBrandNativeBufferImageStreamFetcher", "hy: can not found buffer in buffer addon", new Object[0]);
                aVar.f258829b = "Not found native buffer in buffer addon!";
            } else {
                k1.position(0);
                byte[] bArr = new byte[k1.remaining()];
                k1.get(bArr);
                aVar.f258828a = new ByteArrayInputStream(bArr);
            }
        } else {
            C89598h.f257791a.mo109485w("MicroMsg.AppBrandNativeBufferImageStreamFetcher", "hy: not providing int as native buffer key!", new Object[0]);
            aVar.f258829b = "Not invalid native buffer key!";
        }
        return aVar;
    }
}
