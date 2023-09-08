package mt3;

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import lt3.C21460a;
import mt3.C21535d;
import ot3.C21881e;

@Deprecated
/* renamed from: mt3.b */
public class C21527b {

    /* renamed from: b */
    public static final C21532e f60988b;

    /* renamed from: a */
    public Context f60989a;

    /* renamed from: mt3.b$a */
    public static class C21528a implements C21532e {
        /* renamed from: c */
        public static boolean m24397c(C21535d.C21536a aVar, Context context) {
            if (Build.VERSION.SDK_INT >= 23) {
                C21881e.m25086e("Soter.FingerprintManagerCompat", "soter: using system anti brute force strategy", new Object[0]);
            } else if (C21538e.m24416c(context)) {
                if (!C21538e.m24415b(context)) {
                    C21881e.m25086e("Soter.FingerprintManagerCompat", "soter: unfreeze former frozen status", new Object[0]);
                    C21538e.m24418e(context, -1);
                    C21538e.m24417d(context, 0);
                }
            } else if (C21538e.m24415b(context)) {
                C21881e.m25086e("Soter.FingerprintManagerCompat", "soter: failure time available", new Object[0]);
            } else {
                C21881e.m25087f("Soter.FingerprintManagerCompat", "soter: too many fail fingerprint callback. inform it.", new Object[0]);
                aVar.mo33735a(10308, "Too many failed times");
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo33736a(Context context, C21531d dVar, int i, CancellationSignal cancellationSignal, C21529b bVar, Handler handler) {
            C21535d.C21537b bVar2 = null;
            if (dVar != null) {
                Cipher cipher = dVar.f60991b;
                if (cipher != null) {
                    bVar2 = new C21535d.C21537b(cipher);
                } else {
                    Signature signature = dVar.f60990a;
                    if (signature != null) {
                        bVar2 = new C21535d.C21537b(signature);
                    } else {
                        Mac mac = dVar.f60992c;
                        if (mac != null) {
                            bVar2 = new C21535d.C21537b(mac);
                        }
                    }
                }
            }
            C21535d.m24409a(context, bVar2, i, cancellationSignal, new C21526a(bVar, context), handler);
        }

        /* renamed from: b */
        public boolean mo33737b(Context context) {
            return C21535d.m24411c(context);
        }

        public boolean isHardwareDetected(Context context) {
            return C21535d.m24412d(context);
        }
    }

    /* renamed from: mt3.b$b */
    public static abstract class C21529b {
        /* renamed from: a */
        public abstract void mo33739a();

        /* renamed from: b */
        public abstract void mo33740b(int i, CharSequence charSequence);

        /* renamed from: c */
        public abstract void mo33741c();

        /* renamed from: d */
        public abstract void mo33742d(int i, CharSequence charSequence);

        /* renamed from: e */
        public abstract void mo33743e(C21530c cVar);
    }

    /* renamed from: mt3.b$c */
    public static final class C21530c {
        public C21530c(C21531d dVar) {
        }
    }

    /* renamed from: mt3.b$e */
    public interface C21532e {
        /* renamed from: a */
        void mo33736a(Context context, C21531d dVar, int i, CancellationSignal cancellationSignal, C21529b bVar, Handler handler);

        /* renamed from: b */
        boolean mo33737b(Context context);

        boolean isHardwareDetected(Context context);
    }

    /* renamed from: mt3.b$f */
    public static class C21533f implements C21532e {
        /* renamed from: a */
        public void mo33736a(Context context, C21531d dVar, int i, CancellationSignal cancellationSignal, C21529b bVar, Handler handler) {
        }

        /* renamed from: b */
        public boolean mo33737b(Context context) {
            return false;
        }

        public boolean isHardwareDetected(Context context) {
            return false;
        }
    }

    static {
        if (C21460a.m24278l()) {
            f60988b = new C21528a();
        } else {
            f60988b = new C21533f();
        }
    }

    public C21527b(Context context) {
        this.f60989a = context;
    }

    /* renamed from: mt3.b$d */
    public static class C21531d {

        /* renamed from: a */
        public final Signature f60990a;

        /* renamed from: b */
        public final Cipher f60991b;

        /* renamed from: c */
        public final Mac f60992c;

        public C21531d(Signature signature) {
            this.f60990a = signature;
            this.f60991b = null;
            this.f60992c = null;
        }

        public C21531d(Cipher cipher) {
            this.f60991b = cipher;
            this.f60990a = null;
            this.f60992c = null;
        }

        public C21531d(Mac mac) {
            this.f60992c = mac;
            this.f60991b = null;
            this.f60990a = null;
        }
    }
}
