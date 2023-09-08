package uu1;

import android.graphics.SurfaceTexture;
import android.util.Size;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54219z;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: uu1.e */
public class C111225e implements C0125s {

    /* renamed from: d */
    public SurfaceTexture f333054d;

    /* renamed from: e */
    public e$$c f333055e = null;

    /* renamed from: f */
    public C32227p<Size, Integer, C13598b0> f333056f = null;

    /* renamed from: g */
    public C103766u f333057g = new C103766u(this);

    public C111225e(SurfaceTexture surfaceTexture) {
        C54219z zVar = new C54219z();
        this.f333054d = surfaceTexture;
        zVar.observe(this, new e$$b(this));
    }

    public C39623j getLifecycle() {
        return this.f333057g;
    }
}
