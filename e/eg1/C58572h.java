package eg1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import cj1.C54738b1;
import cm1.C0740i2;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import dj1.C45366h0;
import dp1.C58358d0;
import dp1.C58418z1;
import ei3.C86522b;
import er1.C58708d1;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C46108j1;
import ht1.C8808v4;
import java.util.ArrayList;
import java.util.List;
import jp3.C9487b;
import ky2.C10432i;
import ls3.C10649f;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import p565ir.C60606n;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C50008jm0;
import te3.C50851pn0;
import te3.C64238ap2;
import te3.C64254b81;
import te3.C64256b90;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64634po2;
import te3.C64686ro2;
import tf0.C64916p1;
import up1.C65426w0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

@C86522b
/* renamed from: eg1.h */
public final class C58572h extends C86301e implements C10649f {

    /* renamed from: d */
    public final String f167658d = "Finder.FinderEnterLiveFeatureService";

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.FinderEnterLiveFeatureService$enterLive$2", mo125469f = "FinderEnterLiveFeatureService.kt", mo125470l = {112}, mo125471m = "invokeSuspend")
    /* renamed from: eg1.h$a */
    public static final class C58573a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f167659d;

        /* renamed from: e */
        public Object f167660e;

        /* renamed from: f */
        public Object f167661f;

        /* renamed from: g */
        public Object f167662g;

        /* renamed from: h */
        public Object f167663h;

        /* renamed from: i */
        public int f167664i;

        /* renamed from: j */
        public final /* synthetic */ Intent f167665j;

        /* renamed from: n */
        public final /* synthetic */ C64238ap2 f167666n;

        /* renamed from: o */
        public final /* synthetic */ C58572h f167667o;

        /* renamed from: p */
        public final /* synthetic */ C10649f.C10650a f167668p;

        /* renamed from: q */
        public final /* synthetic */ Context f167669q;

        /* renamed from: r */
        public final /* synthetic */ C64279c90 f167670r;

        /* renamed from: eg1.h$a$a */
        public static final class C58574a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<String> f167671d;

            /* renamed from: e */
            public final /* synthetic */ C58572h f167672e;

            /* renamed from: f */
            public final /* synthetic */ C8479f0<C64273c21> f167673f;

            /* renamed from: g */
            public final /* synthetic */ Intent f167674g;

            /* renamed from: h */
            public final /* synthetic */ Context f167675h;

            /* renamed from: i */
            public final /* synthetic */ C64238ap2 f167676i;

            /* renamed from: j */
            public final /* synthetic */ C64279c90 f167677j;

            /* renamed from: n */
            public final /* synthetic */ Intent f167678n;

            /* renamed from: o */
            public final /* synthetic */ C10649f.C10650a f167679o;

            /* renamed from: p */
            public final /* synthetic */ C8479f0<FinderObject> f167680p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58574a(C8479f0<String> f0Var, C58572h hVar, C8479f0<C64273c21> f0Var2, Intent intent, Context context, C64238ap2 ap22, C64279c90 c902, Intent intent2, C10649f.C10650a aVar, C8479f0<FinderObject> f0Var3) {
                super(0);
                this.f167671d = f0Var;
                this.f167672e = hVar;
                this.f167673f = f0Var2;
                this.f167674g = intent;
                this.f167675h = context;
                this.f167676i = ap22;
                this.f167677j = c902;
                this.f167678n = intent2;
                this.f167679o = aVar;
                this.f167680p = f0Var3;
            }

