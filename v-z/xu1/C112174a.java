package xu1;

import android.graphics.SurfaceTexture;
import android.util.Size;
import com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h43.C108077f0;
import java.util.ArrayList;
import java.util.List;
import l33.C109247e;
import p1042u.C111057f;
import p172io.flutter.view.TextureRegistry;
import rx3.C13598b0;
import uu1.C111223c;
import uu1.C111224d;
import uu1.C111225e;
import uu1.e$$c;
import yu1.C112489b;
import z33.C112595h;
import zu1.C112686a;

/* renamed from: xu1.a */
public final class C112174a implements C111224d {

    /* renamed from: a */
    public final TextureRegistry f335876a;

    /* renamed from: b */
    public final String f335877b = "MicroMsg.FlutterTextureMgr";

    /* renamed from: c */
    public final C111057f<C112177c> f335878c = new C111057f<>();

    /* renamed from: d */
    public final List<TextureRegistry.SurfaceTextureEntry> f335879d = new ArrayList();

    /* renamed from: e */
    public C111223c f335880e;

    /* renamed from: f */
    public C111223c f335881f;

    /* renamed from: xu1.a$a */
    public static final class C112175a extends C87413o implements C32227p<Size, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111223c f335882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112175a(C111223c cVar) {
            super(2);
            this.f335882d = cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Size size = (Size) obj;
            Integer num = (Integer) obj2;
            C112489b bVar = C112489b.f336867d;
            C111223c cVar = this.f335882d;
            C87412m.m108591d(cVar);
            int width = size.getWidth();
            int height = size.getHeight();
            C87412m.m108593f(num, "orientation");
            bVar.mo164235Q(cVar, width, height, num.intValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xu1.a$b */
    public static final class C112176b extends C87413o implements C32227p<Size, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111223c f335883d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112176b(C111223c cVar) {
            super(2);
            this.f335883d = cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Size size = (Size) obj;
            Integer num = (Integer) obj2;
            C112489b bVar = C112489b.f336867d;
            C111223c cVar = this.f335883d;
            C87412m.m108591d(cVar);
            int width = size.getWidth();
            int height = size.getHeight();
            C87412m.m108593f(num, "orientation");
            bVar.mo164235Q(cVar, width, height, num.intValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xu1.a$c */
    public static final class C112177c {

        /* renamed from: a */
        public final long f335884a;

        /* renamed from: b */
        public final TextureRegistry.SurfaceTextureEntry f335885b;

        /* renamed from: c */
        public final C112686a f335886c;

        /* renamed from: d */
        public int f335887d;

        /* renamed from: e */
        public int f335888e;

        /* renamed from: f */
        public int f335889f;

        public C112177c(long j, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, C112686a aVar, int i, int i2, int i3, int i4, C8480h hVar) {
            i = (i4 & 8) != 0 ? 0 : i;
            i2 = (i4 & 16) != 0 ? 0 : i2;
            i3 = (i4 & 32) != 0 ? 0 : i3;
            C87412m.m108594g(surfaceTextureEntry, "flutterTexture");
            C87412m.m108594g(aVar, "voipSurfaceTexture");
            this.f335884a = j;
            this.f335885b = surfaceTextureEntry;
            this.f335886c = aVar;
            this.f335887d = i;
            this.f335888e = i2;
            this.f335889f = i3;
        }
    }

    /* renamed from: xu1.a$d */
    public static final class C112178d extends C87413o implements C32227p<Size, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112177c f335890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112178d(C112177c cVar) {
            super(2);
            this.f335890d = cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Size size = (Size) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(size, "size");
            C112489b.f336867d.mo164236S(this.f335890d, size.getWidth(), size.getHeight(), intValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xu1.a$e */
    public static final class C112179e extends C87413o implements C32227p<Size, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112177c f335891d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112179e(C112177c cVar) {
            super(2);
            this.f335891d = cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Size size = (Size) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(size, "size");
            C112489b.f336867d.mo164236S(this.f335891d, size.getWidth(), size.getHeight(), intValue);
            return C13598b0.f38549a;
        }
    }

    public C112174a(TextureRegistry textureRegistry) {
        C87412m.m108594g(textureRegistry, "registry");
        this.f335876a = textureRegistry;
        if (C112595h.f337171f) {
            Log.m105924i("MicroMsg.FlutterTextureMgr", hashCode() + " offer surface use create");
            C112177c c = mo163977c();
            this.f335880e = new C111223c(c.f335884a, c.f335885b, new C111225e(c.f335886c.f337403d), 0, 0);
            C112177c c2 = mo163977c();
            this.f335881f = new C111223c(c2.f335884a, c2.f335885b, new C111225e(c2.f335886c.f337403d), 0, 0);
            C111223c cVar = this.f335880e;
            C111225e eVar = null;
            C111225e eVar2 = cVar != null ? cVar.f333050c : null;
            if (eVar2 != null) {
                eVar2.f333056f = new C112175a(cVar);
            }
            C111223c cVar2 = this.f335881f;
            eVar = cVar2 != null ? cVar2.f333050c : eVar;
            if (eVar != null) {
                eVar.f333056f = new C112176b(cVar2);
            }
            C108077f0 f0Var = C109247e.xx0().f317331F;
            if (f0Var != null) {
                f0Var.f323665y = this;
            }
        }
    }

    /* renamed from: a */
    public C111223c mo162971a() {
        return this.f335880e;
    }

    /* renamed from: b */
    public C111223c mo162972b() {
        return this.f335881f;
    }

    /* renamed from: c */
    public final C112177c mo163977c() {
        TextureRegistry.SurfaceTextureEntry createSurfaceTexture = this.f335876a.createSurfaceTexture();
        SurfaceTexture surfaceTexture = createSurfaceTexture.surfaceTexture();
        C87412m.m108593f(surfaceTexture, "flutterTexture.surfaceTexture()");
        return new C112177c(createSurfaceTexture.mo159349id(), createSurfaceTexture, new C112686a(surfaceTexture), 0, 0, 0, 56, (C8480h) null);
    }

    /* renamed from: d */
    public final void mo163978d() {
        C111225e eVar;
        e$$c e__c;
        C111225e eVar2;
        e$$c e__c2;
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry2;
        String str = this.f335877b;
        Log.m105924i(str, hashCode() + " release all textures");
        if (C112595h.f337171f) {
            C111223c cVar = this.f335880e;
            if (!(cVar == null || (surfaceTextureEntry2 = cVar.f333049b) == null)) {
                ((ArrayList) this.f335879d).add(surfaceTextureEntry2);
            }
            C111223c cVar2 = this.f335881f;
            if (!(cVar2 == null || (surfaceTextureEntry = cVar2.f333049b) == null)) {
                ((ArrayList) this.f335879d).add(surfaceTextureEntry);
            }
            C111223c cVar3 = this.f335880e;
            C111225e eVar3 = cVar3 != null ? cVar3.f333050c : null;
            if (eVar3 != null) {
                eVar3.f333056f = null;
            }
            if (!(cVar3 == null || (eVar2 = cVar3.f333050c) == null || (e__c2 = eVar2.f333055e) == null)) {
                e__c2.mo158516b();
            }
            C111223c cVar4 = this.f335881f;
            C111225e eVar4 = cVar4 != null ? cVar4.f333050c : null;
            if (eVar4 != null) {
                eVar4.f333056f = null;
            }
            if (cVar4 != null && (eVar = cVar4.f333050c) != null && (e__c = eVar.f333055e) != null) {
                e__c.mo158516b();
                return;
            }
            return;
        }
        int f = this.f335878c.mo162757f();
        for (int i = 0; i < f; i++) {
            C112177c g = this.f335878c.mo162758g(i);
            C112686a aVar = g.f335886c;
            aVar.f337405f = null;
            C112686a.C112688b bVar = aVar.f337404e;
            if (bVar != null) {
                bVar.mo150005b();
            }
            ((ArrayList) this.f335879d).add(g.f335885b);
        }
        this.f335878c.clear();
    }

    /* renamed from: e */
    public final void mo163979e(FlutterVoipMgr flutterVoipMgr) {
        C87412m.m108594g(flutterVoipMgr, "flutterVoipMgr");
        Log.m105924i(this.f335877b, "warm up");
        if (this.f335878c.mo162757f() >= 2) {
            Log.m105924i(this.f335877b, "texturePool size >= 2, skip warm up");
            return;
        }
        C112177c c = mo163977c();
        this.f335878c.mo162756e(c.f335884a, c);
        String str = this.f335877b;
        Log.m105924i(str, "create flutter texture: " + c.f335884a + ", surfaceTexture:" + c.f335886c.f337403d);
        C112686a aVar = c.f335886c;
        C87412m.m108594g(aVar, "surfaceTexture");
        Log.m105924i("MicroMsg.FlutterVoipMgr", "addCameraRenderSurfaceTexture " + aVar.f337403d);
        flutterVoipMgr.f313168m1 = aVar;
        flutterVoipMgr.f313166k1 = false;
        flutterVoipMgr.mo149995f1();
        c.f335886c.f337405f = new C112178d(c);
        Log.m105924i(this.f335877b, "warm up local camera texture");
        C112177c c2 = mo163977c();
        this.f335878c.mo162756e(c2.f335884a, c2);
        C112686a aVar2 = c2.f335886c;
        C87412m.m108594g(aVar2, "surfaceTexture");
        Log.m105924i("MicroMsg.FlutterVoipMgr", "addCameraRenderSurfaceTexture " + aVar2.f337403d);
        flutterVoipMgr.f313169n1 = aVar2;
        flutterVoipMgr.f313167l1 = false;
        flutterVoipMgr.mo149995f1();
        c2.f335886c.f337405f = new C112179e(c2);
        Log.m105924i(this.f335877b, "warm up remote camera texture");
    }
}
