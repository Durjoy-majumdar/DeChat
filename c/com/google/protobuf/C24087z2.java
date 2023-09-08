package com.google.protobuf;

/* renamed from: com.google.protobuf.z2 */
public final class C24087z2 {

    /* renamed from: com.google.protobuf.z2$b */
    public enum C24089b {
        STRING(C24094c.STRING, 2) {
        },
        GROUP(r13, 3) {
            /* renamed from: a */
            public boolean mo38437a() {
                return false;
            }
        },
        MESSAGE(r13, 2) {
            /* renamed from: a */
            public boolean mo38437a() {
                return false;
            }
        },
        ENUM(C24094c.ENUM, 0);
        

        /* renamed from: d */
        public final C24094c f69233d;

        /* renamed from: e */
        public final int f69234e;

        /* 'enum' modifier removed */
        /* renamed from: com.google.protobuf.z2$b$d */
        public final class C24093d extends C24089b {
            public C24093d(String str, int i, C24094c cVar, int i2) {
                super(str, i, cVar, i2);
            }

            /* renamed from: a */
            public boolean mo38437a() {
                return false;
            }
        }

        /* access modifiers changed from: public */
        C24089b(C24094c cVar, int i) {
            this.f69233d = cVar;
            this.f69234e = i;
        }

        /* renamed from: a */
        public boolean mo38437a() {
            return !(this instanceof C24090a);
        }
    }

    /* renamed from: com.google.protobuf.z2$c */
    public enum C24094c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C16994k.f46000e),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: d */
        public final Object f69245d;

        /* access modifiers changed from: public */
        C24094c(Object obj) {
            this.f69245d = obj;
        }
    }

    /* renamed from: com.google.protobuf.z2$d */
    public enum C24095d {
        LOOSE {
            /* renamed from: a */
            public Object mo38438a(C23856l lVar) {
                return lVar.mo37755D();
            }
        },
        STRICT {
            /* renamed from: a */
            public Object mo38438a(C23856l lVar) {
                return lVar.mo37756E();
            }
        };

        /* 'enum' modifier removed */
        /* renamed from: com.google.protobuf.z2$d$c */
        public final class C24098c extends C24095d {
            public C24098c(String str, int i) {
                super(str, i, (C24088a) null);
            }

            /* renamed from: a */
            public Object mo38438a(C23856l lVar) {
                return lVar.mo37768m();
            }
        }

        /* access modifiers changed from: public */
        C24095d(C24088a aVar) {
        }

        /* renamed from: a */
        public abstract Object mo38438a(C23856l lVar);
    }

    /* renamed from: a */
    public static Object m30087a(C23856l lVar, C24089b bVar, C24095d dVar) {
        switch (bVar.ordinal()) {
            case 0:
                return Double.valueOf(lVar.mo37769n());
            case 1:
                return Float.valueOf(lVar.mo37773r());
            case 2:
                return Long.valueOf(lVar.mo37776u());
            case 3:
                return Long.valueOf(lVar.mo37759H());
            case 4:
                return Integer.valueOf(lVar.mo37775t());
            case 5:
                return Long.valueOf(lVar.mo37772q());
            case 6:
                return Integer.valueOf(lVar.mo37771p());
            case 7:
                return Boolean.valueOf(lVar.mo37767l());
            case 8:
                return dVar.mo38438a(lVar);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return lVar.mo37768m();
            case 12:
                return Integer.valueOf(lVar.mo37758G());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(lVar.mo37780z());
            case 15:
                return Long.valueOf(lVar.mo37752A());
            case 16:
                return Integer.valueOf(lVar.mo37753B());
            case 17:
                return Long.valueOf(lVar.mo37754C());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
