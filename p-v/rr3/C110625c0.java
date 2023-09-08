package rr3;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;

/* renamed from: rr3.c0 */
public abstract class C110625c0 {

    /* renamed from: a */
    public long f330967a;

    /* renamed from: b */
    public C110631h f330968b = new C110631h(0, MAlarmHandler.NEXT_FIRE_INTERVAL);

    /* renamed from: c */
    public long f330969c;

    public C110625c0(long j) {
        this.f330969c = j;
    }

    /* renamed from: a */
    public final long mo162188a() {
        return this.f330967a;
    }

    /* renamed from: b */
    public final void mo162189b(long j, long j2) {
        C110631h hVar = new C110631h(j, j2);
        this.f330968b = hVar;
        VLogEffectJNI.INSTANCE.setEffectTime$renderlib_release(this.f330969c, hVar);
    }

    /* renamed from: c */
    public abstract C110632i mo162185c();

    public final void finalize() {
        VLogEffectJNI.INSTANCE.destroyEffect(this);
    }
}
