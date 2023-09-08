package fm2;

import dm2.C58325i;
import fy3.C32224a;
import gy3.C87413o;
import pe3.C47465a;
import rx3.C13598b0;

/* renamed from: fm2.c */
public final class C59261c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f169441d;

    /* renamed from: e */
    public final /* synthetic */ String f169442e;

    /* renamed from: f */
    public final /* synthetic */ String f169443f;

    /* renamed from: g */
    public final /* synthetic */ C47465a f169444g;

    /* renamed from: h */
    public final /* synthetic */ long f169445h;

    /* renamed from: i */
    public final /* synthetic */ C58325i<C47465a> f169446i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59261c(int i, String str, C59253b bVar, String str2, C47465a aVar, long j, C58325i<C47465a> iVar) {
        super(0);
        this.f169441d = i;
        this.f169442e = str;
        this.f169443f = str2;
        this.f169444g = aVar;
        this.f169445h = j;
        this.f169446i = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
        if (r1 == null) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r14 = this;
            java.lang.Class<gm2.a> r0 = gm2.C59597a.class
            byte[] r1 = i40.C60247c.f171776h
            monitor-enter(r1)
            f40.e r2 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x00e9 }
            r2.mo121108c()     // Catch:{ all -> 0x00e9 }
            java.lang.Class<i40.c> r2 = i40.C60247c.class
            boolean r2 = r2.isAssignableFrom(r0)     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x00e1
            androidx.lifecycle.k0 r2 = new androidx.lifecycle.k0     // Catch:{ all -> 0x00e9 }
            f40.e r3 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x00e9 }
            f40.a r3 = r3.f251755f     // Catch:{ all -> 0x00e9 }
            i40.c$a$a r4 = new i40.c$a$a     // Catch:{ all -> 0x00e9 }
            r4.<init>()     // Catch:{ all -> 0x00e9 }
            r2.<init>((androidx.lifecycle.C0123n0) r3, (androidx.lifecycle.C54209k0.C54210b) r4)     // Catch:{ all -> 0x00e9 }
            androidx.lifecycle.i0 r0 = r2.mo75002a(r0)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r1)
            gm2.a r0 = (gm2.C59597a) r0
            java.lang.Class<gm2.d> r1 = gm2.C59598d.class
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r0 = r0.mo85233d3(r1)
            gm2.d r0 = (gm2.C59598d) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r14.f169441d
            r1.append(r2)
            r2 = 95
            r1.append(r2)
            java.lang.String r2 = r14.f169442e
            r1.append(r2)
            java.lang.String r7 = r1.toString()
            gm2.b r8 = r0.mo84614c3(r7)
            r9 = 0
            r10 = 1
            r11 = 0
            if (r8 == 0) goto L_0x0098
            java.lang.String r1 = r14.f169443f
            int r2 = r14.f169441d
            pe3.a r12 = r14.f169444g
            long r3 = r14.f169445h
            dm2.i<pe3.a> r13 = r14.f169446i
            r8.field_originId = r1
            r8.field_type = r2
            if (r12 == 0) goto L_0x0069
            byte[] r1 = r12.toByteArray()
            goto L_0x006a
        L_0x0069:
            r1 = r11
        L_0x006a:
            r8.field_data = r1
            long r1 = eb0.C31543z5.m39453c()
            r8.field_updateTime = r1
            long r1 = r1 + r3
            r8.field_expireTime = r1
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r0
            r2 = r8
            long r1 = com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.replace$default(r1, r2, r3, r4, r5, r6)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x008d
            if (r13 == 0) goto L_0x0095
            r13.mo32063a(r10, r10, r8, r12)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0096
        L_0x008d:
            if (r13 == 0) goto L_0x0095
            r13.mo32063a(r10, r9, r8, r12)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0096
        L_0x0095:
            r1 = r11
        L_0x0096:
            if (r1 != 0) goto L_0x00de
        L_0x0098:
            java.lang.String r1 = r14.f169442e
            long r2 = r14.f169445h
            int r4 = r14.f169441d
            pe3.a r8 = r14.f169444g
            dm2.i<pe3.a> r12 = r14.f169446i
            gm2.b r13 = new gm2.b
            r13.<init>()
            r13.field_id = r7
            r13.field_originId = r1
            long r5 = eb0.C31543z5.m39453c()
            r13.field_createTime = r5
            r13.field_updateTime = r5
            long r5 = r5 + r2
            r13.field_expireTime = r5
            r13.field_type = r4
            if (r8 == 0) goto L_0x00be
            byte[] r11 = r8.toByteArray()
        L_0x00be:
            r13.field_data = r11
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 14
            r7 = 0
            r1 = r0
            r2 = r13
            boolean r0 = com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.insert$default(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2
            if (r0 == 0) goto L_0x00d7
            if (r12 == 0) goto L_0x00de
            r12.mo32063a(r1, r10, r13, r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x00de
        L_0x00d7:
            if (r12 == 0) goto L_0x00de
            r12.mo32063a(r1, r9, r13, r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x00de:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x00e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00e9 }
            java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r2)     // Catch:{ all -> 0x00e9 }
            throw r0     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fm2.C59261c.invoke():java.lang.Object");
    }
}
