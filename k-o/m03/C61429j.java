package m03;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d03.C58010a;
import fy3.C32226l;
import gy3.C87413o;
import j03.C60695a;
import rx3.C13598b0;

/* renamed from: m03.j */
public final class C61429j extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MMTPVideoLayout f174674d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61429j(MMTPVideoLayout mMTPVideoLayout) {
        super(1);
        this.f174674d = mMTPVideoLayout;
    }

    public Object invoke(Object obj) {
        C58010a o;
        C58010a o2;
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        String str = this.f174674d.f164630d;
        StringBuilder sb = new StringBuilder();
        sb.append("recreatePlayerSurface createVideoTexture finished surface:");
        sb.append(surfaceTexture != null ? surfaceTexture.hashCode() : 0);
        Log.m105924i(str, sb.toString());
        MMTPVideoLayout mMTPVideoLayout = this.f174674d;
        mMTPVideoLayout.f164636j = surfaceTexture;
        mMTPVideoLayout.f164637n = new Surface(this.f174674d.f164636j);
        String str2 = this.f174674d.f164630d;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("recreatePlayerSurface create playerSurface finished surface:");
        Surface surface = this.f174674d.f164637n;
        sb4.append(surface != null ? surface.hashCode() : 0);
        Log.m105924i(str2, sb4.toString());
        C60695a player = this.f174674d.getPlayer();
        int i = (player == null || (o2 = player.mo85621o()) == null) ? 0 : o2.f165950v;
        C60695a player2 = this.f174674d.getPlayer();
        int i2 = (player2 == null || (o = player2.mo85621o()) == null) ? 0 : o.f165951w;
        SurfaceTexture surfaceTexture2 = this.f174674d.f164636j;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setDefaultBufferSize(i, i2);
        }
        String str3 = this.f174674d.f164630d;
        Log.m105924i(str3, "recreatePlayerSurface defaultBufferSize:[" + i + ',' + i2 + ']');
        C60695a player3 = this.f174674d.getPlayer();
        if (player3 != null) {
            C60695a.C60696a.m71000c(player3, this.f174674d.f164637n, false, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
