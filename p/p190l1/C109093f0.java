package p190l1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53916l;
import a14.C53921m;
import androidx.compose.p002ui.platform.C103633i2;
import com.google.android.gms.common.internal.Constants;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import p1166z0.C112539e;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p410k0.C108793e;
import p560i2.C108322d;
import p560i2.C33181m;
import p631o1.C109857o;
import p721v0.C65503j;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: l1.f0 */
public final class C109093f0 extends C109117x implements C109118y, C109119z, C108322d {

    /* renamed from: f */
    public final C103633i2 f326661f;

    /* renamed from: g */
    public final /* synthetic */ C108322d f326662g;

    /* renamed from: h */
    public C109106l f326663h = C109099h0.f326691a;

    /* renamed from: i */
    public final C108793e<C109094a<?>> f326664i = new C108793e<>(new C109094a[16], 0);

    /* renamed from: j */
    public final C108793e<C109094a<?>> f326665j = new C108793e<>(new C109094a[16], 0);

    /* renamed from: n */
    public C109106l f326666n;

    /* renamed from: o */
    public long f326667o = 0;

    /* renamed from: p */
    public C0000n0 f326668p = C0001s1.f0d;

    /* renamed from: l1.f0$b */
    public static final class C61180b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109094a<R> f174160d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61180b(C109094a<R> aVar) {
            super(1);
            this.f174160d = aVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C109094a<R> aVar = this.f174160d;
            C53916l<? super C109106l> lVar = aVar.f326671f;
            if (lVar != null) {
                lVar.mo74591G(th);
            }
            aVar.f326671f = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l1.f0$a */
    public final class C109094a<R> implements C109085c, C108322d, C15601d<R> {

        /* renamed from: d */
        public final C15601d<R> f326669d;

        /* renamed from: e */
        public final /* synthetic */ C109093f0 f326670e;

        /* renamed from: f */
        public C53916l<? super C109106l> f326671f;

        /* renamed from: g */
        public C109108n f326672g = C109108n.Main;

        /* renamed from: h */
        public final C66212f f326673h = C66217g.f190253d;

        /* renamed from: i */
        public final /* synthetic */ C109093f0 f326674i;

