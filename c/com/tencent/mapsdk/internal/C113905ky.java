package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ky */
public final class C113905ky {

    /* renamed from: a */
    private static final String f340750a = "PoolUtil";

    /* renamed from: b */
    private static final int f340751b = 20;

    /* renamed from: c */
    private static final C113922k<Object> f340752c = new C113922k<Object>() {
        /* renamed from: a */
        public final void mo172340a(Object obj) {
        }
    };

    /* renamed from: com.tencent.mapsdk.internal.ky$a */
    public static class C113910a {

        /* renamed from: a */
        public int f340753a = 256;

        /* renamed from: b */
        public int f340754b = 256;

        /* renamed from: c */
        public Bitmap.Config f340755c;

        public C113910a(Bitmap.Config config) {
            this.f340755c = config;
        }

        /* renamed from: a */
        private void m157786a(C113910a aVar) {
            if (aVar != null) {
                this.f340753a = aVar.f340753a;
                this.f340754b = aVar.f340754b;
                this.f340755c = aVar.f340755c;
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$b */
    public static abstract class C113911b<T> implements C113914e<T> {

        /* renamed from: a */
        public C113910a f340756a;

        public C113911b(C113910a aVar) {
            this.f340756a = aVar;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$e */
    public interface C113914e<T> {
        /* renamed from: a */
        T mo172330a();
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$g */
    public interface C113916g<T> {
        /* renamed from: a */
        T mo172343a();

        /* renamed from: a */
        boolean mo172344a(T t);
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$h */
    public interface C113917h {
        /* renamed from: a */
        C113923l mo172331a();
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$i */
    public static final class C113918i<T> implements C113917h {

        /* renamed from: a */
        public final T f340762a;

        /* renamed from: b */
        private C113923l f340763b = new C113913d();

        public C113918i(T t) {
            this.f340762a = t;
        }

        /* renamed from: b */
        private T m157797b() {
            return this.f340762a;
        }

        /* renamed from: a */
        public final C113923l mo172331a() {
            return this.f340763b;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$k */
    public interface C113922k<T> {
        /* renamed from: a */
        void mo172340a(T t);
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$l */
    public static abstract class C113923l {

        /* renamed from: a */
        private static final boolean f340767a = false;

        /* renamed from: b */
        private static C113923l m157805b() {
            return new C113913d();
        }

        /* renamed from: a */
        public abstract void mo172341a();

        /* renamed from: a */
        public abstract void mo172342a(boolean z);
    }

    private C113905ky() {
    }

    /* renamed from: a */
    public static C113916g<C113918i<Bitmap>> m157773a(C113910a aVar) {
        return m157771a(10, new C113911b<C113918i<Bitmap>>(aVar) {
            /* renamed from: b */
            private C113918i<Bitmap> m157780b() {
                C113910a aVar = this.f340756a;
                return new C113918i<>(Bitmap.createBitmap(aVar.f340753a, aVar.f340754b, aVar.f340755c));
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo172330a() {
                C113910a aVar = this.f340756a;
                return new C113918i(Bitmap.createBitmap(aVar.f340753a, aVar.f340754b, aVar.f340755c));
            }
        });
    }

    /* renamed from: b */
    private static <T extends C113917h> C113916g<T> m157777b(int i, C113914e<T> eVar) {
        return m157774a(new C113919j.C113920a(i), eVar);
    }

    /* renamed from: c */
    private static <T> C113922k<T> m157778c() {
        return f340752c;
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$c */
    public static class C113912c extends C113923l {

        /* renamed from: a */
        private volatile RuntimeException f340757a;

        /* renamed from: a */
        public final void mo172341a() {
            if (this.f340757a != null) {
                throw new IllegalStateException("Already released", this.f340757a);
            }
        }

        /* renamed from: a */
        public final void mo172342a(boolean z) {
            if (z) {
                this.f340757a = new RuntimeException("Released");
            } else {
                this.f340757a = null;
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$d */
    public static class C113913d extends C113923l {

        /* renamed from: a */
        private volatile boolean f340758a;

        /* renamed from: a */
        public final void mo172341a() {
            if (this.f340758a) {
                throw new IllegalStateException("Already released");
            }
        }

        /* renamed from: a */
        public final void mo172342a(boolean z) {
            this.f340758a = z;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$j */
    public static final class C113919j {
        private C113919j() {
        }

        /* renamed from: com.tencent.mapsdk.internal.ky$j$b */
        public static class C113921b<T> extends C113920a<T> {

            /* renamed from: a */
            private final Object f340766a = new Object();

            public C113921b(int i) {
                super(i);
            }

            /* renamed from: a */
            public final T mo172343a() {
                T a;
                synchronized (this.f340766a) {
                    a = super.mo172343a();
                }
                return a;
            }

            /* renamed from: a */
            public final boolean mo172344a(T t) {
                boolean a;
                synchronized (this.f340766a) {
                    a = super.mo172344a(t);
                }
                return a;
            }
        }

        /* renamed from: com.tencent.mapsdk.internal.ky$j$a */
        public static class C113920a<T> implements C113916g<T> {

            /* renamed from: a */
            private final Object[] f340764a;

            /* renamed from: b */
            private int f340765b;

            public C113920a(int i) {
                if (i > 0) {
                    this.f340764a = new Object[i];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            }

            /* renamed from: b */
            private boolean m157799b(T t) {
                for (int i = 0; i < this.f340765b; i++) {
                    if (this.f340764a[i] == t) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: a */
            public T mo172343a() {
                int i = this.f340765b;
                if (i <= 0) {
                    return null;
                }
                int i2 = i - 1;
                T[] tArr = this.f340764a;
                T t = tArr[i2];
                tArr[i2] = null;
                this.f340765b = i - 1;
                return t;
            }

            /* renamed from: a */
            public boolean mo172344a(T t) {
                int i;
                boolean z;
                int i2 = 0;
                while (true) {
                    i = this.f340765b;
                    if (i2 >= i) {
                        z = false;
                        break;
                    } else if (this.f340764a[i2] == t) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    Object[] objArr = this.f340764a;
                    if (i >= objArr.length) {
                        return false;
                    }
                    objArr[i] = t;
                    this.f340765b = i + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
            }
        }
    }

    /* renamed from: b */
    private static <T> C113916g<List<T>> m157776b() {
        return m157775a(new C113919j.C113921b(20), new C113914e<List<T>>() {
            /* renamed from: b */
            private static List<T> m157782b() {
                return new ArrayList();
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo172330a() {
                return new ArrayList();
            }
        }, new C113922k<List<T>>() {
            /* renamed from: a */
            public final /* synthetic */ void mo172340a(Object obj) {
                ((List) obj).clear();
            }

            /* renamed from: a */
            private static void m157784a(List<T> list) {
                list.clear();
            }
        });
    }

    /* renamed from: a */
    public static <T extends C113917h> C113916g<T> m157771a(int i, C113914e<T> eVar) {
        return m157774a(new C113919j.C113921b(i), eVar);
    }

    /* renamed from: a */
    private static <T extends C113917h> C113916g<T> m157772a(int i, C113914e<T> eVar, C113922k<T> kVar) {
        return m157775a(new C113919j.C113921b(i), eVar, kVar);
    }

    /* renamed from: com.tencent.mapsdk.internal.ky$f */
    public static final class C113915f<T> implements C113916g<T> {

        /* renamed from: a */
        private final C113914e<T> f340759a;

        /* renamed from: b */
        private final C113922k<T> f340760b;

        /* renamed from: c */
        private final C113916g<T> f340761c;

        public C113915f(C113916g<T> gVar, C113914e<T> eVar, C113922k<T> kVar) {
            this.f340761c = gVar;
            this.f340759a = eVar;
            this.f340760b = kVar;
        }

        /* renamed from: a */
        public final T mo172343a() {
            T a = this.f340761c.mo172343a();
            if (a == null) {
                a = this.f340759a.mo172330a();
                C113889km.m157538a(C113905ky.f340750a, "Created new ".concat(String.valueOf(a)));
            }
            if (a instanceof C113917h) {
                ((C113917h) a).mo172331a().mo172342a(false);
            }
            return a;
        }

        /* renamed from: a */
        public final boolean mo172344a(T t) {
            if (t instanceof C113917h) {
                ((C113917h) t).mo172331a().mo172342a(true);
            }
            this.f340760b.mo172340a(t);
            return this.f340761c.mo172344a(t);
        }
    }

    /* renamed from: a */
    private static <T> C113916g<T> m157775a(C113916g<T> gVar, C113914e<T> eVar, C113922k<T> kVar) {
        return new C113915f(gVar, eVar, kVar);
    }

    /* renamed from: a */
    private static <T> C113916g<List<T>> m157770a() {
        return m157775a(new C113919j.C113921b(20), new C113914e<List<T>>() {
            /* renamed from: b */
            private static List<T> m157782b() {
                return new ArrayList();
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo172330a() {
                return new ArrayList();
            }
        }, new C113922k<List<T>>() {
            /* renamed from: a */
            public final /* synthetic */ void mo172340a(Object obj) {
                ((List) obj).clear();
            }

            /* renamed from: a */
            private static void m157784a(List<T> list) {
                list.clear();
            }
        });
    }

    /* renamed from: a */
    private static <T extends C113917h> C113916g<T> m157774a(C113916g<T> gVar, C113914e<T> eVar) {
        return m157775a(gVar, eVar, f340752c);
    }
}
