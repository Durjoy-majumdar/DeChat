package p1152s5;

import a14.C53916l;
import android.graphics.drawable.Drawable;
import gy3.C8480h;
import java.util.ArrayList;
import kotlin.Result;
import p1121i5.C108370a;
import p632o5.C109959i;
import p906j4.C108553b;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: s5.a */
public final class C110736a implements C110740c {

    /* renamed from: b */
    public final int f331195b;

    /* renamed from: c */
    public final boolean f331196c;

    @C91590f(mo125468c = "coil.transition.CrossfadeTransition", mo125469f = "CrossfadeTransition.kt", mo125470l = {98}, mo125471m = "transition")
    /* renamed from: s5.a$a */
    public static final class C110737a extends C66704d {

        /* renamed from: d */
        public Object f331197d;

        /* renamed from: e */
        public Object f331198e;

        /* renamed from: f */
        public Object f331199f;

        /* renamed from: g */
        public Object f331200g;

        /* renamed from: h */
        public /* synthetic */ Object f331201h;

        /* renamed from: i */
        public final /* synthetic */ C110736a f331202i;

        /* renamed from: j */
        public int f331203j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110737a(C110736a aVar, C15601d<? super C110737a> dVar) {
            super(dVar);
            this.f331202i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f331201h = obj;
            this.f331203j |= Integer.MIN_VALUE;
            return this.f331202i.mo162258a((C110741d) null, (C109959i) null, this);
        }
    }

    /* renamed from: s5.a$b */
    public static final class C110738b extends C108553b {

        /* renamed from: a */
        public final /* synthetic */ C108370a f331204a;

        /* renamed from: b */
        public final /* synthetic */ C53916l<C13598b0> f331205b;

        public C110738b(C108370a aVar, C53916l<? super C13598b0> lVar) {
            this.f331204a = aVar;
            this.f331205b = lVar;
        }

        /* renamed from: a */
        public void mo159436a(Drawable drawable) {
            C108370a aVar = this.f331204a;
            aVar.getClass();
            ((ArrayList) aVar.f324425h).remove(this);
            this.f331205b.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }

