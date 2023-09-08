package n10;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.flutter.p837ui.FlutterViewEngine;
import gy3.C87412m;
import p172io.flutter.Log;

/* renamed from: n10.c */
public final class C117592c extends C109668a {

    /* renamed from: d */
    public boolean f351812d;

    /* renamed from: e */
    public boolean f351813e;

    /* renamed from: f */
    public final /* synthetic */ FlutterViewEngine f351814f;

    public C117592c(FlutterViewEngine flutterViewEngine) {
        this.f351814f = flutterViewEngine;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m165288i(this.f351814f.f343936w, "onSurfaceTextureAvailable");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        if (!this.f351812d) {
            this.f351814f.mo174309g();
            this.f351812d = true;
        }
        if (this.f351814f.mo174306d() && !this.f351813e) {
            Log.m165288i(this.f351814f.f343936w, "onSurfaceTextureUpdated, try switchToSurfaceView");
            this.f351814f.mo174312j();
            this.f351813e = true;
        }
    }
}
