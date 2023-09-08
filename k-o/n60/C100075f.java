package n60;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import gy3.C8480h;

/* renamed from: n60.f */
public final class C100075f {

    /* renamed from: a */
    public final boolean f293163a;

    /* renamed from: b */
    public final boolean f293164b;

    /* renamed from: c */
    public final boolean f293165c;

    /* renamed from: d */
    public final String f293166d;

    /* renamed from: e */
    public final C61628b f293167e;

    /* renamed from: f */
    public final int f293168f;

    /* renamed from: g */
    public final int f293169g;

    /* renamed from: h */
    public int f293170h;

    /* renamed from: i */
    public final int f293171i;

    /* renamed from: j */
    public final Drawable f293172j;

    /* renamed from: k */
    public final Animation f293173k;

    /* renamed from: l */
    public final boolean f293174l;

    /* renamed from: n60.f$b */
    public enum C61628b {
        NETWORK,
        FILE
    }

    /* renamed from: n60.f$a */
    public static final class C100076a {

        /* renamed from: a */
        public boolean f293175a = true;

        /* renamed from: b */
        public boolean f293176b;

        /* renamed from: c */
        public boolean f293177c;

        /* renamed from: d */
        public String f293178d = "";

        /* renamed from: e */
        public C61628b f293179e = C61628b.NETWORK;

        /* renamed from: f */
        public int f293180f;

        /* renamed from: g */
        public int f293181g;

        /* renamed from: h */
        public int f293182h;

        /* renamed from: i */
        public int f293183i;

        /* renamed from: j */
        public Drawable f293184j;

        /* renamed from: k */
        public Animation f293185k;

        /* renamed from: l */
        public boolean f293186l;

        /* renamed from: a */
        public final C100075f mo139398a() {
            return new C100075f(this, (C8480h) null);
        }

        /* renamed from: b */
        public final C100076a mo139399b(boolean z) {
            this.f293176b = z;
            return this;
        }
    }

    public C100075f(C100076a aVar, C8480h hVar) {
        this.f293163a = aVar.f293175a;
        this.f293164b = aVar.f293176b;
        this.f293165c = aVar.f293177c;
        this.f293166d = aVar.f293178d;
        this.f293167e = aVar.f293179e;
        this.f293168f = aVar.f293180f;
        this.f293169g = aVar.f293181g;
        this.f293173k = aVar.f293185k;
        this.f293170h = aVar.f293182h;
        this.f293171i = aVar.f293183i;
        this.f293172j = aVar.f293184j;
        this.f293174l = aVar.f293186l;
    }
}
