package cl1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import c30.C104289g;
import cj1.C0572m5;
import cm1.C0740i2;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58087u0;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import he0.C46025n;
import he0.C59837i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import kotlin.ResultKt;
import o40.C61937h;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p239sv.C13784j;
import p239sv.C77792p;
import p248ug.C78157d;
import p40.C62192a;
import p910lj.C76701a;
import pe3.C89349b;
import qo3.C89779i0;
import rx3.C13598b0;
import sk1.C13696v;
import sk1.C63964u;
import sk1.C63965x;
import sx3.C64197v;
import te3.C49810i73;
import te3.C50533nf0;
import te3.C50917q51;
import te3.C51195s3;
import te3.C51298su0;
import te3.C51752vx0;
import te3.C52128yk0;
import te3.C64307d73;
import te3.C64399gj1;
import te3.C64426ho2;
import te3.C64434i11;
import te3.C64579nd;
import te3.C77917dy3;
import te3.t44;
import te3.z44;
import tf0.C13887q1;
import wx3.C15601d;
import wx3.C66212f;
import xk0.C91263b;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: cl1.h1 */
public final class C54979h1 extends C39970c<C45795b> {

    /* renamed from: p0 */
    public static final C0663a f154108p0 = new C0663a((C8480h) null);

    /* renamed from: A */
    public boolean f154109A;

    /* renamed from: B */
    public boolean f154110B;

    /* renamed from: C */
    public C89349b f154111C;

    /* renamed from: D */
    public String f154112D;

    /* renamed from: E */
    public C64399gj1 f154113E;

    /* renamed from: F */
    public long f154114F;

    /* renamed from: G */
    public LiveMutableData<C51298su0> f154115G = new LiveMutableData<>();

    /* renamed from: H */
    public C64426ho2 f154116H;

    /* renamed from: I */
    public t44 f154117I;

    /* renamed from: J */
    public long f154118J;

    /* renamed from: K */
    public C89349b f154119K;

    /* renamed from: L */
    public C89349b f154120L;

    /* renamed from: M */
    public String f154121M = "";

    /* renamed from: N */
    public boolean f154122N = true;

    /* renamed from: P */
    public final HashMap<Long, Integer> f154123P = new HashMap<>();

    /* renamed from: Q */
    public final HashMap<String, String> f154124Q = new HashMap<>();

    /* renamed from: R */
    public final HashMap<String, String> f154125R = new HashMap<>();

    /* renamed from: S */
    public C51752vx0 f154126S;

    /* renamed from: T */
    public boolean f154127T;

    /* renamed from: U */
    public String f154128U = "";

    /* renamed from: V */
    public final C58087u0<Boolean> f154129V;

    /* renamed from: W */
    public C50533nf0 f154130W;

    /* renamed from: X */
    public C0572m5 f154131X;

    /* renamed from: Y */
    public C52128yk0 f154132Y;

    /* renamed from: Z */
    public C50917q51 f154133Z;

    /* renamed from: f */
    public boolean f154134f;

    /* renamed from: g */
    public boolean f154135g;

    /* renamed from: h */
    public C58087u0<Boolean> f154136h;

    /* renamed from: i */
    public boolean f154137i;

    /* renamed from: j */
    public boolean f154138j;

    /* renamed from: n */
    public C64434i11 f154139n;

    /* renamed from: o */
    public C62192a<C0740i2> f154140o = new C62192a<>(new LinkedList(), (C8480h) null);

    /* renamed from: p */
    public C62192a<C0740i2> f154141p = new C62192a<>(new LinkedList(), (C8480h) null);

    /* renamed from: q */
    public boolean f154142q = true;

    /* renamed from: r */
    public boolean f154143r = true;

    /* renamed from: s */
    public final LinkedList<C63965x> f154144s = new LinkedList<>();

    /* renamed from: t */
    public LiveMutableData<Boolean> f154145t = new LiveMutableData<>();

    /* renamed from: u */
    public int f154146u;

    /* renamed from: v */
    public C0740i2 f154147v;

    /* renamed from: w */
    public long f154148w;

    /* renamed from: x */
    public ArrayList<Long> f154149x = new ArrayList<>();

    /* renamed from: y */
    public boolean f154150y;

    /* renamed from: z */
    public String f154151z = "";

