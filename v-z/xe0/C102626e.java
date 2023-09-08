package xe0;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import k14.C99088c;
import kotlin.ResultKt;
import org.libpag.PAGView;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.pagloader.PagTargetDispatcher$playPag$1", mo125469f = "PagTargetDispatcher.kt", mo125470l = {124, 89, 96}, mo125471m = "invokeSuspend")
/* renamed from: xe0.e */
public final class C102626e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f302203d;

    /* renamed from: e */
    public Object f302204e;

    /* renamed from: f */
    public Object f302205f;

    /* renamed from: g */
    public Object f302206g;

    /* renamed from: h */
    public Object f302207h;

    /* renamed from: i */
    public Object f302208i;

    /* renamed from: j */
    public int f302209j;

    /* renamed from: n */
    public final /* synthetic */ C99088c f302210n;

    /* renamed from: o */
    public final /* synthetic */ C102629f f302211o;

    /* renamed from: p */
    public final /* synthetic */ PAGView f302212p;

    /* renamed from: q */
    public final /* synthetic */ String f302213q;

    /* renamed from: r */
    public final /* synthetic */ String f302214r;

    @C91590f(mo125468c = "com.tencent.mm.pagloader.PagTargetDispatcher$playPag$1$1$1", mo125469f = "PagTargetDispatcher.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: xe0.e$a */
    public static final class C102627a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ PAGView f302215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102627a(PAGView pAGView, C15601d<? super C102627a> dVar) {
            super(2, dVar);
            this.f302215d = pAGView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C102627a(this.f302215d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C102627a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f302215d.stop();
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.pagloader.PagTargetDispatcher$playPag$1$1$2", mo125469f = "PagTargetDispatcher.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: xe0.e$b */
    public static final class C102628b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ PAGView f302216d;

        /* renamed from: e */
        public final /* synthetic */ C102629f f302217e;

        /* renamed from: f */
        public final /* synthetic */ String f302218f;

        /* renamed from: g */
        public final /* synthetic */ String f302219g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102628b(PAGView pAGView, C102629f fVar, String str, String str2, C15601d<? super C102628b> dVar) {
            super(2, dVar);
            this.f302216d = pAGView;
            this.f302217e = fVar;
            this.f302218f = str;
            this.f302219g = str2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C102628b(this.f302216d, this.f302217e, this.f302218f, this.f302219g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C102628b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (this.f302216d.getVisibility() != 0) {
                this.f302216d.setVisibility(0);
            }
            String str = this.f302217e.f302220a;
            Log.m105924i(str, "[playPag-real] start tag = " + this.f302218f + " path:" + this.f302219g + ' ');
            this.f302216d.play();
            String str2 = this.f302217e.f302220a;
            Log.m105924i(str2, "[playPag-real] end tag = " + this.f302218f + " path:" + this.f302219g + ' ');
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102626e(C99088c cVar, C102629f fVar, PAGView pAGView, String str, String str2, C15601d<? super C102626e> dVar) {
        super(2, dVar);
        this.f302210n = cVar;
        this.f302211o = fVar;
        this.f302212p = pAGView;
        this.f302213q = str;
        this.f302214r = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C102626e(this.f302210n, this.f302211o, this.f302212p, this.f302213q, this.f302214r, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C102626e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d4, code lost:
        if (r5 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0184 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r1.f302209j
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = ", path:"
            r7 = 0
            if (r2 == 0) goto L_0x0071
            if (r2 == r5) goto L_0x0055
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r1.f302207h
            org.libpag.PAGView r0 = (org.libpag.PAGView) r0
            java.lang.Object r2 = r1.f302206g
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f302205f
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f302204e
            xe0.f r4 = (xe0.C102629f) r4
            java.lang.Object r5 = r1.f302203d
            k14.c r5 = (k14.C99088c) r5
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x002d }
            goto L_0x018a
        L_0x002d:
            r0 = move-exception
            goto L_0x0202
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0038:
            java.lang.Object r2 = r1.f302207h
            org.libpag.PAGView r2 = (org.libpag.PAGView) r2
            java.lang.Object r4 = r1.f302206g
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.f302205f
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r1.f302204e
            xe0.f r8 = (xe0.C102629f) r8
            java.lang.Object r9 = r1.f302203d
            k14.c r9 = (k14.C99088c) r9
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0051 }
            goto L_0x0157
        L_0x0051:
            r0 = move-exception
            r5 = r9
            goto L_0x0202
        L_0x0055:
            java.lang.Object r2 = r1.f302208i
            org.libpag.PAGView r2 = (org.libpag.PAGView) r2
            java.lang.Object r5 = r1.f302207h
            k14.c r5 = (k14.C99088c) r5
            java.lang.Object r8 = r1.f302206g
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.f302205f
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.f302204e
            xe0.f r10 = (xe0.C102629f) r10
            java.lang.Object r11 = r1.f302203d
            k14.c r11 = (k14.C99088c) r11
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x0096
        L_0x0071:
            kotlin.ResultKt.throwOnFailure(r19)
            k14.c r2 = r1.f302210n
            xe0.f r10 = r1.f302211o
            java.lang.String r9 = r1.f302213q
            java.lang.String r8 = r1.f302214r
            org.libpag.PAGView r11 = r1.f302212p
            r1.f302203d = r2
            r1.f302204e = r10
            r1.f302205f = r9
            r1.f302206g = r8
            r1.f302207h = r2
            r1.f302208i = r11
            r1.f302209j = r5
            java.lang.Object r5 = r2.mo85908b(r7, r1)
            if (r5 != r0) goto L_0x0093
            return r0
        L_0x0093:
            r5 = r2
            r2 = r11
            r11 = r5
        L_0x0096:
            java.lang.String r12 = r10.f302220a     // Catch:{ all -> 0x0200 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0200 }
            r13.<init>()     // Catch:{ all -> 0x0200 }
            java.lang.String r14 = "tag:"
            r13.append(r14)     // Catch:{ all -> 0x0200 }
            r13.append(r9)     // Catch:{ all -> 0x0200 }
            r13.append(r6)     // Catch:{ all -> 0x0200 }
            r13.append(r8)     // Catch:{ all -> 0x0200 }
            java.lang.String r14 = " lock:"
            r13.append(r14)     // Catch:{ all -> 0x0200 }
            r13.append(r5)     // Catch:{ all -> 0x0200 }
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x0200 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)     // Catch:{ all -> 0x0200 }
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, rx3.o<java.lang.String, java.lang.ref.WeakReference<org.libpag.PAGView>, java.lang.String>> r5 = r10.f302221b     // Catch:{ all -> 0x0200 }
            int r12 = r2.hashCode()     // Catch:{ all -> 0x0200 }
            java.lang.Integer r13 = new java.lang.Integer     // Catch:{ all -> 0x0200 }
            r13.<init>(r12)     // Catch:{ all -> 0x0200 }
            java.lang.Object r5 = r5.get(r13)     // Catch:{ all -> 0x0200 }
            rx3.o r5 = (rx3.C13605o) r5     // Catch:{ all -> 0x0200 }
            java.lang.String r12 = ""
            if (r5 == 0) goto L_0x00d6
            A r5 = r5.f38557d     // Catch:{ all -> 0x0200 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0200 }
            if (r5 != 0) goto L_0x00d7
        L_0x00d6:
            r5 = r12
        L_0x00d7:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, rx3.o<java.lang.String, java.lang.ref.WeakReference<org.libpag.PAGView>, java.lang.String>> r13 = r10.f302221b     // Catch:{ all -> 0x0200 }
            int r14 = r2.hashCode()     // Catch:{ all -> 0x0200 }
            java.lang.Integer r15 = new java.lang.Integer     // Catch:{ all -> 0x0200 }
            r15.<init>(r14)     // Catch:{ all -> 0x0200 }
            java.lang.Object r13 = r13.get(r15)     // Catch:{ all -> 0x0200 }
            rx3.o r13 = (rx3.C13605o) r13     // Catch:{ all -> 0x0200 }
            if (r13 == 0) goto L_0x00f2
            C r13 = r13.f38559f     // Catch:{ all -> 0x0200 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0200 }
            if (r13 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r12 = r13
        L_0x00f2:
            boolean r5 = gy3.C87412m.m108589b(r8, r5)     // Catch:{ all -> 0x0200 }
            if (r5 != 0) goto L_0x0135
            int r0 = r2.hashCode()     // Catch:{ all -> 0x0200 }
            r10.mo142285a(r8, r0, r9)     // Catch:{ all -> 0x0200 }
            java.lang.String r0 = r10.f302220a     // Catch:{ all -> 0x0200 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0200 }
            r3.<init>()     // Catch:{ all -> 0x0200 }
            java.lang.String r4 = "[playPag] tag:"
            r3.append(r4)     // Catch:{ all -> 0x0200 }
            r3.append(r9)     // Catch:{ all -> 0x0200 }
            r3.append(r6)     // Catch:{ all -> 0x0200 }
            r3.append(r8)     // Catch:{ all -> 0x0200 }
            java.lang.String r4 = " return, pagView:"
            r3.append(r4)     // Catch:{ all -> 0x0200 }
            int r2 = r2.hashCode()     // Catch:{ all -> 0x0200 }
            r3.append(r2)     // Catch:{ all -> 0x0200 }
            java.lang.String r2 = " path has change 2 "
            r3.append(r2)     // Catch:{ all -> 0x0200 }
            r3.append(r12)     // Catch:{ all -> 0x0200 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0200 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0200 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0200 }
            r11.mo85909c(r7)
            return r0
        L_0x0135:
            a14.h0 r5 = a14.C53872d1.f151117a     // Catch:{ all -> 0x0200 }
            a14.k2 r5 = f14.C58901s.f168555a     // Catch:{ all -> 0x0200 }
            xe0.e$a r12 = new xe0.e$a     // Catch:{ all -> 0x0200 }
            r12.<init>(r2, r7)     // Catch:{ all -> 0x0200 }
            r1.f302203d = r11     // Catch:{ all -> 0x0200 }
            r1.f302204e = r10     // Catch:{ all -> 0x0200 }
            r1.f302205f = r9     // Catch:{ all -> 0x0200 }
            r1.f302206g = r8     // Catch:{ all -> 0x0200 }
            r1.f302207h = r2     // Catch:{ all -> 0x0200 }
            r1.f302208i = r7     // Catch:{ all -> 0x0200 }
            r1.f302209j = r4     // Catch:{ all -> 0x0200 }
            java.lang.Object r4 = a14.C53895h.m60469g(r5, r12, r1)     // Catch:{ all -> 0x0200 }
            if (r4 != r0) goto L_0x0153
            return r0
        L_0x0153:
            r4 = r8
            r5 = r9
            r8 = r10
            r9 = r11
        L_0x0157:
            org.libpag.PAGFile r10 = org.libpag.PAGFile.Load((java.lang.String) r4)     // Catch:{ all -> 0x0051 }
            r2.setComposition(r10)     // Catch:{ all -> 0x0051 }
            r2.flush()     // Catch:{ all -> 0x0051 }
            a14.h0 r10 = a14.C53872d1.f151117a     // Catch:{ all -> 0x0051 }
            a14.k2 r10 = f14.C58901s.f168555a     // Catch:{ all -> 0x0051 }
            xe0.e$b r11 = new xe0.e$b     // Catch:{ all -> 0x0051 }
            r17 = 0
            r12 = r11
            r13 = r2
            r14 = r8
            r15 = r5
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0051 }
            r1.f302203d = r9     // Catch:{ all -> 0x0051 }
            r1.f302204e = r8     // Catch:{ all -> 0x0051 }
            r1.f302205f = r5     // Catch:{ all -> 0x0051 }
            r1.f302206g = r4     // Catch:{ all -> 0x0051 }
            r1.f302207h = r2     // Catch:{ all -> 0x0051 }
            r1.f302209j = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r3 = a14.C53895h.m60469g(r10, r11, r1)     // Catch:{ all -> 0x0051 }
            if (r3 != r0) goto L_0x0185
            return r0
        L_0x0185:
            r0 = r2
            r2 = r4
            r3 = r5
            r4 = r8
            r5 = r9
        L_0x018a:
            int r0 = r0.hashCode()     // Catch:{ all -> 0x002d }
            r4.mo142285a(r2, r0, r3)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = r4.f302220a     // Catch:{ all -> 0x002d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r4.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r8 = "after play, end tag = "
            r4.append(r8)     // Catch:{ all -> 0x002d }
            r4.append(r3)     // Catch:{ all -> 0x002d }
            r4.append(r6)     // Catch:{ all -> 0x002d }
            r4.append(r2)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "  currentThread:"
            r4.append(r2)     // Catch:{ all -> 0x002d }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002d }
            r4.append(r2)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x002d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x002d }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x002d }
            r5.mo85909c(r7)
            xe0.f r0 = r1.f302211o
            org.libpag.PAGView r2 = r1.f302212p
            java.util.LinkedHashMap<java.lang.Integer, k14.c> r3 = r0.f302222c
            int r4 = r2.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            k14.c r3 = (k14.C99088c) r3
            if (r3 == 0) goto L_0x01d7
            r3.mo85907a()
        L_0x01d7:
            java.lang.String r3 = r0.f302220a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "clear lock of:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            java.util.LinkedHashMap<java.lang.Integer, k14.c> r0 = r0.f302222c
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.remove(r2)
            k14.c r0 = (k14.C99088c) r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0200:
            r0 = move-exception
            r5 = r11
        L_0x0202:
            r5.mo85909c(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xe0.C102626e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
