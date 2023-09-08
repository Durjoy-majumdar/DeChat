package p165hr;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.C0125s;
import cj1.C54789l6;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import er1.C58719f2;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C76243a5;
import kotlin.Result;
import kotlin.ResultKt;
import kr0.C76630x0;
import o40.C61926c;
import org.json.JSONObject;
import p565ir.C60606n;
import p565ir.C60612q;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C50858pp0;
import te3.C64287ci1;
import te3.C64370fp1;
import te3.C64513l40;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@C86522b
/* renamed from: hr.m0 */
public final class C60095m0 extends C86301e implements C60612q {

    /* renamed from: d */
    public final String f171475d = "FinderLiveShoppingService";

    /* renamed from: e */
    public final String f171476e = "finder_shop_disclaimer_mmkv";

    /* renamed from: f */
    public final String f171477f = "finder_shop_disclaimer_appid";

    @C91590f(mo125468c = "com.tencent.mm.feature.finder.live.FinderLiveShoppingService$openProductMiniProgramWithTongue$1", mo125469f = "FinderLiveShoppingService.kt", mo125470l = {67, 74}, mo125471m = "invokeSuspend")
    /* renamed from: hr.m0$a */
    public static final class C60096a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f171478d;

        /* renamed from: e */
        public final /* synthetic */ C86299o f171479e;

        /* renamed from: f */
        public final /* synthetic */ C60095m0 f171480f;

        /* renamed from: g */
        public final /* synthetic */ Context f171481g;

        /* renamed from: h */
        public final /* synthetic */ String f171482h;

