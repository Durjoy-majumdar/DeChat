package mt3;

import android.content.Context;
import android.os.Build;
import mt3.C21527b;
import mt3.C21535d;
import ot3.C21881e;

/* renamed from: mt3.a */
public class C21526a extends C21535d.C21536a {

    /* renamed from: a */
    public boolean f60985a = false;

    /* renamed from: b */
    public final /* synthetic */ C21527b.C21529b f60986b;

    /* renamed from: c */
    public final /* synthetic */ Context f60987c;

    public C21526a(C21527b.C21529b bVar, Context context) {
        this.f60986b = bVar;
        this.f60987c = context;
    }

    /* renamed from: a */
    public void mo33735a(int i, CharSequence charSequence) {
        C21881e.m25082a("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationError", new Object[0]);
        if (!this.f60985a) {
            boolean z = true;
            this.f60985a = true;
            if (i == 5) {
                C21881e.m25084c("Soter.FingerprintManagerCompat", "soter: user cancelled fingerprint authen", new Object[0]);
                this.f60986b.mo33739a();
            } else if (i == 7) {
                C21881e.m25084c("Soter.FingerprintManagerCompat", "soter: system call too many trial.", new Object[0]);
                if (!C21538e.m24415b(this.f60987c) && !C21538e.m24416c(this.f60987c)) {
                    if (Build.VERSION.SDK_INT < 23) {
                        z = false;
                    }
                    if (!z) {
                        Context context = this.f60987c;
                        C21538e.m24417d(context, 6);
                        C21538e.m24418e(context, System.currentTimeMillis());
                    }
                }
                this.f60985a = false;
                mo33735a(10308, "Too many failed times");
            } else {
                this.f60986b.mo33740b(i, charSequence);
            }
        }
    }
}
