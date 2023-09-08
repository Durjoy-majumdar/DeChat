package androidx.compose.p002ui.platform;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.view.View;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import d14.C45253g;
import d14.C58050i1;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import p175j0.C108494d2;
import p175j0.C60645c1;
import p175j0.C60661k1;
import p175j0.C60677q0;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2", "Landroidx/lifecycle/p;", "ui_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 */
public final class C54153xff837ba9 implements C103764p {

    /* renamed from: d */
    public final /* synthetic */ C0000n0 f152080d;

    /* renamed from: e */
    public final /* synthetic */ C60645c1 f152081e;

    /* renamed from: f */
    public final /* synthetic */ C60661k1 f152082f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<C54176k1> f152083g;

    /* renamed from: h */
    public final /* synthetic */ View f152084h;

    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$a */
    public /* synthetic */ class C54154a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f152085a;

        static {
            int[] iArr = new int[C39623j.C39625b.values().length];
            iArr[C39623j.C39625b.ON_CREATE.ordinal()] = 1;
            iArr[C39623j.C39625b.ON_START.ordinal()] = 2;
            iArr[C39623j.C39625b.ON_STOP.ordinal()] = 3;
            iArr[C39623j.C39625b.ON_DESTROY.ordinal()] = 4;
            iArr[C39623j.C39625b.ON_PAUSE.ordinal()] = 5;
            iArr[C39623j.C39625b.ON_RESUME.ordinal()] = 6;
            iArr[C39623j.C39625b.ON_ANY.ordinal()] = 7;
            f152085a = iArr;
        }
    }

    @C91590f(mo125468c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", mo125469f = "WindowRecomposer.android.kt", mo125470l = {391}, mo125471m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b */
    public static final class C54155b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f152086d;

        /* renamed from: e */
        public /* synthetic */ Object f152087e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<C54176k1> f152088f;

        /* renamed from: g */
        public final /* synthetic */ C60661k1 f152089g;

        /* renamed from: h */
        public final /* synthetic */ C0125s f152090h;

        /* renamed from: i */
        public final /* synthetic */ C54153xff837ba9 f152091i;

        /* renamed from: j */
        public final /* synthetic */ View f152092j;

        @C91590f(mo125468c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", mo125469f = "WindowRecomposer.android.kt", mo125470l = {386}, mo125471m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a */
        public static final class C54156a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f152093d;

            /* renamed from: e */
            public final /* synthetic */ C58050i1<Float> f152094e;

            /* renamed from: f */
            public final /* synthetic */ C54176k1 f152095f;

            /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a$a */
            public static final class C54157a implements C45253g<Float> {

                /* renamed from: d */
                public final /* synthetic */ C54176k1 f152096d;

                public C54157a(C54176k1 k1Var) {
                    this.f152096d = k1Var;
                }

                public Object emit(Object obj, C15601d dVar) {
                    float floatValue = ((Number) obj).floatValue();
                    ((C108494d2) this.f152096d.f152125d).setValue(Float.valueOf(floatValue));
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C54156a(C58050i1<Float> i1Var, C54176k1 k1Var, C15601d<? super C54156a> dVar) {
                super(2, dVar);
                this.f152094e = i1Var;
                this.f152095f = k1Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C54156a(this.f152094e, this.f152095f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                ((C54156a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                return C15911a.COROUTINE_SUSPENDED;
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f152093d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58050i1<Float> i1Var = this.f152094e;
                    C54157a aVar2 = new C54157a(this.f152095f);
                    this.f152093d = 1;
                    if (i1Var.mo31880a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                throw new C13600d();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54155b(C8479f0<C54176k1> f0Var, C60661k1 k1Var, C0125s sVar, C54153xff837ba9 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, C15601d<? super C54155b> dVar) {
            super(2, dVar);
            this.f152088f = f0Var;
            this.f152089g = k1Var;
            this.f152090h = sVar;
            this.f152091i = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
            this.f152092j = view;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C54155b bVar = new C54155b(this.f152088f, this.f152089g, this.f152090h, this.f152091i, this.f152092j, dVar);
            bVar.f152087e = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54155b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r11.f152086d
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r0 = r11.f152087e
                a14.z1 r0 = (a14.C53973z1) r0
                kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0013 }
                goto L_0x0094
            L_0x0013:
                r12 = move-exception
                goto L_0x00ae
            L_0x0016:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001e:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.f152087e
                r4 = r12
                a14.n0 r4 = (a14.C0000n0) r4
                gy3.f0<androidx.compose.ui.platform.k1> r12 = r11.f152088f     // Catch:{ all -> 0x00ac }
                T r12 = r12.f27484d     // Catch:{ all -> 0x00ac }
                androidx.compose.ui.platform.k1 r12 = (androidx.compose.p002ui.platform.C54176k1) r12     // Catch:{ all -> 0x00ac }
                if (r12 == 0) goto L_0x0064
                android.view.View r1 = r11.f152092j     // Catch:{ all -> 0x00ac }
                android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x00ac }
                android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x00ac }
                java.lang.String r5 = "context.applicationContext"
                gy3.C87412m.m108593f(r1, r5)     // Catch:{ all -> 0x00ac }
                d14.i1 r1 = androidx.compose.p002ui.platform.C54196x2.m60893a(r1)     // Catch:{ all -> 0x00ac }
                java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x00ac }
                java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x00ac }
                float r5 = r5.floatValue()     // Catch:{ all -> 0x00ac }
                j0.y0 r6 = r12.f152125d     // Catch:{ all -> 0x00ac }
                java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x00ac }
                j0.d2 r6 = (p175j0.C108494d2) r6     // Catch:{ all -> 0x00ac }
                r6.setValue(r5)     // Catch:{ all -> 0x00ac }
                r5 = 0
                r6 = 0
                androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a     // Catch:{ all -> 0x00ac }
                r7.<init>(r1, r12, r3)     // Catch:{ all -> 0x00ac }
                r8 = 3
                r9 = 0
                a14.z1 r12 = a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ac }
                goto L_0x0065
            L_0x0064:
                r12 = r3
            L_0x0065:
                j0.k1 r1 = r11.f152089g     // Catch:{ all -> 0x00a7 }
                r11.f152087e = r12     // Catch:{ all -> 0x00a7 }
                r11.f152086d = r2     // Catch:{ all -> 0x00a7 }
                r1.getClass()     // Catch:{ all -> 0x00a7 }
                j0.q1 r4 = new j0.q1     // Catch:{ all -> 0x00a7 }
                r4.<init>(r1, r3)     // Catch:{ all -> 0x00a7 }
                wx3.f r5 = r11.getContext()     // Catch:{ all -> 0x00a7 }
                j0.t0 r5 = p175j0.C60685u0.m70963a(r5)     // Catch:{ all -> 0x00a7 }
                j0.e r6 = r1.f172784a     // Catch:{ all -> 0x00a7 }
                j0.p1 r7 = new j0.p1     // Catch:{ all -> 0x00a7 }
                r7.<init>(r1, r4, r5, r3)     // Catch:{ all -> 0x00a7 }
                java.lang.Object r1 = a14.C53895h.m60469g(r6, r7, r11)     // Catch:{ all -> 0x00a7 }
                if (r1 != r0) goto L_0x0089
                goto L_0x008b
            L_0x0089:
                rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a7 }
            L_0x008b:
                if (r1 != r0) goto L_0x008e
                goto L_0x0090
            L_0x008e:
                rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a7 }
            L_0x0090:
                if (r1 != r0) goto L_0x0093
                return r0
            L_0x0093:
                r0 = r12
            L_0x0094:
                if (r0 == 0) goto L_0x0099
                a14.C53973z1.C53974a.m60623a(r0, r3, r2, r3)
            L_0x0099:
                androidx.lifecycle.s r12 = r11.f152090h
                androidx.lifecycle.j r12 = r12.getLifecycle()
                androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.f152091i
                r12.removeObserver(r0)
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            L_0x00a7:
                r0 = move-exception
                r10 = r0
                r0 = r12
                r12 = r10
                goto L_0x00ae
            L_0x00ac:
                r12 = move-exception
                r0 = r3
            L_0x00ae:
                if (r0 == 0) goto L_0x00b3
                a14.C53973z1.C53974a.m60623a(r0, r3, r2, r3)
            L_0x00b3:
                androidx.lifecycle.s r0 = r11.f152090h
                androidx.lifecycle.j r0 = r0.getLifecycle()
                androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.f152091i
                r0.removeObserver(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C54153xff837ba9.C54155b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C54153xff837ba9(C0000n0 n0Var, C60645c1 c1Var, C60661k1 k1Var, C8479f0<C54176k1> f0Var, View view) {
        this.f152080d = n0Var;
        this.f152081e = c1Var;
        this.f152082f = k1Var;
        this.f152083g = f0Var;
        this.f152084h = view;
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        boolean z;
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(bVar, "event");
        int i = C54154a.f152085a[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C60645c1 c1Var = this.f152081e;
                if (c1Var != null) {
                    C60677q0 q0Var = c1Var.f172752e;
                    synchronized (q0Var.f172830a) {
                        synchronized (q0Var.f172830a) {
                            z = q0Var.f172833d;
                        }
                        if (!z) {
                            List<C15601d<C13598b0>> list = q0Var.f172831b;
                            q0Var.f172831b = q0Var.f172832c;
                            q0Var.f172832c = list;
                            q0Var.f172833d = true;
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                Result.Companion companion = Result.Companion;
                                list.get(i2).resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                            }
                            list.clear();
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    }
                }
            } else if (i == 3) {
                C60645c1 c1Var2 = this.f152081e;
                if (c1Var2 != null) {
                    C60677q0 q0Var2 = c1Var2.f172752e;
                    synchronized (q0Var2.f172830a) {
                        q0Var2.f172833d = false;
                        C13598b0 b0Var2 = C13598b0.f38549a;
                    }
                }
            } else if (i == 4) {
                this.f152082f.mo85596u();
            }
        } else {
            C53895h.m60466d(this.f152080d, (C66212f) null, C53934p0.UNDISPATCHED, new C54155b(this.f152083g, this.f152082f, sVar, this, this.f152084h, (C15601d<? super C54155b>) null), 1, (Object) null);
        }
    }
}
