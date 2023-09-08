package qj1;

import a14.C0000n0;
import android.os.Bundle;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxPlugin$startBox$1", mo125469f = "FinderLiveBoxPlugin.kt", mo125470l = {128, 131, 133, 143, 144}, mo125471m = "invokeSuspend")
/* renamed from: qj1.j4 */
public final class C47850j4 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f128437d;

    /* renamed from: e */
    public final /* synthetic */ C47851k4 f128438e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f128439f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47850j4(C47851k4 k4Var, Bundle bundle, C15601d<? super C47850j4> dVar) {
        super(2, dVar);
        this.f128438e = k4Var;
        this.f128439f = bundle;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47850j4(this.f128438e, this.f128439f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47850j4) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x010e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Class<ht1.g4> r0 = ht1.C60172g4.class
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r10.f128437d
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            if (r2 == 0) goto L_0x0038
            if (r2 == r3) goto L_0x0034
            if (r2 == r9) goto L_0x002f
            if (r2 == r8) goto L_0x002b
            if (r2 == r7) goto L_0x0026
            if (r2 != r6) goto L_0x001e
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x010f
        L_0x001e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0102
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x008f
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00d5
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0069
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r11)
            qj1.k4 r11 = r10.f128438e
            java.lang.String r11 = r11.f128443s
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x0047
            r11 = 1
            goto L_0x0048
        L_0x0047:
            r11 = 0
        L_0x0048:
            if (r11 == 0) goto L_0x00df
            qj1.k4 r11 = r10.f128438e
            cl1.j r2 = r11.f128444t
            bl3.r r6 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r11 = r11.f128441q
            bl3.r$a r11 = r6.mo62444c(r11)
            bl3.c r11 = r11.mo62447c(r0)
            ht1.g4 r11 = (ht1.C60172g4) r11
            te3.hj1 r11 = r11.mo12861q3()
            r10.f128437d = r3
            java.lang.Object r11 = r2.mo62579f3(r11, r10)
            if (r11 != r1) goto L_0x0069
            return r1
        L_0x0069:
            nk1.h r11 = nk1.C47272h.f126894a
            qj1.k4 r0 = r10.f128438e
            java.lang.String r0 = r0.f128443s
            boolean r0 = r11.mo72302g(r0)
            if (r0 != 0) goto L_0x00c8
            qj1.k4 r0 = r10.f128438e
            java.lang.String r0 = r0.f128443s
            boolean r11 = r11.mo72303h(r0)
            if (r11 == 0) goto L_0x0080
            goto L_0x00c8
        L_0x0080:
            qj1.k4 r11 = r10.f128438e
            cl1.j r0 = r11.f128444t
            java.lang.String r11 = r11.f128443s
            r10.f128437d = r8
            java.lang.Object r11 = r0.mo62583k3(r11, r3, r10)
            if (r11 != r1) goto L_0x008f
            return r1
        L_0x008f:
            qj1.k4 r11 = r10.f128438e
            cl1.j r0 = r11.f128444t
            java.lang.String r11 = r11.f128443s
            java.lang.String r1 = "boxId"
            gy3.C87412m.m108594g(r11, r1)
            te3.lw0 r2 = new te3.lw0
            r2.<init>()
            r2.f137676d = r3
            r2.f137677e = r11
            r0.mo62576c3(r2)
            qj1.k4 r11 = r10.f128438e
            java.lang.String r11 = r11.f128443s
            gy3.C87412m.m108594g(r11, r1)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00d5 }
            r0.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "event_type"
            r0.put(r1, r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "group_box_number"
            r0.put(r1, r11)     // Catch:{ all -> 0x00d5 }
            java.lang.Class<ak1.w> r11 = ak1.C54116w.class
            di3.d r11 = di3.C86312j.m106911c(r11)     // Catch:{ all -> 0x00d5 }
            ak1.w r11 = (ak1.C54116w) r11     // Catch:{ all -> 0x00d5 }
            r11.Lx0(r0)     // Catch:{ all -> 0x00d5 }
            goto L_0x00d5
        L_0x00c8:
            qj1.k4 r11 = r10.f128438e
            cl1.j r11 = r11.f128444t
            r10.f128437d = r9
            java.lang.Object r11 = r11.mo62583k3(r5, r4, r10)
            if (r11 != r1) goto L_0x00d5
            return r1
        L_0x00d5:
            qj1.k4 r11 = r10.f128438e
            r11.getClass()
            java.lang.String r0 = ""
            r11.f128443s = r0
            goto L_0x010f
        L_0x00df:
            qj1.k4 r11 = r10.f128438e
            cl1.j r2 = r11.f128444t
            boolean r4 = r2.f107167g
            if (r4 != 0) goto L_0x010f
            bl3.r r4 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r11 = r11.f128441q
            bl3.r$a r11 = r4.mo62444c(r11)
            bl3.c r11 = r11.mo62447c(r0)
            ht1.g4 r11 = (ht1.C60172g4) r11
            te3.hj1 r11 = r11.mo12861q3()
            r10.f128437d = r7
            java.lang.Object r11 = r2.mo62579f3(r11, r10)
            if (r11 != r1) goto L_0x0102
            return r1
        L_0x0102:
            qj1.k4 r11 = r10.f128438e
            cl1.j r11 = r11.f128444t
            r10.f128437d = r6
            java.lang.Object r11 = r11.mo62583k3(r5, r3, r10)
            if (r11 != r1) goto L_0x010f
            return r1
        L_0x010f:
            qj1.k4 r11 = r10.f128438e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.u> r0 = r11.f128446v
            cl1.j r11 = r11.f128444t
            bl1.k r11 = r11.f107176s
            if (r11 == 0) goto L_0x011c
            androidx.lifecycle.z<java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.u>> r11 = r11.f106764c
            goto L_0x011d
        L_0x011c:
            r11 = r5
        L_0x011d:
            if (r11 == 0) goto L_0x0126
            java.lang.Object r11 = r11.getValue()
            java.util.concurrent.ConcurrentHashMap r11 = (java.util.concurrent.ConcurrentHashMap) r11
            goto L_0x0127
        L_0x0126:
            r11 = r5
        L_0x0127:
            if (r11 != 0) goto L_0x012b
            sx3.g0 r11 = sx3.C36903g0.f97931d
        L_0x012b:
            r0.putAll(r11)
            qj1.k4 r11 = r10.f128438e
            cl1.j r0 = r11.f128444t
            bl1.k r0 = r0.f107176s
            if (r0 == 0) goto L_0x0138
            androidx.lifecycle.z<java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.u>> r5 = r0.f106764c
        L_0x0138:
            if (r5 == 0) goto L_0x013f
            androidx.lifecycle.a0<java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.u>> r0 = r11.f128447w
            r5.observe(r11, r0)
        L_0x013f:
            java.lang.String r11 = "Finder.FinderLiveBoxPlugin"
            java.lang.String r0 = "mainFlowLog status FINDER_LIVE_INIT_BOX_INFO"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            qj1.k4 r11 = r10.f128438e
            d60.b r11 = r11.f128440p
            d60.b$b r0 = d60.C58124b.C58125b.FINDER_LIVE_INIT_BOX_INFO
            android.os.Bundle r1 = r10.f128439f
            r11.statusChange(r0, r1)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C47850j4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
