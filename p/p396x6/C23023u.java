package p396x6;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p295b8.C16775h;
import p333e8.C20551y;
import p337f8.C20694l;
import p355l7.C21396d;
import p370p7.C21949o;
import p383t7.C22439a;
import p383t7.C22449j;
import p396x6.C22998f;
import p396x6.C23017p;
import p401y6.C23225b;
import p401y6.C23233i;
import p404z6.C91618d;

/* renamed from: x6.u */
public class C23023u implements C22998f {

    /* renamed from: a */
    public final C23019q[] f66191a;

    /* renamed from: b */
    public final C22998f f66192b;

    /* renamed from: c */
    public final C23025b f66193c;

    /* renamed from: d */
    public final CopyOnWriteArraySet<C23026c> f66194d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    public final CopyOnWriteArraySet<C22449j.C22450a> f66195e = new CopyOnWriteArraySet<>();

    /* renamed from: f */
    public final CopyOnWriteArraySet<C21396d.C21397a> f66196f = new CopyOnWriteArraySet<>();

    /* renamed from: g */
    public final int f66197g;

    /* renamed from: h */
    public final int f66198h;

    /* renamed from: i */
    public Surface f66199i;

    /* renamed from: j */
    public boolean f66200j;

    /* renamed from: k */
    public TextureView f66201k;

    /* renamed from: l */
    public C23233i f66202l;

    /* renamed from: m */
    public float f66203m;

    /* renamed from: x6.u$b */
    public final class C23025b implements C20694l, C23233i, C22449j.C22450a, C21396d.C21397a, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        public C23025b(C23024a aVar) {
        }

        /* renamed from: a */
        public void mo32402a(int i, int i2, int i3, float f) {
            Iterator<C23026c> it = C23023u.this.f66194d.iterator();
            while (it.hasNext()) {
                it.next().mo36339a(i, i2, i3, f);
            }
            C23023u.this.getClass();
        }

        /* renamed from: b */
        public void mo33441b(String str, long j, long j2) {
            C23233i iVar = C23023u.this.f66202l;
            if (iVar != null) {
                iVar.mo33441b(str, j, j2);
            }
        }

        /* renamed from: c */
        public void mo32403c(int i, long j) {
            C23023u.this.getClass();
        }

        /* renamed from: d */
        public void mo33471d(List<C22439a> list) {
            Iterator<C22449j.C22450a> it = C23023u.this.f66195e.iterator();
            while (it.hasNext()) {
                it.next().mo33471d(list);
            }
        }

        /* renamed from: e */
        public void mo33443e(int i) {
            C23023u.this.getClass();
            C23233i iVar = C23023u.this.f66202l;
            if (iVar != null) {
                iVar.mo33443e(i);
            }
        }

        /* renamed from: f */
        public void mo32404f(Surface surface) {
            C23023u uVar = C23023u.this;
            if (uVar.f66199i == surface) {
                Iterator<C23026c> it = uVar.f66194d.iterator();
                while (it.hasNext()) {
                    it.next().mo36340b();
                }
            }
            C23023u.this.getClass();
        }

        /* renamed from: g */
        public void mo33444g(Metadata metadata) {
            Iterator<C21396d.C21397a> it = C23023u.this.f66196f.iterator();
            while (it.hasNext()) {
                it.next().mo33444g(metadata);
            }
        }

        /* renamed from: h */
        public void mo33445h(C91618d dVar) {
            C23233i iVar = C23023u.this.f66202l;
            if (iVar != null) {
                iVar.mo33445h(dVar);
            }
            C23023u.this.getClass();
            C23023u.this.getClass();
            C23023u.this.getClass();
        }

        /* renamed from: i */
        public void mo32405i(C91618d dVar) {
            C23023u.this.getClass();
            C23023u.this.getClass();
        }

        /* renamed from: j */
        public void mo33446j(Format format) {
            C23023u.this.getClass();
            C23233i iVar = C23023u.this.f66202l;
            if (iVar != null) {
                iVar.mo33446j(format);
            }
        }

