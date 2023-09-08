package m03;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.plugin.thumbplayer.view.MMMvVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d03.C58010a;
import fy3.C32226l;
import gy3.C87413o;
import j03.C60695a;
import j03.C60700d;
import rx3.C13598b0;

/* renamed from: m03.f */
public final class C109457f extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MMMvVideoLayout f327621d;

    /* renamed from: e */
    public final /* synthetic */ C60700d f327622e;

    /* renamed from: f */
    public final /* synthetic */ long f327623f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109457f(MMMvVideoLayout mMMvVideoLayout, C60700d dVar, long j) {
        super(1);
        this.f327621d = mMMvVideoLayout;
        this.f327622e = dVar;
        this.f327623f = j;
    }

    public Object invoke(Object obj) {
        C58010a aVar;
        C58010a aVar2;
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        String str = this.f327621d.f316355d;
        StringBuilder sb = new StringBuilder();
        sb.append("recreatePlayerSurface create surface finished:");
        sb.append(surfaceTexture != null ? surfaceTexture.hashCode() : 0);
        Log.m105924i(str, sb.toString());
        MMMvVideoLayout mMMvVideoLayout = this.f327621d;
        mMMvVideoLayout.f316367s = surfaceTexture;
        C60700d dVar = this.f327622e;
        int i = (dVar == null || (aVar2 = dVar.f172873d) == null) ? 0 : aVar2.f165950v;
        int i2 = (dVar == null || (aVar = dVar.f172873d) == null) ? 0 : aVar.f165951w;
        String str2 = mMMvVideoLayout.f316355d;
        Log.m105924i(str2, "recreatePlayerSurface defaultBufferSize:[" + i + ',' + i2 + ']');
        SurfaceTexture surfaceTexture2 = this.f327621d.f316367s;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setDefaultBufferSize(i, i2);
        }
        this.f327621d.f316368t = new Surface(this.f327621d.f316367s);
        String str3 = this.f327621d.f316355d;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("recreatePlayerSurface create playerSurface:");
        Surface surface = this.f327621d.f316368t;
        sb4.append(surface != null ? surface.hashCode() : 0);
        sb4.append(", cost:");
        sb4.append(Util.ticksToNow(this.f327623f));
        Log.m105924i(str3, sb4.toString());
        C60700d dVar2 = this.f327622e;
        if (dVar2 != null) {
            C60695a.C60696a.m71000c(dVar2, this.f327621d.f316368t, false, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
