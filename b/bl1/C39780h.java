package bl1;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import te3.C51977xi;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: bl1.h */
public final class C39780h {

    /* renamed from: a */
    public static final C39780h f106743a = new C39780h();

    /* renamed from: b */
    public static final C28332g f106744b = new C28332g();

    /* renamed from: c */
    public static final ConcurrentHashMap<Long, ArrayList<C51977xi>> f106745c = new ConcurrentHashMap<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.box.BoxContextMemStore", mo125469f = "BoxContextMemStore.kt", mo125470l = {50, 60}, mo125471m = "getOrCreateBoxContext")
    /* renamed from: bl1.h$a */
    public static final class C39781a extends C66704d {

        /* renamed from: d */
        public Object f106746d;

        /* renamed from: e */
        public /* synthetic */ Object f106747e;

        /* renamed from: f */
        public final /* synthetic */ C39780h f106748f;

        /* renamed from: g */
        public int f106749g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39781a(C39780h hVar, C15601d<? super C39781a> dVar) {
            super(dVar);
            this.f106748f = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f106747e = obj;
            this.f106749g |= Integer.MIN_VALUE;
            return this.f106748f.mo62410a((String) null, 0, (String) null, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r9 = new java.util.ArrayList<>();
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62410a(java.lang.String r17, long r18, java.lang.String r20, wx3.C15601d<? super te3.C51977xi> r21) {
        /*
            r16 = this;
            r0 = r17
            r1 = r20
            r2 = r21
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            boolean r4 = r2 instanceof bl1.C39780h.C39781a
            if (r4 == 0) goto L_0x001d
            r4 = r2
            bl1.h$a r4 = (bl1.C39780h.C39781a) r4
            int r5 = r4.f106749g
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001d
            int r5 = r5 - r6
            r4.f106749g = r5
            r5 = r16
            goto L_0x0024
        L_0x001d:
            bl1.h$a r4 = new bl1.h$a
            r5 = r16
            r4.<init>(r5, r2)
        L_0x0024:
            java.lang.Object r2 = r4.f106747e
            int r6 = r4.f106749g
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x004a
            if (r6 == r8) goto L_0x0041
            if (r6 != r7) goto L_0x0039
            java.lang.Object r0 = r4.f106746d
            te3.xi r0 = (te3.C51977xi) r0
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x013e
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            java.lang.Object r0 = r4.f106746d
            te3.xi r0 = (te3.C51977xi) r0
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00da
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.ArrayList<te3.xi>> r2 = f106745c
            java.lang.Long r6 = java.lang.Long.valueOf(r18)
            java.lang.Object r9 = r2.get(r6)
            if (r9 != 0) goto L_0x0066
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r2 = r2.putIfAbsent(r6, r9)
            if (r2 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r9 = r2
        L_0x0066:
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r2 = r9.iterator()
        L_0x006c:
            boolean r6 = r2.hasNext()
            r10 = 0
            if (r6 == 0) goto L_0x0089
            java.lang.Object r6 = r2.next()
            r11 = r6
            te3.xi r11 = (te3.C51977xi) r11
            te3.lw0 r11 = r11.f144664d
            if (r11 == 0) goto L_0x0081
            java.lang.String r11 = r11.f137677e
            goto L_0x0082
        L_0x0081:
            r11 = r10
        L_0x0082:
            boolean r11 = gy3.C87412m.m108589b(r11, r1)
            if (r11 == 0) goto L_0x006c
            goto L_0x008a
        L_0x0089:
            r6 = r10
        L_0x008a:
            r2 = r6
            te3.xi r2 = (te3.C51977xi) r2
            java.lang.String r6 = ", boxId:"
            java.lang.String r11 = " getOrCreateBoxContext liveId:"
            java.lang.String r12 = "Finder.BoxContextMemStore"
            if (r2 == 0) goto L_0x00db
            er1.k r7 = er1.C45684k.f123488a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r11)
            java.lang.String r0 = o40.C61926c.m72691p(r18)
            r9.append(r0)
            r9.append(r6)
            r9.append(r1)
            java.lang.String r0 = ", exist"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r7.mo71184e(r12, r0)
            java.lang.String r0 = r7.mo71182c(r2)
            r7.mo71184e(r12, r0)
            r4.f106746d = r2
            r4.f106749g = r8
            bl1.j r0 = new bl1.j
            java.lang.String r1 = "getOrCreateBoxContext exist"
            r0.<init>(r1, r2, r10)
            java.lang.Object r0 = a14.C53930o0.m60559f(r0, r4)
            if (r0 != r3) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x00d6:
            if (r0 != r3) goto L_0x00d9
            return r3
        L_0x00d9:
            r0 = r2
        L_0x00da:
            return r0
        L_0x00db:
            te3.xi r2 = new te3.xi
            r2.<init>()
            er1.k r13 = er1.C45684k.f123488a
            java.lang.String r14 = "boxId"
            gy3.C87412m.m108594g(r1, r14)
            te3.lw0 r14 = new te3.lw0
            r14.<init>()
            r14.f137676d = r8
            r14.f137677e = r1
            r2.f144664d = r14
            r2.f144665e = r10
            r14 = r18
            r2.f144666f = r14
            r9.add(r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r11)
            java.lang.String r0 = o40.C61926c.m72691p(r18)
            r8.append(r0)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r0 = ", not exist, create boxContext, logInfo:"
            r8.append(r0)
            java.lang.String r0 = r13.mo71182c(r2)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r13.mo71184e(r12, r0)
            r4.f106746d = r2
            r4.f106749g = r7
            bl1.j r0 = new bl1.j
            java.lang.String r1 = "getOrCreateBoxContext"
            r0.<init>(r1, r2, r10)
            java.lang.Object r0 = a14.C53930o0.m60559f(r0, r4)
            if (r0 != r3) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x013a:
            if (r0 != r3) goto L_0x013d
            return r3
        L_0x013d:
            r0 = r2
        L_0x013e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bl1.C39780h.mo62410a(java.lang.String, long, java.lang.String, wx3.d):java.lang.Object");
    }
}
