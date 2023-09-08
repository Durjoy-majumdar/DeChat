package s80;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import javax.microedition.khronos.opengles.GL10;
import v80.C111412a;

/* renamed from: s80.c */
public abstract class C110780c extends C110777a {
    public C110780c(int i, int i2) {
        super(0, 0, 0, 0, i, i2);
    }

    public void onDrawFrame(GL10 gl10) {
        try {
            C111412a.f333531a.mo163073a(true);
            SurfaceTexture surfaceTexture = this.f331384i;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Media.AbsSurfaceRenderer", e, "updateTexImage error", new Object[0]);
        }
        if (this.f331386k) {
            this.f331386k = false;
        } else {
            super.onDrawFrame(gl10);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C110780c(int i, int i2, int i3, C8480h hVar) {
        this(i, (i3 & 2) != 0 ? 2 : i2);
    }
}