        /* renamed from: n */
        public void mo33450n(C91618d dVar) {
            C23023u.this.getClass();
            C23233i iVar = C23023u.this.f66202l;
            if (iVar != null) {
                iVar.mo33450n(dVar);
            }
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C23023u.this.mo36330o(new Surface(surfaceTexture), true);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C23023u.this.mo36330o((Surface) null, true);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        /* renamed from: p */
        public void mo32406p(String str, long j, long j2) {
            C23023u.this.getClass();
        }

        /* renamed from: q */
        public void mo32407q(Format format) {
            C23023u.this.getClass();
            C23023u.this.getClass();
        }

        /* renamed from: r */
        public void mo32408r(C91618d dVar) {
            C23023u.this.getClass();
            C23023u.this.getClass();
            C23023u.this.getClass();
        }

        /* renamed from: s */
        public void mo33453s(int i, long j, long j2) {
            C23233i iVar = C23023u.this.f66202l;
            if (iVar != null) {
                iVar.mo33453s(i, j, j2);
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C23023u.this.mo36330o(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C23023u.this.mo36330o((Surface) null, false);
        }
    }

    /* renamed from: x6.u$c */
    public interface C23026c {
        /* renamed from: a */
        void mo36339a(int i, int i2, int i3, float f);

        /* renamed from: b */
        void mo36340b();
    }

    public C23023u(C23022t tVar, C16775h hVar, C23012l lVar) {
        C23025b bVar = new C23025b((C23024a) null);
        this.f66193c = bVar;
        C23019q[] a = tVar.mo36259a(new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()), bVar, bVar, bVar, bVar);
        this.f66191a = a;
        int i = 0;
        int i2 = 0;
        for (C23019q j : a) {
            int j2 = j.mo36239j();
            if (j2 == 1) {
                i2++;
            } else if (j2 == 2) {
                i++;
            }
        }
        this.f66197g = i;
        this.f66198h = i2;
        this.f66203m = 1.0f;
        this.f66192b = new C23002g(this.f66191a, hVar, lVar);
    }

    /* renamed from: a */
    public void mo36262a(boolean z) {
        ((C23002g) this.f66192b).mo36262a(z);
    }

    /* renamed from: b */
    public boolean mo36263b() {
        return ((C23002g) this.f66192b).f66093j;
    }

    /* renamed from: c */
    public void mo36264c(C23016o oVar) {
        ((C23002g) this.f66192b).mo36264c(oVar);
    }

    /* renamed from: d */
    public void mo36265d(C23017p.C23018a aVar) {
        ((C23002g) this.f66192b).mo36265d(aVar);
    }

    /* renamed from: e */
    public void mo36260e(C22998f.C23001c... cVarArr) {
        ((C23002g) this.f66192b).mo36260e(cVarArr);
    }

    /* renamed from: f */
    public int mo36266f() {
        return ((C23002g) this.f66192b).f66095l;
    }

    /* renamed from: g */
    public void mo36261g(C22998f.C23001c... cVarArr) {
        ((C23002g) this.f66192b).mo36261g(cVarArr);
    }

    public long getCurrentPosition() {
        return ((C23002g) this.f66192b).getCurrentPosition();
    }

    public long getDuration() {
        return ((C23002g) this.f66192b).getDuration();
    }

    /* renamed from: h */
    public void mo36323h(C23017p.C23018a aVar) {
        ((C23002g) this.f66192b).f66089f.add(aVar);
    }

    /* renamed from: i */
    public int mo36324i() {
        return ((C23002g) this.f66192b).mo36269h();
    }

    /* renamed from: j */
    public void mo36325j(C21949o oVar) {
        ((C23002g) this.f66192b).mo36272k(oVar);
    }

    /* renamed from: k */
    public final void mo36326k() {
        TextureView textureView = this.f66201k;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() == this.f66193c) {
                this.f66201k.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f66201k = null;
        }
    }

    /* renamed from: l */
    public void mo36327l(long j) {
        ((C23002g) this.f66192b).mo36273l(j);
    }

    @Deprecated
    /* renamed from: m */
    public void mo36328m(int i) {
        int i2 = C20551y.f57835a;
        int i3 = 4;
        int i4 = i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 5 ? i != 8 ? 1 : 3 : 5 : 4 : 6 : 13 : 2;
        if (i == 0) {
            i3 = 1;
        } else if (!(i == 1 || i == 2 || i == 4 || i == 5 || i == 8)) {
            i3 = 2;
        }
        C23225b bVar = new C23225b(i3, 0, i4, (C23225b.C23226a) null);
        C22998f.C23001c[] cVarArr = new C22998f.C23001c[this.f66198h];
        int i5 = 0;
        for (C23019q qVar : this.f66191a) {
            if (qVar.mo36239j() == 1) {
                cVarArr[i5] = new C22998f.C23001c(qVar, 3, bVar);
                i5++;
            }
        }
        ((C23002g) this.f66192b).mo36260e(cVarArr);
    }

    /* renamed from: n */
    public void mo36329n(int i) {
        C23002g gVar = (C23002g) this.f66192b;
        if (gVar.f66094k != i) {
            gVar.f66094k = i;
            gVar.f66088e.f66127i.obtainMessage(12, i, 0).sendToTarget();
            Iterator<C23017p.C23018a> it = gVar.f66089f.iterator();
            while (it.hasNext()) {
                it.next().onRepeatModeChanged(i);
            }
        }
    }

    /* renamed from: o */
    public final void mo36330o(Surface surface, boolean z) {
        C22998f.C23001c[] cVarArr = new C22998f.C23001c[this.f66197g];
        int i = 0;
        for (C23019q qVar : this.f66191a) {
            if (qVar.mo36239j() == 2) {
                cVarArr[i] = new C22998f.C23001c(qVar, 1, surface);
                i++;
            }
        }
        Surface surface2 = this.f66199i;
        if (surface2 == null || surface2 == surface) {
            ((C23002g) this.f66192b).mo36260e(cVarArr);
        } else {
            ((C23002g) this.f66192b).mo36261g(cVarArr);
            if (this.f66200j) {
                this.f66199i.release();
            }
        }
        this.f66199i = surface;
        this.f66200j = z;
    }

    /* renamed from: p */
    public void mo36331p(float f) {
        this.f66203m = f;
        C22998f.C23001c[] cVarArr = new C22998f.C23001c[this.f66198h];
        int i = 0;
        for (C23019q qVar : this.f66191a) {
            if (qVar.mo36239j() == 1) {
                cVarArr[i] = new C22998f.C23001c(qVar, 2, Float.valueOf(f));
                i++;
            }
        }
        ((C23002g) this.f66192b).mo36260e(cVarArr);
    }

    public void release() {
        ((C23002g) this.f66192b).release();
        mo36326k();
        Surface surface = this.f66199i;
        if (surface != null) {
            if (this.f66200j) {
                surface.release();
            }
            this.f66199i = null;
        }
    }

    public void stop() {
        ((C23002g) this.f66192b).stop();
    }
}
