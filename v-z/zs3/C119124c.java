package zs3;

import android.content.Context;
import at3.C113071d;

/* renamed from: zs3.c */
public class C119124c {

    /* renamed from: a */
    public int f356765a;

    /* renamed from: b */
    public int f356766b;

    /* renamed from: c */
    public long f356767c;

    /* renamed from: d */
    public Context f356768d;

    /* renamed from: zs3.c$b */
    public static final class C119126b {

        /* renamed from: a */
        public int f356769a = 0;

        /* renamed from: b */
        public int f356770b = 0;

        /* renamed from: c */
        public long f356771c = (C113071d.f338456a * 12);

        /* renamed from: d */
        public Context f356772d;

        public C119126b(Context context, int i, int i2, C119125a aVar) {
            if (i > -1) {
                this.f356772d = context.getApplicationContext();
                this.f356769a = i;
                this.f356770b = i2;
                return;
            }
            throw new IllegalArgumentException("scenes invalid: " + i);
        }
    }

    public C119124c(C119126b bVar, C119125a aVar) {
        bVar.getClass();
        this.f356765a = bVar.f356769a;
        this.f356766b = bVar.f356770b;
        this.f356767c = bVar.f356771c;
        this.f356768d = bVar.f356772d;
    }
}
