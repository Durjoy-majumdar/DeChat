package vi1;

import a14.C0000n0;
import android.content.Context;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import cl1.C39981t0;
import cl1.C54991o;
import cl1.C55001u;
import cl1.C55003v0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d50.C58114h;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import kotlin.ResultKt;
import nj3.C76912y0;
import pe3.C89349b;
import q40.C12040d;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C50313lv0;
import te3.C64265bq2;
import tf0.C64918r1;
import wx3.C15601d;
import y50.C66505a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.micintercom.plugin.FinderLiveMicIntercomBottomPlugin$requestApplyMicIntercom$1", mo125469f = "FinderLiveMicIntercomBottomPlugin.kt", mo125470l = {457, 562, 569}, mo125471m = "invokeSuspend")
/* renamed from: vi1.f */
public final class C52921f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f147757d;

    /* renamed from: e */
    public Object f147758e;

    /* renamed from: f */
    public int f147759f;

    /* renamed from: g */
    public final /* synthetic */ C65750a f147760g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.micintercom.plugin.FinderLiveMicIntercomBottomPlugin$requestApplyMicIntercom$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveMicIntercomBottomPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vi1.f$b */
    public static final class C14876b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f40904d;

        /* renamed from: e */
        public final /* synthetic */ C65750a f40905e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14876b(C0287e eVar, C15601d dVar, C65750a aVar) {
            super(2, dVar);
            this.f40904d = eVar;
            this.f40905e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C14876b(this.f40904d, dVar, this.f40905e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C14876b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C12040d dVar = ((C0280a) ((C0281b) this.f40904d).f843b).f841a;
            if (dVar != null) {
                Log.m105924i("FinderLiveMicIntercomBo", "requestApplyMicIntercom fail code: " + dVar.f35058f + " msg: " + dVar.f35059g);
                String str = dVar.f35059g;
                Context context = this.f40905e.f166287d.getContext();
                switch (dVar.f35058f) {
                    case -200018:
                        if (Util.isNullOrNil(str)) {
                            str = context.getResources().getString(C0966R.string.fpy);
                        }
                        C77426q qVar = new C77426q(context);
                        qVar.mo107602n(context.getResources().getString(C0966R.string.f8028zq));
                        qVar.mo107595g(str);
                        qVar.mo107603o();
                        break;
                    case -200017:
                    case MMLISTEN_ERR_INVALID_FEEDBUF_VALUE:
                        String string = Util.isNullOrNil(dVar.f35059g) ? this.f40905e.f166287d.getContext().getResources().getString(C0966R.string.f360632fq2) : dVar.f35059g;
                        C77426q qVar2 = new C77426q(this.f40905e.f166287d.getContext());
                        qVar2.mo107602n(this.f40905e.f166287d.getContext().getResources().getString(C0966R.string.f8028zq));
                        qVar2.mo107595g(string);
                        qVar2.mo107603o();
                        break;
                    case -200009:
                        if (Util.isNullOrNil(str)) {
                            str = context.getResources().getString(C0966R.string.fpz);
                        }
                        C77426q qVar3 = new C77426q(context);
                        qVar3.mo107602n(context.getResources().getString(C0966R.string.f8028zq));
                        qVar3.mo107595g(str);
                        qVar3.mo107603o();
                        break;
                    default:
                        if (str == null || str.length() == 0) {
                            Context context2 = this.f40905e.f166287d.getContext();
                            C76912y0.m92767f(context2, "操作失败: " + dVar.f35058f);
                            break;
                        } else {
                            C76912y0.m92767f(this.f40905e.f166287d.getContext(), str);
                            break;
                        }
                        break;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vi1.f$a */
    public static final class C52922a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65750a f147761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52922a(C65750a aVar) {
            super(1);
            this.f147761d = aVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.m105924i("FinderLiveMicIntercomBo", "startTrtcEnterRoom: " + booleanValue);
            C65750a.m77373a1(this.f147761d);
            FinderLiveService.f159376d.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            if (aVar != null) {
                aVar.mo85679W().enableMixExternalAudioFrame(false, true);
            }
            this.f147761d.mo89761c1().mo71666a().postValue(Boolean.TRUE);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.micintercom.plugin.FinderLiveMicIntercomBottomPlugin$requestApplyMicIntercom$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveMicIntercomBottomPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vi1.f$c */
    public static final class C52923c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f147762d;

        /* renamed from: e */
        public final /* synthetic */ C65750a f147763e;

        /* renamed from: f */
        public final /* synthetic */ boolean f147764f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52923c(C0287e eVar, C15601d dVar, C65750a aVar, boolean z) {
            super(2, dVar);
            this.f147762d = eVar;
            this.f147763e = aVar;
            this.f147764f = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C52923c(this.f147762d, dVar, this.f147763e, this.f147764f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C52923c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C89349b bVar;
            C89349b bVar2;
            C89349b bVar3;
            ResultKt.throwOnFailure(obj);
            C50313lv0 lv02 = (C50313lv0) ((C0288f) this.f147762d).f855b;
            C65750a aVar = this.f147763e;
            String str = lv02.f137655f;
            if (str == null) {
                str = "";
            }
            aVar.f189150v = str;
            Log.m105924i("FinderLiveMicIntercomBo", "requestApplyMicIntercom success currentSessionId: " + this.f147763e.f189150v + " isNeedSdkInfo: " + this.f147764f + " isShow: " + this.f147763e.mo89761c1().f190050r);
            if (!this.f147763e.mo89761c1().f190050r) {
                Log.m105920e("FinderLiveMicIntercomBo", "cur window is close: " + this.f147763e.mo89761c1().f190050r);
                this.f147763e.mo89763e1();
            } else {
                int i = 0;
                if (this.f147764f) {
                    C39981t0 t0Var = (C39981t0) this.f147763e.mo87696x0(C39981t0.class);
                    C52922a aVar2 = new C52922a(this.f147763e);
                    Class cls = C55001u.class;
                    Class cls2 = C64918r1.class;
                    long j = ((C55001u) t0Var.f107146d.mo71262a(cls)).f154420q.f182392d;
                    String str2 = lv02.f137655f;
                    C64265bq2 bq22 = lv02.f137656g;
                    String str3 = bq22 != null ? bq22.f182313e : null;
                    int i2 = bq22 != null ? bq22.f182312d : 0;
                    int i3 = bq22 != null ? bq22.f182315g : 0;
                    if (bq22 != null) {
                        i = bq22.f182314f;
                    }
                    String h = (bq22 == null || (bVar3 = bq22.f182316h) == null) ? null : bVar3.mo123705h();
                    C64265bq2 bq23 = lv02.f137656g;
                    String h2 = (bq23 == null || (bVar2 = bq23.f182317i) == null) ? null : bVar2.mo123705h();
                    C64265bq2 bq24 = lv02.f137656g;
                    String str4 = str3;
                    C52922a aVar3 = aVar2;
                    Class cls3 = cls;
                    C66505a aVar4 = r8;
                    C66505a aVar5 = new C66505a(j, str2, str4, i2, i3, i, h, h2, bq24 != null ? bq24.f182321p : 0, (bq24 == null || (bVar = bq24.f182318j) == null) ? null : bVar.f257327a, 1, 0, (String) null, false, false, 30720, (C8480h) null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("startTrtcEnterRoom liveId: ");
                    sb.append(j);
                    sb.append(" session: ");
                    sb.append(str2);
                    sb.append(" userId: ");
                    String str5 = str4;
                    sb.append(str5);
                    Log.m105924i("LiveMicIntercomSlice", sb.toString());
                    if (Util.isEqual(((C54991o) t0Var.f107146d.mo71262a(C54991o.class)).mo76015n4(), str5)) {
                        C66505a aVar6 = aVar4;
                        ((C64918r1) C86312j.m106911c(cls2)).i70(aVar6);
                        C58114h hVar = ((C55001u) t0Var.f107146d.mo71262a(cls3)).f154421r;
                        if (hVar != null) {
                            C7335d c = C86312j.m106911c(cls2);
                            C87412m.m108593f(c, "getService(IFinderLiveBaseService::class.java)");
                            ((C64918r1) c).mo89058ig((LivePreviewView) null, hVar, new C55003v0(t0Var, aVar6, aVar3));
                        }
                        C7335d c2 = C86312j.m106911c(cls2);
                        C87412m.m108593f(c2, "getService(IFinderLiveBaseService::class.java)");
                        ((C64918r1) c2).U50(0);
                    }
                } else {
                    this.f147763e.mo89761c1().mo71666a().postValue(Boolean.TRUE);
                    C65750a.m77373a1(this.f147763e);
                    FinderLiveService.f159376d.getClass();
                    C60735a aVar7 = FinderLiveService.f159378f;
                    if (aVar7 != null) {
                        aVar7.mo85679W().enableMixExternalAudioFrame(false, true);
                    }
                    C60735a aVar8 = FinderLiveService.f159378f;
                    if (aVar8 != null) {
                        aVar8.mo85684b0(false);
                    }
                    C60735a aVar9 = FinderLiveService.f159378f;
                    if (aVar9 != null) {
                        aVar9.mo85699r0(true);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52921f(C65750a aVar, C15601d<? super C52921f> dVar) {
        super(2, dVar);
        this.f147760g = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C52921f(this.f147760g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C52921f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r14.f147759f
            r2 = 0
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 == r6) goto L_0x002b
            if (r1 == r5) goto L_0x0022
            if (r1 != r4) goto L_0x001a
            java.lang.Object r0 = r14.f147758e
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x01b1
        L_0x001a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0022:
            java.lang.Object r1 = r14.f147758e
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0192
        L_0x002b:
            int r1 = r14.f147757d
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x016e
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r15)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r15 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r15.getClass()
            j50.a r15 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r15 == 0) goto L_0x0043
            boolean r15 = r15.mo85682Z()
            goto L_0x0044
        L_0x0043:
            r15 = 0
        L_0x0044:
            r1 = r15 ^ 1
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r7 = "start requestApplyMicIntercom currentSessionId: "
            r15.append(r7)
            vi1.a r7 = r14.f147760g
            java.lang.String r7 = r7.f189150v
            r15.append(r7)
            java.lang.String r15 = r15.toString()
            java.lang.String r7 = "FinderLiveMicIntercomBo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r15)
            vi1.a r15 = r14.f147760g
            ui1.a r15 = r15.f189151w
            r14.f147757d = r1
            r14.f147759f = r6
            ui1.e r15 = (ui1.C52581e) r15
            r15.getClass()
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            java.lang.Class<cl1.u> r8 = cl1.C55001u.class
            te3.kv0 r9 = new te3.kv0
            r9.<init>()
            je1.h2 r10 = je1.C46523h2.f125330a
            r11 = 8609(0x21a1, float:1.2064E-41)
            te3.ig0 r10 = r10.mo71859a(r11)
            r9.f137053d = r10
            zc1.b r10 = zc1.C66785b.f191882e
            java.lang.String r10 = r10.mo90662O5()
            r9.f137060n = r10
            qj1.c r10 = r15.f146862a
            androidx.lifecycle.i0 r10 = r10.mo87696x0(r8)
            cl1.u r10 = (cl1.C55001u) r10
            long r12 = r10.f154416j
            r9.f137057h = r12
            fj1.b r10 = fj1.C45795b.f123698n
            if (r10 == 0) goto L_0x00a2
            androidx.lifecycle.i0 r10 = r10.mo71262a(r8)
            cl1.u r10 = (cl1.C55001u) r10
            byte[] r10 = r10.f154417n
            goto L_0x00a3
        L_0x00a2:
            r10 = r3
        L_0x00a3:
            pe3.b r10 = pe3.C89349b.m111674a(r10)
            r9.f137054e = r10
            qj1.c r10 = r15.f146862a
            androidx.lifecycle.i0 r10 = r10.mo87696x0(r8)
            cl1.u r10 = (cl1.C55001u) r10
            te3.c21 r10 = r10.f154420q
            long r12 = r10.f182392d
            r9.f137056g = r12
            qj1.c r10 = r15.f146862a
            androidx.lifecycle.i0 r10 = r10.mo87696x0(r7)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.f154190D
            if (r10 == 0) goto L_0x00c5
            r10 = 3
            goto L_0x00d6
        L_0x00c5:
            qj1.c r10 = r15.f146862a
            androidx.lifecycle.i0 r10 = r10.mo87696x0(r7)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.mo75991Z3()
            if (r10 == 0) goto L_0x00d5
            r10 = 1
            goto L_0x00d6
        L_0x00d5:
            r10 = 2
        L_0x00d6:
            r9.f137059j = r10
            fj1.b r10 = fj1.C45795b.f123698n
            if (r10 == 0) goto L_0x00e5
            androidx.lifecycle.i0 r8 = r10.mo71262a(r8)
            cl1.u r8 = (cl1.C55001u) r8
            java.lang.String r8 = r8.f154423t
            goto L_0x00e6
        L_0x00e5:
            r8 = r3
        L_0x00e6:
            r9.f137058i = r8
            r9.f137061o = r1
            te3.xs0 r8 = new te3.xs0
            r8.<init>()
            ok1.e r10 = ok1.C62042e.f176370a
            boolean r10 = r10.mo87027N0()
            if (r10 != 0) goto L_0x0111
            te3.hx0 r10 = new te3.hx0
            r10.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r12 = new com.tencent.mm.protocal.protobuf.FinderContact
            r12.<init>()
            qj1.c r13 = r15.f146862a
            androidx.lifecycle.i0 r13 = r13.mo87696x0(r7)
            cl1.o r13 = (cl1.C54991o) r13
            java.lang.String r13 = r13.f154345o
            r12.username = r13
            r10.f134919d = r12
            r8.f144902d = r10
        L_0x0111:
            te3.gt0 r10 = new te3.gt0
            r10.<init>()
            qj1.c r15 = r15.f146862a
            androidx.lifecycle.i0 r15 = r15.mo87696x0(r7)
            cl1.o r15 = (cl1.C54991o) r15
            java.lang.String r15 = r15.mo76015n4()
            r10.f134256e = r15
            byte[] r15 = r10.toByteArray()
            pe3.b r15 = pe3.C89349b.m111674a(r15)
            r8.f144906h = r15
            r15 = 20059(0x4e5b, float:2.8109E-41)
            r8.f144903e = r15
            er1.j4 r15 = er1.C58739j4.f168176a
            java.lang.String r15 = r15.mo83718n()
            r8.f144904f = r15
            r9.f137055f = r8
            ob0.c$b r15 = new ob0.c$b
            r15.<init>()
            r15.f127069d = r11
            java.lang.String r7 = "/cgi-bin/micromsg-bin/finderliveapplymicintercom"
            r15.f127068c = r7
            r15.f127066a = r9
            te3.lv0 r7 = new te3.lv0
            r7.<init>()
            r15.f127067b = r7
            ob0.c r15 = r15.mo72403a()
            java.lang.Class<ht1.s1> r7 = ht1.C8802s1.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ht1.s1 r7 = (ht1.C8802s1) r7
            ob0.b r7 = r7.mo9632ui()
            r7.mo123453j(r15)
            a14.h0 r15 = a14.C53872d1.f151117a
            a14.k2 r15 = f14.C58901s.f168555a
            java.lang.Object r15 = bi1.C0283d.m243a(r7, r15, r14)
            if (r15 != r0) goto L_0x016e
            return r0
        L_0x016e:
            bi1.e r15 = (bi1.C0287e) r15
            vi1.a r7 = r14.f147760g
            boolean r8 = r15 instanceof bi1.C0288f
            if (r8 == 0) goto L_0x0193
            wx3.f r8 = r15.f854a
            if (r8 != 0) goto L_0x017e
            wx3.f r8 = r14.getContext()
        L_0x017e:
            vi1.f$c r9 = new vi1.f$c
            if (r1 == 0) goto L_0x0183
            r2 = 1
        L_0x0183:
            r9.<init>(r15, r3, r7, r2)
            r14.f147758e = r15
            r14.f147759f = r5
            java.lang.Object r1 = a14.C53895h.m60469g(r8, r9, r14)
            if (r1 != r0) goto L_0x0191
            return r0
        L_0x0191:
            r1 = r15
        L_0x0192:
            r15 = r1
        L_0x0193:
            vi1.a r1 = r14.f147760g
            boolean r2 = r15 instanceof bi1.C0281b
            if (r2 == 0) goto L_0x01b1
            wx3.f r2 = r15.f854a
            if (r2 != 0) goto L_0x01a1
            wx3.f r2 = r14.getContext()
        L_0x01a1:
            vi1.f$b r5 = new vi1.f$b
            r5.<init>(r15, r3, r1)
            r14.f147758e = r15
            r14.f147759f = r4
            java.lang.Object r15 = a14.C53895h.m60469g(r2, r5, r14)
            if (r15 != r0) goto L_0x01b1
            return r0
        L_0x01b1:
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: vi1.C52921f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
