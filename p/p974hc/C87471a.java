package p974hc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p224ra.C12964b;

/* renamed from: hc.a */
public interface C87471a extends C12964b {

    /* renamed from: hc.a$a */
    public static class C87472a {

        /* renamed from: a */
        public static final C87471a f253470a = new C87473a();

        /* renamed from: hc.a$a$a */
        public class C87473a implements C87471a {

            /* renamed from: hc.a$a$a$a */
            public class C87474a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C87475b f253471d;

                public C87474a(C87473a aVar, C87475b bVar) {
                    this.f253471d = bVar;
                }

                public void run() {
                    this.f253471d.mo114592a((Bitmap) null);
                }
            }

            /* renamed from: Y5 */
            public Drawable mo113356Y5() {
                return null;
            }

            public String Yu0() {
                return null;
            }

            /* renamed from: kg */
            public void mo113358kg(C87475b bVar) {
                MMHandlerThread.postToMainThread(new C87474a(this, bVar));
            }
        }
    }

    /* renamed from: hc.a$b */
    public interface C87475b {
        /* renamed from: a */
        void mo114592a(Bitmap bitmap);
    }

    /* renamed from: Y5 */
    Drawable mo113356Y5();

    String Yu0();

    /* renamed from: kg */
    void mo113358kg(C87475b bVar);
}
