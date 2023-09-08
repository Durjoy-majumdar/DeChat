package pu1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tav.decoder.logger.Logger;
import fy3.C32224a;
import gy3.C87412m;
import j03.C60695a;
import java.util.HashMap;
import p172io.flutter.plugin.common.EventChannel;
import p172io.flutter.view.TextureRegistry;
import rr3.C110625c0;
import sp3.C110802e;
import vp3.C111580c;

/* renamed from: pu1.b */
public final class C110251b implements C111580c.C111581a {

    /* renamed from: q */
    public static final /* synthetic */ int f329784q = 0;

    /* renamed from: d */
    public final TextureRegistry.SurfaceTextureEntry f329785d;

    /* renamed from: e */
    public final C110252a f329786e;

    /* renamed from: f */
    public final String f329787f;

    /* renamed from: g */
    public final SurfaceTexture f329788g;

    /* renamed from: h */
    public final long f329789h;

    /* renamed from: i */
    public final C111580c f329790i = new C111580c();

    /* renamed from: j */
    public C62502j f329791j;

    /* renamed from: n */
    public Surface f329792n;

    /* renamed from: o */
    public boolean f329793o;

    /* renamed from: p */
    public HashMap<Long, C110625c0> f329794p = new HashMap<>();

    /* renamed from: pu1.b$a */
    public interface C110252a {
        /* renamed from: a */
        EventChannel.EventSink mo161672a();
    }

    static {
        Logger.setLogProxy(new C110802e());
        Logger.setLevel(2);
    }

    public C110251b(TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, C110252a aVar) {
        C87412m.m108594g(surfaceTextureEntry, "surface");
        C87412m.m108594g(aVar, "eventSinkProvider");
        this.f329785d = surfaceTextureEntry;
        this.f329786e = aVar;
        String str = "MicroMsg.FlutterTPEffectPlayer@" + hashCode();
        this.f329787f = str;
        SurfaceTexture surfaceTexture = surfaceTextureEntry.surfaceTexture();
        C87412m.m108593f(surfaceTexture, "surface.surfaceTexture()");
        this.f329788g = surfaceTexture;
        long id = surfaceTextureEntry.mo159349id();
        this.f329789h = id;
        Log.m105924i(str, "create FlutterTPEffectPlayer,textureId:" + id);
    }

    /* renamed from: a */
    public void mo81095a(SurfaceTexture surfaceTexture) {
        Log.m105924i(this.f329787f, "onSurfaceDestroy");
        this.f329792n = null;
        C62502j jVar = this.f329791j;
        if (jVar != null) {
            jVar.stop();
        }
    }

    /* renamed from: b */
    public void mo81096b(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = this.f329787f;
        Log.m105924i(str, "onSurfaceAvailable size:[" + i + ", " + i2 + ']');
        Surface surface = new Surface(surfaceTexture);
        this.f329792n = surface;
        C62502j jVar = this.f329791j;
        if (jVar != null) {
            jVar.mo85606d(surface, this.f329793o);
        }
    }

    /* renamed from: c */
    public void mo81097c(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: d */
    public final void mo161671d() {
        C62502j jVar = this.f329791j;
        if (jVar != null) {
            jVar.mo85609g();
        }
        C62502j jVar2 = this.f329791j;
        if (jVar2 != null) {
            C60695a.C60696a.m71001d(jVar2, (C32224a) null, 1, (Object) null);
        }
        C62502j jVar3 = this.f329791j;
        if (jVar3 != null) {
            jVar3.stopAsync();
        }
        C62502j jVar4 = this.f329791j;
        if (jVar4 != null) {
            jVar4.recycle();
        }
        this.f329791j = null;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        this.f329791j = new C62502j(context);
    }
}
