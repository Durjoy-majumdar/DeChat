package wg1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54116w;
import android.os.Bundle;
import cj1.C0639y1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C58291w0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76879j;
import qj1.C12360e8;
import rx3.C13598b0;
import te3.C50767p11;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAllowanceGiftBubblePresenter$onVisitorClick$3", mo125469f = "FinderLiveAllowanceGiftBubblePresenter.kt", mo125470l = {195}, mo125471m = "invokeSuspend")
/* renamed from: wg1.e */
public final class C15267e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f41520d;

    /* renamed from: e */
    public Object f41521e;

    /* renamed from: f */
    public int f41522f;

    /* renamed from: g */
    public final /* synthetic */ C15300h f41523g;

    /* renamed from: wg1.e$a */
    public static final class C15268a implements C12360e8.C12371d {

        /* renamed from: a */
        public final /* synthetic */ C15300h f41524a;

        /* renamed from: b */
        public final /* synthetic */ C32224a<C13598b0> f41525b;

        /* renamed from: c */
        public final /* synthetic */ C32226l<String, C13598b0> f41526c;

        public C15268a(C15300h hVar, C32224a<C13598b0> aVar, C32226l<? super String, C13598b0> lVar) {
            this.f41524a = hVar;
            this.f41525b = aVar;
            this.f41526c = lVar;
        }

        /* renamed from: a */
        public void mo9974a(boolean z, int i, C12360e8.C12371d.C12373b bVar, String str, Long l, int i2, String str2, String str3, C58291w0 w0Var) {
            C87412m.m108594g(bVar, "errType");
            String str4 = " sendGiftCallback success:" + z + "  errCode:" + i + "  errType:" + bVar + "  rewardGiftId:" + str + "  balance:" + l + "  cnt:" + i2 + "  comboId:" + str2 + "  errMsg:" + str3;
            Log.m105924i("FinderLiveAllowanceGiftBubblePresenter", "#onVisitorClick" + str4);
            if (z) {
                C58124b.C7172a.m7372a(this.f41524a.f41599g, C58124b.C58125b.FINDER_LIVE_ALLOWANCE_BUBBLE_PAY_SUCCESS, (Bundle) null, 2, (Object) null);
                return;
            }
            this.f41525b.invoke();
            this.f41526c.invoke(str4);
        }
    }

    /* renamed from: wg1.e$b */
    public static final class C15269b extends C87413o implements C32224a<C53973z1> {

        /* renamed from: d */
        public final /* synthetic */ C50767p11 f41527d;

        /* renamed from: e */
        public final /* synthetic */ C15300h f41528e;

        /* renamed from: f */
        public final /* synthetic */ String f41529f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15269b(C50767p11 p112, C15300h hVar, String str) {
            super(0);
            this.f41527d = p112;
            this.f41528e = hVar;
            this.f41529f = str;
        }

        public Object invoke() {
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            C54067f0.C0072w wVar2 = C54067f0.C0072w.GET_SUCCESS;
            String str = this.f41527d.f139507d;
            if (str == null) {
                str = "";
            }
            wVar.iy0(wVar2, str);
            C58124b bVar = this.f41528e.f41599g;
            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_ALLOWANCE_BUBBLE_OPEN_SUCCESS;
            Bundle bundle = new Bundle();
            C50767p11 p112 = this.f41527d;
            if (!C0639y1.f1510a.mo613e(p112.f139507d)) {
                bundle.putString("PARAM_FINDER_LIVE_ALLOWANCE_GIFT_ICON_URL", p112.f139509f);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle);
            C15300h hVar = this.f41528e;
            return C53895h.m60466d(hVar.f41603n, (C66212f) null, (C53934p0) null, new C15273f(hVar, this.f41527d, this.f41529f, (C15601d<? super C15273f>) null), 3, (Object) null);
        }
    }

    /* renamed from: wg1.e$c */
    public static final class C15270c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15300h f41530d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15270c(C15300h hVar) {
            super(1);
            this.f41530d = hVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "msg");
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
                C76879j.m92748s(this.f41530d.f41597e, str, "抽奖失败，测试包可见");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.e$d */
    public static final class C15271d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15300h f41531d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15271d(C15300h hVar) {
            super(0);
            this.f41531d = hVar;
        }

        public Object invoke() {
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            ((C54116w) c).iy0(C54067f0.C0072w.GET_FAIL, "");
            C58124b.C7172a.m7372a(this.f41531d.f41599g, C58124b.C58125b.FINDER_LIVE_ALLOWANCE_BUBBLE_OPEN_FAILED, (Bundle) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15267e(C15300h hVar, C15601d<? super C15267e> dVar) {
        super(2, dVar);
        this.f41523g = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15267e(this.f41523g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15267e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: wg1.e$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: wg1.e$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: fy3.l} */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ab, code lost:
        if (r3 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e A[SYNTHETIC, Splitter:B:38:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a7 A[SYNTHETIC, Splitter:B:47:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c3 A[SYNTHETIC, Splitter:B:54:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            r41 = this;
            r8 = r41
            java.lang.Class<cl1.a> r0 = cl1.C0651a.class
            java.lang.Class<cl1.u> r9 = cl1.C55001u.class
            xx3.a r10 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f41522f
            java.lang.String r11 = "#onVisitorClick"
            java.lang.String r12 = "FinderLiveAllowanceGiftBubblePresenter"
            java.lang.String r15 = ""
            r7 = 1
            r16 = 0
            if (r1 == 0) goto L_0x0035
            if (r1 != r7) goto L_0x002d
            java.lang.Object r0 = r8.f41521e
            r1 = r0
            fy3.l r1 = (fy3.C32226l) r1
            java.lang.Object r0 = r8.f41520d
            fy3.a r0 = (fy3.C32224a) r0
            kotlin.ResultKt.throwOnFailure(r42)     // Catch:{ d -> 0x002a }
            r2 = r1
            r13 = 1
            r1 = r0
            r0 = r42
            goto L_0x00f3
        L_0x002a:
            r0 = move-exception
            goto L_0x021f
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r42)
            wg1.e$d r6 = new wg1.e$d
            wg1.h r1 = r8.f41523g
            r6.<init>(r1)
            wg1.e$c r5 = new wg1.e$c
            wg1.h r1 = r8.f41523g
            r5.<init>(r1)
            zc1.b r1 = zc1.C66785b.f191882e     // Catch:{ d -> 0x021a }
            java.lang.String r18 = r1.mo90662O5()     // Catch:{ d -> 0x021a }
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d     // Catch:{ d -> 0x021a }
            androidx.lifecycle.i0 r2 = r1.mo77630e(r9)     // Catch:{ d -> 0x021a }
            cl1.u r2 = (cl1.C55001u) r2     // Catch:{ d -> 0x021a }
            if (r2 == 0) goto L_0x005c
            byte[] r2 = r2.f154417n     // Catch:{ d -> 0x0082 }
            goto L_0x005e
        L_0x0059:
            r1 = r5
            goto L_0x021f
        L_0x005c:
            r2 = r16
        L_0x005e:
            pe3.b r19 = pe3.C89349b.m111674a(r2)     // Catch:{ d -> 0x021a }
            androidx.lifecycle.i0 r2 = r1.mo77630e(r9)     // Catch:{ d -> 0x021a }
            cl1.u r2 = (cl1.C55001u) r2     // Catch:{ d -> 0x021a }
            if (r2 == 0) goto L_0x006f
            long r2 = r2.f154416j     // Catch:{ d -> 0x0082 }
            r20 = r2
            goto L_0x0071
        L_0x006f:
            r20 = 0
        L_0x0071:
            androidx.lifecycle.i0 r2 = r1.mo77630e(r9)     // Catch:{ d -> 0x021a }
            cl1.u r2 = (cl1.C55001u) r2     // Catch:{ d -> 0x021a }
            if (r2 == 0) goto L_0x0084
            te3.c21 r2 = r2.f154420q     // Catch:{ d -> 0x0082 }
            if (r2 == 0) goto L_0x0084
            long r2 = r2.f182392d     // Catch:{ d -> 0x0082 }
            r22 = r2
            goto L_0x0086
        L_0x0082:
            r0 = move-exception
            goto L_0x0059
        L_0x0084:
            r22 = 0
        L_0x0086:
            androidx.lifecycle.i0 r2 = r1.mo77630e(r9)     // Catch:{ d -> 0x021a }
            cl1.u r2 = (cl1.C55001u) r2     // Catch:{ d -> 0x021a }
            if (r2 == 0) goto L_0x0096
            java.lang.String r2 = r2.f154423t     // Catch:{ d -> 0x0082 }
            if (r2 != 0) goto L_0x0093
            goto L_0x0096
        L_0x0093:
            r24 = r2
            goto L_0x0098
        L_0x0096:
            r24 = r15
        L_0x0098:
            r25 = 1
            te3.d01 r2 = new te3.d01     // Catch:{ d -> 0x021a }
            r2.<init>()     // Catch:{ d -> 0x021a }
            androidx.lifecycle.i0 r3 = r1.mo77630e(r0)     // Catch:{ d -> 0x021a }
            cl1.a r3 = (cl1.C0651a) r3     // Catch:{ d -> 0x021a }
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = r3.mo622c3()     // Catch:{ d -> 0x0082 }
            if (r3 != 0) goto L_0x00ae
        L_0x00ad:
            r3 = r15
        L_0x00ae:
            r2.f132051d = r3     // Catch:{ d -> 0x021a }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ d -> 0x021a }
            dj1.f0 r3 = new dj1.f0     // Catch:{ d -> 0x021a }
            r17 = r3
            r26 = r2
            r17.<init>(r18, r19, r20, r22, r24, r25, r26)     // Catch:{ d -> 0x021a }
            androidx.lifecycle.i0 r0 = r1.mo77630e(r0)     // Catch:{ d -> 0x021a }
            cl1.a r0 = (cl1.C0651a) r0     // Catch:{ d -> 0x021a }
            if (r0 == 0) goto L_0x00cf
            java.lang.String r1 = r0.mo622c3()     // Catch:{ d -> 0x0082 }
            r0.f1538f = r1     // Catch:{ d -> 0x0082 }
            r0.f1539g = r15     // Catch:{ d -> 0x0082 }
            r1 = -1
            r0.f1540h = r1     // Catch:{ d -> 0x0082 }
        L_0x00cf:
            r17 = 0
            r4 = 0
            r0 = 3
            r19 = 0
            r8.f41520d = r6     // Catch:{ d -> 0x021a }
            r8.f41521e = r5     // Catch:{ d -> 0x021a }
            r8.f41522f = r7     // Catch:{ d -> 0x021a }
            r1 = r3
            r2 = r17
            r17 = r5
            r5 = r41
            r18 = r6
            r6 = r0
            r13 = 1
            r7 = r19
            java.lang.Object r0 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ d -> 0x0218 }
            if (r0 != r10) goto L_0x00ef
            return r10
        L_0x00ef:
            r2 = r17
            r1 = r18
        L_0x00f3:
            te3.uz0 r0 = (te3.C51617uz0) r0     // Catch:{ d -> 0x0215 }
            te3.e01 r3 = new te3.e01
            r3.<init>()
            pe3.b r0 = r0.f143198e
            if (r0 == 0) goto L_0x0103
            byte[] r0 = r0.mo123703f()
            goto L_0x0105
        L_0x0103:
            r0 = r16
        L_0x0105:
            r7 = 0
            if (r0 != 0) goto L_0x010b
        L_0x0108:
            r3 = r16
            goto L_0x011c
        L_0x010b:
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x011c
        L_0x010f:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r7] = r3
            java.lang.String r3 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r15, r0)
            goto L_0x0108
        L_0x011c:
            if (r3 == 0) goto L_0x0212
            wg1.h r0 = r8.f41523g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = " CgiFinderLiveGetDeliveryDetail result.ret_code:"
            r4.append(r5)
            int r5 = r3.f132606f
            r4.append(r5)
            java.lang.String r5 = "   result.package_id:"
            r4.append(r5)
            java.lang.String r5 = r3.f132604d
            r4.append(r5)
            java.lang.String r5 = "   result.gift_type:"
            r4.append(r5)
            te3.p11 r5 = r3.f132605e
            if (r5 == 0) goto L_0x014a
            int r5 = r5.f139517q
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            goto L_0x014c
        L_0x014a:
            r6 = r16
        L_0x014c:
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = eb0.C75592q0.m90789s()
            if (r6 == 0) goto L_0x017d
            java.nio.charset.Charset r10 = z04.C119027c.f356488a
            byte[] r6 = r6.getBytes(r10)
            java.lang.String r10 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r6, r10)
            goto L_0x017f
        L_0x017d:
            r6 = r16
        L_0x017f:
            java.lang.String r6 = p823sg.C90193h.m112878f(r6)
            r5.append(r6)
            r6 = 95
            r5.append(r6)
            java.util.UUID r6 = java.util.UUID.randomUUID()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r6 = r3.f132606f
            if (r6 != 0) goto L_0x020c
            pe3.b r4 = r3.f132607g
            if (r4 == 0) goto L_0x019f
            r7 = 1
        L_0x019f:
            if (r7 == 0) goto L_0x01a3
            r4 = r3
            goto L_0x01a5
        L_0x01a3:
            r4 = r16
        L_0x01a5:
            if (r4 == 0) goto L_0x0212
            te3.p11 r4 = r4.f132605e
            if (r4 == 0) goto L_0x0212
            wg1.e$b r6 = new wg1.e$b
            r6.<init>(r4, r0, r5)
            r6.invoke()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r6.getClass()
            cj1.n5 r22 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159396y
            if (r22 == 0) goto L_0x0212
            android.content.Context r7 = r0.f41597e
            androidx.lifecycle.i0 r10 = r6.mo77630e(r9)
            cl1.u r10 = (cl1.C55001u) r10
            if (r10 == 0) goto L_0x01cf
            te3.c21 r10 = r10.f154420q
            if (r10 == 0) goto L_0x01cf
            long r10 = r10.f182392d
            r24 = r10
            goto L_0x01d1
        L_0x01cf:
            r24 = 0
        L_0x01d1:
            androidx.lifecycle.i0 r6 = r6.mo77630e(r9)
            cl1.u r6 = (cl1.C55001u) r6
            if (r6 == 0) goto L_0x01de
            long r13 = r6.f154416j
            r26 = r13
            goto L_0x01e0
        L_0x01de:
            r26 = 0
        L_0x01e0:
            java.lang.String r6 = r4.f139507d
            r28 = r6
            r29 = 1
            float r4 = r4.f139516p
            int r4 = (int) r4
            r30 = r4
            r33 = 3
            pe3.b r3 = r3.f132607g
            r34 = r3
            sx3.f0 r35 = sx3.C64186f0.f181907d
            r36 = 0
            r37 = 0
            wg1.e$a r3 = new wg1.e$a
            r38 = r3
            r3.<init>(r0, r1, r2)
            r39 = 6144(0x1800, float:8.61E-42)
            r40 = 0
            java.lang.String r32 = ""
            r23 = r7
            r31 = r5
            cj1.C54795n5.C54796a.m61725c(r22, r23, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x0212
        L_0x020c:
            r1.invoke()
            r2.invoke(r4)
        L_0x0212:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0215:
            r0 = move-exception
            r1 = r2
            goto L_0x021f
        L_0x0218:
            r0 = move-exception
            goto L_0x021d
        L_0x021a:
            r0 = move-exception
            r17 = r5
        L_0x021d:
            r1 = r17
        L_0x021f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " CgiFinderLiveGetDeliveryDetail fail:"
            r2.append(r3)
            java.lang.String r0 = r0.getLocalizedMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r2)
            r1.invoke(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C15267e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
