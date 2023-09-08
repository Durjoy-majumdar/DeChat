package com.tencent.liteav.videoconsumer.renderer;

import android.view.Surface;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.l */
final /* synthetic */ class C17385l implements Runnable {

    /* renamed from: a */
    private final C17383i f47155a;

    /* renamed from: b */
    private final Surface f47156b;

    /* renamed from: c */
    private final int f47157c;

    /* renamed from: d */
    private final int f47158d;

    /* renamed from: e */
    private final boolean f47159e;

    /* renamed from: f */
    private final boolean f47160f;

    private C17385l(C17383i iVar, Surface surface, int i, int i2, boolean z, boolean z2) {
        this.f47155a = iVar;
        this.f47156b = surface;
        this.f47157c = i;
        this.f47158d = i2;
        this.f47159e = z;
        this.f47160f = z2;
    }

    /* renamed from: a */
    public static Runnable m17392a(C17383i iVar, Surface surface, int i, int i2, boolean z, boolean z2) {
        return new C17385l(iVar, surface, i, i2, z, z2);
    }

    public final void run() {
        C17383i iVar = this.f47155a;
        Surface surface = this.f47156b;
        int i = this.f47157c;
        int i2 = this.f47158d;
        boolean z = this.f47159e;
        boolean z2 = this.f47160f;
        LiteavLog.m16902i("VideoRenderer", "onSurfaceChanged %s size: %dx%d, old_surface: %s, isSurfaceFromTextureView: %b", surface, Integer.valueOf(i), Integer.valueOf(i2), iVar.f47132f, Boolean.valueOf(z));
        if (iVar.f47132f == surface) {
            C104507p pVar = iVar.f47133g;
            if (i == pVar.f309736a && i2 == pVar.f309737b) {
                LiteavLog.m16896d("VideoRenderer", "setDisplaySurface same surface!");
                return;
            }
        }
        iVar.mo20475a(surface, i, i2, iVar.f47134h);
        iVar.f47134h = z2;
        iVar.f47135i = z;
    }
}