    /* renamed from: cl1.h1$a */
    public static final class C0663a {
        public C0663a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo628a(LinkedList<z44> linkedList) {
            C87412m.m108594g(linkedList, "showBoxItems");
            if (linkedList.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (T next : linkedList) {
                int i2 = i + 1;
                if (i >= 0) {
                    sb.append("[index:" + i + ',');
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(C61937h.m72709h((z44) next));
                    sb4.append(']');
                    sb.append(sb4.toString());
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            String sb5 = sb.toString();
            C87412m.m108593f(sb5, "sb.toString()");
            return sb5;
        }
    }

    /* renamed from: cl1.h1$c */
    public static final class C0664c implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f1567d;

        /* renamed from: e */
        public final /* synthetic */ Context f1568e;

        /* renamed from: f */
        public final /* synthetic */ C54979h1 f1569f;

        public C0664c(C89779i0 i0Var, Context context, C54979h1 h1Var) {
            this.f1567d = i0Var;
            this.f1568e = context;
            this.f1569f = h1Var;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            this.f1567d.dismiss();
            C86709a0.m107524d().mo123470p(C91263b.CTRL_INDEX, this);
            if (i == 0 && i2 == 0) {
                C13784j jVar = yVar instanceof C13784j ? (C13784j) yVar : null;
                if (jVar != null) {
                    Context context = this.f1568e;
                    C54979h1 h1Var = this.f1569f;
                    C77917dy3 t = ((C13784j) yVar).mo13144t();
                    String str2 = t != null ? t.f227190d : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String nullAsNil = Util.nullAsNil(str2);
                    C87412m.m108593f(nullAsNil, "nullAsNil(userName)");
                    if (!(nullAsNil.length() > 0) || !((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2).mo62927s3()) {
                        h1Var.mo75940f3(context, jVar);
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("Chat_User", str2);
                    C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                }
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveShopSlice$tryToGetEcReponse$1", mo125469f = "LiveShopSlice.kt", mo125470l = {280, 299, 312}, mo125471m = "invokeSuspend")
    /* renamed from: cl1.h1$d */
    public static final class C39971d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f107148d;

        /* renamed from: e */
        public Object f107149e;

        /* renamed from: f */
        public Object f107150f;

        /* renamed from: g */
        public Object f107151g;

        /* renamed from: h */
        public int f107152h;

        /* renamed from: i */
        public final /* synthetic */ C54979h1 f107153i;

        /* renamed from: j */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f107154j;

        /* renamed from: n */
        public final /* synthetic */ int f107155n;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveShopSlice$tryToGetEcReponse$1$1", mo125469f = "LiveShopSlice.kt", mo125470l = {281}, mo125471m = "invokeSuspend")
        /* renamed from: cl1.h1$d$a */
        public static final class C39972a extends C91594j implements C32227p<C0000n0, C15601d<? super C51752vx0>, Object> {

            /* renamed from: d */
            public int f107156d;

            /* renamed from: e */
            public final /* synthetic */ C54979h1 f107157e;

            /* renamed from: f */
            public final /* synthetic */ int f107158f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39972a(C54979h1 h1Var, int i, C15601d<? super C39972a> dVar) {
                super(2, dVar);
                this.f107157e = h1Var;
                this.f107158f = i;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C39972a(this.f107157e, this.f107158f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C39972a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
                r13 = r13.f132825d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r12.f107156d
                    r3 = 1
                    if (r2 == 0) goto L_0x0017
                    if (r2 != r3) goto L_0x000f
                    kotlin.ResultKt.throwOnFailure(r13)
                    goto L_0x0051
                L_0x000f:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L_0x0017:
                    kotlin.ResultKt.throwOnFailure(r13)
                    java.lang.Class<tf0.q1> r13 = tf0.C13887q1.class
                    di3.d r13 = di3.C86312j.m106911c(r13)
                    r4 = r13
                    tf0.q1 r4 = (tf0.C13887q1) r4
                    cl1.h1 r13 = r12.f107157e
                    androidx.lifecycle.i0 r13 = r13.business(r0)
                    cl1.u r13 = (cl1.C55001u) r13
                    long r5 = r13.f154416j
                    cl1.h1 r13 = r12.f107157e
                    androidx.lifecycle.i0 r13 = r13.business(r0)
                    cl1.u r13 = (cl1.C55001u) r13
                    te3.c21 r13 = r13.f154420q
                    long r7 = r13.f182392d
                    int r9 = r12.f107158f
                    cl1.h1 r13 = r12.f107157e
                    java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                    androidx.lifecycle.i0 r13 = r13.business(r0)
                    cl1.o r13 = (cl1.C54991o) r13
                    java.lang.String r10 = r13.f154345o
                    r12.f107156d = r3
                    r11 = r12
                    java.lang.Object r13 = r4.mo13307Fo(r5, r7, r9, r10, r11)
                    if (r13 != r1) goto L_0x0051
                    return r1
                L_0x0051:
                    te3.ea1 r13 = (te3.C49255ea1) r13
                    te3.vx0 r0 = new te3.vx0
                    r0.<init>()
                    r1 = 0
                    if (r13 == 0) goto L_0x0064
                    pe3.b r13 = r13.f132825d
                    if (r13 == 0) goto L_0x0064
                    byte[] r13 = r13.mo123703f()
                    goto L_0x0065
                L_0x0064:
                    r13 = r1
                L_0x0065:
                    if (r13 != 0) goto L_0x0069
                L_0x0067:
                    r0 = r1
                    goto L_0x007b
                L_0x0069:
                    r0.parseFrom(r13)     // Catch:{ Exception -> 0x006d }
                    goto L_0x007b
                L_0x006d:
                    r13 = move-exception
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r2 = 0
                    r0[r2] = r13
                    java.lang.String r13 = "safeParser"
                    java.lang.String r2 = ""
                    com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r2, r0)
                    goto L_0x0067
                L_0x007b:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: cl1.C54979h1.C39971d.C39972a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveShopSlice$tryToGetEcReponse$1$2$fetchHotSellAnimResult$1", mo125469f = "LiveShopSlice.kt", mo125470l = {313}, mo125471m = "invokeSuspend")
        /* renamed from: cl1.h1$d$b */
        public static final class C39973b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

            /* renamed from: d */
            public int f107159d;

            /* renamed from: e */
            public final /* synthetic */ String f107160e;

            /* renamed from: f */
            public final /* synthetic */ String f107161f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39973b(String str, String str2, C15601d<? super C39973b> dVar) {
                super(2, dVar);
                this.f107160e = str;
                this.f107161f = str2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C39973b(this.f107160e, this.f107161f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C39973b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f107159d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = this.f107160e;
                    String str2 = this.f107161f;
                    this.f107159d = 1;
                    obj = ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13329Sg(str, str2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveShopSlice$tryToGetEcReponse$1$2$firstBagAnimResult$1", mo125469f = "LiveShopSlice.kt", mo125470l = {300}, mo125471m = "invokeSuspend")
        /* renamed from: cl1.h1$d$c */
        public static final class C39974c extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

            /* renamed from: d */
            public int f107162d;

            /* renamed from: e */
            public final /* synthetic */ String f107163e;

            /* renamed from: f */
            public final /* synthetic */ String f107164f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39974c(String str, String str2, C15601d<? super C39974c> dVar) {
                super(2, dVar);
                this.f107163e = str;
                this.f107164f = str2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C39974c(this.f107163e, this.f107164f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C39974c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f107162d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = this.f107163e;
                    String str2 = this.f107164f;
                    this.f107162d = 1;
                    obj = ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13329Sg(str, str2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39971d(C54979h1 h1Var, C32226l<? super Boolean, C13598b0> lVar, int i, C15601d<? super C39971d> dVar) {
            super(2, dVar);
            this.f107153i = h1Var;
            this.f107154j = lVar;
            this.f107155n = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C39971d(this.f107153i, this.f107154j, this.f107155n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C39971d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x014b  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0150 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r3 = r0.f107152h
                java.lang.String r4 = ""
                java.lang.String r5 = "MMFinder.LiveShopSlice"
                r6 = 3
                r7 = 2
                r8 = 0
                r9 = 1
                r10 = 0
                if (r3 == 0) goto L_0x0052
                if (r3 == r9) goto L_0x0048
                if (r3 == r7) goto L_0x0030
                if (r3 != r6) goto L_0x0028
                java.lang.Object r1 = r0.f107149e
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r2 = r0.f107148d
                java.lang.String r2 = (java.lang.String) r2
                kotlin.ResultKt.throwOnFailure(r17)
                r3 = r17
                goto L_0x0176
            L_0x0028:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0030:
                java.lang.Object r3 = r0.f107151g
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r7 = r0.f107150f
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r11 = r0.f107149e
                te3.vx0 r11 = (te3.C51752vx0) r11
                java.lang.Object r12 = r0.f107148d
                fy3.l r12 = (fy3.C32226l) r12
                kotlin.ResultKt.throwOnFailure(r17)
                r13 = r7
                r7 = r17
                goto L_0x00eb
            L_0x0048:
                java.lang.Object r3 = r0.f107148d
                cl1.h1 r3 = (cl1.C54979h1) r3
                kotlin.ResultKt.throwOnFailure(r17)
                r11 = r17
                goto L_0x006b
            L_0x0052:
                kotlin.ResultKt.throwOnFailure(r17)
                cl1.h1 r3 = r0.f107153i
                a14.h0 r11 = a14.C53872d1.f151119c
                cl1.h1$d$a r12 = new cl1.h1$d$a
                int r13 = r0.f107155n
                r12.<init>(r3, r13, r8)
                r0.f107148d = r3
                r0.f107152h = r9
                java.lang.Object r11 = a14.C53895h.m60469g(r11, r12, r0)
                if (r11 != r2) goto L_0x006b
                return r2
            L_0x006b:
                te3.vx0 r11 = (te3.C51752vx0) r11
                r3.mo75944k3(r11)
                cl1.h1 r3 = r0.f107153i
                r3.f154127T = r10
                boolean r11 = r3.f154134f
                if (r11 != 0) goto L_0x0088
                boolean r11 = r3.f154137i
                if (r11 != 0) goto L_0x0088
                fy3.l<java.lang.Boolean, rx3.b0> r1 = r0.f107154j
                if (r1 == 0) goto L_0x0085
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r1.invoke(r2)
            L_0x0085:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x0088:
                te3.vx0 r11 = r3.f154126S
                if (r11 == 0) goto L_0x01a3
                fy3.l<java.lang.Boolean, rx3.b0> r12 = r0.f107154j
                te3.w44 r3 = r11.f143755d
                if (r3 == 0) goto L_0x00a2
                te3.u44 r3 = r3.f143856e
                if (r3 == 0) goto L_0x00a2
                java.util.LinkedList<java.lang.String> r3 = r3.f142599g
                if (r3 == 0) goto L_0x00a2
                java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 != 0) goto L_0x00a3
            L_0x00a2:
                r3 = r4
            L_0x00a3:
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r3)
                di3.d r14 = di3.C86312j.m106911c(r1)
                tf0.p1 r14 = (tf0.C64916p1) r14
                java.lang.String r15 = "firstBagAnimMd5Str"
                gy3.C87412m.m108593f(r13, r15)
                java.lang.String r15 = "shop_ec_bag"
                java.lang.String r13 = r14.mo76726wa(r15, r13)
                int r14 = r3.length()
                if (r14 != 0) goto L_0x00c1
                r14 = 1
                goto L_0x00c2
            L_0x00c1:
                r14 = 0
            L_0x00c2:
                if (r14 != 0) goto L_0x00f2
                if (r13 == 0) goto L_0x00cf
                int r14 = r13.length()
                if (r14 != 0) goto L_0x00cd
                goto L_0x00cf
            L_0x00cd:
                r14 = 0
                goto L_0x00d0
            L_0x00cf:
                r14 = 1
            L_0x00d0:
                if (r14 == 0) goto L_0x00d3
                goto L_0x00f2
            L_0x00d3:
                a14.h0 r14 = a14.C53872d1.f151119c
                cl1.h1$d$c r15 = new cl1.h1$d$c
                r15.<init>(r3, r13, r8)
                r0.f107148d = r12
                r0.f107149e = r11
                r0.f107150f = r13
                r0.f107151g = r3
                r0.f107152h = r7
                java.lang.Object r7 = a14.C53895h.m60469g(r14, r15, r0)
                if (r7 != r2) goto L_0x00eb
                return r2
            L_0x00eb:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                goto L_0x00f3
            L_0x00f2:
                r7 = 0
            L_0x00f3:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "tryToGetEcReponse firstBagAnimUrl:"
                r14.append(r15)
                r14.append(r3)
                java.lang.String r3 = ",firstBagAnimPath:"
                r14.append(r3)
                r14.append(r13)
                java.lang.String r3 = ",firstBagAnimResult:"
                r14.append(r3)
                r14.append(r7)
                java.lang.String r3 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                if (r12 == 0) goto L_0x0121
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
                r12.invoke(r3)
            L_0x0121:
                te3.w44 r3 = r11.f143755d
                if (r3 == 0) goto L_0x012f
                te3.ah2 r3 = r3.f143855d
                if (r3 == 0) goto L_0x012f
                java.lang.String r3 = r3.f130531g
                if (r3 != 0) goto L_0x012e
                goto L_0x012f
            L_0x012e:
                r4 = r3
            L_0x012f:
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r4)
                di3.d r1 = di3.C86312j.m106911c(r1)
                tf0.p1 r1 = (tf0.C64916p1) r1
                java.lang.String r7 = "hotSellMd5Str"
                gy3.C87412m.m108593f(r3, r7)
                java.lang.String r7 = "shop_ec_hot_sell"
                java.lang.String r1 = r1.mo76726wa(r7, r3)
                int r3 = r4.length()
                if (r3 != 0) goto L_0x014d
                r3 = 1
                goto L_0x014e
            L_0x014d:
                r3 = 0
            L_0x014e:
                if (r3 != 0) goto L_0x017d
                if (r1 == 0) goto L_0x015a
                int r3 = r1.length()
                if (r3 != 0) goto L_0x0159
                goto L_0x015a
            L_0x0159:
                r9 = 0
            L_0x015a:
                if (r9 == 0) goto L_0x015d
                goto L_0x017d
            L_0x015d:
                a14.h0 r3 = a14.C53872d1.f151119c
                cl1.h1$d$b r7 = new cl1.h1$d$b
                r7.<init>(r4, r1, r8)
                r0.f107148d = r4
                r0.f107149e = r1
                r0.f107150f = r8
                r0.f107151g = r8
                r0.f107152h = r6
                java.lang.Object r3 = a14.C53895h.m60469g(r3, r7, r0)
                if (r3 != r2) goto L_0x0175
                return r2
            L_0x0175:
                r2 = r4
            L_0x0176:
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r10 = r3.booleanValue()
                r4 = r2
            L_0x017d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "tryToGetEcReponse hotSellUrl:"
                r2.append(r3)
                r2.append(r4)
                java.lang.String r3 = " ,hotSellPath:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " ,fetchHotSellAnimResult:"
                r2.append(r1)
                r2.append(r10)
                java.lang.String r1 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                goto L_0x01ac
            L_0x01a3:
                fy3.l<java.lang.Boolean, rx3.b0> r1 = r0.f107154j
                if (r1 == 0) goto L_0x01ac
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r1.invoke(r2)
            L_0x01ac:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cl1.C54979h1.C39971d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: cl1.h1$b */
    public static final class C54980b extends C87413o implements C32226l<C0740i2, Boolean> {

        /* renamed from: d */
        public static final C54980b f154152d = new C54980b();

        public C54980b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C0740i2 i2Var = (C0740i2) obj;
            C87412m.m108594g(i2Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf((i2Var instanceof C63965x) || (i2Var instanceof C63964u) || ((i2Var instanceof C13696v) && ((C13696v) i2Var).f38758E));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54979h1(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        Boolean bool = Boolean.FALSE;
        this.f154136h = C58056k1.m67214a(bool);
        this.f154129V = C58056k1.m67214a(bool);
    }

    /* renamed from: F3 */
    public final void mo75935F3(boolean z) {
        if (z != this.f154137i) {
            Log.m105924i("MMFinder.LiveShopSlice", "shoppingAvailable:from " + this.f154137i + " to " + z + '!');
            if (z) {
                mo75936G3(((C54991o) business(C54991o.class)).mo75971M3(), (C32226l<? super Boolean, C13598b0>) null);
            }
        }
        ((C58052j1) this.f154136h).setValue(Boolean.valueOf(z));
        this.f154137i = z;
    }

    /* renamed from: G3 */
    public final void mo75936G3(int i, C32226l<? super Boolean, C13598b0> lVar) {
        if (this.f154126S == null && !this.f154127T) {
            this.f154127T = true;
            C53895h.m60466d(this.f107146d.f123702i, (C66212f) null, (C53934p0) null, new C39971d(this, lVar, i, (C15601d<? super C39971d>) null), 3, (Object) null);
        } else if (lVar != null) {
            lVar.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: c3 */
    public final List<C0740i2> mo75937c3() {
        List<C0740i2> a = this.f154140o.mo87250a();
        ArrayList arrayList = new ArrayList();
        for (T next : a) {
            if (next instanceof C13696v) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: d3 */
    public final boolean mo75938d3() {
        boolean z;
        C62192a<C0740i2> aVar = this.f154140o;
        C54980b bVar = C54980b.f154152d;
        aVar.getClass();
        C87412m.m108594g(bVar, "predicate");
        List<E> list = aVar.f127225a;
        C87412m.m108593f(list, "list");
        synchronized (list) {
            z = false;
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Boolean) bVar.invoke(it.next())).booleanValue()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: e3 */
    public final C64399gj1 mo75939e3() {
        return this.f154113E;
    }

    /* renamed from: f3 */
    public final void mo75940f3(Context context, C13784j jVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C77917dy3 t = jVar.mo13144t();
        if (t != null) {
            String str = t.f227190d;
            String nullAsNil = Util.nullAsNil(str);
            C87412m.m108593f(nullAsNil, "nullAsNil(userName)");
            if (nullAsNil.length() > 0) {
                ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                Intent intent = new Intent();
                C78157d.m94368a(intent, t, 161);
                C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                return;
            }
            C76701a.makeText(context, (int) C0966R.string.e5d, 0).show();
        }
    }

    /* renamed from: g3 */
    public final void mo75941g3(Context context, NativeInfo nativeInfo) {
        Class cls = C54991o.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(nativeInfo, "info");
        String str = ((C54991o) business(cls)).f154345o;
        C64579nd ndVar = new C64579nd();
        C104289g gVar = new C104289g(nativeInfo.necessary_params);
        ndVar.f184462d = gVar.optString("kf_url");
        ndVar.f184463e = gVar.optString("corp_subject");
        ndVar.f184464f = gVar.optString("contact_id");
        ndVar.f184465g = gVar.optInt("bind_source");
        String optString = gVar.optString("finder_username");
        if (!(!(optString == null || optString.length() == 0))) {
            optString = null;
        }
        if (optString != null) {
            str = optString;
        }
        int i = nativeInfo.native_type;
        if (i == 7) {
            Log.m105924i("MMFinder.LiveShopSlice", "[jumpRetentionKefu] kfUrl=" + ndVar.f184462d);
            C59837i iVar = (C59837i) C86312j.m106911c(C59837i.class);
            if (iVar != null) {
                OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new OpenIMKefuStartConversationRequest();
                openIMKefuStartConversationRequest.f108515d = context;
                openIMKefuStartConversationRequest.f108516e = System.currentTimeMillis();
                openIMKefuStartConversationRequest.f108517f = 19;
                C51195s3 s3Var = new C51195s3();
                s3Var.f141285d = ndVar.f184462d;
                C49810i73 i732 = new C49810i73();
                int i2 = openIMKefuStartConversationRequest.f108517f;
                i732.f135154d = i2;
                i732.f135156f = ndVar.f184462d;
                i732.f135155e = ndVar.f184464f;
                s3Var.f141288g = i732;
                openIMKefuStartConversationRequest.f108520i = s3Var;
                openIMKefuStartConversationRequest.f108519h = C46025n.m51344a(i2);
                iVar.mo71855jT(openIMKefuStartConversationRequest);
            }
        } else if (i == 26) {
            C86709a0.m107524d().mo123455a(C91263b.CTRL_INDEX, new C0664c(C89779i0.m112248e(context, context.getString(C0966R.string.gat), true, 3, (DialogInterface.OnCancelListener) null), context, this));
            C89137b0 d = C86709a0.m107524d();
            String str2 = ndVar.f184464f;
            C64307d73 d732 = new C64307d73();
            d732.f182645e = str;
            d732.f182644d = 3;
            d732.f182646f = ((C54991o) business(cls)).f154241Q;
            C13598b0 b0Var = C13598b0.f38549a;
            C13784j X20 = ((C77792p) C86312j.m106911c(C77792p.class)).X20(str2, true, d732);
            C87412m.m108592e(X20, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d.mo123460f((C117747y) X20);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75942i3(java.util.List<? extends te3.C64370fp1> r7) {
        /*
            r6 = this;
            java.lang.Class<cl1.f1> r0 = cl1.C54974f1.class
            r1 = 0
            if (r7 == 0) goto L_0x0050
            java.util.Iterator r7 = r7.iterator()
        L_0x0009:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r7.next()
            r3 = r2
            te3.fp1 r3 = (te3.C64370fp1) r3
            te3.yh3 r3 = r3.f183160E
            r4 = 0
            if (r3 == 0) goto L_0x0022
            int r3 = r3.f186537i
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 != r5) goto L_0x0022
            r4 = 1
        L_0x0022:
            if (r4 == 0) goto L_0x0009
            goto L_0x0026
        L_0x0025:
            r2 = r1
        L_0x0026:
            te3.fp1 r2 = (te3.C64370fp1) r2
            if (r2 == 0) goto L_0x0050
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r3 = "save recording product, id:"
            r7.append(r3)
            long r3 = r2.f183176d
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            java.lang.String r3 = "MMFinder.LiveShopSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            fj1.b r7 = r6.f107146d
            androidx.lifecycle.i0 r7 = r7.mo71262a(r0)
            cl1.f1 r7 = (cl1.C54974f1) r7
            r7.mo75934c3(r2)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x0051
        L_0x0050:
            r7 = r1
        L_0x0051:
            if (r7 != 0) goto L_0x005e
            fj1.b r7 = r6.f107146d
            androidx.lifecycle.i0 r7 = r7.mo71262a(r0)
            cl1.f1 r7 = (cl1.C54974f1) r7
            r7.mo75934c3(r1)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54979h1.mo75942i3(java.util.List):void");
    }

    /* renamed from: j3 */
    public final void mo75943j3(boolean z) {
        if (z != this.f154134f) {
            Log.m105924i("MMFinder.LiveShopSlice", "bindShop:from " + this.f154134f + " to " + z + '!');
            if (z) {
                mo75936G3(((C54991o) business(C54991o.class)).mo75971M3(), (C32226l<? super Boolean, C13598b0>) null);
            }
        }
        this.f154134f = z;
    }

    /* renamed from: k3 */
    public final void mo75944k3(C51752vx0 vx02) {
        if (!C87412m.m108589b(vx02, this.f154126S)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ecReponse ");
            sb.append(C61937h.m72709h(vx02 == null ? "" : vx02));
            Log.m105924i("MMFinder.LiveShopSlice", sb.toString());
        }
        this.f154126S = vx02;
    }

    /* renamed from: l3 */
    public final void mo75945l3(C50533nf0 nf02) {
        this.f154130W = nf02;
        StringBuilder sb = new StringBuilder();
        sb.append("get flash sale config: entrance = ");
        C50533nf0 nf03 = this.f154130W;
        String str = null;
        sb.append(nf03 != null ? Integer.valueOf(nf03.f138581f) : null);
        sb.append(", appId = ");
        C50533nf0 nf04 = this.f154130W;
        sb.append(nf04 != null ? nf04.f138579d : null);
        sb.append(", path = ");
        C50533nf0 nf05 = this.f154130W;
        if (nf05 != null) {
            str = nf05.f138580e;
        }
        sb.append(str);
        Log.m105918d("MMFinder.LiveShopSlice", sb.toString());
    }

    /* renamed from: m3 */
    public final void mo75946m3(C0572m5 m5Var) {
        this.f154131X = m5Var;
        StringBuilder sb = new StringBuilder();
        sb.append("get flash sale info: expireTime = ");
        C0572m5 m5Var2 = this.f154131X;
        Integer num = null;
        sb.append(m5Var2 != null ? Integer.valueOf(m5Var2.f1373b) : null);
        sb.append(", cancle = ");
        C0572m5 m5Var3 = this.f154131X;
        if (m5Var3 != null) {
            num = Integer.valueOf(m5Var3.f1374c);
        }
        sb.append(num);
        Log.m105918d("MMFinder.LiveShopSlice", sb.toString());
    }

    /* renamed from: n3 */
    public final void mo75947n3(C64434i11 i112) {
        StringBuilder sb = new StringBuilder();
        sb.append("FinderLiveGetShopShelfResponse:");
        sb.append(C61937h.m72709h(i112 == null ? "" : i112));
        Log.m105924i("MMFinder.LiveShopSlice", sb.toString());
        this.f154139n = i112;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: sk1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: sk1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: sk1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75948o3(cm1.C0740i2 r9) {
        /*
            r8 = this;
            boolean r0 = r8.f154138j
            r1 = 0
            r3 = 0
            java.lang.String r4 = "MMFinder.LiveShopSlice"
            if (r0 != 0) goto L_0x0020
            boolean r0 = r8.f154137i
            if (r0 != 0) goto L_0x0020
            boolean r0 = r9 instanceof sk1.C63965x
            if (r0 != 0) goto L_0x0015
            boolean r0 = r9 instanceof sk1.C13696v
            if (r0 == 0) goto L_0x0020
        L_0x0015:
            r8.f154148w = r1
            r8.f154147v = r3
            java.lang.String r9 = "shoppingAvailable false, reset promotingProduct"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            return
        L_0x0020:
            boolean r0 = r9 instanceof sk1.C63965x
            r5 = 0
            if (r0 == 0) goto L_0x00a6
            er1.j4 r0 = er1.C58739j4.f168176a
            boolean r0 = r0.mo83692U()
            if (r0 == 0) goto L_0x006b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promotingProduct ShelfProductInfo"
            r0.append(r1)
            r1 = r9
            sk1.x r1 = (sk1.C63965x) r1
            java.lang.String r2 = r1.f181348u
            r0.append(r2)
            r2 = 45
            r0.append(r2)
            long r6 = r1.f181347t
            r0.append(r6)
            java.lang.String r2 = ",showBox:"
            r0.append(r2)
            cl1.h1$a r2 = f154108p0
            te3.fp1 r1 = r1.f181346s
            java.util.LinkedList<te3.z44> r1 = r1.f183165J
            java.lang.String r6 = "value.data.show_box_items"
            gy3.C87412m.m108593f(r1, r6)
            java.lang.String r1 = r2.mo628a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r4, r0, r1)
            goto L_0x0084
        L_0x006b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promotingProduct ShelfProductInfo:"
            r0.append(r1)
            r1 = r9
            sk1.x r1 = (sk1.C63965x) r1
            long r1 = r1.f181347t
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x0084:
            r0 = r9
            sk1.x r0 = (sk1.C63965x) r0
            long r1 = r0.f181291d
            r8.f154148w = r1
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r8.business(r1)
            cl1.o r1 = (cl1.C54991o) r1
            if (r0 == 0) goto L_0x009b
            te3.fp1 r0 = r0.f181346s
            if (r0 == 0) goto L_0x009b
            java.lang.String r3 = r0.f183193x
        L_0x009b:
            if (r3 != 0) goto L_0x009f
            java.lang.String r3 = ""
        L_0x009f:
            r1.mo75961G4(r3)
            r8.f154147v = r9
            goto L_0x021b
        L_0x00a6:
            boolean r0 = r9 instanceof sk1.C63964u
            if (r0 == 0) goto L_0x00cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promotingProduct ShopWindowAdItem:"
            r0.append(r1)
            r1 = r9
            sk1.u r1 = (sk1.C63964u) r1
            te3.s81 r2 = r1.f181325s
            long r2 = r2.f185374d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r0 = r1.f181291d
            r8.f154148w = r0
            r8.f154147v = r9
            goto L_0x021b
        L_0x00cd:
            boolean r0 = r9 instanceof sk1.C13696v
            if (r0 == 0) goto L_0x00f4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promotingProduct ShopCouponItem:"
            r0.append(r1)
            r1 = r9
            sk1.v r1 = (sk1.C13696v) r1
            long r2 = r1.getItemId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r0 = r1.f181291d
            r8.f154148w = r0
            r8.f154147v = r9
            goto L_0x021b
        L_0x00f4:
            boolean r0 = r9 instanceof sk1.C63960p
            if (r0 == 0) goto L_0x011b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promotingProduct PromoteLiveWeComItem:"
            r0.append(r1)
            r1 = r9
            sk1.p r1 = (sk1.C63960p) r1
            long r2 = r1.getItemId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r0 = r1.f181291d
            r8.f154148w = r0
            r8.f154147v = r9
            goto L_0x021b
        L_0x011b:
            boolean r0 = r9 instanceof sk1.C63959n
            if (r0 == 0) goto L_0x0142
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promotingProduct PromoteLiveMpArticleItem:"
            r0.append(r1)
            r1 = r9
            sk1.n r1 = (sk1.C63959n) r1
            long r2 = r1.getItemId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r0 = r1.f181291d
            r8.f154148w = r0
            r8.f154147v = r9
            goto L_0x021b
        L_0x0142:
            boolean r0 = r9 instanceof sk1.C13695o
            if (r0 == 0) goto L_0x0169
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promotingProduct PromoteLiveNoticeItem:"
            r0.append(r1)
            r1 = r9
            sk1.o r1 = (sk1.C13695o) r1
            long r2 = r1.getItemId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r0 = r1.f181291d
            r8.f154148w = r0
            r8.f154147v = r9
            goto L_0x021b
        L_0x0169:
            boolean r0 = r9 instanceof sk1.C63962r
            if (r0 == 0) goto L_0x0190
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promotingProduct PromoteRedPacketItem:"
            r0.append(r1)
            r1 = r9
            sk1.r r1 = (sk1.C63962r) r1
            long r2 = r1.getItemId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r0 = r1.f181291d
            r8.f154148w = r0
            r8.f154147v = r9
            goto L_0x021b
        L_0x0190:
            boolean r0 = r9 instanceof sk1.C63958m
            if (r0 == 0) goto L_0x01b6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promotingProduct PromoteH5HalfItem:"
            r0.append(r1)
            r1 = r9
            sk1.m r1 = (sk1.C63958m) r1
            long r2 = r1.getItemId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r0 = r1.f181291d
            r8.f154148w = r0
            r8.f154147v = r9
            goto L_0x021b
        L_0x01b6:
            boolean r0 = r9 instanceof sk1.C63957l
            if (r0 == 0) goto L_0x01dc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promotingProduct PromoteGameItem:"
            r0.append(r1)
            r1 = r9
            sk1.l r1 = (sk1.C63957l) r1
            long r2 = r1.getItemId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r0 = r1.f181291d
            r8.f154148w = r0
            r8.f154147v = r9
            goto L_0x021b
        L_0x01dc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "promotingProduct: invalid or null: "
            r0.append(r6)
            if (r9 != 0) goto L_0x01e9
            r5 = 1
        L_0x01e9:
            r0.append(r5)
            java.lang.String r5 = ", type: "
            r0.append(r5)
            boolean r5 = r9 instanceof sk1.C63956k
            if (r5 == 0) goto L_0x01f9
            r6 = r9
            sk1.k r6 = (sk1.C63956k) r6
            goto L_0x01fa
        L_0x01f9:
            r6 = r3
        L_0x01fa:
            if (r6 == 0) goto L_0x0203
            int r6 = r6.f181298n
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0204
        L_0x0203:
            r6 = r3
        L_0x0204:
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            if (r5 == 0) goto L_0x0213
            r3 = r9
            sk1.k r3 = (sk1.C63956k) r3
        L_0x0213:
            if (r3 == 0) goto L_0x0217
            long r1 = r3.f181291d
        L_0x0217:
            r8.f154148w = r1
            r8.f154147v = r9
        L_0x021b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "promotingInfoId has update to:"
            r9.append(r0)
            long r0 = r8.f154148w
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54979h1.mo75948o3(cm1.i2):void");
    }

    public void onCleared() {
        this.f154110B = false;
        this.f154111C = null;
        this.f154146u = 0;
        this.f154140o.f127225a.clear();
        mo75943j3(false);
        this.f154135g = false;
        mo75935F3(false);
        mo75947n3((C64434i11) null);
        mo75948o3((C0740i2) null);
        this.f154149x.clear();
        this.f154150y = false;
        this.f154151z = "";
        this.f154114F = 0;
        this.f154118J = 0;
        Log.m105924i("MMFinder.LiveShopSlice", "shouldPlayBagAnim:" + this.f154122N);
        this.f154122N = false;
        this.f154123P.clear();
        mo75944k3((C51752vx0) null);
        this.f154117I = null;
        this.f154121M = "";
        this.f154128U = "";
        this.f154138j = false;
        this.f154119K = null;
        this.f154120L = null;
        this.f154133Z = null;
        this.f154142q = true;
        this.f154143r = true;
        mo75946m3((C0572m5) null);
    }
}
