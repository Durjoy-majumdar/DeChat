package hq1;

import android.os.CountDownTimer;
import cl1.C54991o;

/* renamed from: hq1.c */
public final class C60084c extends CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ C60085d f171447a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60084c(C60085d dVar, long j) {
        super(j, 1000);
        this.f171447a = dVar;
    }

    public void onFinish() {
        this.f171447a.mo84951c1();
    }

    public void onTick(long j) {
        ((C54991o) this.f171447a.mo87684A0().mo71262a(C54991o.class)).f154233N3++;
        this.f171447a.mo84951c1();
    }
}
