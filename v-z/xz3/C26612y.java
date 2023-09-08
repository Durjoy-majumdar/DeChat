package xz3;

/* renamed from: xz3.y */
public enum C26612y {
    INT32(r11, 0),
    BOOL(C26617z.BOOLEAN, 0),
    GROUP(r13, 3) {
        /* renamed from: a */
        public boolean mo53592a() {
            return false;
        }
    },
    MESSAGE(r13, 2) {
        /* renamed from: a */
        public boolean mo53592a() {
            return false;
        }
    },
    ENUM(C26617z.ENUM, 0);
    

    /* renamed from: d */
    public final C26617z f74034d;

    /* renamed from: e */
    public final int f74035e;

    /* 'enum' modifier removed */
    /* renamed from: xz3.y$a */
    public static class C26613a extends C26612y {
        public C26613a(String str, int i, C26617z zVar, int i2) {
            super(str, i, zVar, i2);
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: xz3.y$d */
    public static class C26616d extends C26612y {
        public C26616d(String str, int i, C26617z zVar, int i2) {
            super(str, i, zVar, i2);
        }

        /* renamed from: a */
        public boolean mo53592a() {
            return false;
        }
    }

    /* access modifiers changed from: public */
    C26612y(C26617z zVar, int i) {
        this.f74034d = zVar;
        this.f74035e = i;
    }

    /* renamed from: a */
    public boolean mo53592a() {
        return !(this instanceof C26613a);
    }
}
