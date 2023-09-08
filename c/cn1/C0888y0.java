package cn1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C49976jd1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.RecentWatchListConvert$requestDelete$1", mo125469f = "RecentWatchListConvert.kt", mo125470l = {342, 461, 468}, mo125471m = "invokeSuspend")
/* renamed from: cn1.y0 */
public final class C0888y0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f2098d;

    /* renamed from: e */
    public int f2099e;

    /* renamed from: f */
    public final /* synthetic */ long f2100f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.RecentWatchListConvert$requestDelete$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "RecentWatchListConvert.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: cn1.y0$a */
    public static final class C0889a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f2101d;

        /* renamed from: e */
        public final /* synthetic */ long f2102e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0889a(C0287e eVar, C15601d dVar, long j) {
            super(2, dVar);
            this.f2101d = eVar;
            this.f2102e = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0889a(this.f2101d, dVar, this.f2102e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0889a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("Finder.RecentWatchListConvert", "requestDelete fail feedId: " + this.f2102e + " error: " + ((C0280a) ((C0281b) this.f2101d).f843b));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.RecentWatchListConvert$requestDelete$1$invokeSuspend$$inlined$success$default$1", mo125469f = "RecentWatchListConvert.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: cn1.y0$b */
    public static final class C0890b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f2103d;

        /* renamed from: e */
        public final /* synthetic */ long f2104e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0890b(C0287e eVar, C15601d dVar, long j) {
            super(2, dVar);
            this.f2103d = eVar;
            this.f2104e = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0890b(this.f2103d, dVar, this.f2104e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0890b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C49976jd1 jd12 = (C49976jd1) ((C0288f) this.f2103d).f855b;
            Log.m105924i("Finder.RecentWatchListConvert", "requestDelete success feedId: " + this.f2104e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0888y0(long j, C15601d<? super C0888y0> dVar) {
        super(2, dVar);
        this.f2100f = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0888y0(this.f2100f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0888y0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f2099e
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r5) goto L_0x0029
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r8.f2098d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00ac
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            java.lang.Object r1 = r8.f2098d
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008e
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x006d
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r9)
            te3.id1 r9 = new te3.id1
            r9.<init>()
            long r6 = r8.f2100f
            r9.f135240e = r6
            r9.f135241f = r5
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            r6 = 10243(0x2803, float:1.4354E-41)
            r1.f127069d = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/findermodrecentwatchlive"
            r1.f127068c = r6
            r1.f127066a = r9
            te3.jd1 r9 = new te3.jd1
            r9.<init>()
            r1.f127067b = r9
            ob0.c r9 = r1.mo72403a()
            java.lang.Class<ht1.s1> r1 = ht1.C8802s1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.s1 r1 = (ht1.C8802s1) r1
            ob0.b r1 = r1.mo9632ui()
            r1.mo123453j(r9)
            r8.f2099e = r5
            java.lang.Object r9 = bi1.C0283d.m245c(r1, r4, r8, r5, r4)
            if (r9 != r0) goto L_0x006d
            return r0
        L_0x006d:
            r1 = r9
            bi1.e r1 = (bi1.C0287e) r1
            long r5 = r8.f2100f
            boolean r9 = r1 instanceof bi1.C0288f
            if (r9 == 0) goto L_0x008e
            wx3.f r9 = r1.f854a
            if (r9 != 0) goto L_0x007e
            wx3.f r9 = r8.getContext()
        L_0x007e:
            cn1.y0$b r7 = new cn1.y0$b
            r7.<init>(r1, r4, r5)
            r8.f2098d = r1
            r8.f2099e = r3
            java.lang.Object r9 = a14.C53895h.m60469g(r9, r7, r8)
            if (r9 != r0) goto L_0x008e
            return r0
        L_0x008e:
            long r5 = r8.f2100f
            boolean r9 = r1 instanceof bi1.C0281b
            if (r9 == 0) goto L_0x00ac
            wx3.f r9 = r1.f854a
            if (r9 != 0) goto L_0x009c
            wx3.f r9 = r8.getContext()
        L_0x009c:
            cn1.y0$a r3 = new cn1.y0$a
            r3.<init>(r1, r4, r5)
            r8.f2098d = r1
            r8.f2099e = r2
            java.lang.Object r9 = a14.C53895h.m60469g(r9, r3, r8)
            if (r9 != r0) goto L_0x00ac
            return r0
        L_0x00ac:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0888y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
