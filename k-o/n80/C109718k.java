package n80;

import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import u80.C111145g;
import w80.C111742d;

/* renamed from: n80.k */
public final class C109718k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109715i f328416d;

    /* renamed from: e */
    public final /* synthetic */ ImageReader f328417e;

    /* renamed from: f */
    public final /* synthetic */ C111742d.C65942b f328418f;

    /* renamed from: g */
    public final /* synthetic */ int f328419g;

    /* renamed from: h */
    public final /* synthetic */ int f328420h;

    /* renamed from: i */
    public final /* synthetic */ int f328421i;

    public C109718k(C109715i iVar, ImageReader imageReader, C111742d.C65942b bVar, int i, int i2, int i3) {
        this.f328416d = iVar;
        this.f328417e = imageReader;
        this.f328418f = bVar;
        this.f328419g = i;
        this.f328420h = i2;
        this.f328421i = i3;
    }

    public final void run() {
        this.f328416d.f328405i = C111742d.C111743a.m152352k(C111742d.f334647a, this.f328417e.getSurface(), (SurfaceTexture) null, 0, 0, this.f328418f.f189593c, 14, (Object) null);
        this.f328416d.f328404h = new C111145g(0, 0, 0, 0, 1, 15, (C8480h) null);
        C109715i iVar = this.f328416d;
        C111145g gVar = iVar.f328404h;
        if (gVar != null) {
            gVar.mo158522s(iVar.f328406j, iVar.f328407k);
        }
        C111145g gVar2 = this.f328416d.f328404h;
        if (gVar2 != null) {
            gVar2.f332852T = this.f328419g;
        }
        if (gVar2 != null) {
            gVar2.mo143263u(this.f328420h, this.f328421i);
        }
        Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "create rgb2yuvEGLEnvironment:" + this.f328416d.f328405i + ", shareEGLContext:" + this.f328418f.f189593c + ", texId:" + this.f328419g + ", texSize:[" + this.f328420h + ", " + this.f328421i + ']');
    }
}
