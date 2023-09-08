package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C113836jj;
import com.tencent.mapsdk.internal.C113849jm;
import com.tencent.mapsdk.internal.C113865kb;

/* renamed from: com.tencent.mapsdk.internal.jk */
public abstract class C113838jk<D extends C113849jm> extends C113862jt<D> implements C113836jj<D> {
    /* renamed from: a */
    public final C113836jj<D> mo172220a() {
        return this;
    }

    /* renamed from: a */
    public final void mo172223a(final String str, final D d, C113836jj.C113837a<Boolean> aVar) {
        C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() {
                C113838jk.this.mo172239b(str, d);
                return Boolean.TRUE;
            }
        }).mo172276a(new C113865kb.C113877e(Boolean.FALSE)).mo172282b(aVar);
    }

    /* renamed from: b */
    public final void mo172225b(C113836jj.C113837a<Long> aVar) {
        C113865kb.m157396a(new C113865kb.C113879g<Long>() {
            /* renamed from: a */
            private Long m157263a() {
                return Long.valueOf(C113838jk.this.mo172242k());
            }

            public final /* synthetic */ Object call() {
                return Long.valueOf(C113838jk.this.mo172242k());
            }
        }).mo172276a(new C113865kb.C113877e(0L)).mo172282b(aVar);
    }

    /* renamed from: c */
    public final void mo172226c(C113836jj.C113837a<Long> aVar) {
        C113865kb.m157396a(new C113865kb.C113879g<Long>() {
            /* renamed from: a */
            private Long m157264a() {
                return Long.valueOf(C113838jk.this.mo172243l());
            }

            public final /* synthetic */ Object call() {
                return Long.valueOf(C113838jk.this.mo172243l());
            }
        }).mo172276a(new C113865kb.C113877e(0L)).mo172282b(aVar);
    }

    /* renamed from: d */
    public final void mo172227d(C113836jj.C113837a<Long> aVar) {
        C113865kb.m157396a(new C113865kb.C113879g<Long>() {
            /* renamed from: a */
            private Long m157265a() {
                return Long.valueOf(C113838jk.this.mo170956e());
            }

            public final /* synthetic */ Object call() {
                return Long.valueOf(C113838jk.this.mo170956e());
            }
        }).mo172276a(new C113865kb.C113877e(0L)).mo172282b(aVar);
    }

    /* renamed from: a */
    public final void mo172224a(final String str, final Class<D> cls, C113836jj.C113837a<D> aVar) {
        try {
            C113865kb.m157396a(new C113865kb.C113879g<D>() {
                /* renamed from: a */
                private D m157260a() {
                    return C113838jk.this.mo172238b(str, cls);
                }

                public final /* synthetic */ Object call() {
                    return C113838jk.this.mo172238b(str, cls);
                }
            }).mo172276a(new C113865kb.C113877e((C113849jm) cls.newInstance())).mo172282b(aVar);
        } catch (IllegalAccessException e) {
            throw new Error("The " + cls.getSimpleName() + " must have a empty construct. #" + e.getMessage(), e);
        } catch (InstantiationException e2) {
            throw new Error("The " + cls.getSimpleName() + " must have a empty construct. #" + e2.getMessage(), e2);
        }
    }

    /* renamed from: a */
    public final void mo172222a(final String str, C113836jj.C113837a<Boolean> aVar) {
        C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
            /* renamed from: a */
            private Boolean m157261a() {
                return Boolean.valueOf(C113838jk.this.mo172240b(str));
            }

            public final /* synthetic */ Object call() {
                return Boolean.valueOf(C113838jk.this.mo172240b(str));
            }
        }).mo172276a(new C113865kb.C113877e(Boolean.FALSE)).mo172282b(aVar);
    }

    /* renamed from: a */
    public final void mo172221a(C113836jj.C113837a<Boolean> aVar) {
        C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() {
                C113838jk.this.mo172241j();
                return Boolean.TRUE;
            }
        }).mo172276a(new C113865kb.C113877e(Boolean.FALSE)).mo172282b(aVar);
    }
}
