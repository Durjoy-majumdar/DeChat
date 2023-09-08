package n50;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import s50.C63714v;
import s50.C63722z;

/* renamed from: n50.e */
public class C61627e implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final /* synthetic */ C63714v f175259d;

    public C61627e(C61623d dVar, C63714v vVar) {
        this.f175259d = vVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureAvailable, size:[%s, %s]", Integer.valueOf(i), Integer.valueOf(i2));
        this.f175259d.mo88556b(new Surface(surfaceTexture));
        this.f175259d.mo88557c(i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureDestroyed");
        C63714v vVar = this.f175259d;
        vVar.getClass();
        vVar.mo88555a(new C63722z(vVar));
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureSizeChanged, size:[%s, %s]", Integer.valueOf(i), Integer.valueOf(i2));
        this.f175259d.mo88557c(i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