    public C110736a(int i, boolean z, int i2, C8480h hVar) {
        i = (i2 & 1) != 0 ? 100 : i;
        boolean z2 = false;
        z = (i2 & 2) != 0 ? false : z;
        this.f331195b = i;
        this.f331196c = z;
        if (!(i > 0 ? true : z2)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00eb A[Catch:{ all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ef A[Catch:{ all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo162258a(p1152s5.C110741d r12, p632o5.C109959i r13, wx3.C15601d<? super rx3.C13598b0> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p1152s5.C110736a.C110737a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            s5.a$a r0 = (p1152s5.C110736a.C110737a) r0
            int r1 = r0.f331203j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f331203j = r1
            goto L_0x0018
        L_0x0013:
            s5.a$a r0 = new s5.a$a
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f331201h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f331203j
            r3 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r12 = r0.f331200g
            gy3.f0 r12 = (gy3.C8479f0) r12
            java.lang.Object r13 = r0.f331199f
            o5.i r13 = (p632o5.C109959i) r13
            java.lang.Object r13 = r0.f331198e
            s5.d r13 = (p1152s5.C110741d) r13
            java.lang.Object r13 = r0.f331197d
            s5.a r13 = (p1152s5.C110736a) r13
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x0038 }
            goto L_0x00fd
        L_0x0038:
            r13 = move-exception
            goto L_0x0106
        L_0x003b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r14)
            boolean r14 = r13 instanceof p632o5.C109963m
            if (r14 == 0) goto L_0x005d
            r2 = r13
            o5.m r2 = (p632o5.C109963m) r2
            o5.i$a r4 = r2.f329061c
            h5.b r4 = r4.f329056c
            h5.b r5 = p972h5.C108136b.MEMORY_CACHE
            if (r4 != r5) goto L_0x005d
            android.graphics.drawable.Drawable r13 = r2.f329059a
            r12.mo792b(r13)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        L_0x005d:
            android.view.View r2 = r12.getView()
            boolean r2 = r2.isShown()
            if (r2 != 0) goto L_0x007f
            if (r14 == 0) goto L_0x0071
            o5.m r13 = (p632o5.C109963m) r13
            android.graphics.drawable.Drawable r13 = r13.f329059a
            r12.mo792b(r13)
            goto L_0x007c
        L_0x0071:
            boolean r14 = r13 instanceof p632o5.C109954f
            if (r14 == 0) goto L_0x007c
            android.graphics.drawable.Drawable r13 = r13.mo161275a()
            r12.mo794d(r13)
        L_0x007c:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        L_0x007f:
            gy3.f0 r14 = new gy3.f0
            r14.<init>()
            r0.f331197d = r11     // Catch:{ all -> 0x0104 }
            r0.f331198e = r12     // Catch:{ all -> 0x0104 }
            r0.f331199f = r13     // Catch:{ all -> 0x0104 }
            r0.f331200g = r14     // Catch:{ all -> 0x0104 }
            r0.f331203j = r3     // Catch:{ all -> 0x0104 }
            a14.m r2 = new a14.m     // Catch:{ all -> 0x0104 }
            wx3.d r0 = xx3.C66447b.m78392b(r0)     // Catch:{ all -> 0x0104 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0104 }
            r2.mo74609p()     // Catch:{ all -> 0x0104 }
            i5.a r0 = new i5.a     // Catch:{ all -> 0x0104 }
            android.graphics.drawable.Drawable r5 = r12.mo795e()     // Catch:{ all -> 0x0104 }
            android.graphics.drawable.Drawable r6 = r13.mo161275a()     // Catch:{ all -> 0x0104 }
            android.view.View r4 = r12.getView()     // Catch:{ all -> 0x0104 }
            boolean r7 = r4 instanceof android.widget.ImageView     // Catch:{ all -> 0x0104 }
            r8 = 0
            if (r7 == 0) goto L_0x00b0
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch:{ all -> 0x0104 }
            goto L_0x00b1
        L_0x00b0:
            r4 = r8
        L_0x00b1:
            if (r4 != 0) goto L_0x00b4
            goto L_0x00b8
        L_0x00b4:
            p5.e r8 = p864t5.C110905d.m151207c(r4)     // Catch:{ all -> 0x0104 }
        L_0x00b8:
            if (r8 != 0) goto L_0x00be
            p5.e r4 = p643p5.C110168e.FILL     // Catch:{ all -> 0x0104 }
            r7 = r4
            goto L_0x00bf
        L_0x00be:
            r7 = r8
        L_0x00bf:
            int r8 = r11.f331195b     // Catch:{ all -> 0x0104 }
            boolean r4 = r13 instanceof p632o5.C109963m     // Catch:{ all -> 0x0104 }
            if (r4 == 0) goto L_0x00d2
            r4 = r13
            o5.m r4 = (p632o5.C109963m) r4     // Catch:{ all -> 0x0104 }
            o5.i$a r4 = r4.f329061c     // Catch:{ all -> 0x0104 }
            boolean r4 = r4.f329057d     // Catch:{ all -> 0x0104 }
            if (r4 != 0) goto L_0x00cf
            goto L_0x00d2
        L_0x00cf:
            r3 = 0
            r9 = 0
            goto L_0x00d3
        L_0x00d2:
            r9 = 1
        L_0x00d3:
            boolean r10 = r11.f331196c     // Catch:{ all -> 0x0104 }
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0104 }
            r14.f27484d = r0     // Catch:{ all -> 0x0104 }
            s5.a$b r3 = new s5.a$b     // Catch:{ all -> 0x0104 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x0104 }
            java.util.List<j4.b> r4 = r0.f324425h     // Catch:{ all -> 0x0102 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0102 }
            r4.add(r3)     // Catch:{ all -> 0x0102 }
            boolean r3 = r13 instanceof p632o5.C109963m     // Catch:{ all -> 0x0104 }
            if (r3 == 0) goto L_0x00ef
            r12.mo792b(r0)     // Catch:{ all -> 0x0104 }
            goto L_0x00f6
        L_0x00ef:
            boolean r13 = r13 instanceof p632o5.C109954f     // Catch:{ all -> 0x0104 }
            if (r13 == 0) goto L_0x00f6
            r12.mo794d(r0)     // Catch:{ all -> 0x0104 }
        L_0x00f6:
            java.lang.Object r12 = r2.mo74608o()     // Catch:{ all -> 0x0104 }
            if (r12 != r1) goto L_0x00fd
            return r1
        L_0x00fd:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        L_0x0100:
            r13 = r12
            goto L_0x0105
        L_0x0102:
            r12 = move-exception
            goto L_0x0100
        L_0x0104:
            r13 = move-exception
        L_0x0105:
            r12 = r14
        L_0x0106:
            T r12 = r12.f27484d
            i5.a r12 = (p1121i5.C108370a) r12
            if (r12 != 0) goto L_0x010d
            goto L_0x0110
        L_0x010d:
            r12.stop()
        L_0x0110:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p1152s5.C110736a.mo162258a(s5.d, o5.i, wx3.d):java.lang.Object");
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C110736a) && this.f331195b == ((C110736a) obj).f331195b);
    }

    public int hashCode() {
        return this.f331195b;
    }

    public String toString() {
        return "CrossfadeTransition(durationMillis=" + this.f331195b + ')';
    }

    public C110736a() {
        this(0, false, 3, (C8480h) null);
    }
}
