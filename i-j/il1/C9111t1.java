package il1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.widget.TextView;
import cl1.C0668l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import nj3.C76912y0;
import qo3.C101218e0;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C50555nj3;
import te3.C64390ga1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: il1.t1 */
public final class C9111t1 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C9093q1 f28698a;

    /* renamed from: b */
    public final /* synthetic */ C101218e0 f28699b;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveChargeIncreaseDurationWidget$showDurationIncreasePanel$2$1", mo125469f = "FinderLiveChargeIncreaseDurationWidget.kt", mo125470l = {172}, mo125471m = "invokeSuspend")
    /* renamed from: il1.t1$a */
    public static final class C9112a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f28700d;

        /* renamed from: e */
        public final /* synthetic */ C101218e0 f28701e;

        /* renamed from: f */
        public final /* synthetic */ C9093q1 f28702f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveChargeIncreaseDurationWidget$showDurationIncreasePanel$2$1$result$1", mo125469f = "FinderLiveChargeIncreaseDurationWidget.kt", mo125470l = {173}, mo125471m = "invokeSuspend")
        /* renamed from: il1.t1$a$a */
        public static final class C9113a extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends Boolean, ? extends String>>, Object> {

            /* renamed from: d */
            public int f28703d;

            /* renamed from: e */
            public final /* synthetic */ C9093q1 f28704e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9113a(C9093q1 q1Var, C15601d<? super C9113a> dVar) {
                super(2, dVar);
                this.f28704e = q1Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C9113a(this.f28704e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C9113a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: type inference failed for: r15v3, types: [android.content.Context] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r14.f28703d
                    r2 = 1
                    if (r1 == 0) goto L_0x0016
                    if (r1 != r2) goto L_0x000e
                    kotlin.ResultKt.throwOnFailure(r15)
                    goto L_0x0101
                L_0x000e:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L_0x0016:
                    kotlin.ResultKt.throwOnFailure(r15)
                    il1.q1 r15 = r14.f28704e
                    r14.f28703d = r2
                    r15.getClass()
                    java.lang.Class<cl1.u> r1 = cl1.C55001u.class
                    wx3.h r2 = new wx3.h
                    wx3.d r3 = xx3.C66447b.m78392b(r14)
                    r2.<init>(r3)
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "modifyChargeFreeTimeDuration "
                    r3.append(r4)
                    te3.nj3 r4 = r15.mo9902a()
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = "type:"
                    r5.append(r6)
                    r6 = 0
                    if (r4 == 0) goto L_0x004e
                    int r7 = r4.f138632d
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    goto L_0x004f
                L_0x004e:
                    r7 = r6
                L_0x004f:
                    r5.append(r7)
                    java.lang.String r7 = ",duration:"
                    r5.append(r7)
                    if (r4 == 0) goto L_0x0060
                    int r7 = r4.f138634f
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    goto L_0x0061
                L_0x0060:
                    r7 = r6
                L_0x0061:
                    r5.append(r7)
                    r7 = 45
                    r5.append(r7)
                    if (r4 == 0) goto L_0x0072
                    int r4 = r4.f138633e
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    goto L_0x0073
                L_0x0072:
                    r4 = r6
                L_0x0073:
                    r5.append(r4)
                    java.lang.String r4 = r5.toString()
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    java.lang.String r4 = "FinderLiveChargeIncreaseDurationWidget"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                    te3.e41 r3 = new te3.e41
                    r3.<init>()
                    te3.nj3 r4 = r15.mo9902a()
                    r3.f132677d = r4
                    fj1.b r4 = r15.f28670b
                    androidx.lifecycle.i0 r4 = r4.mo71262a(r1)
                    cl1.u r4 = (cl1.C55001u) r4
                    te3.c21 r4 = r4.f154420q
                    long r8 = r4.f182392d
                    fj1.b r4 = r15.f28670b
                    androidx.lifecycle.i0 r1 = r4.mo71262a(r1)
                    cl1.u r1 = (cl1.C55001u) r1
                    long r10 = r1.f154416j
                    r12 = 1
                    te3.mh0 r13 = new te3.mh0
                    r13.<init>()
                    r1 = 12
                    r13.f138028d = r1
                    byte[] r1 = r3.toByteArray()
                    pe3.b r1 = pe3.C89349b.m111674a(r1)
                    r13.f138029e = r1
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    dj1.p0 r1 = new dj1.p0
                    r7 = r1
                    r7.<init>(r8, r10, r12, r13)
                    android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    java.lang.String r4 = "getContext()"
                    gy3.C87412m.m108593f(r3, r4)
                    android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.content.res.Resources r4 = r4.getResources()
                    r5 = 2131830090(0x7f11254a, float:1.9293168E38)
                    java.lang.String r4 = r4.getString(r5)
                    r7 = 500(0x1f4, double:2.47E-321)
                    r1.mo85582k(r3, r4, r7)
                    nr3.e r1 = r1.mo9225i()
                    il1.p1 r3 = new il1.p1
                    r3.<init>(r2, r15)
                    r1.mo123420E(r3)
                    android.content.Context r15 = r15.f28669a
                    boolean r3 = r15 instanceof com.tencent.p014mm.p136ui.MMActivity
                    if (r3 == 0) goto L_0x00f5
                    r6 = r15
                    com.tencent.mm.ui.MMActivity r6 = (com.tencent.p014mm.p136ui.MMActivity) r6
                L_0x00f5:
                    if (r6 == 0) goto L_0x00fa
                    r1.mo11397F(r6)
                L_0x00fa:
                    java.lang.Object r15 = r2.mo90314b()
                    if (r15 != r0) goto L_0x0101
                    return r0
                L_0x0101:
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: il1.C9111t1.C9112a.C9113a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9112a(C101218e0 e0Var, C9093q1 q1Var, C15601d<? super C9112a> dVar) {
            super(2, dVar);
            this.f28701e = e0Var;
            this.f28702f = q1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C9112a(this.f28701e, this.f28702f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C9112a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            C64390ga1 ga12;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f28700d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53896h0 h0Var = C53872d1.f151119c;
                C9113a aVar2 = new C9113a(this.f28702f, (C15601d<? super C9113a>) null);
                this.f28700d = 1;
                obj = C53895h.m60469g(h0Var, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13604l lVar = (C13604l) obj;
            this.f28701e.mo140680z();
            if (((Boolean) lVar.f38555d).booleanValue()) {
                C76912y0.m92768g(this.f28702f.f28669a, (String) lVar.f38556e);
                C0668l lVar2 = (C0668l) this.f28702f.f28670b.mo71262a(C0668l.class);
                C50555nj3 a = this.f28702f.mo9902a();
                C87412m.m108594g(a, "previewInfo");
                int i2 = a.f138632d;
                if (i2 == 1) {
                    C64390ga1 ga13 = lVar2.f1577j;
                    if (ga13 != null) {
                        ga13.f183296e = a.f138633e;
                    }
                } else if (i2 == 2) {
                    int i3 = a.f138634f;
                    int c3 = lVar2.mo629c3(2);
                    if (1 > c3 || c3 >= i3) {
                        z = false;
                    }
                    if (z && (ga12 = lVar2.f1577j) != null) {
                        ga12.f183298g += i3 - c3;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("updateTrialInfoForModify to:");
                C64390ga1 ga14 = lVar2.f1577j;
                if (ga14 == null) {
                    str = "FinderLiveUrlOption:NULL!";
                } else {
                    str = "FinderLiveUrlOption:[" + ga14.f183296e + ',' + ga14.f183298g + ']';
                }
                sb.append(str);
                sb.append('!');
                Log.m105924i("LiveChargeSlice", sb.toString());
            } else {
                C9093q1 q1Var = this.f28702f;
                C101218e0 e0Var = new C101218e0(q1Var.f28669a, 2, 0);
                e0Var.mo140677w(q1Var.f28669a.getResources().getString(C0966R.string.f8028zq));
                e0Var.f296375F = new C9101r1(e0Var);
                e0Var.mo140676v(1);
                e0Var.mo140662i(C0966R.C0971layout.bzk);
                ((TextView) e0Var.f296384g.findViewById(C0966R.C0970id.khj)).setText((String) lVar.f38556e);
                e0Var.mo140655A();
            }
            return C13598b0.f38549a;
        }
    }

    public C9111t1(C9093q1 q1Var, C101218e0 e0Var) {
        this.f28698a = q1Var;
        this.f28699b = e0Var;
    }

    /* renamed from: a */
    public final void mo2001a() {
        C9093q1 q1Var = this.f28698a;
        C53895h.m60466d(q1Var.f28670b.f123702i, (C66212f) null, (C53934p0) null, new C9112a(this.f28699b, q1Var, (C15601d<? super C9112a>) null), 3, (Object) null);
    }
}
