package a14;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import f14.C58868a;
import sx3.C110821n;

/* renamed from: a14.j1 */
public abstract class C53906j1 extends C53896h0 {

    /* renamed from: h */
    public static final /* synthetic */ int f151156h = 0;

    /* renamed from: e */
    public long f151157e;

    /* renamed from: f */
    public boolean f151158f;

    /* renamed from: g */
    public C58868a<C53853a1<?>> f151159g;

    /* renamed from: i0 */
    public final void mo74569i0(boolean z) {
        long j = this.f151157e - (z ? 4294967296L : 1);
        this.f151157e = j;
        if (j <= 0 && this.f151158f) {
            shutdown();
        }
    }

    /* renamed from: j0 */
    public final void mo74570j0(C53853a1<?> a1Var) {
        C58868a<C53853a1<?>> aVar = this.f151159g;
        if (aVar == null) {
            aVar = new C58868a<>();
            this.f151159g = aVar;
        }
        Object[] objArr = aVar.f168505a;
        int i = aVar.f168507c;
        objArr[i] = a1Var;
        int length = (objArr.length - 1) & (i + 1);
        aVar.f168507c = length;
        int i2 = aVar.f168506b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            C110821n.m150966m(objArr, objArr2, 0, i2, 0, 10, (Object) null);
            Object[] objArr3 = aVar.f168505a;
            int length3 = objArr3.length;
            int i3 = aVar.f168506b;
            C110821n.m150966m(objArr3, objArr2, length3 - i3, 0, i3, 4, (Object) null);
            aVar.f168505a = objArr2;
            aVar.f168506b = 0;
            aVar.f168507c = length2;
        }
    }

    /* renamed from: k0 */
    public final void mo74571k0(boolean z) {
        this.f151157e += z ? 4294967296L : 1;
        if (!z) {
            this.f151158f = true;
        }
    }

    /* renamed from: l0 */
    public final boolean mo74572l0() {
        return this.f151157e >= 4294967296L;
    }

    /* renamed from: n0 */
    public long mo74573n0() {
        if (!mo74574o0()) {
            return MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: a14.a1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo74574o0() {
        /*
            r7 = this;
            f14.a<a14.a1<?>> r0 = r7.f151159g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r2 = r0.f168506b
            int r3 = r0.f168507c
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000f
            goto L_0x001f
        L_0x000f:
            java.lang.Object[] r3 = r0.f168505a
            r6 = r3[r2]
            r3[r2] = r4
            int r2 = r2 + r5
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.f168506b = r2
            if (r6 == 0) goto L_0x0028
            r4 = r6
        L_0x001f:
            a14.a1 r4 = (a14.C53853a1) r4
            if (r4 != 0) goto L_0x0024
            return r1
        L_0x0024:
            r4.run()
            return r5
        L_0x0028:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53906j1.mo74574o0():boolean");
    }

    public void shutdown() {
    }
}
