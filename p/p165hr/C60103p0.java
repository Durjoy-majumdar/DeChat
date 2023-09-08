package p165hr;

import a14.C0000n0;
import android.app.Activity;
import android.content.Context;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di0.C86299o;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import er1.C58719f2;
import er1.C58742k2;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import hp3.C87581a;
import ig1.C33320g;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C46528o0;
import jp3.C9487b;
import kotlin.ResultKt;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import ok1.C62042e;
import p565ir.C60613r;
import pe3.C89349b;
import qg1.C62611b0;
import rx3.C13598b0;
import sn1.C13737b;
import te3.C49037cq0;
import te3.C49255ea1;
import te3.C49712hj1;
import te3.C49805i60;
import te3.C50858pp0;
import te3.C64281ca1;
import te3.C64287ci1;
import te3.C64370fp1;
import te3.C64834xn2;
import te3.z44;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@C86522b
/* renamed from: hr.p0 */
public final class C60103p0 extends C86301e implements C60613r {

    /* renamed from: d */
    public final String f171501d = "Finder.FinderLiveUtilService";

    /* renamed from: hr.p0$d */
    public static final class C8712d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<C49805i60, C13598b0> f27943a;

        public C8712d(C32226l<? super C49805i60, C13598b0> lVar) {
            this.f27943a = lVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C61926c.m72668M(new C8713q0(this.f27943a, cVar));
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.finder.live.FinderLiveUtilService$getEcSource$$inlined$fail$default$1", mo125469f = "FinderLiveUtilService.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: hr.p0$a */
    public static final class C46100a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f124267d;

        /* renamed from: e */
        public final /* synthetic */ C60103p0 f124268e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46100a(C0287e eVar, C15601d dVar, C60103p0 p0Var) {
            super(2, dVar);
            this.f124267d = eVar;
            this.f124268e = p0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C46100a(this.f124267d, dVar, this.f124268e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C46100a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            String str = this.f124268e.f171501d;
            Log.m105924i(str, "getEcSource failed: " + ((C0280a) ((C0281b) this.f124267d).f843b));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.finder.live.FinderLiveUtilService$getEcSource$$inlined$success$default$1", mo125469f = "FinderLiveUtilService.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: hr.p0$b */
    public static final class C46101b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f124269d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0 f124270e;

        /* renamed from: f */
        public final /* synthetic */ C60103p0 f124271f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46101b(C0287e eVar, C15601d dVar, C8479f0 f0Var, C60103p0 p0Var) {
            super(2, dVar);
            this.f124269d = eVar;
            this.f124270e = f0Var;
            this.f124271f = p0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C46101b(this.f124269d, dVar, this.f124270e, this.f124271f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C46101b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.ResultKt.throwOnFailure(r6)
                bi1.e r6 = r5.f124269d
                bi1.f r6 = (bi1.C0288f) r6
                T r6 = r6.f855b
                te3.ea1 r6 = (te3.C49255ea1) r6
                gy3.f0 r0 = r5.f124270e
                te3.rm0 r1 = new te3.rm0
                r1.<init>()
                pe3.b r6 = r6.f132825d
                r2 = 0
                if (r6 == 0) goto L_0x001c
                byte[] r6 = r6.mo123703f()
                goto L_0x001d
            L_0x001c:
                r6 = r2
            L_0x001d:
                java.lang.String r3 = ""
                if (r6 != 0) goto L_0x0023
            L_0x0021:
                r1 = r2
                goto L_0x0034
            L_0x0023:
                r1.parseFrom(r6)     // Catch:{ Exception -> 0x0027 }
                goto L_0x0034
            L_0x0027:
                r6 = move-exception
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r4 = 0
                r1[r4] = r6
                java.lang.String r6 = "safeParser"
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r3, r1)
                goto L_0x0021
            L_0x0034:
                if (r1 == 0) goto L_0x0038
                java.lang.String r2 = r1.f141028d
            L_0x0038:
                if (r2 != 0) goto L_0x003b
                goto L_0x003c
            L_0x003b:
                r3 = r2
            L_0x003c:
                r0.f27484d = r3
                hr.p0 r6 = r5.f124271f
                java.lang.String r6 = r6.f171501d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "getEcSource result:"
                r0.append(r1)
                gy3.f0 r1 = r5.f124270e
                T r1 = r1.f27484d
                java.lang.String r1 = (java.lang.String) r1
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p165hr.C60103p0.C46101b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.finder.live.FinderLiveUtilService", mo125469f = "FinderLiveUtilService.kt", mo125470l = {128, 140, 147}, mo125471m = "getEcSource")
    /* renamed from: hr.p0$c */
    public static final class C60104c extends C66704d {

        /* renamed from: d */
        public Object f171502d;

        /* renamed from: e */
        public Object f171503e;

        /* renamed from: f */
        public Object f171504f;

        /* renamed from: g */
        public /* synthetic */ Object f171505g;

        /* renamed from: h */
        public final /* synthetic */ C60103p0 f171506h;

        /* renamed from: i */
        public int f171507i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60104c(C60103p0 p0Var, C15601d<? super C60104c> dVar) {
            super(dVar);
            this.f171506h = p0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f171505g = obj;
            this.f171507i |= Integer.MIN_VALUE;
            return this.f171506h.N10((String) null, 0, (String) null, 0, this);
        }
    }

    /* renamed from: Bs */
    public boolean mo84971Bs(long j, int i) {
        C62042e.f176370a.getClass();
        C33320g jo = ((C60106t) C86312j.m106911c(C60106t.class)).Bx0().mo59081jo(j);
        if (!(jo.systemRowid != -1)) {
            jo = null;
        }
        if (jo != null) {
            return C61926c.m72696u(jo.field_controlFlag, i);
        }
        return false;
    }

    public void Ih0(Context context, C64287ci1 ci12, C32226l<? super C50858pp0, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(ci12, "shareObject");
        C87412m.m108594g(lVar, "callback");
        C58719f2.f168110a.mo83634g(ci12, "Finder.FinderProductShareUtil_requestProductInfo");
        String str = ci12.f182496e;
        String str2 = str == null ? "" : str;
        String str3 = ci12.f182497f;
        String str4 = "0";
        if (str3 == null) {
            str3 = str4;
        }
        long P = C61926c.m72671P(str3);
        String str5 = ci12.f182502n;
        if (str5 != null) {
            str4 = str5;
        }
        long P2 = C61926c.m72671P(str4);
        String str6 = ci12.f182495d;
        int i = (str6 == null || str6.length() == 0) ^ true ? 1 : 2;
        String str7 = ci12.f182512x;
        new C46528o0(str2, P, P2, i, str7 == null ? "" : str7).mo9225i().mo123420E(new C58742k2(ci12, lVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object N10(java.lang.String r14, int r15, java.lang.String r16, long r17, wx3.C15601d<? super java.lang.String> r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r19
            boolean r5 = r4 instanceof p165hr.C60103p0.C60104c
            if (r5 == 0) goto L_0x001a
            r5 = r4
            hr.p0$c r5 = (p165hr.C60103p0.C60104c) r5
            int r6 = r5.f171507i
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001a
            int r6 = r6 - r7
            r5.f171507i = r6
            goto L_0x001f
        L_0x001a:
            hr.p0$c r5 = new hr.p0$c
            r5.<init>(r13, r4)
        L_0x001f:
            java.lang.Object r4 = r5.f171505g
            xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
            int r7 = r5.f171507i
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r7 == 0) goto L_0x0065
            if (r7 == r10) goto L_0x0057
            if (r7 == r9) goto L_0x0046
            if (r7 != r8) goto L_0x003e
            java.lang.Object r1 = r5.f171503e
            bi1.e r1 = (bi1.C0287e) r1
            java.lang.Object r1 = r5.f171502d
            gy3.f0 r1 = (gy3.C8479f0) r1
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0122
        L_0x003e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            java.lang.Object r1 = r5.f171504f
            bi1.e r1 = (bi1.C0287e) r1
            java.lang.Object r2 = r5.f171503e
            gy3.f0 r2 = (gy3.C8479f0) r2
            java.lang.Object r3 = r5.f171502d
            hr.p0 r3 = (p165hr.C60103p0) r3
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0101
        L_0x0057:
            java.lang.Object r1 = r5.f171503e
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r2 = r5.f171502d
            hr.p0 r2 = (p165hr.C60103p0) r2
            kotlin.ResultKt.throwOnFailure(r4)
            r3 = r2
            goto L_0x00dd
        L_0x0065:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r4 = r0.f171501d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "getEcSource sharer_username:"
            r7.append(r12)
            r7.append(r14)
            java.lang.String r12 = ", share_scene:"
            r7.append(r12)
            r7.append(r15)
            java.lang.String r12 = ", finder_username:"
            r7.append(r12)
            r7.append(r3)
            java.lang.String r12 = ", object_id:"
            r7.append(r12)
            java.lang.String r12 = o40.C61926c.m72691p(r17)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            r4 = 11199(0x2bbf, float:1.5693E-41)
            te3.qm0 r7 = new te3.qm0
            r7.<init>()
            r7.f140388d = r1
            r7.f140389e = r2
            r7.f140390f = r3
            r1 = r17
            r7.f140391g = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            te3.ca1 r1 = new te3.ca1
            r1.<init>()
            r1.f182458g = r3
            r2 = 0
            qg1.b0 r3 = new qg1.b0
            java.lang.String r12 = "/cgi-bin/mmbiz-bin/findergetecsource"
            r14 = r3
            r15 = r12
            r16 = r4
            r17 = r7
            r18 = r1
            r19 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            java.lang.String r2 = ""
            r1.f27484d = r2
            r5.f171502d = r0
            r5.f171503e = r1
            r5.f171507i = r10
            java.lang.Object r4 = bi1.C0283d.m245c(r3, r11, r5, r10, r11)
            if (r4 != r6) goto L_0x00dc
            return r6
        L_0x00dc:
            r3 = r0
        L_0x00dd:
            r2 = r1
            r1 = r4
            bi1.e r1 = (bi1.C0287e) r1
            boolean r4 = r1 instanceof bi1.C0288f
            if (r4 == 0) goto L_0x0101
            wx3.f r4 = r1.f854a
            if (r4 != 0) goto L_0x00ed
            wx3.f r4 = r5.getContext()
        L_0x00ed:
            hr.p0$b r7 = new hr.p0$b
            r7.<init>(r1, r11, r2, r3)
            r5.f171502d = r3
            r5.f171503e = r2
            r5.f171504f = r1
            r5.f171507i = r9
            java.lang.Object r4 = a14.C53895h.m60469g(r4, r7, r5)
            if (r4 != r6) goto L_0x0101
            return r6
        L_0x0101:
            boolean r4 = r1 instanceof bi1.C0281b
            if (r4 == 0) goto L_0x0123
            wx3.f r4 = r1.f854a
            if (r4 != 0) goto L_0x010d
            wx3.f r4 = r5.getContext()
        L_0x010d:
            hr.p0$a r7 = new hr.p0$a
            r7.<init>(r1, r11, r3)
            r5.f171502d = r2
            r5.f171503e = r1
            r5.f171504f = r11
            r5.f171507i = r8
            java.lang.Object r1 = a14.C53895h.m60469g(r4, r7, r5)
            if (r1 != r6) goto L_0x0121
            return r6
        L_0x0121:
            r1 = r2
        L_0x0122:
            r2 = r1
        L_0x0123:
            T r1 = r2.f27484d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60103p0.N10(java.lang.String, int, java.lang.String, long, wx3.d):java.lang.Object");
    }

    /* renamed from: O8 */
    public C64287ci1 mo84974O8() {
        C58719f2 f2Var = C58719f2.f168110a;
        return C58719f2.f168112c;
    }

    public void Se0(Context context, C64287ci1 ci12, C32226l<? super C50858pp0, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(ci12, "shareObject");
        C87412m.m108594g(lVar, "callback");
        C58719f2.f168110a.mo83638k(context, ci12, lVar, true);
    }

    /* renamed from: Te */
    public void mo84976Te(String str, String str2, C86299o oVar) {
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(str2, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        C87412m.m108594g(oVar, "bundle");
        C58719f2.f168110a.mo83629a(str, str2, oVar);
    }

    public void Vb0(C64287ci1 ci12, String str, String str2) {
        C87412m.m108594g(ci12, "value");
        C87412m.m108594g(str, "eventName");
        C87412m.m108594g(str2, "params");
        C58719f2.f168110a.mo83636i(ci12, str, str2);
    }

    public String Yh0(C64287ci1 ci12) {
        C87412m.m108594g(ci12, "value");
        return C58719f2.f168110a.mo83635h(ci12);
    }

    public C64834xn2 ek0(C64370fp1 fp12) {
        T t;
        C89349b bVar;
        C87412m.m108594g(fp12, "productInfo");
        LinkedList<z44> linkedList = fp12.f183165J;
        C87412m.m108593f(linkedList, "this.show_box_items");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            boolean z = true;
            if (((z44) t).f186625d != 1) {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        z44 z44 = (z44) t;
        if (z44 == null || (bVar = z44.f186626e) == null) {
            return null;
        }
        C64834xn2 xn22 = new C64834xn2();
        xn22.parseFrom(bVar.mo123703f());
        return xn22;
    }

    /* renamed from: iW */
    public C64287ci1 mo84980iW(String str) {
        C87412m.m108594g(str, "key");
        return C58719f2.f168110a.mo83633f(str);
    }

    public boolean ot0(int i) {
        return C62042e.f176370a.mo87082h(i);
    }

    /* renamed from: tT */
    public C89132b<C49255ea1> mo84982tT(String str, int i, C49037cq0 cq02, C64281ca1 ca12) {
        C87412m.m108594g(str, "cgiUri");
        C87412m.m108594g(cq02, "req");
        C87412m.m108594g(ca12, "baseRequest");
        return new C62611b0(str, i, cq02, ca12, (C49712hj1) null);
    }

    public String ti0(C64287ci1 ci12, String str, String str2, Integer num) {
        C87412m.m108594g(ci12, "value");
        return C58719f2.f168110a.mo83631c(ci12, str, str2, num);
    }

    public void zq0(Activity activity, String str, C32226l<? super C49805i60, C13598b0> lVar) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(str, "orderId");
        C87412m.m108594g(lVar, "callback");
        C89059e i = new C13737b(str).mo9225i();
        i.mo123420E(new C8712d(lVar));
        if (activity instanceof MMActivity) {
            i.mo11397F((C9487b) activity);
        }
    }
}
