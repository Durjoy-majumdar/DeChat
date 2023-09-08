package sj2;

import a14.C0000n0;
import a14.C53860b3;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import fy3.C32227p;
import kotlin.ResultKt;
import nj2.C61768p;
import pj2.C62318a;
import rj2.C63447a;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.ExclusiveRemoteDataSource$requestExclusive$2", mo125469f = "ExclusiveRemoteDataSource.kt", mo125470l = {47}, mo125471m = "invokeSuspend")
/* renamed from: sj2.a */
public final class C63915a extends C91594j implements C32227p<C45253g<? super C62318a>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181162d;

    /* renamed from: e */
    public /* synthetic */ Object f181163e;

    /* renamed from: f */
    public final /* synthetic */ C62318a f181164f;

    /* renamed from: g */
    public final /* synthetic */ C63922c f181165g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.ExclusiveRemoteDataSource$requestExclusive$2$1", mo125469f = "ExclusiveRemoteDataSource.kt", mo125470l = {50, 53, 57, 61, 69, 72, 73, 78, 81, 84}, mo125471m = "invokeSuspend")
    /* renamed from: sj2.a$a */
    public static final class C63916a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f181166d;

        /* renamed from: e */
        public Object f181167e;

        /* renamed from: f */
        public Object f181168f;

        /* renamed from: g */
        public Object f181169g;

        /* renamed from: h */
        public int f181170h;

        /* renamed from: i */
        public final /* synthetic */ C62318a f181171i;

        /* renamed from: j */
        public final /* synthetic */ C45253g<C62318a> f181172j;

        /* renamed from: n */
        public final /* synthetic */ C63922c f181173n;

        @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.ExclusiveRemoteDataSource$requestExclusive$2$1$1", mo125469f = "ExclusiveRemoteDataSource.kt", mo125470l = {63, 64}, mo125471m = "invokeSuspend")
        /* renamed from: sj2.a$a$a */
        public static final class C63917a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f181174d;

            /* renamed from: e */
            public Object f181175e;

            /* renamed from: f */
            public Object f181176f;

            /* renamed from: g */
            public int f181177g;

            /* renamed from: h */
            public final /* synthetic */ C62318a f181178h;

            /* renamed from: i */
            public final /* synthetic */ C66132f f181179i;

            /* renamed from: j */
            public final /* synthetic */ String f181180j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63917a(C62318a aVar, C66132f fVar, String str, C15601d<? super C63917a> dVar) {
                super(2, dVar);
                this.f181178h = aVar;
                this.f181179i = fVar;
                this.f181180j = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C63917a(this.f181178h, this.f181179i, this.f181180j, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C63917a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                String str;
                C62318a aVar;
                C66132f fVar;
                C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
                int i = this.f181177g;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C63447a aVar3 = C63447a.f179958a;
                    long itemId = this.f181178h.getItemId();
                    C66132f fVar2 = this.f181179i;
                    this.f181177g = 1;
                    obj = aVar3.mo88313b(itemId, fVar2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    fVar = (C66132f) this.f181176f;
                    aVar = (C62318a) this.f181175e;
                    str = (String) this.f181174d;
                    ResultKt.throwOnFailure(obj);
                    C61768p.m72485m(str, fVar, aVar.f177144d.f147591g);
                    return C13598b0.f38549a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C66132f fVar3 = (C66132f) obj;
                if (fVar3 != null) {
                    String str2 = this.f181180j;
                    C62318a aVar4 = this.f181178h;
                    C61768p pVar = C61768p.f175586a;
                    this.f181174d = str2;
                    this.f181175e = aVar4;
                    this.f181176f = fVar3;
                    this.f181177g = 2;
                    if (pVar.mo86689a(str2, fVar3, true, this) == aVar2) {
                        return aVar2;
                    }
                    fVar = fVar3;
                    str = str2;
                    aVar = aVar4;
                    C61768p.m72485m(str, fVar, aVar.f177144d.f147591g);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63916a(C62318a aVar, C45253g<? super C62318a> gVar, C63922c cVar, C15601d<? super C63916a> dVar) {
            super(2, dVar);
            this.f181171i = aVar;
            this.f181172j = gVar;
            this.f181173n = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63916a(this.f181171i, this.f181172j, this.f181173n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63916a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
            nj2.C61768p.m72485m(r1, r3, r13.f181171i.f177144d.f147591g);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ed, code lost:
            r14 = r13.f181172j;
            r1 = r13.f181171i;
            r13.f181166d = null;
            r13.f181167e = null;
            r13.f181170h = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fc, code lost:
            if (r14.emit(r1, r13) != r0) goto L_0x0191;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fe, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x013c, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0158, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0177, code lost:
            nj2.C61768p.m72485m(r3, r1, r4.f177144d.f147591g);
            r13.f181166d = null;
            r13.f181167e = null;
            r13.f181168f = null;
            r13.f181169g = null;
            r13.f181170h = 10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x018e, code lost:
            if (r5.emit(r4, r13) != r0) goto L_0x0191;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0190, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0193, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f181170h
                r2 = 0
                switch(r1) {
                    case 0: goto L_0x004e;
                    case 1: goto L_0x004a;
                    case 2: goto L_0x0046;
                    case 3: goto L_0x0039;
                    case 4: goto L_0x0034;
                    case 5: goto L_0x002f;
                    case 6: goto L_0x002f;
                    case 7: goto L_0x002a;
                    case 8: goto L_0x0025;
                    case 9: goto L_0x0010;
                    case 10: goto L_0x002f;
                    default: goto L_0x0008;
                }
            L_0x0008:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0010:
                java.lang.Object r1 = r13.f181169g
                wj2.f r1 = (wj2.C66132f) r1
                java.lang.Object r3 = r13.f181168f
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r13.f181167e
                pj2.a r4 = (pj2.C62318a) r4
                java.lang.Object r5 = r13.f181166d
                d14.g r5 = (d14.C45253g) r5
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0177
            L_0x0025:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0156
            L_0x002a:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x013a
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0191
            L_0x0034:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00d8
            L_0x0039:
                java.lang.Object r1 = r13.f181167e
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r13.f181166d
                wj2.f r3 = (wj2.C66132f) r3
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00b3
            L_0x0046:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0092
            L_0x004a:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0074
            L_0x004e:
                kotlin.ResultKt.throwOnFailure(r14)
                pj2.a r4 = r13.f181171i
                ve3.i r14 = r4.f177144d
                ve3.n0 r14 = r14.f147590f
                r1 = 2
                r3 = 0
                r12 = 1
                if (r14 == 0) goto L_0x0062
                int r5 = r14.f189020d
                if (r5 != r1) goto L_0x0062
                r5 = 1
                goto L_0x0063
            L_0x0062:
                r5 = 0
            L_0x0063:
                if (r5 == 0) goto L_0x00ff
                ve3.g r3 = r14.f189022f
                if (r3 != 0) goto L_0x0077
                d14.g<pj2.a> r14 = r13.f181172j
                r13.f181170h = r12
                java.lang.Object r14 = r14.emit(r2, r13)
                if (r14 != r0) goto L_0x0074
                return r0
            L_0x0074:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x0077:
                wj2.h$a r4 = wj2.C66135h.f190107E
                wj2.f r3 = r4.mo90189e(r3, r14)
                r3.f190083f = r14
                pj2.a r4 = r13.f181171i
                ve3.i r5 = r4.f177144d
                java.lang.String r5 = r5.f147588d
                if (r5 != 0) goto L_0x0095
                d14.g<pj2.a> r14 = r13.f181172j
                r13.f181170h = r1
                java.lang.Object r14 = r14.emit(r2, r13)
                if (r14 != r0) goto L_0x0092
                return r0
            L_0x0092:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x0095:
                boolean r14 = r14.f189024h
                if (r14 == 0) goto L_0x00bd
                r3.f190091n = r12
                long r6 = r4.getItemId()
                rj2.C63447a.m74788d(r6, r3)
                nj2.p r14 = nj2.C61768p.f175586a
                r13.f181166d = r3
                r13.f181167e = r5
                r1 = 3
                r13.f181170h = r1
                java.lang.Object r14 = r14.mo86689a(r5, r3, r12, r13)
                if (r14 != r0) goto L_0x00b2
                return r0
            L_0x00b2:
                r1 = r5
            L_0x00b3:
                pj2.a r14 = r13.f181171i
                ve3.i r14 = r14.f177144d
                long r4 = r14.f147591g
                nj2.C61768p.m72485m(r1, r3, r4)
                goto L_0x00ed
            L_0x00bd:
                long r4 = r4.getItemId()
                rj2.C63447a.m74788d(r4, r3)
                pj2.a r14 = r13.f181171i
                ve3.i r1 = r14.f177144d
                java.lang.String r1 = r1.f147588d
                if (r1 != 0) goto L_0x00db
                d14.g<pj2.a> r14 = r13.f181172j
                r1 = 4
                r13.f181170h = r1
                java.lang.Object r14 = r14.emit(r2, r13)
                if (r14 != r0) goto L_0x00d8
                return r0
            L_0x00d8:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x00db:
                sj2.c r4 = r13.f181173n
                a14.n0 r5 = r4.f181194a
                if (r5 == 0) goto L_0x00ed
                r6 = 0
                r7 = 0
                sj2.a$a$a r8 = new sj2.a$a$a
                r8.<init>(r14, r3, r1, r2)
                r9 = 3
                r10 = 0
                a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
            L_0x00ed:
                d14.g<pj2.a> r14 = r13.f181172j
                pj2.a r1 = r13.f181171i
                r13.f181166d = r2
                r13.f181167e = r2
                r2 = 5
                r13.f181170h = r2
                java.lang.Object r14 = r14.emit(r1, r13)
                if (r14 != r0) goto L_0x0191
                return r0
            L_0x00ff:
                if (r14 == 0) goto L_0x0106
                int r1 = r14.f189020d
                if (r1 != r12) goto L_0x0106
                r3 = 1
            L_0x0106:
                if (r3 == 0) goto L_0x0191
                ve3.f0 r1 = r14.f189021e
                if (r1 == 0) goto L_0x0191
                d14.g<pj2.a> r3 = r13.f181172j
                ve3.e0 r5 = r1.f188985d
                if (r5 != 0) goto L_0x011c
                r14 = 6
                r13.f181170h = r14
                java.lang.Object r14 = r3.emit(r2, r13)
                if (r14 != r0) goto L_0x0191
                return r0
            L_0x011c:
                wj2.h$a r6 = wj2.C66135h.f190107E
                r7 = 0
                long r9 = r1.f188990i
                java.lang.String r11 = r5.toString()
                r5 = r6
                r6 = r7
                r8 = r9
                r10 = r14
                wj2.f r1 = r5.mo90191g(r6, r8, r10, r11)
                if (r1 != 0) goto L_0x013d
                r14 = 7
                r13.f181170h = r14
                java.lang.Object r14 = r3.emit(r2, r13)
                if (r14 != r0) goto L_0x013a
                return r0
            L_0x013a:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x013d:
                boolean r5 = r14.f189024h
                if (r5 == 0) goto L_0x0143
                r1.f190091n = r12
            L_0x0143:
                r1.f190083f = r14
                ve3.i r14 = r4.f177144d
                java.lang.String r14 = r14.f147588d
                if (r14 != 0) goto L_0x0159
                r14 = 8
                r13.f181170h = r14
                java.lang.Object r14 = r3.emit(r2, r13)
                if (r14 != r0) goto L_0x0156
                return r0
            L_0x0156:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x0159:
                long r5 = r4.getItemId()
                rj2.C63447a.m74788d(r5, r1)
                nj2.p r5 = nj2.C61768p.f175586a
                r13.f181166d = r3
                r13.f181167e = r4
                r13.f181168f = r14
                r13.f181169g = r1
                r6 = 9
                r13.f181170h = r6
                java.lang.Object r5 = r5.mo86689a(r14, r1, r12, r13)
                if (r5 != r0) goto L_0x0175
                return r0
            L_0x0175:
                r5 = r3
                r3 = r14
            L_0x0177:
                ve3.i r14 = r4.f177144d
                long r6 = r14.f147591g
                nj2.C61768p.m72485m(r3, r1, r6)
                r13.f181166d = r2
                r13.f181167e = r2
                r13.f181168f = r2
                r13.f181169g = r2
                r14 = 10
                r13.f181170h = r14
                java.lang.Object r14 = r5.emit(r4, r13)
                if (r14 != r0) goto L_0x0191
                return r0
            L_0x0191:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: sj2.C63915a.C63916a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63915a(C62318a aVar, C63922c cVar, C15601d<? super C63915a> dVar) {
        super(2, dVar);
        this.f181164f = aVar;
        this.f181165g = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C63915a aVar = new C63915a(this.f181164f, this.f181165g, dVar);
        aVar.f181163e = obj;
        return aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63915a) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181162d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.ExclusiveRemoteDataSource", "bindDataSource, requestExclusive is " + this.f181164f.f177144d.f147591g);
            C63916a aVar2 = new C63916a(this.f181164f, (C45253g) this.f181163e, this.f181165g, (C15601d<? super C63916a>) null);
            this.f181162d = 1;
            if (C53860b3.m60374b(2000, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
