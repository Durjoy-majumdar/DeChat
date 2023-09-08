package p337f8;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import p404z6.C91618d;

/* renamed from: f8.l */
public interface C20694l {

    /* renamed from: f8.l$a */
    public static final class C20695a {

        /* renamed from: a */
        public final Handler f58508a;

        /* renamed from: b */
        public final C20694l f58509b;

        public C20695a(Handler handler, C20694l lVar) {
            if (lVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f58508a = handler;
            this.f58509b = lVar;
        }
    }

    /* renamed from: a */
    void mo32402a(int i, int i2, int i3, float f);

    /* renamed from: c */
    void mo32403c(int i, long j);

    /* renamed from: f */
    void mo32404f(Surface surface);

    /* renamed from: i */
    void mo32405i(C91618d dVar);

    /* renamed from: p */
    void mo32406p(String str, long j, long j2);

    /* renamed from: q */
    void mo32407q(Format format);

    /* renamed from: r */
    void mo32408r(C91618d dVar);
}