        /* renamed from: i */
        public final /* synthetic */ long f171483i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60096a(C86299o oVar, C60095m0 m0Var, Context context, String str, long j, C15601d<? super C60096a> dVar) {
            super(2, dVar);
            this.f171479e = oVar;
            this.f171480f = m0Var;
            this.f171481g = context;
            this.f171482h = str;
            this.f171483i = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60096a(this.f171479e, this.f171480f, this.f171481g, this.f171482h, this.f171483i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60096a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            HalfScreenConfig halfScreenConfig;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f171478d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f171479e.f250931c = ((C60606n) C86312j.m106911c(C60606n.class)).mo85010J();
                C60095m0 m0Var = this.f171480f;
                Context context = this.f171481g;
                String str2 = this.f171482h;
                long j = this.f171483i;
                this.f171478d = 1;
                obj = C60095m0.vx0(m0Var, context, str2, j, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f171481g, this.f171479e);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13604l lVar = (C13604l) obj;
            FinderObject finderObject = (FinderObject) lVar.f38555d;
            C50858pp0 pp02 = (C50858pp0) lVar.f38556e;
            String p = C61926c.m72691p(finderObject != null ? finderObject.f164794id : 0);
            if (finderObject == null || (str = finderObject.objectNonceId) == null) {
                str = "";
            }
            this.f171480f.mo84966uX(pp02, p, str, this.f171479e);
            C60095m0 m0Var2 = this.f171480f;
            C86299o oVar = this.f171479e;
            C64370fp1 fp12 = null;
            C64370fp1 fp13 = pp02 != null ? pp02.f139889d : null;
            m0Var2.getClass();
            if (fp13 != null) {
                Object obj2 = oVar.f250937i;
                if (obj2 == null) {
                    obj2 = new C54789l6();
                }
                C54789l6 l6Var = obj2 instanceof C54789l6 ? (C54789l6) obj2 : null;
                C64513l40 l402 = fp13.f183184o;
                boolean z = false;
                boolean z2 = l402 != null && l402.f184037j == 1;
                Log.m105924i(m0Var2.f171475d, "open with dragbar = " + z2);
                if (l6Var != null) {
                    l6Var.f153590n = z2;
                }
                oVar.f250937i = l6Var;
                HalfScreenConfig halfScreenConfig2 = oVar.f250912A;
                if (halfScreenConfig2 != null) {
                    HalfScreenConfig.C55452b f = halfScreenConfig2.mo76935f();
                    HalfScreenConfig halfScreenConfig3 = oVar.f250912A;
                    f.f158000l = halfScreenConfig3.f157951n;
                    f.f157983B = halfScreenConfig3.mo76932d() && z2;
                    C64513l40 l403 = fp13.f183184o;
                    if (l403 != null && l403.f184036i == 1) {
                        z = true;
                    }
                    f.f157987F = true ^ z;
                    halfScreenConfig = f.mo76967a();
                } else {
                    halfScreenConfig = null;
                }
                oVar.f250912A = halfScreenConfig;
            }
            C60095m0 m0Var3 = this.f171480f;
            Context context2 = this.f171481g;
            if (pp02 != null) {
                fp12 = pp02.f139889d;
            }
            this.f171478d = 2;
            if (m0Var3.Yv0(context2, fp12, this) == aVar) {
                return aVar;
            }
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f171481g, this.f171479e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hr.m0$b */
    public static final class C60097b extends C87413o implements C32226l<C50858pp0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15601d<C50858pp0> f171484d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60097b(C15601d<? super C50858pp0> dVar) {
            super(1);
            this.f171484d = dVar;
        }

        public Object invoke(Object obj) {
            this.f171484d.resumeWith(Result.m168114constructorimpl((C50858pp0) obj));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.finder.live.FinderLiveShoppingService", mo125469f = "FinderLiveShoppingService.kt", mo125470l = {102, 107}, mo125471m = "requestProductWithLiveInfo")
    /* renamed from: hr.m0$c */
    public static final class C60098c extends C66704d {

        /* renamed from: d */
        public Object f171485d;

        /* renamed from: e */
        public Object f171486e;

        /* renamed from: f */
        public Object f171487f;

        /* renamed from: g */
        public /* synthetic */ Object f171488g;

        /* renamed from: h */
        public final /* synthetic */ C60095m0 f171489h;

        /* renamed from: i */
        public int f171490i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60098c(C60095m0 m0Var, C15601d<? super C60098c> dVar) {
            super(dVar);
            this.f171489h = m0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f171488g = obj;
            this.f171490i |= Integer.MIN_VALUE;
            return this.f171489h.mo84964u6((Context) null, (C64287ci1) null, this);
        }
    }

    /* renamed from: hr.m0$d */
    public static final class C60099d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15601d<C13598b0> f171491d;

        public C60099d(C15601d<? super C13598b0> dVar) {
            this.f171491d = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C15601d<C13598b0> dVar = this.f171491d;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }

    /* renamed from: hr.m0$e */
    public static final class C60100e implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C15601d<C13598b0> f171492d;

        public C60100e(C15601d<? super C13598b0> dVar) {
            this.f171492d = dVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C15601d<C13598b0> dVar = this.f171492d;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object vx0(p165hr.C60095m0 r18, android.content.Context r19, java.lang.String r20, long r21, wx3.C15601d r23) {
        /*
            r0 = r18
            r9 = r19
            r10 = r20
            r1 = r23
            r18.getClass()
            boolean r2 = r1 instanceof p165hr.C60101n0
            if (r2 == 0) goto L_0x001e
            r2 = r1
            hr.n0 r2 = (p165hr.C60101n0) r2
            int r3 = r2.f171500n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001e
            int r3 = r3 - r4
            r2.f171500n = r3
            goto L_0x0023
        L_0x001e:
            hr.n0 r2 = new hr.n0
            r2.<init>(r0, r1)
        L_0x0023:
            r11 = r2
            java.lang.Object r1 = r11.f171498i
            xx3.a r12 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r11.f171500n
            r13 = 2
            r14 = 1
            if (r2 == 0) goto L_0x0066
            if (r2 == r14) goto L_0x0047
            if (r2 != r13) goto L_0x003f
            java.lang.Object r0 = r11.f171494e
            com.tencent.mm.protocal.protobuf.FinderObject r0 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r0
            java.lang.Object r2 = r11.f171493d
            it1.b r2 = (it1.C9247b) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0103
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            long r2 = r11.f171497h
            java.lang.Object r0 = r11.f171496g
            it1.b r0 = (it1.C9247b) r0
            java.lang.Object r4 = r11.f171495f
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r11.f171494e
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r11.f171493d
            hr.m0 r6 = (p165hr.C60095m0) r6
            kotlin.ResultKt.throwOnFailure(r1)
            r15 = r2
            r2 = r0
            r0 = r6
            r6 = r15
            r17 = r5
            r5 = r4
            r4 = r17
            goto L_0x00b1
        L_0x0066:
            kotlin.ResultKt.throwOnFailure(r1)
            it1.b$a r1 = it1.C9247b.f28989d
            r2 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r3 = r9.getString(r2)
            r4 = 500(0x1f4, double:2.47E-321)
            r6 = 0
            r7 = 8
            r8 = 0
            r2 = r19
            it1.b r1 = it1.C9247b.C9248a.m8889a(r1, r2, r3, r4, r6, r7, r8)
            r1.begin()
            r11.f171493d = r0
            r11.f171494e = r9
            r11.f171495f = r10
            r11.f171496g = r1
            r2 = r21
            r11.f171497h = r2
            r11.f171500n = r14
            wx3.h r4 = new wx3.h
            wx3.d r5 = xx3.C66447b.m78392b(r11)
            r4.<init>(r5)
            dj1.h0 r5 = new dj1.h0
            hr.l0 r6 = new hr.l0
            r6.<init>(r4, r0, r10)
            r5.<init>(r10, r6)
            r5.mo9225i()
            java.lang.Object r4 = r4.mo90314b()
            if (r4 != r12) goto L_0x00ac
            goto L_0x010d
        L_0x00ac:
            r6 = r2
            r5 = r10
            r2 = r1
            r1 = r4
            r4 = r9
        L_0x00b1:
            com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r1
            java.lang.String r0 = r0.f171475d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "get live info for product "
            r3.append(r8)
            java.lang.String r8 = o40.C61926c.m72691p(r6)
            r3.append(r8)
            java.lang.String r8 = ", username = "
            r3.append(r8)
            r3.append(r5)
            java.lang.String r8 = ", objectId = "
            r3.append(r8)
            r8 = 0
            if (r1 == 0) goto L_0x00de
            long r9 = r1.f164794id
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r9)
            goto L_0x00df
        L_0x00de:
            r14 = r8
        L_0x00df:
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            er1.f2 r3 = er1.C58719f2.f168110a
            r9 = 0
            r11.f171493d = r2
            r11.f171494e = r1
            r11.f171495f = r8
            r11.f171496g = r8
            r11.f171500n = r13
            java.lang.String r8 = ""
            r10 = r11
            java.lang.Object r0 = r3.mo83637j(r4, r5, r6, r8, r9, r10)
            if (r0 != r12) goto L_0x0100
            goto L_0x010d
        L_0x0100:
            r15 = r1
            r1 = r0
            r0 = r15
        L_0x0103:
            te3.pp0 r1 = (te3.C50858pp0) r1
            r2.mo8913b()
            rx3.l r12 = new rx3.l
            r12.<init>(r0, r1)
        L_0x010d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60095m0.vx0(hr.m0, android.content.Context, java.lang.String, long, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0077, code lost:
        if (r1 != 3) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0084, code lost:
        if (r2 < 0) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Yv0(android.content.Context r11, te3.C64370fp1 r12, wx3.C15601d<? super rx3.C13598b0> r13) {
        /*
            r10 = this;
            if (r12 == 0) goto L_0x0125
            java.lang.String r0 = r12.f183170P
            if (r0 != 0) goto L_0x0008
            goto L_0x0125
        L_0x0008:
            int r1 = r12.f183175U
            if (r1 == 0) goto L_0x0109
            pe1.c<java.lang.Integer> r1 = gg1.C32444a.f86176n2
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r2 = r10.f171476e
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r10.f171477f
            r3.append(r4)
            r4 = 95
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r5 = -1
            long r2 = r2.getLong(r3, r5)
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r7 = r10.f171475d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "try to show disclaimer for appid "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = ", strategy = "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r9 = ", lastShownTime = "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = ", currentTime = "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0088
            if (r1 == r7) goto L_0x0080
            r9 = 2
            if (r1 == r9) goto L_0x007a
            r2 = 3
            if (r1 == r2) goto L_0x0086
            goto L_0x0088
        L_0x007a:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isSameDay(r2, r5)
            r1 = r1 ^ r7
            goto L_0x0089
        L_0x0080:
            r5 = 0
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0088
        L_0x0086:
            r1 = 1
            goto L_0x0089
        L_0x0088:
            r1 = 0
        L_0x0089:
            if (r1 != 0) goto L_0x008d
            goto L_0x0109
        L_0x008d:
            java.lang.String r1 = r10.f171476e
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r10.f171477f
            r2.append(r3)
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            long r2 = java.lang.System.currentTimeMillis()
            r1.putLong(r0, r2)
            wx3.h r0 = new wx3.h
            wx3.d r13 = xx3.C66447b.m78392b(r13)
            r0.<init>(r13)
            qo3.a r13 = new qo3.a
            r13.<init>()
            r1 = 2131830013(0x7f1124fd, float:1.9293011E38)
            java.lang.String r1 = r11.getString(r1)
            r13.f225644a = r1
            r1 = 2131830012(0x7f1124fc, float:1.929301E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r12 = r12.f183183n
            if (r12 != 0) goto L_0x00d0
            java.lang.String r12 = ""
        L_0x00d0:
            r2[r8] = r12
            java.lang.String r12 = r11.getString(r1, r2)
            r13.f225660q = r12
            r12 = 2131830011(0x7f1124fb, float:1.9293007E38)
            java.lang.String r12 = r11.getString(r12)
            r13.f225663t = r12
            hr.m0$d r12 = new hr.m0$d
            r12.<init>(r0)
            r13.f225620C = r12
            hr.m0$e r12 = new hr.m0$e
            r12.<init>(r0)
            r13.f225622E = r12
            qo3.g r12 = new qo3.g
            r1 = 2131887328(0x7f1204e0, float:1.940926E38)
            r12.<init>(r11, r1)
            r12.mo107525e(r13)
            r12.show()
            java.lang.Object r11 = r0.mo90314b()
            xx3.a r12 = xx3.C15911a.COROUTINE_SUSPENDED
            if (r11 != r12) goto L_0x0106
            return r11
        L_0x0106:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x0109:
            java.lang.String r11 = r10.f171475d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "try show Disclaimer flag = "
            r13.append(r0)
            int r12 = r12.f183175U
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x0125:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60095m0.Yv0(android.content.Context, te3.fp1, wx3.d):java.lang.Object");
    }

    /* renamed from: pH */
    public void mo84963pH(Context context, C86299o oVar, String str, long j) {
        Context context2 = context;
        C87412m.m108594g(context, "context");
        C86299o oVar2 = oVar;
        C87412m.m108594g(oVar, "bundle");
        C87412m.m108594g(str, "anchorUsername");
        C53895h.m60466d(new LifecycleScope(this.f171475d, context2 instanceof C0125s ? (C0125s) context2 : null, 0, 4, (C8480h) null), (C66212f) null, (C53934p0) null, new C60096a(oVar, this, context, str, j, (C15601d<? super C60096a>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: u6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo84964u6(android.content.Context r17, te3.C64287ci1 r18, wx3.C15601d<? super te3.C50858pp0> r19) {
        /*
            r16 = this;
            r0 = r16
            r9 = r17
            r10 = r18
            r1 = r19
            boolean r2 = r1 instanceof p165hr.C60095m0.C60098c
            if (r2 == 0) goto L_0x001b
            r2 = r1
            hr.m0$c r2 = (p165hr.C60095m0.C60098c) r2
            int r3 = r2.f171490i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f171490i = r3
            goto L_0x0020
        L_0x001b:
            hr.m0$c r2 = new hr.m0$c
            r2.<init>(r0, r1)
        L_0x0020:
            r11 = r2
            java.lang.Object r1 = r11.f171488g
            xx3.a r12 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r11.f171490i
            r13 = 2
            r14 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r14) goto L_0x0040
            if (r2 != r13) goto L_0x0038
            java.lang.Object r2 = r11.f171485d
            it1.b r2 = (it1.C9247b) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00c3
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            java.lang.Object r2 = r11.f171487f
            it1.b r2 = (it1.C9247b) r2
            java.lang.Object r3 = r11.f171486e
            te3.ci1 r3 = (te3.C64287ci1) r3
            java.lang.Object r4 = r11.f171485d
            android.content.Context r4 = (android.content.Context) r4
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x009b
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r1)
            it1.b$a r1 = it1.C9247b.f28989d
            r2 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r3 = r9.getString(r2)
            r4 = 500(0x1f4, double:2.47E-321)
            r6 = 0
            r7 = 8
            r8 = 0
            r2 = r17
            it1.b r1 = it1.C9247b.C9248a.m8889a(r1, r2, r3, r4, r6, r7, r8)
            r1.begin()
            java.lang.String r2 = r10.f182496e
            if (r2 != 0) goto L_0x0071
            java.lang.String r2 = ""
        L_0x0071:
            r11.f171485d = r9
            r11.f171486e = r10
            r11.f171487f = r1
            r11.f171490i = r14
            wx3.h r3 = new wx3.h
            wx3.d r4 = xx3.C66447b.m78392b(r11)
            r3.<init>(r4)
            dj1.h0 r4 = new dj1.h0
            hr.l0 r5 = new hr.l0
            r5.<init>(r3, r0, r2)
            r4.<init>(r2, r5)
            r4.mo9225i()
            java.lang.Object r2 = r3.mo90314b()
            if (r2 != r12) goto L_0x0096
            return r12
        L_0x0096:
            r4 = r9
            r3 = r10
            r15 = r2
            r2 = r1
            r1 = r15
        L_0x009b:
            com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r1
            if (r1 == 0) goto L_0x00ab
            long r5 = r1.f164794id
            java.lang.String r5 = o40.C61926c.m72691p(r5)
            r3.f182497f = r5
            java.lang.String r1 = r1.objectNonceId
            r3.f182498g = r1
        L_0x00ab:
            java.lang.Class<ir.q> r1 = p565ir.C60612q.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ir.q r1 = (p565ir.C60612q) r1
            r11.f171485d = r2
            r5 = 0
            r11.f171486e = r5
            r11.f171487f = r5
            r11.f171490i = r13
            java.lang.Object r1 = r1.mo84965uW(r4, r3, r11)
            if (r1 != r12) goto L_0x00c3
            return r12
        L_0x00c3:
            te3.pp0 r1 = (te3.C50858pp0) r1
            r2.mo8913b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60095m0.mo84964u6(android.content.Context, te3.ci1, wx3.d):java.lang.Object");
    }

    /* renamed from: uW */
    public Object mo84965uW(Context context, C64287ci1 ci12, C15601d<? super C50858pp0> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C58719f2.f168110a.mo83638k(context, ci12, new C60097b(hVar), false);
        return hVar.mo90314b();
    }

    /* renamed from: uX */
    public void mo84966uX(C50858pp0 pp02, String str, String str2, C86299o oVar) {
        String str3;
        C87412m.m108594g(str, "objectId");
        C87412m.m108594g(str2, "nounceId");
        C87412m.m108594g(oVar, "bundle");
        boolean z = false;
        int i = pp02 != null ? pp02.f139891f : 0;
        int i2 = pp02 != null ? pp02.f139890e : 0;
        if (i == 1 && i2 == 1) {
            z = true;
        }
        String str4 = this.f171475d;
        Log.m105924i(str4, "isLiving = " + i + ", isInLivingRoom = " + i2);
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedId", str);
            jSONObject.put("nonceId", str2);
            str3 = jSONObject.toString();
        } else {
            str3 = "";
        }
        C87412m.m108593f(str3, "if (showLiving) {\n      …\n            \"\"\n        }");
        if (z) {
            oVar.f250926O = ((C76243a5) C86312j.m106911c(C76243a5.class)).uj0();
            oVar.f250927P = str3;
        }
    }
}
