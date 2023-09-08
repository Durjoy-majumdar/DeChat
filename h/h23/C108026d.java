package h23;

import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.p014mm.plugin.vlog.model.C96557v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei2.C58605a;
import ei2.C97649d;
import ei2.C97652g;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g23.C107701f;
import g23.C107706i;
import g23.C107709l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: h23.d */
public final class C108026d {

    /* renamed from: a */
    public final Surface f323496a;

    /* renamed from: b */
    public final C32227p<Long, Integer, C13598b0> f323497b;

    /* renamed from: c */
    public final C32226l<Long, C13598b0> f323498c;

    /* renamed from: d */
    public final C107701f f323499d;

    /* renamed from: e */
    public volatile int f323500e;

    /* renamed from: f */
    public C58605a f323501f;

    /* renamed from: g */
    public long f323502g = -1;

    /* renamed from: h */
    public C97652g f323503h;

    /* renamed from: i */
    public boolean f323504i;

    /* renamed from: j */
    public final C32226l<Long, Bitmap> f323505j = new C98314c(this);

    /* renamed from: h23.d$b */
    public static final class C98313b extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108026d f288169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98313b(C108026d dVar) {
            super(1);
            this.f288169d = dVar;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            Log.m105924i("MicroMsg.VLogDecoder", "onDecodeEnd");
            C32226l<Long, C13598b0> lVar = this.f288169d.f323498c;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(longValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h23.d$c */
    public static final class C98314c extends C87413o implements C32226l<Long, Bitmap> {

        /* renamed from: d */
        public final /* synthetic */ C108026d f288170d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98314c(C108026d dVar) {
            super(1);
            this.f288170d = dVar;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            Log.m105924i("MicroMsg.VLogDecoder", "get bitmap " + longValue);
            while (true) {
                C108026d dVar = this.f288170d;
                if (longValue <= dVar.f323502g) {
                    break;
                }
                C97652g gVar = dVar.f323503h;
                if (gVar != null) {
                    C58605a a = gVar.mo126334a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("get frame ");
                    sb.append(a != null ? Long.valueOf(a.f167793b) : null);
                    sb.append(" blendBitmapProvider: ");
                    sb.append(longValue);
                    Log.m105924i("MicroMsg.VLogDecoder", sb.toString());
                    if (a == null) {
                        break;
                    }
                    long j = a.f167793b;
                    if (j <= 0) {
                        break;
                    }
                    C108026d dVar2 = this.f288170d;
                    dVar2.f323502g += j;
                    dVar2.f323501f = a;
                } else {
                    C87412m.m108603p("frameRetriever");
                    throw null;
                }
            }
            C58605a aVar = this.f288170d.f323501f;
            if (aVar != null) {
                return aVar.f167792a;
            }
            return null;
        }
    }

    /* renamed from: h23.d$a */
    public static final class C108027a extends C87413o implements C32227p<Long, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108026d f323506d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108027a(C108026d dVar) {
            super(2);
            this.f323506d = dVar;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            ((Number) obj2).longValue();
            C32227p<Long, Integer, C13598b0> pVar = this.f323506d.f323497b;
            if (pVar != null) {
                Long valueOf = Long.valueOf(longValue);
                C108026d dVar = this.f323506d;
                int i = dVar.f323500e;
                dVar.f323500e = i + 1;
                pVar.invoke(valueOf, Integer.valueOf(i));
            }
            C108026d dVar2 = this.f323506d;
            C107701f.m145877a(dVar2.f323499d, (Bitmap) ((C98314c) dVar2.f323505j).invoke(Long.valueOf(longValue)), this.f323506d.f323504i, (C32224a) null, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C108026d(Surface surface, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, C96557v0 v0Var, C32227p<? super Long, ? super Integer, C13598b0> pVar, C32226l<? super Long, C13598b0> lVar) {
        Surface surface2 = surface;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i15 = i4;
        float f3 = f;
        float f4 = f2;
        C96557v0 v0Var2 = v0Var;
        C87412m.m108594g(surface2, "surface");
        C87412m.m108594g(v0Var2, "scriptModel");
        this.f323496a = surface2;
        this.f323497b = pVar;
        this.f323498c = lVar;
        C107701f fVar = new C107701f(i7, i8, false, false);
        fVar.f322244k = f3;
        fVar.f322245l = f4;
        fVar.f322249p = i9;
        fVar.f322250q = i15;
        Log.m105924i("MicroMsg.VLogDirector", "create VLogDirector, scale:[" + f3 + ", " + f4 + "], texture:[" + i9 + ", " + i15 + ']');
        this.f323499d = fVar;
        C107709l lVar2 = new C107709l(i7, i8);
        lVar2.f322276h = i9;
        lVar2.f322277i = i15;
        Log.m105924i("MicroMsg.VLog.VLogRemuxSurface", "create VLogRemuxSurface, surface:[" + i7 + ", " + i8 + "], texture:[" + i9 + ", " + i15 + ']');
        C107706i iVar = C107706i.f322258a;
        Log.m105924i("MicroMsg.VLogMaterialsInfoCache", "clearCache");
        C107706i.f322259b.clear();
        lVar2.mo158115a(surface2);
        fVar.mo158112e(lVar2);
        fVar.mo158110c(30, 30);
        fVar.mo158111d(v0Var2, i5, "");
        C108027a aVar = new C108027a(this);
        C98313b bVar = new C98313b(this);
        Log.m105924i("MicroMsg.VLogDirector", "setCallback");
        fVar.f322241h = aVar;
        fVar.f322242i = bVar;
        C97652g gVar = new C97652g(new C97649d(v0Var2.f282617g, v0Var2.f282618h, v0Var2.f282615e, i, i2, i, i2, 0, true, (String) null, 512, (C8480h) null));
        this.f323503h = gVar;
        gVar.mo136912e();
    }
}
