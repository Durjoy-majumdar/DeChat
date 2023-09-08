package zu1;

import android.graphics.SurfaceTexture;
import android.util.Size;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54219z;
import fy3.C32227p;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: zu1.a */
public final class C112686a implements C0125s {

    /* renamed from: d */
    public final SurfaceTexture f337403d;

    /* renamed from: e */
    public C112688b f337404e;

    /* renamed from: f */
    public C32227p<? super Size, ? super Integer, C13598b0> f337405f;

    /* renamed from: g */
    public final C103766u f337406g = new C103766u(this);

    /* renamed from: zu1.a$a */
    public static final class C112687a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C112686a f337407d;

        public C112687a(C112686a aVar) {
            this.f337407d = aVar;
        }

        public void onChanged(Object obj) {
            C112688b bVar;
            Size size = (Size) obj;
            if (size != null && (bVar = this.f337407d.f337404e) != null) {
                bVar.mo150004a(size.getWidth(), size.getHeight());
            }
        }
    }

    /* renamed from: zu1.a$b */
    public interface C112688b {
        /* renamed from: a */
        void mo150004a(int i, int i2);

        /* renamed from: b */
        void mo150005b();
    }

    public C112686a(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "st");
        this.f337403d = surfaceTexture;
        new C54219z().observe(this, new C112687a(this));
    }

    public C39623j getLifecycle() {
        return this.f337406g;
    }
}