            public Object invoke() {
                int i;
                String str;
                C64265bq2 bq22;
                String str2;
                C64254b81 b812;
                String str3;
                Class cls = C60606n.class;
                String str4 = "";
                if (C87412m.m108589b(this.f167671d.f27484d, C66785b.f191882e.mo90662O5())) {
                    Log.m105924i(this.f167672e.f167658d, "enterLiveB anchor");
                    C64273c21 c212 = (C64273c21) this.f167673f.f27484d;
                    if (c212 != null) {
                        this.f167674g.putExtra("KEY_PARAMS_SOURCE_TYPE", c212.f182405s);
                    }
                    C60606n nVar = (C60606n) C86312j.m106911c(cls);
                    Intent intent = this.f167674g;
                    Context context = this.f167675h;
                    C64238ap2 ap22 = this.f167676i;
                    long j = ap22.f182124d;
                    Long valueOf = Long.valueOf(ap22.f182125e);
                    C64238ap2 ap23 = this.f167676i;
                    String str5 = ap23.f182126f;
                    String str6 = str5 == null ? str4 : str5;
                    String str7 = ap23.f182129i;
                    C64279c90 c902 = this.f167677j;
                    String str8 = c902.f182444d;
                    if (str8 == null) {
                        str8 = str4;
                    }
                    String str9 = ap23.f182128h;
                    C64686ro2 ro22 = c902.f182450j;
                    nVar.o90(intent, context, j, valueOf, str6, str7, str8, str9, (ro22 == null || (str3 = ro22.f185221o) == null) ? str4 : str3);
                } else {
                    Log.m105924i(this.f167672e.f167658d, "enterLiveB visitor");
                    Intent intent2 = this.f167678n;
                    if (intent2 == null) {
                        intent2 = new Intent();
                    }
                    Intent intent3 = intent2;
                    C58418z1.C58419a aVar = new C58418z1.C58419a();
                    aVar.f167361a = System.currentTimeMillis();
                    boolean z = false;
                    aVar.f167366f = false;
                    C58418z1.f167360a = aVar;
                    byte[] bArr = null;
                    C58358d0.f167118d = null;
                    C58358d0.f167116b = 0;
                    C58358d0.f167117c = 0;
                    C58358d0.f167119e = false;
                    C58358d0.f167121g = true;
                    C58358d0.C58359a aVar2 = new C58358d0.C58359a();
                    aVar2.f167123a = SystemClock.elapsedRealtime();
                    C58358d0.f167118d = aVar2;
                    C58358d0.f167116b = 1;
                    C58358d0.f167117c = 1;
                    aVar2.f167124b = 0;
                    aVar2.f167125c = 0;
                    aVar2.f167126d = 0;
                    aVar2.f167127e = 0;
                    aVar2.f167128f = 0;
                    ((C60606n) C86312j.m106911c(cls)).fs0(this.f167676i.f182125e);
                    C64273c21 c213 = (C64273c21) this.f167673f.f27484d;
                    if (c213 != null && 1 == c213.f182394f) {
                        z = true;
                    }
                    if (z) {
                        str = c213 != null ? c213.f182395g : null;
                        if (str == null) {
                            str = str4;
                        }
                        i = (c213 == null || (b812 = c213.f182401p) == null) ? 1 : b812.f182228d;
                        bq22 = c213 != null ? c213.f182358D : null;
                    } else {
                        bq22 = null;
                        str = str4;
                        i = 1;
                    }
                    LiveConfig.C55204b bVar = new LiveConfig.C55204b();
                    bVar.f157091a = 1;
                    C64238ap2 ap24 = this.f167676i;
                    bVar.f157093c = ap24.f182125e;
                    bVar.f157106p = ap24.f182126f;
                    bVar.f157099i = str;
                    bVar.f157100j = i;
                    bVar.f157101k = ap24.f182124d;
                    bVar.f157096f = (String) this.f167671d.f27484d;
                    bVar.f157102l = ap24.f182129i;
                    bVar.f157112v = ap24.f182128h;
                    if (bq22 != null) {
                        bArr = bq22.toByteArray();
                    }
                    bVar.f157084B = bArr;
                    C64686ro2 ro23 = this.f167677j.f182450j;
                    if (!(ro23 == null || (str2 = ro23.f185221o) == null)) {
                        str4 = str2;
                    }
                    bVar.f157113w = str4;
                    LiveConfig a = bVar.mo76374a();
                    C64634po2 po22 = new C64634po2();
                    C8479f0<FinderObject> f0Var = this.f167680p;
                    C8479f0<C64273c21> f0Var2 = this.f167673f;
                    po22.f184866d = (FinderObject) f0Var.f27484d;
                    po22.f184867e = (C64273c21) f0Var2.f27484d;
                    a.f157062U = po22;
                    this.f167672e.vx0(0, C26236u.m33719b(a), this.f167677j, intent3, (FinderObject) null, this.f167679o, this.f167675h);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58573a(Intent intent, C64238ap2 ap22, C58572h hVar, C10649f.C10650a aVar, Context context, C64279c90 c902, C15601d<? super C58573a> dVar) {
            super(2, dVar);
            this.f167665j = intent;
            this.f167666n = ap22;
            this.f167667o = hVar;
            this.f167668p = aVar;
            this.f167669q = context;
            this.f167670r = c902;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C58573a(this.f167665j, this.f167666n, this.f167667o, this.f167668p, this.f167669q, this.f167670r, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58573a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x0140  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f167664i
                r3 = 0
                java.lang.String r5 = ""
                r6 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 != r6) goto L_0x002a
                java.lang.Object r1 = r0.f167663h
                gy3.f0 r1 = (gy3.C8479f0) r1
                java.lang.Object r2 = r0.f167662g
                gy3.f0 r2 = (gy3.C8479f0) r2
                java.lang.Object r6 = r0.f167661f
                gy3.f0 r6 = (gy3.C8479f0) r6
                java.lang.Object r7 = r0.f167660e
                gy3.f0 r7 = (gy3.C8479f0) r7
                java.lang.Object r8 = r0.f167659d
                android.content.Intent r8 = (android.content.Intent) r8
                kotlin.ResultKt.throwOnFailure(r22)
                r3 = r22
                goto L_0x00e8
            L_0x002a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r22)
                android.content.Intent r2 = r0.f167665j
                if (r2 != 0) goto L_0x003e
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
            L_0x003e:
                r8 = r2
                gy3.f0 r7 = new gy3.f0
                r7.<init>()
                te3.ap2 r2 = r0.f167666n
                java.lang.String r2 = r2.f182127g
                if (r2 != 0) goto L_0x004b
                r2 = r5
            L_0x004b:
                r7.f27484d = r2
                gy3.f0 r2 = new gy3.f0
                r2.<init>()
                java.lang.Class<ir.n> r9 = p565ir.C60606n.class
                di3.d r9 = di3.C86312j.m106911c(r9)
                ir.n r9 = (p565ir.C60606n) r9
                te3.ap2 r10 = r0.f167666n
                long r10 = r10.f182125e
                te3.c21 r9 = r9.T70(r10)
                r2.f27484d = r9
                gy3.f0 r9 = new gy3.f0
                r9.<init>()
                T r10 = r7.f27484d
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                int r10 = r10.length()
                if (r10 != 0) goto L_0x0075
                r10 = 1
                goto L_0x0076
            L_0x0075:
                r10 = 0
            L_0x0076:
                if (r10 != 0) goto L_0x008c
                te3.ap2 r10 = r0.f167666n
                long r11 = r10.f182125e
                int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r13 == 0) goto L_0x008c
                te3.c21 r10 = r10.f182130j
                if (r10 != 0) goto L_0x0085
                goto L_0x008c
            L_0x0085:
                r12 = r2
                r10 = r7
                r13 = r8
                r19 = r9
                goto L_0x013c
            L_0x008c:
                eg1.h r10 = r0.f167667o
                te3.ap2 r11 = r0.f167666n
                long r13 = r11.f182124d
                java.lang.String r15 = r11.f182126f
                r16 = 65
                r17 = 0
                r18 = 1
                r0.f167659d = r8
                r0.f167660e = r7
                r0.f167661f = r2
                r0.f167662g = r9
                r0.f167663h = r9
                r0.f167664i = r6
                r10.getClass()
                a14.m r10 = new a14.m
                wx3.d r11 = xx3.C66447b.m78392b(r21)
                r10.<init>(r11, r6)
                r10.mo74609p()
                gy3.a0 r11 = new gy3.a0
                r11.<init>()
                java.lang.Class<ht1.t1> r12 = ht1.C60200t1.class
                di3.d r12 = di3.C86312j.m106911c(r12)
                ht1.t1 r12 = (ht1.C60200t1) r12
                eg1.l r3 = new eg1.l
                r3.<init>(r11, r10)
                java.lang.String r19 = ""
                r20 = r3
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r12.mo76777Li(r13, r15, r16, r17, r18, r19, r20)
                if (r3 == 0) goto L_0x00de
                boolean r4 = r11.f27482d
                if (r4 != 0) goto L_0x00de
                r11.f27482d = r6
                java.lang.Object r3 = kotlin.Result.m168114constructorimpl(r3)
                r10.resumeWith(r3)
            L_0x00de:
                java.lang.Object r3 = r10.mo74608o()
                if (r3 != r1) goto L_0x00e5
                return r1
            L_0x00e5:
                r6 = r2
                r1 = r9
                r2 = r1
            L_0x00e8:
                r1.f27484d = r3
                T r1 = r2.f27484d
                if (r1 != 0) goto L_0x0109
                eg1.h r1 = r0.f167667o
                java.lang.String r1 = r1.f167658d
                java.lang.String r2 = "enterLiveB getFinderObject null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
                ft1.a r3 = ft1.C59319a.f169618b
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 60
                r11 = 0
                java.lang.String r4 = "checkenterobjectnull"
                o40.C11348f.C11349a.m11178b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x0109:
                ls3.f$a r3 = r0.f167668p
                if (r3 == 0) goto L_0x0112
                com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r1
                r3.mo5053b(r1)
            L_0x0112:
                T r1 = r2.f27484d
                com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r1
                java.lang.String r1 = r1.username
                if (r1 != 0) goto L_0x011b
                goto L_0x011c
            L_0x011b:
                r5 = r1
            L_0x011c:
                r7.f27484d = r5
                T r1 = r2.f27484d
                com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r1
                te3.c21 r1 = r1.liveInfo
                r6.f27484d = r1
                te3.ap2 r1 = r0.f167666n
                T r3 = r2.f27484d
                com.tencent.mm.protocal.protobuf.FinderObject r3 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r3
                te3.c21 r3 = r3.liveInfo
                if (r3 == 0) goto L_0x0133
                long r3 = r3.f182392d
                goto L_0x0135
            L_0x0133:
                r3 = 0
            L_0x0135:
                r1.f182125e = r3
                r19 = r2
                r12 = r6
                r10 = r7
                r13 = r8
            L_0x013c:
                T r1 = r12.f27484d
                if (r1 != 0) goto L_0x0146
                te3.ap2 r1 = r0.f167666n
                te3.c21 r1 = r1.f182130j
                r12.f27484d = r1
            L_0x0146:
                eg1.h$a$a r1 = new eg1.h$a$a
                eg1.h r11 = r0.f167667o
                android.content.Context r14 = r0.f167669q
                te3.ap2 r15 = r0.f167666n
                te3.c90 r2 = r0.f167670r
                android.content.Intent r3 = r0.f167665j
                ls3.f$a r4 = r0.f167668p
                r9 = r1
                r16 = r2
                r17 = r3
                r18 = r4
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                o40.C61926c.m72668M(r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: eg1.C58572h.C58573a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: eg1.h$b */
    public static final class C58575b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C10649f.C10650a f167681a;

        /* renamed from: b */
        public final /* synthetic */ C58572h f167682b;

        /* renamed from: c */
        public final /* synthetic */ Intent f167683c;

        /* renamed from: d */
        public final /* synthetic */ Context f167684d;

        /* renamed from: e */
        public final /* synthetic */ C64279c90 f167685e;

        /* renamed from: f */
        public final /* synthetic */ Intent f167686f;

        public C58575b(C10649f.C10650a aVar, C58572h hVar, Intent intent, Context context, C64279c90 c902, Intent intent2) {
            this.f167681a = aVar;
            this.f167682b = hVar;
            this.f167683c = intent;
            this.f167684d = context;
            this.f167685e = c902;
            this.f167686f = intent2;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C10649f.C10650a aVar = this.f167681a;
            if (aVar != null) {
                C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
                aVar.mo5056e(cVar);
            }
            C50851pn0 pn02 = (C50851pn0) cVar.f256796d;
            C61926c.m72668M(new C58579i(pn02 != null ? pn02.f139838d : null, this.f167682b, this.f167683c, this.f167684d, this.f167685e, this.f167686f, this.f167681a, cVar));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eg1.h$c */
    public static final class C58576c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C10649f.C10650a f167687a;

        /* renamed from: b */
        public final /* synthetic */ C58572h f167688b;

        /* renamed from: c */
        public final /* synthetic */ Intent f167689c;

        /* renamed from: d */
        public final /* synthetic */ Context f167690d;

        /* renamed from: e */
        public final /* synthetic */ Object f167691e;

        public C58576c(C10649f.C10650a aVar, C58572h hVar, Intent intent, Context context, Object obj) {
            this.f167687a = aVar;
            this.f167688b = hVar;
            this.f167689c = intent;
            this.f167690d = context;
            this.f167691e = obj;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C10649f.C10650a aVar = this.f167687a;
            if (aVar != null) {
                C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
                aVar.mo5056e(cVar);
            }
            C50851pn0 pn02 = (C50851pn0) cVar.f256796d;
            C61926c.m72668M(new C58581j(pn02 != null ? pn02.f139838d : null, this.f167688b, this.f167689c, this.f167690d, this.f167691e, this.f167687a, cVar));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eg1.h$d */
    public static final class C58577d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C10649f.C10650a f167692a;

        /* renamed from: b */
        public final /* synthetic */ C58572h f167693b;

        /* renamed from: c */
        public final /* synthetic */ Context f167694c;

        /* renamed from: d */
        public final /* synthetic */ Intent f167695d;

        /* renamed from: e */
        public final /* synthetic */ C64279c90 f167696e;

        public C58577d(C10649f.C10650a aVar, C58572h hVar, Context context, Intent intent, C64279c90 c902) {
            this.f167692a = aVar;
            this.f167693b = hVar;
            this.f167694c = context;
            this.f167695d = intent;
            this.f167696e = c902;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C10649f.C10650a aVar = this.f167692a;
            if (aVar != null) {
                C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
                aVar.mo5055d(cVar);
            }
            FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && finderObject != null) {
                C61926c.m72668M(new C58583k(this.f167693b, this.f167694c, this.f167695d, finderObject, this.f167696e, this.f167692a));
            } else {
                String str = this.f167693b.f167658d;
                StringBuilder sb = new StringBuilder();
                sb.append("enterLiveD error ");
                sb.append(cVar.f256793a);
                sb.append(", ");
                sb.append(cVar.f256794b);
                sb.append(", ");
                sb.append(finderObject != null ? Integer.valueOf(finderObject.hashCode()) : null);
                Log.m105928w(str, sb.toString());
            }
            return C13598b0.f38549a;
        }
    }

    public void E40(Context context, Intent intent, String str, C9487b<?> bVar, C64279c90 c902, C10649f.C10650a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "anchorUserName");
        C87412m.m108594g(c902, "enterLiveParams");
        if (str.length() == 0) {
            Log.m105928w(this.f167658d, "enterLiveC1 anchorUserName is empty");
            return;
        }
        C58708d1.f168058a.mo83620d(c902, "enterLiveC1");
        Intent intent2 = intent == null ? new Intent() : intent;
        C89059e i = new C45366h0(str, (C46108j1) null, 2, (C8480h) null).mo9225i();
        if (bVar != null) {
            i.mo11397F(bVar);
        }
        i.mo123420E(new C58575b(aVar, this, intent2, context, c902, intent));
    }

    public void Uf0(Context context, Intent intent, C64256b90 b902, C64279c90 c902, C10649f.C10650a aVar) {
        C64256b90 b903 = b902;
        C64279c90 c903 = c902;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(b903, "encryptedFeedInfo");
        C87412m.m108594g(c903, "enterLiveParams");
        String str = b903.f182241d;
        if (str == null || str.length() == 0) {
            Log.m105924i(this.f167658d, "enterLiveD encryptedObjectId invalid");
            return;
        }
        C58708d1 d1Var = C58708d1.f168058a;
        Log.m105924i("Finder.FinderLiveDataTransferUtil", "EncryptedLiveFeedInfo.logInfo " + "enterLiveD" + ", encryptedObjectId: " + b903.f182241d + ", nonceId: " + b903.f182242e + ", liveId: " + C61926c.m72691p(b903.f182243f) + ", ");
        d1Var.mo83620d(c903, "enterLiveD");
        C7335d c = C86312j.m106911c(C64916p1.class);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C64916p1 p1Var = (C64916p1) c;
        String str2 = b903.f182242e;
        if (str2 == null) {
            str2 = "";
        }
        C64916p1.C64917a.m76435b(p1Var, 0, str2, 65, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str, (C49712hj1) null, 0, 20416, (Object) null).mo9225i().mo123420E(new C58577d(aVar, this, context, intent, c902));
    }

    /* renamed from: cP */
    public void mo10913cP(Context context, Intent intent, List<? extends FinderObject> list, int i, C64279c90 c902, C10649f.C10650a aVar) {
        C64273c21 c212;
        String str;
        List<? extends FinderObject> list2 = list;
        int i2 = i;
        C64279c90 c903 = c902;
        Class cls = C60606n.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(list2, "feeds");
        C87412m.m108594g(c903, "enterLiveParams");
        FinderObject finderObject = (FinderObject) C110818d0.m150917O(list, i);
        if (list.isEmpty() || list.size() < i2 || finderObject == null) {
            String str2 = this.f167658d;
            Log.m105924i(str2, "feeds size:" + list.size() + ", curPos:" + i2);
            return;
        }
        String str3 = this.f167658d;
        StringBuilder sb = new StringBuilder();
        sb.append("enterLiveA feeds size:");
        sb.append(list.size());
        sb.append(", curPos:");
        sb.append(i2);
        sb.append(", feedId:");
        sb.append(C61926c.m72691p(finderObject.f164794id));
        sb.append(", liveId:");
        C64273c21 c213 = finderObject.liveInfo;
        long j = 0;
        sb.append(C61926c.m72691p(c213 != null ? c213.f182392d : 0));
        Log.m105924i(str3, sb.toString());
        C58708d1.f168058a.mo83620d(c903, "enterLiveA");
        Intent intent2 = intent == null ? new Intent() : intent;
        if (C87412m.m108589b(finderObject.username, C66785b.f191882e.mo90662O5())) {
            Log.m105924i(this.f167658d, "enterLiveA anchor");
            C64273c21 c214 = finderObject.liveInfo;
            if (c214 != null) {
                intent2.putExtra("KEY_PARAMS_SOURCE_TYPE", c214.f182405s);
            }
            C60606n nVar = (C60606n) C86312j.m106911c(cls);
            long j2 = finderObject.f164794id;
            C64273c21 c215 = finderObject.liveInfo;
            if (c215 != null) {
                j = c215.f182392d;
            }
            Long valueOf = Long.valueOf(j);
            String str4 = finderObject.objectNonceId;
            String str5 = str4 == null ? "" : str4;
            String str6 = c903.f182444d;
            String str7 = str6 == null ? "" : str6;
            String str8 = finderObject.sessionBuffer;
            C64686ro2 ro22 = c903.f182450j;
            nVar.o90(intent2, context, j2, valueOf, str5, "", str7, str8, (ro22 == null || (str = ro22.f185221o) == null) ? "" : str);
            return;
        }
        Log.m105924i(this.f167658d, "enterLiveA visitor");
        C58418z1.C58419a aVar2 = new C58418z1.C58419a();
        aVar2.f167361a = System.currentTimeMillis();
        aVar2.f167366f = false;
        C58418z1.f167360a = aVar2;
        C58358d0.f167118d = null;
        C58358d0.f167116b = 0;
        C58358d0.f167117c = 0;
        C58358d0.f167119e = false;
        C58358d0.f167121g = true;
        C58358d0.C58359a aVar3 = new C58358d0.C58359a();
        aVar3.f167123a = SystemClock.elapsedRealtime();
        C58358d0.f167118d = aVar3;
        C58358d0.f167116b = 1;
        C58358d0.f167117c = 1;
        aVar3.f167124b = 0;
        aVar3.f167125c = 0;
        aVar3.f167126d = 0;
        aVar3.f167127e = 0;
        aVar3.f167128f = 0;
        C60606n nVar2 = (C60606n) C86312j.m106911c(cls);
        FinderObject finderObject2 = (FinderObject) C110818d0.m150917O(list, i);
        if (!(finderObject2 == null || (c212 = finderObject2.liveInfo) == null)) {
            j = c212.f182392d;
        }
        nVar2.fs0(j);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
        for (FinderObject b : list) {
            arrayList.add(C58708d1.m68188b(C58708d1.f168058a, b, 0, false, 6, (Object) null));
        }
        vx0(i, arrayList, c902, intent2, finderObject, aVar, context);
    }

    /* renamed from: oa */
    public boolean mo10914oa(Context context, boolean z) {
        Class cls = C10432i.class;
        boolean z2 = !((C10432i) C86312j.m106911c(cls)).mo10750e() || ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9636zX();
        if (!z2 && z && context != null) {
            ((C10432i) C86312j.m106911c(cls)).mo10755m4(context);
        }
        return z2;
    }

    /* renamed from: sr */
    public C13604l<List<FinderObject>, Integer> mo10915sr(ArrayList<C0740i2> arrayList, C0740i2 i2Var) {
        C87412m.m108594g(arrayList, "data");
        C87412m.m108594g(i2Var, "clickFeed");
        return C58708d1.f168058a.mo83619c(arrayList, i2Var);
    }

    /* renamed from: tP */
    public void mo10916tP(Context context, Intent intent, C64238ap2 ap22, boolean z, C64279c90 c902, C10649f.C10650a aVar) {
        Context context2 = context;
        C64238ap2 ap23 = ap22;
        C64279c90 c903 = c902;
        Class cls = C10432i.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(ap23, "feedInfo");
        C87412m.m108594g(c903, "enterLiveParams");
        if (z && ((C10432i) C86312j.m106911c(cls)).mo10750e() && !((C8808v4) C86312j.m106911c(C8808v4.class)).mo9636zX()) {
            Log.m105924i(this.f167658d, "enterLiveB teenmode");
            ((C10432i) C86312j.m106911c(cls)).mo10755m4(context);
        } else if (ap23.f182124d == 0) {
            String str = this.f167658d;
            Log.m105924i(str, "enterLiveB params invalid, feedInfo.objectId:" + ap23.f182124d + ", feedInfo.liveId:" + ap23.f182125e);
        } else {
            C58708d1 d1Var = C58708d1.f168058a;
            Log.m105924i("Finder.FinderLiveDataTransferUtil", "LiveFeedInfo.logInfo " + "enterLiveB" + ", objectId: " + C61926c.m72691p(ap23.f182124d) + ", liveId: " + C61926c.m72691p(ap23.f182125e) + ", nonceId: " + ap23.f182126f + ", anchorUsername: " + ap23.f182127g + ", desc: " + ap23.f182129i + ", sessionBuffer: " + ap23.f182128h + ", ");
            StringBuilder sb = new StringBuilder();
            sb.append("LiveFeedInfo.logInfo ");
            sb.append("enterLiveB");
            sb.append(", backupLiveInfo : ");
            C64273c21 c212 = ap23.f182130j;
            sb.append(c212 != null ? c212.hashCode() : 0);
            Log.m105924i("Finder.FinderLiveDataTransferUtil", sb.toString());
            d1Var.mo83620d(c903, "enterLiveB");
            C53895h.m60466d(C0001s1.f0d, (C66212f) null, C53934p0.UNDISPATCHED, new C58573a(intent, ap22, this, aVar, context, c902, (C15601d<? super C58573a>) null), 1, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        r2 = r2.liveInfo;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void vx0(int r17, java.util.List<? extends com.tencent.p014mm.live.api.LiveConfig> r18, te3.C64279c90 r19, android.content.Intent r20, com.tencent.p014mm.protocal.protobuf.FinderObject r21, ls3.C10649f.C10650a r22, android.content.Context r23) {
        /*
            r16 = this;
            r0 = r17
            r1 = r19
            r5 = r20
            r2 = r21
            r10 = r22
            java.lang.String r3 = "<this>"
            gy3.C87412m.m108594g(r1, r3)
            cj1.b1 r3 = new cj1.b1
            r3.<init>()
            te3.ro2 r4 = r1.f182450j
            int r6 = r1.f182448h
            r3.f153424m = r6
            int r6 = r1.f182449i
            r3.f153425n = r6
            int r6 = r1.f182447g
            r3.f153421j = r6
            java.lang.String r6 = r1.f182444d
            r3.f153428q = r6
            java.lang.String r6 = ""
            if (r4 == 0) goto L_0x0050
            int r7 = r4.f185214e
            r3.f153422k = r7
            te3.kr0 r7 = r4.f185217h
            r3.f153427p = r7
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r4.f185218i
            r3.f153429r = r7
            te3.th0 r7 = r4.f185219j
            r3.f153430s = r7
            int r7 = r4.f185213d
            r3.f153431t = r7
            te3.x81 r7 = r4.f185220n
            r3.f153434w = r7
            java.lang.String r7 = r4.f185215f
            if (r7 != 0) goto L_0x0047
            r7 = r6
        L_0x0047:
            r3.f153436y = r7
            java.lang.String r4 = r4.f185216g
            if (r4 != 0) goto L_0x004e
            r4 = r6
        L_0x004e:
            r3.f153437z = r4
        L_0x0050:
            te3.eq2 r4 = r1.f182451n
            r3.f153411A = r4
            r3.f153420i = r0
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r4 = r3.f153423l
            r7 = r18
            r4.addAll(r7)
            if (r2 == 0) goto L_0x0066
            te3.c21 r2 = r2.liveInfo
            if (r2 == 0) goto L_0x0066
            long r7 = r2.f182392d
            goto L_0x0068
        L_0x0066:
            r7 = 0
        L_0x0068:
            java.lang.String r2 = "intent"
            gy3.C87412m.m108594g(r5, r2)
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r2 = r3.f153423l
            java.lang.Object r0 = sx3.C110818d0.m150917O(r2, r0)
            r2 = r0
            com.tencent.mm.live.api.LiveConfig r2 = (com.tencent.p014mm.live.api.LiveConfig) r2
            if (r2 == 0) goto L_0x0199
            r4 = 0
            java.lang.String r0 = "key_enter_live_param_bind_type"
            int r0 = r5.getIntExtra(r0, r4)
            r2.f157077u = r0
            java.lang.String r0 = "key_enter_live_param_by_biz_username"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x008a
            r0 = r6
        L_0x008a:
            r2.f157078v = r0
            java.lang.String r0 = "key_enter_live_param_by_biz_nickname"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x0095
            r0 = r6
        L_0x0095:
            r2.f157079w = r0
            java.lang.String r0 = "key_enter_live_export_id"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x00a0
            r0 = r6
        L_0x00a0:
            r2.f157074r = r0
            java.lang.String r0 = "key_enter_live_cover_url"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x00ab
            r0 = r6
        L_0x00ab:
            r2.f157068i = r0
            java.lang.String r0 = "KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE"
            int r0 = r5.getIntExtra(r0, r4)
            r2.f157056N = r0
            java.lang.String r9 = "enterFinderLiveVisitorUI"
            te3.by0 r0 = new te3.by0
            r0.<init>()
            java.lang.String r11 = "KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO"
            byte[] r11 = r5.getByteArrayExtra(r11)
            r12 = 0
            if (r11 != 0) goto L_0x00c6
            goto L_0x00d6
        L_0x00c6:
            r0.parseFrom(r11)     // Catch:{ Exception -> 0x00ca }
            goto L_0x00d7
        L_0x00ca:
            r0 = move-exception
            r11 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r11
            java.lang.String r11 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r11, r6, r0)
        L_0x00d6:
            r0 = r12
        L_0x00d7:
            java.lang.String r11 = ", username:"
            java.lang.String r12 = ", liveId:"
            java.lang.String r13 = ", objectId:"
            java.lang.String r14 = "setLiveEventInfo "
            java.lang.String r15 = "Finder.OlympicsCommon"
            if (r0 == 0) goto L_0x0160
            int r4 = r0.f131380d
            r2.f157057P = r4
            int r4 = r0.f131381e
            r2.f157058Q = r4
            int r4 = r0.f131382f
            r2.f157059R = r4
            int r4 = r0.f131383g
            r2.f157060S = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            r4.append(r9)
            r4.append(r13)
            long r13 = r2.f157075s
            java.lang.String r9 = o40.C61926c.m72691p(r13)
            r4.append(r9)
            r4.append(r12)
            long r12 = r2.f157064e
            java.lang.String r9 = o40.C61926c.m72691p(r12)
            r4.append(r9)
            r4.append(r11)
            java.lang.String r2 = r2.f157069j
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "event_id:"
            r2.append(r9)
            int r9 = r0.f131380d
            r2.append(r9)
            java.lang.String r9 = ", participant_identity:"
            r2.append(r9)
            int r9 = r0.f131381e
            r2.append(r9)
            java.lang.String r9 = ", event_status:"
            r2.append(r9)
            int r9 = r0.f131382f
            r2.append(r9)
            java.lang.String r9 = ", stream_status:"
            r2.append(r9)
            int r0 = r0.f131383g
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x0199
        L_0x0160:
            r2.f157057P = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r9)
            r0.append(r13)
            long r13 = r2.f157075s
            java.lang.String r4 = o40.C61926c.m72691p(r13)
            r0.append(r4)
            r0.append(r12)
            long r12 = r2.f157064e
            java.lang.String r4 = o40.C61926c.m72691p(r12)
            r0.append(r4)
            r0.append(r11)
            java.lang.String r2 = r2.f157069j
            r0.append(r2)
            java.lang.String r2 = ", null"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
        L_0x0199:
            r3.mo75634c(r5)
            r3.mo75633b(r5)
            r3.mo75632a(r5, r7)
            if (r10 == 0) goto L_0x01a7
            r10.mo5054c(r3)
        L_0x01a7:
            java.lang.Class<tf0.q1> r0 = tf0.C13887q1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r2 = "getService(IFinderCommonLiveService::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            tf0.q1 r0 = (tf0.C13887q1) r0
            java.lang.String r2 = r1.f182444d
            if (r2 != 0) goto L_0x01ba
            r4 = r6
            goto L_0x01bb
        L_0x01ba:
            r4 = r2
        L_0x01bb:
            java.lang.String r2 = r1.f182445e
            if (r2 != 0) goto L_0x01c0
            goto L_0x01c1
        L_0x01c0:
            r6 = r2
        L_0x01c1:
            boolean r7 = r1.f182446f
            r8 = 0
            r9 = 64
            r11 = 0
            r1 = r23
            r2 = r3
            r3 = r4
            r4 = r6
            r5 = r20
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            int r0 = tf0.C13887q1.C13888a.m13307c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto L_0x01de
            if (r10 == 0) goto L_0x01e3
            r22.mo5052a()
            goto L_0x01e3
        L_0x01de:
            if (r10 == 0) goto L_0x01e3
            r10.onFailed(r0)
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eg1.C58572h.vx0(int, java.util.List, te3.c90, android.content.Intent, com.tencent.mm.protocal.protobuf.FinderObject, ls3.f$a, android.content.Context):void");
    }

    /* renamed from: ze */
    public void mo10917ze(Context context, Intent intent, String str, C9487b<?> bVar, Object obj, C10649f.C10650a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "anchorUserName");
        C87412m.m108594g(obj, "finderLiveBundle");
        if ((str.length() == 0) || !(obj instanceof C54738b1)) {
            Log.m105928w(this.f167658d, "enterLiveC2 anchorUserName is empty");
            return;
        }
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = intent;
        C89059e i = new C45366h0(str, (C46108j1) null, 2, (C8480h) null).mo9225i();
        i.mo11397F(bVar);
        if (bVar != null) {
            i.mo11397F(bVar);
        }
        i.mo123420E(new C58576c(aVar, this, intent2, context, obj));
    }
}
