package cj1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58704c5;
import er1.C58730g5;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87413o;
import o40.C11348f;

/* renamed from: cj1.r3 */
public final class C54807r3 {

    /* renamed from: a */
    public static final C54807r3 f153641a = new C54807r3();

    /* renamed from: cj1.r3$a */
    public static final class C28585a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ boolean f78457d;

        /* renamed from: e */
        public final /* synthetic */ int f78458e;

        /* renamed from: f */
        public final /* synthetic */ int f78459f;

        /* renamed from: g */
        public final /* synthetic */ long f78460g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28585a(boolean z, int i, int i2, long j) {
            super(0);
            this.f78457d = z;
            this.f78458e = i;
            this.f78459f = i2;
            this.f78460g = j;
        }

        public Object invoke() {
            return "isAnchor:" + this.f78457d + " errCode:" + this.f78458e + " errType:" + this.f78459f + " liveId:" + this.f78460g;
        }
    }

    /* renamed from: a */
    public final void mo75769a(boolean z, int i, int i2, long j) {
        boolean z2 = z;
        Log.m105924i("FinderLiveMicWatcher", "onCloseMicFail isAnchor: " + z2 + " errCode: " + i + " errType: " + i2 + " liveId: " + j);
        if (z2) {
            C58704c5 c5Var = C58704c5.f168044a;
            C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 64);
        } else {
            C58730g5 g5Var = C58730g5.f168158a;
            C115669n.INSTANCE.mo175912v(C58730g5.f168165h, 73);
        }
        C11348f.C11349a.m11178b(C59319a.f169618b, "mic_closeMicFail", false, (C11348f.C11352b) null, false, false, new C28585a(z, i, i2, j), 28, (Object) null);
    }
}