        @C91590f(mo125468c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", mo125469f = "SuspendingPointerInputFilter.kt", mo125470l = {614, 615}, mo125471m = "invokeSuspend")
        /* renamed from: l1.f0$a$b */
        public static final class C61179b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f174157d;

            /* renamed from: e */
            public final /* synthetic */ long f174158e;

            /* renamed from: f */
            public final /* synthetic */ C109094a<R> f174159f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61179b(long j, C109094a<R> aVar, C15601d<? super C61179b> dVar) {
                super(2, dVar);
                this.f174158e = j;
                this.f174159f = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C61179b(this.f174158e, this.f174159f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C61179b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r8.f174157d
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L_0x001e
                    if (r1 == r5) goto L_0x001a
                    if (r1 != r4) goto L_0x0012
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L_0x0036
                L_0x0012:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L_0x001a:
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L_0x002d
                L_0x001e:
                    kotlin.ResultKt.throwOnFailure(r9)
                    long r6 = r8.f174158e
                    long r6 = r6 - r2
                    r8.f174157d = r5
                    java.lang.Object r9 = a14.C53965x0.m60607b(r6, r8)
                    if (r9 != r0) goto L_0x002d
                    return r0
                L_0x002d:
                    r8.f174157d = r4
                    java.lang.Object r9 = a14.C53965x0.m60607b(r2, r8)
                    if (r9 != r0) goto L_0x0036
                    return r0
                L_0x0036:
                    l1.f0$a<R> r9 = r8.f174159f
                    a14.l<? super l1.l> r9 = r9.f326671f
                    if (r9 == 0) goto L_0x0050
                    kotlin.Result$Companion r0 = kotlin.Result.Companion
                    l1.o r0 = new l1.o
                    long r1 = r8.f174158e
                    r0.<init>(r1)
                    java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
                    java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
                    r9.resumeWith(r0)
                L_0x0050:
                    rx3.b0 r9 = rx3.C13598b0.f38549a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: p190l1.C109093f0.C109094a.C61179b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @C91590f(mo125468c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", mo125469f = "SuspendingPointerInputFilter.kt", mo125470l = {622}, mo125471m = "withTimeout")
        /* renamed from: l1.f0$a$a */
        public static final class C109095a<T> extends C66704d {

            /* renamed from: d */
            public Object f326675d;

            /* renamed from: e */
            public /* synthetic */ Object f326676e;

            /* renamed from: f */
            public final /* synthetic */ C109094a<R> f326677f;

            /* renamed from: g */
            public int f326678g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C109095a(C109094a<R> aVar, C15601d<? super C109095a> dVar) {
                super(dVar);
                this.f326677f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f326676e = obj;
                this.f326678g |= Integer.MIN_VALUE;
                return this.f326677f.mo160331R(0, (C32227p) null, this);
            }
        }

        @C91590f(mo125468c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", mo125469f = "SuspendingPointerInputFilter.kt", mo125470l = {594}, mo125471m = "withTimeoutOrNull")
        /* renamed from: l1.f0$a$c */
        public static final class C109096c<T> extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f326679d;

            /* renamed from: e */
            public final /* synthetic */ C109094a<R> f326680e;

            /* renamed from: f */
            public int f326681f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C109096c(C109094a<R> aVar, C15601d<? super C109096c> dVar) {
                super(dVar);
                this.f326680e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f326679d = obj;
                this.f326681f |= Integer.MIN_VALUE;
                return this.f326680e.mo160329C(0, (C32227p) null, this);
            }
        }

        public C109094a(C109093f0 f0Var, C15601d<? super R> dVar) {
            C87412m.m108594g(dVar, "completion");
            this.f326674i = f0Var;
            this.f326669d = dVar;
            this.f326670e = f0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: C */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object mo160329C(long r5, fy3.C32227p<? super p190l1.C109085c, ? super wx3.C15601d<? super T>, ? extends java.lang.Object> r7, wx3.C15601d<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof p190l1.C109093f0.C109094a.C109096c
                if (r0 == 0) goto L_0x0013
                r0 = r8
                l1.f0$a$c r0 = (p190l1.C109093f0.C109094a.C109096c) r0
                int r1 = r0.f326681f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f326681f = r1
                goto L_0x0018
            L_0x0013:
                l1.f0$a$c r0 = new l1.f0$a$c
                r0.<init>(r4, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f326679d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f326681f
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ o -> 0x003b }
                goto L_0x003c
            L_0x0027:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r8)
                r0.f326681f = r3     // Catch:{ o -> 0x003b }
                java.lang.Object r8 = r4.mo160331R(r5, r7, r0)     // Catch:{ o -> 0x003b }
                if (r8 != r1) goto L_0x003c
                return r1
            L_0x003b:
                r8 = 0
            L_0x003c:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p190l1.C109093f0.C109094a.mo160329C(long, fy3.p, wx3.d):java.lang.Object");
        }

        /* renamed from: F */
        public long mo143031F(float f) {
            return this.f326670e.mo143031F(f);
        }

        /* renamed from: M */
        public int mo143032M(float f) {
            return this.f326670e.mo143032M(f);
        }

        /* renamed from: O */
        public float mo143033O(long j) {
            return this.f326670e.mo143033O(j);
        }

        /* renamed from: P */
        public C109106l mo160330P() {
            return this.f326674i.f326663h;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* renamed from: R */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object mo160331R(long r12, fy3.C32227p<? super p190l1.C109085c, ? super wx3.C15601d<? super T>, ? extends java.lang.Object> r14, wx3.C15601d<? super T> r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof p190l1.C109093f0.C109094a.C109095a
                if (r0 == 0) goto L_0x0013
                r0 = r15
                l1.f0$a$a r0 = (p190l1.C109093f0.C109094a.C109095a) r0
                int r1 = r0.f326678g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f326678g = r1
                goto L_0x0018
            L_0x0013:
                l1.f0$a$a r0 = new l1.f0$a$a
                r0.<init>(r11, r15)
            L_0x0018:
                java.lang.Object r15 = r0.f326676e
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f326678g
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0036
                if (r2 != r3) goto L_0x002e
                java.lang.Object r12 = r0.f326675d
                a14.z1 r12 = (a14.C53973z1) r12
                kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x002c }
                goto L_0x0071
            L_0x002c:
                r13 = move-exception
                goto L_0x0075
            L_0x002e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0036:
                kotlin.ResultKt.throwOnFailure(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L_0x0055
                a14.l<? super l1.l> r15 = r11.f326671f
                if (r15 == 0) goto L_0x0055
                kotlin.Result$Companion r2 = kotlin.Result.Companion
                l1.o r2 = new l1.o
                r2.<init>(r12)
                java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
                java.lang.Object r2 = kotlin.Result.m168114constructorimpl(r2)
                r15.resumeWith(r2)
            L_0x0055:
                l1.f0 r15 = r11.f326674i
                a14.n0 r5 = r15.f326668p
                r6 = 0
                r7 = 0
                l1.f0$a$b r8 = new l1.f0$a$b
                r8.<init>(r12, r11, r4)
                r9 = 3
                r10 = 0
                a14.z1 r12 = a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
                r0.f326675d = r12     // Catch:{ all -> 0x002c }
                r0.f326678g = r3     // Catch:{ all -> 0x002c }
                java.lang.Object r15 = r14.invoke(r11, r0)     // Catch:{ all -> 0x002c }
                if (r15 != r1) goto L_0x0071
                return r1
            L_0x0071:
                a14.C53973z1.C53974a.m60623a(r12, r4, r3, r4)
                return r15
            L_0x0075:
                a14.C53973z1.C53974a.m60623a(r12, r4, r3, r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p190l1.C109093f0.C109094a.mo160331R(long, fy3.p, wx3.d):java.lang.Object");
        }

        /* renamed from: T */
        public float mo143034T(float f) {
            return this.f326670e.mo143034T(f);
        }

        /* renamed from: b */
        public long mo160332b() {
            return this.f326674i.f326667o;
        }

        /* renamed from: d0 */
        public float mo143035d0(float f) {
            return this.f326670e.mo143035d0(f);
        }

        /* renamed from: e0 */
        public Object mo160333e0(C109108n nVar, C15601d<? super C109106l> dVar) {
            C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
            mVar.mo74609p();
            this.f326672g = nVar;
            this.f326671f = mVar;
            return mVar.mo74608o();
        }

        /* renamed from: g */
        public final void mo160340g(C109106l lVar, C109108n nVar) {
            C53916l<? super C109106l> lVar2;
            C87412m.m108594g(lVar, "event");
            C87412m.m108594g(nVar, StateEvent.ActionValue.STAGE_PASS);
            if (nVar == this.f326672g && (lVar2 = this.f326671f) != null) {
                this.f326671f = null;
                lVar2.resumeWith(Result.m168114constructorimpl(lVar));
            }
        }

        /* renamed from: g0 */
        public long mo143036g0(long j) {
            return this.f326670e.mo143036g0(j);
        }

        public C66212f getContext() {
            return this.f326673h;
        }

        public float getDensity() {
            return this.f326670e.getDensity();
        }

        public float getFontScale() {
            return this.f326670e.getFontScale();
        }

        public C103633i2 getViewConfiguration() {
            return this.f326674i.f326661f;
        }

        /* renamed from: m */
        public float mo143039m(int i) {
            return this.f326670e.mo143039m(i);
        }

        /* renamed from: p0 */
        public long mo160335p0() {
            C109093f0 f0Var = this.f326674i;
            long g0 = f0Var.mo143036g0(f0Var.f326661f.mo144729e());
            C109857o oVar = f0Var.f326747d;
            long b = oVar != null ? oVar.mo161181b() : 0;
            return C112546l.m153761a(Math.max(0.0f, C112545k.m153758d(g0) - ((float) ((int) (b >> 32)))) / 2.0f, Math.max(0.0f, C112545k.m153756b(g0) - ((float) C33181m.m39966b(b))) / 2.0f);
        }

        /* renamed from: q */
        public long mo143040q(long j) {
            return this.f326670e.mo143040q(j);
        }

        public void resumeWith(Object obj) {
            C109093f0 f0Var = this.f326674i;
            synchronized (f0Var.f326664i) {
                f0Var.f326664i.mo159869k(this);
                C13598b0 b0Var = C13598b0.f38549a;
            }
            this.f326669d.resumeWith(obj);
        }
    }

    public C109093f0(C103633i2 i2Var, C108322d dVar) {
        C87412m.m108594g(i2Var, "viewConfiguration");
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        this.f326661f = i2Var;
        this.f326662g = dVar;
    }

    /* renamed from: A */
    public <R> Object mo160337A(C32227p<? super C109085c, ? super C15601d<? super R>, ? extends Object> pVar, C15601d<? super R> dVar) {
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        C109094a aVar = new C109094a(this, mVar);
        synchronized (this.f326664i) {
            this.f326664i.mo159860b(aVar);
            C87412m.m108594g(pVar, "<this>");
            C66218h hVar = new C66218h(C66447b.m78392b(C66447b.m78391a(pVar, aVar, aVar)), C15911a.COROUTINE_SUSPENDED);
            Result.Companion companion = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        mVar.mo74599v(new C61180b(aVar));
        return mVar.mo74608o();
    }

    /* renamed from: D */
    public final void mo160338D(C109106l lVar, C109108n nVar) {
        synchronized (this.f326664i) {
            C108793e<C109094a<?>> eVar = this.f326665j;
            eVar.mo159862d(eVar.f325786f, this.f326664i);
        }
        try {
            int ordinal = nVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C108793e<C109094a<?>> eVar2 = this.f326665j;
                    int i = eVar2.f325786f;
                    if (i > 0) {
                        int i2 = i - 1;
                        T[] tArr = eVar2.f325784d;
                        do {
                            ((C109094a) tArr[i2]).mo160340g(lVar, nVar);
                            i2--;
                        } while (i2 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            C108793e<C109094a<?>> eVar3 = this.f326665j;
            int i3 = eVar3.f325786f;
            if (i3 > 0) {
                int i4 = 0;
                T[] tArr2 = eVar3.f325784d;
                do {
                    ((C109094a) tArr2[i4]).mo160340g(lVar, nVar);
                    i4++;
                } while (i4 < i3);
            }
        } finally {
            this.f326665j.mo159863e();
        }
    }

    /* renamed from: F */
    public long mo143031F(float f) {
        return this.f326662g.mo143031F(f);
    }

    /* renamed from: M */
    public int mo143032M(float f) {
        return this.f326662g.mo143032M(f);
    }

    /* renamed from: O */
    public float mo143033O(long j) {
        return this.f326662g.mo143033O(j);
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: T */
    public float mo143034T(float f) {
        return this.f326662g.mo143034T(f);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: d0 */
    public float mo143035d0(float f) {
        return this.f326662g.mo143035d0(f);
    }

    /* renamed from: g */
    public void mo160327g() {
        boolean z;
        C109106l lVar = this.f326666n;
        if (lVar != null) {
            List<C109111s> list = lVar.f326709a;
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= size) {
                    break;
                } else if (!(true ^ list.get(i2).f326720d)) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                List<C109111s> list2 = lVar.f326709a;
                ArrayList arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i < size2) {
                    C109111s sVar = list2.get(i);
                    long j = sVar.f326717a;
                    long j2 = sVar.f326719c;
                    long j3 = sVar.f326718b;
                    boolean z2 = sVar.f326720d;
                    long j4 = j3;
                    List<C109111s> list3 = list2;
                    C109111s sVar2 = r6;
                    long j5 = j2;
                    C109111s sVar3 = new C109111s(j, j3, j2, false, j4, j5, z2, z2, 1, C112539e.f336955b, (C8480h) null);
                    arrayList.add(sVar2);
                    i++;
                    list2 = list3;
                }
                C109106l lVar2 = new C109106l(arrayList);
                this.f326663h = lVar2;
                mo160338D(lVar2, C109108n.Initial);
                mo160338D(lVar2, C109108n.Main);
                mo160338D(lVar2, C109108n.Final);
                this.f326666n = null;
            }
        }
    }

    /* renamed from: g0 */
    public long mo143036g0(long j) {
        return this.f326662g.mo143036g0(j);
    }

    public float getDensity() {
        return this.f326662g.getDensity();
    }

    public float getFontScale() {
        return this.f326662g.getFontScale();
    }

    public C103633i2 getViewConfiguration() {
        return this.f326661f;
    }

    /* renamed from: i */
    public void mo160328i(C109106l lVar, C109108n nVar, long j) {
        C87412m.m108594g(lVar, "pointerEvent");
        C87412m.m108594g(nVar, StateEvent.ActionValue.STAGE_PASS);
        this.f326667o = j;
        if (nVar == C109108n.Initial) {
            this.f326663h = lVar;
        }
        mo160338D(lVar, nVar);
        List<C109111s> list = lVar.f326709a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!C109107m.m148149b(list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (!(!z)) {
            lVar = null;
        }
        this.f326666n = lVar;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: m */
    public float mo143039m(int i) {
        return this.f326662g.mo143039m(i);
    }

    /* renamed from: q */
    public long mo143040q(long j) {
        return this.f326662g.mo143040q(j);
    }

    /* renamed from: t0 */
    public C109117x mo160325t0() {
        return this;
    }
}
